package com.voltasit.obdeleven.presentation.main;

import G8.I;
import Ia.l;
import J8.p;
import J8.x;
import K8.o;
import K8.v;
import K8.y;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.C1362e;
import androidx.lifecycle.C1367j;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import com.parse.ParseObject;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.ControlUnitType;
import com.voltasit.obdeleven.domain.usecases.A;
import com.voltasit.obdeleven.domain.usecases.LoadVehicleIntoCacheUseCase;
import com.voltasit.obdeleven.domain.usecases.VehicleClearFaultsUseCase;
import com.voltasit.obdeleven.domain.usecases.m;
import com.voltasit.obdeleven.domain.usecases.vehicle.j;
import com.voltasit.obdeleven.presentation.controlunitlist.online.OnlineControlUnitListFragment;
import com.voltasit.obdeleven.presentation.garage.GarageFragment;
import com.voltasit.obdeleven.presentation.models.BatteryVoltageState;
import com.voltasit.obdeleven.presentation.models.StartView;
import com.voltasit.obdeleven.presentation.models.UserInteractionState;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import p114j1.C2479a;
import p134k8.a2;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final m f32525A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C1362e f32526A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final A f32527B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final C<Boolean> f32528B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final J8.g f32529C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final C f32530C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.m f32531D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final U7.a f32532D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.odx.a f32533E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final U7.a<Boolean> f32534E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final J8.a f32535F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final U7.a f32536F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final p f32537G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final U7.a<Boolean> f32538G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final j f32539H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final U7.a f32540H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f32541I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final U7.a<Boolean> f32542I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f32543J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final U7.a f32544J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f32545K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final U7.a<Boolean> f32546K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f32547L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final U7.a f32548L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final S8.c f32549M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final U7.a<Integer> f32550M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C2479a f32551N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final U7.a f32552N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f32553O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final U7.a<Integer> f32554O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C<Float> f32555P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final U7.a f32556P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final B f32557Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final U7.a<Integer> f32558Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final B f32559R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final U7.a f32560R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final C<Boolean> f32561S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final U7.a<Integer> f32562S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final C f32563T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final U7.a f32564T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final C<Boolean> f32565U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final U7.a<Integer> f32566U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C f32567V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final U7.a f32568V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C<Boolean> f32569W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final U7.a<Intent> f32570W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final C f32571X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final U7.a f32572X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final C<UserInteractionState> f32573Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final U7.a<Boolean> f32574Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final C f32575Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public final U7.a f32576Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final C<Boolean> f32577a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final U7.a<r> f32578a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C f32579b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final U7.a f32580b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final C<Boolean> f32581c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final a f32582c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C f32583d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final Ia.p<I, kotlin.coroutines.c<? super Boolean>, Object> f32584d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final C<com.voltasit.obdeleven.presentation.components.coverLayout.a> f32585e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final C f32586f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final C<Boolean> f32587g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final C f32588h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C<String> f32589i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final C f32590j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C<String> f32591k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final C f32592l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final C<String> f32593m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final C f32594n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8.d f32595o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final C<Integer> f32596o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NavigationManager f32597p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final C f32598p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f32599q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final C<Integer> f32600q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f32601r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C f32602r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f32603s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C<List<p109i8.e>> f32604s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f32605t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final C f32606t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final K8.b f32607u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final C<U8.c> f32608u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J8.o f32609v;
    public final C v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.r f32610w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final C<Boolean> f32611w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VehicleClearFaultsUseCase f32612x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final C f32613x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final K8.x f32614y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final C<Boolean> f32615y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LoadVehicleIntoCacheUseCase f32616z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C f32617z0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.main.MainViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: MainViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$2", f = "MainViewModel.kt", l = {222}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.main.MainViewModel$2$a */
        /* JADX INFO: compiled from: MainViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainViewModel f32618b;

            public a(MainViewModel mainViewModel) {
                this.f32618b = mainViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                if (!((Boolean) obj).booleanValue()) {
                    this.f32618b.e();
                }
                return r.f47939a;
            }
        }

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return MainViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return r.f47939a;
            }
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.v vVarB = MainViewModel.this.f32603s.B();
            a aVar = new a(MainViewModel.this);
            this.label = 1;
            vVarB.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: compiled from: MainViewModel.kt */
    public static final class a implements W7.d {
        public a() {
        }

        @Override // W7.d
        public final String a() {
            return "MainViewModel" + this;
        }

        @Override // W7.d
        public final void e(int i10) {
            MainViewModel mainViewModel = MainViewModel.this;
            mainViewModel.f32537G.f("MainViewModel", "onStateChanged(" + i10 + ")");
            mainViewModel.f32553O = i10;
            if (i10 == 0) {
                mainViewModel.e();
                return;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                mainViewModel.d();
                return;
            }
            mainViewModel.f32537G.e("MainViewModel", "handleConnecting()");
            mainViewModel.f32573Y.j(UserInteractionState.f32651d);
            C<U8.c> c10 = mainViewModel.f32608u0;
            U8.c cVarD = c10.d();
            int i11 = 0;
            if (cVarD == null) {
                String str = null;
                cVarD = new U8.c(i11, 63, str, str);
            }
            c10.j(U8.c.a(cVarD, mainViewModel.f32595o.a(R.string.view_main_status_connecting, new Object[0]), -1, null, true, null, 52));
        }
    }

    public MainViewModel(J8.d dVar, NavigationManager navigationManager, y yVar, o oVar, v vVar, x xVar, K8.b bVar, J8.o oVar2, com.voltasit.obdeleven.domain.usecases.vehicle.r rVar, VehicleClearFaultsUseCase vehicleClearFaultsUseCase, K8.x xVar2, LoadVehicleIntoCacheUseCase loadVehicleIntoCacheUseCase, m mVar, A a10, J8.g gVar, com.voltasit.obdeleven.domain.usecases.vehicle.m mVar2, com.voltasit.obdeleven.domain.usecases.odx.a aVar, J8.a aVar2, p pVar, j jVar) {
        kotlin.jvm.internal.i.e(navigationManager, "navigationManager");
        this.f32595o = dVar;
        this.f32597p = navigationManager;
        this.f32599q = yVar;
        this.f32601r = oVar;
        this.f32603s = vVar;
        this.f32605t = xVar;
        this.f32607u = bVar;
        this.f32609v = oVar2;
        this.f32610w = rVar;
        this.f32612x = vehicleClearFaultsUseCase;
        this.f32614y = xVar2;
        this.f32616z = loadVehicleIntoCacheUseCase;
        this.f32525A = mVar;
        this.f32527B = a10;
        this.f32529C = gVar;
        this.f32531D = mVar2;
        this.f32533E = aVar;
        this.f32535F = aVar2;
        this.f32537G = pVar;
        this.f32539H = jVar;
        S8.c cVar = new S8.c();
        this.f32549M = cVar;
        this.f32551N = new C2479a();
        C<Float> c10 = new C<>();
        this.f32555P = c10;
        this.f32557Q = X.a(c10, new l<Float, String>() { // from class: com.voltasit.obdeleven.presentation.main.MainViewModel$voltageText$1
            {
                super(1);
            }

            @Override // Ia.l
            public final String invoke(Float f10) {
                MainViewModel mainViewModel = this.this$0;
                mainViewModel.f32561S.j(Boolean.valueOf(mainViewModel.f32601r.v()));
                return String.format(Locale.US, "%2.1f V", Arrays.copyOf(new Object[]{f10}, 1));
            }
        });
        this.f32559R = X.a(c10, new l<Float, BatteryVoltageState>() { // from class: com.voltasit.obdeleven.presentation.main.MainViewModel$voltage$1
            @Override // Ia.l
            public final BatteryVoltageState invoke(Float f10) {
                Float f11 = f10;
                BatteryVoltageState.a aVar3 = BatteryVoltageState.f32633b;
                kotlin.jvm.internal.i.b(f11);
                float fFloatValue = f11.floatValue();
                aVar3.getClass();
                for (BatteryVoltageState batteryVoltageState : BatteryVoltageState.values()) {
                    if (batteryVoltageState.c() > fFloatValue) {
                        return batteryVoltageState;
                    }
                }
                return BatteryVoltageState.UNKNOWN;
            }
        });
        C<Boolean> c11 = new C<>();
        this.f32561S = c11;
        this.f32563T = c11;
        C<Boolean> c12 = new C<>();
        this.f32565U = c12;
        this.f32567V = c12;
        C<Boolean> c13 = new C<>();
        this.f32569W = c13;
        this.f32571X = c13;
        C<UserInteractionState> c14 = new C<>();
        c14.j(UserInteractionState.f32649b);
        this.f32573Y = c14;
        this.f32575Z = c14;
        C<Boolean> c15 = new C<>();
        this.f32577a0 = c15;
        this.f32579b0 = c15;
        C<Boolean> c16 = new C<>();
        this.f32581c0 = c16;
        this.f32583d0 = c16;
        C<com.voltasit.obdeleven.presentation.components.coverLayout.a> c17 = new C<>();
        this.f32585e0 = c17;
        this.f32586f0 = c17;
        C<Boolean> c18 = new C<>();
        this.f32587g0 = c18;
        this.f32588h0 = c18;
        C<String> c19 = new C<>();
        this.f32589i0 = c19;
        this.f32590j0 = c19;
        C<String> c20 = new C<>();
        this.f32591k0 = c20;
        this.f32592l0 = c20;
        C<String> c21 = new C<>();
        this.f32593m0 = c21;
        this.f32594n0 = c21;
        C<Integer> c22 = new C<>();
        this.f32596o0 = c22;
        this.f32598p0 = c22;
        C<Integer> c23 = new C<>();
        c23.j(822083583);
        this.f32600q0 = c23;
        this.f32602r0 = c23;
        C<List<p109i8.e>> c24 = new C<>();
        this.f32604s0 = c24;
        this.f32606t0 = c24;
        C<U8.c> c25 = new C<>();
        this.f32608u0 = c25;
        this.v0 = c25;
        C<Boolean> c26 = new C<>();
        this.f32611w0 = c26;
        this.f32613x0 = c26;
        C<Boolean> c27 = new C<>();
        this.f32615y0 = c27;
        this.f32617z0 = c27;
        this.f32526A0 = C1367j.a(oVar.F(), null, 3);
        C<Boolean> c28 = new C<>();
        this.f32528B0 = c28;
        this.f32530C0 = c28;
        this.f32532D0 = new U7.a();
        U7.a<Boolean> aVar3 = new U7.a<>();
        this.f32534E0 = aVar3;
        this.f32536F0 = aVar3;
        U7.a<Boolean> aVar4 = new U7.a<>();
        this.f32538G0 = aVar4;
        this.f32540H0 = aVar4;
        U7.a<Boolean> aVar5 = new U7.a<>();
        this.f32542I0 = aVar5;
        this.f32544J0 = aVar5;
        U7.a<Boolean> aVar6 = new U7.a<>();
        this.f32546K0 = aVar6;
        this.f32548L0 = aVar6;
        U7.a<Integer> aVar7 = new U7.a<>();
        this.f32550M0 = aVar7;
        this.f32552N0 = aVar7;
        U7.a<Integer> aVar8 = new U7.a<>();
        this.f32554O0 = aVar8;
        this.f32556P0 = aVar8;
        U7.a<Integer> aVar9 = new U7.a<>();
        this.f32558Q0 = aVar9;
        this.f32560R0 = aVar9;
        U7.a<Integer> aVar10 = new U7.a<>();
        this.f32562S0 = aVar10;
        this.f32564T0 = aVar10;
        U7.a<Integer> aVar11 = new U7.a<>();
        this.f32566U0 = aVar11;
        this.f32568V0 = aVar11;
        U7.a<Intent> aVar12 = new U7.a<>();
        this.f32570W0 = aVar12;
        this.f32572X0 = aVar12;
        U7.a<Boolean> aVar13 = new U7.a<>();
        this.f32574Y0 = aVar13;
        this.f32576Z0 = aVar13;
        U7.a<r> aVar14 = new U7.a<>();
        this.f32578a1 = aVar14;
        this.f32580b1 = aVar14;
        a aVar15 = new a();
        this.f32582c1 = aVar15;
        this.f32584d1 = new MainViewModel$vehicleScanClearProgressHandler$1(this, null);
        pVar.e("MainViewModel", "init(" + this + ")");
        xVar.f(aVar15);
        cVar.f5703c = new C7.d(this);
        c16.j(Boolean.valueOf(oVar.H() ^ true));
        if (!vVar.z()) {
            e();
        }
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass2(null), 2);
    }

    public final void b() {
        boolean z10 = this.f32603s.z();
        o oVar = this.f32601r;
        if (!z10) {
            this.f32597p.m(oVar.H());
            return;
        }
        if (this.f32531D.f31062a.b()) {
            if (this.f32605t.k().f42727d) {
                g();
                return;
            } else if (oVar.m0()) {
                m(false);
                return;
            } else {
                this.f32542I0.j(Boolean.TRUE);
                return;
            }
        }
        this.f32599q.b();
        this.f32607u.g(p279w9.a.f47815m);
        C2680e.c(Z.a(this), null, null, new MainViewModel$clickProgressWheel$1(this, null), 3);
        if (this.f32609v.a()) {
            this.f32538G0.j(Boolean.TRUE);
        } else {
            this.f32574Y0.j(Boolean.TRUE);
        }
    }

    public final U8.c c() {
        U8.c cVarD = this.f32608u0.d();
        if (cVarD != null) {
            return cVarD;
        }
        String str = null;
        return new U8.c(0, 63, str, str);
    }

    public final void d() {
        this.f32537G.e("MainViewModel", "handleConnected()");
        this.f32599q.a();
        x xVar = this.f32605t;
        if (xVar.b()) {
            a2 a2VarK = xVar.k();
            if (this.f32601r.H()) {
                NavigationManager navigationManager = this.f32597p;
                BaseFragment<?> baseFragmentD = navigationManager.d();
                if ((baseFragmentD instanceof p195p9.c) || (baseFragmentD instanceof GarageFragment)) {
                    p195p9.b bVar = new p195p9.b();
                    E e10 = a2VarK.f42726c;
                    kotlin.jvm.internal.i.d(e10, "getParseObject(...)");
                    bVar.R(e10, false, false);
                    navigationManager.h();
                    navigationManager.n(bVar, null);
                }
            } else {
                E e11 = a2VarK.f42726c;
                kotlin.jvm.internal.i.d(e11, "getParseObject(...)");
                this.f32585e0.j(new com.voltasit.obdeleven.presentation.components.coverLayout.a.C0332a(e11));
            }
            if (a2VarK.f42727d) {
                this.f32604s0.j(EmptyList.f42983b);
                this.f32543J = 0;
                this.f32541I = 0;
                C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$handleConnected$1(this, null), 2);
                this.f32577a0.j(Boolean.TRUE);
            } else {
                this.f32608u0.j(U8.c.a(c(), this.f32595o.a(R.string.common_scan, new Object[0]), -1, "", false, null, 48));
            }
            Boolean bool = Boolean.TRUE;
            this.f32528B0.j(bool);
            this.f32573Y.j(UserInteractionState.f32649b);
            this.f32565U.j(bool);
            C2479a c2479a = this.f32551N;
            S8.c cVar = this.f32549M;
            cVar.f5701a = c2479a;
            cVar.f5702b = new Timer();
            cVar.f5702b.scheduleAtFixedRate(new S8.b(cVar), 0L, 1000L);
        }
    }

    public final void e() {
        this.f32537G.e("MainViewModel", "handleDisconnected()");
        this.f32599q.a();
        Boolean bool = Boolean.FALSE;
        this.f32569W.j(bool);
        this.f32565U.j(bool);
        this.f32573Y.j(UserInteractionState.f32649b);
        this.f32577a0.j(bool);
        o oVar = this.f32601r;
        boolean zH = oVar.H();
        v vVar = this.f32603s;
        if (zH) {
            this.f32581c0.j(bool);
        } else {
            boolean z10 = vVar.z();
            C<com.voltasit.obdeleven.presentation.components.coverLayout.a> c10 = this.f32585e0;
            if (z10 && oVar.a0() != StartView.GARAGE) {
                c10.j(com.voltasit.obdeleven.presentation.components.coverLayout.a.c.f31383a);
                C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$handleDisconnected$1(this, null), 2);
            } else {
                c10.j(com.voltasit.obdeleven.presentation.components.coverLayout.a.b.f31382a);
            }
        }
        if (!this.f32597p.e().equals(p195p9.c.class.getName())) {
            this.f32587g0.j(bool);
        }
        String str = "";
        this.f32589i0.j("");
        this.f32596o0.j(50);
        this.f32600q0.j(822083583);
        l();
        this.f32604s0.j(EmptyList.f42983b);
        this.f32561S.j(bool);
        this.f32608u0.j(new U8.c(-1, 32, this.f32595o.a(vVar.z() ? R.string.common_connect : R.string.common_sign_in, new Object[0]), str));
        this.f32611w0.j(bool);
        this.f32615y0.j(bool);
        this.f32547L = false;
        this.f32545K = true;
        o();
        x xVar = this.f32605t;
        if (xVar.b()) {
            xVar.k().a();
        }
    }

    public final boolean f() {
        List<p109i8.e> listD;
        x xVar = this.f32605t;
        if (!xVar.b() || !xVar.k().f42727d || (listD = this.f32604s0.d()) == null || !(!listD.isEmpty())) {
            return false;
        }
        a2 a2VarK = xVar.k();
        h(this.f32595o.a(R.string.common_clearing, new Object[0]));
        C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$clearFaults$1(this, a2VarK, null), 2);
        o();
        UserTrackingUtils.c(UserTrackingUtils.Key.f34277v, 1);
        return true;
    }

    public final void g() {
        x xVar = this.f32605t;
        if (xVar.b()) {
            a2 a2VarK = xVar.k();
            OnlineControlUnitListFragment onlineControlUnitListFragment = new OnlineControlUnitListFragment();
            String objectId = a2VarK.f42726c.getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("vehicleId", objectId);
            onlineControlUnitListFragment.setArguments(bundle);
            this.f32597p.n(onlineControlUnitListFragment, null);
        }
    }

    public final void h(String str) {
        this.f32599q.b();
        this.f32565U.j(Boolean.FALSE);
        this.f32573Y.j(UserInteractionState.f32650c);
        this.f32547L = true;
        this.f32545K = false;
        this.f32608u0.j(U8.c.a(c(), str, -1, "", true, null, 48));
        this.f32546K0.j(Boolean.TRUE);
        this.f32596o0.j(50);
        this.f32589i0.j("0");
        l();
    }

    public final void i(List<? extends p109i8.e> list, Throwable th) {
        S8.c cVar = this.f32549M;
        cVar.f5701a = this.f32551N;
        cVar.f5702b = new Timer();
        cVar.f5702b.scheduleAtFixedRate(new S8.b(cVar), 0L, 1000L);
        C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$onFullScanDone$1(this, null), 2);
        if (th != null) {
            this.f32119h.j(Integer.valueOf(R.string.common_failed_to_save_history));
        }
        U8.c cVarD = this.f32608u0.d();
        if (kotlin.jvm.internal.i.a(cVarD != null ? cVarD.f6561a : null, this.f32595o.a(R.string.common_scanning, new Object[0]))) {
            this.f32573Y.j(UserInteractionState.f32650c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((p109i8.e) obj).b()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p109i8.e) it.next()).d());
            }
            ParseObject.saveAllInBackground(arrayList2);
            UserTrackingUtils.c(UserTrackingUtils.Key.f34258b, 1);
        }
    }

    public final void j() {
        this.f32537G.c("MainViewModel", "refresh()");
        C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$refresh$1(this, null), 2);
    }

    public final void k() {
        C<Boolean> c10 = this.f32611w0;
        Boolean bool = Boolean.TRUE;
        c10.j(bool);
        this.f32615y0.j(bool);
        this.f32604s0.j(EmptyList.f42983b);
        this.f32541I = 0;
        this.f32543J = 0;
        this.f32573Y.j(UserInteractionState.f32650c);
    }

    public final void l() {
        this.f32537G.e("MainViewModel", "restoreIconsFilters()");
        Iterator it = kotlin.collections.l.s(this.f32550M0, this.f32554O0, this.f32558Q0, this.f32562S0, this.f32566U0).iterator();
        while (it.hasNext()) {
            ((U7.a) it.next()).j(822083583);
        }
    }

    public final void m(boolean z10) {
        this.f32537G.f("MainViewModel", "scan(isSlowScanApproved=" + z10 + ")");
        com.voltasit.obdeleven.domain.usecases.odx.a aVar = this.f32533E;
        aVar.f30890b.f("ClearOdxVersionCache", "ClearOdxVersionCache()");
        aVar.f30889a.b();
        x xVar = this.f32605t;
        boolean zB = xVar.b();
        J8.d dVar = this.f32595o;
        if (!zB) {
            this.f32535F.y();
            this.j.j(dVar.a(R.string.common_status_not_connected, new Object[0]));
            return;
        }
        a2 a2VarK = xVar.k();
        o();
        h(dVar.a(R.string.common_scanning, new Object[0]));
        if (!this.f32539H.f31060a.d() && !z10) {
            this.f32578a1.j(r.f47939a);
            return;
        }
        k();
        C2680e.c(Z.a(this), this.f32112a, null, new MainViewModel$scan$1(this, a2VarK, z10, null), 2);
    }

    public final void n(short s10) {
        if (s10 == ControlUnitType.Engine.a()) {
            this.f32550M0.j(-867314);
            return;
        }
        if (s10 == ControlUnitType.Brakes.a()) {
            this.f32554O0.j(-867314);
            return;
        }
        if (s10 == ControlUnitType.AirBag.a()) {
            this.f32558Q0.j(-867314);
        } else if (s10 == ControlUnitType.SteeringAssistance.a()) {
            this.f32562S0.j(-867314);
        } else {
            this.f32566U0.j(-867314);
        }
    }

    public final void o() {
        S8.c cVar = this.f32549M;
        Timer timer = cVar.f5702b;
        if (timer != null) {
            timer.cancel();
            cVar.f5702b.purge();
            cVar.f5702b = null;
        }
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        this.f32537G.e("MainViewModel", "onCleared(" + this + ")");
        super.onCleared();
        o();
        this.f32605t.p(this.f32582c1);
    }
}
