package com.voltasit.obdeleven.presentation.controlUnit.faults;

import K8.o;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.d;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: FaultsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f31597A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f31598B;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.controlUnit.d f31599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GetUserDetailsUC f31600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final K8.b f31601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f31602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C<r> f31603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C f31604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C<r> f31605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C f31606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C f31607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a<r> f31608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U7.a f31609y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ControlUnit f31610z;

    public b(com.voltasit.obdeleven.domain.usecases.controlUnit.d dVar, GetUserDetailsUC getUserDetailsUC, K8.b bVar, o oVar) {
        this.f31599o = dVar;
        this.f31600p = getUserDetailsUC;
        this.f31601q = bVar;
        this.f31602r = oVar;
        C<r> c10 = new C<>();
        this.f31603s = c10;
        this.f31604t = c10;
        C<r> c11 = new C<>();
        this.f31605u = c11;
        this.f31606v = c11;
        this.f31607w = new C();
        U7.a<r> aVar = new U7.a<>();
        this.f31608x = aVar;
        this.f31609y = aVar;
    }

    public final void b() {
        C2680e.c(Z.a(this), this.f32112a, null, new FaultsViewModel$setupFaults$1(this, null), 2);
    }
}
