package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: LongAdaptationCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W extends AbstractC2102q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30069p;

    public W(I8.b bVar, String str) {
        super(bVar, false);
        this.f30069p = str;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30069p;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        p146l8.v vVarV = controlUnit.V(Integer.parseInt(this.j[0]));
        return vVarV.f(true).continueWith(new U(this, 0, vVarV));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        p146l8.v vVarV = controlUnit.V(Integer.parseInt(this.j[0]));
        return vVarV.f(true).onSuccessTask(new V(this, 0, vVarV)).continueWith(new V8.y(1, vVarV));
    }
}
