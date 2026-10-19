package androidx.compose.ui.node;

import kotlin.NoWhenBranchMatchedException;
import p114j1.C2479a;

/* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutNode f14350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K3.b f14351b = new K3.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.a f14354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<U.a> f14355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<a> f14357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p013b0.a f14358i;

    /* JADX INFO: compiled from: MeasureAndLayoutDelegate.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LayoutNode f14359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14361c;

        public a(LayoutNode layoutNode, boolean z10, boolean z11) {
            this.f14359a = layoutNode;
            this.f14360b = z10;
            this.f14361c = z11;
        }
    }

    public E(LayoutNode layoutNode) {
        this.f14350a = layoutNode;
        V7.a aVar = new V7.a();
        aVar.f6730b = new androidx.compose.runtime.collection.c(new LayoutNode[16]);
        this.f14354e = aVar;
        this.f14355f = new androidx.compose.runtime.collection.c<>(new U.a[16]);
        this.f14356g = 1L;
        this.f14357h = new androidx.compose.runtime.collection.c<>(new a[16]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public static boolean b(LayoutNode layoutNode, p013b0.a aVar) {
        boolean zG0;
        LayoutNode layoutNode2 = layoutNode.f14407i;
        if (layoutNode2 == null) {
            return false;
        }
        C1204z c1204z = layoutNode.f14390H;
        if (aVar == null) {
            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
            p013b0.a aVar2 = lookaheadPassDelegate != null ? lookaheadPassDelegate.f14451o : null;
            if (aVar2 == null || layoutNode2 == null) {
                zG0 = false;
            } else {
                kotlin.jvm.internal.i.b(lookaheadPassDelegate);
                zG0 = lookaheadPassDelegate.G0(aVar2.f20475a);
            }
        } else if (layoutNode2 != null) {
            LookaheadPassDelegate lookaheadPassDelegate2 = c1204z.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate2);
            zG0 = lookaheadPassDelegate2.G0(aVar.f20475a);
        } else {
            zG0 = false;
        }
        LayoutNode layoutNodeG = layoutNode.G();
        if (zG0 && layoutNodeG != null) {
            if (layoutNodeG.f14407i == null) {
                LayoutNode.f0(layoutNodeG, false, 3);
            } else if (layoutNode.E() == LayoutNode.UsageByParent.f14431b) {
                LayoutNode.d0(layoutNodeG, false, 3);
            } else if (layoutNode.E() == LayoutNode.UsageByParent.f14432c) {
                layoutNodeG.c0(false);
            }
        }
        return zG0;
    }

    public static boolean c(LayoutNode layoutNode, p013b0.a aVar) {
        boolean zW = aVar != null ? layoutNode.W(aVar) : LayoutNode.X(layoutNode);
        LayoutNode layoutNodeG = layoutNode.G();
        if (zW && layoutNodeG != null) {
            LayoutNode.UsageByParent usageByParent = layoutNode.f14390H.f14641p.f14489m;
            if (usageByParent == LayoutNode.UsageByParent.f14431b) {
                LayoutNode.f0(layoutNodeG, false, 3);
            } else if (usageByParent == LayoutNode.UsageByParent.f14432c) {
                layoutNodeG.e0(false);
            }
        }
        return zW;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:22:0x002b A[SYNTHETIC] */
    public static boolean h(LayoutNode layoutNode) {
        if (layoutNode.D()) {
            do {
                if (i(layoutNode)) {
                    layoutNode = layoutNode.G();
                    if (layoutNode == null) {
                    }
                } else {
                    LayoutNode layoutNodeG = layoutNode.G();
                    if ((layoutNodeG != null ? layoutNodeG.f14390H.f14630d : null) == LayoutNode.LayoutState.f14425b) {
                        layoutNode = layoutNode.G();
                        if (layoutNode == null) {
                        }
                    }
                }
            } while (!layoutNode.r());
            return true;
        }
        return false;
    }

    public static boolean i(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate = layoutNode.f14390H.f14641p;
        return measurePassDelegate.f14489m == LayoutNode.UsageByParent.f14431b || measurePassDelegate.f14502z.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10) {
        Object[] objArr;
        V7.a aVar = this.f14354e;
        if (z10) {
            androidx.compose.runtime.collection.c cVar = (androidx.compose.runtime.collection.c) aVar.f6730b;
            cVar.j();
            LayoutNode layoutNode = this.f14350a;
            cVar.b(layoutNode);
            layoutNode.f14398P = true;
        }
        Q q10 = Q.f14568b;
        androidx.compose.runtime.collection.c cVar2 = (androidx.compose.runtime.collection.c) aVar.f6730b;
        cVar2.s(q10);
        int i10 = cVar2.f12945d;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) aVar.f6731c;
        if (layoutNodeArr == null || layoutNodeArr.length < i10) {
            objArr = layoutNodeArr;
            objArr = new LayoutNode[Math.max(16, i10)];
        }
        objArr = layoutNodeArr;
        aVar.f6731c = null;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = cVar2.f12943b[i11];
        }
        cVar2.j();
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            LayoutNode layoutNode2 = objArr[i12];
            kotlin.jvm.internal.i.b(layoutNode2);
            if (layoutNode2.f14398P) {
                V7.a.a(layoutNode2);
            }
        }
        aVar.f6731c = objArr;
    }

    public final void d() {
        androidx.compose.runtime.collection.c<a> cVar = this.f14357h;
        int i10 = cVar.f12945d;
        if (i10 != 0) {
            a[] aVarArr = cVar.f12943b;
            for (int i11 = 0; i11 < i10; i11++) {
                a aVar = aVarArr[i11];
                if (aVar.f14359a.c()) {
                    boolean z10 = aVar.f14360b;
                    boolean z11 = aVar.f14361c;
                    LayoutNode layoutNode = aVar.f14359a;
                    if (z10) {
                        LayoutNode.d0(layoutNode, z11, 2);
                    } else {
                        LayoutNode.f0(layoutNode, z11, 2);
                    }
                }
            }
            cVar.j();
        }
    }

    public final void e(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (kotlin.jvm.internal.i.a(layoutNode2.R(), Boolean.TRUE) && !layoutNode2.f14399Q) {
                if (((TreeSet) ((F6.a) this.f14351b.f4244b).f3259c).contains(layoutNode2)) {
                    layoutNode2.S();
                }
                e(layoutNode2);
            }
        }
    }

    public final void f(LayoutNode layoutNode, boolean z10) {
        if (!this.f14352c) {
            R.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? layoutNode.f14390H.f14631e : layoutNode.D()) {
            R.a.a("node not yet measured");
        }
        g(layoutNode, z10);
    }

    public final void g(LayoutNode layoutNode, boolean z10) {
        LookaheadPassDelegate lookaheadPassDelegate;
        A a10;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if ((!z10 && i(layoutNode2)) || (z10 && (layoutNode2.E() == LayoutNode.UsageByParent.f14431b || ((lookaheadPassDelegate = layoutNode2.f14390H.f14642q) != null && (a10 = lookaheadPassDelegate.f14456t) != null && a10.f())))) {
                boolean zL = C2479a.l(layoutNode2);
                C1204z c1204z = layoutNode2.f14390H;
                if (zL && !z10) {
                    if (c1204z.f14631e && ((TreeSet) ((F6.a) this.f14351b.f4244b).f3259c).contains(layoutNode2)) {
                        m(layoutNode2, true, false);
                    } else {
                        f(layoutNode2, true);
                    }
                }
                if (z10 ? c1204z.f14631e : layoutNode2.D()) {
                    m(layoutNode2, z10, false);
                }
                if (!(z10 ? c1204z.f14631e : layoutNode2.D())) {
                    g(layoutNode2, z10);
                }
            }
        }
        if (z10 ? layoutNode.f14390H.f14631e : layoutNode.D()) {
            m(layoutNode, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(Ia.a<p293xa.r> aVar) {
        boolean z10;
        LayoutNode layoutNode;
        K3.b bVar = this.f14351b;
        LayoutNode layoutNode2 = this.f14350a;
        if (!layoutNode2.c()) {
            R.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.r()) {
            R.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f14352c) {
            R.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f14358i != null) {
            this.f14352c = true;
            this.f14353d = true;
            try {
                if (bVar.d()) {
                    z10 = false;
                    while (true) {
                        boolean zD = bVar.d();
                        F6.a aVar2 = (F6.a) bVar.f4244b;
                        if (!zD) {
                            break;
                        }
                        boolean zIsEmpty = ((TreeSet) aVar2.f3259c).isEmpty();
                        boolean z11 = !zIsEmpty;
                        if (zIsEmpty) {
                            F6.a aVar3 = (F6.a) bVar.f4245c;
                            LayoutNode layoutNode3 = (LayoutNode) ((TreeSet) aVar3.f3259c).first();
                            aVar3.g(layoutNode3);
                            layoutNode = layoutNode3;
                        } else {
                            layoutNode = (LayoutNode) ((TreeSet) aVar2.f3259c).first();
                            aVar2.g(layoutNode);
                        }
                        boolean zM = m(layoutNode, z11, true);
                        if (layoutNode == layoutNode2 && zM) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f14352c = false;
                this.f14353d = false;
            } catch (Throwable th) {
                this.f14352c = false;
                this.f14353d = false;
                throw th;
            }
        } else {
            z10 = false;
        }
        androidx.compose.runtime.collection.c<U.a> cVar = this.f14355f;
        U.a[] aVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11].b();
        }
        cVar.j();
        return z10;
    }

    public final void k(LayoutNode layoutNode, long j) {
        if (layoutNode.f14399Q) {
            return;
        }
        LayoutNode layoutNode2 = this.f14350a;
        if (layoutNode.equals(layoutNode2)) {
            R.a.a("measureAndLayout called on root");
        }
        if (!layoutNode2.c()) {
            R.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.r()) {
            R.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f14352c) {
            R.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f14358i != null) {
            this.f14352c = true;
            this.f14353d = false;
            try {
                K3.b bVar = this.f14351b;
                ((F6.a) bVar.f4244b).g(layoutNode);
                ((F6.a) bVar.f4245c).g(layoutNode);
                if ((b(layoutNode, new p013b0.a(j)) || layoutNode.f14390H.f14632f) && kotlin.jvm.internal.i.a(layoutNode.R(), Boolean.TRUE)) {
                    layoutNode.S();
                }
                e(layoutNode);
                c(layoutNode, new p013b0.a(j));
                if (layoutNode.C() && layoutNode.r()) {
                    layoutNode.b0();
                    ((androidx.compose.runtime.collection.c) this.f14354e.f6730b).b(layoutNode);
                    layoutNode.f14398P = true;
                }
                d();
                this.f14352c = false;
                this.f14353d = false;
            } catch (Throwable th) {
                this.f14352c = false;
                this.f14353d = false;
                throw th;
            }
        }
        androidx.compose.runtime.collection.c<U.a> cVar = this.f14355f;
        U.a[] aVarArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            aVarArr[i11].b();
        }
        cVar.j();
    }

    public final void l() {
        K3.b bVar = this.f14351b;
        if (bVar.d()) {
            LayoutNode layoutNode = this.f14350a;
            if (!layoutNode.c()) {
                R.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.r()) {
                R.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f14352c) {
                R.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f14358i != null) {
                this.f14352c = true;
                this.f14353d = false;
                try {
                    if (!((TreeSet) ((F6.a) bVar.f4244b).f3259c).isEmpty()) {
                        if (layoutNode.f14407i != null) {
                            o(layoutNode, true);
                        } else {
                            n(layoutNode);
                        }
                    }
                    o(layoutNode, false);
                } finally {
                    this.f14352c = false;
                    this.f14353d = false;
                }
            }
        }
    }

    public final boolean m(LayoutNode layoutNode, boolean z10, boolean z11) {
        p013b0.a aVar;
        androidx.compose.ui.layout.Y.a placementScope;
        C1195p c1195p;
        LayoutNode layoutNodeG;
        LookaheadPassDelegate lookaheadPassDelegate;
        A a10;
        LookaheadPassDelegate lookaheadPassDelegate2;
        A a11;
        boolean zB = false;
        if (layoutNode.f14399Q) {
            return false;
        }
        boolean zR = layoutNode.r();
        C1204z c1204z = layoutNode.f14390H;
        if (zR || c1204z.f14641p.f14498v || h(layoutNode) || kotlin.jvm.internal.i.a(layoutNode.R(), Boolean.TRUE) || ((c1204z.f14631e && (layoutNode.E() == LayoutNode.UsageByParent.f14431b || ((lookaheadPassDelegate2 = c1204z.f14642q) != null && (a11 = lookaheadPassDelegate2.f14456t) != null && a11.f()))) || c1204z.f14641p.f14502z.f() || ((lookaheadPassDelegate = c1204z.f14642q) != null && (a10 = lookaheadPassDelegate.f14456t) != null && a10.f()))) {
            LayoutNode layoutNode2 = this.f14350a;
            if (layoutNode == layoutNode2) {
                aVar = this.f14358i;
                kotlin.jvm.internal.i.b(aVar);
            } else {
                aVar = null;
            }
            if (z10) {
                zB = c1204z.f14631e ? b(layoutNode, aVar) : false;
                if (z11 && ((zB || c1204z.f14632f) && kotlin.jvm.internal.i.a(layoutNode.R(), Boolean.TRUE))) {
                    layoutNode.S();
                }
            } else {
                boolean zC = layoutNode.D() ? c(layoutNode, aVar) : false;
                if (z11 && layoutNode.C() && (layoutNode == layoutNode2 || ((layoutNodeG = layoutNode.G()) != null && layoutNodeG.r() && c1204z.f14641p.f14498v))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.f14386D == LayoutNode.UsageByParent.f14433d) {
                            layoutNode.q();
                        }
                        LayoutNode layoutNodeG2 = layoutNode.G();
                        if (layoutNodeG2 == null || (c1195p = layoutNodeG2.f14389G.f14365b) == null || (placementScope = c1195p.j) == null) {
                            placementScope = C1203y.a(layoutNode).getPlacementScope();
                        }
                        androidx.compose.ui.layout.Y.a.g(placementScope, c1204z.f14641p, 0, 0);
                    } else {
                        layoutNode.b0();
                    }
                    ((androidx.compose.runtime.collection.c) this.f14354e.f6730b).b(layoutNode);
                    layoutNode.f14398P = true;
                    C1203y.a(layoutNode).getRectManager().d(layoutNode);
                }
                zB = zC;
            }
            d();
        }
        return zB;
    }

    public final void n(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (i(layoutNode2)) {
                if (C2479a.l(layoutNode2)) {
                    o(layoutNode2, true);
                } else {
                    n(layoutNode2);
                }
            }
        }
    }

    public final void o(LayoutNode layoutNode, boolean z10) {
        p013b0.a aVar;
        if (layoutNode.f14399Q) {
            return;
        }
        if (layoutNode == this.f14350a) {
            aVar = this.f14358i;
            kotlin.jvm.internal.i.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(layoutNode, aVar);
        } else {
            c(layoutNode, aVar);
        }
    }

    public final boolean p(LayoutNode layoutNode, boolean z10) {
        int iOrdinal = layoutNode.f14390H.f14630d.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            this.f14357h.b(new a(layoutNode, false, z10));
            return false;
        }
        if (iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (layoutNode.D() && !z10) {
            return false;
        }
        layoutNode.f14390H.f14641p.f14499w = true;
        if (layoutNode.f14399Q) {
            return false;
        }
        if (!layoutNode.r() && !h(layoutNode)) {
            return false;
        }
        LayoutNode layoutNodeG = layoutNode.G();
        if (layoutNodeG == null || !layoutNodeG.D()) {
            this.f14351b.c(layoutNode, false);
        }
        return !this.f14353d;
    }

    public final void q(long j) {
        p013b0.a aVar = this.f14358i;
        if (aVar == null ? false : p013b0.a.b(aVar.f20475a, j)) {
            return;
        }
        if (this.f14352c) {
            R.a.a("updateRootConstraints called while measuring");
        }
        this.f14358i = new p013b0.a(j);
        LayoutNode layoutNode = this.f14350a;
        LayoutNode layoutNode2 = layoutNode.f14407i;
        C1204z c1204z = layoutNode.f14390H;
        if (layoutNode2 != null) {
            c1204z.f14631e = true;
        }
        c1204z.f14641p.f14499w = true;
        this.f14351b.c(layoutNode, layoutNode2 != null);
    }
}
