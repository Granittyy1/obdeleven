package com.voltasit.obdeleven.domain.usecases.sfd;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UnlockSfdRequestUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.sfd.UnlockSfdRequestUC", f = "UnlockSfdRequestUC.kt", l = {24}, m = "invoke-_TFR7lA")
final class UnlockSfdRequestUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockSfdRequestUC$invoke$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this, (short) 0);
    }
}
