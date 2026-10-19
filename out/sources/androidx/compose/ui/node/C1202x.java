package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.ui.node.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1202x implements J.e, J.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.a f14624b = new J.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1191l f14625c;

    @Override // p013b0.c
    public final long A0(float f10) {
        return this.f14624b.A0(f10);
    }

    @Override // J.c
    public final void A1() {
        J.a aVar = this.f14624b;
        androidx.compose.ui.graphics.E eA = aVar.f3941c.a();
        InterfaceC1191l interfaceC1191l = this.f14625c;
        if (interfaceC1191l == null) {
            throw C4.v.g("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        androidx.compose.ui.h.c cVarB = interfaceC1191l.getNode().f13990g;
        if (cVarB != null && (cVarB.f13988e & 4) != 0) {
            while (true) {
                if (cVarB != null) {
                    int i10 = cVarB.f13987d;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            break;
                        } else {
                            cVarB = cVarB.f13990g;
                        }
                    }
                }
                cVarB = null;
                break;
            }
        } else {
            cVarB = null;
            break;
        }
        if (cVarB == null) {
            NodeCoordinator nodeCoordinatorD = C1185f.d(interfaceC1191l, 4);
            if (nodeCoordinatorD.v1() == interfaceC1191l.getNode()) {
                nodeCoordinatorD = nodeCoordinatorD.f14528q;
                kotlin.jvm.internal.i.b(nodeCoordinatorD);
            }
            nodeCoordinatorD.O1(eA, aVar.f3941c.f3949b);
            return;
        }
        androidx.compose.runtime.collection.c cVar = null;
        while (cVarB != null) {
            if (cVarB instanceof InterfaceC1191l) {
                InterfaceC1191l interfaceC1191l2 = (InterfaceC1191l) cVarB;
                androidx.compose.ui.graphics.layer.b bVar = aVar.f3941c.f3949b;
                NodeCoordinator nodeCoordinatorD2 = C1185f.d(interfaceC1191l2, 4);
                long jK = A8.A.k(nodeCoordinatorD2.f14222d);
                LayoutNode layoutNode = nodeCoordinatorD2.f14525n;
                layoutNode.getClass();
                C1203y.a(layoutNode).getSharedDrawScope().c(eA, jK, nodeCoordinatorD2, interfaceC1191l2, bVar);
            } else if ((cVarB.f13987d & 4) != 0 && (cVarB instanceof AbstractC1187h)) {
                int i11 = 0;
                for (androidx.compose.ui.h.c cVar2 = ((AbstractC1187h) cVarB).f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
                    if ((cVar2.f13987d & 4) != 0) {
                        i11++;
                        if (i11 == 1) {
                            cVarB = cVar2;
                        } else {
                            if (cVar == null) {
                                cVar = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                            }
                            if (cVarB != null) {
                                cVar.b(cVarB);
                                cVarB = null;
                            }
                            cVar.b(cVar2);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            cVarB = C1185f.b(cVar);
        }
    }

    @Override // J.e
    public final void B0(long j, float f10, float f11, long j10, long j11, float f12, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.B0(j, f10, f11, j10, j11, f12, fVar, i10, i11);
    }

    @Override // J.e
    public final void J0(Path path, long j, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.J0(path, j, f10, fVar, i10, i11);
    }

    @Override // J.e
    public final void L(androidx.compose.ui.graphics.W w3, long j, long j10, long j11, long j12, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11, int i12) {
        this.f14624b.L(w3, j, j10, j11, j12, f10, fVar, i10, i11, i12);
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14624b.P0();
    }

    @Override // J.e
    public final void Q0(long j, long j10, long j11, float f10, int i10, p019b6.d dVar, float f11, androidx.compose.ui.graphics.I i11, int i12) {
        this.f14624b.Q0(j, j10, j11, f10, i10, dVar, f11, i11, i12);
    }

    @Override // J.e
    public final void R(long j, long j10, long j11, long j12, J.f fVar, float f10, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.R(j, j10, j11, j12, fVar, f10, i10, i11);
    }

    @Override // J.e
    public final void S(long j, float f10, long j10, float f11, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.S(j, f10, j10, f11, fVar, i10, i11);
    }

    @Override // p013b0.c
    public final float T0(float f10) {
        return this.f14624b.getDensity() * f10;
    }

    @Override // p013b0.c
    public final long W(float f10) {
        return this.f14624b.W(f10);
    }

    @Override // J.e
    public final J.a.b W0() {
        return this.f14624b.f3941c;
    }

    public final void c(androidx.compose.ui.graphics.E e10, long j, NodeCoordinator nodeCoordinator, InterfaceC1191l interfaceC1191l, androidx.compose.ui.graphics.layer.b bVar) {
        InterfaceC1191l interfaceC1191l2 = this.f14625c;
        this.f14625c = interfaceC1191l;
        LayoutDirection layoutDirection = nodeCoordinator.f14525n.f14383A;
        J.a aVar = this.f14624b;
        p013b0.c cVarB = aVar.f3941c.b();
        J.a.b bVar2 = aVar.f3941c;
        LayoutDirection layoutDirectionD = bVar2.d();
        androidx.compose.ui.graphics.E eA = bVar2.a();
        long jE = bVar2.e();
        androidx.compose.ui.graphics.layer.b bVar3 = bVar2.f3949b;
        bVar2.g(nodeCoordinator);
        bVar2.i(layoutDirection);
        bVar2.f(e10);
        bVar2.j(j);
        bVar2.f3949b = bVar;
        e10.g();
        try {
            interfaceC1191l.x(this);
            e10.o();
            bVar2.g(cVarB);
            bVar2.i(layoutDirectionD);
            bVar2.f(eA);
            bVar2.j(jE);
            bVar2.f3949b = bVar3;
            this.f14625c = interfaceC1191l2;
        } catch (Throwable th) {
            e10.o();
            bVar2.g(cVarB);
            bVar2.i(layoutDirectionD);
            bVar2.f(eA);
            bVar2.j(jE);
            bVar2.f3949b = bVar3;
            throw th;
        }
    }

    @Override // J.e
    public final void d1(androidx.compose.ui.graphics.C c10, long j, long j10, long j11, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.d1(c10, j, j10, j11, f10, fVar, i10, i11);
    }

    @Override // p013b0.c
    public final float e0(long j) {
        return this.f14624b.e0(j);
    }

    @Override // p013b0.c
    public final int e1(float f10) {
        return this.f14624b.e1(f10);
    }

    @Override // J.e
    public final void f0(androidx.compose.ui.graphics.C c10, long j, long j10, float f10, int i10, p019b6.d dVar, float f11, androidx.compose.ui.graphics.I i11, int i12) {
        this.f14624b.f0(c10, j, j10, f10, i10, dVar, f11, i11, i12);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14624b.getDensity();
    }

    @Override // J.e
    public final LayoutDirection getLayoutDirection() {
        return this.f14624b.f3940b.f3945b;
    }

    @Override // J.e
    public final long j() {
        return this.f14624b.j();
    }

    @Override // J.e
    public final long j1() {
        return this.f14624b.j1();
    }

    @Override // J.e
    public final void k1(androidx.compose.ui.graphics.W w3, long j, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.k1(w3, j, f10, fVar, i10, i11);
    }

    @Override // J.e
    public final void m1(Path path, androidx.compose.ui.graphics.C c10, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.m1(path, c10, f10, fVar, i10, i11);
    }

    @Override // p013b0.c
    public final long o1(long j) {
        return this.f14624b.o1(j);
    }

    @Override // p013b0.c
    public final long p(long j) {
        return this.f14624b.p(j);
    }

    @Override // p013b0.c
    public final float s1(long j) {
        return this.f14624b.s1(j);
    }

    @Override // p013b0.c
    public final float u(int i10) {
        return this.f14624b.u(i10);
    }

    @Override // p013b0.c
    public final float v(float f10) {
        return f10 / this.f14624b.getDensity();
    }

    @Override // p013b0.c
    public final long w0(int i10) {
        return this.f14624b.w0(i10);
    }

    @Override // J.e
    public final void x1(long j, long j10, long j11, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.x1(j, j10, j11, f10, fVar, i10, i11);
    }

    @Override // J.e
    public final void z1(androidx.compose.ui.graphics.C c10, long j, long j10, float f10, J.f fVar, androidx.compose.ui.graphics.I i10, int i11) {
        this.f14624b.z1(c10, j, j10, f10, fVar, i10, i11);
    }
}
