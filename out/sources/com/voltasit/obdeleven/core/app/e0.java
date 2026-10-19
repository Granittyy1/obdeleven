package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: RoutineControlCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f30087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30088l;

    public e0(I8.b bVar, String str) {
        super(bVar, true);
        this.j = str;
        this.f30087k = bVar.f3916b.split("/");
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
    public final boolean d() {
        return false;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return true;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return Task.forResult(0);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        this.f30088l = i10;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        Task<String> taskD;
        String str = this.f30087k[this.f30088l];
        O.e.j(controlUnit.f0(), "requestRoutineControl(" + str + ")");
        if (controlUnit.f29327i == ApplicationProtocol.f29262b) {
            taskD = Task.forResult(null);
        } else {
            taskD = controlUnit.f29335r.d(B7.b.c("31", str));
        }
        return taskD.continueWith(new d0());
    }
}
