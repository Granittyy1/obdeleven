package com.voltasit.obdeleven.domain.usecases.oca;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsOcaSfdWizardNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.oca.IsOcaSfdWizardNeededUC", f = "IsOcaSfdWizardNeededUC.kt", l = {23}, m = "invoke")
final class IsOcaSfdWizardNeededUC$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsOcaSfdWizardNeededUC$invoke$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
