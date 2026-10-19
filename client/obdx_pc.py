#!/usr/bin/env python3
"""
obdx_pc - drive the OBDeleven dongle straight from the laptop over BLE (bleak).
Independent client; codec reversed from the app, proven live (reads VIN).

  python obdx_pc.py vin                      # read VIN (proof of life)
  python obdx_pc.py scan                     # full 26-module DTC scan
  python obdx_pc.py probe 0x710              # coding/SFD probe on one module
  python obdx_pc.py find29 46,6d,8b          # probe 29-bit extended modules
  python obdx_pc.py codingread 0x714         # read a module's long coding
  python obdx_pc.py codingbit 0x714 20103 1.0 1   # flip ONE bit, safely (read-backup->write->verify)
  python obdx_pc.py codingwrite 0x714 20103 <fullhex>  # write a whole coding string
  python obdx_pc.py console                  # interactive: type hex payloads

Tier-1 tweaks (2022 A6 C8, confirmed reachable, long-coding bit flips):
  needle/gauge sweep  : codingbit 0x714 20103 1.0 1   (cluster byte1 bit0 -> 1)
  lap timer           : codingbit 0x714 20103 1.3 1   (cluster byte1 bit3 -> 1)
  window auto-drop    : codingbit 0x74a <code> 3.1 0  and  0x74b <code> 3.1 0 (doors byte3 bit1 -> 0)
Login codes: BCM1/09 = 20113 (confirmed). Cluster/17 = 20103 (confirmed live 2026-10-19).
If unlock says nrc=0x35 (badkey) STOP - wrong code; do not retry (lockout nrc 36/37).
Coding writes auto-send the tester stamp the ECU requires (date 2E F199 + workshop 2E F198)
before 2E 0600; if a prelude step is refused the tool stops and writes no coding.

Needs the dongle powered (ignition on) and in BLE range.
"""
import argparse, asyncio, datetime, random, sys

FFE0 = "0000ffe0-0000-1000-8000-00805f9b34fb"
FFE1 = "0000ffe1-0000-1000-8000-00805f9b34fb"

# ---- module map (req -> resp = req + 0x6A except OBD 7E0/7E1) ----
MODULES = [0x7e0,0x7e1,0x70e,0x715,0x714,0x76a,0x710,0x74a,0x74b,0x773,0x747,0x73f,0x73e,0x72a,
           0x74f,0x712,0x723,0x731,0x71d,0x70f,0x753,0x713,0x769,0x767,0x757,0x70c]
def resp_of(req): return req+8 if req in (0x7e0,0x7e1) else req+0x6a

# ---- codec ----
def crc(d):
    c=0
    for b in d:
        for i in range(8):
            z10=((b>>(7-i))&1)==1; z11=((c>>15)&1)==1; c=(c<<1)&0xFFFF
            if z10^z11: c^=0x1021
    return c&0xFFFF
_rotr=lambda k:((k>>1)|(k<<7))&0xFF
def scramble(p):
    key=random.randint(0,127)|0x80; o=bytearray([key]); k=key
    for b in p: o.append(b^k); k=_rotr(k)
    return bytes(o)
def descramble(b):
    if not b: return b
    k=b[0]; o=bytearray()
    for x in b[1:]: o.append(x^k); k=_rotr(k)
    return bytes(o)
def build(payload, scr=True):
    body=scramble(payload) if scr else bytes(payload)
    c=crc(body); body=body+bytes([c&0xFF,(c>>8)&0xFF])
    out=bytearray([0x0F])
    for b in body:
        if b in (0x04,0x05,0x0F): out.append(0x05)
        out.append(b)
    out.append(0x04); return bytes(out)
class Deframer:
    def __init__(s): s.b=bytearray(); s.e=False; s.i=False
    def feed(s,data):
        out=[]
        for x in data:
            if s.e: s.b.append(x); s.e=False; continue
            if x==0x05: s.e=True; continue
            if x==0x0f: s.b=bytearray(); s.i=True; continue
            if x==0x04:
                if s.i and s.b: out.append(bytes(s.b))
                s.b=bytearray(); s.i=False; continue
            if s.i: s.b.append(x)
        return out
def decode(frame):
    if len(frame)<3: return b''
    d=frame[:-2]
    return descramble(d) if crc(d)==(frame[-2]|(frame[-1]<<8)) else b''
le=lambda i:bytes([i&0xff,(i>>8)&0xff,0,0]).hex()
le32=lambda i:bytes([i&0xff,(i>>8)&0xff,(i>>16)&0xff,(i>>24)&0xff]).hex()
# 29-bit extended (VW normal-fixed) addressing: req=0x97FC00<addr>, resp=0x97FE00<addr>
def parse_target(s):
    """'0x70e' -> 11-bit req; 'e46' -> 29-bit addr 0x46. Returns (reqid, respid, is_ext)."""
    s=str(s).strip().lower()
    if s.startswith('e'):
        a=int(s[1:],16); return (0x97FC0000|a, 0x97FE0000|a, True)
    r=int(s,16); return (r, resp_of(r), False)
def dtc_str(b1,b2,b3): return "PCBU"[(b1>>6)&3]+f"{b1&0x3f:02x}{b2:02x}{b3:02x}".upper()
_asc=lambda b:''.join(chr(c) if 32<=c<127 else '.' for c in b)

def parse_bytebit(s):
    """'1.0' -> (byte_index, bit). Raises ValueError on bad input."""
    bi_s, bit_s = str(s).split('.')
    bi, bit = int(bi_s), int(bit_s)
    if bi < 0: raise ValueError("byte index must be >= 0")
    if not (0 <= bit <= 7): raise ValueError("bit must be 0-7")
    return bi, bit

def apply_bit(cur, bi, bit, value):
    """Return a copy of coding bytes `cur` with byte `bi`, bit `bit` set to value (0/1)."""
    new = bytearray(cur)
    mask = 1 << bit
    if value: new[bi] |= mask
    else:     new[bi] &= (~mask) & 0xFF
    return bytes(new)

class Dongle:
    def __init__(s,client): s.c=client; s.df=Deframer(); s.rx=[]
    def _on(s,_char,data):
        for fr in s.df.feed(bytes(data)):
            p=decode(fr)
            if p: s.rx.append(p)
    async def start(s): await s.c.start_notify(FFE1,s._on)
    async def send(s,hexstr,wait=0.25,scr=True):
        s.rx=[]
        wire=build(bytes.fromhex(hexstr),scr)
        for i in range(0,len(wire),20):
            await s.c.write_gatt_char(FFE1,wire[i:i+20],response=False)
        await asyncio.sleep(wait); return list(s.rx)
    async def uds(s,uds_hex,wait=0.4):
        ub=bytes.fromhex(uds_hex); pkt=bytes([0x21,len(ub),0x00])+ub
        return await s.send(pkt.hex(),wait)
    def uds_resp(s,frames):
        for p in frames:
            if len(p)>=5 and p[0]==0x21 and p[1]==0x00: return p[4:]
        return b''

INIT=['08','11','13','12','08','10','08','1b','2001']
async def init(d):
    for c in INIT: await d.send(c,0.18)

async def connect():
    from bleak import BleakScanner, BleakClient
    print("scanning for OBDeleven dongle...")
    dev=None
    for dd in await BleakScanner.discover(timeout=12):
        if (dd.name or '').lower().startswith('obdeleven'): dev=dd; break
    if not dev: sys.exit("dongle not found (powered? in range?)")
    print("found",dev.name,dev.address)
    client=BleakClient(dev)
    await client.connect()
    return client

async def cmd_vin():
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d)
        await d.send('2002',0.1)                              # prep (required, else 21ff)
        await d.send('2200'+le(0x7e8)); await d.send('2201'+le(0x7e0))  # physical addr 7E0 (7DF returns no data)
        r=await d.uds('0902',0.8); allhex=''.join(p.hex() for p in r)
        i=allhex.find('490201')
        if i>=0:
            vin=bytes.fromhex(allhex[i+6:i+6+34]).decode('latin1')[:17]
            print("VIN =",vin)
        else: print("no VIN; frames:",[p.hex() for p in r])
    finally: await c.disconnect()

async def cmd_scan():
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d)
        total=0
        for req in MODULES:
            resp=resp_of(req)
            await d.send('2002',0.08); await d.send('2200'+le(resp),0.08); await d.send('2201'+le(req),0.08)
            await d.uds('1003',0.2)
            r=await d.uds('1902ae',0.5)
            u=d.uds_resp(r); dtcs=[]
            if len(u)>=3 and u[0]==0x59 and u[1]==0x02:
                body=u[3:]
                for i in range(0,len(body)-3,4): dtcs.append(dtc_str(body[i],body[i+1],body[i+2]))
            total+=len(dtcs)
            print(f"  0x{req:03x}: "+(", ".join(dtcs) if dtcs else "clean"))
        print(f"\n{total} fault code(s) across {len(MODULES)} modules")
    finally: await c.disconnect()

async def cmd_probe(reqhex):
    req,resp,ext=parse_target(reqhex)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d)
        await d.send('2002',0.1); await d.send('2200'+le32(resp),0.1); await d.send('2201'+le32(req),0.1)
        print(f"module {reqhex} (req 0x{req:x} resp 0x{resp:x})")
        for name,u in [('default session','1001'),('extended session','1003'),
                       ('security seed 27 03','2703'),('security seed 27 01','2701'),
                       ('auth 29 01 (SFD)','2901')]:
            r=await d.uds(u,0.6); resp_u=d.uds_resp(r)
            tag=''
            if resp_u[:1]==b'\x7f': tag=f"  NEGATIVE nrc={resp_u[2]:#04x}" if len(resp_u)>2 else "  NEGATIVE"
            elif resp_u: tag="  OK"
            print(f"  {name:22} -> {resp_u.hex() or '(no resp)'}{tag}  |{_asc(resp_u)}|")
        print("\nread: 67=seed given(codeable), 7f27 nrc 10/11/7f=denied, needs-29/auth or nrc 34=SFD-gated")
    finally: await c.disconnect()

async def cmd_console():
    c=await connect()
    try:
        d=Dongle(c); await d.start()
        print("console. hex payload + Enter. Ctrl-C to quit.")
        loop=asyncio.get_event_loop()
        while True:
            line=(await loop.run_in_executor(None,sys.stdin.readline)).strip()
            if not line: continue
            r=await d.send(line.replace(' ',''),0.4)
            for p in r: print("  RX",p.hex(),"|"+_asc(p)+"|")
    finally: await c.disconnect()

async def _open(d,tgt):
    """tgt = (reqid, respid, is_ext) from parse_target. Works for 11-bit and 29-bit."""
    req,resp,ext=tgt
    await d.send('2002',0.1); await d.send('2200'+le32(resp),0.1); await d.send('2201'+le32(req),0.1)
    await d.uds('1003',0.3)  # extended session

async def _seedkey(d,code):
    """Request seed (2703), compute key=seed+code, send key (2704). Returns (ok, detail)."""
    r=await d.uds('2703',0.6); u=d.uds_resp(r)
    h=u.hex()
    if not h.startswith('6703'): return (False, f"no seed: {h or '(none)'}")
    seed=int(h[4:12],16); key=(int(code)+seed)&0xFFFFFFFF
    rk=await d.uds('2704'+f'{key:08X}',0.6); uk=d.uds_resp(rk)
    hk=uk.hex()
    if hk.startswith('6704'): return (True, f"UNLOCKED (seed={h[4:12]} key={key:08X})")
    if hk.startswith('7f27'):
        nrc=uk[2] if len(uk)>2 else 0
        return (False, f"rejected nrc={nrc:#04x} (35=badkey 36=tooManyAttempts 37=lockout)")
    return (False, f"unexpected: {hk or '(none)'}")

# A UDS long-coding write is NOT a lone 2E 0600. The app (ControlUnit.writeSid22Long-
# CodingSync) first writes the tester "stamp": the date (DID F199) then the workshop /
# repair-shop code (DID F198). Skip them and the ECU answers 7F 2E 24 (requestSequence-
# Error). The app's F198 value is 077328F6 + an equipment suffix (I.b.j(), an obfuscated
# constant jadx could not emit); the ECU only records the stamp, so any well-formed 9-byte
# RSC is accepted. Change WORKSHOP_RSC if a cluster rejects the length.
WORKSHOP_RSC = "077328F60000000000"   # 9 bytes (4 from the app's constant + 5 pad)

async def _tester_stamp(d):
    """Write date (2E F199 YYMMDD) + workshop code (2E F198 RSC) the ECU requires before a
    long-coding write. Call AFTER unlock. Returns (ok, detail); ok=False => do NOT write coding."""
    now=datetime.datetime.now()
    datehex=f"{now.year%100:02d}{now.month:02d}{now.day:02d}"   # app uses %ty%tm%td
    r=await d.uds('2ef199'+datehex,0.6); u=d.uds_resp(r)
    if u[:2]!=b'\x6e\xf1': return (False, f"date (2E F199) refused: {u.hex() or '(none)'}")
    r=await d.uds('2ef198'+WORKSHOP_RSC,0.6); u=d.uds_resp(r)
    if u[:2]!=b'\x6e\xf1': return (False, f"workshop (2E F198) refused: {u.hex() or '(none)'}")
    return (True, f"date={datehex} rsc={WORKSHOP_RSC}")

async def cmd_unlock(target,code):
    tgt=parse_target(target)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d); await _open(d,tgt)
        ok,detail=await _seedkey(d,code)
        print(f"module {target} code {code}: {'OK  ' if ok else 'FAIL'} {detail}")
    finally: await c.disconnect()

async def cmd_trycodes(target,codes):
    """Try a shortlist of codes, one seed each, stop on lockout."""
    tgt=parse_target(target)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d); await _open(d,tgt)
        for code in codes:
            ok,detail=await _seedkey(d,code)
            print(f"  code {code:>6}: {'*** UNLOCKED ***' if ok else detail}")
            if ok: break
            if 'nrc=0x36' in detail or 'nrc=0x37' in detail:
                print("  -> module locked out; stopping. wait ~10 min before retrying."); break
            await asyncio.sleep(0.4)
    finally: await c.disconnect()

async def cmd_codingread(target):
    tgt=parse_target(target)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d); await _open(d,tgt)
        r=await d.uds('220600',0.6); u=d.uds_resp(r)
        if u[:1]==b'\x62': print(f"{target} long coding: {u[3:].hex()}")
        else: print(f"{target} coding read failed: {u.hex() or '(none)'}")
    finally: await c.disconnect()

async def cmd_codingwrite(target,code,newhex):
    """Backup-first coding write: read current, unlock, write 2E 0600, verify."""
    tgt=parse_target(target)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d); await _open(d,tgt)
        r=await d.uds('220600',0.6); cur=d.uds_resp(r)
        if cur[:1]!=b'\x62': print(f"abort: cannot read current coding: {cur.hex()}"); return
        print(f"BACKUP current coding: {cur[3:].hex()}")
        ok,detail=await _seedkey(d,code)
        print(f"unlock: {'OK' if ok else 'FAIL'} {detail}")
        if not ok: print("abort: not unlocked."); return
        sok,sdetail=await _tester_stamp(d)
        print(f"tester stamp: {'OK' if sok else 'FAIL'} {sdetail}")
        if not sok: print("abort: ECU rejected the required date/workshop pre-write; coding NOT written."); return
        w=await d.uds('2e0600'+newhex,0.8); uw=d.uds_resp(w)
        if uw[:2]==b'\x6e\x06': print(f"WRITE OK (6e0600). new coding: {newhex}")
        else: print(f"write response: {uw.hex() or '(none)'} (7F2E xx = refused)")
        rr=await d.uds('220600',0.6); nc=d.uds_resp(rr)
        print(f"VERIFY read-back: {nc[3:].hex() if nc[:1]==b'\x62' else nc.hex()}")
    finally: await c.disconnect()

async def cmd_codingbit(target,code,bytebit,value):
    """Flip ONE bit in long coding safely: read+backup -> set/clear bit -> unlock -> 2E 0600 -> verify.
    Never writes if the bit is already at the wanted value or if read/unlock fail."""
    try:
        bi,bit=parse_bytebit(bytebit)
    except ValueError as e:
        sys.exit(f"bad byte.bit '{bytebit}': {e}")
    value=int(value)
    if value not in (0,1): sys.exit("value must be 0 or 1")
    tgt=parse_target(target)
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d); await _open(d,tgt)
        r=await d.uds('220600',0.6); u=d.uds_resp(r)
        if u[:1]!=b'\x62':
            print(f"abort: cannot read coding at DID 0600: {u.hex() or '(none)'}  (7f2231 => module stores coding at another DID)"); return
        cur=bytes(u[3:])
        print(f"BACKUP current coding: {cur.hex()}")
        if bi>=len(cur):
            print(f"abort: byte {bi} out of range (coding is {len(cur)} bytes)"); return
        if ((cur[bi]>>bit)&1)==value:
            print(f"byte {bi} bit {bit} already = {value} (0x{cur[bi]:02x}); nothing to write."); return
        new=apply_bit(cur,bi,bit,value)
        print(f"change: byte {bi}  0x{cur[bi]:02x} -> 0x{new[bi]:02x}  (bit {bit} -> {value})")
        print(f"new coding: {new.hex()}")
        ok,detail=await _seedkey(d,code)
        print(f"unlock: {'OK' if ok else 'FAIL'} {detail}")
        if not ok: print("abort: not unlocked; nothing written."); return
        sok,sdetail=await _tester_stamp(d)
        print(f"tester stamp: {'OK' if sok else 'FAIL'} {sdetail}")
        if not sok: print("abort: ECU rejected the required date/workshop pre-write; coding NOT written."); return
        w=await d.uds('2e0600'+new.hex(),0.8); uw=d.uds_resp(w)
        if uw[:2]==b'\x6e\x06': print("WRITE OK (6e0600).")
        else: print(f"write refused: {uw.hex() or '(none)'} (7F2E xx)")
        rr=await d.uds('220600',0.6); nc=d.uds_resp(rr)
        back=nc[3:].hex() if nc[:1]==b'\x62' else nc.hex()
        print(f"VERIFY read-back: {back}")
        print(f"to REVERT: python obdx_pc.py codingwrite {target} {code} {cur.hex()}")
    finally: await c.disconnect()

async def cmd_find29(addrs):
    """Probe 29-bit extended-addressed modules (0x97FC00<addr>) reading F197 name."""
    c=await connect()
    try:
        d=Dongle(c); await d.start(); await init(d)
        print("probing 29-bit extended modules...")
        for a in addrs:
            req,resp=0x97FC0000|a,0x97FE0000|a
            await d.send('2002',0.08); await d.send('2200'+le32(resp),0.08); await d.send('2201'+le32(req),0.08)
            r=await d.uds('22f197',0.5); u=d.uds_resp(r)
            name=u[3:] if (len(u)>=3 and u[0]==0x62) else b''
            r2=await d.uds('22f187',0.4); u2=d.uds_resp(r2)
            part=u2[3:] if (len(u2)>=3 and u2[0]==0x62) else b''
            print(f"  e{a:02x}: {(_asc(name).strip() if name else '(no response)'):<22} {_asc(part).strip() if part else ''}")
    finally: await c.disconnect()

def main():
    ap=argparse.ArgumentParser()
    sub=ap.add_subparsers(dest='cmd',required=True)
    sub.add_parser('vin'); sub.add_parser('scan'); sub.add_parser('console')
    pp=sub.add_parser('probe'); pp.add_argument('module')
    up=sub.add_parser('unlock'); up.add_argument('module'); up.add_argument('code')
    tp=sub.add_parser('trycodes'); tp.add_argument('module'); tp.add_argument('codes',help='comma-separated')
    cr=sub.add_parser('codingread'); cr.add_argument('module')
    cw=sub.add_parser('codingwrite'); cw.add_argument('module'); cw.add_argument('code'); cw.add_argument('hex')
    cb=sub.add_parser('codingbit'); cb.add_argument('module'); cb.add_argument('code')
    cb.add_argument('bytebit',help='byte.bit, e.g. 1.0'); cb.add_argument('value',help='0 or 1')
    f29=sub.add_parser('find29'); f29.add_argument('addrs',help='comma-separated hex addrs, e.g. 46,6d,d6,d7,8b')
    a=ap.parse_args()
    if a.cmd=='vin': asyncio.run(cmd_vin())
    elif a.cmd=='scan': asyncio.run(cmd_scan())
    elif a.cmd=='console': asyncio.run(cmd_console())
    elif a.cmd=='probe': asyncio.run(cmd_probe(a.module))
    elif a.cmd=='unlock': asyncio.run(cmd_unlock(a.module,a.code))
    elif a.cmd=='trycodes': asyncio.run(cmd_trycodes(a.module,[x.strip() for x in a.codes.split(',') if x.strip()]))
    elif a.cmd=='codingread': asyncio.run(cmd_codingread(a.module))
    elif a.cmd=='codingwrite': asyncio.run(cmd_codingwrite(a.module,a.code,a.hex))
    elif a.cmd=='codingbit': asyncio.run(cmd_codingbit(a.module,a.code,a.bytebit,a.value))
    elif a.cmd=='find29': asyncio.run(cmd_find29([int(x.strip(),16) for x in a.addrs.split(',') if x.strip()]))

if __name__=='__main__': main()
