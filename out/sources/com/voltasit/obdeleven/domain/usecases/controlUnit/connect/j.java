package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.A0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task setProtocolTask) {
        kotlin.jvm.internal.i.e(setProtocolTask, "setProtocolTask");
        return setProtocolTask.isFaulted() ? Task.delay(3000L).continueWithTask(new A0(1)) : setProtocolTask;
    }
}
