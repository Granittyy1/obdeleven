package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30150a;

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30150a) {
            case 0:
                return ((Boolean) task.getResult()).booleanValue() ? 0 : -3;
            default:
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
        }
    }
}
