package com.voltasit.obdeleven.domain.exceptions;

/* JADX INFO: compiled from: BluetoothException.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BluetoothException extends Throwable {
    private final boolean isNonExistentDeviceIndicator;

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class CharacteristicNotFoundException extends BluetoothException {
        public CharacteristicNotFoundException() {
            super("Unable to get OBDeleven characteristic", true);
        }
    }

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class ConnectionException extends BluetoothException {
        public ConnectionException() {
            super("Received connection error", false);
        }
    }

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class DisconnectException extends BluetoothException {
        public DisconnectException() {
            super("Disconnected from bluetooth", false);
        }
    }

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class GattConnectionException extends BluetoothException {
        public GattConnectionException() {
            super("Unable to connect to GATT server", false);
        }
    }

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class ReadFromSocketException extends BluetoothException {
        public ReadFromSocketException() {
            super("read failed, socket might closed or timeout, read ret: -1", true);
        }
    }

    /* JADX INFO: compiled from: BluetoothException.kt */
    public static final class StuckFirmwareException extends BluetoothException {
        public StuckFirmwareException() {
            super("Detected stuck bluetooth firmware update mode. Please reboot", false);
        }
    }

    public BluetoothException(String str, boolean z10) {
        super(str);
        this.isNonExistentDeviceIndicator = z10;
    }

    public final boolean a() {
        return this.isNonExistentDeviceIndicator;
    }
}
