package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30043a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30043a) {
            case 0:
                int i10 = H.f30044k;
                return 0;
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
                return com.obdeleven.service.core.b.a("01E0070000");
            default:
                return com.obdeleven.service.core.b.a("01DF070000");
        }
    }
}
