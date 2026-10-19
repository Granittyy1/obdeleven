package com.voltasit.obdeleven.domain.usecases.odx;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetOdxListByPlatformUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.odx.GetOdxListByPlatformUC", f = "GetOdxListByPlatformUC.kt", l = {21}, m = "invoke")
final class GetOdxListByPlatformUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOdxListByPlatformUC$invoke$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
