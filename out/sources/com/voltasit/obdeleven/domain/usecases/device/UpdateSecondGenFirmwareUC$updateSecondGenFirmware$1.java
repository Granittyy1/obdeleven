package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateSecondGenFirmwareUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.UpdateSecondGenFirmwareUC", f = "UpdateSecondGenFirmwareUC.kt", l = {R.styleable.AppCompatTheme_buttonBarButtonStyle, R.styleable.AppCompatTheme_buttonStyle, R.styleable.AppCompatTheme_colorAccent, R.styleable.AppCompatTheme_colorButtonNormal, R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_homeAsUpIndicator, R.styleable.AppCompatTheme_listDividerAlertDialog, R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "updateSecondGenFirmware-0E7RQCE")
final class UpdateSecondGenFirmwareUC$updateSecondGenFirmware$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSecondGenFirmwareUC$updateSecondGenFirmware$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objC = this.this$0.c(null, null, this);
        return objC == CoroutineSingletons.f43038b ? objC : new Result(objC);
    }
}
