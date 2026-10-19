package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GetVehicleVinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.GetVehicleVinUC", f = "GetVehicleVinUC.kt", l = {R.styleable.AppCompatTheme_panelBackground, R.styleable.AppCompatTheme_ratingBarStyleSmall, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, m = "getVinUsingOBDII-vckuEUM")
final class GetVehicleVinUC$getVinUsingOBDII$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVehicleVinUC$getVinUsingOBDII$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
