package com.voltasit.obdeleven.domain.usecases.device.requests;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: RequestUdsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.requests.RequestUdsUC", f = "RequestUdsUC.kt", l = {25, R.styleable.AppCompatTheme_actionOverflowMenuStyle, R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invoke-k_pLkZQ")
final class RequestUdsUC$invoke$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestUdsUC$invoke$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, null, 0, this);
    }
}
