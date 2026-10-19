package com.voltasit.obdeleven.domain.usecases.vehicle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScanVehicleUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.ScanVehicleUC", f = "ScanVehicleUC.kt", l = {R.styleable.AppCompatTheme_checkboxStyle, R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorPrimary, R.styleable.AppCompatTheme_controlBackground}, m = "invoke")
final class ScanVehicleUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanVehicleUC$invoke$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, false, this);
    }
}
