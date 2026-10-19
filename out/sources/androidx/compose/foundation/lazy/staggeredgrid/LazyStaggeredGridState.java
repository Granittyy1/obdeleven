package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0968c;
import androidx.compose.foundation.lazy.layout.C0973h;
import androidx.compose.foundation.lazy.layout.G;
import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses;
import androidx.compose.foundation.lazy.layout.S;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.Z;
import androidx.compose.ui.node.LayoutNode;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyStaggeredGridState implements androidx.compose.foundation.gestures.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final W.f f10788x = androidx.compose.runtime.saveable.a.a(new Ia.p<androidx.compose.runtime.saveable.j, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // Ia.p
        public final List<? extends int[]> invoke(androidx.compose.runtime.saveable.j jVar, LazyStaggeredGridState lazyStaggeredGridState) {
            r rVar = lazyStaggeredGridState.f10791c;
            return kotlin.collections.l.s(rVar.f10888b, rVar.f10890d);
        }
    }, new Ia.l<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        @Override // Ia.l
        public final LazyStaggeredGridState invoke(List<? extends int[]> list) {
            List<? extends int[]> list2 = list;
            return new LazyStaggeredGridState(list2.get(0), list2.get(1));
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f10790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f10791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f10792d = new C1085f0(o.f10866a, Z.f12934a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f10793e = new LazyStaggeredGridLaneInfo();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1085f0 f10794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f10795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LayoutNode f10796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f10797i;
    public final C0968c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0973h f10798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H f10800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final DefaultScrollableState f10801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f10804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f10805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final G f10806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LazyLayoutItemAnimator<p> f10807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final X<p293xa.r> f10808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final X<p293xa.r> f10809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LazyLayoutScrollDeltaBetweenPasses f10810w;

    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.f10791c = new r(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(2, this, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        this.f10794f = J0.f(bool);
        this.f10795g = J0.f(bool);
        this.f10797i = new v(this);
        this.j = new C0968c();
        this.f10798k = new C0973h();
        this.f10799l = true;
        this.f10800m = new H(null, null);
        this.f10801n = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final Float invoke(Float f10) {
                n nVar;
                float fFloatValue = f10.floatValue();
                LazyStaggeredGridState lazyStaggeredGridState = this.this$0;
                float f11 = -fFloatValue;
                W.f fVar = LazyStaggeredGridState.f10788x;
                if ((f11 >= 0.0f || lazyStaggeredGridState.d()) && (f11 <= 0.0f || lazyStaggeredGridState.c())) {
                    if (Math.abs(lazyStaggeredGridState.f10802o) > 0.5f) {
                        p245u.c.c("entered drag with non-zero pending scroll");
                    }
                    float f12 = lazyStaggeredGridState.f10802o + f11;
                    lazyStaggeredGridState.f10802o = f12;
                    if (Math.abs(f12) > 0.5f) {
                        float f13 = lazyStaggeredGridState.f10802o;
                        int iB = Ka.a.b(f13);
                        C1085f0 c1085f0 = lazyStaggeredGridState.f10792d;
                        n nVarG = ((n) c1085f0.getValue()).g(iB, !lazyStaggeredGridState.f10789a);
                        if (nVarG != null && (nVar = lazyStaggeredGridState.f10790b) != null) {
                            n nVarG2 = nVar.g(iB, true);
                            if (nVarG2 != null) {
                                lazyStaggeredGridState.f10790b = nVarG2;
                            } else {
                                nVarG = null;
                            }
                        }
                        if (nVarG != null) {
                            lazyStaggeredGridState.f(nVarG, lazyStaggeredGridState.f10789a, true);
                            S.b(lazyStaggeredGridState.f10808u);
                            lazyStaggeredGridState.h(f13 - lazyStaggeredGridState.f10802o, nVarG);
                        } else {
                            LayoutNode layoutNode = lazyStaggeredGridState.f10796h;
                            if (layoutNode != null) {
                                layoutNode.j();
                            }
                            lazyStaggeredGridState.h(f13 - lazyStaggeredGridState.f10802o, (n) c1085f0.getValue());
                        }
                    }
                    if (Math.abs(lazyStaggeredGridState.f10802o) > 0.5f) {
                        f11 -= lazyStaggeredGridState.f10802o;
                        lazyStaggeredGridState.f10802o = 0.0f;
                    }
                } else {
                    f11 = 0.0f;
                }
                return Float.valueOf(-f11);
            }
        });
        this.f10803p = -1;
        this.f10804q = new LinkedHashMap();
        this.f10805r = new androidx.compose.foundation.interaction.l();
        this.f10806s = new G();
        this.f10807t = new LazyLayoutItemAnimator<>();
        this.f10808u = S.a();
        this.f10809v = S.a();
        this.f10810w = new LazyLayoutScrollDeltaBetweenPasses();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return this.f10801n.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        LazyStaggeredGridState$scroll$1 lazyStaggeredGridState$scroll$1;
        LazyStaggeredGridState lazyStaggeredGridState;
        if (cVar instanceof LazyStaggeredGridState$scroll$1) {
            lazyStaggeredGridState$scroll$1 = (LazyStaggeredGridState$scroll$1) cVar;
            int i10 = lazyStaggeredGridState$scroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lazyStaggeredGridState$scroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, cVar);
            }
        } else {
            lazyStaggeredGridState$scroll$1 = new LazyStaggeredGridState$scroll$1(this, cVar);
        }
        Object obj = lazyStaggeredGridState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = lazyStaggeredGridState$scroll$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (Ia.p) lazyStaggeredGridState$scroll$1.L$2;
                mutatePriority = (MutatePriority) lazyStaggeredGridState$scroll$1.L$1;
                lazyStaggeredGridState = (LazyStaggeredGridState) lazyStaggeredGridState$scroll$1.L$0;
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
        lazyStaggeredGridState$scroll$1.L$0 = this;
        lazyStaggeredGridState$scroll$1.L$1 = mutatePriority;
        lazyStaggeredGridState$scroll$1.L$2 = pVar;
        lazyStaggeredGridState$scroll$1.label = 1;
        if (this.j.a(lazyStaggeredGridState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lazyStaggeredGridState = this;
        DefaultScrollableState defaultScrollableState = lazyStaggeredGridState.f10801n;
        lazyStaggeredGridState$scroll$1.L$0 = null;
        lazyStaggeredGridState$scroll$1.L$1 = null;
        lazyStaggeredGridState$scroll$1.L$2 = null;
        lazyStaggeredGridState$scroll$1.label = 2;
        if (defaultScrollableState.b(mutatePriority, pVar, lazyStaggeredGridState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean c() {
        return ((Boolean) this.f10795g.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean d() {
        return ((Boolean) this.f10794f.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return this.f10801n.e(f10);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final void f(n nVar, boolean z10, boolean z11) {
        Object obj;
        boolean z12 = true;
        if (!z10 && this.f10789a) {
            this.f10790b = nVar;
            return;
        }
        if (z10) {
            this.f10789a = true;
        }
        this.f10802o -= nVar.f10848c;
        this.f10792d.setValue(nVar);
        r rVar = this.f10791c;
        int[] iArr = nVar.f10846a;
        int[] iArr2 = nVar.f10847b;
        if (z11) {
            rVar.f10890d = iArr2;
            rVar.f10891e.m(r.b(rVar.f10888b, iArr2));
        } else {
            rVar.getClass();
            int iA = r.a(iArr);
            ?? r10 = nVar.f10857m;
            int size = ((Collection) r10).size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = r10.get(i10);
                if (((p) obj).f10868a == iA) {
                    break;
                } else {
                    i10++;
                }
            }
            p pVar = (p) obj;
            rVar.f10893g = pVar != null ? pVar.f10869b : null;
            rVar.f10894h.e(iA);
            if (rVar.f10892f || nVar.f10856l > 0) {
                rVar.f10892f = true;
                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                try {
                    rVar.f10888b = iArr;
                    rVar.f10889c.m(r.a(iArr));
                    rVar.f10890d = iArr2;
                    rVar.f10891e.m(r.b(iArr, iArr2));
                    p293xa.r rVar2 = p293xa.r.f47939a;
                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                    throw th;
                }
            }
            List<p> listF = nVar.f();
            if (this.f10803p != -1 && !listF.isEmpty()) {
                int index = ((e) kotlin.collections.q.O(listF)).getIndex();
                int index2 = ((e) kotlin.collections.q.V(listF)).getIndex();
                int i11 = this.f10803p;
                if (index > i11 || i11 > index2) {
                    this.f10803p = -1;
                    LinkedHashMap linkedHashMap = this.f10804q;
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((H.b) it.next()).cancel();
                    }
                    linkedHashMap.clear();
                }
            }
        }
        if (iArr[0] == 0 && iArr2[0] <= 0) {
            z12 = false;
        }
        this.f10795g.setValue(Boolean.valueOf(z12));
        this.f10794f.setValue(Boolean.valueOf(nVar.f10851f));
        if (z10) {
            this.f10810w.a(nVar.f10850e, nVar.f10855k, nVar.f10864t);
        }
    }

    public final j g() {
        return (j) this.f10792d.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, n nVar) {
        LinkedHashMap linkedHashMap;
        long jH;
        if (!this.f10799l || ((Collection) nVar.f10857m).isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        ?? r10 = nVar.f10857m;
        int iD = z10 ? ((p) kotlin.collections.q.V(r10)).f10868a : ((p) kotlin.collections.q.O(r10)).f10868a;
        if (iD == this.f10803p) {
            return;
        }
        this.f10803p = iD;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        u uVar = nVar.f10854i;
        int length = ((int[]) uVar.f10901c).length;
        int i10 = 0;
        while (true) {
            linkedHashMap = this.f10804q;
            if (i10 >= length) {
                break;
            }
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = this.f10793e;
            if (z10) {
                iD++;
                int length2 = lazyStaggeredGridLaneInfo.f10782a + lazyStaggeredGridLaneInfo.f10783b.length;
                while (true) {
                    if (iD >= length2) {
                        iD = lazyStaggeredGridLaneInfo.f10782a + lazyStaggeredGridLaneInfo.f10783b.length;
                        break;
                    } else if (lazyStaggeredGridLaneInfo.a(iD, i10)) {
                        break;
                    } else {
                        iD++;
                    }
                }
            } else {
                iD = lazyStaggeredGridLaneInfo.d(iD, i10);
            }
            if (iD < 0 || iD >= nVar.f10856l || linkedHashSet.contains(Integer.valueOf(iD))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(iD));
            if (!linkedHashMap.containsKey(Integer.valueOf(iD))) {
                nVar.j.f(iD);
                int i11 = ((int[]) uVar.f10901c)[i10];
                if (nVar.f10865u == Orientation.f9957b) {
                    if (i11 < 0) {
                        p013b0.i.a("width must be >= 0");
                    }
                    jH = p013b0.b.h(i11, i11, 0, BrazeLogger.SUPPRESS);
                } else {
                    if (i11 < 0) {
                        p013b0.i.a("height must be >= 0");
                    }
                    jH = p013b0.b.h(0, BrazeLogger.SUPPRESS, i11, i11);
                }
                linkedHashMap.put(Integer.valueOf(iD), this.f10800m.a(iD, jH));
            }
            i10++;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!linkedHashSet.contains(entry.getKey())) {
                ((H.b) entry.getValue()).cancel();
                it.remove();
            }
        }
    }
}
