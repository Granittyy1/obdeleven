package com.voltasit.obdeleven.data.repositories;

import A8.z;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.D;
import p304y9.K;

/* JADX INFO: compiled from: VehicleBaseRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements K8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.b f30395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.voltasit.sharednetwork.a f30396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f30397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F8.c f30398d;

    public x(K8.b bVar, com.voltasit.sharednetwork.a aVar, z zVar, F8.c cVar) {
        this.f30395a = bVar;
        this.f30396b = aVar;
        this.f30397c = zVar;
        this.f30398d = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // K8.w
    public final Object o(String str, ContinuationImpl continuationImpl) {
        VehicleBaseRepositoryImpl$getVehicleBase$1 vehicleBaseRepositoryImpl$getVehicleBase$1;
        x xVar;
        if (continuationImpl instanceof VehicleBaseRepositoryImpl$getVehicleBase$1) {
            vehicleBaseRepositoryImpl$getVehicleBase$1 = (VehicleBaseRepositoryImpl$getVehicleBase$1) continuationImpl;
            int i10 = vehicleBaseRepositoryImpl$getVehicleBase$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vehicleBaseRepositoryImpl$getVehicleBase$1.label = i10 - Integer.MIN_VALUE;
            } else {
                vehicleBaseRepositoryImpl$getVehicleBase$1 = new VehicleBaseRepositoryImpl$getVehicleBase$1(this, continuationImpl);
            }
        } else {
            vehicleBaseRepositoryImpl$getVehicleBase$1 = new VehicleBaseRepositoryImpl$getVehicleBase$1(this, continuationImpl);
        }
        Object objO = vehicleBaseRepositoryImpl$getVehicleBase$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = vehicleBaseRepositoryImpl$getVehicleBase$1.label;
        if (i11 == 0) {
            kotlin.b.b(objO);
            D d10 = (D) this.f30395a.l(str);
            if (d10 != null) {
                return new C8.a.b(d10);
            }
            try {
                com.voltasit.sharednetwork.a aVar = this.f30396b;
                vehicleBaseRepositoryImpl$getVehicleBase$1.L$0 = this;
                vehicleBaseRepositoryImpl$getVehicleBase$1.label = 1;
                objO = aVar.o(str, vehicleBaseRepositoryImpl$getVehicleBase$1);
                if (objO == coroutineSingletons) {
                    return coroutineSingletons;
                }
                xVar = this;
            } catch (Throwable th) {
                th = th;
                xVar = this;
                return E8.a.i(xVar.f30398d.a(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) vehicleBaseRepositoryImpl$getVehicleBase$1.L$0;
            try {
                kotlin.b.b(objO);
            } catch (Throwable th2) {
                th = th2;
                return E8.a.i(xVar.f30398d.a(th));
            }
        }
        z zVar = xVar.f30397c;
        D dA = z.a((K) objO);
        xVar.f30395a.b(dA);
        return new C8.a.b(dA);
    }
}
