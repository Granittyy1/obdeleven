package com.voltasit.obdeleven.ui.activity;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p220r9.P;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f33689a;

    public r(MainActivity mainActivity) {
        this.f33689a = mainActivity;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        kotlin.jvm.internal.i.e(task, "task");
        boolean zIsFaulted = task.isFaulted();
        MainActivity mainActivity = this.f33689a;
        if (zIsFaulted) {
            P.a(mainActivity, "Device reset failed");
            return null;
        }
        P.e(mainActivity, "Device reset succeed");
        return null;
    }
}
