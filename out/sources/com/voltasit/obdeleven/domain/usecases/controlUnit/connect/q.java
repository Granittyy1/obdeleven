package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30718a;

    public /* synthetic */ q(int i10) {
        this.f30718a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) {
        switch (this.f30718a) {
            case 0:
                kotlin.jvm.internal.i.e(task1, "task1");
                if (!task1.isFaulted()) {
                    return task1;
                }
                Exception error = task1.getError();
                kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
                int iA = ((CommandException) error).a();
                O.e.j("ConnectToKlineObdUC", "Received error code 1: " + iA);
                return (iA == 128 || iA == 129 || iA == 133) ? com.obdeleven.service.core.b.a("0033") : task1;
            default:
                Task<Boolean> task = ControlUnit.f29318A;
                return Boolean.TRUE;
        }
    }
}
