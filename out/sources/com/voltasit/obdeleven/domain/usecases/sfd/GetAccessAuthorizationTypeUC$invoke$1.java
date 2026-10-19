package com.voltasit.obdeleven.domain.usecases.sfd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: GetAccessAuthorizationTypeUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.GetAccessAuthorizationTypeUC", f = "GetAccessAuthorizationTypeUC.kt", l = {26, R.styleable.AppCompatTheme_actionOverflowMenuStyle, R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invoke-_TFR7lA")
final class GetAccessAuthorizationTypeUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccessAuthorizationTypeUC$invoke$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, null, this);
    }
}
