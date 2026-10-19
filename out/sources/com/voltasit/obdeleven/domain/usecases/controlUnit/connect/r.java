package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task12) {
        kotlin.jvm.internal.i.e(task12, "task12");
        if (!task12.isFaulted()) {
            return task12;
        }
        Exception error = task12.getError();
        kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
        int iA = ((CommandException) error).a();
        O.e.j("ConnectToKlineObdUC", "Received error code 2: " + iA);
        return (iA == 128 || iA == 129 || iA == 133) ? com.obdeleven.service.core.b.a("0033") : task12;
    }
}
