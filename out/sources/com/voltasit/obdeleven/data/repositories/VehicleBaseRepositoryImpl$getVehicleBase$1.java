package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: VehicleBaseRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.VehicleBaseRepositoryImpl", f = "VehicleBaseRepositoryImpl.kt", l = {26}, m = "getVehicleBase")
final class VehicleBaseRepositoryImpl$getVehicleBase$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleBaseRepositoryImpl$getVehicleBase$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.o(null, this);
    }
}
