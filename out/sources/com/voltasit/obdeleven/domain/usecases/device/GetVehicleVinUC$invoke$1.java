package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GetVehicleVinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.GetVehicleVinUC", f = "GetVehicleVinUC.kt", l = {R.styleable.AppCompatTheme_autoCompleteTextViewStyle, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlActivated, R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_dividerVertical, R.styleable.AppCompatTheme_dropDownListViewStyle, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invoke")
final class GetVehicleVinUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetVehicleVinUC$invoke$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
