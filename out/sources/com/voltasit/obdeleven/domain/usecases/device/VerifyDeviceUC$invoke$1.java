package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: VerifyDeviceUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.VerifyDeviceUC", f = "VerifyDeviceUC.kt", l = {26}, m = "invoke")
final class VerifyDeviceUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyDeviceUC$invoke$1(D d10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
