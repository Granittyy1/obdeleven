package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CreateDevicePinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.CreateDevicePinUC", f = "CreateDevicePinUC.kt", l = {17, 20}, m = "invoke")
final class CreateDevicePinUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2119d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDevicePinUC$invoke$1(C2119d c2119d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = c2119d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
