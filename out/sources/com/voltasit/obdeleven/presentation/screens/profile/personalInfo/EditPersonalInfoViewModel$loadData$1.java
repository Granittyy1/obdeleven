package com.voltasit.obdeleven.presentation.screens.profile.personalInfo;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: EditPersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.EditPersonalInfoViewModel", f = "EditPersonalInfoViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "loadData")
public final class EditPersonalInfoViewModel$loadData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EditPersonalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPersonalInfoViewModel$loadData$1(EditPersonalInfoViewModel editPersonalInfoViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = editPersonalInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
