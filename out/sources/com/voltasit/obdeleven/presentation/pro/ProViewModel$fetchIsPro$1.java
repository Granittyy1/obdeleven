package com.voltasit.obdeleven.presentation.pro;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ProViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.pro.ProViewModel", f = "ProViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "fetchIsPro")
final class ProViewModel$fetchIsPro$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProViewModel$fetchIsPro$1(ProViewModel proViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = proViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ProViewModel.b(this.this$0, this);
    }
}
