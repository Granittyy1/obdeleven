# Car session cheat-sheet — Tier-1 coding tweaks (2022 Audi A6 C8)

Run from this folder on the Lenovo. Python is not on PATH:

    PY="C:\Users\grani\AppData\Local\Programs\Python\Python312\python.exe"

Prereqs: dongle in the OBD port, **ignition ON**, laptop BLE in range, `bleak` installed.

## 0. Prove the link
    & $PY obdx_pc.py vin        # must print WAUZZZF27NN001874

## 1. Read the cluster coding (back it up)
    & $PY obdx_pc.py codingread 0x714
- Returns a hex string  -> good, note it down.
- Returns `7f2231`      -> cluster stores coding at a different DID; STOP and tell Claude.

## 2. Apply the bits (each prints backup -> change -> unlock -> write -> read-back)
    & $PY obdx_pc.py codingbit 0x714 20103 1.0 1    # needle/gauge sweep
    & $PY obdx_pc.py codingbit 0x714 20103 1.3 1    # lap timer
Then the doors (window auto-drop), once you have the door login code:
    & $PY obdx_pc.py codingbit 0x74a <doorcode> 3.1 0
    & $PY obdx_pc.py codingbit 0x74b <doorcode> 3.1 0

## Login codes
- BCM1 / 09 = **20113** (confirmed live).
- Cluster / 17 = **20103** (candidate, unverified).
- If unlock says `nrc=0x35` (badkey) -> **wrong code, STOP**. Do NOT retry: modules
  lock after a few bad keys (`nrc 36/37`), ~10 min lockout.

## Safety / revert
- `codingbit` never writes if the bit is already right, if the coding read fails,
  or if unlock fails. It prints a REVERT line with the exact backup string.
- To undo manually:  `& $PY obdx_pc.py codingwrite 0x714 20103 <backup-hex>`
- After each write, ignition-cycle and check the dash before doing the next one.

## What these are
| Feature | Module | byte.bit | set |
|---|---|---|---|
| Needle/gauge sweep | cluster 0x714 | 1.0 | 1 |
| Lap timer | cluster 0x714 | 1.3 | 1 |
| Window auto-drop | doors 0x74a + 0x74b | 3.1 | 0 |

Cluster bit positions are community-sourced (not official) — the `codingread`
backup in step 1 is your safety net. Reachable+codeable today: BCM1, BCM2,
cluster 17, doors 42/52. Module 46 (comfort) has not answered DIY addressing yet.
