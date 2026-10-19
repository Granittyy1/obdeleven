package com.voltasit.obdeleven.domain.usecases.vehicle;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ShouldShowVagRedirectDialogAfterLoginUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.ShouldShowVagRedirectDialogAfterLoginUC", f = "ShouldShowVagRedirectDialogAfterLoginUC.kt", l = {17}, m = "invoke")
final class ShouldShowVagRedirectDialogAfterLoginUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShouldShowVagRedirectDialogAfterLoginUC$invoke$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
