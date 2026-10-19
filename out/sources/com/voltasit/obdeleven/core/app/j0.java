package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: SfdLockCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends T {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.sfd.f f30104k;

    public j0(I8.b bVar, com.voltasit.obdeleven.domain.usecases.sfd.f fVar) {
        super(bVar);
        this.f30104k = fVar;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        Task<Integer> taskCallInBackground = Task.callInBackground(new i0(this, controlUnit));
        kotlin.jvm.internal.i.d(taskCallInBackground, "callInBackground(...)");
        return taskCallInBackground;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        kotlin.jvm.internal.i.e(controlUnit, "controlUnit");
        Task<Integer> taskCallInBackground = Task.callInBackground(new i0(this, controlUnit));
        kotlin.jvm.internal.i.d(taskCallInBackground, "callInBackground(...)");
        return taskCallInBackground;
    }
}
