package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PurchaseProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PurchaseProviderImpl", f = "PurchaseProviderImpl.kt", l = {412}, m = "tryConsumeAllPurchases")
final class PurchaseProviderImpl$tryConsumeAllPurchases$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProviderImpl$tryConsumeAllPurchases$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u.l(this.this$0, null, this);
    }
}
