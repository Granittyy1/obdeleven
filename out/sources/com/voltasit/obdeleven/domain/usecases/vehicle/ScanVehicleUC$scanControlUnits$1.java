package com.voltasit.obdeleven.domain.usecases.vehicle;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScanVehicleUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.ScanVehicleUC", f = "ScanVehicleUC.kt", l = {R.styleable.AppCompatTheme_panelMenuListTheme, R.styleable.AppCompatTheme_radioButtonStyle, R.styleable.AppCompatTheme_selectableItemBackground, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "scanControlUnits")
final class ScanVehicleUC$scanControlUnits$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanVehicleUC$scanControlUnits$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        r rVar = this.this$0;
        List<Integer> list = r.j;
        return rVar.c(null, null, false, false, this);
    }
}
