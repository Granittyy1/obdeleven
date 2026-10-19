package androidx.compose.animation.core;

import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.sync.MutexImpl;
import p141l2.C2749t;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SeekableTransitionState<S> extends b0<S> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0909i f9403r = new C0909i(0.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0909i f9404s = new C0909i(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f9405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f9406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S f9407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Transition<S> f9408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9409f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2693i f9412i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f9416n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f9418p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<p293xa.r> f9410g = new Ia.a<p293xa.r>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
        final /* synthetic */ SeekableTransitionState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // Ia.a
        public final p293xa.r invoke() {
            SeekableTransitionState<Object> seekableTransitionState = this.this$0;
            Transition<Object> transition = seekableTransitionState.f9408e;
            seekableTransitionState.f9409f = transition != null ? ((Number) transition.f9439l.getValue()).longValue() : 0L;
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1079c0 f9411h = new C1079c0(0.0f);
    public final MutexImpl j = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L f9413k = new L();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9414l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.collection.I<a> f9415m = new androidx.collection.I<>((Object) null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Ia.l<Long, p293xa.r> f9417o = new Ia.l<Long, p293xa.r>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
        final /* synthetic */ SeekableTransitionState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.this$0 = this;
        }

        @Override // Ia.l
        public final p293xa.r invoke(Long l10) {
            this.this$0.f9414l = l10.longValue();
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Ia.l<Long, p293xa.r> f9419q = new Ia.l<Long, p293xa.r>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
        final /* synthetic */ SeekableTransitionState<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.this$0 = this;
        }

        @Override // Ia.l
        public final p293xa.r invoke(Long l10) {
            long jLongValue = l10.longValue();
            SeekableTransitionState<Object> seekableTransitionState = this.this$0;
            long j = jLongValue - seekableTransitionState.f9414l;
            seekableTransitionState.f9414l = jLongValue;
            long jC = Ka.a.c(j / ((double) seekableTransitionState.f9418p));
            if (this.this$0.f9415m.e()) {
                SeekableTransitionState<Object> seekableTransitionState2 = this.this$0;
                androidx.collection.I<SeekableTransitionState.a> i10 = seekableTransitionState2.f9415m;
                Object[] objArr = i10.f9108a;
                int i11 = i10.f9109b;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    SeekableTransitionState.a aVar = (SeekableTransitionState.a) objArr[i13];
                    SeekableTransitionState.g(seekableTransitionState2, aVar, jC);
                    aVar.f9422c = true;
                }
                Transition<Object> transition = this.this$0.f9408e;
                if (transition != null) {
                    transition.o();
                }
                androidx.collection.I<SeekableTransitionState.a> i14 = this.this$0.f9415m;
                int i15 = i14.f9109b;
                Object[] objArr2 = i14.f9108a;
                Na.i iVarJ = Na.l.J(0, i15);
                int i16 = iVarJ.f4687b;
                int i17 = iVarJ.f4688c;
                if (i16 <= i17) {
                    while (true) {
                        objArr2[i16 - i12] = objArr2[i16];
                        if (((SeekableTransitionState.a) objArr2[i16]).f9422c) {
                            i12++;
                        }
                        if (i16 == i17) {
                            break;
                        }
                        i16++;
                    }
                }
                Q3.d.w(objArr2, null, i15 - i12, i15);
                i14.f9109b -= i12;
            }
            SeekableTransitionState<Object> seekableTransitionState3 = this.this$0;
            SeekableTransitionState.a aVar2 = seekableTransitionState3.f9416n;
            if (aVar2 != null) {
                aVar2.f9426g = seekableTransitionState3.f9409f;
                SeekableTransitionState.g(seekableTransitionState3, aVar2, jC);
                this.this$0.p(aVar2.f9423d);
                if (aVar2.f9423d == 1.0f) {
                    this.this$0.f9416n = null;
                }
                this.this$0.o();
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: compiled from: Transition.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f9420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j0 f9421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f9423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0909i f9424e = new C0909i(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C0909i f9425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f9426g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f9427h;

        public final String toString() {
            return "progress nanos: " + this.f9420a + ", animationSpec: " + this.f9421b + ", isComplete: " + this.f9422c + ", value: " + this.f9423d + ", start: " + this.f9424e + ", initialVelocity: " + this.f9425f + ", durationNanos: " + this.f9426g + ", animationSpecDuration: " + this.f9427h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeekableTransitionState(C2749t c2749t) {
        this.f9405b = J0.f(c2749t);
        this.f9406c = J0.f(c2749t);
        this.f9407d = c2749t;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public static final void f(SeekableTransitionState seekableTransitionState) {
        Transition<S> transition = seekableTransitionState.f9408e;
        if (transition == null) {
            return;
        }
        a aVar = seekableTransitionState.f9416n;
        if (aVar == null) {
            if (seekableTransitionState.f9409f > 0) {
                C1079c0 c1079c0 = seekableTransitionState.f9411h;
                if (c1079c0.j() == 1.0f || kotlin.jvm.internal.i.a(seekableTransitionState.f9406c.getValue(), seekableTransitionState.f9405b.getValue())) {
                    aVar = null;
                } else {
                    a aVar2 = new a();
                    aVar2.f9423d = c1079c0.j();
                    long j = seekableTransitionState.f9409f;
                    aVar2.f9426g = j;
                    aVar2.f9427h = Ka.a.c((1.0d - ((double) c1079c0.j())) * j);
                    aVar2.f9424e.e(c1079c0.j(), 0);
                    aVar = aVar2;
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.f9426g = seekableTransitionState.f9409f;
            seekableTransitionState.f9415m.g(aVar);
            transition.m(aVar);
        }
        seekableTransitionState.f9416n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(SeekableTransitionState seekableTransitionState, a aVar, long j) {
        seekableTransitionState.getClass();
        long j10 = aVar.f9420a + j;
        aVar.f9420a = j10;
        long j11 = aVar.f9427h;
        if (j10 >= j11) {
            aVar.f9423d = 1.0f;
            return;
        }
        j0 j0Var = aVar.f9421b;
        if (j0Var == null) {
            float f10 = j10 / j11;
            aVar.f9423d = (f10 * 1.0f) + ((1 - f10) * aVar.f9424e.a(0));
            return;
        }
        C0909i c0909i = aVar.f9425f;
        if (c0909i == null) {
            c0909i = f9403r;
        }
        aVar.f9423d = Na.l.C(((C0909i) j0Var.f(j10, aVar.f9424e, f9404s, c0909i)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object h(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        seekableTransitionState.getClass();
        if (continuationImpl instanceof SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (SeekableTransitionState$runAnimations$1) continuationImpl;
            int i10 = seekableTransitionState$runAnimations$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$runAnimations$1.label = i10 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(seekableTransitionState, continuationImpl);
            }
        } else {
            seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(seekableTransitionState, continuationImpl);
        }
        Object obj = seekableTransitionState$runAnimations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = seekableTransitionState$runAnimations$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            if (seekableTransitionState.f9415m.d() && seekableTransitionState.f9416n == null) {
                return p293xa.r.f47939a;
            }
            if (T.h(seekableTransitionState$runAnimations$1.getContext()) == 0.0f) {
                seekableTransitionState.m();
                seekableTransitionState.f9414l = Long.MIN_VALUE;
                return p293xa.r.f47939a;
            }
            if (seekableTransitionState.f9414l == Long.MIN_VALUE) {
                Ia.l<Long, p293xa.r> lVar = seekableTransitionState.f9417o;
                seekableTransitionState$runAnimations$1.L$0 = seekableTransitionState;
                seekableTransitionState$runAnimations$1.label = 1;
                if (androidx.compose.runtime.P.a(seekableTransitionState$runAnimations$1.getContext()).P0(lVar, seekableTransitionState$runAnimations$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            seekableTransitionState = (SeekableTransitionState) seekableTransitionState$runAnimations$1.L$0;
            kotlin.b.b(obj);
        }
        do {
            if (!seekableTransitionState.f9415m.e() && seekableTransitionState.f9416n == null) {
                seekableTransitionState.f9414l = Long.MIN_VALUE;
                return p293xa.r.f47939a;
            }
            seekableTransitionState$runAnimations$1.L$0 = seekableTransitionState;
            seekableTransitionState$runAnimations$1.label = 2;
        } while (seekableTransitionState.k(seekableTransitionState$runAnimations$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object i(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        Object value;
        SeekableTransitionState seekableTransitionState2;
        Object obj;
        seekableTransitionState.getClass();
        if (continuationImpl instanceof SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (SeekableTransitionState$waitForComposition$1) continuationImpl;
            int i10 = seekableTransitionState$waitForComposition$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForComposition$1.label = i10 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(seekableTransitionState, continuationImpl);
            }
        } else {
            seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(seekableTransitionState, continuationImpl);
        }
        Object obj2 = seekableTransitionState$waitForComposition$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = seekableTransitionState$waitForComposition$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                Object obj3 = seekableTransitionState$waitForComposition$1.L$1;
                SeekableTransitionState seekableTransitionState3 = (SeekableTransitionState) seekableTransitionState$waitForComposition$1.L$0;
                kotlin.b.b(obj2);
                value = obj3;
                seekableTransitionState = seekableTransitionState3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = seekableTransitionState$waitForComposition$1.L$1;
                seekableTransitionState2 = (SeekableTransitionState) seekableTransitionState$waitForComposition$1.L$0;
                kotlin.b.b(obj2);
            }
            if (kotlin.jvm.internal.i.a(obj2, obj)) {
                return p293xa.r.f47939a;
            }
            seekableTransitionState2.f9414l = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        kotlin.b.b(obj2);
        value = seekableTransitionState.f9405b.getValue();
        seekableTransitionState$waitForComposition$1.L$0 = seekableTransitionState;
        seekableTransitionState$waitForComposition$1.L$1 = value;
        seekableTransitionState$waitForComposition$1.label = 1;
        if (seekableTransitionState.j.f(null, seekableTransitionState$waitForComposition$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        seekableTransitionState$waitForComposition$1.L$0 = seekableTransitionState;
        seekableTransitionState$waitForComposition$1.L$1 = value;
        seekableTransitionState$waitForComposition$1.label = 2;
        C2693i c2693i = new C2693i(1, A8.p.y(seekableTransitionState$waitForComposition$1));
        c2693i.s();
        seekableTransitionState.f9412i = c2693i;
        seekableTransitionState.j.g(null);
        Object objP = c2693i.p();
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        seekableTransitionState2 = seekableTransitionState;
        obj = value;
        obj2 = objP;
        if (kotlin.jvm.internal.i.a(obj2, obj)) {
            return p293xa.r.f47939a;
        }
        seekableTransitionState2.f9414l = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0096, please report this as an issue */
    public static final Object j(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        SeekableTransitionState seekableTransitionState2;
        Object obj;
        SeekableTransitionState seekableTransitionState3;
        seekableTransitionState.getClass();
        if (continuationImpl instanceof SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) continuationImpl;
            int i10 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = i10 - Integer.MIN_VALUE;
            } else {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(seekableTransitionState, continuationImpl);
            }
        } else {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(seekableTransitionState, continuationImpl);
        }
        Object objP = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$1;
                seekableTransitionState2 = (SeekableTransitionState) seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                kotlin.b.b(objP);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$1;
                seekableTransitionState3 = (SeekableTransitionState) seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
                kotlin.b.b(objP);
            }
            if (!kotlin.jvm.internal.i.a(objP, obj)) {
                seekableTransitionState3.f9414l = Long.MIN_VALUE;
                throw new CancellationException("snapTo() was canceled because state was changed to " + objP + " instead of " + obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(objP);
        Object value = seekableTransitionState.f9405b.getValue();
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = seekableTransitionState;
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$1 = value;
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 1;
        if (seekableTransitionState.j.f(null, seekableTransitionState$waitForCompositionAfterTargetStateChange$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        seekableTransitionState2 = seekableTransitionState;
        obj = value;
        boolean zA = kotlin.jvm.internal.i.a(obj, seekableTransitionState2.f9407d);
        MutexImpl mutexImpl = seekableTransitionState2.j;
        if (zA) {
            mutexImpl.g(null);
        } else {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = seekableTransitionState2;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$1 = obj;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 2;
            C2693i c2693i = new C2693i(1, A8.p.y(seekableTransitionState$waitForCompositionAfterTargetStateChange$1));
            c2693i.s();
            seekableTransitionState2.f9412i = c2693i;
            mutexImpl.g(null);
            objP = c2693i.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
            seekableTransitionState3 = seekableTransitionState2;
            if (!kotlin.jvm.internal.i.a(objP, obj)) {
                seekableTransitionState3.f9414l = Long.MIN_VALUE;
                throw new CancellationException("snapTo() was canceled because state was changed to " + objP + " instead of " + obj);
            }
        }
        return p293xa.r.f47939a;
    }

    public static Object l(SeekableTransitionState seekableTransitionState, Object obj, kotlin.coroutines.c cVar) {
        Transition<S> transition = seekableTransitionState.f9408e;
        if (transition == null) {
            return p293xa.r.f47939a;
        }
        Object objA = L.a(seekableTransitionState.f9413k, new SeekableTransitionState$animateTo$2(null, seekableTransitionState, transition, obj, null), cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    @Override // androidx.compose.animation.core.b0
    public final S a() {
        return (S) this.f9406c.getValue();
    }

    @Override // androidx.compose.animation.core.b0
    public final S b() {
        return (S) this.f9405b.getValue();
    }

    @Override // androidx.compose.animation.core.b0
    public final void c(S s10) {
        this.f9406c.setValue(s10);
    }

    @Override // androidx.compose.animation.core.b0
    public final void d(Transition<S> transition) {
        Transition<S> transition2 = this.f9408e;
        if (!(transition2 == null || kotlin.jvm.internal.i.a(transition, transition2))) {
            M.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f9408e + ", new instance: " + transition);
        }
        this.f9408e = transition;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xa.g] */
    @Override // androidx.compose.animation.core.b0
    public final void e() {
        this.f9408e = null;
        ((SnapshotStateObserver) TransitionKt.f9464b.getValue()).c(this);
    }

    public final Object k(ContinuationImpl continuationImpl) {
        float fH = T.h(continuationImpl.getContext());
        if (fH <= 0.0f) {
            m();
            return p293xa.r.f47939a;
        }
        this.f9418p = fH;
        Object objP0 = androidx.compose.runtime.P.a(continuationImpl.getContext()).P0(this.f9419q, continuationImpl);
        return objP0 == CoroutineSingletons.f43038b ? objP0 : p293xa.r.f47939a;
    }

    public final void m() {
        Transition<S> transition = this.f9408e;
        if (transition != null) {
            transition.c();
        }
        this.f9415m.i();
        if (this.f9416n != null) {
            this.f9416n = null;
            p(1.0f);
            o();
        }
    }

    public final Object n(float f10, Object obj, SuspendLambda suspendLambda) {
        if (0.0f > f10 || f10 > 1.0f) {
            M.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        Transition<S> transition = this.f9408e;
        if (transition == null) {
            return p293xa.r.f47939a;
        }
        Object objA = L.a(this.f9413k, new SeekableTransitionState$seekTo$3(obj, this.f9405b.getValue(), this, transition, f10, null), suspendLambda);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    public final void o() {
        Transition<S> transition = this.f9408e;
        if (transition == null) {
            return;
        }
        transition.l(Ka.a.c(((double) this.f9411h.j()) * ((Number) transition.f9439l.getValue()).longValue()));
    }

    public final void p(float f10) {
        this.f9411h.f(f10);
    }

    public final Object q(S s10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Transition<S> transition = this.f9408e;
        if (transition == null) {
            return p293xa.r.f47939a;
        }
        if (kotlin.jvm.internal.i.a(this.f9406c.getValue(), s10) && kotlin.jvm.internal.i.a(this.f9405b.getValue(), s10)) {
            return p293xa.r.f47939a;
        }
        Object objA = L.a(this.f9413k, new SeekableTransitionState$snapTo$2(this, s10, transition, null), cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }
}
