package com.voltasit.obdeleven.presentation.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ProfileViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.profile.ProfileViewModel", f = "ProfileViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor, R.styleable.AppCompatTheme_windowNoTitle}, m = "updateSubscriptionPurchaseButtons")
final class ProfileViewModel$updateSubscriptionPurchaseButtons$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProfileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$updateSubscriptionPurchaseButtons$1(ProfileViewModel profileViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ProfileViewModel.b(this.this$0, this);
    }
}
