package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30717a;

    public /* synthetic */ p(int i10) {
        this.f30717a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws CommandException {
        switch (this.f30717a) {
            case 0:
                return com.obdeleven.service.core.b.a("0033").continueWithTask(new q(0)).continueWithTask(new r());
            default:
                throw new CommandException(-1);
        }
    }
}
