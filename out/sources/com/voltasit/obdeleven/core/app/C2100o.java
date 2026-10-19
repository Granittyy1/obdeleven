package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2100o implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30131a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30131a) {
            case 0:
                if (!task.isFaulted()) {
                    return 0;
                }
                CommandException commandException = (CommandException) task.getError();
                int iA = commandException.a();
                if (iA == -3 || iA == -1) {
                    return -3;
                }
                if (commandException.a() > 128) {
                    return Integer.valueOf(commandException.a());
                }
                return -1;
            case 1:
                if (((Integer) task.getResult()).intValue() == 0) {
                    return 0;
                }
                if (((Integer) task.getResult()).intValue() == -1) {
                    return -3;
                }
                if (((Integer) task.getResult()).intValue() > 128) {
                    return (Integer) task.getResult();
                }
                return -1;
            case 2:
                return 0;
            default:
                if (!task.isFaulted()) {
                    return task;
                }
                int iA2 = ((CommandException) task.getError()).a();
                return (iA2 == 128 || iA2 == 129 || iA2 == 133) ? com.obdeleven.service.core.b.a("0033") : task;
        }
    }
}
