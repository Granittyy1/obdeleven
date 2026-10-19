package com.voltasit.obdeleven.domain.usecases.vehicle;

import G8.H;
import K8.w;
import K8.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p255u9.D;

/* JADX INFO: compiled from: IsVehicleSfdProtectedUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f31063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f31064b;

    public n(x xVar, w wVar) {
        this.f31063a = xVar;
        this.f31064b = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        IsVehicleSfdProtectedUC$invoke$1 isVehicleSfdProtectedUC$invoke$1;
        n nVar;
        C8.a aVar;
        if (continuationImpl instanceof IsVehicleSfdProtectedUC$invoke$1) {
            isVehicleSfdProtectedUC$invoke$1 = (IsVehicleSfdProtectedUC$invoke$1) continuationImpl;
            int i10 = isVehicleSfdProtectedUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isVehicleSfdProtectedUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isVehicleSfdProtectedUC$invoke$1 = new IsVehicleSfdProtectedUC$invoke$1(this, continuationImpl);
            }
        } else {
            isVehicleSfdProtectedUC$invoke$1 = new IsVehicleSfdProtectedUC$invoke$1(this, continuationImpl);
        }
        Object objD = isVehicleSfdProtectedUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isVehicleSfdProtectedUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                nVar = (n) isVehicleSfdProtectedUC$invoke$1.L$0;
                kotlin.b.b(objD);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objD);
            }
            aVar = (C8.a) objD;
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            if (aVar instanceof C8.a.b) {
                return new C8.a.b(Boolean.valueOf(((D) ((C8.a.b) aVar).f2463a).getBoolean("isSfdProtected")));
            }
            throw new NoWhenBranchMatchedException();
        }
        kotlin.b.b(objD);
        isVehicleSfdProtectedUC$invoke$1.L$0 = this;
        isVehicleSfdProtectedUC$invoke$1.label = 1;
        objD = this.f31063a.d(str, isVehicleSfdProtectedUC$invoke$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        nVar = this;
        C8.a aVar2 = (C8.a) objD;
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        if (!(aVar2 instanceof C8.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((H) ((C8.a.b) aVar2).f2463a).f3433g;
        w wVar = nVar.f31064b;
        isVehicleSfdProtectedUC$invoke$1.L$0 = null;
        isVehicleSfdProtectedUC$invoke$1.label = 2;
        objD = wVar.o(str2, isVehicleSfdProtectedUC$invoke$1);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) objD;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar instanceof C8.a.b) {
            return new C8.a.b(Boolean.valueOf(((D) ((C8.a.b) aVar).f2463a).getBoolean("isSfdProtected")));
        }
        throw new NoWhenBranchMatchedException();
    }
}
