package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectObd2CommandUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectObd2CommandUC", f = "ConnectObd2CommandUC.kt", l = {13}, m = "invoke")
final class ConnectObd2CommandUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2115a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectObd2CommandUC$invoke$1(C2115a c2115a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2115a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
