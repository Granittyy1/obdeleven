package com.voltasit.obdeleven.ui.activity;

import J8.x;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C1362e;
import androidx.lifecycle.C1367j;
import androidx.lifecycle.Z;
import com.obdeleven.service.exception.VehicleException;
import com.parse.ParsePush;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.PopTheHoodRequiredException;
import com.voltasit.obdeleven.domain.exceptions.SfdInfoMissingException;
import com.voltasit.obdeleven.domain.exceptions.SfdTemporarilyUnavailableException;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.providers.PurchaseProvider;
import com.voltasit.obdeleven.domain.usecases.device.B;
import com.voltasit.obdeleven.domain.usecases.device.C;
import com.voltasit.obdeleven.domain.usecases.device.C2117b;
import com.voltasit.obdeleven.domain.usecases.device.C2118c;
import com.voltasit.obdeleven.domain.usecases.device.D;
import com.voltasit.obdeleven.domain.usecases.user.C2120a;
import com.voltasit.obdeleven.domain.usecases.user.SaveUserVehicleFromModificationUC;
import com.voltasit.obdeleven.domain.usecases.user.w;
import com.voltasit.obdeleven.domain.usecases.y;
import com.voltasit.obdeleven.domain.usecases.z;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.presentation.main.MainFragment;
import com.voltasit.obdeleven.presentation.profile.ProfileFragment;
import com.voltasit.obdeleven.utils.NavigationManager;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.z0;
import p134k8.a2;
import p255u9.E;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MainActivityViewModel extends com.voltasit.obdeleven.presentation.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C2120a f33576A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final U7.a f33577A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final B f33578B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final U7.a<String> f33579B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final D f33580C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final U7.a f33581C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.e f33582D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33583D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.q f33584E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final U7.a f33585E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.k f33586F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33587F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C f33588G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final U7.a f33589G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.permissions.c f33590H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final U7.a<Boolean> f33591H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.permissions.a f33592I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final U7.a f33593I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.g f33594J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33595J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.r f33596K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final U7.a f33597K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final com.voltasit.obdeleven.network.b f33598L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33599L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final J8.g f33600M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final U7.a f33601M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.device.m f33602N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33603N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C2117b f33604O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final U7.a f33605O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.permissions.b f33606P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33607P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.t f33608Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final U7.a f33609Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.p f33610R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33611R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.j f33612S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final U7.a f33613S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.c f33614T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33615T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.vehicle.s f33616U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final U7.a f33617U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final z f33618V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33619V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final x f33620W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final U7.a f33621W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final y f33622X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33623X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final J8.u f33624Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final U7.a f33625Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final J8.m f33626Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public E f33627Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public BluetoothConnectionHelper f33628a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public NavigationManager f33629b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33630c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final U7.a f33631d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final U7.a<com.voltasit.obdeleven.presentation.dialogs.bonus.c> f33632e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final U7.a f33633f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final U7.a<com.voltasit.obdeleven.presentation.dialogs.bonus.c> f33634g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final U7.a f33635h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C1362e f33636i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final U7.a<Boolean> f33637j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final U7.a f33638k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final U7.a<Boolean> f33639l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final U7.a f33640m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final U7.a<Boolean> f33641n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final K8.y f33642o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final U7.a f33643o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final K8.o f33644p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final U7.a<Boolean> f33645p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PurchaseProvider f33646q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final U7.a f33647q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K8.v f33648r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33649r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final J8.d f33650s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final U7.a f33651s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final J8.p f33652t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final U7.a<Boolean> f33653t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SaveUserVehicleFromModificationUC f33654u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final U7.a f33655u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.user.z f33656v;
    public final U7.a<Boolean> v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final J8.a f33657w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final U7.a f33658w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.voltasit.obdeleven.domain.usecases.B f33659x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final U7.a<Boolean> f33660x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2118c f33661y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final U7.a f33662y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final J8.c f33663z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final U7.a<p293xa.r> f33664z0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$1", f = "MainActivityViewModel.kt", l = {169}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$1$a */
        /* JADX INFO: compiled from: MainActivityViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivityViewModel f33665b;

            public a(MainActivityViewModel mainActivityViewModel) {
                this.f33665b = mainActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                G8.k kVar = (G8.k) obj;
                int i10 = kVar.f3514b;
                MainActivityViewModel mainActivityViewModel = this.f33665b;
                mainActivityViewModel.getClass();
                mainActivityViewModel.f33652t.f("MainActivityViewModel", "onBluetoothStateChanged(" + i10 + ")");
                C2680e.c(Z.a(mainActivityViewModel), null, null, new MainActivityViewModel$onBluetoothStateChanged$1(i10, mainActivityViewModel, kVar.f3513a, kVar.f3515c, null), 3);
                return p293xa.r.f47939a;
            }
        }

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return MainActivityViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
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
                return p293xa.r.f47939a;
            }
            kotlin.b.b(obj);
            kotlinx.coroutines.flow.v vVarH = MainActivityViewModel.this.f33663z.h();
            a aVar = new a(MainActivityViewModel.this);
            this.label = 1;
            vVarH.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$2", f = "MainActivityViewModel.kt", l = {174}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$2$a */
        /* JADX INFO: compiled from: MainActivityViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivityViewModel f33666b;

            public a(MainActivityViewModel mainActivityViewModel) {
                this.f33666b = mainActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                ((Number) obj).intValue();
                com.voltasit.obdeleven.domain.usecases.t tVar = this.f33666b.f33608Q;
                K8.o oVar = tVar.f30957a;
                G8.v vVarW = oVar.W();
                if (oVar.j() >= vVarW.f3550f && vVarW.f3549e) {
                    tVar.f30958b.a();
                }
                return p293xa.r.f47939a;
            }
        }

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return MainActivityViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
            ((AnonymousClass2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            return CoroutineSingletons.f43038b;
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
                throw new KotlinNothingValueException();
            }
            kotlin.b.b(obj);
            StateFlowImpl stateFlowImplU = MainActivityViewModel.this.f33644p.U();
            a aVar = new a(MainActivityViewModel.this);
            this.label = 1;
            stateFlowImplU.collect(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$3, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$3", f = "MainActivityViewModel.kt", l = {179}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$3$a */
        /* JADX INFO: compiled from: MainActivityViewModel.kt */
        public static final class a<T> implements InterfaceC2687d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivityViewModel f33667b;

            public a(MainActivityViewModel mainActivityViewModel) {
                this.f33667b = mainActivityViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                MainActivityViewModel mainActivityViewModel = this.f33667b;
                NavigationManager navigationManager = mainActivityViewModel.f33629b0;
                if (navigationManager == null) {
                    kotlin.jvm.internal.i.m("navigationManager");
                    throw null;
                }
                NavigationManager.i(navigationManager, MainFragment.class, true);
                p293xa.r rVar = p293xa.r.f47939a;
                mainActivityViewModel.f33599L0.j(rVar);
                return rVar;
            }
        }

        public AnonymousClass3(kotlin.coroutines.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return MainActivityViewModel.this.new AnonymousClass3(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.flow.t tVarA = MainActivityViewModel.this.f33612S.a();
                a aVar = new a(MainActivityViewModel.this);
                this.label = 1;
                if (tVarA.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    public MainActivityViewModel(K8.y yVar, K8.o oVar, PurchaseProvider purchaseProvider, K8.v vVar, J8.d dVar, J8.p pVar, SaveUserVehicleFromModificationUC saveUserVehicleFromModificationUC, com.voltasit.obdeleven.domain.usecases.user.z zVar, J8.a aVar, w wVar, com.voltasit.obdeleven.domain.usecases.B b10, C2118c c2118c, J8.c cVar, C2120a c2120a, B b11, D d10, com.voltasit.obdeleven.domain.usecases.device.e eVar, com.voltasit.obdeleven.domain.usecases.vehicle.q qVar, com.voltasit.obdeleven.domain.usecases.device.k kVar, C c10, com.voltasit.obdeleven.domain.usecases.permissions.c cVar2, com.voltasit.obdeleven.domain.usecases.permissions.a aVar2, com.voltasit.obdeleven.domain.usecases.device.g gVar, com.voltasit.obdeleven.domain.usecases.r rVar, com.voltasit.obdeleven.network.b bVar, J8.g gVar2, com.voltasit.obdeleven.domain.usecases.device.m mVar, C2117b c2117b, com.voltasit.obdeleven.domain.usecases.permissions.b bVar2, com.voltasit.obdeleven.domain.usecases.t tVar, com.voltasit.obdeleven.domain.usecases.user.p pVar2, com.voltasit.obdeleven.domain.usecases.user.j jVar, com.voltasit.obdeleven.domain.usecases.vehicle.c cVar3, com.voltasit.obdeleven.domain.usecases.vehicle.s sVar, z zVar2, x xVar, y yVar2, J8.u uVar, J8.m mVar2) {
        this.f33642o = yVar;
        this.f33644p = oVar;
        this.f33646q = purchaseProvider;
        this.f33648r = vVar;
        this.f33650s = dVar;
        this.f33652t = pVar;
        this.f33654u = saveUserVehicleFromModificationUC;
        this.f33656v = zVar;
        this.f33657w = aVar;
        this.f33659x = b10;
        this.f33661y = c2118c;
        this.f33663z = cVar;
        this.f33576A = c2120a;
        this.f33578B = b11;
        this.f33580C = d10;
        this.f33582D = eVar;
        this.f33584E = qVar;
        this.f33586F = kVar;
        this.f33588G = c10;
        this.f33590H = cVar2;
        this.f33592I = aVar2;
        this.f33594J = gVar;
        this.f33596K = rVar;
        this.f33598L = bVar;
        this.f33600M = gVar2;
        this.f33602N = mVar;
        this.f33604O = c2117b;
        this.f33606P = bVar2;
        this.f33608Q = tVar;
        this.f33610R = pVar2;
        this.f33612S = jVar;
        this.f33614T = cVar3;
        this.f33616U = sVar;
        this.f33618V = zVar2;
        this.f33620W = xVar;
        this.f33622X = yVar2;
        this.f33624Y = uVar;
        this.f33626Z = mVar2;
        U7.a<p293xa.r> aVar3 = new U7.a<>();
        this.f33630c0 = aVar3;
        this.f33631d0 = aVar3;
        U7.a<com.voltasit.obdeleven.presentation.dialogs.bonus.c> aVar4 = new U7.a<>();
        this.f33632e0 = aVar4;
        this.f33633f0 = aVar4;
        U7.a<com.voltasit.obdeleven.presentation.dialogs.bonus.c> aVar5 = new U7.a<>();
        this.f33634g0 = aVar5;
        this.f33635h0 = aVar5;
        this.f33636i0 = C1367j.a(wVar.f31027a.A(), Z.a(this).f34478b, 2);
        U7.a<Boolean> aVar6 = new U7.a<>();
        this.f33637j0 = aVar6;
        this.f33638k0 = aVar6;
        U7.a<Boolean> aVar7 = new U7.a<>();
        this.f33639l0 = aVar7;
        this.f33640m0 = aVar7;
        U7.a<Boolean> aVar8 = new U7.a<>();
        this.f33641n0 = aVar8;
        this.f33643o0 = aVar8;
        U7.a<Boolean> aVar9 = new U7.a<>();
        this.f33645p0 = aVar9;
        this.f33647q0 = aVar9;
        U7.a<p293xa.r> aVar10 = new U7.a<>();
        this.f33649r0 = aVar10;
        this.f33651s0 = aVar10;
        U7.a<Boolean> aVar11 = new U7.a<>();
        this.f33653t0 = aVar11;
        this.f33655u0 = aVar11;
        U7.a<Boolean> aVar12 = new U7.a<>();
        this.v0 = aVar12;
        this.f33658w0 = aVar12;
        U7.a<Boolean> aVar13 = new U7.a<>();
        this.f33660x0 = aVar13;
        this.f33662y0 = aVar13;
        U7.a<p293xa.r> aVar14 = new U7.a<>();
        this.f33664z0 = aVar14;
        this.f33577A0 = aVar14;
        U7.a<String> aVar15 = new U7.a<>();
        this.f33579B0 = aVar15;
        this.f33581C0 = aVar15;
        U7.a<p293xa.r> aVar16 = new U7.a<>();
        this.f33583D0 = aVar16;
        this.f33585E0 = aVar16;
        U7.a<p293xa.r> aVar17 = new U7.a<>();
        this.f33587F0 = aVar17;
        this.f33589G0 = aVar17;
        U7.a<Boolean> aVar18 = new U7.a<>();
        this.f33591H0 = aVar18;
        this.f33593I0 = aVar18;
        U7.a<p293xa.r> aVar19 = new U7.a<>();
        this.f33595J0 = aVar19;
        this.f33597K0 = aVar19;
        U7.a<p293xa.r> aVar20 = new U7.a<>();
        this.f33599L0 = aVar20;
        this.f33601M0 = aVar20;
        U7.a<p293xa.r> aVar21 = new U7.a<>();
        this.f33603N0 = aVar21;
        this.f33605O0 = aVar21;
        U7.a<p293xa.r> aVar22 = new U7.a<>();
        this.f33607P0 = aVar22;
        this.f33609Q0 = aVar22;
        U7.a<p293xa.r> aVar23 = new U7.a<>();
        this.f33611R0 = aVar23;
        this.f33613S0 = aVar23;
        U7.a<p293xa.r> aVar24 = new U7.a<>();
        this.f33615T0 = aVar24;
        this.f33617U0 = aVar24;
        U7.a<p293xa.r> aVar25 = new U7.a<>();
        this.f33619V0 = aVar25;
        this.f33621W0 = aVar25;
        U7.a<p293xa.r> aVar26 = new U7.a<>();
        this.f33623X0 = aVar26;
        this.f33625Y0 = aVar26;
        C2680e.c(Z.a(this), null, null, new AnonymousClass1(null), 3);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass2(null), 2);
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass3(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(MainActivityViewModel mainActivityViewModel, ContinuationImpl continuationImpl) {
        MainActivityViewModel$checkPersonalInfo$1 mainActivityViewModel$checkPersonalInfo$1;
        mainActivityViewModel.getClass();
        if (continuationImpl instanceof MainActivityViewModel$checkPersonalInfo$1) {
            mainActivityViewModel$checkPersonalInfo$1 = (MainActivityViewModel$checkPersonalInfo$1) continuationImpl;
            int i10 = mainActivityViewModel$checkPersonalInfo$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mainActivityViewModel$checkPersonalInfo$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mainActivityViewModel$checkPersonalInfo$1 = new MainActivityViewModel$checkPersonalInfo$1(mainActivityViewModel, continuationImpl);
            }
        } else {
            mainActivityViewModel$checkPersonalInfo$1 = new MainActivityViewModel$checkPersonalInfo$1(mainActivityViewModel, continuationImpl);
        }
        Object objA = mainActivityViewModel$checkPersonalInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mainActivityViewModel$checkPersonalInfo$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            mainActivityViewModel.f33652t.f("MainActivityViewModel", "checkPersonalInfo");
            mainActivityViewModel$checkPersonalInfo$1.L$0 = mainActivityViewModel;
            mainActivityViewModel$checkPersonalInfo$1.label = 1;
            objA = mainActivityViewModel.f33596K.a(mainActivityViewModel$checkPersonalInfo$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainActivityViewModel = (MainActivityViewModel) mainActivityViewModel$checkPersonalInfo$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            G8.t tVar = (G8.t) ((C8.a.b) aVar).f2463a;
            if (tVar.f3541a) {
                mainActivityViewModel.f33645p0.j(Boolean.valueOf(tVar.f3542b));
            }
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(MainActivityViewModel mainActivityViewModel, E e10, ContinuationImpl continuationImpl) {
        MainActivityViewModel$readVehicleControlUnits$1 mainActivityViewModel$readVehicleControlUnits$1;
        mainActivityViewModel.getClass();
        if (continuationImpl instanceof MainActivityViewModel$readVehicleControlUnits$1) {
            mainActivityViewModel$readVehicleControlUnits$1 = (MainActivityViewModel$readVehicleControlUnits$1) continuationImpl;
            int i10 = mainActivityViewModel$readVehicleControlUnits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mainActivityViewModel$readVehicleControlUnits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mainActivityViewModel$readVehicleControlUnits$1 = new MainActivityViewModel$readVehicleControlUnits$1(mainActivityViewModel, continuationImpl);
            }
        } else {
            mainActivityViewModel$readVehicleControlUnits$1 = new MainActivityViewModel$readVehicleControlUnits$1(mainActivityViewModel, continuationImpl);
        }
        Object objK = mainActivityViewModel$readVehicleControlUnits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mainActivityViewModel$readVehicleControlUnits$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                mainActivityViewModel = (MainActivityViewModel) mainActivityViewModel$readVehicleControlUnits$1.L$0;
                kotlin.b.b(objK);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objK);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(objK);
        x xVar = mainActivityViewModel.f33620W;
        xVar.l(e10);
        p255u9.D dI = xVar.k().f42726c.i();
        if (dI != null && dI.getBoolean("isSfd2Protected")) {
            mainActivityViewModel$readVehicleControlUnits$1.L$0 = mainActivityViewModel;
            mainActivityViewModel$readVehicleControlUnits$1.label = 1;
            objK = mainActivityViewModel.k(mainActivityViewModel$readVehicleControlUnits$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        mainActivityViewModel$readVehicleControlUnits$1.L$0 = null;
        mainActivityViewModel$readVehicleControlUnits$1.label = 2;
        if (mainActivityViewModel.i(mainActivityViewModel$readVehicleControlUnits$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
        if (!((Boolean) objK).booleanValue()) {
            return p293xa.r.f47939a;
        }
        mainActivityViewModel$readVehicleControlUnits$1.L$0 = null;
        mainActivityViewModel$readVehicleControlUnits$1.label = 2;
        if (mainActivityViewModel.i(mainActivityViewModel$readVehicleControlUnits$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    public final z0 d() {
        return C2680e.c(Z.a(this), this.f32112a, null, new MainActivityViewModel$connectToVehicle$1(this, null), 2);
    }

    public final void e() {
        this.f33652t.f("MainActivityViewModel", "disconnect()");
        if (W7.c.d()) {
            W7.c.b();
        }
        W7.c.g(0);
    }

    public final void f(String cpuId, String mac, String serial, int i10, SubscriptionType subscriptionType) {
        kotlin.jvm.internal.i.e(cpuId, "cpuId");
        kotlin.jvm.internal.i.e(mac, "mac");
        kotlin.jvm.internal.i.e(serial, "serial");
        kotlin.jvm.internal.i.e(subscriptionType, "subscriptionType");
        C2680e.c(Z.a(this), this.f32112a, null, new MainActivityViewModel$getUserDetails$1(i10, subscriptionType, this, cpuId, mac, serial, null), 2);
    }

    public final void g(boolean z10) {
        if (this.f33648r.z()) {
            NavigationManager navigationManager = this.f33629b0;
            if (navigationManager != null) {
                navigationManager.n(new ProfileFragment(), null);
                return;
            } else {
                kotlin.jvm.internal.i.m("navigationManager");
                throw null;
            }
        }
        NavigationManager navigationManager2 = this.f33629b0;
        if (navigationManager2 != null) {
            navigationManager2.m(z10);
        } else {
            kotlin.jvm.internal.i.m("navigationManager");
            throw null;
        }
    }

    public final void h(DialogCallback.CallbackType callbackType) {
        int iOrdinal = callbackType.ordinal();
        if (iOrdinal == 1) {
            d();
        } else if (iOrdinal != 2) {
            W7.c.f7065c.stop();
        } else {
            this.f33664z0.j(p293xa.r.f47939a);
        }
        this.v0.j(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ContinuationImpl continuationImpl) {
        MainActivityViewModel$readControlUnits$1 mainActivityViewModel$readControlUnits$1;
        MainActivityViewModel mainActivityViewModel;
        if (continuationImpl instanceof MainActivityViewModel$readControlUnits$1) {
            mainActivityViewModel$readControlUnits$1 = (MainActivityViewModel$readControlUnits$1) continuationImpl;
            int i10 = mainActivityViewModel$readControlUnits$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mainActivityViewModel$readControlUnits$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mainActivityViewModel$readControlUnits$1 = new MainActivityViewModel$readControlUnits$1(this, continuationImpl);
            }
        } else {
            mainActivityViewModel$readControlUnits$1 = new MainActivityViewModel$readControlUnits$1(this, continuationImpl);
        }
        Object objA = mainActivityViewModel$readControlUnits$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mainActivityViewModel$readControlUnits$1.label;
        if (i11 == 0) {
            kotlin.b.b(objA);
            mainActivityViewModel$readControlUnits$1.L$0 = this;
            mainActivityViewModel$readControlUnits$1.label = 1;
            objA = this.f33584E.a(mainActivityViewModel$readControlUnits$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            mainActivityViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainActivityViewModel = (MainActivityViewModel) mainActivityViewModel$readControlUnits$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            mainActivityViewModel.j(true);
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            J8.p pVar = mainActivityViewModel.f33652t;
            pVar.e("MainActivityViewModel", "Failed reading control units");
            if (th instanceof VehicleException) {
                W7.c.g(0);
                if (((VehicleException) th).a() == 3) {
                    mainActivityViewModel.f32119h.j(Integer.valueOf(R.string.common_check_network_connection));
                }
            } else {
                pVar.d(th, false);
            }
            mainActivityViewModel.e();
        }
        return p293xa.r.f47939a;
    }

    public final void j(boolean z10) {
        if (z10) {
            a2 a2Var = W7.c.f7067e;
            if (a2Var == null) {
                return;
            }
            p252u6.e eVarA = p252u6.e.a();
            E e10 = a2Var.f42726c;
            String strK = e10.k();
            com.google.firebase.crashlytics.internal.common.a aVar = eVarA.f47436a.f48304g;
            aVar.getClass();
            try {
                aVar.f28085d.f48895d.a("VIN", strK);
            } catch (IllegalArgumentException e11) {
                Context context = aVar.f28082a;
                if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                    throw e11;
                }
                Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
            }
            if (e10.d() != null) {
                String strD = e10.d();
                kotlin.jvm.internal.i.d(strD, "getMake(...)");
                if (strD.length() > 0) {
                    ParsePush.subscribeInBackground(e10.d());
                }
            }
            if (e10.e() != null) {
                String strE = e10.e();
                kotlin.jvm.internal.i.d(strE, "getModel(...)");
                if (strE.length() > 0) {
                    ParsePush.subscribeInBackground(e10.e());
                }
            }
            W7.c.g(2);
            UserTrackingUtils.c(UserTrackingUtils.Key.f34268m, 1);
            String strD2 = e10.d();
            if (strD2.isEmpty()) {
                p255u9.D dI = e10.i();
                strD2 = dI != null ? dI.getString("make") : "";
            }
            kotlin.jvm.internal.i.d(strD2, "getDisplayMake(...)");
            this.f33657w.e0(new J8.r("vehicle_connected", kotlin.collections.y.s(new Pair("api_type", "Vag"), new Pair("make", strD2))));
        } else {
            this.f33652t.b("MainActivityViewModel", "Task not faulted, but result is null");
            e();
        }
        this.f33642o.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(ContinuationImpl continuationImpl) {
        MainActivityViewModel$unlockSfd2$1 mainActivityViewModel$unlockSfd2$1;
        MainActivityViewModel mainActivityViewModel;
        if (continuationImpl instanceof MainActivityViewModel$unlockSfd2$1) {
            mainActivityViewModel$unlockSfd2$1 = (MainActivityViewModel$unlockSfd2$1) continuationImpl;
            int i10 = mainActivityViewModel$unlockSfd2$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mainActivityViewModel$unlockSfd2$1.label = i10 - Integer.MIN_VALUE;
            } else {
                mainActivityViewModel$unlockSfd2$1 = new MainActivityViewModel$unlockSfd2$1(this, continuationImpl);
            }
        } else {
            mainActivityViewModel$unlockSfd2$1 = new MainActivityViewModel$unlockSfd2$1(this, continuationImpl);
        }
        Object objA = mainActivityViewModel$unlockSfd2$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = mainActivityViewModel$unlockSfd2$1.label;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.b.b(objA);
            mainActivityViewModel$unlockSfd2$1.L$0 = this;
            mainActivityViewModel$unlockSfd2$1.label = 1;
            objA = this.f33618V.a(mainActivityViewModel$unlockSfd2$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            mainActivityViewModel = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mainActivityViewModel = (MainActivityViewModel) mainActivityViewModel$unlockSfd2$1.L$0;
            kotlin.b.b(objA);
        }
        C8.a aVar = (C8.a) objA;
        if (!(aVar instanceof C8.a.b)) {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            mainActivityViewModel.f33652t.e("MainActivityViewModel", "Failed unlocking SFD2 protection");
            if (th instanceof SfdTemporarilyUnavailableException) {
                mainActivityViewModel.f33615T0.j(p293xa.r.f47939a);
            } else {
                if (th instanceof SfdInfoMissingException) {
                    mainActivityViewModel.e();
                    mainActivityViewModel.f33611R0.j(p293xa.r.f47939a);
                } else if (th instanceof PopTheHoodRequiredException) {
                    mainActivityViewModel.e();
                    mainActivityViewModel.f33619V0.j(p293xa.r.f47939a);
                }
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
