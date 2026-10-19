package com.voltasit.obdeleven.presentation.startup;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: StartupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel", f = "StartupActivityViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "handleResponse")
final class StartupActivityViewModel$handleResponse$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartupActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupActivityViewModel$handleResponse$1(StartupActivityViewModel startupActivityViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = startupActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StartupActivityViewModel.b(this.this$0, null, null, null, this);
    }
}
