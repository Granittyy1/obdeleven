package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CanUserConsumeDeviceSubscriptionUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.CanUserConsumeDeviceSubscriptionUC", f = "CanUserConsumeDeviceSubscriptionUC.kt", l = {19}, m = "invoke")
final class CanUserConsumeDeviceSubscriptionUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2120a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanUserConsumeDeviceSubscriptionUC$invoke$1(C2120a c2120a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2120a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
