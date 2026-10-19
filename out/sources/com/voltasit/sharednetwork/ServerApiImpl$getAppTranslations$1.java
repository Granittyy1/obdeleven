package com.voltasit.sharednetwork;

import Aa.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ServerApiImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.sharednetwork.ServerApiImpl", f = "ServerApiImpl.kt", l = {568}, m = "getAppTranslations")
final class ServerApiImpl$getAppTranslations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerApiImpl$getAppTranslations$1(ServerApiImpl serverApiImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = serverApiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B(null, null, this);
    }
}
