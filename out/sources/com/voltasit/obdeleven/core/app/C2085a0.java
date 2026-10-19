package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p134k8.M0;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: RawCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2085a0 extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return j(controlUnit);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return j(controlUnit);
    }

    public final Task<Integer> j(ControlUnit controlUnit) {
        String strF0 = controlUnit.f0();
        StringBuilder sb2 = new StringBuilder("raw(");
        String str = this.j;
        sb2.append(str);
        sb2.append(")");
        O.e.j(strF0, sb2.toString());
        return controlUnit.f29335r.d(str).continueWith(new M0(str)).continueWith(new Z());
    }
}
