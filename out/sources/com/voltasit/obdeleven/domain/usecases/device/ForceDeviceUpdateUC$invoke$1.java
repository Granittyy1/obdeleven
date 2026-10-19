package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ForceDeviceUpdateUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.ForceDeviceUpdateUC", f = "ForceDeviceUpdateUC.kt", l = {24, R.styleable.AppCompatTheme_actionModeWebSearchDrawable, R.styleable.AppCompatTheme_alertDialogCenterButtons}, m = "invoke")
final class ForceDeviceUpdateUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ForceDeviceUpdateUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForceDeviceUpdateUC$invoke$1(ForceDeviceUpdateUC forceDeviceUpdateUC, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = forceDeviceUpdateUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
