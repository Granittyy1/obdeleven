package com.voltasit.obdeleven.presentation.vehicle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: VehicleViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel", f = "VehicleViewModel.kt", l = {151}, m = "updateVehicleModification")
final class VehicleViewModel$updateVehicleModification$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VehicleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleViewModel$updateVehicleModification$1(VehicleViewModel vehicleViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vehicleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return VehicleViewModel.b(this.this$0, null, this);
    }
}
