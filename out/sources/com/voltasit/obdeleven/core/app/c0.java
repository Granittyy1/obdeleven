package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p134k8.Q0;

/* JADX INFO: compiled from: ResetCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        int i10 = Integer.parseInt(this.j, 16);
        O.e.j(controlUnit.f0(), "reset()");
        return controlUnit.D(false).continueWithTask(new Q0(i10, controlUnit)).continueWith(new C2087b0(0));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        int i10 = Integer.parseInt(this.j, 16);
        O.e.j(controlUnit.f0(), "reset()");
        return controlUnit.D(false).continueWithTask(new Q0(i10, controlUnit)).continueWith(new C2087b0(0));
    }
}
