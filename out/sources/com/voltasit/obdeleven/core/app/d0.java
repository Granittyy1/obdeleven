package com.voltasit.obdeleven.core.app;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        String str = (String) task.getResult();
        if (str.startsWith("71")) {
            return 0;
        }
        if (!str.startsWith("7F")) {
            return -3;
        }
        int i10 = Integer.parseInt(str.substring(4), 16);
        if (i10 > 128) {
            return Integer.valueOf(i10);
        }
        return -1;
    }
}
