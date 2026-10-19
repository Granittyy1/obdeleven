package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: ZDCCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B0 extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String[] f30032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f30033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30034m;

    public B0(I8.b bVar, String str) {
        super(bVar, true);
        this.j = str;
        this.f30032k = bVar.f3916b.split("/");
        this.f30033l = bVar.f3918d.split("/");
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
        this.f30034m = i10;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        Calendar calendar = Calendar.getInstance();
        int i10 = 0;
        return controlUnit.t0("F199", String.format(Locale.US, "%ty%tm%td", calendar, calendar, calendar)).continueWithTask(new y0(i10, controlUnit)).continueWithTask(new z0(this, i10, controlUnit));
    }
}
