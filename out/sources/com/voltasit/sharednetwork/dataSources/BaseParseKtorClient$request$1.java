package com.voltasit.sharednetwork.dataSources;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: BaseParseKtorClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.sharednetwork.dataSources.BaseParseKtorClient", f = "BaseParseKtorClient.kt", l = {365, 317, 331, 340}, m = "request$suspendImpl")
final class BaseParseKtorClient$request$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseParseKtorClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseParseKtorClient$request$1(BaseParseKtorClient baseParseKtorClient, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = baseParseKtorClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseParseKtorClient.p(this.this$0, null, null, this);
    }
}
