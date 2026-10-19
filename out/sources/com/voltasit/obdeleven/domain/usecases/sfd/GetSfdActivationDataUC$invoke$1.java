package com.voltasit.obdeleven.domain.usecases.sfd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetSfdActivationDataUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.GetSfdActivationDataUC", f = "GetSfdActivationDataUC.kt", l = {26}, m = "invoke-vckuEUM")
final class GetSfdActivationDataUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSfdActivationDataUC$invoke$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
