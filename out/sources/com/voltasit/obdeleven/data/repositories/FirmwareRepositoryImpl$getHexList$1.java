package com.voltasit.obdeleven.data.repositories;

import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: FirmwareRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.FirmwareRepositoryImpl", f = "FirmwareRepositoryImpl.kt", l = {24}, m = "getHexList-gIAlu-s")
final class FirmwareRepositoryImpl$getHexList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareRepositoryImpl$getHexList$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Serializable serializableB = this.this$0.b(null, this);
        return serializableB == CoroutineSingletons.f43038b ? serializableB : new Result(serializableB);
    }
}
