package com.voltasit.obdeleven.domain.usecases.vehicle;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ScanVehicleUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.ScanVehicleUC", f = "ScanVehicleUC.kt", l = {R.styleable.AppCompatTheme_windowActionBar}, m = "getScannableControlUnits")
final class ScanVehicleUC$getScannableControlUnits$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanVehicleUC$getScannableControlUnits$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        r rVar = this.this$0;
        List<Integer> list = r.j;
        return rVar.a(null, this);
    }
}
