package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ConnectToKlineCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.ConnectToKlineCuUC", f = "ConnectToKlineCuUC.kt", l = {19}, m = "invoke-_TFR7lA")
final class ConnectToKlineCuUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    short S$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectToKlineCuUC$invoke$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, null, this);
    }
}
