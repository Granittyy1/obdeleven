package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SizeNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f10212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10213t;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        int iJ;
        int iH;
        int i10;
        int iG;
        long jA;
        long jQ1 = Q1(h8);
        if (this.f10213t) {
            jA = p013b0.b.e(j, jQ1);
        } else {
            if (Float.isNaN(this.f10209p)) {
                iJ = p013b0.a.j(j);
                int iH2 = p013b0.a.h(jQ1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = p013b0.a.j(jQ1);
            }
            if (Float.isNaN(this.f10211r)) {
                iH = p013b0.a.h(j);
                int iJ2 = p013b0.a.j(jQ1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = p013b0.a.h(jQ1);
            }
            if (Float.isNaN(this.f10210q)) {
                i10 = p013b0.a.i(j);
                int iG2 = p013b0.a.g(jQ1);
                if (i10 > iG2) {
                    i10 = iG2;
                }
            } else {
                i10 = p013b0.a.i(jQ1);
            }
            if (Float.isNaN(this.f10212s)) {
                iG = p013b0.a.g(j);
                int i11 = p013b0.a.i(jQ1);
                if (iG < i11) {
                    iG = i11;
                }
            } else {
                iG = p013b0.a.g(jQ1);
            }
            jA = p013b0.b.a(iJ, iH, i10, iG);
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(jA);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a.g(aVar, yQ, 0, 0);
                return p293xa.r.f47939a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long Q1(InterfaceC1167m interfaceC1167m) {
        int iE1;
        int iE2;
        int iE3;
        int i10 = 0;
        if (Float.isNaN(this.f10211r)) {
            iE1 = Integer.MAX_VALUE;
        } else {
            iE1 = interfaceC1167m.e1(this.f10211r);
            if (iE1 < 0) {
                iE1 = 0;
            }
        }
        if (Float.isNaN(this.f10212s)) {
            iE2 = Integer.MAX_VALUE;
        } else {
            iE2 = interfaceC1167m.e1(this.f10212s);
            if (iE2 < 0) {
                iE2 = 0;
            }
        }
        if (Float.isNaN(this.f10209p)) {
            iE3 = 0;
        } else {
            iE3 = interfaceC1167m.e1(this.f10209p);
            if (iE3 < 0) {
                iE3 = 0;
            }
            if (iE3 > iE1) {
                iE3 = iE1;
            }
            if (iE3 == Integer.MAX_VALUE) {
                iE3 = 0;
            }
        }
        if (!Float.isNaN(this.f10210q)) {
            int iE4 = interfaceC1167m.e1(this.f10210q);
            if (iE4 < 0) {
                iE4 = 0;
            }
            if (iE4 > iE2) {
                iE4 = iE2;
            }
            if (iE4 != Integer.MAX_VALUE) {
                i10 = iE4;
            }
        }
        return p013b0.b.a(iE3, iE1, i10, iE2);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        long jQ1 = Q1(lookaheadCapablePlaceable);
        if (p013b0.a.f(jQ1)) {
            return p013b0.a.h(jQ1);
        }
        if (!this.f10213t) {
            i10 = p013b0.b.f(i10, jQ1);
        }
        return p013b0.b.g(interfaceC1166l.I(i10), jQ1);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        long jQ1 = Q1(lookaheadCapablePlaceable);
        if (p013b0.a.e(jQ1)) {
            return p013b0.a.g(jQ1);
        }
        if (!this.f10213t) {
            i10 = p013b0.b.g(i10, jQ1);
        }
        return p013b0.b.f(interfaceC1166l.k0(i10), jQ1);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        long jQ1 = Q1(lookaheadCapablePlaceable);
        if (p013b0.a.f(jQ1)) {
            return p013b0.a.h(jQ1);
        }
        if (!this.f10213t) {
            i10 = p013b0.b.f(i10, jQ1);
        }
        return p013b0.b.g(interfaceC1166l.J(i10), jQ1);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        long jQ1 = Q1(lookaheadCapablePlaceable);
        if (p013b0.a.e(jQ1)) {
            return p013b0.a.g(jQ1);
        }
        if (!this.f10213t) {
            i10 = p013b0.b.g(i10, jQ1);
        }
        return p013b0.b.f(interfaceC1166l.s(i10), jQ1);
    }
}
