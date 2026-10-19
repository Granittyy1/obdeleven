package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DeviceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.DeviceProviderImpl", f = "DeviceProviderImpl.kt", l = {23}, m = "readColor")
final class DeviceProviderImpl$readColor$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceProviderImpl$readColor$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
