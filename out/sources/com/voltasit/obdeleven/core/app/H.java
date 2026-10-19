package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: DelayCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends T {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f30044k = 0;

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return Task.delay(Integer.parseInt(this.j)).continueWith(new G(0));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return Task.delay(Integer.parseInt(this.j)).continueWith(new G(0));
    }
}
