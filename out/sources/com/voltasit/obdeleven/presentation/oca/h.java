package com.voltasit.obdeleven.presentation.oca;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: AppFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppFragment f32694a;

    public h(AppFragment appFragment) {
        this.f32694a = appFragment;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task1) {
        kotlin.jvm.internal.i.e(task1, "task1");
        Object result = task1.getResult();
        kotlin.jvm.internal.i.d(result, "getResult(...)");
        boolean zBooleanValue = ((Boolean) result).booleanValue();
        AppFragment appFragment = this.f32694a;
        if (zBooleanValue) {
            appFragment.P().h();
            return null;
        }
        appFragment.P().i(4);
        return null;
    }
}
