package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: SecurityAccessCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.K(this.j, false).continueWith(new f0());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return controlUnit.K(this.j, false).continueWith(new f0());
    }
}
