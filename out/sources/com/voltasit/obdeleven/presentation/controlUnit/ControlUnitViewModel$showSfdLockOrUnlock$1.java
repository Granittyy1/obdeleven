package com.voltasit.obdeleven.presentation.controlUnit;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.ControlUnitViewModel", f = "ControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth}, m = "showSfdLockOrUnlock")
final class ControlUnitViewModel$showSfdLockOrUnlock$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ControlUnitViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitViewModel$showSfdLockOrUnlock$1(ControlUnitViewModel controlUnitViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = controlUnitViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ControlUnitViewModel.c(this.this$0, (short) 0, this);
    }
}
