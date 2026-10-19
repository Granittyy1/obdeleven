package com.voltasit.obdeleven.presentation.garage;

import G8.H;
import K8.v;
import K8.x;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.UserPermission;
import com.voltasit.obdeleven.domain.usecases.GetSortedVehicleModelListUseCase;
import com.voltasit.obdeleven.utils.NavigationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GarageViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C<String> f32308A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C f32309B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C<Boolean> f32310C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C f32311D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C<Boolean> f32312E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C f32313F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C<Boolean> f32314G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C f32315H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C f32316I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C f32317J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U7.a f32318K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final U7.a<Boolean> f32319L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final U7.a f32320M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final U7.a<Boolean> f32321N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final U7.a f32322O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final U7.a<Boolean> f32323P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final U7.a f32324Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final U7.a<Pair<String, List<p315z8.c>>> f32325R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final U7.a f32326S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final U7.a<Integer> f32327T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final U7.a f32328U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final U7.a<t> f32329V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final U7.a f32330W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final U7.a<Boolean> f32331X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final U7.a f32332Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final U7.a<a> f32333Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final U7.a f32334a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final U7.a<Boolean> f32335b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final U7.a f32336c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public a f32337d0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8.p f32338o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final J8.d f32339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NavigationManager f32340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f32341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final K8.o f32342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final K8.b f32343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x f32344u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GetSortedVehicleModelListUseCase f32345v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.a f32346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f32347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C<List<H>> f32348y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C f32349z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.garage.GarageViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: GarageViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel$1", f = "GarageViewModel.kt", l = {348}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return GarageViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0051 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:6:0x0015, B:17:0x0049, B:19:0x0051, B:14:0x003a, B:20:0x005b, B:13:0x0034), top: B:29:0x0005 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:17:0x0049). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r5.L$2
                kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.f) r1
                java.lang.Object r3 = r5.L$1
                kotlinx.coroutines.channels.p r3 = (kotlinx.coroutines.channels.p) r3
                java.lang.Object r4 = r5.L$0
                com.voltasit.obdeleven.presentation.garage.GarageViewModel r4 = (com.voltasit.obdeleven.presentation.garage.GarageViewModel) r4
                kotlin.b.b(r6)     // Catch: java.lang.Throwable -> L19
                goto L49
            L19:
                r6 = move-exception
                goto L64
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L23:
                kotlin.b.b(r6)
                com.voltasit.obdeleven.presentation.garage.GarageViewModel r6 = com.voltasit.obdeleven.presentation.garage.GarageViewModel.this
                K8.x r6 = r6.f32344u
                kotlinx.coroutines.channels.a r6 = r6.h()
                kotlinx.coroutines.channels.BufferedChannel r3 = r6.m()
                com.voltasit.obdeleven.presentation.garage.GarageViewModel r6 = com.voltasit.obdeleven.presentation.garage.GarageViewModel.this
                kotlinx.coroutines.channels.BufferedChannel$a r1 = new kotlinx.coroutines.channels.BufferedChannel$a     // Catch: java.lang.Throwable -> L19
                r1.<init>()     // Catch: java.lang.Throwable -> L19
                r4 = r6
            L3a:
                r5.L$0 = r4     // Catch: java.lang.Throwable -> L19
                r5.L$1 = r3     // Catch: java.lang.Throwable -> L19
                r5.L$2 = r1     // Catch: java.lang.Throwable -> L19
                r5.label = r2     // Catch: java.lang.Throwable -> L19
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L19
                if (r6 != r0) goto L49
                return r0
            L49:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L19
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L19
                if (r6 == 0) goto L5b
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L19
                G8.H r6 = (G8.H) r6     // Catch: java.lang.Throwable -> L19
                com.voltasit.obdeleven.presentation.garage.GarageViewModel.c(r4, r6)     // Catch: java.lang.Throwable -> L19
                goto L3a
            L5b:
                xa.r r6 = p293xa.r.f47939a     // Catch: java.lang.Throwable -> L19
                r6 = 0
                r3.i(r6)
                xa.r r6 = p293xa.r.f47939a
                return r6
            L64:
                throw r6     // Catch: java.lang.Throwable -> L65
            L65:
                r0 = move-exception
                p241t7.b.b(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voltasit.obdeleven.presentation.garage.GarageViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: GarageViewModel.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f32351b;

        public a(String str, int i10) {
            this.f32350a = str;
            this.f32351b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f32350a, aVar.f32350a) && this.f32351b == aVar.f32351b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32351b) + (this.f32350a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToVehicleParams(id=" + this.f32350a + ", adapterPosition=" + this.f32351b + ")";
        }
    }

    public GarageViewModel(J8.p pVar, J8.d dVar, NavigationManager navigationManager, v vVar, K8.o oVar, K8.b bVar, x xVar, GetSortedVehicleModelListUseCase getSortedVehicleModelListUseCase, com.voltasit.obdeleven.domain.usecases.odx.a aVar, com.voltasit.obdeleven.domain.usecases.user.l lVar) {
        kotlin.jvm.internal.i.e(navigationManager, "navigationManager");
        this.f32338o = pVar;
        this.f32339p = dVar;
        this.f32340q = navigationManager;
        this.f32341r = vVar;
        this.f32342s = oVar;
        this.f32343t = bVar;
        this.f32344u = xVar;
        this.f32345v = getSortedVehicleModelListUseCase;
        this.f32346w = aVar;
        this.f32347x = "";
        C<List<H>> c10 = new C<>();
        this.f32348y = c10;
        this.f32349z = c10;
        C<String> c11 = new C<>();
        this.f32308A = c11;
        this.f32309B = c11;
        C<Boolean> c12 = new C<>();
        this.f32310C = c12;
        this.f32311D = c12;
        C<Boolean> c13 = new C<>();
        this.f32312E = c13;
        this.f32313F = c13;
        C<Boolean> c14 = new C<>();
        c14.j(Boolean.TRUE);
        this.f32314G = c14;
        this.f32315H = c14;
        this.f32316I = new C();
        C c15 = new C(Boolean.FALSE);
        this.f32317J = c15;
        U7.a aVar2 = new U7.a();
        this.f32318K = aVar2;
        U7.a<Boolean> aVar3 = new U7.a<>();
        this.f32319L = aVar3;
        this.f32320M = aVar3;
        U7.a<Boolean> aVar4 = new U7.a<>();
        this.f32321N = aVar4;
        this.f32322O = aVar4;
        U7.a<Boolean> aVar5 = new U7.a<>();
        this.f32323P = aVar5;
        this.f32324Q = aVar5;
        U7.a<Pair<String, List<p315z8.c>>> aVar6 = new U7.a<>();
        this.f32325R = aVar6;
        this.f32326S = aVar6;
        U7.a<Integer> aVar7 = new U7.a<>();
        this.f32327T = aVar7;
        this.f32328U = aVar7;
        U7.a<t> aVar8 = new U7.a<>();
        this.f32329V = aVar8;
        this.f32330W = aVar8;
        U7.a<Boolean> aVar9 = new U7.a<>();
        this.f32331X = aVar9;
        this.f32332Y = aVar9;
        U7.a<a> aVar10 = new U7.a<>();
        this.f32333Z = aVar10;
        this.f32334a0 = aVar10;
        U7.a<Boolean> aVar11 = new U7.a<>();
        this.f32335b0 = aVar11;
        this.f32336c0 = aVar11;
        if (vVar.z()) {
            c15.j(Boolean.valueOf(lVar.f31000a.C(UserPermission.ADD_VEHICLE_IN_GARAGE)));
            f(0, 50);
        } else {
            pVar.c("GarageViewModel", "User is not logged in");
            aVar2.j(dVar.a(R.string.view_garage_need_to_sign_in, new Object[0]));
            navigationManager.o(false);
        }
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }

    public static final void b(GarageViewModel garageViewModel, List list) {
        garageViewModel.getClass();
        if (list.isEmpty()) {
            garageViewModel.f32327T.j(Integer.valueOf(R.string.view_garage_vehicle_not_identified_try_again));
            return;
        }
        if (list.size() == 1) {
            int i10 = 0;
            H h8 = (H) list.get(0);
            garageViewModel.f32343t.i();
            C<List<H>> c10 = garageViewModel.f32348y;
            List<H> listD = c10.d();
            ArrayList arrayListP0 = listD != null ? kotlin.collections.q.p0(listD) : new ArrayList();
            Iterator<H> it = arrayListP0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else {
                    if (h8.f3427a.equals(it.next().f3427a)) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            com.voltasit.obdeleven.domain.usecases.odx.a aVar = garageViewModel.f32346w;
            aVar.f30890b.f("ClearOdxVersionCache", "ClearOdxVersionCache()");
            aVar.f30889a.b();
            if (i10 >= 0) {
                garageViewModel.f32333Z.j(new a(h8.f3427a, i10 + 1));
                return;
            }
            arrayListP0.add(h8);
            c10.j(arrayListP0);
            garageViewModel.f32337d0 = new a(h8.f3427a, arrayListP0.size());
        }
    }

    public static final void c(GarageViewModel garageViewModel, H h8) {
        C<List<H>> c10 = garageViewModel.f32348y;
        List<H> listD = c10.d();
        ArrayList arrayListP0 = listD != null ? kotlin.collections.q.p0(listD) : new ArrayList();
        Iterator<H> it = arrayListP0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().f3427a.equals(h8.f3427a)) {
                arrayListP0.set(i10, h8);
                c10.j(arrayListP0);
            }
            i10++;
        }
        i10 = -1;
        arrayListP0.set(i10, h8);
        c10.j(arrayListP0);
    }

    public static final void d(GarageViewModel garageViewModel, int i10) {
        garageViewModel.f32314G.j(Boolean.FALSE);
        garageViewModel.f32308A.j(garageViewModel.f32339p.a(i10, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(GarageViewModel garageViewModel, List list, String str, ContinuationImpl continuationImpl) {
        GarageViewModel$showSortedVehicleBaseDialog$1 garageViewModel$showSortedVehicleBaseDialog$1;
        garageViewModel.getClass();
        if (continuationImpl instanceof GarageViewModel$showSortedVehicleBaseDialog$1) {
            garageViewModel$showSortedVehicleBaseDialog$1 = (GarageViewModel$showSortedVehicleBaseDialog$1) continuationImpl;
            int i10 = garageViewModel$showSortedVehicleBaseDialog$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                garageViewModel$showSortedVehicleBaseDialog$1.label = i10 - Integer.MIN_VALUE;
            } else {
                garageViewModel$showSortedVehicleBaseDialog$1 = new GarageViewModel$showSortedVehicleBaseDialog$1(garageViewModel, continuationImpl);
            }
        } else {
            garageViewModel$showSortedVehicleBaseDialog$1 = new GarageViewModel$showSortedVehicleBaseDialog$1(garageViewModel, continuationImpl);
        }
        Object objI0 = garageViewModel$showSortedVehicleBaseDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = garageViewModel$showSortedVehicleBaseDialog$1.label;
        if (i11 == 0) {
            kotlin.b.b(objI0);
            kotlin.jvm.internal.i.c(list, "null cannot be cast to non-null type kotlin.collections.List<com.voltasit.parse.model.VehicleBaseDB>");
            garageViewModel$showSortedVehicleBaseDialog$1.L$0 = garageViewModel;
            garageViewModel$showSortedVehicleBaseDialog$1.L$1 = str;
            garageViewModel$showSortedVehicleBaseDialog$1.label = 1;
            objI0 = garageViewModel.f32345v.i0(list, garageViewModel$showSortedVehicleBaseDialog$1);
            if (objI0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) garageViewModel$showSortedVehicleBaseDialog$1.L$1;
            garageViewModel = (GarageViewModel) garageViewModel$showSortedVehicleBaseDialog$1.L$0;
            kotlin.b.b(objI0);
        }
        C8.a aVar = (C8.a) objI0;
        if (aVar instanceof C8.a.b) {
            garageViewModel.f32325R.j(new Pair<>(str, ((C8.a.b) aVar).f2463a));
        }
        return p293xa.r.f47939a;
    }

    public final void f(int i10, int i11) {
        C2680e.c(Z.a(this), this.f32112a, null, new GarageViewModel$loadVehicles$1(this, i10, i11, null), 2);
    }

    public final void g(boolean z10, boolean z11) {
        if (!this.f32341r.z()) {
            this.f32340q.o(false);
            return;
        }
        if (z11) {
            this.f32343t.i();
        }
        if (z10) {
            this.f32321N.j(Boolean.TRUE);
            this.f32347x = "";
        }
        this.f32348y.j(EmptyList.f42983b);
        f(0, 50);
    }
}
