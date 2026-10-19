package com.voltasit.obdeleven.domain.usecases.device;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetDeviceFirmwareInfoUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.device.GetDeviceFirmwareInfoUC", f = "GetDeviceFirmwareInfoUC.kt", l = {19}, m = "invoke-IoAF18A")
final class GetDeviceFirmwareInfoUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceFirmwareInfoUC$invoke$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = this.this$0.a(this);
        return objA == CoroutineSingletons.f43038b ? objA : new Result(objA);
    }
}
