package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        Integer num = (Integer) task.getResult();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == -1) {
            return -3;
        }
        if (iIntValue > 128) {
            return num;
        }
        return -1;
    }
}
