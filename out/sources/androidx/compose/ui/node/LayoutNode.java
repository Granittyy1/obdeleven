package androidx.compose.ui.node;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.InterfaceC1082e;
import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.layout.C1178y;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.layout.InterfaceC1173t;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode implements InterfaceC1082e, androidx.compose.ui.layout.Z, V, InterfaceC1173t, androidx.compose.ui.semantics.m, ComposeUiNode, U.a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final b f14379R = new b("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final Ia.a<LayoutNode> f14380S = new Ia.a<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        @Override // Ia.a
        public final LayoutNode invoke() {
            return new LayoutNode(false, 3, 0);
        }
    };

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final a f14381T = new a();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C1200v f14382U = new C1200v();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LayoutDirection f14383A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Y0 f14384B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public androidx.compose.runtime.r f14385C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public UsageByParent f14386D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public UsageByParent f14387E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f14388F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final K f14389G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1204z f14390H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C1178y f14391I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public NodeCoordinator f14392J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14393K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public androidx.compose.ui.h f14394L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public androidx.compose.ui.h f14395M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Ia.l<? super U, p293xa.r> f14396N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Ia.l<? super U, p293xa.r> f14397O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f14398P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f14399Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LayoutNode f14407i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J<LayoutNode> f14408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.compose.runtime.collection.c<LayoutNode> f14409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LayoutNode f14411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AndroidComposeView f14412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AndroidViewHolder f14413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.compose.ui.semantics.l f14417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<LayoutNode> f14419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.compose.ui.layout.E f14421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.compose.foundation.lazy.grid.x f14422y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p013b0.c f14423z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class LayoutState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final LayoutState f14425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final LayoutState f14426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final LayoutState f14427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final LayoutState f14428e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final LayoutState f14429f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LayoutState[] f14430g;

        static {
            LayoutState layoutState = new LayoutState("Measuring", 0);
            f14425b = layoutState;
            LayoutState layoutState2 = new LayoutState("LookaheadMeasuring", 1);
            f14426c = layoutState2;
            LayoutState layoutState3 = new LayoutState("LayingOut", 2);
            f14427d = layoutState3;
            LayoutState layoutState4 = new LayoutState("LookaheadLayingOut", 3);
            f14428e = layoutState4;
            LayoutState layoutState5 = new LayoutState("Idle", 4);
            f14429f = layoutState5;
            LayoutState[] layoutStateArr = {layoutState, layoutState2, layoutState3, layoutState4, layoutState5};
            f14430g = layoutStateArr;
            kotlin.enums.a.a(layoutStateArr);
        }

        public LayoutState() {
            throw null;
        }

        public static LayoutState valueOf(String str) {
            return (LayoutState) Enum.valueOf(LayoutState.class, str);
        }

        public static LayoutState[] values() {
            return (LayoutState[]) f14430g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class UsageByParent {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final UsageByParent f14431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UsageByParent f14432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final UsageByParent f14433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ UsageByParent[] f14434e;

        static {
            UsageByParent usageByParent = new UsageByParent("InMeasureBlock", 0);
            f14431b = usageByParent;
            UsageByParent usageByParent2 = new UsageByParent("InLayoutBlock", 1);
            f14432c = usageByParent2;
            UsageByParent usageByParent3 = new UsageByParent("NotUsed", 2);
            f14433d = usageByParent3;
            UsageByParent[] usageByParentArr = {usageByParent, usageByParent2, usageByParent3};
            f14434e = usageByParentArr;
            kotlin.enums.a.a(usageByParentArr);
        }

        public UsageByParent() {
            throw null;
        }

        public static UsageByParent valueOf(String str) {
            return (UsageByParent) Enum.valueOf(UsageByParent.class, str);
        }

        public static UsageByParent[] values() {
            return (UsageByParent[]) f14434e.clone();
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class a implements Y0 {
        @Override // androidx.compose.ui.platform.Y0
        public final long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.Y0
        public final long b() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.Y0
        public final long d() {
            return 0L;
        }

        @Override // androidx.compose.ui.platform.Y0
        public final float f() {
            return 16.0f;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public static final class b extends c {
        @Override // androidx.compose.ui.layout.E
        public final androidx.compose.ui.layout.F g(androidx.compose.ui.layout.H h8, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public static abstract class c implements androidx.compose.ui.layout.E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14435a;

        public c(String str) {
            this.f14435a = str;
        }

        @Override // androidx.compose.ui.layout.E
        public final int h(InterfaceC1167m interfaceC1167m, List list, int i10) {
            throw new IllegalStateException(this.f14435a.toString());
        }

        @Override // androidx.compose.ui.layout.E
        public final int i(InterfaceC1167m interfaceC1167m, List list, int i10) {
            throw new IllegalStateException(this.f14435a.toString());
        }

        @Override // androidx.compose.ui.layout.E
        public final int j(InterfaceC1167m interfaceC1167m, List list, int i10) {
            throw new IllegalStateException(this.f14435a.toString());
        }

        @Override // androidx.compose.ui.layout.E
        public final int m(InterfaceC1167m interfaceC1167m, List list, int i10) {
            throw new IllegalStateException(this.f14435a.toString());
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14436a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                LayoutState layoutState = LayoutState.f14425b;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14436a = iArr;
        }
    }

    public LayoutNode() {
        this(false, 3, 0);
    }

    public static boolean X(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate = layoutNode.f14390H.f14641p;
        return layoutNode.W(measurePassDelegate.f14487k ? new p013b0.a(measurePassDelegate.f14223e) : null);
    }

    public static void d0(LayoutNode layoutNode, boolean z10, int i10) {
        LayoutNode layoutNodeG;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (layoutNode.f14407i == null) {
            R.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        AndroidComposeView androidComposeView = layoutNode.f14412o;
        if (androidComposeView == null || layoutNode.f14415r || layoutNode.f14400b) {
            return;
        }
        androidComposeView.I(layoutNode, true, z10, z11);
        if (z12) {
            LookaheadPassDelegate lookaheadPassDelegate = layoutNode.f14390H.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            C1204z c1204z = lookaheadPassDelegate.f14444g;
            LayoutNode layoutNodeG2 = c1204z.f14627a.G();
            UsageByParent usageByParent = c1204z.f14627a.f14386D;
            if (layoutNodeG2 == null || usageByParent == UsageByParent.f14433d) {
                return;
            }
            while (layoutNodeG2.f14386D == usageByParent && (layoutNodeG = layoutNodeG2.G()) != null) {
                layoutNodeG2 = layoutNodeG;
            }
            int iOrdinal = usageByParent.ordinal();
            if (iOrdinal == 0) {
                if (layoutNodeG2.f14407i != null) {
                    d0(layoutNodeG2, z10, 6);
                    return;
                } else {
                    f0(layoutNodeG2, z10, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (layoutNodeG2.f14407i != null) {
                layoutNodeG2.c0(z10);
            } else {
                layoutNodeG2.e0(z10);
            }
        }
    }

    public static void f0(LayoutNode layoutNode, boolean z10, int i10) {
        AndroidComposeView androidComposeView;
        LayoutNode layoutNodeG;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 2) != 0;
        boolean z12 = (i10 & 4) != 0;
        if (layoutNode.f14415r || layoutNode.f14400b || (androidComposeView = layoutNode.f14412o) == null) {
            return;
        }
        androidComposeView.I(layoutNode, false, z10, z11);
        if (z12) {
            C1204z c1204z = layoutNode.f14390H.f14641p.f14484g;
            LayoutNode layoutNodeG2 = c1204z.f14627a.G();
            UsageByParent usageByParent = c1204z.f14627a.f14386D;
            if (layoutNodeG2 == null || usageByParent == UsageByParent.f14433d) {
                return;
            }
            while (layoutNodeG2.f14386D == usageByParent && (layoutNodeG = layoutNodeG2.G()) != null) {
                layoutNodeG2 = layoutNodeG;
            }
            int iOrdinal = usageByParent.ordinal();
            if (iOrdinal == 0) {
                f0(layoutNodeG2, z10, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                layoutNodeG2.e0(z10);
            }
        }
    }

    public static void g0(LayoutNode layoutNode) {
        int i10 = d.f14436a[layoutNode.f14390H.f14630d.ordinal()];
        C1204z c1204z = layoutNode.f14390H;
        if (i10 != 1) {
            throw new IllegalStateException("Unexpected state " + c1204z.f14630d);
        }
        if (c1204z.f14631e) {
            d0(layoutNode, true, 6);
            return;
        }
        if (c1204z.f14632f) {
            layoutNode.c0(true);
        }
        if (layoutNode.D()) {
            f0(layoutNode, true, 6);
        } else if (layoutNode.C()) {
            layoutNode.e0(true);
        }
    }

    private final String x(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(layoutNode);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(u(0));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode.f14411n;
        sb2.append(layoutNode2 != null ? layoutNode2.u(0) : null);
        return sb2.toString();
    }

    public final List<LayoutNode> A() {
        return J().i();
    }

    public final List<LayoutNode> B() {
        return this.f14408k.f14362a.i();
    }

    public final boolean C() {
        return this.f14390H.f14641p.f14500x;
    }

    public final boolean D() {
        return this.f14390H.f14641p.f14499w;
    }

    public final UsageByParent E() {
        UsageByParent usageByParent;
        LookaheadPassDelegate lookaheadPassDelegate = this.f14390H.f14642q;
        return (lookaheadPassDelegate == null || (usageByParent = lookaheadPassDelegate.f14447k) == null) ? UsageByParent.f14433d : usageByParent;
    }

    public final androidx.compose.foundation.lazy.grid.x F() {
        androidx.compose.foundation.lazy.grid.x xVar = this.f14422y;
        if (xVar != null) {
            return xVar;
        }
        androidx.compose.foundation.lazy.grid.x xVar2 = new androidx.compose.foundation.lazy.grid.x(this, this.f14421x);
        this.f14422y = xVar2;
        return xVar2;
    }

    public final LayoutNode G() {
        LayoutNode layoutNode = this.f14411n;
        while (layoutNode != null && layoutNode.f14400b) {
            layoutNode = layoutNode.f14411n;
        }
        return layoutNode;
    }

    public final int H() {
        return this.f14390H.f14641p.j;
    }

    public final androidx.compose.runtime.collection.c<LayoutNode> I() {
        boolean z10 = this.f14420w;
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f14419v;
        if (z10) {
            cVar.j();
            cVar.d(cVar.f12945d, J());
            cVar.s(f14382U);
            this.f14420w = false;
        }
        return cVar;
    }

    public final androidx.compose.runtime.collection.c<LayoutNode> J() {
        l0();
        if (this.j == 0) {
            return this.f14408k.f14362a;
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f14409l;
        kotlin.jvm.internal.i.b(cVar);
        return cVar;
    }

    public final void K(long j, C1194o c1194o, int i10, boolean z10) {
        K k10 = this.f14389G;
        NodeCoordinator nodeCoordinator = k10.f14366c;
        Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
        k10.f14366c.E1(NodeCoordinator.f14512Q, nodeCoordinator.p1(j, true), c1194o, i10, z10);
    }

    public final void L(int i10, LayoutNode layoutNode) {
        if (layoutNode.f14411n != null && layoutNode.f14412o != null) {
            R.a.b(x(layoutNode));
        }
        layoutNode.f14411n = this;
        J<LayoutNode> j = this.f14408k;
        j.f14362a.a(i10, layoutNode);
        ((LayoutNode$_foldedChildren$1) j.f14363b).invoke();
        V();
        if (layoutNode.f14400b) {
            this.j++;
        }
        Q();
        AndroidComposeView androidComposeView = this.f14412o;
        if (androidComposeView != null) {
            layoutNode.n(androidComposeView);
        }
        if (layoutNode.f14390H.f14637l > 0) {
            C1204z c1204z = this.f14390H;
            c1204z.b(c1204z.f14637l + 1);
        }
    }

    public final void M() {
        if (this.f14393K) {
            K k10 = this.f14389G;
            NodeCoordinator nodeCoordinator = k10.f14365b;
            NodeCoordinator nodeCoordinator2 = k10.f14366c.f14529r;
            this.f14392J = null;
            while (!kotlin.jvm.internal.i.a(nodeCoordinator, nodeCoordinator2)) {
                if ((nodeCoordinator != null ? nodeCoordinator.f14523J : null) != null) {
                    this.f14392J = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.f14529r : null;
            }
        }
        NodeCoordinator nodeCoordinator3 = this.f14392J;
        if (nodeCoordinator3 != null && nodeCoordinator3.f14523J == null) {
            throw C4.v.g("layer was not set");
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.G1();
            return;
        }
        LayoutNode layoutNodeG = G();
        if (layoutNodeG != null) {
            layoutNodeG.M();
        }
    }

    public final void N() {
        K k10 = this.f14389G;
        C1195p c1195p = k10.f14365b;
        for (NodeCoordinator nodeCoordinator = k10.f14366c; nodeCoordinator != c1195p; nodeCoordinator = nodeCoordinator.f14528q) {
            kotlin.jvm.internal.i.c(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            T t8 = ((C1199u) nodeCoordinator).f14523J;
            if (t8 != null) {
                t8.invalidate();
            }
        }
        T t10 = k10.f14365b.f14523J;
        if (t10 != null) {
            t10.invalidate();
        }
    }

    public final void O() {
        this.f14405g = true;
        if (this.f14407i != null) {
            d0(this, false, 7);
        } else {
            f0(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.semantics.l] */
    public final void P() {
        if (this.f14418u) {
            return;
        }
        this.f14389G.getClass();
        if (L.f14378a.f13990g != null || this.f14395M != null) {
            this.f14416s = true;
            return;
        }
        androidx.compose.ui.semantics.l lVar = this.f14417t;
        this.f14418u = true;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new androidx.compose.ui.semantics.l();
        OwnerSnapshotObserver snapshotObserver = C1203y.a(this).getSnapshotObserver();
        snapshotObserver.b(this, snapshotObserver.f14555d, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.h$c] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.h$c] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r4v0 */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.c] */
            /* JADX WARN: Type inference failed for: r4v4 */
            /* JADX WARN: Type inference failed for: r4v5 */
            /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.c] */
            /* JADX WARN: Type inference failed for: r4v8 */
            /* JADX WARN: Type inference failed for: r4v9 */
            /* JADX WARN: Type inference failed for: r5v11 */
            /* JADX WARN: Type inference failed for: r5v7, types: [T, androidx.compose.ui.semantics.l] */
            @Override // Ia.a
            public final p293xa.r invoke() {
                K k10 = this.this$0.f14389G;
                Ref$ObjectRef<androidx.compose.ui.semantics.l> ref$ObjectRef2 = ref$ObjectRef;
                if ((k10.f14368e.f13988e & 8) != 0) {
                    for (androidx.compose.ui.h.c cVar = k10.f14367d; cVar != null; cVar = cVar.f13989f) {
                        if ((cVar.f13987d & 8) != 0) {
                            ?? B10 = cVar;
                            ?? cVar2 = 0;
                            while (B10 != 0) {
                                if (B10 instanceof b0) {
                                    b0 b0Var = (b0) B10;
                                    if (b0Var.v0()) {
                                        ?? lVar2 = new androidx.compose.ui.semantics.l();
                                        ref$ObjectRef2.element = lVar2;
                                        lVar2.f15237e = true;
                                    }
                                    if (b0Var.v1()) {
                                        ref$ObjectRef2.element.f15236d = true;
                                    }
                                    b0Var.p1(ref$ObjectRef2.element);
                                } else if ((B10.f13987d & 8) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                    int i10 = 0;
                                    while (cVar3 != null) {
                                        if ((cVar3.f13987d & 8) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                B10 = B10;
                                                cVar2 = cVar2;
                                                cVar2 = cVar2;
                                                B10 = cVar3;
                                            } else {
                                                if (cVar2 == 0) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar2.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar2.b(cVar3);
                                            }
                                        } else {
                                            B10 = B10;
                                            cVar2 = cVar2;
                                        }
                                        cVar3 = cVar3.f13990g;
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                    if (i10 == 1) {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    } else {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                }
                                B10 = C1185f.b(cVar2);
                            }
                        }
                    }
                }
                return p293xa.r.f47939a;
            }
        });
        this.f14418u = false;
        this.f14417t = (androidx.compose.ui.semantics.l) ref$ObjectRef.element;
        this.f14416s = false;
        U uA = C1203y.a(this);
        androidx.collection.I<androidx.compose.ui.semantics.n> i10 = uA.getSemanticsOwner().f15250d;
        Object[] objArr = i10.f9108a;
        int i11 = i10.f9109b;
        for (int i12 = 0; i12 < i11; i12++) {
            ((androidx.compose.ui.semantics.n) objArr[i12]).b(this, lVar);
        }
        ((AndroidComposeView) uA).K();
    }

    public final void Q() {
        LayoutNode layoutNode;
        if (this.j > 0) {
            this.f14410m = true;
        }
        if (!this.f14400b || (layoutNode = this.f14411n) == null) {
            return;
        }
        layoutNode.Q();
    }

    public final Boolean R() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f14390H.f14642q;
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.r());
        }
        return null;
    }

    public final void S() {
        LayoutNode layoutNodeG;
        if (this.f14386D == UsageByParent.f14433d) {
            q();
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f14390H.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        try {
            lookaheadPassDelegate.f14445h = true;
            if (!lookaheadPassDelegate.f14449m) {
                R.a.b("replace() called on item that was not placed");
            }
            lookaheadPassDelegate.f14462z = false;
            boolean zR = lookaheadPassDelegate.r();
            lookaheadPassDelegate.F0(lookaheadPassDelegate.f14452p, lookaheadPassDelegate.f14453q, lookaheadPassDelegate.f14454r);
            if (zR && !lookaheadPassDelegate.f14462z && (layoutNodeG = lookaheadPassDelegate.f14444g.f14627a.G()) != null) {
                layoutNodeG.c0(false);
            }
        } finally {
            lookaheadPassDelegate.f14445h = false;
        }
    }

    public final void T(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            J<LayoutNode> j = this.f14408k;
            LayoutNode layoutNodeP = j.f14362a.p(i14);
            Ia.a<p293xa.r> aVar = j.f14363b;
            ((LayoutNode$_foldedChildren$1) aVar).invoke();
            j.f14362a.a(i15, layoutNodeP);
            ((LayoutNode$_foldedChildren$1) aVar).invoke();
        }
        V();
        Q();
        O();
    }

    public final void U(LayoutNode layoutNode) {
        if (layoutNode.f14390H.f14637l > 0) {
            C1204z c1204z = this.f14390H;
            c1204z.b(c1204z.f14637l - 1);
        }
        if (this.f14412o != null) {
            layoutNode.v();
        }
        layoutNode.f14411n = null;
        layoutNode.f14389G.f14366c.f14529r = null;
        if (layoutNode.f14400b) {
            this.j--;
            androidx.compose.runtime.collection.c<LayoutNode> cVar = layoutNode.f14408k.f14362a;
            LayoutNode[] layoutNodeArr = cVar.f12943b;
            int i10 = cVar.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                layoutNodeArr[i11].f14389G.f14366c.f14529r = null;
            }
        }
        Q();
        V();
    }

    public final void V() {
        if (!this.f14400b) {
            this.f14420w = true;
            return;
        }
        LayoutNode layoutNodeG = G();
        if (layoutNodeG != null) {
            layoutNodeG.V();
        }
    }

    public final boolean W(p013b0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f14386D == UsageByParent.f14433d) {
            o();
        }
        return this.f14390H.f14641p.N0(aVar.f20475a);
    }

    public final void Y() {
        J<LayoutNode> j = this.f14408k;
        int i10 = j.f14362a.f12945d;
        while (true) {
            i10--;
            if (-1 >= i10) {
                j.f14362a.j();
                j.f14363b.invoke();
                return;
            }
            U(j.f14362a.f12943b[i10]);
        }
    }

    public final void Z(int i10, int i11) {
        if (i11 < 0) {
            R.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            J<LayoutNode> j = this.f14408k;
            U(j.f14362a.f12943b[i12]);
            j.f14362a.p(i12);
            ((LayoutNode$_foldedChildren$1) j.f14363b).invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void a() {
        AndroidViewHolder androidViewHolder = this.f14413p;
        if (androidViewHolder != null) {
            androidViewHolder.a();
        }
        C1178y c1178y = this.f14391I;
        if (c1178y != null) {
            c1178y.a();
        }
        K k10 = this.f14389G;
        NodeCoordinator nodeCoordinator = k10.f14365b.f14528q;
        for (NodeCoordinator nodeCoordinator2 = k10.f14366c; !kotlin.jvm.internal.i.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f14528q) {
            nodeCoordinator2.f14530s = true;
            ((NodeCoordinator$invalidateParentLayer$1) nodeCoordinator2.f14521H).invoke();
            if (nodeCoordinator2.f14523J != null) {
                if (nodeCoordinator2.f14524K != null) {
                    nodeCoordinator2.f14524K = null;
                }
                nodeCoordinator2.V1(null, false);
                nodeCoordinator2.f14525n.e0(false);
            }
        }
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // androidx.compose.ui.node.U.a
    public final void b() {
        androidx.compose.ui.h.c cVar;
        K k10 = this.f14389G;
        C1195p c1195p = k10.f14365b;
        boolean zG = N.g(128);
        if (zG) {
            cVar = c1195p.f14602S;
        } else {
            cVar = c1195p.f14602S.f13989f;
            if (cVar == null) {
                return;
            }
        }
        Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
        for (androidx.compose.ui.h.c cVarB1 = c1195p.B1(zG); cVarB1 != null && (cVarB1.f13988e & 128) != 0; cVarB1 = cVarB1.f13990g) {
            if ((cVarB1.f13987d & 128) != 0) {
                ?? B10 = cVarB1;
                ?? cVar2 = 0;
                while (B10 != 0) {
                    if (B10 instanceof InterfaceC1197s) {
                        ((InterfaceC1197s) B10).o0(k10.f14365b);
                    } else if ((B10.f13987d & 128) != 0 && (B10 instanceof AbstractC1187h)) {
                        androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                        int i10 = 0;
                        while (cVar3 != null) {
                            if ((cVar3.f13987d & 128) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    B10 = B10;
                                    cVar2 = cVar2;
                                    cVar2 = cVar2;
                                    B10 = cVar3;
                                } else {
                                    if (cVar2 == 0) {
                                        cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                    }
                                    if (B10 != 0) {
                                        cVar2.b(B10);
                                        B10 = 0;
                                    }
                                    cVar2.b(cVar3);
                                }
                            } else {
                                B10 = B10;
                                cVar2 = cVar2;
                            }
                            cVar3 = cVar3.f13990g;
                            B10 = B10;
                            cVar2 = cVar2;
                        }
                        if (i10 == 1) {
                            B10 = B10;
                            cVar2 = cVar2;
                        } else {
                            B10 = B10;
                            cVar2 = cVar2;
                        }
                    }
                    B10 = C1185f.b(cVar2);
                }
            }
            if (cVarB1 == cVar) {
                return;
            }
        }
    }

    public final void b0() {
        LayoutNode layoutNodeG;
        if (this.f14386D == UsageByParent.f14433d) {
            q();
        }
        MeasurePassDelegate measurePassDelegate = this.f14390H.f14641p;
        measurePassDelegate.getClass();
        try {
            measurePassDelegate.f14485h = true;
            if (!measurePassDelegate.f14488l) {
                R.a.b("replace called on unplaced item");
            }
            boolean z10 = measurePassDelegate.f14497u;
            measurePassDelegate.G0(measurePassDelegate.f14491o, measurePassDelegate.f14494r, measurePassDelegate.f14492p, measurePassDelegate.f14493q);
            if (z10 && !measurePassDelegate.f14477H && (layoutNodeG = measurePassDelegate.f14484g.f14627a.G()) != null) {
                layoutNodeG.e0(false);
            }
        } finally {
            measurePassDelegate.f14485h = false;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1173t
    public final boolean c() {
        return this.f14412o != null;
    }

    public final void c0(boolean z10) {
        AndroidComposeView androidComposeView;
        if (this.f14400b || (androidComposeView = this.f14412o) == null) {
            return;
        }
        androidComposeView.J(this, true, z10);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void d(androidx.compose.ui.layout.E e10) {
        if (kotlin.jvm.internal.i.a(this.f14421x, e10)) {
            return;
        }
        this.f14421x = e10;
        androidx.compose.foundation.lazy.grid.x xVar = this.f14422y;
        if (xVar != null) {
            ((C1085f0) xVar.f10536b).setValue(e10);
        }
        O();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void e(androidx.compose.ui.h hVar) {
        if (this.f14400b && this.f14394L != androidx.compose.ui.h.a.f13984b) {
            R.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f14399Q) {
            R.a.a("modifier is updated when deactivated");
        }
        if (!c()) {
            this.f14395M = hVar;
            return;
        }
        m(hVar);
        if (this.f14416s) {
            P();
        }
    }

    public final void e0(boolean z10) {
        AndroidComposeView androidComposeView;
        this.f14405g = true;
        if (this.f14400b || (androidComposeView = this.f14412o) == null) {
            return;
        }
        androidComposeView.J(this, false, z10);
    }

    @Override // androidx.compose.ui.semantics.m
    public final androidx.compose.ui.semantics.l f() {
        if (c() && !this.f14399Q && this.f14389G.d(8)) {
            return this.f14417t;
        }
        return null;
    }

    @Override // androidx.compose.ui.semantics.m
    public final LayoutNode g() {
        return G();
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void h() {
        AndroidViewHolder androidViewHolder = this.f14413p;
        if (androidViewHolder != null) {
            androidViewHolder.h();
        }
        C1178y c1178y = this.f14391I;
        if (c1178y != null) {
            c1178y.d(true);
        }
        this.f14399Q = true;
        K k10 = this.f14389G;
        for (androidx.compose.ui.h.c cVar = k10.f14367d; cVar != null; cVar = cVar.f13989f) {
            if (cVar.f13997o) {
                cVar.L1();
            }
        }
        k10.f();
        for (androidx.compose.ui.h.c cVar2 = k10.f14367d; cVar2 != null; cVar2 = cVar2.f13989f) {
            if (cVar2.f13997o) {
                cVar2.H1();
            }
        }
        if (c()) {
            this.f14417t = null;
            this.f14416s = false;
        }
        AndroidComposeView androidComposeView = this.f14412o;
        if (androidComposeView != null) {
            androidComposeView.getRectManager().h(this);
            androidx.compose.ui.autofill.b bVar = androidComposeView.f14656F;
            if (bVar != null) {
                if (bVar.f13293h.e(this.f14401c)) {
                    bVar.f13286a.a(bVar.f13288c, this.f14401c, false);
                }
            }
        }
    }

    public final void h0() {
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            UsageByParent usageByParent = layoutNode.f14387E;
            layoutNode.f14386D = usageByParent;
            if (usageByParent != UsageByParent.f14433d) {
                layoutNode.h0();
            }
        }
    }

    @Override // androidx.compose.ui.semantics.m
    public final List<androidx.compose.ui.semantics.m> i() {
        return A();
    }

    public final void i0(p013b0.c cVar) {
        if (kotlin.jvm.internal.i.a(this.f14423z, cVar)) {
            return;
        }
        this.f14423z = cVar;
        O();
        LayoutNode layoutNodeG = G();
        if (layoutNodeG != null) {
            layoutNodeG.M();
        }
        N();
        for (androidx.compose.ui.h.c cVar2 = this.f14389G.f14368e; cVar2 != null; cVar2 = cVar2.f13990g) {
            cVar2.w();
        }
    }

    @Override // androidx.compose.ui.layout.Z
    public final void j() {
        if (this.f14407i != null) {
            d0(this, false, 5);
        } else {
            f0(this, false, 5);
        }
        MeasurePassDelegate measurePassDelegate = this.f14390H.f14641p;
        p013b0.a aVar = measurePassDelegate.f14487k ? new p013b0.a(measurePassDelegate.f14223e) : null;
        if (aVar != null) {
            AndroidComposeView androidComposeView = this.f14412o;
            if (androidComposeView != null) {
                androidComposeView.D(this, aVar.f20475a);
                return;
            }
            return;
        }
        AndroidComposeView androidComposeView2 = this.f14412o;
        if (androidComposeView2 != null) {
            androidComposeView2.C(true);
        }
    }

    public final void j0(LayoutNode layoutNode) {
        if (kotlin.jvm.internal.i.a(layoutNode, this.f14407i)) {
            return;
        }
        this.f14407i = layoutNode;
        C1204z c1204z = this.f14390H;
        if (layoutNode != null) {
            if (c1204z.f14642q == null) {
                c1204z.f14642q = new LookaheadPassDelegate(c1204z);
            }
            K k10 = this.f14389G;
            NodeCoordinator nodeCoordinator = k10.f14365b.f14528q;
            for (NodeCoordinator nodeCoordinator2 = k10.f14366c; !kotlin.jvm.internal.i.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f14528q) {
                nodeCoordinator2.i1();
            }
        } else {
            c1204z.f14642q = null;
        }
        O();
    }

    @Override // androidx.compose.ui.semantics.m
    public final boolean k() {
        return this.f14389G.f14366c.H1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void k0(Y0 y10) {
        if (kotlin.jvm.internal.i.a(this.f14384B, y10)) {
            return;
        }
        this.f14384B = y10;
        androidx.compose.ui.h.c cVar = this.f14389G.f14368e;
        if ((cVar.f13988e & 16) != 0) {
            while (cVar != null) {
                if ((cVar.f13987d & 16) != 0) {
                    ?? B10 = cVar;
                    ?? cVar2 = 0;
                    while (B10 != 0) {
                        if (B10 instanceof Y) {
                            ((Y) B10).r1();
                        } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                            androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                            int i10 = 0;
                            B10 = B10;
                            cVar2 = cVar2;
                            while (cVar3 != null) {
                                if ((cVar3.f13987d & 16) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVar2 = cVar2;
                                        B10 = cVar3;
                                    } else {
                                        if (cVar2 == 0) {
                                            cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                        }
                                        if (B10 != 0) {
                                            cVar2.b(B10);
                                            B10 = 0;
                                        }
                                        cVar2.b(cVar3);
                                    }
                                }
                                cVar3 = cVar3.f13990g;
                                B10 = B10;
                                cVar2 = cVar2;
                            }
                            if (i10 == 1) {
                            }
                        }
                        B10 = C1185f.b(cVar2);
                    }
                }
                if ((cVar.f13988e & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.f13990g;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public final void l(androidx.compose.runtime.r rVar) {
        this.f14385C = rVar;
        i0((p013b0.c) rVar.a(CompositionLocalsKt.f14847h));
        LayoutDirection layoutDirection = (LayoutDirection) rVar.a(CompositionLocalsKt.f14852n);
        if (this.f14383A != layoutDirection) {
            this.f14383A = layoutDirection;
            O();
            LayoutNode layoutNodeG = G();
            if (layoutNodeG != null) {
                layoutNodeG.M();
            }
            N();
            for (androidx.compose.ui.h.c cVar = this.f14389G.f14368e; cVar != null; cVar = cVar.f13990g) {
                cVar.H0();
            }
        }
        k0((Y0) rVar.a(CompositionLocalsKt.f14857s));
        androidx.compose.ui.h.c cVar2 = this.f14389G.f14368e;
        if ((cVar2.f13988e & 32768) != 0) {
            while (cVar2 != null) {
                if ((cVar2.f13987d & 32768) != 0) {
                    ?? B10 = cVar2;
                    ?? cVar3 = 0;
                    while (B10 != 0) {
                        if (B10 instanceof InterfaceC1182c) {
                            androidx.compose.ui.h.c node = ((InterfaceC1182c) B10).getNode();
                            if (node.f13997o) {
                                N.c(node);
                            } else {
                                node.f13993k = true;
                            }
                        } else if ((B10.f13987d & 32768) != 0 && (B10 instanceof AbstractC1187h)) {
                            androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                            int i10 = 0;
                            while (cVar4 != null) {
                                if ((cVar4.f13987d & 32768) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        B10 = B10;
                                        cVar3 = cVar3;
                                        cVar3 = cVar3;
                                        B10 = cVar4;
                                    } else {
                                        if (cVar3 == 0) {
                                            cVar3 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                        }
                                        if (B10 != 0) {
                                            cVar3.b(B10);
                                            B10 = 0;
                                        }
                                        cVar3.b(cVar4);
                                    }
                                } else {
                                    B10 = B10;
                                    cVar3 = cVar3;
                                }
                                cVar4 = cVar4.f13990g;
                                B10 = B10;
                                cVar3 = cVar3;
                            }
                            if (i10 == 1) {
                                B10 = B10;
                                cVar3 = cVar3;
                            } else {
                                B10 = B10;
                                cVar3 = cVar3;
                            }
                        }
                        B10 = C1185f.b(cVar3);
                    }
                }
                if ((cVar2.f13988e & 32768) == 0) {
                    return;
                } else {
                    cVar2 = cVar2.f13990g;
                }
            }
        }
    }

    public final void l0() {
        if (this.j <= 0 || !this.f14410m) {
            return;
        }
        this.f14410m = false;
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f14409l;
        if (cVar == null) {
            cVar = new androidx.compose.runtime.collection.c<>(new LayoutNode[16]);
            this.f14409l = cVar;
        }
        cVar.j();
        androidx.compose.runtime.collection.c<LayoutNode> cVar2 = this.f14408k.f14362a;
        LayoutNode[] layoutNodeArr = cVar2.f12943b;
        int i10 = cVar2.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.f14400b) {
                cVar.d(cVar.f12945d, layoutNode.J());
            } else {
                cVar.b(layoutNode);
            }
        }
        C1204z c1204z = this.f14390H;
        c1204z.f14641p.f14471B = true;
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.f14458v = true;
        }
    }

    public final void m(androidx.compose.ui.h hVar) {
        boolean z10;
        this.f14394L = hVar;
        K k10 = this.f14389G;
        androidx.compose.ui.h.c cVar = k10.f14368e;
        L.a aVar = L.f14378a;
        if (cVar == aVar) {
            R.a.b("padChain called on already padded chain");
        }
        androidx.compose.ui.h.c cVar2 = k10.f14368e;
        cVar2.f13989f = aVar;
        aVar.f13990g = cVar2;
        androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar3 = k10.f14369f;
        int i10 = cVar3 != null ? cVar3.f12945d : 0;
        androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar4 = k10.f14370g;
        if (cVar4 == null) {
            cVar4 = new androidx.compose.runtime.collection.c<>(new androidx.compose.ui.h.b[16]);
        }
        final androidx.compose.runtime.collection.c<androidx.compose.ui.h.b> cVar5 = cVar4;
        int i11 = cVar5.f12945d;
        if (i11 < 16) {
            i11 = 16;
        }
        androidx.compose.runtime.collection.c cVar6 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h[i11]);
        cVar6.b(hVar);
        Ia.l<androidx.compose.ui.h.b, Boolean> lVar = null;
        while (true) {
            int i12 = cVar6.f12945d;
            if (i12 == 0) {
                break;
            }
            androidx.compose.ui.h hVar2 = (androidx.compose.ui.h) cVar6.p(i12 - 1);
            if (hVar2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) hVar2;
                cVar6.b(combinedModifier.f13273c);
                cVar6.b(combinedModifier.f13272b);
            } else if (hVar2 instanceof androidx.compose.ui.h.b) {
                cVar5.b(hVar2);
            } else {
                if (lVar == null) {
                    lVar = new Ia.l<androidx.compose.ui.h.b, Boolean>() { // from class: androidx.compose.ui.node.NodeChainKt$fillVector$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final Boolean invoke(androidx.compose.ui.h.b bVar) {
                            cVar5.b(bVar);
                            return Boolean.TRUE;
                        }
                    };
                }
                hVar2.d(lVar);
                lVar = lVar;
            }
        }
        int i13 = cVar5.f12945d;
        androidx.compose.ui.h.c cVar7 = k10.f14367d;
        LayoutNode layoutNode = k10.f14364a;
        if (i13 == i10) {
            androidx.compose.ui.h.c cVar8 = aVar.f13990g;
            int i14 = 0;
            while (cVar8 != null && i14 < i10) {
                if (cVar3 == null) {
                    throw C4.v.g("expected prior modifier list to be non-empty");
                }
                androidx.compose.ui.h.b bVar = cVar3.f12943b[i14];
                androidx.compose.ui.h.b bVar2 = cVar5.f12943b[i14];
                char c10 = kotlin.jvm.internal.i.a(bVar, bVar2) ? (char) 2 : D9.o.g(bVar, bVar2) ? (char) 1 : (char) 0;
                if (c10 == 0) {
                    cVar8 = cVar8.f13989f;
                    break;
                }
                if (c10 == 1) {
                    K.i(bVar, bVar2, cVar8);
                }
                cVar8 = cVar8.f13990g;
                i14++;
            }
            androidx.compose.ui.h.c cVar9 = cVar8;
            if (i14 >= i10) {
                z10 = false;
            } else {
                if (cVar3 == null) {
                    throw C4.v.g("expected prior modifier list to be non-empty");
                }
                if (cVar9 == null) {
                    throw C4.v.g("structuralUpdate requires a non-null tail");
                }
                k10.g(i14, cVar3, cVar5, cVar9, !(layoutNode.f14395M != null));
                z10 = true;
            }
        } else {
            androidx.compose.ui.h hVar3 = layoutNode.f14395M;
            if (hVar3 != null && i10 == 0) {
                androidx.compose.ui.h.c cVarB = aVar;
                for (int i15 = 0; i15 < cVar5.f12945d; i15++) {
                    cVarB = K.b(cVar5.f12943b[i15], cVarB);
                }
                int i16 = 0;
                for (androidx.compose.ui.h.c cVar10 = cVar7.f13989f; cVar10 != null && cVar10 != L.f14378a; cVar10 = cVar10.f13989f) {
                    i16 |= cVar10.f13987d;
                    cVar10.f13988e = i16;
                }
            } else if (i13 != 0) {
                if (cVar3 == null) {
                    cVar3 = new androidx.compose.runtime.collection.c<>(new androidx.compose.ui.h.b[16]);
                }
                k10.g(0, cVar3, cVar5, aVar, !(hVar3 != null));
            } else {
                if (cVar3 == null) {
                    throw C4.v.g("expected prior modifier list to be non-empty");
                }
                androidx.compose.ui.h.c cVar11 = aVar.f13990g;
                for (int i17 = 0; cVar11 != null && i17 < cVar3.f12945d; i17++) {
                    cVar11 = K.c(cVar11).f13990g;
                }
                LayoutNode layoutNodeG = layoutNode.G();
                C1195p c1195p = layoutNodeG != null ? layoutNodeG.f14389G.f14365b : null;
                C1195p c1195p2 = k10.f14365b;
                c1195p2.f14529r = c1195p;
                k10.f14366c = c1195p2;
                z10 = false;
            }
            z10 = true;
        }
        k10.f14369f = cVar5;
        if (cVar3 != null) {
            cVar3.j();
        } else {
            cVar3 = null;
        }
        k10.f14370g = cVar3;
        L.a aVar2 = L.f14378a;
        if (aVar != aVar2) {
            R.a.b("trimChain called on already trimmed chain");
        }
        androidx.compose.ui.h.c cVar12 = aVar2.f13990g;
        if (cVar12 != null) {
            cVar7 = cVar12;
        }
        cVar7.f13989f = null;
        aVar2.f13990g = null;
        aVar2.f13988e = -1;
        aVar2.f13992i = null;
        if (cVar7 == aVar2) {
            R.a.b("trimChain did not update the head");
        }
        k10.f14368e = cVar7;
        if (z10) {
            k10.h();
        }
        this.f14390H.h();
        if (this.f14407i == null && k10.d(512)) {
            j0(this);
        }
    }

    public final void n(AndroidComposeView androidComposeView) {
        LayoutNode layoutNode;
        androidx.compose.ui.semantics.l lVarF;
        if (!(this.f14412o == null)) {
            R.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + u(0));
        }
        LayoutNode layoutNode2 = this.f14411n;
        if (layoutNode2 != null && !kotlin.jvm.internal.i.a(layoutNode2.f14412o, androidComposeView)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(androidComposeView);
            sb2.append(") than the parent's owner(");
            LayoutNode layoutNodeG = G();
            sb2.append(layoutNodeG != null ? layoutNodeG.f14412o : null);
            sb2.append("). This tree: ");
            sb2.append(u(0));
            sb2.append(" Parent tree: ");
            LayoutNode layoutNode3 = this.f14411n;
            sb2.append(layoutNode3 != null ? layoutNode3.u(0) : null);
            R.a.b(sb2.toString());
        }
        LayoutNode layoutNodeG2 = G();
        C1204z c1204z = this.f14390H;
        if (layoutNodeG2 == null) {
            c1204z.f14641p.f14497u = true;
            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f14455s = LookaheadPassDelegate.PlacedState.f14463b;
            }
        }
        K k10 = this.f14389G;
        k10.f14366c.f14529r = layoutNodeG2 != null ? layoutNodeG2.f14389G.f14365b : null;
        this.f14412o = androidComposeView;
        this.f14414q = (layoutNodeG2 != null ? layoutNodeG2.f14414q : -1) + 1;
        androidx.compose.ui.h hVar = this.f14395M;
        if (hVar != null) {
            m(hVar);
        }
        this.f14395M = null;
        androidComposeView.m5getLayoutNodes().h(this.f14401c, this);
        LayoutNode layoutNode4 = this.f14411n;
        if (layoutNode4 == null || (layoutNode = layoutNode4.f14407i) == null) {
            layoutNode = this.f14407i;
        }
        j0(layoutNode);
        if (this.f14407i == null && k10.d(512)) {
            j0(this);
        }
        if (!this.f14399Q) {
            for (androidx.compose.ui.h.c cVar = k10.f14368e; cVar != null; cVar = cVar.f13990g) {
                cVar.G1();
            }
        }
        androidx.compose.runtime.collection.c<LayoutNode> cVar2 = this.f14408k.f14362a;
        LayoutNode[] layoutNodeArr = cVar2.f12943b;
        int i10 = cVar2.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            layoutNodeArr[i11].n(androidComposeView);
        }
        if (!this.f14399Q) {
            k10.e();
        }
        O();
        if (layoutNodeG2 != null) {
            layoutNodeG2.O();
        }
        NodeCoordinator nodeCoordinator = k10.f14365b.f14528q;
        for (NodeCoordinator nodeCoordinator2 = k10.f14366c; !kotlin.jvm.internal.i.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f14528q) {
            nodeCoordinator2.V1(nodeCoordinator2.f14532u, true);
            T t8 = nodeCoordinator2.f14523J;
            if (t8 != null) {
                t8.invalidate();
            }
        }
        Ia.l<? super U, p293xa.r> lVar = this.f14396N;
        if (lVar != null) {
            lVar.invoke(androidComposeView);
        }
        c1204z.h();
        if (!this.f14399Q && k10.d(8)) {
            P();
        }
        androidx.compose.ui.autofill.b bVar = androidComposeView.f14656F;
        if (bVar == null || (lVarF = f()) == null) {
            return;
        }
        if (lVarF.f15234b.a(SemanticsProperties.f15162p)) {
            bVar.f13293h.b(this.f14401c);
            bVar.f13286a.a(bVar.f13288c, this.f14401c, true);
        }
    }

    public final void o() {
        this.f14387E = this.f14386D;
        this.f14386D = UsageByParent.f14433d;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.f14386D != UsageByParent.f14433d) {
                layoutNode.o();
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1082e
    public final void p() {
        if (!c()) {
            R.a.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.f14413p;
        if (androidViewHolder != null) {
            androidViewHolder.p();
        }
        C1178y c1178y = this.f14391I;
        if (c1178y != null) {
            c1178y.d(false);
        }
        this.f14418u = false;
        boolean z10 = this.f14399Q;
        K k10 = this.f14389G;
        if (z10) {
            this.f14399Q = false;
        } else {
            for (androidx.compose.ui.h.c cVar = k10.f14367d; cVar != null; cVar = cVar.f13989f) {
                if (cVar.f13997o) {
                    cVar.L1();
                }
            }
            k10.f();
            for (androidx.compose.ui.h.c cVar2 = k10.f14367d; cVar2 != null; cVar2 = cVar2.f13989f) {
                if (cVar2.f13997o) {
                    cVar2.H1();
                }
            }
        }
        int i10 = this.f14401c;
        this.f14401c = androidx.compose.ui.semantics.p.f15238a.addAndGet(1);
        AndroidComposeView androidComposeView = this.f14412o;
        if (androidComposeView != null) {
            androidComposeView.m5getLayoutNodes().g(i10);
            androidComposeView.m5getLayoutNodes().h(this.f14401c, this);
        }
        for (androidx.compose.ui.h.c cVar3 = k10.f14368e; cVar3 != null; cVar3 = cVar3.f13990g) {
            cVar3.G1();
        }
        k10.e();
        if (k10.d(8)) {
            P();
        }
        g0(this);
        AndroidComposeView androidComposeView2 = this.f14412o;
        if (androidComposeView2 != null) {
            androidx.compose.ui.autofill.b bVar = androidComposeView2.f14656F;
            if (bVar != null) {
                androidx.collection.C c10 = bVar.f13293h;
                boolean zE = c10.e(i10);
                androidx.compose.ui.autofill.n nVar = bVar.f13286a;
                AndroidComposeView androidComposeView3 = bVar.f13288c;
                if (zE) {
                    nVar.a(androidComposeView3, i10, false);
                }
                androidx.compose.ui.semantics.l lVarF = f();
                if (lVarF != null) {
                    if (lVarF.f15234b.a(SemanticsProperties.f15162p)) {
                        c10.b(this.f14401c);
                        nVar.a(androidComposeView3, this.f14401c, true);
                    }
                }
            }
            androidComposeView2.getRectManager().f(this, this.f14390H.f14641p.f14491o, true);
        }
    }

    public final void q() {
        this.f14387E = this.f14386D;
        this.f14386D = UsageByParent.f14433d;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode = layoutNodeArr[i11];
            if (layoutNode.f14386D == UsageByParent.f14432c) {
                layoutNode.q();
            }
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1173t
    public final boolean r() {
        return this.f14390H.f14641p.f14497u;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1173t
    public final int s() {
        return this.f14401c;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1173t
    public final boolean t() {
        return this.f14399Q;
    }

    public final String toString() {
        return G0.a.l(this) + " children: " + ((androidx.compose.runtime.collection.c.a) A()).f12946b.f12945d + " measurePolicy: " + this.f14421x;
    }

    public final String u(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i12 = cVarJ.f12945d;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(layoutNodeArr[i13].u(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void v() {
        A a10;
        AndroidComposeView androidComposeView = this.f14412o;
        if (androidComposeView == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeG = G();
            sb2.append(layoutNodeG != null ? layoutNodeG.u(0) : null);
            R.a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodeG2 = G();
        C1204z c1204z = this.f14390H;
        if (layoutNodeG2 != null) {
            layoutNodeG2.M();
            layoutNodeG2.O();
            MeasurePassDelegate measurePassDelegate = c1204z.f14641p;
            UsageByParent usageByParent = UsageByParent.f14433d;
            measurePassDelegate.f14489m = usageByParent;
            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.f14447k = usageByParent;
            }
        }
        C1201w c1201w = c1204z.f14641p.f14502z;
        c1201w.f14306b = true;
        c1201w.f14307c = false;
        c1201w.f14309e = false;
        c1201w.f14308d = false;
        c1201w.f14310f = false;
        c1201w.f14311g = false;
        c1201w.f14312h = null;
        LookaheadPassDelegate lookaheadPassDelegate2 = c1204z.f14642q;
        if (lookaheadPassDelegate2 != null && (a10 = lookaheadPassDelegate2.f14456t) != null) {
            a10.f14306b = true;
            a10.f14307c = false;
            a10.f14309e = false;
            a10.f14308d = false;
            a10.f14310f = false;
            a10.f14311g = false;
            a10.f14312h = null;
        }
        Ia.l<? super U, p293xa.r> lVar = this.f14397O;
        if (lVar != null) {
            lVar.invoke(androidComposeView);
        }
        K k10 = this.f14389G;
        k10.f();
        this.f14415r = true;
        androidx.compose.runtime.collection.c<LayoutNode> cVar = this.f14408k.f14362a;
        LayoutNode[] layoutNodeArr = cVar.f12943b;
        int i10 = cVar.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            layoutNodeArr[i11].v();
        }
        this.f14415r = false;
        for (androidx.compose.ui.h.c cVar2 = k10.f14367d; cVar2 != null; cVar2 = cVar2.f13989f) {
            if (cVar2.f13997o) {
                cVar2.H1();
            }
        }
        androidComposeView.m5getLayoutNodes().g(this.f14401c);
        E e10 = androidComposeView.f14676P;
        K3.b bVar = e10.f14351b;
        ((F6.a) bVar.f4244b).g(this);
        ((F6.a) bVar.f4245c).g(this);
        ((androidx.compose.runtime.collection.c) e10.f14354e.f6730b).m(this);
        androidComposeView.f14658G = true;
        androidComposeView.getRectManager().h(this);
        androidx.compose.ui.autofill.b bVar2 = androidComposeView.f14656F;
        if (bVar2 != null) {
            if (bVar2.f13293h.e(this.f14401c)) {
                bVar2.f13286a.a(bVar2.f13288c, this.f14401c, false);
            }
        }
        this.f14412o = null;
        j0(null);
        this.f14414q = 0;
        MeasurePassDelegate measurePassDelegate2 = c1204z.f14641p;
        measurePassDelegate2.j = BrazeLogger.SUPPRESS;
        measurePassDelegate2.f14486i = BrazeLogger.SUPPRESS;
        measurePassDelegate2.f14497u = false;
        LookaheadPassDelegate lookaheadPassDelegate3 = c1204z.f14642q;
        if (lookaheadPassDelegate3 != null) {
            lookaheadPassDelegate3.j = BrazeLogger.SUPPRESS;
            lookaheadPassDelegate3.f14446i = BrazeLogger.SUPPRESS;
            lookaheadPassDelegate3.f14455s = LookaheadPassDelegate.PlacedState.f14465d;
        }
        if (k10.d(8)) {
            androidx.compose.ui.semantics.l lVar2 = this.f14417t;
            this.f14417t = null;
            this.f14416s = false;
            androidx.collection.I<androidx.compose.ui.semantics.n> i12 = androidComposeView.getSemanticsOwner().f15250d;
            Object[] objArr = i12.f9108a;
            int i13 = i12.f9109b;
            for (int i14 = 0; i14 < i13; i14++) {
                ((androidx.compose.ui.semantics.n) objArr[i14]).b(this, lVar2);
            }
            androidComposeView.K();
        }
    }

    public final void w(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        this.f14389G.f14366c.g1(e10, bVar);
    }

    public final List<androidx.compose.ui.layout.D> y() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f14390H.f14642q;
        kotlin.jvm.internal.i.b(lookaheadPassDelegate);
        C1204z c1204z = lookaheadPassDelegate.f14444g;
        c1204z.f14627a.A();
        boolean z10 = lookaheadPassDelegate.f14458v;
        androidx.compose.runtime.collection.c<LookaheadPassDelegate> cVar = lookaheadPassDelegate.f14457u;
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
                LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode2.f14390H.f14642q;
                kotlin.jvm.internal.i.b(lookaheadPassDelegate2);
                cVar.b(lookaheadPassDelegate2);
            } else {
                LookaheadPassDelegate lookaheadPassDelegate3 = layoutNode2.f14390H.f14642q;
                kotlin.jvm.internal.i.b(lookaheadPassDelegate3);
                LookaheadPassDelegate[] lookaheadPassDelegateArr = cVar.f12943b;
                LookaheadPassDelegate lookaheadPassDelegate4 = lookaheadPassDelegateArr[i11];
                lookaheadPassDelegateArr[i11] = lookaheadPassDelegate3;
            }
        }
        cVar.q(((androidx.compose.runtime.collection.c.a) layoutNode.A()).f12946b.f12945d, cVar.f12945d);
        lookaheadPassDelegate.f14458v = false;
        return cVar.i();
    }

    public final List<androidx.compose.ui.layout.D> z() {
        return this.f14390H.f14641p.v0();
    }

    public LayoutNode(boolean z10, int i10, int i11) {
        this(androidx.compose.ui.semantics.p.f15238a.addAndGet(1), (i10 & 1) != 0 ? false : z10);
    }

    public LayoutNode(int i10, boolean z10) {
        this.f14400b = z10;
        this.f14401c = i10;
        this.f14402d = 9223372034707292159L;
        this.f14403e = 0L;
        this.f14404f = 9223372034707292159L;
        this.f14405g = true;
        this.f14408k = new J<>(new androidx.compose.runtime.collection.c(new LayoutNode[16]), new LayoutNode$_foldedChildren$1(this));
        this.f14419v = new androidx.compose.runtime.collection.c<>(new LayoutNode[16]);
        this.f14420w = true;
        this.f14421x = f14379R;
        this.f14423z = C1203y.f14626a;
        this.f14383A = LayoutDirection.f15717b;
        this.f14384B = f14381T;
        androidx.compose.runtime.r.f13113b0.getClass();
        this.f14385C = androidx.compose.runtime.r.a.f13115b;
        UsageByParent usageByParent = UsageByParent.f14433d;
        this.f14386D = usageByParent;
        this.f14387E = usageByParent;
        this.f14389G = new K(this);
        this.f14390H = new C1204z(this);
        this.f14393K = true;
        this.f14394L = androidx.compose.ui.h.a.f13984b;
    }
}
