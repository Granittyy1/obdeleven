package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.ui.dialogs.DialogC2146g0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30713a;

    public /* synthetic */ m(int i10) {
        this.f30713a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) {
        switch (this.f30713a) {
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
                if (task1.isFaulted()) {
                    Exception error2 = task1.getError();
                    p279w9.b bVar = Application.f29634b;
                    P8.c.b(error2);
                }
                return (DialogC2146g0) task1.getResult();
        }
    }
}
