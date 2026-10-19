package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: SimpleEepromCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends AbstractC2102q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30130p;

    public n0(I8.b bVar, String str) {
        super(bVar, false);
        this.f30130p = str;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30130p;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        String[] strArr = this.j;
        return controlUnit.o0(33, Integer.parseInt(strArr[0], 16), Integer.parseInt(strArr[1], 16)).continueWith(new p022b9.b(1, this));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        Calendar calendar = Calendar.getInstance();
        return controlUnit.t0("F199", String.format(Locale.US, "%ty%tm%td", calendar, calendar, calendar)).continueWithTask(new m0(0, controlUnit)).continueWithTask(new C2099n(this, 1, controlUnit));
    }
}
