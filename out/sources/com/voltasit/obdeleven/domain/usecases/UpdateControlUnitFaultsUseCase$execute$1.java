package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateControlUnitFaultsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.UpdateControlUnitFaultsUseCase", f = "UpdateControlUnitFaultsUseCase.kt", l = {23, R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "execute")
final class UpdateControlUnitFaultsUseCase$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateControlUnitFaultsUseCase$execute$1(A a10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(this);
    }
}
