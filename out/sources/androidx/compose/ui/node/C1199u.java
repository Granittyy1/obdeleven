package androidx.compose.ui.node;

import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.C1159e;
import androidx.compose.ui.layout.InterfaceC1157c;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.node.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1199u extends NodeCoordinator {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final C1142s f14615W;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public InterfaceC1198t f14616S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public p013b0.a f14617T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f14618U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1159e f14619V;

    /* JADX INFO: renamed from: androidx.compose.ui.node.u$a */
    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    public final class a extends D {
        public a() {
            super(C1199u.this);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int I(int i10) {
            C1199u c1199u = C1199u.this;
            InterfaceC1198t interfaceC1198t = c1199u.f14616S;
            NodeCoordinator nodeCoordinator = c1199u.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            D dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
            return interfaceC1198t.c(this, dR1, i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int J(int i10) {
            C1199u c1199u = C1199u.this;
            InterfaceC1198t interfaceC1198t = c1199u.f14616S;
            NodeCoordinator nodeCoordinator = c1199u.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            D dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
            return interfaceC1198t.q(this, dR1, i10);
        }

        @Override // androidx.compose.ui.layout.D
        public final androidx.compose.ui.layout.Y Q(long j) {
            u0(j);
            p013b0.a aVar = new p013b0.a(j);
            C1199u c1199u = C1199u.this;
            c1199u.f14617T = aVar;
            InterfaceC1198t interfaceC1198t = c1199u.f14616S;
            NodeCoordinator nodeCoordinator = c1199u.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            D dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
            D.X0(this, interfaceC1198t.B(this, dR1, j));
            return this;
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int k0(int i10) {
            C1199u c1199u = C1199u.this;
            InterfaceC1198t interfaceC1198t = c1199u.f14616S;
            NodeCoordinator nodeCoordinator = c1199u.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            D dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
            return interfaceC1198t.o(this, dR1, i10);
        }

        @Override // androidx.compose.ui.layout.InterfaceC1166l
        public final int s(int i10) {
            C1199u c1199u = C1199u.this;
            InterfaceC1198t interfaceC1198t = c1199u.f14616S;
            NodeCoordinator nodeCoordinator = c1199u.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            D dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
            return interfaceC1198t.r(this, dR1, i10);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public final int v0(AbstractC1155a abstractC1155a) {
            int iF = com.voltasit.obdeleven.domain.usecases.device.u.f(this, abstractC1155a);
            this.f14349s.g(iF, abstractC1155a);
            return iF;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.u$b */
    /* JADX INFO: compiled from: LayoutModifierNodeCoordinator.kt */
    public static final class b implements androidx.compose.ui.layout.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.F f14621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14623c;

        public b(androidx.compose.ui.layout.F f10, C1199u c1199u) {
            this.f14621a = f10;
            a aVar = c1199u.f14618U;
            kotlin.jvm.internal.i.b(aVar);
            this.f14622b = aVar.f14220b;
            a aVar2 = c1199u.f14618U;
            kotlin.jvm.internal.i.b(aVar2);
            this.f14623c = aVar2.f14221c;
        }

        @Override // androidx.compose.ui.layout.F
        public final int getHeight() {
            return this.f14623c;
        }

        @Override // androidx.compose.ui.layout.F
        public final int getWidth() {
            return this.f14622b;
        }

        @Override // androidx.compose.ui.layout.F
        public final Map<AbstractC1155a, Integer> o() {
            return this.f14621a.o();
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
            this.f14621a.p();
        }

        @Override // androidx.compose.ui.layout.F
        public final Ia.l<Object, p293xa.r> q() {
            return this.f14621a.q();
        }
    }

    static {
        C1142s c1142sA = C1143t.a();
        c1142sA.g(androidx.compose.ui.graphics.H.f13502i);
        c1142sA.q(1.0f);
        c1142sA.r(1);
        f14615W = c1142sA;
    }

    public C1199u(LayoutNode layoutNode, InterfaceC1198t interfaceC1198t) {
        super(layoutNode);
        this.f14616S = interfaceC1198t;
        this.f14618U = layoutNode.f14407i != null ? new a() : null;
        this.f14619V = (interfaceC1198t.getNode().f13987d & 512) != 0 ? new C1159e(this, (InterfaceC1157c) interfaceC1198t) : null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int I(int i10) {
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            InterfaceC1157c interfaceC1157c = c1159e.f14240c;
            NodeCoordinator nodeCoordinator = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            return interfaceC1157c.q1(c1159e, nodeCoordinator, i10);
        }
        InterfaceC1198t interfaceC1198t = this.f14616S;
        NodeCoordinator nodeCoordinator2 = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return interfaceC1198t.c(this, nodeCoordinator2, i10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int J(int i10) {
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            InterfaceC1157c interfaceC1157c = c1159e.f14240c;
            NodeCoordinator nodeCoordinator = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            return interfaceC1157c.h0(c1159e, nodeCoordinator, i10);
        }
        InterfaceC1198t interfaceC1198t = this.f14616S;
        NodeCoordinator nodeCoordinator2 = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return interfaceC1198t.q(this, nodeCoordinator2, i10);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void O1(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        NodeCoordinator nodeCoordinator = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        nodeCoordinator.g1(e10, bVar);
        if (C1203y.a(this.f14525n).getShowLayoutBounds()) {
            long j = this.f14222d;
            e10.c(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f14615W);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    @Override // androidx.compose.ui.layout.D
    public final androidx.compose.ui.layout.Y Q(long j) {
        androidx.compose.ui.layout.F fB;
        boolean z10;
        p013b0.a aVar;
        if (this.f14527p) {
            p013b0.a aVar2 = this.f14617T;
            if (aVar2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = aVar2.f20475a;
        }
        u0(j);
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            InterfaceC1157c interfaceC1157c = c1159e.f14240c;
            a aVar3 = c1159e.f14239b.f14618U;
            kotlin.jvm.internal.i.b(aVar3);
            androidx.compose.ui.layout.F fF0 = aVar3.F0();
            fF0.getWidth();
            fF0.getHeight();
            boolean z11 = interfaceC1157c.t0() || (aVar = this.f14617T) == null || j != aVar.f20475a;
            c1159e.f14241d = z11;
            if (!z11) {
                NodeCoordinator nodeCoordinator = this.f14528q;
                kotlin.jvm.internal.i.b(nodeCoordinator);
                nodeCoordinator.f14527p = true;
            }
            kotlin.jvm.internal.i.b(this.f14528q);
            fB = interfaceC1157c.p0();
            NodeCoordinator nodeCoordinator2 = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator2);
            nodeCoordinator2.f14527p = false;
            int width = fB.getWidth();
            a aVar4 = this.f14618U;
            kotlin.jvm.internal.i.b(aVar4);
            if (width == aVar4.f14220b) {
                int height = fB.getHeight();
                a aVar5 = this.f14618U;
                kotlin.jvm.internal.i.b(aVar5);
                z10 = height == aVar5.f14221c;
            }
            if (!c1159e.f14241d) {
                NodeCoordinator nodeCoordinator3 = this.f14528q;
                kotlin.jvm.internal.i.b(nodeCoordinator3);
                long j10 = nodeCoordinator3.f14222d;
                NodeCoordinator nodeCoordinator4 = this.f14528q;
                kotlin.jvm.internal.i.b(nodeCoordinator4);
                D dR1 = nodeCoordinator4.r1();
                if (p013b0.l.a(dR1 != null ? new p013b0.l(dR1.a1()) : null, j10) && !z10) {
                    fB = new b(fB, this);
                }
            }
        } else {
            InterfaceC1198t interfaceC1198t = this.f14616S;
            NodeCoordinator nodeCoordinator5 = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator5);
            fB = interfaceC1198t.B(this, nodeCoordinator5, j);
        }
        R1(fB);
        L1();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public final void Y1() {
        boolean z10;
        if (this.f14439h) {
            return;
        }
        M1();
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            kotlin.jvm.internal.i.b(this.f14618U);
            if (c1159e.f14241d) {
                z10 = false;
            } else {
                long j = this.f14222d;
                a aVar = this.f14618U;
                if (p013b0.l.a(aVar != null ? new p013b0.l(aVar.a1()) : null, j)) {
                    NodeCoordinator nodeCoordinator = this.f14528q;
                    kotlin.jvm.internal.i.b(nodeCoordinator);
                    long j10 = nodeCoordinator.f14222d;
                    NodeCoordinator nodeCoordinator2 = this.f14528q;
                    kotlin.jvm.internal.i.b(nodeCoordinator2);
                    D dR1 = nodeCoordinator2.r1();
                    if (p013b0.l.a(dR1 != null ? new p013b0.l(dR1.a1()) : null, j10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            }
            NodeCoordinator nodeCoordinator3 = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator3);
            nodeCoordinator3.f14526o = z10;
        }
        F0().p();
        NodeCoordinator nodeCoordinator4 = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator4);
        nodeCoordinator4.f14526o = false;
    }

    public final void Z1(InterfaceC1198t interfaceC1198t) {
        if (!interfaceC1198t.equals(this.f14616S)) {
            if ((interfaceC1198t.getNode().f13987d & 512) != 0) {
                InterfaceC1157c interfaceC1157c = (InterfaceC1157c) interfaceC1198t;
                C1159e c1159e = this.f14619V;
                if (c1159e != null) {
                    c1159e.f14240c = interfaceC1157c;
                } else {
                    c1159e = new C1159e(this, interfaceC1157c);
                }
                this.f14619V = c1159e;
            } else {
                this.f14619V = null;
            }
        }
        this.f14616S = interfaceC1198t;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final void i1() {
        if (this.f14618U == null) {
            this.f14618U = new a();
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int k0(int i10) {
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            InterfaceC1157c interfaceC1157c = c1159e.f14240c;
            NodeCoordinator nodeCoordinator = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            return interfaceC1157c.F0(c1159e, nodeCoordinator, i10);
        }
        InterfaceC1198t interfaceC1198t = this.f14616S;
        NodeCoordinator nodeCoordinator2 = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return interfaceC1198t.o(this, nodeCoordinator2, i10);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Y
    public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        super.q0(j, f10, lVar);
        Y1();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Y
    public final void r0(long j, float f10, androidx.compose.ui.graphics.layer.b bVar) {
        super.r0(j, f10, bVar);
        Y1();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final D r1() {
        return this.f14618U;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1166l
    public final int s(int i10) {
        C1159e c1159e = this.f14619V;
        if (c1159e != null) {
            InterfaceC1157c interfaceC1157c = c1159e.f14240c;
            NodeCoordinator nodeCoordinator = this.f14528q;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            return interfaceC1157c.j0(c1159e, nodeCoordinator, i10);
        }
        InterfaceC1198t interfaceC1198t = this.f14616S;
        NodeCoordinator nodeCoordinator2 = this.f14528q;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return interfaceC1198t.r(this, nodeCoordinator2, i10);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final int v0(AbstractC1155a abstractC1155a) {
        a aVar = this.f14618U;
        if (aVar == null) {
            return com.voltasit.obdeleven.domain.usecases.device.u.f(this, abstractC1155a);
        }
        androidx.collection.H<AbstractC1155a> h8 = aVar.f14349s;
        int iA = h8.a(abstractC1155a);
        if (iA >= 0) {
            return h8.f9105c[iA];
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public final androidx.compose.ui.h.c v1() {
        return this.f14616S.getNode();
    }
}
