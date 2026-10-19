package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC1170p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.node.D f14172b;

    public C(androidx.compose.ui.node.D d10) {
        this.f14172b = d10;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long B(InterfaceC1170p interfaceC1170p, long j) {
        return d(interfaceC1170p, j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final InterfaceC1170p D() {
        androidx.compose.ui.node.D dR1;
        if (!c()) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = this.f14172b.f14344n.f14529r;
        if (nodeCoordinator == null || (dR1 = nodeCoordinator.r1()) == null) {
            return null;
        }
        return dR1.f14347q;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final void G(float[] fArr) {
        this.f14172b.f14344n.G(fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final I.f H(InterfaceC1170p interfaceC1170p, boolean z10) {
        return this.f14172b.f14344n.H(interfaceC1170p, z10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long T(long j) {
        return I.d.g(this.f14172b.f14344n.T(j), b());
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final void U(InterfaceC1170p interfaceC1170p, float[] fArr) {
        this.f14172b.f14344n.U(interfaceC1170p, fArr);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final InterfaceC1170p X() {
        androidx.compose.ui.node.D dR1;
        if (!c()) {
            R.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        NodeCoordinator nodeCoordinator = this.f14172b.f14344n.f14525n.f14389G.f14366c.f14529r;
        if (nodeCoordinator == null || (dR1 = nodeCoordinator.r1()) == null) {
            return null;
        }
        return dR1.f14347q;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long a() {
        androidx.compose.ui.node.D d10 = this.f14172b;
        return (((long) d10.f14220b) << 32) | (((long) d10.f14221c) & 4294967295L);
    }

    public final long b() {
        androidx.compose.ui.node.D d10 = this.f14172b;
        androidx.compose.ui.node.D dC = p144l6.b.c(d10);
        return I.d.f(d(dC.f14347q, 0L), d10.f14344n.I1(dC.f14344n, 0L));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final boolean c() {
        return this.f14172b.f14344n.v1().f13997o;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long c0(long j) {
        return I.d.g(this.f14172b.f14344n.c0(j), b());
    }

    public final long d(InterfaceC1170p interfaceC1170p, long j) {
        boolean z10 = interfaceC1170p instanceof C;
        androidx.compose.ui.node.D d10 = this.f14172b;
        if (!z10) {
            androidx.compose.ui.node.D dC = p144l6.b.c(d10);
            long jD = d(dC.f14347q, j);
            long j10 = dC.f14345o;
            long jF = I.d.f(jD, (((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
            InterfaceC1170p interfaceC1170p2 = dC.f14344n;
            InterfaceC1170p interfaceC1170pD = interfaceC1170p2.D();
            if (interfaceC1170pD != null) {
                interfaceC1170p2 = interfaceC1170pD;
            }
            return I.d.g(jF, ((NodeCoordinator) interfaceC1170p2).I1(interfaceC1170p, 0L));
        }
        androidx.compose.ui.node.D d11 = ((C) interfaceC1170p).f14172b;
        d11.f14344n.K1();
        androidx.compose.ui.node.D dR1 = d10.f14344n.l1(d11.f14344n).r1();
        if (dR1 != null) {
            long jC = p013b0.j.c(p013b0.j.d(d11.g1(dR1, false), Cb.a.l(j)), d10.g1(dR1, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        androidx.compose.ui.node.D dC2 = p144l6.b.c(d11);
        long jD2 = p013b0.j.d(p013b0.j.d(d11.g1(dC2, false), dC2.f14345o), Cb.a.l(j));
        androidx.compose.ui.node.D dC3 = p144l6.b.c(d10);
        long jC2 = p013b0.j.c(jD2, p013b0.j.d(d10.g1(dC3, false), dC3.f14345o));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        NodeCoordinator nodeCoordinator = dC3.f14344n.f14529r;
        kotlin.jvm.internal.i.b(nodeCoordinator);
        NodeCoordinator nodeCoordinator2 = dC2.f14344n.f14529r;
        kotlin.jvm.internal.i.b(nodeCoordinator2);
        return nodeCoordinator.I1(nodeCoordinator2, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long g0(long j) {
        return this.f14172b.f14344n.g0(I.d.g(j, b()));
    }

    @Override // androidx.compose.ui.layout.InterfaceC1170p
    public final long w(long j) {
        return this.f14172b.f14344n.w(I.d.g(j, b()));
    }
}
