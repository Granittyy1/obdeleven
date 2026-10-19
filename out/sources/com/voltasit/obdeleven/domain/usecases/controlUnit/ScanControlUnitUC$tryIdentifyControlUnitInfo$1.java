package com.voltasit.obdeleven.domain.usecases.controlUnit;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScanControlUnitUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.ScanControlUnitUC", f = "ScanControlUnitUC.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "tryIdentifyControlUnitInfo")
final class ScanControlUnitUC$tryIdentifyControlUnitInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScanControlUnitUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanControlUnitUC$tryIdentifyControlUnitInfo$1(ScanControlUnitUC scanControlUnitUC, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = scanControlUnitUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
