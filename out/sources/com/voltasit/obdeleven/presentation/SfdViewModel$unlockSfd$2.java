package com.voltasit.obdeleven.presentation;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SfdViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.SfdViewModel", f = "SfdViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "unlockSfd")
final class SfdViewModel$unlockSfd$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SfdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdViewModel$unlockSfd$2(SfdViewModel sfdViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sfdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this, (short) 0);
    }
}
