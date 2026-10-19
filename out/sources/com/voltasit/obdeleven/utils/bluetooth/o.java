package com.voltasit.obdeleven.utils.bluetooth;

import J8.u;
import com.parse.boltsinternal.Task;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: compiled from: DeviceGen2Or3.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f34376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f34377m;

    public o(String str) {
        super(str);
        this.f34377m = KoinJavaComponent.b(u.class, null, null);
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final String c() {
        return this.f34376l;
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final Task<Float> g() {
        return new p047d8.h(300L, "15", true).a();
    }

    @Override // com.obdeleven.service.interfaces.IDevice
    public final Task<Void> h(String str) {
        return new p047d8.l("14" + com.obdeleven.service.util.b.c(str), true).a();
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.n
    public final void k(byte[] bArr, boolean z10) {
        if (bArr.length == 0) {
            return;
        }
        W7.c.f7065c.b((byte) 15);
        for (byte b10 : bArr) {
            if (b10 == 4 || b10 == 5 || b10 == 15) {
                W7.c.f7065c.b((byte) 5);
            }
            W7.c.f7065c.b(b10);
        }
        W7.c.f7065c.b((byte) 4);
        W7.c.f7065c.c();
    }

    @Override // com.voltasit.obdeleven.utils.bluetooth.n
    public final Task<Void> n(float f10) {
        int i10 = (int) f10;
        return new p047d8.m("16".concat(String.format("%02X%02X", Integer.valueOf(i10), Integer.valueOf((int) ((f10 - i10) * 100.0f)))), true).a();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, xa.g] */
    public final Task<Void> o(int i10, int i11, boolean z10) {
        return (z10 && ((u) this.f34377m.getValue()).a()) ? new p021b8.b(30000L, "02".concat(String.format("%02X%02X", Integer.valueOf(i10 & 255), Integer.valueOf(i11 & 255))), true).a() : new p021b8.a("02".concat(String.format("%02X%02X", Integer.valueOf(i10 & 255), Integer.valueOf(i11 & 255))), 30000).a();
    }

    public final Task<Void> p(boolean z10) {
        return (z10 ? new p047d8.d("1C", true).a() : new p047d8.g(300L, "10", true).a()).onSuccess(new p009a8.e(2, this)).onSuccessTask(new V8.j(5, this)).onSuccessTask(new V8.k(6, this)).onSuccessTask(new V8.l(7, this)).makeVoid();
    }
}
