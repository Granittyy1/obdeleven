package com.voltasit.obdeleven.domain.usecases.odx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RemoveHiddenCompuscalesUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.odx.RemoveHiddenCompuscalesUC", f = "RemoveHiddenCompuscalesUC.kt", l = {19}, m = "invoke")
final class RemoveHiddenCompuscalesUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveHiddenCompuscalesUC$invoke$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
