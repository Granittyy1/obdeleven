package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IsDeviceUpdateNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.IsDeviceUpdateNeededUC", f = "IsDeviceUpdateNeededUC.kt", l = {44, R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_dialogPreferredPadding}, m = "isFwUpdateRequired")
final class IsDeviceUpdateNeededUC$isFwUpdateRequired$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsDeviceUpdateNeededUC$isFwUpdateRequired$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
