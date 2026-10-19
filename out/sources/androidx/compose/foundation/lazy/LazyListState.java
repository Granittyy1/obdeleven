package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.u;
import androidx.compose.foundation.lazy.layout.C0968c;
import androidx.compose.foundation.lazy.layout.C0973h;
import androidx.compose.foundation.lazy.layout.D;
import androidx.compose.foundation.lazy.layout.G;
import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.Q;
import androidx.compose.foundation.lazy.layout.S;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.Z;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyListState implements u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W.f f10350w = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // Ia.p
        public final List<? extends Integer> invoke(androidx.compose.runtime.saveable.j jVar, LazyListState lazyListState) {
            LazyListState lazyListState2 = lazyListState;
            return kotlin.collections.l.s(Integer.valueOf(lazyListState2.h()), Integer.valueOf(lazyListState2.i()));
        }
    }, new Ia.l<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // Ia.l
        public final LazyListState invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new LazyListState(list2.get(0).intValue(), list2.get(1).intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f10353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f10354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f10355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f10356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DefaultScrollableState f10358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10359i;
    public LayoutNode j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f10360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0968c f10361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LazyLayoutItemAnimator<m> f10362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0973h f10363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H f10364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f10365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f10366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X<p293xa.r> f10367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f10368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f10369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final X<p293xa.r> f10370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f10371v;

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class a {
        public a() {
        }
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    public static final class b implements a0 {
        public b() {
        }

        @Override // androidx.compose.ui.layout.a0
        public final void s(LayoutNode layoutNode) {
            LazyListState.this.j = layoutNode;
        }
    }

    public LazyListState() {
        this(0, 0, new androidx.compose.foundation.lazy.a(2));
    }

    public static Object k(LazyListState lazyListState, int i10, SuspendLambda suspendLambda) {
        lazyListState.getClass();
        Object objB = lazyListState.b(MutatePriority.f9810b, new LazyListState$scrollToItem$2(lazyListState, i10, 0, null), suspendLambda);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return this.f10358h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        LazyListState$scroll$1 lazyListState$scroll$1;
        LazyListState lazyListState;
        if (cVar instanceof LazyListState$scroll$1) {
            lazyListState$scroll$1 = (LazyListState$scroll$1) cVar;
            int i10 = lazyListState$scroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lazyListState$scroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                lazyListState$scroll$1 = new LazyListState$scroll$1(this, cVar);
            }
        } else {
            lazyListState$scroll$1 = new LazyListState$scroll$1(this, cVar);
        }
        Object obj = lazyListState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = lazyListState$scroll$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (Ia.p) lazyListState$scroll$1.L$2;
                mutatePriority = (MutatePriority) lazyListState$scroll$1.L$1;
                lazyListState = (LazyListState) lazyListState$scroll$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        lazyListState$scroll$1.L$0 = this;
        lazyListState$scroll$1.L$1 = mutatePriority;
        lazyListState$scroll$1.L$2 = pVar;
        lazyListState$scroll$1.label = 1;
        if (this.f10361l.a(lazyListState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lazyListState = this;
        DefaultScrollableState defaultScrollableState = lazyListState.f10358h;
        lazyListState$scroll$1.L$0 = null;
        lazyListState$scroll$1.L$1 = null;
        lazyListState$scroll$1.L$2 = null;
        lazyListState$scroll$1.label = 2;
        if (defaultScrollableState.b(mutatePriority, pVar, lazyListState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean c() {
        return ((Boolean) this.f10369t.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean d() {
        return ((Boolean) this.f10368s.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return this.f10358h.e(f10);
    }

    public final Object f(int i10, int i11, SuspendLambda suspendLambda) {
        Object objB = b(MutatePriority.f9810b, new LazyListState$animateScrollToItem$2(this, i10, i11, null), suspendLambda);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    public final void g(l lVar, boolean z10, boolean z11) {
        if (!z10 && this.f10352b) {
            this.f10353c = lVar;
            return;
        }
        if (z10) {
            this.f10352b = true;
        }
        m mVar = lVar.f10552a;
        int i10 = mVar != null ? mVar.f10746a : 0;
        int i11 = lVar.f10553b;
        this.f10369t.setValue(Boolean.valueOf((i10 == 0 && i11 == 0) ? false : true));
        this.f10368s.setValue(Boolean.valueOf(lVar.f10554c));
        this.f10357g -= lVar.f10555d;
        this.f10355e.setValue(lVar);
        q qVar = this.f10354d;
        if (z11) {
            qVar.getClass();
            if (i11 < 0.0f) {
                p245u.c.c("scrollOffset should be non-negative");
            }
            ((C1081d0) qVar.f10775c).m(i11);
        } else {
            qVar.getClass();
            qVar.f10776d = mVar != null ? mVar.f10756l : null;
            if (qVar.f10773a || lVar.f10564n > 0) {
                qVar.f10773a = true;
                if (i11 < 0.0f) {
                    p245u.c.c("scrollOffset should be non-negative");
                }
                qVar.a(mVar != null ? mVar.f10746a : 0, i11);
            }
            if (this.f10359i) {
                this.f10351a.c(lVar);
            }
        }
        if (z10) {
            this.f10371v.a(lVar.f10557f, lVar.f10560i, lVar.f10559h);
        }
    }

    public final int h() {
        return ((C1081d0) this.f10354d.f10774b).o();
    }

    public final int i() {
        return ((C1081d0) this.f10354d.f10775c).o();
    }

    public final k j() {
        return (k) this.f10355e.getValue();
    }

    public final void l(int i10, int i11) {
        q qVar = this.f10354d;
        if (((C1081d0) qVar.f10774b).o() != i10 || ((C1081d0) qVar.f10775c).o() != i11) {
            LazyLayoutItemAnimator<m> lazyLayoutItemAnimator = this.f10362m;
            lazyLayoutItemAnimator.e();
            lazyLayoutItemAnimator.f10627b = null;
            lazyLayoutItemAnimator.f10628c = -1;
        }
        qVar.a(i10, i11);
        qVar.f10776d = null;
        LayoutNode layoutNode = this.j;
        if (layoutNode != null) {
            layoutNode.j();
        }
    }

    public LazyListState(int i10, int i11) {
        this(i10, i11, new androidx.compose.foundation.lazy.a(2));
    }

    public LazyListState(final int i10, int i11, o oVar) {
        this.f10351a = oVar;
        q qVar = new q();
        qVar.f10774b = new C1081d0(i10);
        qVar.f10775c = new C1081d0(i11);
        qVar.f10777e = new D(i10, 30, 100);
        this.f10354d = qVar;
        this.f10355e = new C1085f0(s.f10780a, Z.f12934a);
        this.f10356f = new androidx.compose.foundation.interaction.l();
        this.f10358h = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final Float invoke(Float f10) {
                l lVar;
                float fFloatValue = f10.floatValue();
                LazyListState lazyListState = this.this$0;
                float f11 = -fFloatValue;
                if ((f11 >= 0.0f || lazyListState.d()) && (f11 <= 0.0f || lazyListState.c())) {
                    if (Math.abs(lazyListState.f10357g) > 0.5f) {
                        p245u.c.c("entered drag with non-zero pending scroll");
                    }
                    float f12 = lazyListState.f10357g + f11;
                    lazyListState.f10357g = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = lazyListState.f10357g;
                        int iRound = Math.round(f13);
                        l lVarI = ((l) lazyListState.f10355e.getValue()).i(iRound, !lazyListState.f10352b);
                        if (lVarI != null && (lVar = lazyListState.f10353c) != null) {
                            l lVarI2 = lVar.i(iRound, true);
                            if (lVarI2 != null) {
                                lazyListState.f10353c = lVarI2;
                            } else {
                                lVarI = null;
                            }
                        }
                        o oVar2 = lazyListState.f10351a;
                        LazyListState.a aVar = lazyListState.f10365p;
                        if (lVarI != null) {
                            lazyListState.g(lVarI, lazyListState.f10352b, true);
                            S.b(lazyListState.f10370u);
                            float f14 = f13 - lazyListState.f10357g;
                            if (lazyListState.f10359i) {
                                oVar2.b(aVar, f14, lVarI);
                            }
                        } else {
                            LayoutNode layoutNode = lazyListState.j;
                            if (layoutNode != null) {
                                layoutNode.j();
                            }
                            float f15 = f13 - lazyListState.f10357g;
                            k kVarJ = lazyListState.j();
                            if (lazyListState.f10359i) {
                                oVar2.b(aVar, f15, kVarJ);
                            }
                        }
                    }
                    if (Math.abs(lazyListState.f10357g) > 0.5f) {
                        f11 -= lazyListState.f10357g;
                        lazyListState.f10357g = 0.0f;
                    }
                } else {
                    f11 = 0.0f;
                }
                return Float.valueOf(-f11);
            }
        });
        this.f10359i = true;
        this.f10360k = new b();
        this.f10361l = new C0968c();
        this.f10362m = new LazyLayoutItemAnimator<>();
        this.f10363n = new C0973h();
        oVar.getClass();
        this.f10364o = new H(null, new Ia.l<Q, p293xa.r>() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Q q10) {
                Q q11 = q10;
                o oVar2 = this.this$0.f10351a;
                int i12 = i10;
                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                androidx.compose.runtime.snapshots.g.a.d(gVarA, androidx.compose.runtime.snapshots.g.a.b(gVarA), gVarA != null ? gVarA.e() : null);
                oVar2.a(q11, i12);
                return p293xa.r.f47939a;
            }
        });
        this.f10365p = new a();
        this.f10366q = new G();
        this.f10367r = S.a();
        Boolean bool = Boolean.FALSE;
        this.f10368s = J0.f(bool);
        this.f10369t = J0.f(bool);
        this.f10370u = S.a();
        this.f10371v = new LazyLayoutScrollDeltaBetweenPasses();
    }
}
