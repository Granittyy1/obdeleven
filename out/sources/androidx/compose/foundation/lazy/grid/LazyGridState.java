package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.lazy.layout.C0968c;
import androidx.compose.foundation.lazy.layout.C0973h;
import androidx.compose.foundation.lazy.layout.G;
import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.Q;
import androidx.compose.foundation.lazy.layout.S;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.Z;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyGridState implements androidx.compose.foundation.gestures.u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W.f f10416w = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, LazyGridState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$1
        @Override // Ia.p
        public final List<? extends Integer> invoke(androidx.compose.runtime.saveable.j jVar, LazyGridState lazyGridState) {
            LazyGridState lazyGridState2 = lazyGridState;
            return kotlin.collections.l.s(Integer.valueOf(lazyGridState2.g()), Integer.valueOf(lazyGridState2.f10420d.f10531b.o()));
        }
    }, new Ia.l<List<? extends Integer>, LazyGridState>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$Companion$Saver$2
        @Override // Ia.l
        public final LazyGridState invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new LazyGridState(list2.get(0).intValue(), list2.get(1).intValue());
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f10417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f10419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f10420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f10421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f10422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DefaultScrollableState f10424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10425i;
    public LayoutNode j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f10426k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0968c f10427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LazyLayoutItemAnimator<q> f10428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0973h f10429n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final H f10430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f10431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final G f10432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X<p293xa.r> f10433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X<p293xa.r> f10434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f10435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1085f0 f10436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f10437v;

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class a {
        public a() {
        }
    }

    /* JADX INFO: compiled from: LazyGridState.kt */
    public static final class b implements a0 {
        public b() {
        }

        @Override // androidx.compose.ui.layout.a0
        public final void s(LayoutNode layoutNode) {
            LazyGridState.this.j = layoutNode;
        }
    }

    public LazyGridState() {
        this(0, 0, new androidx.compose.foundation.lazy.grid.a(2));
    }

    public static Object i(LazyGridState lazyGridState, int i10, SuspendLambda suspendLambda) {
        lazyGridState.getClass();
        Object objB = lazyGridState.b(MutatePriority.f9810b, new LazyGridState$scrollToItem$2(lazyGridState, i10, 0, null), suspendLambda);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return this.f10424h.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        LazyGridState$scroll$1 lazyGridState$scroll$1;
        LazyGridState lazyGridState;
        if (cVar instanceof LazyGridState$scroll$1) {
            lazyGridState$scroll$1 = (LazyGridState$scroll$1) cVar;
            int i10 = lazyGridState$scroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lazyGridState$scroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, cVar);
            }
        } else {
            lazyGridState$scroll$1 = new LazyGridState$scroll$1(this, cVar);
        }
        Object obj = lazyGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = lazyGridState$scroll$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (Ia.p) lazyGridState$scroll$1.L$2;
                mutatePriority = (MutatePriority) lazyGridState$scroll$1.L$1;
                lazyGridState = (LazyGridState) lazyGridState$scroll$1.L$0;
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
        lazyGridState$scroll$1.L$0 = this;
        lazyGridState$scroll$1.L$1 = mutatePriority;
        lazyGridState$scroll$1.L$2 = pVar;
        lazyGridState$scroll$1.label = 1;
        if (this.f10427l.a(lazyGridState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lazyGridState = this;
        DefaultScrollableState defaultScrollableState = lazyGridState.f10424h;
        lazyGridState$scroll$1.L$0 = null;
        lazyGridState$scroll$1.L$1 = null;
        lazyGridState$scroll$1.L$2 = null;
        lazyGridState$scroll$1.label = 2;
        if (defaultScrollableState.b(mutatePriority, pVar, lazyGridState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean c() {
        return ((Boolean) this.f10436u.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean d() {
        return ((Boolean) this.f10435t.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return this.f10424h.e(f10);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    public final void f(p pVar, boolean z10, boolean z11) {
        Object obj;
        if (!z10 && this.f10418b) {
            this.f10419c = pVar;
            return;
        }
        if (z10) {
            this.f10418b = true;
        }
        this.f10423g -= pVar.f10474d;
        this.f10421e.setValue(pVar);
        int i10 = 0;
        s sVar = pVar.f10471a;
        int i11 = sVar != null ? sVar.f10516a : 0;
        int i12 = pVar.f10472b;
        this.f10436u.setValue(Boolean.valueOf((i11 == 0 && i12 == 0) ? false : true));
        this.f10435t.setValue(Boolean.valueOf(pVar.f10473c));
        w wVar = this.f10420d;
        if (z11) {
            wVar.getClass();
            if (i12 < 0.0f) {
                p245u.c.c("scrollOffset should be non-negative");
            }
            wVar.f10531b.m(i12);
        } else {
            wVar.getClass();
            if (sVar != null) {
                q[] qVarArr = sVar.f10517b;
                q qVar = qVarArr.length == 0 ? null : qVarArr[0];
                if (qVar != null) {
                    obj = qVar.f10490b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            wVar.f10533d = obj;
            if (wVar.f10532c || pVar.f10484o > 0) {
                wVar.f10532c = true;
                if (i12 < 0.0f) {
                    p245u.c.c("scrollOffset should be non-negative (" + i12 + ')');
                }
                if (sVar != null) {
                    q[] qVarArr2 = sVar.f10517b;
                    q qVar2 = qVarArr2.length != 0 ? qVarArr2[0] : null;
                    if (qVar2 != null) {
                        i10 = qVar2.f10489a;
                    }
                }
                wVar.a(i10, i12);
            }
            if (this.f10425i) {
                this.f10417a.c(pVar);
            }
        }
        if (z10) {
            this.f10437v.a(pVar.f10476f, pVar.f10479i, pVar.f10478h);
        }
    }

    public final int g() {
        return this.f10420d.f10530a.o();
    }

    public final o h() {
        return (o) this.f10421e.getValue();
    }

    public LazyGridState(int i10, int i11) {
        this(i10, i11, new androidx.compose.foundation.lazy.grid.a(2));
    }

    public LazyGridState(final int i10, int i11, u uVar) {
        this.f10417a = uVar;
        this.f10420d = new w(i10, i11);
        this.f10421e = new C1085f0(LazyGridStateKt.f10442a, Z.f12934a);
        this.f10422f = new androidx.compose.foundation.interaction.l();
        this.f10424h = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$scrollableState$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final Float invoke(Float f10) {
                p pVar;
                float fFloatValue = f10.floatValue();
                LazyGridState lazyGridState = this.this$0;
                float f11 = -fFloatValue;
                if ((f11 >= 0.0f || lazyGridState.d()) && (f11 <= 0.0f || lazyGridState.c())) {
                    if (Math.abs(lazyGridState.f10423g) > 0.5f) {
                        p245u.c.c("entered drag with non-zero pending scroll");
                    }
                    float f12 = lazyGridState.f10423g + f11;
                    lazyGridState.f10423g = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = lazyGridState.f10423g;
                        int iB = Ka.a.b(f13);
                        p pVarI = ((p) lazyGridState.f10421e.getValue()).i(iB, !lazyGridState.f10418b);
                        if (pVarI != null && (pVar = lazyGridState.f10419c) != null) {
                            p pVarI2 = pVar.i(iB, true);
                            if (pVarI2 != null) {
                                lazyGridState.f10419c = pVarI2;
                            } else {
                                pVarI = null;
                            }
                        }
                        u uVar2 = lazyGridState.f10417a;
                        LazyGridState.a aVar = lazyGridState.f10431p;
                        if (pVarI != null) {
                            lazyGridState.f(pVarI, lazyGridState.f10418b, true);
                            S.b(lazyGridState.f10433r);
                            float f14 = f13 - lazyGridState.f10423g;
                            if (lazyGridState.f10425i) {
                                uVar2.b(aVar, f14, pVarI);
                            }
                        } else {
                            LayoutNode layoutNode = lazyGridState.j;
                            if (layoutNode != null) {
                                layoutNode.j();
                            }
                            float f15 = f13 - lazyGridState.f10423g;
                            o oVarH = lazyGridState.h();
                            if (lazyGridState.f10425i) {
                                uVar2.b(aVar, f15, oVarH);
                            }
                        }
                    }
                    if (Math.abs(lazyGridState.f10423g) > 0.5f) {
                        f11 -= lazyGridState.f10423g;
                        lazyGridState.f10423g = 0.0f;
                    }
                } else {
                    f11 = 0.0f;
                }
                return Float.valueOf(-f11);
            }
        });
        this.f10425i = true;
        this.f10426k = new b();
        this.f10427l = new C0968c();
        this.f10428m = new LazyLayoutItemAnimator<>();
        this.f10429n = new C0973h();
        uVar.getClass();
        this.f10430o = new H(null, new Ia.l<Q, p293xa.r>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Q q10) {
                Q q11 = q10;
                u uVar2 = this.this$0.f10417a;
                int i12 = i10;
                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                androidx.compose.runtime.snapshots.g.a.d(gVarA, androidx.compose.runtime.snapshots.g.a.b(gVarA), gVarA != null ? gVarA.e() : null);
                uVar2.a(q11, i12);
                return p293xa.r.f47939a;
            }
        });
        this.f10431p = new a();
        this.f10432q = new G();
        this.f10433r = S.a();
        this.f10434s = S.a();
        Boolean bool = Boolean.FALSE;
        this.f10435t = J0.f(bool);
        this.f10436u = J0.f(bool);
        this.f10437v = new LazyLayoutScrollDeltaBetweenPasses();
    }
}
