package com.voltasit.obdeleven.domain.usecases.vehicle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetGatewaysForCodingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.GetGatewaysForCodingUC", f = "GetGatewaysForCodingUC.kt", l = {10}, m = "execute")
final class GetGatewaysForCodingUC$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGatewaysForCodingUC$execute$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(this);
    }
}
