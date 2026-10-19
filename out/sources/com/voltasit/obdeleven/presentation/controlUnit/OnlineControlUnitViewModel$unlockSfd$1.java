package com.voltasit.obdeleven.presentation.controlUnit;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitViewModel", f = "OnlineControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "unlockSfd")
final class OnlineControlUnitViewModel$unlockSfd$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ F this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitViewModel$unlockSfd$1(F f10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return F.b(this.this$0, null, (short) 0, this);
    }
}
