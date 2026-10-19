package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: SupportedCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f30183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f30184l;

    public w0(I8.b bVar, String str) {
        super(bVar, true);
        this.j = str;
        this.f30183k = bVar.f3916b;
        this.f30184l = bVar.f3918d;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.j;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        return null;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return true;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.s0(this.f30183k).continueWith(new V8.n(1, this));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return Task.forResult(0);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
    }
}
