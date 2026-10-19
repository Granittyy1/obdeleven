package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SendRequestCommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.SendRequestCommandUC", f = "SendRequestCommandUC.kt", l = {22}, m = "invoke")
final class SendRequestCommandUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendRequestCommandUC$invoke$1(r rVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
