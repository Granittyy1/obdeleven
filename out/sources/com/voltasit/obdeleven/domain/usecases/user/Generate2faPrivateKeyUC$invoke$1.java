package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Generate2faPrivateKeyUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.Generate2faPrivateKeyUC", f = "Generate2faPrivateKeyUC.kt", l = {8}, m = "invoke")
final class Generate2faPrivateKeyUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2125f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Generate2faPrivateKeyUC$invoke$1(C2125f c2125f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2125f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
