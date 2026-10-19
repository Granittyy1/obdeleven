package com.voltasit.obdeleven.presentation.controlunitlist.online;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: OnlineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListViewModel", f = "OnlineControlUnitListViewModel.kt", l = {155, 162, 165}, m = "writeGatewayCoding")
final class OnlineControlUnitListViewModel$writeGatewayCoding$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OnlineControlUnitListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitListViewModel$writeGatewayCoding$1(OnlineControlUnitListViewModel onlineControlUnitListViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = onlineControlUnitListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OnlineControlUnitListViewModel.h(this.this$0, null, null, this);
    }
}
