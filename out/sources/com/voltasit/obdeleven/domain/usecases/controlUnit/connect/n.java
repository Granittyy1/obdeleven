package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30714a;

    public /* synthetic */ n(int i10) {
        this.f30714a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task12) throws CommandException {
        switch (this.f30714a) {
            case 0:
                kotlin.jvm.internal.i.e(task12, "task12");
                if (!task12.isFaulted()) {
                    return task12;
                }
                Exception error = task12.getError();
                kotlin.jvm.internal.i.c(error, "null cannot be cast to non-null type com.obdeleven.service.exception.CommandException");
                int iA = ((CommandException) error).a();
                O.e.j("ConnectToKlineObdUC", "Received error code 2: " + iA);
                return (iA == 128 || iA == 129 || iA == 133) ? com.obdeleven.service.core.b.a("0033") : task12;
            default:
                String str = (String) task12.getResult();
                if (str.contains("71")) {
                    return null;
                }
                if (str.startsWith("7F31")) {
                    throw new CommandException(Integer.parseInt(str.substring(4, 6), 16));
                }
                throw new CommandException(-1);
        }
    }
}
