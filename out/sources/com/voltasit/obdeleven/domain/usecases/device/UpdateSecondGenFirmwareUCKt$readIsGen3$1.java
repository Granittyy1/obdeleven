package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateSecondGenFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.UpdateSecondGenFirmwareUCKt", f = "UpdateSecondGenFirmwareUC.kt", l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "readIsGen3")
final class UpdateSecondGenFirmwareUCKt$readIsGen3$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public UpdateSecondGenFirmwareUCKt$readIsGen3$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return A.a(null, this);
    }
}
