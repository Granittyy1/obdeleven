package com.voltasit.obdeleven.domain.usecases.vehicle;

import J8.x;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GetVehicleExistingCUsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f31052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f31053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K8.c f31054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K8.d f31055d;

    public h(J8.p pVar, x xVar, K8.c cVar, K8.d dVar) {
        this.f31052a = pVar;
        this.f31053b = xVar;
        this.f31054c = cVar;
        this.f31055d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetVehicleExistingCUsUC$getControlUnits$1 getVehicleExistingCUsUC$getControlUnits$1;
        h hVar;
        if (continuationImpl instanceof GetVehicleExistingCUsUC$getControlUnits$1) {
            getVehicleExistingCUsUC$getControlUnits$1 = (GetVehicleExistingCUsUC$getControlUnits$1) continuationImpl;
            int i10 = getVehicleExistingCUsUC$getControlUnits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                getVehicleExistingCUsUC$getControlUnits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                getVehicleExistingCUsUC$getControlUnits$1 = new GetVehicleExistingCUsUC$getControlUnits$1(this, continuationImpl);
            }
        } else {
            getVehicleExistingCUsUC$getControlUnits$1 = new GetVehicleExistingCUsUC$getControlUnits$1(this, continuationImpl);
        }
        Object objA = getVehicleExistingCUsUC$getControlUnits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = getVehicleExistingCUsUC$getControlUnits$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            this.f31052a.f("GetVehicleExistingCUsUC", "getControlUnitsForGateway(" + str + ")");
            getVehicleExistingCUsUC$getControlUnits$1.L$0 = this;
            getVehicleExistingCUsUC$getControlUnits$1.label = 1;
            objA = this.f31055d.a(str, getVehicleExistingCUsUC$getControlUnits$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            hVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (h) getVehicleExistingCUsUC$getControlUnits$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            hVar.f31054c.b((Map) ((C8.a.b) aVar).f2463a);
        }
        return aVar;
    }
}
