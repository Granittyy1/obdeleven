package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SaveUserVehicleFromModificationUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.SaveUserVehicleFromModificationUC", f = "SaveUserVehicleFromModificationUC.kt", l = {21}, m = "invoke")
final class SaveUserVehicleFromModificationUC$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaveUserVehicleFromModificationUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveUserVehicleFromModificationUC$invoke$1(SaveUserVehicleFromModificationUC saveUserVehicleFromModificationUC, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = saveUserVehicleFromModificationUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
