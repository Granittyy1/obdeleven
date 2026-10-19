package com.voltasit.obdeleven.ui.activity;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import p255u9.E;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource<E> f33688a;

    public q(TaskCompletionSource<E> taskCompletionSource) {
        this.f33688a = taskCompletionSource;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        kotlin.jvm.internal.i.e(task, "task");
        boolean zIsFaulted = task.isFaulted();
        TaskCompletionSource<E> taskCompletionSource = this.f33688a;
        if (zIsFaulted) {
            taskCompletionSource.setError(task.getError());
            return null;
        }
        taskCompletionSource.setResult((E) task.getResult());
        return null;
    }
}
