package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.UpdateFirmwareUC", f = "UpdateFirmwareUC.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle}, m = "updateFirstGen-0E7RQCE")
final class UpdateFirmwareUC$updateFirstGen$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFirmwareUC$updateFirstGen$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(null, null, this);
        return objB == CoroutineSingletons.f43038b ? objB : new Result(objB);
    }
}
