package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetSortedVehicleModelListUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.GetSortedVehicleModelListUseCase", f = "GetSortedVehicleModelListUseCase.kt", l = {13}, m = "execute")
public final class GetSortedVehicleModelListUseCase$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetSortedVehicleModelListUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSortedVehicleModelListUseCase$execute$1(GetSortedVehicleModelListUseCase getSortedVehicleModelListUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getSortedVehicleModelListUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(null, this);
    }
}
