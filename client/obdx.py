#!/usr/bin/env python3
"""
obdx - independent OBDeleven NextGen dongle client (reverse-engineered).

Link codec (reversed from the app's DeviceBase / utils.bluetooth.n, and verified
against a real captured session that decodes cleanly to the vehicle VIN):
  * framing : 0x0F = start, 0x04 = end, 0x05 = escape before a literal 04/05/0F
  * scramble: first byte = random key (| 0x80); each later byte ^= key, then
              key = rotate_right_1(key).  The key rides inside the frame, so a
              receiver self-decodes. (applied when the command asks for it)
  * checksum: CRC-16-CCITT (poly 0x1021, init 0x0000) appended little-endian,
              computed over the (scrambled) body.
Dongle command layer wraps CAN/UDS, e.g.:  22 00 <canid LE> = set response id
(0x7E8),  22 01 <canid LE> = set request id (0x7DF),  21 .. = data frame.

Subcommands:
  obdx.py decode <ffe1.tsv>   offline: decode a captured FFE1 conversation
                              (tsv lines: "0x52\\t<hex>" = TX, "0x1b\\t<hex>" = RX)
  obdx.py live [--addr MAC]   connect to the dongle over BLE and open a console
                              (needs: pip install bleak; run near the car)

The codec is proven. The live command set (scan/coding) is built & validated at
the car. BLE service 0xFFE0 / characteristic 0xFFE1.
"""
import argparse
import random
import sys

FFE0 = "0000ffe0-0000-1000-8000-00805f9b34fb"
FFE1 = "0000ffe1-0000-1000-8000-00805f9b34fb"
MTU_CHUNK = 20


# ----------------------------- codec -----------------------------
def crc_ccitt(data: bytes) -> int:
    c = 0
    for byte in data:
        for i in range(8):
            z10 = ((byte >> (7 - i)) & 1) == 1
            z11 = ((c >> 15) & 1) == 1
            c = (c << 1) & 0xFFFF
            if z10 ^ z11:
                c ^= 0x1021
    return c & 0xFFFF


def _rotr(k: int) -> int:
    return ((k >> 1) | (k << 7)) & 0xFF


def scramble(payload: bytes) -> bytes:
    key = random.randint(0, 127) | 0x80
    out = bytearray([key])
    k = key
    for b in payload:
        out.append(b ^ k)
        k = _rotr(k)
    return bytes(out)


def descramble(body: bytes) -> bytes:
    if not body:
        return body
    k = body[0]
    out = bytearray()
    for b in body[1:]:
        out.append(b ^ k)
        k = _rotr(k)
    return bytes(out)


def _escape_frame(body: bytes) -> bytes:
    out = bytearray([0x0F])
    for b in body:
        if b in (0x04, 0x05, 0x0F):
            out.append(0x05)
        out.append(b)
    out.append(0x04)
    return bytes(out)


def build_frame(payload: bytes, do_scramble: bool = True) -> bytes:
    """payload -> wire bytes (scramble + CRC + 0F/04 framing). Chunk before BLE write."""
    body = scramble(payload) if do_scramble else bytes(payload)
    crc = crc_ccitt(body)
    body = body + bytes([crc & 0xFF, (crc >> 8) & 0xFF])
    return _escape_frame(body)


def chunks(data: bytes, n: int = MTU_CHUNK):
    for i in range(0, len(data), n):
        yield data[i:i + n]


class Deframer:
    """Feed raw FFE1 notification bytes; yields complete de-framed bodies (incl. CRC)."""
    def __init__(self):
        self.buf = bytearray()
        self.esc = False
        self.inx = False

    def feed(self, data: bytes):
        done = []
        for b in data:
            if self.esc:
                self.buf.append(b)
                self.esc = False
                continue
            if b == 0x05:
                self.esc = True
                continue
            if b == 0x0F:
                self.buf = bytearray()
                self.inx = True
                continue
            if b == 0x04:
                if self.inx and self.buf:
                    done.append(bytes(self.buf))
                self.buf = bytearray()
                self.inx = False
                continue
            if self.inx:
                self.buf.append(b)
        return done


def decode_body(body: bytes):
    """de-framed body (incl 2-byte CRC) -> (payload, crc_ok)."""
    if len(body) < 3:
        return b"", False
    data, crc = body[:-2], body[-2] | (body[-1] << 8)
    ok = crc_ccitt(data) == crc
    return descramble(data), ok


def _ascii(b: bytes) -> str:
    return "".join(chr(c) if 32 <= c < 127 else "." for c in b)


# --------------------------- offline decode ---------------------------
def cmd_decode(path: str):
    tx, rx = bytearray(), bytearray()
    for line in open(path):
        p = line.rstrip("\n").split("\t")
        if len(p) < 2 or not p[1]:
            continue
        (tx if p[0] == "0x52" else rx).extend(bytes.fromhex(p[1]))
    for name, stream in (("TX  phone -> dongle", tx), ("RX  dongle -> phone", rx)):
        df = Deframer()
        frames = df.feed(bytes(stream))
        print(f"\n===== {name} : {len(frames)} frames =====")
        for f in frames:
            payload, ok = decode_body(f)
            flag = "ok " if ok else "BAD"
            print(f"  crc{flag}  {payload.hex():<40}  |{_ascii(payload)}|")


# ------------------------------- live BLE -------------------------------
async def _live(addr):
    try:
        from bleak import BleakClient, BleakScanner
    except ImportError:
        sys.exit("live mode needs bleak:  pip install bleak")
    if not addr:
        print("scanning for 'OBDeleven' ...")
        dev = await BleakScanner.find_device_by_filter(
            lambda d, a: (d.name or "").lower().startswith("obdeleven"), timeout=15)
        if not dev:
            sys.exit("dongle not found (is it powered in the OBD port, in range?)")
        addr = dev.address
        print("found", dev.name, addr)
    df = Deframer()

    def on_notify(_h, data):
        for body in df.feed(bytes(data)):
            payload, ok = decode_body(body)
            print(f"RX< crc{'ok' if ok else 'BAD'} {payload.hex()}  |{_ascii(payload)}|")

    async with BleakClient(addr) as c:
        print("connected:", c.is_connected)
        await c.start_notify(FFE1, on_notify)
        print("console ready. type hex payload then Enter (e.g. 22 00 e8 07 00 00). 'raw' toggles scramble. Ctrl-C to quit.")
        import asyncio
        scramble_on = True
        loop = asyncio.get_event_loop()
        while True:
            line = (await loop.run_in_executor(None, sys.stdin.readline)).strip()
            if not line:
                continue
            if line == "raw":
                scramble_on = not scramble_on
                print("scramble:", scramble_on)
                continue
            try:
                payload = bytes.fromhex(line.replace(" ", ""))
            except ValueError:
                print("bad hex")
                continue
            wire = build_frame(payload, do_scramble=scramble_on)
            for ch in chunks(wire):
                await c.write_gatt_char(FFE1, ch, response=False)
            print("TX>", payload.hex())


def cmd_live(addr):
    import asyncio
    asyncio.run(_live(addr))


def main():
    ap = argparse.ArgumentParser(description="independent OBDeleven dongle client")
    sub = ap.add_subparsers(dest="cmd", required=True)
    d = sub.add_parser("decode", help="decode a captured FFE1 conversation (tsv)")
    d.add_argument("capture")
    lv = sub.add_parser("live", help="connect to the dongle over BLE")
    lv.add_argument("--addr", default=None, help="dongle BLE MAC (else auto-scan)")
    a = ap.parse_args()
    if a.cmd == "decode":
        cmd_decode(a.capture)
    elif a.cmd == "live":
        cmd_live(a.addr)


if __name__ == "__main__":
    main()
