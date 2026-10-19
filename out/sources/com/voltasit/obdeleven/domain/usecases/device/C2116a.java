package com.voltasit.obdeleven.domain.usecases.device;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.device.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AddDeviceToStoredDevicesUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2116a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.o f30767a;

    public C2116a(K8.o oVar) {
        this.f30767a = oVar;
    }

    public final boolean a(Q8.b device) {
        kotlin.jvm.internal.i.e(device, "device");
        K8.o oVar = this.f30767a;
        ArrayList arrayListP0 = kotlin.collections.q.p0(Q8.b.a.a(oVar.J()));
        if (arrayListP0.contains(device)) {
            return false;
        }
        device.f5130e = arrayListP0.size() + 1;
        arrayListP0.add(device);
        oVar.m(Q8.b.a.b(arrayListP0));
        return true;
    }
}
