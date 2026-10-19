package com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GetOfflineUdsAdaptationUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.adaptation.GetOfflineUdsAdaptationUC", f = "GetOfflineUdsAdaptationUC.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle}, m = "invoke")
final class GetOfflineUdsAdaptationUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOfflineUdsAdaptationUC$invoke$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, null, null, null, this);
    }
}
