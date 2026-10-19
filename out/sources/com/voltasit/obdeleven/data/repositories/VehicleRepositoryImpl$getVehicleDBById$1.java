package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: VehicleRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.VehicleRepositoryImpl", f = "VehicleRepositoryImpl.kt", l = {156, 166}, m = "getVehicleDBById")
final class VehicleRepositoryImpl$getVehicleDBById$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VehicleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleRepositoryImpl$getVehicleDBById$1(VehicleRepositoryImpl vehicleRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vehicleRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, this);
    }
}
