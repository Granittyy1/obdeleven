package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ReportErrorUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.ReportErrorUC", f = "ReportErrorUC.kt", l = {15, 16}, m = "invoke")
final class ReportErrorUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportErrorUC$invoke$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
