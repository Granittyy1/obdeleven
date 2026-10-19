package com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: StopBasicSettingUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.basicsetting.StopBasicSettingUC", f = "StopBasicSettingUC.kt", l = {R.styleable.AppCompatTheme_popupMenuStyle}, m = "buildRootParam")
final class StopBasicSettingUC$buildRootParam$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasicSettingUC$buildRootParam$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, null, null, 0, this);
    }
}
