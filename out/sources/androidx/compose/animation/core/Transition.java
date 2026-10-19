package androidx.compose.animation.core;

import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1083e0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Transition<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0<S> f9429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transition<?> f9430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f9433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1083e0 f9434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1083e0 f9435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1085f0 f9436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SnapshotStateList<Transition<S>.d<?, ?>> f9437i;
    public final SnapshotStateList<Transition<?>> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f9438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DerivedSnapshotState f9439l;

    /* JADX INFO: compiled from: Transition.kt */
    public final class a<T, V extends AbstractC0913m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f9440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1085f0 f9441b = J0.f(null);

        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Transition.kt */
        public final class C0121a<T, V extends AbstractC0913m> implements N0<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Transition<S>.d<T, V> f9443b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Lambda f9444c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Lambda f9445d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0121a(Transition<S>.d<T, V> dVar, Ia.l<? super b<S>, ? extends InterfaceC0923x<T>> lVar, Ia.l<? super S, ? extends T> lVar2) {
                this.f9443b = dVar;
                this.f9444c = (Lambda) lVar;
                this.f9445d = (Lambda) lVar2;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final void e(b<S> bVar) {
                Object objInvoke = this.f9445d.invoke(bVar.h());
                boolean zG = Transition.this.g();
                Transition<S>.d<T, V> dVar = this.f9443b;
                if (!zG) {
                    dVar.v((T) objInvoke, (InterfaceC0923x) this.f9444c.invoke(bVar));
                } else {
                    dVar.s((T) this.f9445d.invoke(bVar.c()), (T) objInvoke, (InterfaceC0923x) this.f9444c.invoke(bVar));
                }
            }

            @Override // androidx.compose.runtime.N0
            public final T getValue() {
                e(Transition.this.f());
                return this.f9443b.f9457k.getValue();
            }
        }

        public a(e0 e0Var, String str) {
            this.f9440a = e0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C0121a a(Ia.l lVar, Ia.l lVar2) {
            C1085f0 c1085f0 = this.f9441b;
            C0121a c0121a = (C0121a) c1085f0.getValue();
            Transition<S> transition = Transition.this;
            if (c0121a == null) {
                Object objInvoke = lVar2.invoke(transition.f9429a.a());
                Object objInvoke2 = lVar2.invoke(transition.f9429a.a());
                e0 e0Var = this.f9440a;
                AbstractC0913m abstractC0913m = (AbstractC0913m) e0Var.a().invoke(objInvoke2);
                abstractC0913m.d();
                Transition<S>.d<?, ?> dVar = transition.new d<>(objInvoke, abstractC0913m, e0Var);
                c0121a = new C0121a(dVar, lVar, lVar2);
                c1085f0.setValue(c0121a);
                transition.f9437i.add(dVar);
            }
            c0121a.f9445d = (Lambda) lVar2;
            c0121a.f9444c = (Lambda) lVar;
            c0121a.e(transition.f());
            return c0121a;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    public interface b<S> {
        S c();

        default boolean d(S s10, S s11) {
            return s10.equals(c()) && s11.equals(h());
        }

        S h();
    }

    /* JADX INFO: compiled from: Transition.kt */
    public static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S f9447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S f9448b;

        public c(S s10, S s11) {
            this.f9447a = s10;
            this.f9448b = s11;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public final S c() {
            return this.f9447a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f9447a, bVar.c())) {
                    if (kotlin.jvm.internal.i.a(this.f9448b, bVar.h())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public final S h() {
            return this.f9448b;
        }

        public final int hashCode() {
            S s10 = this.f9447a;
            int iHashCode = (s10 != null ? s10.hashCode() : 0) * 31;
            S s11 = this.f9448b;
            return iHashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    public final class d<T, V extends AbstractC0913m> implements N0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0<T, V> f9449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1085f0 f9450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1085f0 f9451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1085f0 f9452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SeekableTransitionState.a f9453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public U<T, V> f9454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C1085f0 f9455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C1079c0 f9456i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final C1085f0 f9457k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public V f9458l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C1083e0 f9459m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f9460n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final P f9461o;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Map] */
        public d(Object obj, AbstractC0913m abstractC0913m, d0 d0Var) {
            this.f9449b = d0Var;
            C1085f0 c1085f0F = J0.f(obj);
            this.f9450c = c1085f0F;
            T tInvoke = null;
            C1085f0 c1085f0F2 = J0.f(C0907g.c(0.0f, 0.0f, null, 7));
            this.f9451d = c1085f0F2;
            this.f9452e = J0.f(new U((InterfaceC0923x) c1085f0F2.getValue(), d0Var, obj, c1085f0F.getValue(), abstractC0913m));
            this.f9455h = J0.f(Boolean.TRUE);
            this.f9456i = new C1079c0(-1.0f);
            this.f9457k = J0.f(obj);
            this.f9458l = abstractC0913m;
            this.f9459m = new C1083e0(e().b());
            Float f10 = (Float) s0.f9633a.get(d0Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                V vInvoke = d0Var.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    vInvoke.e(fFloatValue, i10);
                }
                tInvoke = this.f9449b.b().invoke(vInvoke);
            }
            this.f9461o = C0907g.c(0.0f, 0.0f, tInvoke, 3);
        }

        public final U<T, V> e() {
            return (U) this.f9452e.getValue();
        }

        public final void g(long j) {
            if (this.f9456i.j() == -1.0f) {
                this.f9460n = true;
                if (kotlin.jvm.internal.i.a(e().f9470c, e().f9471d)) {
                    k(e().f9470c);
                } else {
                    k(e().f(j));
                    this.f9458l = (V) e().d(j);
                }
            }
        }

        @Override // androidx.compose.runtime.N0
        public final T getValue() {
            return this.f9457k.getValue();
        }

        public final void k(T t8) {
            this.f9457k.setValue(t8);
        }

        public final void q(T t8, boolean z10) {
            U<T, V> u10 = this.f9454g;
            T t10 = u10 != null ? u10.f9470c : null;
            C1085f0 c1085f0 = this.f9450c;
            boolean zA = kotlin.jvm.internal.i.a(t10, c1085f0.getValue());
            C1083e0 c1083e0 = this.f9459m;
            C1085f0 c1085f1 = this.f9452e;
            InterfaceC0923x interfaceC0923x = this.f9461o;
            if (zA) {
                c1085f1.setValue(new U(interfaceC0923x, this.f9449b, t8, t8, this.f9458l.c()));
                this.j = true;
                c1083e0.t(e().b());
                return;
            }
            C1085f0 c1085f2 = this.f9451d;
            if (!z10 || this.f9460n || (((InterfaceC0923x) c1085f2.getValue()) instanceof P)) {
                interfaceC0923x = (InterfaceC0923x) c1085f2.getValue();
            }
            Transition<S> transition = Transition.this;
            c1085f1.setValue(new U(transition.e() <= 0 ? interfaceC0923x : new Q(interfaceC0923x, transition.e()), this.f9449b, t8, c1085f0.getValue(), this.f9458l));
            c1083e0.t(e().b());
            this.j = false;
            Boolean bool = Boolean.TRUE;
            C1085f0 c1085f3 = transition.f9436h;
            c1085f3.setValue(bool);
            if (transition.g()) {
                SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = transition.f9437i;
                int size = snapshotStateList.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
                    jMax = Math.max(jMax, dVar.f9459m.b());
                    dVar.g(0L);
                }
                c1085f3.setValue(Boolean.FALSE);
            }
        }

        public final void s(T t8, T t10, InterfaceC0923x<T> interfaceC0923x) {
            this.f9450c.setValue(t10);
            this.f9451d.setValue(interfaceC0923x);
            if (kotlin.jvm.internal.i.a(e().f9471d, t8) && kotlin.jvm.internal.i.a(e().f9470c, t10)) {
                return;
            }
            q(t8, false);
        }

        public final String toString() {
            return "current value: " + this.f9457k.getValue() + ", target: " + this.f9450c.getValue() + ", spec: " + ((InterfaceC0923x) this.f9451d.getValue());
        }

        public final void v(T t8, InterfaceC0923x<T> interfaceC0923x) {
            if (this.j) {
                U<T, V> u10 = this.f9454g;
                if (kotlin.jvm.internal.i.a(t8, u10 != null ? u10.f9470c : null)) {
                    return;
                }
            }
            C1085f0 c1085f0 = this.f9450c;
            boolean zA = kotlin.jvm.internal.i.a(c1085f0.getValue(), t8);
            C1079c0 c1079c0 = this.f9456i;
            if (zA && c1079c0.j() == -1.0f) {
                return;
            }
            c1085f0.setValue(t8);
            this.f9451d.setValue(interfaceC0923x);
            T value = c1079c0.j() == -3.0f ? t8 : this.f9457k.getValue();
            C1085f0 c1085f1 = this.f9455h;
            q(value, !((Boolean) c1085f1.getValue()).booleanValue());
            c1085f1.setValue(Boolean.valueOf(c1079c0.j() == -3.0f));
            if (c1079c0.j() >= 0.0f) {
                k(e().f((long) (c1079c0.j() * e().b())));
            } else if (c1079c0.j() == -3.0f) {
                k(t8);
            }
            this.j = false;
            c1079c0.f(-1.0f);
        }
    }

    public Transition() {
        throw null;
    }

    public Transition(b0<S> b0Var, Transition<?> transition, String str) {
        this.f9429a = b0Var;
        this.f9430b = transition;
        this.f9431c = str;
        this.f9432d = J0.f(b0Var.a());
        this.f9433e = J0.f(new c(b0Var.a(), b0Var.a()));
        this.f9434f = new C1083e0(0L);
        this.f9435g = new C1083e0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f9436h = J0.f(bool);
        this.f9437i = new SnapshotStateList<>();
        this.j = new SnapshotStateList<>();
        this.f9438k = J0.f(bool);
        this.f9439l = J0.d(new Ia.a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // Ia.a
            public final Long invoke() {
                return Long.valueOf(this.this$0.b());
            }
        });
        b0Var.d(this);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final int i10, InterfaceC1084f interfaceC1084f, final Object obj) {
        int i11;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final kotlinx.coroutines.A a10;
        boolean zK;
        Object objF2;
        C1086g c1086gP = interfaceC1084f.p(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c1086gP.K(obj) : c1086gP.k(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.K(this) ? 32 : 16;
        }
        if (!c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            c1086gP.w();
        } else if (g()) {
            c1086gP.L(1824284987);
            c1086gP.T(false);
        } else {
            c1086gP.L(1822801203);
            p(obj);
            if (kotlin.jvm.internal.i.a(obj, this.f9429a.a())) {
                if ((this.f9435g.b() != Long.MIN_VALUE) || ((Boolean) this.f9436h.getValue()).booleanValue()) {
                    c1086gP.L(1823032494);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF);
                    }
                    a10 = (kotlinx.coroutines.A) objF;
                    zK = c1086gP.k(a10) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
                    objF2 = c1086gP.f();
                    if (zK) {
                        objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                            /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Transition.kt */
                            @Aa.c(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                float F$0;
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ Transition<Object> this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(Transition<Object> transition, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.this$0 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // Ia.p
                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    final float fH;
                                    kotlinx.coroutines.A a10;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) this.L$0;
                                        fH = T.h(a11.getCoroutineContext());
                                        a10 = a11;
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        fH = this.F$0;
                                        a10 = (kotlinx.coroutines.A) this.L$0;
                                        kotlin.b.b(obj);
                                    }
                                    while (kotlinx.coroutines.B.e(a10)) {
                                        final Transition<Object> transition = this.this$0;
                                        Ia.l<Long, p293xa.r> lVar = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                long jLongValue = l10.longValue();
                                                if (!transition.g()) {
                                                    Transition<Object> transition2 = transition;
                                                    float f10 = fH;
                                                    C1083e0 c1083e0 = transition2.f9435g;
                                                    if (c1083e0.b() == Long.MIN_VALUE) {
                                                        transition2.f9435g.t(jLongValue);
                                                        transition2.f9429a.f9525a.setValue(Boolean.TRUE);
                                                    }
                                                    long jB = jLongValue - c1083e0.b();
                                                    if (f10 != 0.0f) {
                                                        jB = Ka.a.c(jB / ((double) f10));
                                                    }
                                                    transition2.n(jB);
                                                    transition2.h(jB, f10 == 0.0f);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        this.L$0 = a10;
                                        this.F$0 = fH;
                                        this.label = 1;
                                        if (androidx.compose.runtime.P.a(getContext()).P0(lVar, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                                C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(this, null), 1);
                                return new V();
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                            /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Transition.kt */
                            @Aa.c(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
                            final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                                float F$0;
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ Transition<Object> this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(Transition<Object> transition, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                    super(2, cVar);
                                    this.this$0 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // Ia.p
                                public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                    return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    final float fH;
                                    kotlinx.coroutines.A a10;
                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                    int i10 = this.label;
                                    if (i10 == 0) {
                                        kotlin.b.b(obj);
                                        kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) this.L$0;
                                        fH = T.h(a11.getCoroutineContext());
                                        a10 = a11;
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        fH = this.F$0;
                                        a10 = (kotlinx.coroutines.A) this.L$0;
                                        kotlin.b.b(obj);
                                    }
                                    while (kotlinx.coroutines.B.e(a10)) {
                                        final Transition<Object> transition = this.this$0;
                                        Ia.l<Long, p293xa.r> lVar = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(Long l10) {
                                                long jLongValue = l10.longValue();
                                                if (!transition.g()) {
                                                    Transition<Object> transition2 = transition;
                                                    float f10 = fH;
                                                    C1083e0 c1083e0 = transition2.f9435g;
                                                    if (c1083e0.b() == Long.MIN_VALUE) {
                                                        transition2.f9435g.t(jLongValue);
                                                        transition2.f9429a.f9525a.setValue(Boolean.TRUE);
                                                    }
                                                    long jB = jLongValue - c1083e0.b();
                                                    if (f10 != 0.0f) {
                                                        jB = Ka.a.c(jB / ((double) f10));
                                                    }
                                                    transition2.n(jB);
                                                    transition2.h(jB, f10 == 0.0f);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        this.L$0 = a10;
                                        this.F$0 = fH;
                                        this.label = 1;
                                        if (androidx.compose.runtime.P.a(getContext()).P0(lVar, this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                                C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(this, null), 1);
                                return new V();
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    androidx.compose.runtime.E.b(a10, this, (Ia.l) objF2, c1086gP);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1824275067);
                    c1086gP.T(false);
                }
            } else {
                c1086gP.L(1823032494);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF);
                }
                a10 = (kotlinx.coroutines.A) objF;
                zK = c1086gP.k(a10) | ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
                objF2 = c1086gP.f();
                if (zK || objF2 == c0153a) {
                    objF2 = new Ia.l<androidx.compose.runtime.B, androidx.compose.runtime.A>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1

                        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Transition.kt */
                        @Aa.c(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1192}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            float F$0;
                            private /* synthetic */ Object L$0;
                            int label;
                            final /* synthetic */ Transition<Object> this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(Transition<Object> transition, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.this$0 = transition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // Ia.p
                            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                final float fH;
                                kotlinx.coroutines.A a10;
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                int i10 = this.label;
                                if (i10 == 0) {
                                    kotlin.b.b(obj);
                                    kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) this.L$0;
                                    fH = T.h(a11.getCoroutineContext());
                                    a10 = a11;
                                } else {
                                    if (i10 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    fH = this.F$0;
                                    a10 = (kotlinx.coroutines.A) this.L$0;
                                    kotlin.b.b(obj);
                                }
                                while (kotlinx.coroutines.B.e(a10)) {
                                    final Transition<Object> transition = this.this$0;
                                    Ia.l<Long, p293xa.r> lVar = new Ia.l<Long, p293xa.r>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(Long l10) {
                                            long jLongValue = l10.longValue();
                                            if (!transition.g()) {
                                                Transition<Object> transition2 = transition;
                                                float f10 = fH;
                                                C1083e0 c1083e0 = transition2.f9435g;
                                                if (c1083e0.b() == Long.MIN_VALUE) {
                                                    transition2.f9435g.t(jLongValue);
                                                    transition2.f9429a.f9525a.setValue(Boolean.TRUE);
                                                }
                                                long jB = jLongValue - c1083e0.b();
                                                if (f10 != 0.0f) {
                                                    jB = Ka.a.c(jB / ((double) f10));
                                                }
                                                transition2.n(jB);
                                                transition2.h(jB, f10 == 0.0f);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    this.L$0 = a10;
                                    this.F$0 = fH;
                                    this.label = 1;
                                    if (androidx.compose.runtime.P.a(getContext()).P0(lVar, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final androidx.compose.runtime.A invoke(androidx.compose.runtime.B b10) {
                            C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(this, null), 1);
                            return new V();
                        }
                    };
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.b(a10, this, (Ia.l) objF2, c1086gP);
                c1086gP.T(false);
            }
            c1086gP.T(false);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
                final /* synthetic */ Transition<S> $tmp1_rcvr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp1_rcvr = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    Transition<S> transition = this.$tmp1_rcvr;
                    S s10 = obj;
                    transition.a(L4.b.l(i10 | 1), interfaceC1084f2, s10);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public final long b() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, snapshotStateList.get(i10).f9459m.b());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i11).b());
        }
        return jMax;
    }

    public final void c() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            dVar.f9454g = null;
            dVar.f9453f = null;
            dVar.j = false;
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).c();
        }
    }

    public final boolean d() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (snapshotStateList.get(i10).f9453f != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (snapshotStateList2.get(i11).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        Transition<?> transition = this.f9430b;
        return transition != null ? transition.e() : this.f9434f.b();
    }

    public final b<S> f() {
        return (b) this.f9433e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        return ((Boolean) this.f9438k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [V extends androidx.compose.animation.core.m, androidx.compose.animation.core.m] */
    public final void h(long j, boolean z10) {
        C1083e0 c1083e0 = this.f9435g;
        long jB = c1083e0.b();
        b0<S> b0Var = this.f9429a;
        if (jB == Long.MIN_VALUE) {
            c1083e0.t(j);
            b0Var.f9525a.setValue(Boolean.TRUE);
        } else if (!((Boolean) b0Var.f9525a.getValue()).booleanValue()) {
            b0Var.f9525a.setValue(Boolean.TRUE);
        }
        this.f9436h.setValue(Boolean.FALSE);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            boolean zBooleanValue = ((Boolean) dVar.f9455h.getValue()).booleanValue();
            C1085f0 c1085f0 = dVar.f9455h;
            if (!zBooleanValue) {
                long jB2 = z10 ? dVar.e().b() : j;
                dVar.k(dVar.e().f(jB2));
                dVar.f9458l = dVar.e().d(jB2);
                if (dVar.e().e(jB2)) {
                    c1085f0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c1085f0.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            T value = transition.f9432d.getValue();
            b0<?> b0Var2 = transition.f9429a;
            if (!kotlin.jvm.internal.i.a(value, b0Var2.a())) {
                transition.h(j, z10);
            }
            if (!kotlin.jvm.internal.i.a(transition.f9432d.getValue(), b0Var2.a())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        this.f9435g.t(Long.MIN_VALUE);
        b0<S> b0Var = this.f9429a;
        if (b0Var instanceof K) {
            b0Var.c(this.f9432d.getValue());
        }
        n(0L);
        b0Var.f9525a.setValue(Boolean.FALSE);
        SnapshotStateList<Transition<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(float f10) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            dVar.getClass();
            if (f10 == -4.0f || f10 == -5.0f) {
                U<?, V> u10 = dVar.f9454g;
                if (u10 != 0) {
                    dVar.e().h(u10.f9470c);
                    dVar.f9453f = null;
                    dVar.f9454g = null;
                }
                Object obj = f10 == -4.0f ? dVar.e().f9471d : dVar.e().f9470c;
                dVar.e().h(obj);
                dVar.e().i(obj);
                dVar.k(obj);
                dVar.f9459m.t(dVar.e().b());
            } else {
                dVar.f9456i.f(f10);
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).j(f10);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f9435g.t(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        b0<S> b0Var = this.f9429a;
        b0Var.f9525a.setValue(bool);
        boolean zG = g();
        C1085f0 c1085f0 = this.f9432d;
        if (!zG || !kotlin.jvm.internal.i.a(b0Var.a(), obj) || !kotlin.jvm.internal.i.a(c1085f0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.i.a(b0Var.a(), obj) && (b0Var instanceof K)) {
                b0Var.c(obj);
            }
            c1085f0.setValue(obj2);
            this.f9438k.setValue(Boolean.TRUE);
            this.f9433e.setValue(new c(obj, obj2));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<?> transition = snapshotStateList.get(i10);
            kotlin.jvm.internal.i.c(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.g()) {
                transition.k(transition.f9429a.a(), transition.f9432d.getValue());
            }
        }
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList2 = this.f9437i;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).g(0L);
        }
    }

    public final void l(long j) {
        C1083e0 c1083e0 = this.f9435g;
        if (c1083e0.b() == Long.MIN_VALUE) {
            c1083e0.t(j);
        }
        n(j);
        this.f9436h.setValue(Boolean.FALSE);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).g(j);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Transition<?> transition = snapshotStateList2.get(i11);
            if (!kotlin.jvm.internal.i.a(transition.f9432d.getValue(), transition.f9429a.a())) {
                transition.l(j);
            }
        }
    }

    public final void m(SeekableTransitionState.a aVar) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            if (!kotlin.jvm.internal.i.a(dVar.e().f9470c, dVar.e().f9471d)) {
                dVar.f9454g = dVar.e();
                dVar.f9453f = aVar;
            }
            C1085f0 c1085f0 = dVar.f9457k;
            dVar.f9452e.setValue(new U(dVar.f9461o, dVar.f9449b, c1085f0.getValue(), c1085f0.getValue(), dVar.f9458l.c()));
            dVar.f9459m.t(dVar.e().b());
            dVar.j = true;
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).m(aVar);
        }
    }

    public final void n(long j) {
        if (this.f9430b == null) {
            this.f9434f.t(j);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o() {
        InterfaceC0903c interfaceC0903c;
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i10);
            SeekableTransitionState.a aVar = dVar.f9453f;
            if (aVar != null && (interfaceC0903c = dVar.f9454g) != null) {
                long jC = Ka.a.c(aVar.f9426g * ((double) aVar.f9423d));
                Object objF = interfaceC0903c.f(jC);
                if (dVar.j) {
                    dVar.e().i(objF);
                }
                dVar.e().h(objF);
                dVar.f9459m.t(dVar.e().b());
                if (dVar.f9456i.j() == -2.0f || dVar.j) {
                    dVar.k(objF);
                } else {
                    dVar.g(Transition.this.e());
                }
                if (jC >= aVar.f9426g) {
                    dVar.f9453f = null;
                    dVar.f9454g = null;
                } else {
                    aVar.f9422c = false;
                }
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            snapshotStateList2.get(i11).o();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(S s10) {
        C1085f0 c1085f0 = this.f9432d;
        if (kotlin.jvm.internal.i.a(c1085f0.getValue(), s10)) {
            return;
        }
        this.f9433e.setValue(new c(c1085f0.getValue(), s10));
        b0<S> b0Var = this.f9429a;
        if (!kotlin.jvm.internal.i.a(b0Var.a(), c1085f0.getValue())) {
            b0Var.c(c1085f0.getValue());
        }
        c1085f0.setValue(s10);
        if (this.f9435g.b() == Long.MIN_VALUE) {
            this.f9436h.setValue(Boolean.TRUE);
        }
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            snapshotStateList.get(i10).f9456i.f(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this.f9437i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + snapshotStateList.get(i10) + ", ";
        }
        return str;
    }
}
