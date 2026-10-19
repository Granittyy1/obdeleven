package com.voltasit.obdeleven.utils.bluetooth;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.os.ParcelUuid;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LeBluetoothDevice f34383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BluetoothLeScanner f34384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2693i f34385c;

    public r(LeBluetoothDevice leBluetoothDevice, BluetoothLeScanner bluetoothLeScanner, C2693i c2693i) {
        this.f34383a = leBluetoothDevice;
        this.f34384b = bluetoothLeScanner;
        this.f34385c = c2693i;
    }

    @Override // android.bluetooth.le.ScanCallback
    public final void onScanResult(int i10, ScanResult result) {
        kotlin.jvm.internal.i.e(result, "result");
        O.e.s("LeBluetoothDevice", "onScanResult(callbackType: " + i10 + ")");
        String address = result.getDevice().getAddress();
        o oVar = this.f34383a.f34316s;
        String str = null;
        if (oVar == null) {
            kotlin.jvm.internal.i.m("leDevice");
            throw null;
        }
        if (kotlin.jvm.internal.i.a(address, oVar.f34367b)) {
            this.f34384b.stopScan(this);
            this.f34385c.resumeWith(result.getDevice());
        }
        String address2 = result.getDevice().getAddress();
        String name = result.getDevice().getName();
        ParcelUuid[] uuids = result.getDevice().getUuids();
        if (uuids != null) {
            ArrayList arrayList = new ArrayList(uuids.length);
            for (ParcelUuid parcelUuid : uuids) {
                arrayList.add(parcelUuid.getUuid().toString());
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = O.a.f((String) next, ", ", (String) it.next());
            }
            str = (String) next;
        }
        StringBuilder sbC = B6.a.c("Device found: ", address2, ", ", name, " ");
        sbC.append(str);
        O.e.j("LeBluetoothDevice", sbC.toString());
    }
}
