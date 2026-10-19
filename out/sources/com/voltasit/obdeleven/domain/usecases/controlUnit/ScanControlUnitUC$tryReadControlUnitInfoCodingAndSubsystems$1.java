package com.voltasit.obdeleven.domain.usecases.controlUnit;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScanControlUnitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.ScanControlUnitUC", f = "ScanControlUnitUC.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_checkboxStyle, R.styleable.AppCompatTheme_colorAccent}, m = "tryReadControlUnitInfoCodingAndSubsystems")
final class ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScanControlUnitUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanControlUnitUC$tryReadControlUnitInfoCodingAndSubsystems$1(ScanControlUnitUC scanControlUnitUC, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = scanControlUnitUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScanControlUnitUC.c(this.this$0, null, this);
    }
}
