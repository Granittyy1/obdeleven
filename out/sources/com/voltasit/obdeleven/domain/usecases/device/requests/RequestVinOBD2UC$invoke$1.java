package com.voltasit.obdeleven.domain.usecases.device.requests;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RequestVinOBD2UC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.requests.RequestVinOBD2UC", f = "RequestVinOBD2UC.kt", l = {23}, m = "invoke-vckuEUM")
final class RequestVinOBD2UC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestVinOBD2UC$invoke$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
