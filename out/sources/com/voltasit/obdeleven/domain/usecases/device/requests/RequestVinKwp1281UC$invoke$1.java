package com.voltasit.obdeleven.domain.usecases.device.requests;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RequestVinKwp1281UC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.requests.RequestVinKwp1281UC", f = "RequestVinKwp1281UC.kt", l = {21}, m = "invoke-vckuEUM")
final class RequestVinKwp1281UC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestVinKwp1281UC$invoke$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a((short) 0, this);
    }
}
