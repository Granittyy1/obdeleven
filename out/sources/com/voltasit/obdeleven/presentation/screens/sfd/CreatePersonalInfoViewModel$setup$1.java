package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel", f = "CreatePersonalInfoViewModel.kt", l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "setup")
final class CreatePersonalInfoViewModel$setup$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreatePersonalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePersonalInfoViewModel$setup$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = createPersonalInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CreatePersonalInfoViewModel.b(this.this$0, this);
    }
}
