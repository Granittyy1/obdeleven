package com.voltasit.obdeleven.presentation.garage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel", f = "GarageViewModel.kt", l = {309}, m = "showSortedVehicleBaseDialog")
final class GarageViewModel$showSortedVehicleBaseDialog$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GarageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarageViewModel$showSortedVehicleBaseDialog$1(GarageViewModel garageViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = garageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GarageViewModel.e(this.this$0, null, null, this);
    }
}
