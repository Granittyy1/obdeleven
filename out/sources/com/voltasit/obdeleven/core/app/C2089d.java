package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AdaptationCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2089d extends AbstractC2102q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30083p;

    public C2089d(I8.b bVar, String str) {
        super(bVar, true);
        this.f30083p = str;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30083p;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        p146l8.a aVarL = controlUnit.L(Integer.parseInt(this.j[0]));
        return aVarL.f(true).continueWithTask(new C2084a(this, 0, aVarL));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        if (this.f30181e && a() == null) {
            return Task.forResult(0);
        }
        p146l8.a aVarL = controlUnit.L(Integer.parseInt(this.j[0]));
        return aVarL.f(true).onSuccessTask(new C2086b(this, 0, aVarL)).continueWithTask(new V8.B(1, aVarL));
    }
}
