package com.voltasit.obdeleven.presentation.vehicleInfo;

import A8.A;
import G8.H;
import K8.o;
import K8.x;
import androidx.lifecycle.Z;
import kotlinx.coroutines.C2680e;
import p255u9.E;

/* JADX INFO: compiled from: VehicleInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VehicleInfoViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f33492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f33493p;

    public VehicleInfoViewModel(x xVar, o oVar) {
        this.f33492o = xVar;
        this.f33493p = oVar;
    }

    public final void b(E vehicleDB) {
        kotlin.jvm.internal.i.e(vehicleDB, "vehicleDB");
        this.f33492o.a().getClass();
        H hI = A.i(vehicleDB);
        C2680e.c(Z.a(this), this.f32112a, null, new VehicleInfoViewModel$setVehicleChanges$1(this, hI, null), 2);
    }
}
