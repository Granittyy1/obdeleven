package androidx.compose.ui.node;

import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements androidx.compose.ui.layout.D, InterfaceC1170p, V {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Ia.l<NodeCoordinator, p293xa.r> f14507L = new Ia.l<NodeCoordinator, p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // Ia.l
        public final p293xa.r invoke(NodeCoordinator nodeCoordinator) {
            NodeCoordinator nodeCoordinator2 = nodeCoordinator;
            if (nodeCoordinator2.a0() && nodeCoordinator2.W1(true)) {
                LayoutNode layoutNode = nodeCoordinator2.f14525n;
                C1204z c1204z = layoutNode.f14390H;
                if (c1204z.f14637l > 0) {
                    if (c1204z.f14636k || c1204z.j) {
                        layoutNode.e0(false);
                    }
                    c1204z.f14641p.C0();
                }
                U uA = C1203y.a(layoutNode);
                uA.getRectManager().e(layoutNode);
                ((AndroidComposeView) uA).Q(layoutNode);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Ia.l<NodeCoordinator, p293xa.r> f14508M = new Ia.l<NodeCoordinator, p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // Ia.l
        public final p293xa.r invoke(NodeCoordinator nodeCoordinator) {
            T t8 = nodeCoordinator.f14523J;
            if (t8 != null) {
                t8.invalidate();
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final i0 f14509N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final r f14510O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final float[] f14511P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final a f14512Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final b f14513R;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f14515B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public I.c f14516C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public r f14517D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14518E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public androidx.compose.ui.graphics.E f14519F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> f14520G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14522I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public T f14523J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14524K;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LayoutNode f14525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public NodeCoordinator f14528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NodeCoordinator f14529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> f14532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p013b0.c f14533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayoutDirection f14534w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.layout.F f14536y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.collection.H<AbstractC1155a> f14537z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f14535x = 0.8f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f14514A = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Ia.a<p293xa.r> f14521H = new NodeCoordinator$invalidateParentLayer$1(this);

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class a implements c {
        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final int a() {
            return 16;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final void b(LayoutNode layoutNode, long j, C1194o c1194o, int i10, boolean z10) {
            layoutNode.K(j, c1194o, i10, z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.collection.c] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.collection.c] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.ui.h$c] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.h$c] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.h$c] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean c(androidx.compose.ui.h.c cVar) {
            ?? cVar2 = 0;
            while (true) {
                int i10 = 0;
                if (cVar == 0) {
                    return false;
                }
                if (cVar instanceof Y) {
                    ((Y) cVar).G0();
                } else if ((cVar.f13987d & 16) != 0 && (cVar instanceof AbstractC1187h)) {
                    androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) cVar).f14585q;
                    cVar2 = cVar2;
                    cVar = cVar;
                    while (cVar3 != null) {
                        if ((cVar3.f13987d & 16) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVar2 = cVar2;
                                cVar = cVar3;
                            } else {
                                if (cVar2 == 0) {
                                    cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                }
                                if (cVar != 0) {
                                    cVar2.b(cVar);
                                    cVar = 0;
                                }
                                cVar2.b(cVar3);
                            }
                        }
                        cVar3 = cVar3.f13990g;
                        cVar2 = cVar2;
                        cVar = cVar;
                    }
                    if (i10 == 1) {
                    }
                }
                cVar = C1185f.b(cVar2);
            }
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean d(LayoutNode layoutNode) {
            return true;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public static final class b implements c {
        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final int a() {
            return 8;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final void b(LayoutNode layoutNode, long j, C1194o c1194o, int i10, boolean z10) {
            K k10 = layoutNode.f14389G;
            NodeCoordinator nodeCoordinator = k10.f14366c;
            Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
            k10.f14366c.E1(NodeCoordinator.f14513R, nodeCoordinator.p1(j, true), c1194o, 1, z10);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean c(androidx.compose.ui.h.c cVar) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.c
        public final boolean d(LayoutNode layoutNode) {
            androidx.compose.ui.semantics.l lVarF = layoutNode.f();
            boolean z10 = false;
            if (lVarF != null && lVarF.f15237e) {
                z10 = true;
            }
            return !z10;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    public interface c {
        int a();

        void b(LayoutNode layoutNode, long j, C1194o c1194o, int i10, boolean z10);

        boolean c(androidx.compose.ui.h.c cVar);

        boolean d(LayoutNode layoutNode);
    }

    static {
        i0 i0Var = new i0();
        i0Var.f13631c = 1.0f;
        i0Var.f13632d = 1.0f;
        i0Var.f13633e = 1.0f;
        long j = androidx.compose.ui.graphics.V.f13531a;
        i0Var.f13637i = j;
        i0Var.j = j;
        i0Var.f13641n = 8.0f;
        i0Var.f13642o = q0.f13791b;
        i0Var.f13643p = h0.f13629a;
        i0Var.f13645r = 0;
        i0Var.f13646s = 9205357640488583168L;
        i0Var.f13647t = p006a5.a.a();
        i0Var.f13648u = LayoutDirection.f15717b;
        f14509N = i0Var;
        f14510O = new r();
        f14511P = androidx.compose.ui.graphics.a0.a();
        f14512Q = new a();
        f14513R = new b();
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.f14525n = layoutNode;
        this.f14533v = layoutNode.f14423z;
        this.f14534w = layoutNode.f14383A;
    }

    public static NodeCoordinator S1(InterfaceC1170p interfaceC1170p) {
        NodeCoordinator nodeCoordinator;
        androidx.compose.ui.layout.C c10 = interfaceC1170p instanceof androidx.compose.ui.layout.C ? (androidx.compose.ui.layout.C) interfaceC1170p : null;
        if (c10 != null && (nodeCoordinator = c10.f14172b.f14344n) != null) {
            return nodeCoordinator;
        }
        kotlin.jvm.internal.i.c(interfaceC1170p, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) interfaceC1170p;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long B(InterfaceC1170p interfaceC1170p, long j) {
        return I1(interfaceC1170p, j);
    }

    public final androidx.compose.ui.h.c B1(boolean z10) {
        androidx.compose.ui.h.c cVarV1;
        K k10 = this.f14525n.f14389G;
        if (k10.f14366c == this) {
            return k10.f14368e;
        }
        if (z10) {
            NodeCoordinator nodeCoordinator = this.f14529r;
            if (nodeCoordinator != null && (cVarV1 = nodeCoordinator.v1()) != null) {
                return cVarV1.f13990g;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = this.f14529r;
            if (nodeCoordinator2 != null) {
                return nodeCoordinator2.v1();
            }
        }
        return null;
    }

    public final void C1(androidx.compose.ui.h.c cVar, c cVar2, long j, C1194o c1194o, int i10, boolean z10) {
        if (cVar == null) {
            F1(cVar2, j, c1194o, i10, z10);
            return;
        }
        int i11 = c1194o.f14593d;
        androidx.collection.I<Object> i12 = c1194o.f14591b;
        c1194o.k(i11 + 1, i12.f9109b);
        c1194o.f14593d++;
        i12.g(cVar);
        c1194o.f14592c.a(O3.d.i(-1.0f, z10, false));
        C1(M.a(cVar, cVar2.a()), cVar2, j, c1194o, i10, z10);
        c1194o.f14593d = i11;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final InterfaceC1170p D() {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        return this.f14529r;
    }

    public final void D1(androidx.compose.ui.h.c cVar, c cVar2, long j, C1194o c1194o, int i10, boolean z10, float f10) {
        if (cVar == null) {
            F1(cVar2, j, c1194o, i10, z10);
            return;
        }
        int i11 = c1194o.f14593d;
        androidx.collection.I<Object> i12 = c1194o.f14591b;
        c1194o.k(i11 + 1, i12.f9109b);
        c1194o.f14593d++;
        i12.g(cVar);
        c1194o.f14592c.a(O3.d.i(f10, z10, false));
        N1(M.a(cVar, cVar2.a()), cVar2, j, c1194o, i10, z10, f10, true);
        c1194o.f14593d = i11;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean E0() {
        return this.f14536y != null;
    }

    public final void E1(c cVar, long j, C1194o c1194o, int i10, boolean z10) {
        androidx.compose.ui.h.c cVarW1 = w1(cVar.a());
        boolean z11 = true;
        if (!X1(j)) {
            if (androidx.compose.ui.input.pointer.y.a(i10, 1)) {
                float fC1 = c1(j, u1());
                if ((Float.floatToRawIntBits(fC1) & BrazeLogger.SUPPRESS) < 2139095040) {
                    if (c1194o.f14593d != kotlin.collections.l.r(c1194o)) {
                        if (C1189j.a(c1194o.e(), O3.d.i(fC1, false, false)) <= 0) {
                            return;
                        }
                    }
                    D1(cVarW1, cVar, j, c1194o, i10, false, fC1);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarW1 == null) {
            F1(cVar, j, c1194o, i10, z10);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < o0() && fIntBitsToFloat2 < l0()) {
            C1(cVarW1, cVar, j, c1194o, i10, z10);
            return;
        }
        float fC2 = !androidx.compose.ui.input.pointer.y.a(i10, 1) ? Float.POSITIVE_INFINITY : c1(j, u1());
        if ((Float.floatToRawIntBits(fC2) & BrazeLogger.SUPPRESS) < 2139095040) {
            if (c1194o.f14593d != kotlin.collections.l.r(c1194o)) {
                if (C1189j.a(c1194o.e(), O3.d.i(fC2, z10, false)) <= 0) {
                }
            }
            N1(cVarW1, cVar, j, c1194o, i10, z10, fC2, z11);
        }
        z11 = false;
        N1(cVarW1, cVar, j, c1194o, i10, z10, fC2, z11);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final androidx.compose.ui.layout.F F0() {
        androidx.compose.ui.layout.F f10 = this.f14536y;
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public void F1(c cVar, long j, C1194o c1194o, int i10, boolean z10) {
        NodeCoordinator nodeCoordinator = this.f14528q;
        if (nodeCoordinator != null) {
            nodeCoordinator.E1(cVar, nodeCoordinator.p1(j, true), c1194o, i10, z10);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final void G(float[] fArr) {
        U uA = C1203y.a(this.f14525n);
        U1(S1(kotlin.jvm.internal.n.h(this)), fArr);
        ((androidx.compose.ui.input.pointer.f) uA).d(fArr);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable G0() {
        return this.f14529r;
    }

    public final void G1() {
        T t8 = this.f14523J;
        if (t8 != null) {
            t8.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f14529r;
        if (nodeCoordinator != null) {
            nodeCoordinator.G1();
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final I.f H(InterfaceC1170p interfaceC1170p, boolean z10) {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC1170p.c()) {
            R.a.b("LayoutCoordinates " + interfaceC1170p + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorS1 = S1(interfaceC1170p);
        nodeCoordinatorS1.K1();
        NodeCoordinator nodeCoordinatorL1 = l1(nodeCoordinatorS1);
        I.c cVar = this.f14516C;
        if (cVar == null) {
            cVar = new I.c();
            this.f14516C = cVar;
        }
        cVar.f3750a = 0.0f;
        cVar.f3751b = 0.0f;
        cVar.f3752c = (int) (interfaceC1170p.a() >> 32);
        cVar.f3753d = (int) (interfaceC1170p.a() & 4294967295L);
        while (nodeCoordinatorS1 != nodeCoordinatorL1) {
            nodeCoordinatorS1.Q1(cVar, z10, false);
            if (cVar.b()) {
                return I.f.f3756e;
            }
            nodeCoordinatorS1 = nodeCoordinatorS1.f14529r;
            kotlin.jvm.internal.i.b(nodeCoordinatorS1);
        }
        X0(nodeCoordinatorL1, cVar, z10);
        return new I.f(cVar.f3750a, cVar.f3751b, cVar.f3752c, cVar.f3753d);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long H0() {
        return this.f14514A;
    }

    public final boolean H1() {
        if (this.f14523J != null && this.f14535x <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f14529r;
        if (nodeCoordinator != null) {
            return nodeCoordinator.H1();
        }
        return false;
    }

    public final long I1(InterfaceC1170p interfaceC1170p, long j) {
        if (interfaceC1170p instanceof androidx.compose.ui.layout.C) {
            ((androidx.compose.ui.layout.C) interfaceC1170p).f14172b.f14344n.K1();
            return ((androidx.compose.ui.layout.C) interfaceC1170p).d(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        NodeCoordinator nodeCoordinatorS1 = S1(interfaceC1170p);
        nodeCoordinatorS1.K1();
        NodeCoordinator nodeCoordinatorL1 = l1(nodeCoordinatorS1);
        while (nodeCoordinatorS1 != nodeCoordinatorL1) {
            T t8 = nodeCoordinatorS1.f14523J;
            if (t8 != null) {
                j = t8.e(j, false);
            }
            j = Cb.a.k(j, nodeCoordinatorS1.f14514A);
            nodeCoordinatorS1 = nodeCoordinatorS1.f14529r;
            kotlin.jvm.internal.i.b(nodeCoordinatorS1);
        }
        return a1(nodeCoordinatorL1, j);
    }

    public final void J1() {
        if (this.f14523J != null || this.f14532u == null) {
            return;
        }
        T tA = U.a(C1203y.a(this.f14525n), q1(), this.f14521H, this.f14524K, false, 8);
        tA.f(this.f14222d);
        tA.k(this.f14514A);
        tA.invalidate();
        this.f14523J = tA;
    }

    public final void K1() {
        C1204z c1204z = this.f14525n.f14390H;
        LayoutNode.LayoutState layoutState = c1204z.f14627a.f14390H.f14630d;
        if (layoutState == LayoutNode.LayoutState.f14427d || layoutState == LayoutNode.LayoutState.f14428e) {
            if (c1204z.f14641p.f14472C) {
                c1204z.e(true);
            } else {
                c1204z.d(true);
            }
        }
        if (layoutState == LayoutNode.LayoutState.f14428e) {
            LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
            if (lookaheadPassDelegate == null || !lookaheadPassDelegate.f14459w) {
                c1204z.f(true);
            } else {
                c1204z.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void L1() {
        androidx.compose.ui.h.c cVarV1;
        androidx.compose.ui.h.c cVarB1 = B1(N.g(128));
        if (cVarB1 == null || (cVarB1.f13985b.f13988e & 128) == 0) {
            return;
        }
        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
        try {
            boolean zG = N.g(128);
            if (!zG) {
                cVarV1 = v1().f13989f;
                if (cVarV1 == null) {
                }
                p293xa.r rVar = p293xa.r.f47939a;
            }
            cVarV1 = v1();
            for (androidx.compose.ui.h.c cVarB2 = B1(zG); cVarB2 != null && (cVarB2.f13988e & 128) != 0; cVarB2 = cVarB2.f13990g) {
                if ((cVarB2.f13987d & 128) != 0) {
                    ?? cVar = 0;
                    ?? B10 = cVarB2;
                    while (B10 != 0) {
                        if (B10 instanceof InterfaceC1197s) {
                            ((InterfaceC1197s) B10).T(this.f14222d);
                        } else if ((B10.f13987d & 128) != 0 && (B10 instanceof AbstractC1187h)) {
                            androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B10).f14585q;
                            int i10 = 0;
                            while (cVar2 != null) {
                                if ((cVar2.f13987d & 128) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        B10 = B10;
                                        cVar = cVar;
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
                                } else {
                                    B10 = B10;
                                    cVar = cVar;
                                }
                                cVar2 = cVar2.f13990g;
                                B10 = B10;
                                cVar = cVar;
                            }
                            if (i10 == 1) {
                                B10 = B10;
                                cVar = cVar;
                            } else {
                                B10 = B10;
                                cVar = cVar;
                            }
                        }
                        B10 = C1185f.b(cVar);
                    }
                }
                if (cVarB2 == cVarV1) {
                    break;
                }
            }
            p293xa.r rVar2 = p293xa.r.f47939a;
        } finally {
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void M1() {
        boolean zG = N.g(128);
        androidx.compose.ui.h.c cVarV1 = v1();
        if (!zG && (cVarV1 = cVarV1.f13989f) == null) {
            return;
        }
        for (androidx.compose.ui.h.c cVarB1 = B1(zG); cVarB1 != null && (cVarB1.f13988e & 128) != 0; cVarB1 = cVarB1.f13990g) {
            if ((cVarB1.f13987d & 128) != 0) {
                ?? B10 = cVarB1;
                ?? cVar = 0;
                while (B10 != 0) {
                    if (B10 instanceof InterfaceC1197s) {
                        ((InterfaceC1197s) B10).o0(this);
                    } else if ((B10.f13987d & 128) != 0 && (B10 instanceof AbstractC1187h)) {
                        androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B10).f14585q;
                        int i10 = 0;
                        B10 = B10;
                        cVar = cVar;
                        while (cVar2 != null) {
                            if ((cVar2.f13987d & 128) != 0) {
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
            if (cVarB1 == cVarV1) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e A[PHI: r2
      0x019e: PHI (r2v4 ??) = (r2v1 ??), (r2v1 ??), (r2v6 ??) binds: [B:49:0x016c, B:51:0x0170, B:65:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.runtime.collection.c] */
    public final void N1(final androidx.compose.ui.h.c cVar, final c cVar2, final long j, final C1194o c1194o, final int i10, final boolean z10, final float f10, final boolean z11) {
        ?? B10;
        int i11;
        if (cVar == null) {
            F1(cVar2, j, c1194o, i10, z10);
            return;
        }
        char c10 = 3;
        if (androidx.compose.ui.input.pointer.y.a(i10, 3) || androidx.compose.ui.input.pointer.y.a(i10, 4)) {
            ?? r10 = cVar;
            ?? cVar3 = 0;
            while (r10 != 0) {
                if (r10 instanceof Y) {
                    long jQ = ((Y) r10).Q();
                    int i12 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i12);
                    LayoutNode layoutNode = this.f14525n;
                    LayoutDirection layoutDirection = layoutNode.f14383A;
                    int i13 = d0.f14580b;
                    long j10 = jQ & Long.MIN_VALUE;
                    if (fIntBitsToFloat < (-((j10 == 0 || layoutDirection == LayoutDirection.f15717b) ? d0.a.a(0, jQ) : d0.a.a(2, jQ)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i12) >= o0() + ((j10 == 0 || layoutNode.f14383A == LayoutDirection.f15717b) ? d0.a.a(2, jQ) : d0.a.a(0, jQ))) {
                        break;
                    }
                    int i14 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i14) < (-d0.a.a(1, jQ))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i14) >= d0.a.a(3, jQ) + l0()) {
                        break;
                    }
                    Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            NodeCoordinator nodeCoordinator = this.this$0;
                            androidx.compose.ui.h.c cVarA = M.a(cVar, cVar2.a());
                            NodeCoordinator.c cVar4 = cVar2;
                            long j11 = j;
                            C1194o c1194o2 = c1194o;
                            int i15 = i10;
                            boolean z12 = z10;
                            float f11 = f10;
                            boolean z13 = z11;
                            Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
                            nodeCoordinator.N1(cVarA, cVar4, j11, c1194o2, i15, z12, f11, z13);
                            return p293xa.r.f47939a;
                        }
                    };
                    int i15 = c1194o.f14593d;
                    int iR = kotlin.collections.l.r(c1194o);
                    androidx.collection.D d10 = c1194o.f14592c;
                    androidx.collection.I<Object> i16 = c1194o.f14591b;
                    if (i15 == iR) {
                        int i17 = c1194o.f14593d;
                        c1194o.k(i17 + 1, i16.f9109b);
                        c1194o.f14593d++;
                        i16.g(cVar);
                        d10.a(O3.d.i(0.0f, z10, true));
                        aVar.invoke();
                        c1194o.f14593d = i17;
                        return;
                    }
                    long jE = c1194o.e();
                    int i18 = c1194o.f14593d;
                    if (!C1189j.c(jE)) {
                        if (C1189j.b(jE) > 0.0f) {
                            int i19 = c1194o.f14593d;
                            c1194o.k(i19 + 1, i16.f9109b);
                            c1194o.f14593d++;
                            i16.g(cVar);
                            d10.a(O3.d.i(0.0f, z10, true));
                            aVar.invoke();
                            c1194o.f14593d = i19;
                            return;
                        }
                        return;
                    }
                    int iR2 = kotlin.collections.l.r(c1194o);
                    c1194o.f14593d = iR2;
                    c1194o.k(iR2 + 1, i16.f9109b);
                    c1194o.f14593d++;
                    i16.g(cVar);
                    d10.a(O3.d.i(0.0f, z10, true));
                    aVar.invoke();
                    c1194o.f14593d = iR2;
                    if (C1189j.b(c1194o.e()) < 0.0f) {
                        c1194o.k(i18 + 1, c1194o.f14593d + 1);
                    }
                    c1194o.f14593d = i18;
                    return;
                }
                char c11 = c10;
                if ((r10.f13987d & 16) == 0 || !(r10 instanceof AbstractC1187h)) {
                    B10 = r10;
                    cVar3 = cVar3;
                    B10 = C1185f.b(cVar3);
                } else {
                    androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) r10).f14585q;
                    int i20 = 0;
                    while (cVar4 != null) {
                        if ((cVar4.f13987d & 16) != 0) {
                            i20++;
                            if (i20 == 1) {
                                B10 = r10;
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
                            B10 = r10;
                            cVar3 = cVar3;
                        }
                        cVar4 = cVar4.f13990g;
                        B10 = B10;
                        cVar3 = cVar3;
                    }
                    if (i20 == 1) {
                        B10 = r10;
                        cVar3 = cVar3;
                    } else {
                        B10 = r10;
                        cVar3 = cVar3;
                        B10 = C1185f.b(cVar3);
                    }
                }
                c10 = c11;
                r10 = B10;
                cVar3 = cVar3;
            }
        }
        if (z11) {
            D1(cVar, cVar2, j, c1194o, i10, z10, f10);
            return;
        }
        if (!cVar2.c(cVar)) {
            N1(M.a(cVar, cVar2.a()), cVar2, j, c1194o, i10, z10, f10, false);
            return;
        }
        Ia.a<p293xa.r> aVar2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                androidx.compose.ui.h.c cVarA = M.a(cVar, cVar2.a());
                NodeCoordinator.c cVar5 = cVar2;
                long j11 = j;
                C1194o c1194o2 = c1194o;
                int i21 = i10;
                boolean z12 = z10;
                float f11 = f10;
                Ia.l<NodeCoordinator, p293xa.r> lVar = NodeCoordinator.f14507L;
                nodeCoordinator.N1(cVarA, cVar5, j11, c1194o2, i21, z12, f11, false);
                return p293xa.r.f47939a;
            }
        };
        int i21 = c1194o.f14593d;
        int iR3 = kotlin.collections.l.r(c1194o);
        androidx.collection.D d11 = c1194o.f14592c;
        androidx.collection.I<Object> i22 = c1194o.f14591b;
        if (i21 != iR3) {
            long jE2 = c1194o.e();
            int i23 = c1194o.f14593d;
            int iR4 = kotlin.collections.l.r(c1194o);
            c1194o.f14593d = iR4;
            c1194o.k(iR4 + 1, i22.f9109b);
            c1194o.f14593d++;
            i22.g(cVar);
            d11.a(O3.d.i(f10, z10, false));
            aVar2.invoke();
            c1194o.f14593d = iR4;
            long jE3 = c1194o.e();
            if (c1194o.f14593d + 1 >= kotlin.collections.l.r(c1194o) || C1189j.a(jE2, jE3) <= 0) {
                c1194o.k(c1194o.f14593d + 1, i22.f9109b);
            } else {
                c1194o.k(i23 + 1, C1189j.c(jE3) ? c1194o.f14593d + 2 : c1194o.f14593d + 1);
            }
            c1194o.f14593d = i23;
            return;
        }
        int i24 = c1194o.f14593d;
        int i25 = i24 + 1;
        c1194o.k(i25, i22.f9109b);
        c1194o.f14593d++;
        i22.g(cVar);
        d11.a(O3.d.i(f10, z10, false));
        aVar2.invoke();
        c1194o.f14593d = i24;
        if (i25 == kotlin.collections.l.r(c1194o) || C1189j.c(c1194o.e())) {
            int i26 = c1194o.f14593d;
            int i27 = i26 + 1;
            i22.k(i27);
            if (i27 < 0 || i27 >= (i11 = d11.f9198b)) {
                D9.o.r("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = d11.f9197a;
            long j11 = jArr[i27];
            if (i27 != i11 - 1) {
                Q3.d.p(jArr, jArr, i27, i26 + 2, i11);
            }
            d11.f9198b--;
        }
    }

    public void O1(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        NodeCoordinator nodeCoordinator = this.f14528q;
        if (nodeCoordinator != null) {
            nodeCoordinator.g1(e10, bVar);
        }
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14525n.f14423z.P0();
    }

    public final void P1(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar, androidx.compose.ui.graphics.layer.b bVar) {
        LayoutNode layoutNode = this.f14525n;
        if (bVar != null) {
            if (lVar != null) {
                R.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f14524K != bVar) {
                this.f14524K = null;
                V1(null, false);
                this.f14524K = bVar;
            }
            if (this.f14523J == null) {
                U uA = C1203y.a(layoutNode);
                Ia.p<androidx.compose.ui.graphics.E, androidx.compose.ui.graphics.layer.b, p293xa.r> pVarQ1 = q1();
                Ia.a<p293xa.r> aVar = this.f14521H;
                T tA = U.a(uA, pVarQ1, aVar, bVar, false, 8);
                tA.f(this.f14222d);
                tA.k(j);
                this.f14523J = tA;
                layoutNode.f14393K = true;
                ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
            }
        } else {
            if (this.f14524K != null) {
                this.f14524K = null;
                V1(null, false);
            }
            V1(lVar, false);
        }
        if (!p013b0.j.b(this.f14514A, j)) {
            this.f14514A = j;
            layoutNode.f14390H.f14641p.C0();
            T t8 = this.f14523J;
            if (t8 != null) {
                t8.k(j);
            } else {
                NodeCoordinator nodeCoordinator = this.f14529r;
                if (nodeCoordinator != null) {
                    nodeCoordinator.G1();
                }
            }
            LookaheadCapablePlaceable.N0(this);
            AndroidComposeView androidComposeView = layoutNode.f14412o;
            if (androidComposeView != null) {
                androidComposeView.H(layoutNode);
            }
        }
        this.f14515B = f10;
        if (this.f14440i) {
            return;
        }
        x0(new X(F0(), this));
    }

    public final void Q1(I.c cVar, boolean z10, boolean z11) {
        T t8 = this.f14523J;
        if (t8 != null) {
            if (this.f14531t) {
                if (z11) {
                    long jU1 = u1();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jU1 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU1 & 4294967295L)) / 2.0f;
                    long j = this.f14222d;
                    cVar.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z10) {
                    long j10 = this.f14222d;
                    cVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (cVar.b()) {
                    return;
                }
            }
            t8.i(cVar, false);
        }
        long j11 = this.f14514A;
        float f10 = (int) (j11 >> 32);
        cVar.f3750a += f10;
        cVar.f3752c += f10;
        float f11 = (int) (j11 & 4294967295L);
        cVar.f3751b += f11;
        cVar.f3753d += f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.runtime.collection.c] */
    public final void R1(androidx.compose.ui.layout.F f10) {
        NodeCoordinator nodeCoordinator;
        androidx.compose.ui.layout.F f11 = this.f14536y;
        if (f10 != f11) {
            this.f14536y = f10;
            LayoutNode layoutNode = this.f14525n;
            int i10 = 0;
            if (f11 == null || f10.getWidth() != f11.getWidth() || f10.getHeight() != f11.getHeight()) {
                int width = f10.getWidth();
                int height = f10.getHeight();
                T t8 = this.f14523J;
                if (t8 != null) {
                    t8.f((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (layoutNode.r() && (nodeCoordinator = this.f14529r) != null) {
                    nodeCoordinator.G1();
                }
                t0((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.f14532u != null) {
                    W1(false);
                }
                boolean zG = N.g(4);
                androidx.compose.ui.h.c cVarV1 = v1();
                if (zG || (cVarV1 = cVarV1.f13989f) != null) {
                    for (androidx.compose.ui.h.c cVarB1 = B1(zG); cVarB1 != null && (cVarB1.f13988e & 4) != 0; cVarB1 = cVarB1.f13990g) {
                        if ((cVarB1.f13987d & 4) != 0) {
                            ?? B10 = cVarB1;
                            ?? cVar = 0;
                            while (B10 != 0) {
                                if (B10 instanceof InterfaceC1191l) {
                                    ((InterfaceC1191l) B10).E0();
                                } else if ((B10.f13987d & 4) != 0 && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) B10).f14585q;
                                    int i11 = 0;
                                    B10 = B10;
                                    cVar = cVar;
                                    while (cVar2 != null) {
                                        if ((cVar2.f13987d & 4) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                B10 = C1185f.b(cVar);
                            }
                        }
                        if (cVarB1 == cVarV1) {
                            break;
                        }
                    }
                }
                AndroidComposeView androidComposeView = layoutNode.f14412o;
                if (androidComposeView != null) {
                    androidComposeView.H(layoutNode);
                }
            }
            androidx.collection.H<AbstractC1155a> h8 = this.f14537z;
            if ((h8 == null || h8.f9107e == 0) && f10.o().isEmpty()) {
                return;
            }
            androidx.collection.H<AbstractC1155a> h10 = this.f14537z;
            Map<AbstractC1155a, Integer> mapO = f10.o();
            if (h10 != null && h10.f9107e == mapO.size()) {
                Object[] objArr = h10.f9104b;
                int[] iArr = h10.f9105c;
                long[] jArr = h10.f9103a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j = jArr[i12];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = mapO.get((AbstractC1155a) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            layoutNode.f14390H.f14641p.f14502z.g();
            androidx.collection.H<AbstractC1155a> hA = this.f14537z;
            if (hA == null) {
                hA = androidx.collection.P.a();
                this.f14537z = hA;
            }
            hA.b();
            for (Map.Entry<AbstractC1155a, Integer> entry : f10.o().entrySet()) {
                hA.g(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long T(long j) {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC1170p interfaceC1170pH = kotlin.jvm.internal.n.h(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) C1203y.a(this.f14525n);
        androidComposeView.L();
        return I1(interfaceC1170pH, I.d.f(androidx.compose.ui.graphics.a0.b(j, androidComposeView.f14686U), interfaceC1170pH.g0(0L)));
    }

    public final void T1(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (kotlin.jvm.internal.i.a(nodeCoordinator, this)) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f14529r;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        nodeCoordinator2.T1(nodeCoordinator, fArr);
        if (!p013b0.j.b(this.f14514A, 0L)) {
            float[] fArr2 = f14511P;
            androidx.compose.ui.graphics.a0.d(fArr2);
            long j = this.f14514A;
            androidx.compose.ui.graphics.a0.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)), 0.0f);
            androidx.compose.ui.graphics.a0.e(fArr, fArr2);
        }
        T t8 = this.f14523J;
        if (t8 != null) {
            t8.j(fArr);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final void U(InterfaceC1170p interfaceC1170p, float[] fArr) {
        NodeCoordinator nodeCoordinatorS1 = S1(interfaceC1170p);
        nodeCoordinatorS1.K1();
        NodeCoordinator nodeCoordinatorL1 = l1(nodeCoordinatorS1);
        androidx.compose.ui.graphics.a0.d(fArr);
        nodeCoordinatorS1.U1(nodeCoordinatorL1, fArr);
        T1(nodeCoordinatorL1, fArr);
    }

    public final void U1(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!nodeCoordinator2.equals(nodeCoordinator)) {
            T t8 = nodeCoordinator2.f14523J;
            if (t8 != null) {
                t8.a(fArr);
            }
            long j = nodeCoordinator2.f14514A;
            if (!p013b0.j.b(j, 0L)) {
                float[] fArr2 = f14511P;
                androidx.compose.ui.graphics.a0.d(fArr2);
                androidx.compose.ui.graphics.a0.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L), 0.0f);
                androidx.compose.ui.graphics.a0.e(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f14529r;
            kotlin.jvm.internal.i.b(nodeCoordinator2);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void V0() {
        androidx.compose.ui.graphics.layer.b bVar = this.f14524K;
        if (bVar != null) {
            r0(this.f14514A, this.f14515B, bVar);
        } else {
            q0(this.f14514A, this.f14515B, this.f14532u);
        }
    }

    public final void V1(Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar, boolean z10) {
        AndroidComposeView androidComposeView;
        if (lVar != null && this.f14524K != null) {
            R.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = this.f14525n;
        boolean z11 = (!z10 && this.f14532u == lVar && kotlin.jvm.internal.i.a(this.f14533v, layoutNode.f14423z) && this.f14534w == layoutNode.f14383A) ? false : true;
        this.f14533v = layoutNode.f14423z;
        this.f14534w = layoutNode.f14383A;
        boolean zC = layoutNode.c();
        Ia.a<p293xa.r> aVar = this.f14521H;
        if (!zC || lVar == null) {
            this.f14532u = null;
            T t8 = this.f14523J;
            if (t8 != null) {
                t8.b();
                layoutNode.f14393K = true;
                ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
                if (v1().f13997o && layoutNode.r() && (androidComposeView = layoutNode.f14412o) != null) {
                    androidComposeView.H(layoutNode);
                }
            }
            this.f14523J = null;
            this.f14522I = false;
            return;
        }
        this.f14532u = lVar;
        if (this.f14523J != null) {
            if (z11 && W1(true)) {
                C1203y.a(layoutNode).getRectManager().e(layoutNode);
                return;
            }
            return;
        }
        T tA = U.a(C1203y.a(layoutNode), q1(), aVar, null, layoutNode.f14406h, 4);
        tA.f(this.f14222d);
        tA.k(this.f14514A);
        this.f14523J = tA;
        W1(true);
        layoutNode.f14393K = true;
        ((NodeCoordinator$invalidateParentLayer$1) aVar).invoke();
    }

    public final boolean W1(boolean z10) {
        AndroidComposeView androidComposeView;
        boolean z11 = false;
        if (this.f14524K != null) {
            return false;
        }
        T t8 = this.f14523J;
        if (t8 == null) {
            if (this.f14532u != null) {
                R.a.b("null layer with a non-null layerBlock");
            }
            return false;
        }
        final Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar = this.f14532u;
        if (lVar == null) {
            throw C4.v.g("updateLayerParameters requires a non-null layerBlock");
        }
        i0 i0Var = f14509N;
        i0Var.i(1.0f);
        i0Var.h(1.0f);
        i0Var.b(1.0f);
        i0Var.k(0.0f);
        i0Var.g(0.0f);
        i0Var.n(0.0f);
        long j = androidx.compose.ui.graphics.V.f13531a;
        i0Var.y(j);
        i0Var.A(j);
        i0Var.m(0.0f);
        i0Var.d(0.0f);
        i0Var.f(0.0f);
        i0Var.l(8.0f);
        i0Var.f1(q0.f13791b);
        i0Var.O0(h0.f13629a);
        i0Var.z(false);
        i0Var.e();
        i0Var.t(0);
        i0Var.f13646s = 9205357640488583168L;
        i0Var.f13649v = null;
        i0Var.f13630b = 0;
        LayoutNode layoutNode = this.f14525n;
        i0Var.f13647t = layoutNode.f14423z;
        i0Var.f13648u = layoutNode.f14383A;
        i0Var.f13646s = A8.A.k(this.f14222d);
        C1203y.a(layoutNode).getSnapshotObserver().b(this, f14507L, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar2 = lVar;
                i0 i0Var2 = NodeCoordinator.f14509N;
                lVar2.invoke(i0Var2);
                i0Var2.f13649v = i0Var2.f13643p.mo0createOutlinePq9zytI(i0Var2.f13646s, i0Var2.f13648u, i0Var2.f13647t);
                return p293xa.r.f47939a;
            }
        });
        r rVar = this.f14517D;
        if (rVar == null) {
            rVar = new r();
            this.f14517D = rVar;
        }
        r rVar2 = f14510O;
        rVar2.getClass();
        rVar2.f14606a = rVar.f14606a;
        rVar2.f14607b = rVar.f14607b;
        rVar2.f14608c = rVar.f14608c;
        rVar2.f14609d = rVar.f14609d;
        rVar2.f14610e = rVar.f14610e;
        rVar2.f14611f = rVar.f14611f;
        rVar2.f14612g = rVar.f14612g;
        rVar2.f14613h = rVar.f14613h;
        rVar2.f14614i = rVar.f14614i;
        rVar.f14606a = i0Var.f13631c;
        rVar.f14607b = i0Var.f13632d;
        rVar.f14608c = i0Var.f13634f;
        rVar.f14609d = i0Var.f13635g;
        rVar.f14610e = i0Var.f13638k;
        rVar.f14611f = i0Var.f13639l;
        rVar.f14612g = i0Var.f13640m;
        rVar.f14613h = i0Var.f13641n;
        rVar.f14614i = i0Var.f13642o;
        t8.d(i0Var);
        boolean z12 = this.f14531t;
        this.f14531t = i0Var.f13644q;
        this.f14535x = i0Var.f13633e;
        if (rVar2.f14606a == rVar.f14606a && rVar2.f14607b == rVar.f14607b && rVar2.f14608c == rVar.f14608c && rVar2.f14609d == rVar.f14609d && rVar2.f14610e == rVar.f14610e && rVar2.f14611f == rVar.f14611f && rVar2.f14612g == rVar.f14612g && rVar2.f14613h == rVar.f14613h && q0.a(rVar2.f14614i, rVar.f14614i)) {
            z11 = true;
        }
        boolean z13 = !z11;
        if (z10 && ((!z11 || z12 != this.f14531t) && (androidComposeView = layoutNode.f14412o) != null)) {
            androidComposeView.H(layoutNode);
        }
        return z13;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final InterfaceC1170p X() {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        return this.f14525n.f14389G.f14366c.f14529r;
    }

    public final void X0(NodeCoordinator nodeCoordinator, I.c cVar, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f14529r;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.X0(nodeCoordinator, cVar, z10);
        }
        long j = this.f14514A;
        float f10 = (int) (j >> 32);
        cVar.f3750a -= f10;
        cVar.f3752c -= f10;
        float f11 = (int) (j & 4294967295L);
        cVar.f3751b -= f11;
        cVar.f3753d -= f11;
        T t8 = this.f14523J;
        if (t8 != null) {
            t8.i(cVar, true);
            if (this.f14531t && z10) {
                long j10 = this.f14222d;
                cVar.a(0.0f, 0.0f, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final boolean X1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        T t8 = this.f14523J;
        return t8 == null || !this.f14531t || t8.c(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long a() {
        return this.f14222d;
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return (this.f14523J == null || this.f14530s || !this.f14525n.c()) ? false : true;
    }

    public final long a1(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.f14529r;
        return (nodeCoordinator2 == null || kotlin.jvm.internal.i.a(nodeCoordinator, nodeCoordinator2)) ? p1(j, true) : p1(nodeCoordinator2.a1(nodeCoordinator, j), true);
    }

    public final long b1(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - o0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - l0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final boolean c() {
        return v1().f13997o;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long c0(long j) {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return I1(kotlin.jvm.internal.n.h(this), ((AndroidComposeView) C1203y.a(this.f14525n)).S(j));
    }

    public final float c1(long j, long j10) {
        if (o0() >= Float.intBitsToFloat((int) (j10 >> 32)) && l0() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jB1 = b1(j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - o0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - l0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        int i10 = (int) (jFloatToRawIntBits >> 32);
        if (Float.intBitsToFloat(i10) > fIntBitsToFloat) {
            return Float.POSITIVE_INFINITY;
        }
        int i11 = (int) (jFloatToRawIntBits & 4294967295L);
        if (Float.intBitsToFloat(i11) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat(i10);
        float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
        return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long g0(long j) {
        if (!v1().f13997o) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        K1();
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f14529r) {
            T t8 = nodeCoordinator.f14523J;
            if (t8 != null) {
                j = t8.e(j, false);
            }
            j = Cb.a.k(j, nodeCoordinator.f14514A);
        }
        return j;
    }

    public final void g1(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        T t8 = this.f14523J;
        if (t8 != null) {
            t8.h(e10, bVar);
            return;
        }
        long j = this.f14514A;
        float f10 = (int) (j >> 32);
        float f11 = (int) (j & 4294967295L);
        e10.m(f10, f11);
        h1(e10, bVar);
        e10.m(-f10, -f11);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14525n.f14423z.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final LayoutDirection getLayoutDirection() {
        return this.f14525n.f14383A;
    }

    public final void h1(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        androidx.compose.ui.h.c cVarW1 = w1(4);
        if (cVarW1 == null) {
            O1(e10, bVar);
            return;
        }
        LayoutNode layoutNode = this.f14525n;
        layoutNode.getClass();
        C1202x sharedDrawScope = C1203y.a(layoutNode).getSharedDrawScope();
        long jK = A8.A.k(this.f14222d);
        sharedDrawScope.getClass();
        androidx.compose.runtime.collection.c cVar = null;
        while (cVarW1 != null) {
            if (cVarW1 instanceof InterfaceC1191l) {
                sharedDrawScope.c(e10, jK, this, (InterfaceC1191l) cVarW1, bVar);
            } else if ((cVarW1.f13987d & 4) != 0 && (cVarW1 instanceof AbstractC1187h)) {
                int i10 = 0;
                for (androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) cVarW1).f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
                    if ((cVar2.f13987d & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
                            cVarW1 = cVar2;
                        } else {
                            if (cVar == null) {
                                cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                            }
                            if (cVarW1 != null) {
                                cVar.b(cVarW1);
                                cVarW1 = null;
                            }
                            cVar.b(cVar2);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            cVarW1 = C1185f.b(cVar);
        }
    }

    public abstract void i1();

    public final NodeCoordinator l1(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNodeG = nodeCoordinator.f14525n;
        LayoutNode layoutNode = this.f14525n;
        if (layoutNodeG == layoutNode) {
            androidx.compose.ui.h.c cVarV1 = nodeCoordinator.v1();
            androidx.compose.ui.h.c cVarV2 = v1();
            if (!cVarV2.f13985b.f13997o) {
                R.a.b("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.h.c cVar = cVarV2.f13985b.f13989f; cVar != null; cVar = cVar.f13989f) {
                if ((cVar.f13987d & 2) != 0 && cVar == cVarV1) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNodeG.f14414q > layoutNode.f14414q) {
            layoutNodeG = layoutNodeG.G();
            kotlin.jvm.internal.i.b(layoutNodeG);
        }
        LayoutNode layoutNodeG2 = layoutNode;
        while (layoutNodeG2.f14414q > layoutNodeG.f14414q) {
            layoutNodeG2 = layoutNodeG2.G();
            kotlin.jvm.internal.i.b(layoutNodeG2);
        }
        while (layoutNodeG != layoutNodeG2) {
            layoutNodeG = layoutNodeG.G();
            layoutNodeG2 = layoutNodeG2.G();
            if (layoutNodeG == null || layoutNodeG2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNodeG2 == layoutNode) {
            return this;
        }
        return layoutNodeG == nodeCoordinator.f14525n ? nodeCoordinator : layoutNodeG.f14389G.f14365b;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.F
    public final LayoutNode n1() {
        return this.f14525n;
    }

    public final long p1(long j, boolean z10) {
        if (z10 || !this.f14438g) {
            long j10 = this.f14514A;
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j10 >> 32)))) << 32);
        }
        T t8 = this.f14523J;
        return t8 != null ? t8.e(j, true) : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // androidx.compose.ui.layout.I, androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        LayoutNode layoutNode = this.f14525n;
        if (!layoutNode.f14389G.d(64)) {
            return null;
        }
        v1();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (androidx.compose.ui.h.c cVar = layoutNode.f14389G.f14367d; cVar != null; cVar = cVar.f13989f) {
            if ((cVar.f13987d & 64) != 0) {
                ?? cVar2 = 0;
                ?? B10 = cVar;
                while (B10 != 0) {
                    if (B10 instanceof W) {
                        ref$ObjectRef.element = ((W) B10).u1(layoutNode.f14423z, ref$ObjectRef.element);
                    } else if ((B10.f13987d & 64) != 0 && (B10 instanceof AbstractC1187h)) {
                        androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                        int i10 = 0;
                        B10 = B10;
                        cVar2 = cVar2;
                        while (cVar3 != null) {
                            if ((cVar3.f13987d & 64) != 0) {
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
        }
        return ref$ObjectRef.element;
    }

    @Override // androidx.compose.ui.layout.Y
    public void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        if (!this.f14526o) {
            P1(j, f10, lVar, null);
            return;
        }
        D dR1 = r1();
        kotlin.jvm.internal.i.b(dR1);
        P1(dR1.f14345o, f10, lVar, null);
    }

    public final Ia.p<androidx.compose.ui.graphics.E, androidx.compose.ui.graphics.layer.b, p293xa.r> q1() {
        Ia.p pVar = this.f14520G;
        if (pVar != null) {
            return pVar;
        }
        final Ia.a<p293xa.r> aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                androidx.compose.ui.graphics.E e10 = nodeCoordinator.f14519F;
                kotlin.jvm.internal.i.b(e10);
                nodeCoordinator.h1(e10, this.this$0.f14518E);
                return p293xa.r.f47939a;
            }
        };
        Ia.p<androidx.compose.ui.graphics.E, androidx.compose.ui.graphics.layer.b, p293xa.r> pVar2 = new Ia.p<androidx.compose.ui.graphics.E, androidx.compose.ui.graphics.layer.b, p293xa.r>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
                androidx.compose.ui.graphics.E e11 = e10;
                androidx.compose.ui.graphics.layer.b bVar2 = bVar;
                if (this.f14525n.r()) {
                    NodeCoordinator nodeCoordinator = this;
                    nodeCoordinator.f14519F = e11;
                    nodeCoordinator.f14518E = bVar2;
                    C1203y.a(nodeCoordinator.f14525n).getSnapshotObserver().b(this, NodeCoordinator.f14508M, aVar);
                    this.f14522I = false;
                } else {
                    this.f14522I = true;
                }
                return p293xa.r.f47939a;
            }
        };
        this.f14520G = pVar2;
        return pVar2;
    }

    @Override // androidx.compose.ui.layout.Y
    public void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        if (!this.f14526o) {
            P1(j, f10, null, bVar);
            return;
        }
        D dR1 = r1();
        kotlin.jvm.internal.i.b(dR1);
        P1(dR1.f14345o, f10, null, bVar);
    }

    public abstract D r1();

    public final long u1() {
        return this.f14533v.o1(this.f14525n.f14384B.d());
    }

    public abstract androidx.compose.ui.h.c v1();

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long w(long j) {
        long jG0 = g0(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) C1203y.a(this.f14525n);
        androidComposeView.L();
        return androidx.compose.ui.graphics.a0.b(jG0, androidComposeView.f14684T);
    }

    public final androidx.compose.ui.h.c w1(int i10) {
        boolean zG = N.g(i10);
        androidx.compose.ui.h.c cVarV1 = v1();
        if (!zG && (cVarV1 = cVarV1.f13989f) == null) {
            return null;
        }
        for (androidx.compose.ui.h.c cVarB1 = B1(zG); cVarB1 != null && (cVarB1.f13988e & i10) != 0; cVarB1 = cVarB1.f13990g) {
            if ((cVarB1.f13987d & i10) != 0) {
                return cVarB1;
            }
            if (cVarB1 == cVarV1) {
                return null;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable y0() {
        return this.f14528q;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final InterfaceC1170p C0() {
        return this;
    }
}
