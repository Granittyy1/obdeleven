package com.voltasit.obdeleven.presentation.deviceupdate;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel", f = "DeviceUpdateViewModel.kt", l = {100, R.styleable.AppCompatTheme_textAppearanceListItem}, m = "runFirmwareUpdate")
final class DeviceUpdateViewModel$runFirmwareUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateViewModel$runFirmwareUpdate$1(DeviceUpdateViewModel deviceUpdateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deviceUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceUpdateViewModel.b(this.this$0, null, this);
    }
}
