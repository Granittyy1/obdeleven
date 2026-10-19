package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Disable2FaBackupCodeUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.Disable2FaBackupCodeUC", f = "Disable2FaBackupCodeUC.kt", l = {11}, m = "invoke")
final class Disable2FaBackupCodeUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2123d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Disable2FaBackupCodeUC$invoke$1(C2123d c2123d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2123d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
