package com.voltasit.obdeleven.domain.usecases.sfd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UnlockSfdCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdCommandUC", f = "UnlockSfdCommandUC.kt", l = {R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "getSfdActivationData-vckuEUM")
final class UnlockSfdCommandUC$getSfdActivationData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockSfdCommandUC$getSfdActivationData$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
