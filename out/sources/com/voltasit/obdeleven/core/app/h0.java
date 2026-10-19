package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ServiceChangeCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.A(Integer.parseInt(this.j, 16)).continueWith(new com.obdeleven.service.core.a(1));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return controlUnit.A(Integer.parseInt(this.j, 16)).continueWith(new com.obdeleven.service.core.a(1));
    }
}
