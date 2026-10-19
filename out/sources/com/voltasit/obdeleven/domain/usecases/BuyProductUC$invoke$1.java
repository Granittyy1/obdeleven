package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BuyProductUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.BuyProductUC", f = "BuyProductUC.kt", l = {25, 28}, m = "invoke")
final class BuyProductUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2113b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyProductUC$invoke$1(C2113b c2113b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2113b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
