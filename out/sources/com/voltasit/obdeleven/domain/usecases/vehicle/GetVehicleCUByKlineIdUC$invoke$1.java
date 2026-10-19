package com.voltasit.obdeleven.domain.usecases.vehicle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GetVehicleCUByKlineIdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.GetVehicleCUByKlineIdUC", f = "GetVehicleCUByKlineIdUC.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle}, m = "invoke")
final class GetVehicleCUByKlineIdUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVehicleCUByKlineIdUC$invoke$1(g gVar, ContinuationImpl continuationImpl) {
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
