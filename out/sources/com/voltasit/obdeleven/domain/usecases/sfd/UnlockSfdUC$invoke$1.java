package com.voltasit.obdeleven.domain.usecases.sfd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UnlockSfdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdUC", f = "UnlockSfdUC.kt", l = {23, 29}, m = "invoke-HNNcUxY")
final class UnlockSfdUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockSfdUC$invoke$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, (short) 0, null, this);
    }
}
