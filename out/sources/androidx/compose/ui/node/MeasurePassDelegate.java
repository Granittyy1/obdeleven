package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.platform.AndroidComposeView;
import com.braze.support.BrazeLogger;
import java.util.List;
import p114j1.C2479a;

/* JADX INFO: compiled from: MeasurePassDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MeasurePassDelegate extends androidx.compose.ui.layout.Y implements androidx.compose.ui.layout.D, InterfaceC1180a, I {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14472C;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f14476G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14477H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> f14478I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14479J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f14481L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f14483N;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1204z f14484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14485h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14488l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14490n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> f14492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14494r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f14496t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14497u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14499w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14500x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14501y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14486i = BrazeLogger.SUPPRESS;
    public int j = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayoutNode.UsageByParent f14489m = LayoutNode.UsageByParent.f14433d;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14491o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14495s = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1201w f14502z = new C1201w(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<MeasurePassDelegate> f14470A = new androidx.compose.runtime.collection.c<>(new MeasurePassDelegate[16]);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14471B = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f14473D = p013b0.b.b(0, 0, 15);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Ia.a<p293xa.r> f14474E = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        {
            super(0);
        }

        @Override // Ia.a
        public final p293xa.r invoke() {
            this.this$0.f14484g.a().Q(this.this$0.f14473D);
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Ia.a<p293xa.r> f14475F = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        {
            super(0);
        }

        @Override // Ia.a
        public final p293xa.r invoke() {
            C1204z c1204z = this.this$0.f14484g;
            c1204z.f14635i = 0;
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                MeasurePassDelegate measurePassDelegate = layoutNodeArr[i11].f14390H.f14641p;
                measurePassDelegate.f14486i = measurePassDelegate.j;
                measurePassDelegate.j = BrazeLogger.SUPPRESS;
                measurePassDelegate.f14498v = false;
                if (measurePassDelegate.f14489m == LayoutNode.UsageByParent.f14432c) {
                    measurePassDelegate.f14489m = LayoutNode.UsageByParent.f14433d;
                }
            }
            this.this$0.h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                @Override // Ia.l
                public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                    interfaceC1180a.o().f14308d = false;
                    return p293xa.r.f47939a;
                }
            });
            this.this$0.x().F0().p();
            LayoutNode layoutNode = this.this$0.f14484g.f14627a;
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ2 = layoutNode.J();
            LayoutNode[] layoutNodeArr2 = cVarJ2.f12943b;
            int i12 = cVarJ2.f12945d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode2 = layoutNodeArr2[i13];
                if (layoutNode2.f14390H.f14641p.f14486i != layoutNode2.H()) {
                    layoutNode.V();
                    layoutNode.M();
                    if (layoutNode2.H() == Integer.MAX_VALUE) {
                        C1204z c1204z2 = layoutNode2.f14390H;
                        if (c1204z2.f14629c) {
                            LookaheadPassDelegate lookaheadPassDelegate = c1204z2.f14642q;
                            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
                            lookaheadPassDelegate.v0(false);
                        }
                        c1204z2.f14641p.y0();
                    }
                }
            }
            this.this$0.h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.2
                @Override // Ia.l
                public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                    InterfaceC1180a interfaceC1180a2 = interfaceC1180a;
                    interfaceC1180a2.o().f14309e = interfaceC1180a2.o().f14308d;
                    return p293xa.r.f47939a;
                }
            });
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f14480K = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Ia.a<p293xa.r> f14482M = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        {
            super(0);
        }

        @Override // Ia.a
        public final p293xa.r invoke() {
            androidx.compose.ui.layout.Y.a placementScope;
            NodeCoordinator nodeCoordinator = this.this$0.f14484g.a().f14529r;
            if (nodeCoordinator == null || (placementScope = nodeCoordinator.j) == null) {
                placementScope = C1203y.a(this.this$0.f14484g.f14627a).getPlacementScope();
            }
            MeasurePassDelegate measurePassDelegate = this.this$0;
            Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar = measurePassDelegate.f14478I;
            androidx.compose.ui.graphics.layer.b bVar = measurePassDelegate.f14479J;
            C1204z c1204z = measurePassDelegate.f14484g;
            if (bVar != null) {
                NodeCoordinator nodeCoordinatorA = c1204z.a();
                long j = measurePassDelegate.f14480K;
                float f10 = measurePassDelegate.f14481L;
                placementScope.getClass();
                androidx.compose.ui.layout.Y.a.a(placementScope, nodeCoordinatorA);
                nodeCoordinatorA.r0(p013b0.j.d(j, nodeCoordinatorA.f14224f), f10, bVar);
            } else if (lVar == null) {
                NodeCoordinator nodeCoordinatorA2 = c1204z.a();
                long j10 = measurePassDelegate.f14480K;
                float f11 = measurePassDelegate.f14481L;
                placementScope.getClass();
                androidx.compose.ui.layout.Y.a.a(placementScope, nodeCoordinatorA2);
                nodeCoordinatorA2.q0(p013b0.j.d(j10, nodeCoordinatorA2.f14224f), f11, null);
            } else {
                NodeCoordinator nodeCoordinatorA3 = c1204z.a();
                long j11 = measurePassDelegate.f14480K;
                float f12 = measurePassDelegate.f14481L;
                placementScope.getClass();
                androidx.compose.ui.layout.Y.a.a(placementScope, nodeCoordinatorA3);
                nodeCoordinatorA3.q0(p013b0.j.d(j11, nodeCoordinatorA3.f14224f), f12, lVar);
            }
            return p293xa.r.f47939a;
        }
    };

    public MeasurePassDelegate(C1204z c1204z) {
        this.f14484g = c1204z;
    }

    public final void C0() {
        C1204z c1204z = this.f14484g;
        if (c1204z.f14637l > 0) {
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                C1204z c1204z2 = layoutNode.f14390H;
                boolean z10 = c1204z2.j;
                MeasurePassDelegate measurePassDelegate = c1204z2.f14641p;
                if ((z10 || c1204z2.f14636k) && !measurePassDelegate.f14500x) {
                    layoutNode.e0(false);
                }
                measurePassDelegate.C0();
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final InterfaceC1180a E() {
        C1204z c1204z;
        LayoutNode layoutNodeG = this.f14484g.f14627a.G();
        if (layoutNodeG == null || (c1204z = layoutNodeG.f14390H) == null) {
            return null;
        }
        return c1204z.f14641p;
    }

    public final void E0() {
        LayoutNode.UsageByParent usageByParent;
        C1204z c1204z = this.f14484g;
        LayoutNode.f0(c1204z.f14627a, false, 7);
        LayoutNode layoutNode = c1204z.f14627a;
        LayoutNode layoutNodeG = layoutNode.G();
        if (layoutNodeG == null || layoutNode.f14386D != LayoutNode.UsageByParent.f14433d) {
            return;
        }
        int iOrdinal = layoutNodeG.f14390H.f14630d.ordinal();
        if (iOrdinal != 0) {
            usageByParent = iOrdinal != 2 ? layoutNodeG.f14386D : LayoutNode.UsageByParent.f14432c;
        } else {
            usageByParent = LayoutNode.UsageByParent.f14431b;
        }
        layoutNode.f14386D = usageByParent;
    }

    public final void F0() {
        this.f14477H = true;
        C1204z c1204z = this.f14484g;
        LayoutNode layoutNodeG = c1204z.f14627a.G();
        float f10 = x().f14515B;
        LayoutNode layoutNode = c1204z.f14627a;
        K k10 = layoutNode.f14389G;
        for (NodeCoordinator nodeCoordinator = k10.f14366c; nodeCoordinator != k10.f14365b; nodeCoordinator = nodeCoordinator.f14528q) {
            kotlin.jvm.internal.i.c(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f10 += ((C1199u) nodeCoordinator).f14515B;
        }
        if (f10 != this.f14476G) {
            this.f14476G = f10;
            if (layoutNodeG != null) {
                layoutNodeG.V();
            }
            if (layoutNodeG != null) {
                layoutNodeG.M();
            }
        }
        if (this.f14497u) {
            layoutNode.f14389G.f14365b.M1();
        } else {
            if (layoutNodeG != null) {
                layoutNodeG.M();
            }
            x0();
            if (this.f14485h && layoutNodeG != null) {
                layoutNodeG.e0(false);
            }
        }
        if (layoutNodeG == null) {
            this.j = 0;
        } else if (!this.f14485h) {
            C1204z c1204z2 = layoutNodeG.f14390H;
            if (c1204z2.f14630d == LayoutNode.LayoutState.f14427d) {
                if (this.j != Integer.MAX_VALUE) {
                    R.a.b("Place was called on a node which was placed already");
                }
                int i10 = c1204z2.f14635i;
                this.j = i10;
                c1204z2.f14635i = i10 + 1;
            }
        }
        Z();
    }

    public final void G0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar, androidx.compose.ui.graphics.layer.b bVar) {
        C1204z c1204z = this.f14484g;
        if (c1204z.f14627a.f14399Q) {
            R.a.a("place is called on a deactivated node");
        }
        c1204z.f14630d = LayoutNode.LayoutState.f14427d;
        boolean z10 = !this.f14488l;
        this.f14491o = j;
        this.f14494r = f10;
        this.f14492p = lVar;
        this.f14493q = bVar;
        this.f14488l = true;
        this.f14477H = false;
        LayoutNode layoutNode = c1204z.f14627a;
        U uA = C1203y.a(layoutNode);
        uA.getRectManager().f(layoutNode, j, z10);
        if (this.f14500x || !this.f14497u) {
            this.f14502z.f14311g = false;
            c1204z.d(false);
            this.f14478I = lVar;
            this.f14480K = j;
            this.f14481L = f10;
            this.f14479J = bVar;
            OwnerSnapshotObserver snapshotObserver = uA.getSnapshotObserver();
            snapshotObserver.b(layoutNode, snapshotObserver.f14557f, this.f14482M);
        } else {
            NodeCoordinator nodeCoordinatorA = c1204z.a();
            nodeCoordinatorA.P1(p013b0.j.d(j, nodeCoordinatorA.f14224f), f10, lVar, bVar);
            F0();
        }
        c1204z.f14630d = LayoutNode.LayoutState.f14429f;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    public final void H0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar, androidx.compose.ui.graphics.layer.b bVar) {
        boolean z10;
        androidx.compose.ui.layout.Y.a placementScope;
        boolean z11;
        this.f14498v = true;
        boolean zB = p013b0.j.b(j, this.f14491o);
        C1204z c1204z = this.f14484g;
        if (!zB || this.f14483N) {
            if (c1204z.f14636k || c1204z.j || this.f14483N) {
                this.f14500x = true;
                this.f14483N = false;
            }
            C0();
        }
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        if (lookaheadPassDelegate != null) {
            C1204z c1204z2 = lookaheadPassDelegate.f14444g;
            if (C2479a.l(c1204z2.f14627a)) {
                z11 = true;
            } else {
                if (lookaheadPassDelegate.f14455s == LookaheadPassDelegate.PlacedState.f14465d && !c1204z2.f14628b) {
                    c1204z2.f14629c = true;
                }
                z11 = c1204z2.f14629c;
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            NodeCoordinator nodeCoordinator = c1204z.a().f14529r;
            LayoutNode layoutNode = c1204z.f14627a;
            if (nodeCoordinator == null || (placementScope = nodeCoordinator.j) == null) {
                placementScope = C1203y.a(layoutNode).getPlacementScope();
            }
            LookaheadPassDelegate lookaheadPassDelegate2 = c1204z.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate2);
            LayoutNode layoutNodeG = layoutNode.G();
            if (layoutNodeG != null) {
                layoutNodeG.f14390H.f14634h = 0;
            }
            lookaheadPassDelegate2.j = BrazeLogger.SUPPRESS;
            placementScope.d(lookaheadPassDelegate2, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
        }
        LookaheadPassDelegate lookaheadPassDelegate3 = c1204z.f14642q;
        if ((lookaheadPassDelegate3 == null || lookaheadPassDelegate3.f14449m) ? false : true) {
            R.a.b("Error: Placement happened before lookahead.");
        }
        G0(j, f10, lVar, bVar);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        C1204z c1204z = this.f14484g;
        if (!C2479a.l(c1204z.f14627a)) {
            E0();
            return c1204z.a().I(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        return lookaheadPassDelegate.I(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        C1204z c1204z = this.f14484g;
        if (!C2479a.l(c1204z.f14627a)) {
            E0();
            return c1204z.a().J(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        return lookaheadPassDelegate.J(i10);
    }

    public final boolean N0(long j) {
        C1204z c1204z = this.f14484g;
        if (c1204z.f14627a.f14399Q) {
            R.a.a("measure is called on a deactivated node");
        }
        LayoutNode layoutNode = c1204z.f14627a;
        U uA = C1203y.a(layoutNode);
        LayoutNode layoutNodeG = layoutNode.G();
        boolean z10 = true;
        layoutNode.f14388F = layoutNode.f14388F || (layoutNodeG != null && layoutNodeG.f14388F);
        if (!layoutNode.D() && p013b0.a.b(this.f14223e, j)) {
            ((AndroidComposeView) uA).t(layoutNode, false);
            layoutNode.h0();
            return false;
        }
        this.f14502z.f14310f = false;
        h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$2
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                interfaceC1180a.o().f14307c = false;
                return p293xa.r.f47939a;
            }
        });
        this.f14487k = true;
        long j10 = c1204z.a().f14222d;
        u0(j);
        LayoutNode.LayoutState layoutState = c1204z.f14630d;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f14429f;
        if (layoutState != layoutState2) {
            R.a.b("layout state is not idle before measure starts");
        }
        this.f14473D = j;
        LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f14425b;
        c1204z.f14630d = layoutState3;
        this.f14499w = false;
        OwnerSnapshotObserver snapshotObserver = C1203y.a(layoutNode).getSnapshotObserver();
        snapshotObserver.b(layoutNode, snapshotObserver.f14554c, this.f14474E);
        if (c1204z.f14630d == layoutState3) {
            this.f14500x = true;
            this.f14501y = true;
            c1204z.f14630d = layoutState2;
        }
        if (p013b0.l.b(c1204z.a().f14222d, j10) && c1204z.a().f14220b == this.f14220b && c1204z.a().f14221c == this.f14221c) {
            z10 = false;
        }
        t0((((long) c1204z.a().f14221c) & 4294967295L) | (((long) c1204z.a().f14220b) << 32));
        return z10;
    }

    @Override // androidx.compose.ui.layout.D
    public final androidx.compose.ui.layout.Y Q(long j) {
        LayoutNode.UsageByParent usageByParent;
        C1204z c1204z = this.f14484g;
        LayoutNode layoutNode = c1204z.f14627a;
        LayoutNode.UsageByParent usageByParent2 = layoutNode.f14386D;
        LayoutNode.UsageByParent usageByParent3 = LayoutNode.UsageByParent.f14433d;
        if (usageByParent2 == usageByParent3) {
            layoutNode.o();
        }
        if (C2479a.l(c1204z.f14627a)) {
            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            lookaheadPassDelegate.f14447k = usageByParent3;
            lookaheadPassDelegate.Q(j);
        }
        LayoutNode layoutNode2 = c1204z.f14627a;
        LayoutNode layoutNodeG = layoutNode2.G();
        if (layoutNodeG != null) {
            if (this.f14489m != usageByParent3 && !layoutNode2.f14388F) {
                R.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            C1204z c1204z2 = layoutNodeG.f14390H;
            int iOrdinal = c1204z2.f14630d.ordinal();
            if (iOrdinal == 0) {
                usageByParent = LayoutNode.UsageByParent.f14431b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c1204z2.f14630d);
                }
                usageByParent = LayoutNode.UsageByParent.f14432c;
            }
            this.f14489m = usageByParent;
        } else {
            this.f14489m = usageByParent3;
        }
        N0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.I
    public final int V(AbstractC1155a abstractC1155a) {
        C1204z c1204z = this.f14484g;
        LayoutNode layoutNodeG = c1204z.f14627a.G();
        LayoutNode.LayoutState layoutState = layoutNodeG != null ? layoutNodeG.f14390H.f14630d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f14425b;
        C1201w c1201w = this.f14502z;
        if (layoutState == layoutState2) {
            c1201w.f14307c = true;
        } else {
            LayoutNode layoutNodeG2 = c1204z.f14627a.G();
            if ((layoutNodeG2 != null ? layoutNodeG2.f14390H.f14630d : null) == LayoutNode.LayoutState.f14427d) {
                c1201w.f14308d = true;
            }
        }
        this.f14490n = true;
        int iV = c1204z.a().V(abstractC1155a);
        this.f14490n = false;
        return iV;
    }

    @Override // androidx.compose.ui.node.I
    public final void Y(boolean z10) {
        C1204z c1204z = this.f14484g;
        if (z10 != c1204z.a().f14438g) {
            c1204z.a().f14438g = z10;
            this.f14483N = true;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void Z() {
        this.f14472C = true;
        C1201w c1201w = this.f14502z;
        c1201w.i();
        boolean z10 = this.f14500x;
        C1204z c1204z = this.f14484g;
        if (z10) {
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                if (layoutNode.D() && layoutNode.f14390H.f14641p.f14489m == LayoutNode.UsageByParent.f14431b && LayoutNode.X(layoutNode)) {
                    LayoutNode.f0(c1204z.f14627a, false, 7);
                }
            }
        }
        if (this.f14501y || (!this.f14490n && !x().f14440i && this.f14500x)) {
            this.f14500x = false;
            LayoutNode.LayoutState layoutState = c1204z.f14630d;
            c1204z.f14630d = LayoutNode.LayoutState.f14427d;
            c1204z.e(false);
            LayoutNode layoutNode2 = c1204z.f14627a;
            OwnerSnapshotObserver snapshotObserver = C1203y.a(layoutNode2).getSnapshotObserver();
            snapshotObserver.b(layoutNode2, snapshotObserver.f14556e, this.f14475F);
            c1204z.f14630d = layoutState;
            if (x().f14440i && c1204z.j) {
                requestLayout();
            }
            this.f14501y = false;
        }
        if (c1201w.f14308d) {
            c1201w.f14309e = true;
        }
        if (c1201w.f14306b && c1201w.f()) {
            c1201w.h();
        }
        this.f14472C = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void h0(Ia.l<? super InterfaceC1180a, p293xa.r> lVar) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = this.f14484g.f14627a.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            lVar.invoke(layoutNodeArr[i11].f14390H.f14641p);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void j0() {
        LayoutNode.f0(this.f14484g.f14627a, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        C1204z c1204z = this.f14484g;
        if (!C2479a.l(c1204z.f14627a)) {
            E0();
            return c1204z.a().k0(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        return lookaheadPassDelegate.k0(i10);
    }

    @Override // androidx.compose.ui.layout.Y
    public final int l0() {
        return this.f14484g.a().l0();
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final AlignmentLines o() {
        return this.f14502z;
    }

    @Override // androidx.compose.ui.layout.Y
    public final int o0() {
        return this.f14484g.a().o0();
    }

    @Override // androidx.compose.ui.layout.I, androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        return this.f14496t;
    }

    @Override // androidx.compose.ui.layout.Y
    public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        H0(j, f10, lVar, null);
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final boolean r() {
        return this.f14497u;
    }

    @Override // androidx.compose.ui.layout.Y
    public final void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        H0(j, f10, null, bVar);
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void requestLayout() {
        LayoutNode layoutNode = this.f14484g.f14627a;
        LayoutNode.b bVar = LayoutNode.f14379R;
        layoutNode.e0(false);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        C1204z c1204z = this.f14484g;
        if (!C2479a.l(c1204z.f14627a)) {
            E0();
            return c1204z.a().s(i10);
        }
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        return lookaheadPassDelegate.s(i10);
    }

    public final List<MeasurePassDelegate> v0() {
        C1204z c1204z = this.f14484g;
        c1204z.f14627a.l0();
        boolean z10 = this.f14471B;
        androidx.compose.runtime.collection.c<MeasurePassDelegate> cVar = this.f14470A;
        if (!z10) {
            return cVar.i();
        }
        LayoutNode layoutNode = c1204z.f14627a;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (cVar.f12945d <= i11) {
                cVar.b(layoutNode2.f14390H.f14641p);
            } else {
                MeasurePassDelegate measurePassDelegate = layoutNode2.f14390H.f14641p;
                MeasurePassDelegate[] measurePassDelegateArr = cVar.f12943b;
                MeasurePassDelegate measurePassDelegate2 = measurePassDelegateArr[i11];
                measurePassDelegateArr[i11] = measurePassDelegate;
            }
        }
        cVar.q(((androidx.compose.runtime.collection.c.a) layoutNode.A()).f12946b.f12945d, cVar.f12945d);
        this.f14471B = false;
        return cVar.i();
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final C1195p x() {
        return this.f14484g.f14627a.f14389G.f14365b;
    }

    public final void x0() {
        boolean z10 = this.f14497u;
        this.f14497u = true;
        LayoutNode layoutNode = this.f14484g.f14627a;
        if (!z10) {
            layoutNode.f14389G.f14365b.M1();
            if (layoutNode.D()) {
                LayoutNode.f0(layoutNode, true, 6);
            } else if (layoutNode.f14390H.f14631e) {
                LayoutNode.d0(layoutNode, true, 6);
            }
        }
        K k10 = layoutNode.f14389G;
        NodeCoordinator nodeCoordinator = k10.f14365b.f14528q;
        for (NodeCoordinator nodeCoordinator2 = k10.f14366c; !kotlin.jvm.internal.i.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f14528q) {
            if (nodeCoordinator2.f14522I) {
                nodeCoordinator2.G1();
            }
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (layoutNode2.H() != Integer.MAX_VALUE) {
                layoutNode2.f14390H.f14641p.x0();
                LayoutNode.g0(layoutNode2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void y0() {
        if (this.f14497u) {
            this.f14497u = false;
            C1204z c1204z = this.f14484g;
            K k10 = c1204z.f14627a.f14389G;
            NodeCoordinator nodeCoordinator = k10.f14365b.f14528q;
            for (NodeCoordinator nodeCoordinator2 = k10.f14366c; !kotlin.jvm.internal.i.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f14528q) {
                androidx.compose.ui.h.c cVarB1 = nodeCoordinator2.B1(N.g(1048576));
                if (cVarB1 != null && (cVarB1.f13985b.f13988e & 1048576) != 0) {
                    boolean zG = N.g(1048576);
                    androidx.compose.ui.h.c cVarV1 = nodeCoordinator2.v1();
                    if (zG || (cVarV1 = cVarV1.f13989f) != null) {
                        for (androidx.compose.ui.h.c cVarB2 = nodeCoordinator2.B1(zG); cVarB2 != null && (cVarB2.f13988e & 1048576) != 0; cVarB2 = cVarB2.f13990g) {
                            if ((cVarB2.f13987d & 1048576) != 0) {
                                ?? B10 = cVarB2;
                                ?? cVar = 0;
                                while (B10 != 0) {
                                    if (B10 instanceof S) {
                                        ((S) B10).C1();
                                    } else if ((B10.f13987d & 1048576) != 0 && (B10 instanceof AbstractC1187h)) {
                                        androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B10).f14585q;
                                        int i10 = 0;
                                        B10 = B10;
                                        cVar = cVar;
                                        while (cVar2 != null) {
                                            if ((cVar2.f13987d & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = cVar;
                                                    B10 = cVar2;
                                                } else {
                                                    if (cVar == 0) {
                                                        cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                    }
                                                    if (B10 != 0) {
                                                        cVar.b(B10);
                                                        B10 = 0;
                                                    }
                                                    cVar.b(cVar2);
                                                }
                                            }
                                            cVar2 = cVar2.f13990g;
                                            B10 = B10;
                                            cVar = cVar;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    B10 = C1185f.b(cVar);
                                }
                            }
                            if (cVarB2 == cVarV1) {
                                break;
                            }
                        }
                    }
                }
                if (nodeCoordinator2.f14523J != null) {
                    if (nodeCoordinator2.f14524K != null) {
                        nodeCoordinator2.f14524K = null;
                    }
                    nodeCoordinator2.V1(null, false);
                    nodeCoordinator2.f14525n.e0(false);
                }
            }
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i11 = cVarJ.f12945d;
            for (int i12 = 0; i12 < i11; i12++) {
                layoutNodeArr[i12].f14390H.f14641p.y0();
            }
        }
    }
}
