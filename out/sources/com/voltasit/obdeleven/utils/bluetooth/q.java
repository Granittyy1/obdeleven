package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.core.view.C1293h;
import com.voltasit.obdeleven.domain.exceptions.BluetoothException;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C2673a0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LeBluetoothDevice f34380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2693i f34381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f34382c;

    public q(LeBluetoothDevice leBluetoothDevice, C2693i c2693i, long j) {
        this.f34380a = leBluetoothDevice;
        this.f34381b = c2693i;
        this.f34382c = j;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        LeBluetoothDevice leBluetoothDevice = this.f34380a;
        O.e.j("LeBluetoothDevice", "onCharacteristicChanged()");
        if (bluetoothGattCharacteristic == null) {
            O.e.D("LeBluetoothDevice", "Characteristic is null");
            return;
        }
        if (kotlin.jvm.internal.i.a(bluetoothGattCharacteristic.getUuid(), O.h.o("0000ffe4-0000-1000-8000-00805f9b34fb"))) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            kotlin.jvm.internal.i.d(value, "getValue(...)");
            O.e.j("LeBluetoothDevice", "BT_READ(" + E8.a.g(value) + ")");
            C2680e.c(C2673a0.f43223b, null, null, new LeBluetoothDevice$onCharacteristicChanged$1(leBluetoothDevice, bluetoothGattCharacteristic, null), 3);
            return;
        }
        if (!kotlin.jvm.internal.i.a(bluetoothGattCharacteristic.getUuid(), O.h.o("0000ffe1-0000-1000-8000-00805f9b34fb"))) {
            O.e.D("LeBluetoothDevice", "Unknown characteristic: " + bluetoothGattCharacteristic.getUuid());
            return;
        }
        byte[] value2 = bluetoothGattCharacteristic.getValue();
        if (value2 == null || value2.length == 0) {
            return;
        }
        byte[] value3 = bluetoothGattCharacteristic.getValue();
        kotlin.jvm.internal.i.d(value3, "getValue(...)");
        O.e.j("LeBluetoothDevice", "BT_READ(" + E8.a.g(value3) + ")");
        o oVar = leBluetoothDevice.f34316s;
        if (oVar != null) {
            oVar.j(value2.length, value2);
        } else {
            kotlin.jvm.internal.i.m("leDevice");
            throw null;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        O.e.j("LeBluetoothDevice", "onCharacteristicWrite(BluetoothGatt status: " + i10 + ", characteristic: " + (bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getUuid() : null) + ")");
        LeBluetoothDevice leBluetoothDevice = this.f34380a;
        C2693i c2693i = leBluetoothDevice.f34322y;
        if (c2693i == null) {
            kotlin.jvm.internal.i.m("writeContinuation");
            throw null;
        }
        if (c2693i.c()) {
            C2693i c2693i2 = leBluetoothDevice.f34322y;
            if (c2693i2 != null) {
                c2693i2.resumeWith(Boolean.TRUE);
            } else {
                kotlin.jvm.internal.i.m("writeContinuation");
                throw null;
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) throws Throwable {
        LeBluetoothDevice leBluetoothDevice = this.f34380a;
        C2693i c2693i = this.f34381b;
        long j = this.f34382c;
        O.e.j("LeBluetoothDevice", C1293h.h("onConnectionStateChange(status: ", ", state: ", ")", i10, i11));
        if (i11 != 0) {
            if (i11 == 1) {
                O.e.j("LeBluetoothDevice", "STATE_CONNECTING");
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                O.e.j("LeBluetoothDevice", "STATE_DISCONNECTING");
                return;
            }
            O.e.j("LeBluetoothDevice", "STATE_CONNECTED");
            if (bluetoothGatt == null) {
                c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.GattConnectionException()));
                return;
            }
            O.e.s("LeBluetoothDevice", "onBluetoothConnected()");
            leBluetoothDevice.f34305A = bluetoothGatt;
            C2680e.c(C2673a0.f43223b, null, null, new LeBluetoothDevice$onBluetoothConnected$1(leBluetoothDevice, bluetoothGatt, null), 3);
            return;
        }
        if (leBluetoothDevice.f34316s == null) {
            kotlin.jvm.internal.i.m("leDevice");
            throw null;
        }
        O.e.j("LeBluetoothDevice", "onBluetoothDisconnected(status: " + i10 + ", isDeviceConnected: " + (W7.c.f7066d != null) + ")");
        if (i10 != 133 || System.currentTimeMillis() - j >= 3000) {
            if (leBluetoothDevice.f34316s == null) {
                kotlin.jvm.internal.i.m("leDevice");
                throw null;
            }
            if (W7.c.f7066d != null || (i10 != 8 && i10 != 34)) {
                leBluetoothDevice.f(null, false);
                if (c2693i.c()) {
                    c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.DisconnectException()));
                    return;
                }
                return;
            }
        }
        leBluetoothDevice.g(leBluetoothDevice.f34305A);
        C2680e.d(EmptyCoroutineContext.f43032b, new LeBluetoothDevice$onBluetoothDisconnected$1(2, null));
        c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.ConnectionException()));
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
        LeBluetoothDevice leBluetoothDevice = this.f34380a;
        O.e.s("LeBluetoothDevice", "onServiceDiscovered(status: " + i10 + ")");
        if (i10 != 0) {
            O.e.j("LeBluetoothDevice", "Bad BluetoothGatt status: " + i10);
            return;
        }
        O.e.j("LeBluetoothDevice", "Services discovery successful");
        C2693i c2693i = this.f34381b;
        if (bluetoothGatt == null) {
            leBluetoothDevice.g(bluetoothGatt);
            c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.GattConnectionException()));
            return;
        }
        O.e.s("LeBluetoothDevice", "onServicesSuccessfullyDiscovered()");
        bluetoothGatt.requestConnectionPriority(1);
        List<BluetoothGattService> services = bluetoothGatt.getServices();
        kotlin.jvm.internal.i.d(services, "getServices(...)");
        Iterator<T> it = services.iterator();
        while (it.hasNext()) {
            O.e.j("LeBluetoothDevice", "Found service: " + ((BluetoothGattService) it.next()).getUuid());
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = LeBluetoothDevice.m(bluetoothGatt, "0000ffe0-0000-1000-8000-00805f9b34fb", "0000ffe1-0000-1000-8000-00805f9b34fb");
        if (bluetoothGattCharacteristicM != null) {
            C2680e.c(C2673a0.f43223b, null, null, new LeBluetoothDevice$onServicesSuccessfullyDiscovered$2(leBluetoothDevice, bluetoothGatt, bluetoothGattCharacteristicM, c2693i, null), 3);
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristicM2 = LeBluetoothDevice.m(bluetoothGatt, "0000ffe3-0000-1000-8000-00805f9b34fb", "0000ffe4-0000-1000-8000-00805f9b34fb");
        if (leBluetoothDevice.f34319v && bluetoothGattCharacteristicM2 != null) {
            O.e.j("LeBluetoothDevice", "Successfully booted into update mode");
            leBluetoothDevice.f34319v = false;
            O.e.j("LeBluetoothDevice", "Resuming connectGatt()");
            c2693i.resumeWith(new C8.a.b(bluetoothGatt));
            return;
        }
        if (bluetoothGattCharacteristicM2 != null) {
            leBluetoothDevice.g(bluetoothGatt);
            c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.StuckFirmwareException()));
        } else {
            leBluetoothDevice.g(bluetoothGatt);
            c2693i.resumeWith(new C8.a.C0024a(new BluetoothException.CharacteristicNotFoundException()));
        }
    }
}
