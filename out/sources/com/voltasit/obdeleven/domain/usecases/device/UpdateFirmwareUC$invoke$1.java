package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.UpdateFirmwareUC", f = "UpdateFirmwareUC.kt", l = {19, 23, 28, R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invoke-gIAlu-s")
final class UpdateFirmwareUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFirmwareUC$invoke$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = this.this$0.a(null, this);
        return objA == CoroutineSingletons.f43038b ? objA : new Result(objA);
    }
}
