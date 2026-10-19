package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30061a;

    public /* synthetic */ Q(int i10) {
        this.f30061a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30061a) {
            case 0:
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
            default:
                return com.obdeleven.service.core.b.a("0033").continueWithTask(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.m(0)).continueWithTask(new com.voltasit.obdeleven.domain.usecases.controlUnit.connect.n(0));
        }
    }
}
