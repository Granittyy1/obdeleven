package com.voltasit.obdeleven.data.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ControlUnitRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.ControlUnitRepositoryImpl", f = "ControlUnitRepositoryImpl.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle}, m = "getControlUnitsFromDatabase")
final class ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryImpl$getControlUnitsFromDatabase$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(null, null, this);
    }
}
