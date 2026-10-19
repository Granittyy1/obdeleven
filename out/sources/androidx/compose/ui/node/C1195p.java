package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.layout.AbstractC1155a;
import com.braze.support.BrazeLogger;

/* JADX INFO: renamed from: androidx.compose.ui.node.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1195p extends NodeCoordinator {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final C1142s f14601U;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final c0 f14602S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public a f14603T;

    /* JADX INFO: renamed from: androidx.compose.ui.node.p$a */
    /* JADX INFO: compiled from: InnerNodeCoordinator.kt */
    public final class a extends D {
        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int I(int i10) {
            androidx.compose.foundation.lazy.grid.x xVarF = this.f14344n.f14525n.F();
            androidx.compose.ui.layout.E eA = xVarF.a();
            LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
            return eA.j(layoutNode.f14389G.f14366c, layoutNode.y(), i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int J(int i10) {
            androidx.compose.foundation.lazy.grid.x xVarF = this.f14344n.f14525n.F();
            androidx.compose.ui.layout.E eA = xVarF.a();
            LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
            return eA.h(layoutNode.f14389G.f14366c, layoutNode.y(), i10);
        }

        @Override // androidx.compose.ui.layout.D
        public final androidx.compose.ui.layout.Y Q(long j) {
            u0(j);
            NodeCoordinator nodeCoordinator = this.f14344n;
            androidx.compose.runtime.collection.c<LayoutNode> cVarJ = nodeCoordinator.f14525n.J();
            LayoutNode[] layoutNodeArr = cVarJ.f12943b;
            int i10 = cVarJ.f12945d;
            for (int i11 = 0; i11 < i10; i11++) {
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i11].f14390H.f14642q;
                kotlin.jvm.internal.i.b(lookaheadPassDelegate);
                lookaheadPassDelegate.f14447k = LayoutNode.UsageByParent.f14433d;
            }
            LayoutNode layoutNode = nodeCoordinator.f14525n;
            D.X0(this, layoutNode.f14421x.g(this, layoutNode.y(), j));
            return this;
        }

        @Override // androidx.compose.ui.node.D
        public final void b1() {
            LookaheadPassDelegate lookaheadPassDelegate = this.f14344n.f14525n.f14390H.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            lookaheadPassDelegate.E0();
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int k0(int i10) {
            androidx.compose.foundation.lazy.grid.x xVarF = this.f14344n.f14525n.F();
            androidx.compose.ui.layout.E eA = xVarF.a();
            LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
            return eA.i(layoutNode.f14389G.f14366c, layoutNode.y(), i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int s(int i10) {
            androidx.compose.foundation.lazy.grid.x xVarF = this.f14344n.f14525n.F();
            androidx.compose.ui.layout.E eA = xVarF.a();
            LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
            return eA.m(layoutNode.f14389G.f14366c, layoutNode.y(), i10);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int v0(AbstractC1155a abstractC1155a) {
            LookaheadPassDelegate lookaheadPassDelegate = this.f14344n.f14525n.f14390H.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            boolean z10 = lookaheadPassDelegate.f14448l;
            A a10 = lookaheadPassDelegate.f14456t;
            if (!z10) {
                C1204z c1204z = lookaheadPassDelegate.f14444g;
                if (c1204z.f14630d == LayoutNode.LayoutState.f14426c) {
                    a10.f14310f = true;
                    if (a10.f14306b) {
                        c1204z.f14632f = true;
                        c1204z.f14633g = true;
                    }
                } else {
                    a10.f14311g = true;
                }
            }
            a aVar = lookaheadPassDelegate.x().f14603T;
            if (aVar != null) {
                aVar.f14440i = true;
            }
            lookaheadPassDelegate.Z();
            a aVar2 = lookaheadPassDelegate.x().f14603T;
            if (aVar2 != null) {
                aVar2.f14440i = false;
            }
            Integer num = (Integer) a10.f14313i.get(abstractC1155a);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            this.f14349s.g(iIntValue, abstractC1155a);
            return iIntValue;
        }
    }

    static {
        C1142s c1142sA = C1143t.a();
        c1142sA.g(androidx.compose.ui.graphics.H.f13500g);
        c1142sA.q(1.0f);
        c1142sA.r(1);
        f14601U = c1142sA;
    }

    public C1195p(LayoutNode layoutNode) {
        super(layoutNode);
        c0 c0Var = new c0();
        c0Var.f13988e = 0;
        this.f14602S = c0Var;
        c0Var.f13992i = this;
        this.f14603T = layoutNode.f14407i != null ? new a(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void F1(NodeCoordinator.c cVar, long j, C1194o c1194o, int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        LayoutNode[] layoutNodeArr;
        int i12;
        int i13;
        LayoutNode layoutNode;
        LayoutNode[] layoutNodeArr2;
        int i14;
        long jE;
        LayoutNode layoutNode2 = this.f14525n;
        if (cVar.d(layoutNode2)) {
            if (X1(j)) {
                z11 = z10;
                z12 = true;
            } else if (androidx.compose.ui.input.pointer.y.a(i10, 1) && (Float.floatToRawIntBits(c1(j, u1())) & BrazeLogger.SUPPRESS) < 2139095040) {
                z12 = true;
                z11 = false;
            }
            if (z12) {
                i11 = c1194o.f14593d;
                androidx.compose.runtime.collection.c<LayoutNode> cVarI = layoutNode2.I();
                layoutNodeArr = cVarI.f12943b;
                i12 = cVarI.f12945d - 1;
                loop0: while (true) {
                    if (i12 >= 0) {
                        i13 = i11;
                        break;
                    }
                    layoutNode = layoutNodeArr[i12];
                    if (layoutNode.r()) {
                        layoutNodeArr2 = layoutNodeArr;
                        i14 = i11;
                        cVar.b(layoutNode, j, c1194o, i10, z11);
                        jE = c1194o.e();
                        if (C1189j.b(jE) < 0.0f && C1189j.d(jE) && !C1189j.c(jE)) {
                            NodeCoordinator nodeCoordinator = layoutNode.f14389G.f14366c;
                            nodeCoordinator.getClass();
                            androidx.compose.ui.h.c cVarB1 = nodeCoordinator.B1(N.g(16));
                            if (cVarB1 != null && cVarB1.f13997o) {
                                if (!cVarB1.f13985b.f13997o) {
                                    R.a.b("visitLocalDescendants called on an unattached node");
                                }
                                androidx.compose.ui.h.c cVar2 = cVarB1.f13985b;
                                if ((cVar2.f13988e & 16) != 0) {
                                    while (true) {
                                        if (cVar2 != null) {
                                            if ((cVar2.f13987d & 16) != 0) {
                                                ?? B10 = cVar2;
                                                ?? cVar3 = 0;
                                                while (true) {
                                                    if (B10 != 0) {
                                                        if (B10 instanceof Y) {
                                                            if (((Y) B10).l1()) {
                                                                c1194o.f14593d = c1194o.f14591b.f9109b - 1;
                                                            }
                                                        } else if ((B10.f13987d & 16) != 0 && (B10 instanceof AbstractC1187h)) {
                                                            androidx.compose.ui.h.c cVar4 = ((AbstractC1187h) B10).f14585q;
                                                            int i15 = 0;
                                                            while (cVar4 != null) {
                                                                if ((cVar4.f13987d & 16) != 0) {
                                                                    i15++;
                                                                    if (i15 == 1) {
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
                                                            if (i15 == 1) {
                                                                B10 = B10;
                                                                cVar3 = cVar3;
                                                            } else {
                                                                B10 = B10;
                                                                cVar3 = cVar3;
                                                            }
                                                        }
                                                        B10 = C1185f.b(cVar3);
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                            cVar2 = cVar2.f13990g;
                                        }
                                    }
                                }
                            }
                            i13 = i14;
                            break;
                        }
                    } else {
                        layoutNodeArr2 = layoutNodeArr;
                        i14 = i11;
                    }
                    i12--;
                    layoutNodeArr = layoutNodeArr2;
                    i11 = i14;
                }
                c1194o.f14593d = i13;
            }
        }
        z11 = z10;
        z12 = false;
        if (z12) {
            i11 = c1194o.f14593d;
            androidx.compose.runtime.collection.c<LayoutNode> cVarI2 = layoutNode2.I();
            layoutNodeArr = cVarI2.f12943b;
            i12 = cVarI2.f12945d - 1;
            loop0: while (true) {
                if (i12 >= 0) {
                    i13 = i11;
                    break;
                }
                layoutNode = layoutNodeArr[i12];
                if (layoutNode.r()) {
                    layoutNodeArr2 = layoutNodeArr;
                    i14 = i11;
                    cVar.b(layoutNode, j, c1194o, i10, z11);
                    jE = c1194o.e();
                    if (C1189j.b(jE) < 0.0f) {
                        continue;
                    }
                } else {
                    layoutNodeArr2 = layoutNodeArr;
                    i14 = i11;
                }
                i12--;
                layoutNodeArr = layoutNodeArr2;
                i11 = i14;
            }
            c1194o.f14593d = i13;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        androidx.compose.foundation.lazy.grid.x xVarF = this.f14525n.F();
        androidx.compose.ui.layout.E eA = xVarF.a();
        LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
        return eA.j(layoutNode.f14389G.f14366c, layoutNode.z(), i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        androidx.compose.foundation.lazy.grid.x xVarF = this.f14525n.F();
        androidx.compose.ui.layout.E eA = xVarF.a();
        LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
        return eA.h(layoutNode.f14389G.f14366c, layoutNode.z(), i10);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void O1(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        LayoutNode layoutNode = this.f14525n;
        U uA = C1203y.a(layoutNode);
        androidx.compose.runtime.collection.c<LayoutNode> cVarI = layoutNode.I();
        LayoutNode[] layoutNodeArr = cVarI.f12943b;
        int i10 = cVarI.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (layoutNode2.r()) {
                layoutNode2.w(e10, bVar);
            }
        }
        if (uA.getShowLayoutBounds()) {
            long j = this.f14222d;
            e10.c(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f14601U);
        }
    }

    @Override // androidx.compose.ui.layout.D
    public final androidx.compose.ui.layout.Y Q(long j) {
        if (this.f14527p) {
            a aVar = this.f14603T;
            kotlin.jvm.internal.i.b(aVar);
            j = aVar.f14223e;
        }
        u0(j);
        LayoutNode layoutNode = this.f14525n;
        androidx.compose.runtime.collection.c<LayoutNode> cVarJ = layoutNode.J();
        LayoutNode[] layoutNodeArr = cVarJ.f12943b;
        int i10 = cVarJ.f12945d;
        for (int i11 = 0; i11 < i10; i11++) {
            layoutNodeArr[i11].f14390H.f14641p.f14489m = LayoutNode.UsageByParent.f14433d;
        }
        R1(layoutNode.f14421x.g(this, layoutNode.z(), j));
        L1();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void i1() {
        if (this.f14603T == null) {
            this.f14603T = new a(this);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        androidx.compose.foundation.lazy.grid.x xVarF = this.f14525n.F();
        androidx.compose.ui.layout.E eA = xVarF.a();
        LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
        return eA.i(layoutNode.f14389G.f14366c, layoutNode.z(), i10);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Y
    public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        super.q0(j, f10, lVar);
        if (this.f14439h) {
            return;
        }
        this.f14525n.f14390H.f14641p.F0();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Y
    public final void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        super.r0(j, f10, bVar);
        if (this.f14439h) {
            return;
        }
        this.f14525n.f14390H.f14641p.F0();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final D r1() {
        return this.f14603T;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        androidx.compose.foundation.lazy.grid.x xVarF = this.f14525n.F();
        androidx.compose.ui.layout.E eA = xVarF.a();
        LayoutNode layoutNode = (LayoutNode) xVarF.f10535a;
        return eA.m(layoutNode.f14389G.f14366c, layoutNode.z(), i10);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int v0(AbstractC1155a abstractC1155a) {
        a aVar = this.f14603T;
        if (aVar != null) {
            return aVar.v0(abstractC1155a);
        }
        MeasurePassDelegate measurePassDelegate = this.f14525n.f14390H.f14641p;
        boolean z10 = measurePassDelegate.f14490n;
        C1201w c1201w = measurePassDelegate.f14502z;
        if (!z10) {
            if (measurePassDelegate.f14484g.f14630d == LayoutNode.LayoutState.f14425b) {
                c1201w.f14310f = true;
                if (c1201w.f14306b) {
                    measurePassDelegate.f14500x = true;
                    measurePassDelegate.f14501y = true;
                }
            } else {
                c1201w.f14311g = true;
            }
        }
        measurePassDelegate.x().f14440i = true;
        measurePassDelegate.Z();
        measurePassDelegate.x().f14440i = false;
        Integer num = (Integer) c1201w.f14313i.get(abstractC1155a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.h.c v1() {
        return this.f14602S;
    }
}
