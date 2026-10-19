package com.voltasit.obdeleven.presentation.oca;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel", f = "OcaViewModel.kt", l = {291}, m = "isPopTheHoodDialogRequired")
final class OcaViewModel$isPopTheHoodDialogRequired$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$isPopTheHoodDialogRequired$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.c(this.this$0, this);
    }
}
