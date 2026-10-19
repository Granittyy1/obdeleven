# Car session cheat-sheet — Audi A6 C8 coding (updated 2026-10-19)

Run from this folder on the Lenovo. Python is not on PATH:

    $PY="C:\Users\grani\AppData\Local\Programs\Python\Python312\python.exe"

Prereqs: dongle in the OBD port, **ignition ON**, laptop BLE in range, `bleak` installed.

## Status from last session (2026-10-19)
- Cluster/17 (`0x714`) login code **20103 = CONFIRMED** (unlock works).
- Needle/gauge sweep is **already ON** (enabled earlier via OBDeleven) — skip it.
- Coding writes now **auto-send the tester stamp** the ECU requires (date `2E F199`
  + workshop `2E F198`) before `2E 0600`. Last session failed only because that stamp
  was missing (`7f2e24`); that's now built in.

## The one target: lap timer
    & $PY obdx_pc.py vin                          # proof of life -> WAUZZZF27NN001874
    & $PY obdx_pc.py codingread 0x714             # optional: note the backup string
    & $PY obdx_pc.py codingbit 0x714 20103 1.3 1  # lap timer (cluster byte1 bit3 -> 1)

Expected good run:
    BACKUP current coding: 818538c2ec9000080ba3e160b080681008002000
    change: byte 1  0x85 -> 0x8d  (bit 3 -> 1)
    unlock: OK ...
    tester stamp: OK date=YYMMDD rsc=077328F60000000000
    WRITE OK (6e0600).
    VERIFY read-back: 818d38c2...        <- byte1 now 8d
Then ignition-cycle and look for the lap timer in the virtual-cockpit menu.

## If something stops it (safe failure — nothing gets coded)
- `unlock: FAIL ... nrc=0x35` -> wrong code (shouldn't happen, 20103 confirmed). STOP, don't retry.
- `tester stamp: FAIL ... 2E F198 refused: 7f2e13` -> workshop-code length wrong. STOP and
  tell Claude; it's the one tunable constant (`WORKSHOP_RSC` in obdx_pc.py).
- `write refused: 7f2e24` -> would mean the stamp didn't take; send Claude the full output.

## Revert (if the feature isn't wanted)
    & $PY obdx_pc.py codingwrite 0x714 20103 818538c2ec9000080ba3e160b080681008002000

## Bonus if you have time: window auto-drop (doors)
Front doors are `0x74a` / `0x74b`; the change is byte3 bit1 -> 0. BUT we don't have the
door login code yet, so **don't write**. You CAN safely read them to prep:
    & $PY obdx_pc.py codingread 0x74a
    & $PY obdx_pc.py codingread 0x74b
Send Claude those strings + we'll source the door code before any write.

## Notes
- Reachable + codeable today: BCM1, BCM2, cluster 17, doors 42/52. Module 46 (comfort)
  hasn't answered DIY addressing yet, so its features (beeps/flash/RS-anim) are on hold.
- Every write backs up first and aborts if any step is refused — it can't half-code the car.
