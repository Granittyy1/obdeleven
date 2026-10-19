package com.voltasit.obdeleven.utils.bluetooth;

import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends n {
    public static Task o(int i10) {
        return new Z7.d("03".concat(String.format("%02X%02X%02X00%02X", Integer.valueOf(i10 & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf((i10 >> 16) & 255), 4)), false).a();
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String c() {
        return "";
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final Task<Float> g() {
        return new com.obdeleven.service.core.gen1.h("16", true).a();
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final Task<Void> h(String str) {
        return new com.obdeleven.service.core.gen1.k("15" + com.obdeleven.service.util.b.c(str), true).a();
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.n
    public final Task<Void> n(float f10) {
        int i10 = (int) f10;
        return new com.obdeleven.service.core.gen1.n("17".concat(String.format("%02X%02X", Integer.valueOf(i10), Integer.valueOf((int) ((f10 - i10) * 100.0f)))), true).a();
    }

    public final Task<Integer> p() {
        O.e.j("Device", "setupDevice()");
        if (this.f34366a == IDevice.State.f29314c) {
            return Task.forResult(0);
        }
        p009a8.g gVar = new p009a8.g("210F080881043E", false);
        gVar.f8074h = "";
        return gVar.a().continueWithTask(new com.parse.b(3, this)).continueWithTask(new V8.p(2, this));
    }
}
