package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
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
