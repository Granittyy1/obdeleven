package coil.compose;

import A8.A;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* JADX INFO: compiled from: ContentPainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.ui.h.c implements InterfaceC1191l, InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Painter f22775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.d f22776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1161g f22777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f22778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public I f22779t;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(H h8, D d10, long j) {
        Y yQ = d10.Q(R1(j));
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new i(0, yQ));
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final long Q1(long j) {
        if (I.h.e(j)) {
            return 0L;
        }
        long jH = this.f22775p.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fD = I.h.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = I.h.d(j);
        }
        float fB = I.h.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = I.h.b(j);
        }
        long jB = Cb.a.b(fD, fB);
        long jA = this.f22777r.a(jB, j);
        int i10 = c0.f14231a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j : O.h.n(jB, jA);
    }

    public final long R1(long j) {
        float fJ;
        int i10;
        float fC;
        boolean zF = p013b0.a.f(j);
        boolean zE = p013b0.a.e(j);
        if (zF && zE) {
            return j;
        }
        boolean z10 = p013b0.a.d(j) && p013b0.a.c(j);
        long jH = this.f22775p.h();
        if (jH == 9205357640488583168L) {
            return z10 ? p013b0.a.a(j, p013b0.a.h(j), 0, p013b0.a.g(j), 0, 10) : j;
        }
        if (!z10 || (!zF && !zE)) {
            float fD = I.h.d(jH);
            float fB = I.h.b(jH);
            if (Float.isInfinite(fD) || Float.isNaN(fD)) {
                fJ = p013b0.a.j(j);
            } else {
                Z2.c cVar = y.f22840b;
                fJ = Na.l.C(fD, p013b0.a.j(j), p013b0.a.h(j));
            }
            if (Float.isInfinite(fB) || Float.isNaN(fB)) {
                i10 = p013b0.a.i(j);
            } else {
                Z2.c cVar2 = y.f22840b;
                fC = Na.l.C(fB, p013b0.a.i(j), p013b0.a.g(j));
            }
            long jQ1 = Q1(Cb.a.b(fJ, fC));
            return p013b0.a.a(j, p013b0.b.g(Ka.a.b(I.h.d(jQ1)), j), 0, p013b0.b.f(Ka.a.b(I.h.b(jQ1)), j), 0, 10);
        }
        fJ = p013b0.a.h(j);
        i10 = p013b0.a.g(j);
        fC = i10;
        long jQ2 = Q1(Cb.a.b(fJ, fC));
        return p013b0.a.a(j, p013b0.b.g(Ka.a.b(I.h.d(jQ2)), j), 0, p013b0.b.f(Ka.a.b(I.h.b(jQ2)), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f22775p.h() == 9205357640488583168L) {
            return interfaceC1166l.I(i10);
        }
        int I10 = interfaceC1166l.I(p013b0.a.g(R1(p013b0.b.b(0, i10, 7))));
        return Math.max(Ka.a.b(I.h.d(Q1(Cb.a.b(I10, i10)))), I10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f22775p.h() == 9205357640488583168L) {
            return interfaceC1166l.k0(i10);
        }
        int iK0 = interfaceC1166l.k0(p013b0.a.h(R1(p013b0.b.b(i10, 0, 13))));
        return Math.max(Ka.a.b(I.h.b(Q1(Cb.a.b(i10, iK0)))), iK0);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f22775p.h() == 9205357640488583168L) {
            return interfaceC1166l.J(i10);
        }
        int iJ = interfaceC1166l.J(p013b0.a.g(R1(p013b0.b.b(0, i10, 7))));
        return Math.max(Ka.a.b(I.h.d(Q1(Cb.a.b(iJ, i10)))), iJ);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f22775p.h() == 9205357640488583168L) {
            return interfaceC1166l.s(i10);
        }
        int iS = interfaceC1166l.s(p013b0.a.h(R1(p013b0.b.b(i10, 0, 13))));
        return Math.max(Ka.a.b(I.h.b(Q1(Cb.a.b(i10, iS)))), iS);
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        J.a aVar = c1202x.f14624b;
        long jQ1 = Q1(aVar.j());
        androidx.compose.ui.d dVar = this.f22776q;
        Z2.c cVar = y.f22840b;
        long jA = A.a(Ka.a.b(I.h.d(jQ1)), Ka.a.b(I.h.b(jQ1)));
        long j = aVar.j();
        long jA2 = dVar.a(jA, A.a(Ka.a.b(I.h.d(j)), Ka.a.b(I.h.b(j))), c1202x.getLayoutDirection());
        float f10 = (int) (jA2 >> 32);
        float f11 = (int) (jA2 & 4294967295L);
        aVar.f3941c.f3948a.g(f10, f11);
        this.f22775p.g(c1202x, jQ1, this.f22778s, this.f22779t);
        aVar.f3941c.f3948a.g(-f10, -f11);
        c1202x.A1();
    }
}
