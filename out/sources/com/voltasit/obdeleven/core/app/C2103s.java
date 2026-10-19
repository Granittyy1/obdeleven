package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClearDtcCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2103s extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.k().continueWith(new r(0));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return controlUnit.k().continueWith(new r(0));
    }
}
