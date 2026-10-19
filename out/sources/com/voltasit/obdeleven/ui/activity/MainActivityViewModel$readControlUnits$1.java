package com.voltasit.obdeleven.ui.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel", f = "MainActivityViewModel.kt", l = {650}, m = "readControlUnits")
final class MainActivityViewModel$readControlUnits$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$readControlUnits$1(MainActivityViewModel mainActivityViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i(this);
    }
}
