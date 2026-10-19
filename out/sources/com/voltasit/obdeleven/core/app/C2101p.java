package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BasicSettingsCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2101p extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f30135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f30136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30137m;

    public C2101p(I8.b bVar, String str) {
        super(bVar, true);
        this.j = str;
        this.f30135k = bVar.f3916b.split("/");
        this.f30136l = bVar.f3918d.split("/");
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
        return false;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return Task.forResult(0);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        this.f30137m = i10;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        m8.g gVarN = controlUnit.N(Integer.parseInt(this.f30135k[this.f30137m]));
        Task<TContinuationResult> taskContinueWithTask = gVarN.f44619d.continueWithTask(new m8.a(gVarN));
        taskContinueWithTask.onSuccess(new m8.b(gVarN));
        gVarN.f44619d = taskContinueWithTask.makeVoid();
        return taskContinueWithTask.continueWithTask(new C2099n(this, 0, gVarN));
    }
}
