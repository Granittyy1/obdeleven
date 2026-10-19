package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsEmailVerifiedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.IsEmailVerifiedUC", f = "IsEmailVerifiedUC.kt", l = {9}, m = "invoke")
final class IsEmailVerifiedUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsEmailVerifiedUC$invoke$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
