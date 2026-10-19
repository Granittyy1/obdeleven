package com.voltasit.obdeleven.utils.bluetooth;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        return Integer.valueOf(task.isFaulted() ? 1 : 0);
    }
}
