package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetUserDetailsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC", f = "GetUserDetailsUC.kt", l = {16}, m = "invoke")
public final class GetUserDetailsUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetUserDetailsUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserDetailsUC$invoke$1(GetUserDetailsUC getUserDetailsUC, kotlin.coroutines.c<? super GetUserDetailsUC$invoke$1> cVar) {
        super(cVar);
        this.this$0 = getUserDetailsUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
