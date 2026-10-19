package com.voltasit.obdeleven.domain.usecases.device.requests;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RequestVinUdsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.requests.RequestVinUdsUC", f = "RequestVinUdsUC.kt", l = {20}, m = "invoke-vckuEUM")
final class RequestVinUdsUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestVinUdsUC$invoke$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
