package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase", f = "VehicleClearFaultsUseCase.kt", l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_windowNoTitle, 135}, m = "clearControlUnits")
final class VehicleClearFaultsUseCase$clearControlUnits$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VehicleClearFaultsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleClearFaultsUseCase$clearControlUnits$1(VehicleClearFaultsUseCase vehicleClearFaultsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vehicleClearFaultsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(null, null, this);
    }
}
