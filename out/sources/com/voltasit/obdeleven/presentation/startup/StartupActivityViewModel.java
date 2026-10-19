package com.voltasit.obdeleven.presentation.startup;

import Aa.c;
import C8.a;
import J8.p;
import K8.v;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.domain.exceptions.InvalidUserSessionException;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import com.voltasit.obdeleven.domain.usecases.n;
import com.voltasit.obdeleven.domain.usecases.user.D;
import com.voltasit.obdeleven.domain.usecases.user.i;
import com.voltasit.obdeleven.domain.usecases.user.u;
import com.voltasit.obdeleven.domain.usecases.user.x;
import com.voltasit.obdeleven.domain.usecases.vehicle.o;
import com.voltasit.obdeleven.presentation.d;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: StartupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StartupActivityViewModel extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f33279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f33280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f33281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f33282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f33283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f33284t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f33285u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x f33286v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C<r> f33287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C f33288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C<r> f33289y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C f33290z;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel$1, reason: invalid class name */
    /* JADX INFO: compiled from: StartupActivityViewModel.kt */
    @c(c = "com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel$1", f = "StartupActivityViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return StartupActivityViewModel.this.new AnonymousClass1(cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            StartupActivityViewModel.this.f33286v.a();
            if (StartupActivityViewModel.this.f33279o.z()) {
                StartupActivityViewModel.this.c();
            } else {
                StartupActivityViewModel.this.f33289y.j(r.f47939a);
            }
            return r.f47939a;
        }
    }

    public StartupActivityViewModel(v vVar, u uVar, n nVar, i iVar, o oVar, p pVar, D d10, x xVar) {
        this.f33279o = vVar;
        this.f33280p = uVar;
        this.f33281q = nVar;
        this.f33282r = iVar;
        this.f33283s = oVar;
        this.f33284t = pVar;
        this.f33285u = d10;
        this.f33286v = xVar;
        C<r> c10 = new C<>();
        this.f33287w = c10;
        this.f33288x = c10;
        C<r> c11 = new C<>();
        this.f33289y = c11;
        this.f33290z = c11;
        C2680e.c(Z.a(this), this.f32112a, null, new AnonymousClass1(null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(StartupActivityViewModel startupActivityViewModel, a aVar, a aVar2, a aVar3, ContinuationImpl continuationImpl) {
        StartupActivityViewModel$handleResponse$1 startupActivityViewModel$handleResponse$1;
        startupActivityViewModel.getClass();
        if (continuationImpl instanceof StartupActivityViewModel$handleResponse$1) {
            startupActivityViewModel$handleResponse$1 = (StartupActivityViewModel$handleResponse$1) continuationImpl;
            int i10 = startupActivityViewModel$handleResponse$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                startupActivityViewModel$handleResponse$1.label = i10 - Integer.MIN_VALUE;
            } else {
                startupActivityViewModel$handleResponse$1 = new StartupActivityViewModel$handleResponse$1(startupActivityViewModel, continuationImpl);
            }
        } else {
            startupActivityViewModel$handleResponse$1 = new StartupActivityViewModel$handleResponse$1(startupActivityViewModel, continuationImpl);
        }
        Object obj = startupActivityViewModel$handleResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = startupActivityViewModel$handleResponse$1.label;
        if (i11 == 0) {
            b.b(obj);
            p pVar = startupActivityViewModel.f33284t;
            pVar.f("StartupActivityViewModel", "handleResponse()");
            if (!(aVar instanceof a.C0024a)) {
                if (aVar2 instanceof a.C0024a) {
                    aVar = aVar2;
                } else {
                    aVar = aVar3 instanceof a.C0024a ? aVar3 : new a.b(r.f47939a);
                }
            }
            if (aVar instanceof a.b) {
                C2680e.c(Z.a(startupActivityViewModel), startupActivityViewModel.f32112a, null, new StartupActivityViewModel$prepareGarage$1(startupActivityViewModel, null), 2);
            } else if (aVar instanceof a.C0024a) {
                a.C0024a c0024a = (a.C0024a) aVar;
                Throwable th = c0024a.f2462a;
                if (kotlin.jvm.internal.i.a(th, InvalidUserSessionException.f30411b)) {
                    startupActivityViewModel$handleResponse$1.L$0 = startupActivityViewModel;
                    startupActivityViewModel$handleResponse$1.label = 1;
                    if (startupActivityViewModel.f33280p.a(startupActivityViewModel$handleResponse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    boolean z10 = th instanceof NoNetworkException;
                    C<r> c10 = startupActivityViewModel.f33287w;
                    if (z10) {
                        c10.j(r.f47939a);
                    } else {
                        pVar.d(c0024a.f2462a, false);
                        c10.j(r.f47939a);
                    }
                }
            }
            return r.f47939a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        startupActivityViewModel = (StartupActivityViewModel) startupActivityViewModel$handleResponse$1.L$0;
        b.b(obj);
        startupActivityViewModel.c();
        return r.f47939a;
    }

    public final void c() {
        C2680e.c(Z.a(this), this.f32112a, null, new StartupActivityViewModel$fetchData$1(this, null), 2);
    }
}
