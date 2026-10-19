package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: VehicleClearFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase", f = "VehicleClearFaultsUseCase.kt", l = {R.styleable.AppCompatTheme_alertDialogCenterButtons, R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_buttonStyleSmall, R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_dialogTheme}, m = "execute")
final class VehicleClearFaultsUseCase$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VehicleClearFaultsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleClearFaultsUseCase$execute$1(VehicleClearFaultsUseCase vehicleClearFaultsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vehicleClearFaultsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j0(null, this);
    }
}
