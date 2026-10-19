package com.voltasit.obdeleven.domain.usecases;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CheckVehicleBackupUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.CheckVehicleBackupUseCase", f = "CheckVehicleBackupUseCase.kt", l = {18}, m = "execute")
final class CheckVehicleBackupUseCase$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVehicleBackupUseCase$execute$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(this);
    }
}
