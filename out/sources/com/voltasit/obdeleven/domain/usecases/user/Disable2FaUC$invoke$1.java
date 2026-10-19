package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Disable2FaUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.Disable2FaUC", f = "Disable2FaUC.kt", l = {9}, m = "invoke")
final class Disable2FaUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2124e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Disable2FaUC$invoke$1(C2124e c2124e, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2124e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
