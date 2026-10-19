package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.platform.AndroidComposeView;
import com.braze.support.BrazeLogger;
import java.util.List;
import p114j1.C2479a;

/* JADX INFO: compiled from: LookaheadPassDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LookaheadPassDelegate extends androidx.compose.ui.layout.Y implements androidx.compose.ui.layout.D, InterfaceC1180a, I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1204z f14444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14445h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p013b0.a f14451o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> f14453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14454r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14459w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f14461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14462z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14446i = BrazeLogger.SUPPRESS;
    public int j = BrazeLogger.SUPPRESS;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LayoutNode.UsageByParent f14447k = LayoutNode.UsageByParent.f14433d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14452p = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PlacedState f14455s = PlacedState.f14465d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f14456t = new A(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<LookaheadPassDelegate> f14457u = new androidx.compose.runtime.collection.c<>(new LookaheadPassDelegate[16]);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14458v = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14460x = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LookaheadPassDelegate.kt */
    public static final class PlacedState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PlacedState f14463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PlacedState f14464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final PlacedState f14465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ PlacedState[] f14466e;

        static {
            PlacedState placedState = new PlacedState("IsPlacedInLookahead", 0);
            f14463b = placedState;
            PlacedState placedState2 = new PlacedState("IsPlacedInApproach", 1);
            f14464c = placedState2;
            PlacedState placedState3 = new PlacedState("IsNotPlaced", 2);
            f14465d = placedState3;
            PlacedState[] placedStateArr = {placedState, placedState2, placedState3};
            f14466e = placedStateArr;
            kotlin.enums.a.a(placedStateArr);
        }

        public PlacedState() {
            throw null;
        }

        public static PlacedState valueOf(String str) {
            return (PlacedState) Enum.valueOf(PlacedState.class, str);
        }

        public static PlacedState[] values() {
            return (PlacedState[]) f14466e.clone();
        }
    }

    public LookaheadPassDelegate(C1204z c1204z) {
        this.f14444g = c1204z;
        this.f14461y = c1204z.f14641p.f14496t;
    }

    public final void C0() {
        LayoutNode.UsageByParent usageByParent;
        C1204z c1204z = this.f14444g;
        LayoutNode.d0(c1204z.f14627a, false, 7);
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

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final InterfaceC1180a E() {
        C1204z c1204z;
        LayoutNode layoutNodeG = this.f14444g.f14627a.G();
        if (layoutNodeG == null || (c1204z = layoutNodeG.f14390H) == null) {
            return null;
        }
        return c1204z.f14642q;
    }

    public final void E0() {
        C1204z c1204z;
        LayoutNode.LayoutState layoutState;
        this.f14462z = true;
        C1204z c1204z2 = this.f14444g;
        LayoutNode layoutNodeG = c1204z2.f14627a.G();
        PlacedState placedState = this.f14455s;
        if ((placedState != PlacedState.f14463b && !c1204z2.f14629c) || (placedState != PlacedState.f14464c && c1204z2.f14629c)) {
            x0();
            if (this.f14445h && layoutNodeG != null) {
                layoutNodeG.c0(false);
            }
        }
        if (layoutNodeG == null) {
            this.j = 0;
        } else if (!this.f14445h && ((layoutState = (c1204z = layoutNodeG.f14390H).f14630d) == LayoutNode.LayoutState.f14427d || layoutState == LayoutNode.LayoutState.f14428e)) {
            if (this.j != Integer.MAX_VALUE) {
                R.a.b("Place was called on a node which was placed already");
            }
            int i10 = c1204z.f14634h;
            this.j = i10;
            c1204z.f14634h = i10 + 1;
        }
        Z();
    }

    public final void F0(final long j, Ia.l lVar, androidx.compose.ui.graphics.layer.b bVar) {
        C1204z c1204z = this.f14444g;
        LayoutNode layoutNodeG = c1204z.f14627a.G();
        LayoutNode.LayoutState layoutState = layoutNodeG != null ? layoutNodeG.f14390H.f14630d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f14428e;
        if (layoutState == layoutState2) {
            c1204z.f14629c = false;
        }
        LayoutNode layoutNode = c1204z.f14627a;
        if (layoutNode.f14399Q) {
            R.a.a("place is called on a deactivated node");
        }
        c1204z.f14630d = layoutState2;
        this.f14449m = true;
        this.f14462z = false;
        if (!p013b0.j.b(j, this.f14452p)) {
            if (c1204z.f14639n || c1204z.f14638m) {
                c1204z.f14632f = true;
            }
            y0();
        }
        final U uA = C1203y.a(layoutNode);
        if (c1204z.f14632f || !r()) {
            c1204z.f(false);
            this.f14456t.f14311g = false;
            OwnerSnapshotObserver snapshotObserver = uA.getSnapshotObserver();
            Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$placeSelf$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0026  */
                /* JADX WARN: Code duplicated, block: B:13:0x0032  */
                @Override // Ia.a
                public final p293xa.r invoke() {
                    NodeCoordinator nodeCoordinator;
                    D dR1;
                    androidx.compose.ui.layout.Y.a placementScope = null;
                    if (C2479a.l(this.this$0.f14444g.f14627a)) {
                        nodeCoordinator = this.this$0.f14444g.a().f14529r;
                        if (nodeCoordinator != null) {
                            placementScope = nodeCoordinator.j;
                        }
                    } else {
                        C1204z c1204z2 = this.this$0.f14444g;
                        if (c1204z2.f14629c) {
                            nodeCoordinator = this.this$0.f14444g.a().f14529r;
                            if (nodeCoordinator != null) {
                                placementScope = nodeCoordinator.j;
                            }
                        } else {
                            NodeCoordinator nodeCoordinator2 = c1204z2.a().f14529r;
                            if (nodeCoordinator2 != null && (dR1 = nodeCoordinator2.r1()) != null) {
                                placementScope = dR1.j;
                            }
                        }
                    }
                    if (placementScope == null) {
                        placementScope = uA.getPlacementScope();
                    }
                    LookaheadPassDelegate lookaheadPassDelegate = this.this$0;
                    long j10 = j;
                    D dR2 = lookaheadPassDelegate.f14444g.a().r1();
                    kotlin.jvm.internal.i.b(dR2);
                    androidx.compose.ui.layout.Y.a.f(placementScope, dR2, j10);
                    return p293xa.r.f47939a;
                }
            };
            snapshotObserver.getClass();
            if (layoutNode.f14407i != null) {
                snapshotObserver.b(layoutNode, snapshotObserver.f14558g, aVar);
            } else {
                snapshotObserver.b(layoutNode, snapshotObserver.f14557f, aVar);
            }
        } else {
            D dR1 = c1204z.a().r1();
            kotlin.jvm.internal.i.b(dR1);
            dR1.c1(p013b0.j.d(j, dR1.f14224f));
            E0();
        }
        this.f14452p = j;
        this.f14453q = lVar;
        this.f14454r = bVar;
        c1204z.f14630d = LayoutNode.LayoutState.f14429f;
    }

    public final boolean G0(final long j) {
        long j10;
        C1204z c1204z = this.f14444g;
        if (c1204z.f14627a.f14399Q) {
            R.a.a("measure is called on a deactivated node");
        }
        LayoutNode layoutNode = c1204z.f14627a;
        LayoutNode layoutNodeG = layoutNode.G();
        layoutNode.f14388F = layoutNode.f14388F || (layoutNodeG != null && layoutNodeG.f14388F);
        if (!layoutNode.f14390H.f14631e) {
            p013b0.a aVar = this.f14451o;
            if (aVar == null ? false : p013b0.a.b(aVar.f20475a, j)) {
                AndroidComposeView androidComposeView = layoutNode.f14412o;
                if (androidComposeView != null) {
                    androidComposeView.t(layoutNode, true);
                }
                layoutNode.h0();
                return false;
            }
        }
        this.f14451o = new p013b0.a(j);
        u0(j);
        this.f14456t.f14310f = false;
        h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$2
            @Override // Ia.l
            public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                interfaceC1180a.o().f14307c = false;
                return p293xa.r.f47939a;
            }
        });
        if (this.f14450n) {
            j10 = this.f14222d;
        } else {
            long j11 = Integer.MIN_VALUE;
            j10 = (j11 & 4294967295L) | (j11 << 32);
        }
        this.f14450n = true;
        D dR1 = c1204z.a().r1();
        if (!(dR1 != null)) {
            R.a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        final LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        if (lookaheadPassDelegate != null) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f14426c;
            C1204z c1204z2 = lookaheadPassDelegate.f14444g;
            c1204z2.f14630d = layoutState;
            c1204z2.f14631e = false;
            LayoutNode layoutNode2 = c1204z2.f14627a;
            OwnerSnapshotObserver snapshotObserver = C1203y.a(layoutNode2).getSnapshotObserver();
            Ia.a<p293xa.r> aVar2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    D dR2 = this.this$0.f14444g.a().r1();
                    kotlin.jvm.internal.i.b(dR2);
                    dR2.Q(j);
                    return p293xa.r.f47939a;
                }
            };
            snapshotObserver.getClass();
            if (layoutNode2.f14407i != null) {
                snapshotObserver.b(layoutNode2, snapshotObserver.f14553b, aVar2);
            } else {
                snapshotObserver.b(layoutNode2, snapshotObserver.f14554c, aVar2);
            }
            c1204z2.f14632f = true;
            c1204z2.f14633g = true;
            boolean zL = C2479a.l(layoutNode2);
            MeasurePassDelegate measurePassDelegate = c1204z2.f14641p;
            if (zL) {
                measurePassDelegate.f14500x = true;
                measurePassDelegate.f14501y = true;
            } else {
                measurePassDelegate.f14499w = true;
            }
            c1204z2.f14630d = LayoutNode.LayoutState.f14429f;
        }
        t0((((long) dR1.f14221c) & 4294967295L) | (((long) dR1.f14220b) << 32));
        return (((int) (j10 >> 32)) == dR1.f14220b && ((int) (j10 & 4294967295L)) == dR1.f14221c) ? false : true;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        C0();
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.I(i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        C0();
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.J(i10);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.compose.ui.layout.D
    public final androidx.compose.ui.layout.Y Q(long j) {
        LayoutNode.UsageByParent usageByParent;
        C1204z c1204z = this.f14444g;
        LayoutNode layoutNodeG = c1204z.f14627a.G();
        if ((layoutNodeG != null ? layoutNodeG.f14390H.f14630d : null) == LayoutNode.LayoutState.f14426c) {
            c1204z.f14628b = false;
        } else {
            LayoutNode layoutNodeG2 = c1204z.f14627a.G();
            if ((layoutNodeG2 != null ? layoutNodeG2.f14390H.f14630d : null) == LayoutNode.LayoutState.f14428e) {
                c1204z.f14628b = false;
            }
        }
        LayoutNode layoutNode = c1204z.f14627a;
        LayoutNode layoutNodeG3 = layoutNode.G();
        if (layoutNodeG3 != null) {
            if (this.f14447k != LayoutNode.UsageByParent.f14433d && !layoutNode.f14388F) {
                R.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            C1204z c1204z2 = layoutNodeG3.f14390H;
            int iOrdinal = c1204z2.f14630d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                usageByParent = LayoutNode.UsageByParent.f14431b;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c1204z2.f14630d);
                }
                usageByParent = LayoutNode.UsageByParent.f14432c;
            }
            this.f14447k = usageByParent;
        } else {
            this.f14447k = LayoutNode.UsageByParent.f14433d;
        }
        LayoutNode layoutNode2 = c1204z.f14627a;
        if (layoutNode2.f14386D == LayoutNode.UsageByParent.f14433d) {
            layoutNode2.o();
        }
        G0(j);
        return this;
    }

    @Override // androidx.compose.ui.layout.I
    public final int V(AbstractC1155a abstractC1155a) {
        C1204z c1204z = this.f14444g;
        LayoutNode layoutNodeG = c1204z.f14627a.G();
        LayoutNode.LayoutState layoutState = layoutNodeG != null ? layoutNodeG.f14390H.f14630d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f14426c;
        A a10 = this.f14456t;
        if (layoutState == layoutState2) {
            a10.f14307c = true;
        } else {
            LayoutNode layoutNodeG2 = c1204z.f14627a.G();
            if ((layoutNodeG2 != null ? layoutNodeG2.f14390H.f14630d : null) == LayoutNode.LayoutState.f14428e) {
                a10.f14308d = true;
            }
        }
        this.f14448l = true;
        D dR1 = c1204z.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        int iV = dR1.V(abstractC1155a);
        this.f14448l = false;
        return iV;
    }

    @Override // androidx.compose.ui.node.I
    public final void Y(boolean z10) {
        D dR1;
        C1204z c1204z = this.f14444g;
        D dR2 = c1204z.a().r1();
        if (Boolean.valueOf(z10).equals(dR2 != null ? Boolean.valueOf(dR2.f14438g) : null) || (dR1 = c1204z.a().r1()) == null) {
            return;
        }
        dR1.f14438g = z10;
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void Z() {
        this.f14459w = true;
        A a10 = this.f14456t;
        a10.i();
        C1204z c1204z = this.f14444g;
        boolean z10 = c1204z.f14632f;
        LayoutNode layoutNode = c1204z.f14627a;
        if (z10) {
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (layoutNode2.f14390H.f14631e && layoutNode2.E() == LayoutNode.UsageByParent.f14431b) {
                    C1204z c1204z2 = layoutNode2.f14390H;
                    LookaheadPassDelegate lookaheadPassDelegate = c1204z2.f14642q;
                    kotlin.jvm.internal.i.b(lookaheadPassDelegate);
                    LookaheadPassDelegate lookaheadPassDelegate2 = c1204z2.f14642q;
                    p013b0.a aVar = lookaheadPassDelegate2 != null ? lookaheadPassDelegate2.f14451o : null;
                    kotlin.jvm.internal.i.b(aVar);
                    if (lookaheadPassDelegate.G0(aVar.f20475a)) {
                        LayoutNode.d0(layoutNode, false, 7);
                    }
                }
            }
        }
        final C1195p.a aVar2 = x().f14603T;
        kotlin.jvm.internal.i.b(aVar2);
        if (c1204z.f14633g || (!this.f14448l && !aVar2.f14440i && c1204z.f14632f)) {
            c1204z.f14632f = false;
            LayoutNode.LayoutState layoutState = c1204z.f14630d;
            c1204z.f14630d = LayoutNode.LayoutState.f14428e;
            U uA = C1203y.a(layoutNode);
            c1204z.g(false);
            OwnerSnapshotObserver snapshotObserver = uA.getSnapshotObserver();
            Ia.a<p293xa.r> aVar3 = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    C1204z c1204z3 = this.this$0.f14444g;
                    c1204z3.f14634h = 0;
                    androidx.compose.runtime.collection.c<LayoutNode> cVarJ2 = c1204z3.f14627a.J();
                    LayoutNode[] layoutNodeArr2 = cVarJ2.f12943b;
                    int i12 = cVarJ2.f12945d;
                    for (int i13 = 0; i13 < i12; i13++) {
                        LookaheadPassDelegate lookaheadPassDelegate3 = layoutNodeArr2[i13].f14390H.f14642q;
                        kotlin.jvm.internal.i.b(lookaheadPassDelegate3);
                        lookaheadPassDelegate3.f14446i = lookaheadPassDelegate3.j;
                        lookaheadPassDelegate3.j = BrazeLogger.SUPPRESS;
                        if (lookaheadPassDelegate3.f14447k == LayoutNode.UsageByParent.f14432c) {
                            lookaheadPassDelegate3.f14447k = LayoutNode.UsageByParent.f14433d;
                        }
                    }
                    this.this$0.h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.1
                        @Override // Ia.l
                        public final p293xa.r invoke(InterfaceC1180a interfaceC1180a) {
                            interfaceC1180a.o().f14308d = false;
                            return p293xa.r.f47939a;
                        }
                    });
                    C1195p.a aVar4 = this.this$0.x().f14603T;
                    if (aVar4 != null) {
                        boolean z11 = aVar4.f14440i;
                        List<LayoutNode> listA = this.this$0.f14444g.f14627a.A();
                        int size = listA.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            D dR1 = ((LayoutNode) ((androidx.compose.runtime.collection.c.a) listA).get(i14)).f14389G.f14366c.r1();
                            if (dR1 != null) {
                                dR1.f14440i = z11;
                            }
                        }
                    }
                    aVar2.F0().p();
                    if (this.this$0.x().f14603T != null) {
                        List<LayoutNode> listA2 = this.this$0.f14444g.f14627a.A();
                        int size2 = listA2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            D dR2 = ((LayoutNode) ((androidx.compose.runtime.collection.c.a) listA2).get(i15)).f14389G.f14366c.r1();
                            if (dR2 != null) {
                                dR2.f14440i = false;
                            }
                        }
                    }
                    androidx.compose.runtime.collection.c<LayoutNode> cVarJ3 = this.this$0.f14444g.f14627a.J();
                    LayoutNode[] layoutNodeArr3 = cVarJ3.f12943b;
                    int i16 = cVarJ3.f12945d;
                    for (int i17 = 0; i17 < i16; i17++) {
                        LookaheadPassDelegate lookaheadPassDelegate4 = layoutNodeArr3[i17].f14390H.f14642q;
                        kotlin.jvm.internal.i.b(lookaheadPassDelegate4);
                        int i18 = lookaheadPassDelegate4.f14446i;
                        int i19 = lookaheadPassDelegate4.j;
                        if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                            lookaheadPassDelegate4.v0(true);
                        }
                    }
                    this.this$0.h0(new Ia.l<InterfaceC1180a, p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildren$1.4
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
            snapshotObserver.getClass();
            if (layoutNode.f14407i != null) {
                snapshotObserver.b(layoutNode, snapshotObserver.f14559h, aVar3);
            } else {
                snapshotObserver.b(layoutNode, snapshotObserver.f14556e, aVar3);
            }
            c1204z.f14630d = layoutState;
            if (c1204z.f14638m && aVar2.f14440i) {
                requestLayout();
            }
            c1204z.f14633g = false;
        }
        if (a10.f14308d) {
            a10.f14309e = true;
        }
        if (a10.f14306b && a10.f()) {
            a10.h();
        }
        this.f14459w = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void h0(Ia.l<? super InterfaceC1180a, p293xa.r> lVar) {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = this.f14444g.f14627a.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i11].f14390H.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            lVar.invoke(lookaheadPassDelegate);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void j0() {
        LayoutNode.d0(this.f14444g.f14627a, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        C0();
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.k0(i10);
    }

    @Override // androidx.compose.ui.layout.Y
    public final int l0() {
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.l0();
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final AlignmentLines o() {
        return this.f14456t;
    }

    @Override // androidx.compose.ui.layout.Y
    public final int o0() {
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.o0();
    }

    @Override // androidx.compose.ui.layout.I, androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        return this.f14461y;
    }

    @Override // androidx.compose.ui.layout.Y
    public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        F0(j, lVar, null);
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final boolean r() {
        return this.f14455s != PlacedState.f14465d;
    }

    @Override // androidx.compose.ui.layout.Y
    public final void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        F0(j, null, bVar);
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final void requestLayout() {
        LayoutNode layoutNode = this.f14444g.f14627a;
        LayoutNode.b bVar = LayoutNode.f14379R;
        layoutNode.c0(false);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        C0();
        D dR1 = this.f14444g.a().r1();
        kotlin.jvm.internal.i.b(dR1);
        return dR1.s(i10);
    }

    public final void v0(boolean z10) {
        C1204z c1204z = this.f14444g;
        if (z10 && c1204z.f14629c) {
            return;
        }
        if (z10 || c1204z.f14629c) {
            this.f14455s = PlacedState.f14465d;
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i11].f14390H.f14642q;
                kotlin.jvm.internal.i.b(lookaheadPassDelegate);
                lookaheadPassDelegate.v0(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1180a
    public final C1195p x() {
        return this.f14444g.f14627a.f14389G.f14365b;
    }

    public final void x0() {
        PlacedState placedState = this.f14455s;
        C1204z c1204z = this.f14444g;
        if (c1204z.f14629c) {
            this.f14455s = PlacedState.f14464c;
        } else {
            this.f14455s = PlacedState.f14463b;
        }
        PlacedState placedState2 = PlacedState.f14463b;
        LayoutNode layoutNode = c1204z.f14627a;
        if (placedState != placedState2 && c1204z.f14631e) {
            LayoutNode.d0(layoutNode, true, 6);
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode2.f14390H.f14642q;
            if (lookaheadPassDelegate == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (lookaheadPassDelegate.j != Integer.MAX_VALUE) {
                lookaheadPassDelegate.x0();
                LayoutNode.g0(layoutNode2);
            }
        }
    }

    public final void y0() {
        C1204z c1204z = this.f14444g;
        if (c1204z.f14640o > 0) {
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = c1204z.f14627a.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LayoutNode layoutNode = layoutNodeArr[i11];
                C1204z c1204z2 = layoutNode.f14390H;
                if ((c1204z2.f14638m || c1204z2.f14639n) && !c1204z2.f14632f) {
                    layoutNode.c0(false);
                }
                LookaheadPassDelegate lookaheadPassDelegate = c1204z2.f14642q;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.y0();
                }
            }
        }
    }
}
