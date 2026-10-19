package com.voltasit.obdeleven.presentation.pro;

import androidx.lifecycle.C;
import androidx.lifecycle.C1362e;
import androidx.lifecycle.C1367j;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.domain.usecases.user.v;
import com.voltasit.obdeleven.domain.usecases.user.w;
import com.voltasit.obdeleven.domain.usecases.vehicle.m;
import com.voltasit.obdeleven.presentation.d;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: ProViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ProViewModel extends d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C f32793A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final U7.a<r> f32794B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final U7.a f32795C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final U7.a<r> f32796D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final U7.a f32797E;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D f32798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f32799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f32800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final U7.a f32801r = new U7.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final U7.a f32802s = new U7.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final U7.a f32803t = new U7.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final U7.a<r> f32804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final U7.a f32805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U7.a<r> f32806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U7.a f32807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1362e f32808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C<Boolean> f32809z;

    /* JADX INFO: compiled from: ProViewModel.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.pro.ProViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ProViewModel.kt */
        public static final class C0340a extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0340a)) {
                    return false;
                }
                ((C0340a) obj).getClass();
                return i.a(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ErrorMessage(message=null)";
            }
        }
    }

    public ProViewModel(D d10, m mVar, w wVar, v vVar) {
        this.f32798o = d10;
        this.f32799p = mVar;
        this.f32800q = vVar;
        U7.a<r> aVar = new U7.a<>();
        this.f32804u = aVar;
        this.f32805v = aVar;
        U7.a<r> aVar2 = new U7.a<>();
        this.f32806w = aVar2;
        this.f32807x = aVar2;
        this.f32808y = C1367j.a(wVar.f31027a.A(), Z.a(this).f34478b, 2);
        C<Boolean> c10 = new C<>();
        this.f32809z = c10;
        this.f32793A = c10;
        U7.a<r> aVar3 = new U7.a<>();
        this.f32794B = aVar3;
        this.f32795C = aVar3;
        U7.a<r> aVar4 = new U7.a<>();
        this.f32796D = aVar4;
        this.f32797E = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(ProViewModel proViewModel, ContinuationImpl continuationImpl) {
        ProViewModel$fetchIsPro$1 proViewModel$fetchIsPro$1;
        proViewModel.getClass();
        if (continuationImpl instanceof ProViewModel$fetchIsPro$1) {
            proViewModel$fetchIsPro$1 = (ProViewModel$fetchIsPro$1) continuationImpl;
            int i10 = proViewModel$fetchIsPro$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                proViewModel$fetchIsPro$1.label = i10 - Integer.MIN_VALUE;
            } else {
                proViewModel$fetchIsPro$1 = new ProViewModel$fetchIsPro$1(proViewModel, continuationImpl);
            }
        } else {
            proViewModel$fetchIsPro$1 = new ProViewModel$fetchIsPro$1(proViewModel, continuationImpl);
        }
        Object objA = proViewModel$fetchIsPro$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = proViewModel$fetchIsPro$1.label;
        if (i11 == 0) {
            b.b(objA);
            proViewModel.f32809z.k(Boolean.TRUE);
            proViewModel$fetchIsPro$1.L$0 = proViewModel;
            proViewModel$fetchIsPro$1.label = 1;
            objA = proViewModel.f32798o.a(true, proViewModel$fetchIsPro$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            proViewModel = (ProViewModel) proViewModel$fetchIsPro$1.L$0;
            b.b(objA);
        }
        if (objA instanceof C8.a.C0024a) {
            proViewModel.f32806w.j(r.f47939a);
        }
        proViewModel.f32809z.k(Boolean.FALSE);
        return r.f47939a;
    }

    public final void c(boolean z10) {
        if (!z10 || this.f32799p.f31062a.b()) {
            C2680e.c(Z.a(this), null, null, new ProViewModel$fetchUserDetails$1(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        SubscriptionType subscriptionType;
        G8.D d10 = (G8.D) this.f32808y.d();
        if (d10 == null || (subscriptionType = d10.f3410a) == null || !subscriptionType.c()) {
            this.f32804u.j(r.f47939a);
        } else {
            this.f32794B.j(r.f47939a);
        }
    }
}
