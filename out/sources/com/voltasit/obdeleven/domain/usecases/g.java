package com.voltasit.obdeleven.domain.usecases;

import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: CheckVehicleBackupUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends C.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.x f30834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.v f30835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p084g8.b f30836e;

    public g(J8.x xVar, K8.v vVar, p084g8.b bVar) {
        this.f30834c = xVar;
        this.f30835d = vVar;
        this.f30836e = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i0(kotlin.coroutines.c cVar) {
        CheckVehicleBackupUseCase$execute$1 checkVehicleBackupUseCase$execute$1;
        if (cVar instanceof CheckVehicleBackupUseCase$execute$1) {
            checkVehicleBackupUseCase$execute$1 = (CheckVehicleBackupUseCase$execute$1) cVar;
            int i10 = checkVehicleBackupUseCase$execute$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                checkVehicleBackupUseCase$execute$1.label = i10 - Integer.MIN_VALUE;
            } else {
                checkVehicleBackupUseCase$execute$1 = new CheckVehicleBackupUseCase$execute$1(this, (ContinuationImpl) cVar);
            }
        } else {
            checkVehicleBackupUseCase$execute$1 = new CheckVehicleBackupUseCase$execute$1(this, (ContinuationImpl) cVar);
        }
        Object objE = checkVehicleBackupUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = checkVehicleBackupUseCase$execute$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objE);
                String objectId = this.f30834c.k().f42726c.getObjectId();
                String objectId2 = this.f30835d.L().getObjectId();
                p084g8.b bVar = this.f30836e;
                kotlin.jvm.internal.i.b(objectId2);
                kotlin.jvm.internal.i.b(objectId);
                checkVehicleBackupUseCase$execute$1.label = 1;
                objE = bVar.e(objectId2, objectId, checkVehicleBackupUseCase$execute$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objE);
            }
            return (C8.a) objE;
        } catch (VehicleNotConnectedException e10) {
            return new C8.a.C0024a(e10);
        }
    }
}
