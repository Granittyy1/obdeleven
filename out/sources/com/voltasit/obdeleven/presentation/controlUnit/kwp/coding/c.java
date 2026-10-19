package com.voltasit.obdeleven.presentation.controlUnit.kwp.coding;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        return ((Boolean) task.getResult()).booleanValue() ? 0 : -1;
    }
}
