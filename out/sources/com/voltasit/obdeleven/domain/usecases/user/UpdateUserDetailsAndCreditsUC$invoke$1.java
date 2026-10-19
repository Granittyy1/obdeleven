package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UpdateUserDetailsAndCreditsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.UpdateUserDetailsAndCreditsUC", f = "UpdateUserDetailsAndCreditsUC.kt", l = {26}, m = "invoke")
final class UpdateUserDetailsAndCreditsUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserDetailsAndCreditsUC$invoke$1(C c10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
