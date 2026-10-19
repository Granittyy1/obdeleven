package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TwoFactorVerifyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorVerifyViewModel", f = "TwoFactorVerifyViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_colorError}, m = "enable2Fa")
final class TwoFactorVerifyViewModel$enable2Fa$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorVerifyViewModel$enable2Fa$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.c(this.this$0, null, this);
    }
}
