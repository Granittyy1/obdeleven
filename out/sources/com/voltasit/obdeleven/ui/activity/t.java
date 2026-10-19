package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements DeviceSelectionSheet.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f33693a;

    public t(MainActivity mainActivity) {
        this.f33693a = mainActivity;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet.a
    public final void a(Q8.b bVar) {
        if (bVar != null) {
            MainActivityViewModel mainActivityViewModelB = this.f33693a.B();
            mainActivityViewModelB.getClass();
            BluetoothConnectionHelper bluetoothConnectionHelper = mainActivityViewModelB.f33628a0;
            if (bluetoothConnectionHelper != null) {
                bluetoothConnectionHelper.b(bVar);
            } else {
                kotlin.jvm.internal.i.m("bluetoothConnectionHelper");
                throw null;
            }
        }
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.deviceSelectionSheet.DeviceSelectionSheet.a
    public final void onCancel() {
        MainActivityViewModel mainActivityViewModelB = this.f33693a.B();
        mainActivityViewModelB.f33652t.e("MainActivityViewModel", "cancelBluetooth()");
        mainActivityViewModelB.f33663z.i();
        W7.c.g(0);
    }
}
