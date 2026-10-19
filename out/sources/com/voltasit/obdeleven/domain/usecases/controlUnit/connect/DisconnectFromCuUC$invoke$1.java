package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DisconnectFromCuUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.controlUnit.connect.DisconnectFromCuUC", f = "DisconnectFromCuUC.kt", l = {24}, m = "invoke-vckuEUM")
final class DisconnectFromCuUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectFromCuUC$invoke$1(A a10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
