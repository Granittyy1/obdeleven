package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToCuWithProtocolUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToCuWithProtocolUC", f = "ConnectToCuWithProtocolUC.kt", l = {151}, m = "connectToTp16CuUC")
final class ConnectToCuWithProtocolUC$connectToTp16CuUC$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToCuWithProtocolUC$connectToTp16CuUC$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, this);
    }
}
