package com.voltasit.obdeleven.presentation.deviceupdate;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel", f = "DeviceUpdateViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass}, m = "handleFwUpdateComplete")
final class DeviceUpdateViewModel$handleFwUpdateComplete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateViewModel$handleFwUpdateComplete$1(DeviceUpdateViewModel deviceUpdateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, this);
    }
}
