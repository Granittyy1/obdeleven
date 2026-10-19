package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30048a;

    public /* synthetic */ J(int i10) {
        this.f30048a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30048a) {
            case 0:
                Integer num = (Integer) task.getResult();
                int iIntValue = num.intValue();
                if (iIntValue == -1) {
                    return -3;
                }
                if (iIntValue == 0) {
                    return 0;
                }
                if (iIntValue != 128) {
                    return -1;
                }
                return num;
            default:
                kotlin.jvm.internal.i.e(task, "task");
                return !task.isFaulted() ? task : com.obdeleven.service.core.b.a("01DF070000").onSuccessTask(new M(1));
        }
    }
}
