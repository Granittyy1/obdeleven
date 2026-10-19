package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10221q;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        int iJ;
        int i10;
        if (Float.isNaN(this.f10220p) || p013b0.a.j(j) != 0) {
            iJ = p013b0.a.j(j);
        } else {
            int iE1 = h8.e1(this.f10220p);
            iJ = p013b0.a.h(j);
            if (iE1 < 0) {
                iE1 = 0;
            }
            if (iE1 <= iJ) {
                iJ = iE1;
            }
        }
        int iH = p013b0.a.h(j);
        if (Float.isNaN(this.f10221q) || p013b0.a.i(j) != 0) {
            i10 = p013b0.a.i(j);
        } else {
            int iE2 = h8.e1(this.f10221q);
            i10 = p013b0.a.g(j);
            int i11 = iE2 >= 0 ? iE2 : 0;
            if (i11 <= i10) {
                i10 = i11;
            }
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.a(iJ, iH, i10, p013b0.a.g(j)));
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
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

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        int I10 = interfaceC1166l.I(i10);
        int iE1 = !Float.isNaN(this.f10220p) ? lookaheadCapablePlaceable.e1(this.f10220p) : 0;
        return I10 < iE1 ? iE1 : I10;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        int iK0 = interfaceC1166l.k0(i10);
        int iE1 = !Float.isNaN(this.f10221q) ? lookaheadCapablePlaceable.e1(this.f10221q) : 0;
        return iK0 < iE1 ? iE1 : iK0;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        int iJ = interfaceC1166l.J(i10);
        int iE1 = !Float.isNaN(this.f10220p) ? lookaheadCapablePlaceable.e1(this.f10220p) : 0;
        return iJ < iE1 ? iE1 : iJ;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        int iS = interfaceC1166l.s(i10);
        int iE1 = !Float.isNaN(this.f10221q) ? lookaheadCapablePlaceable.e1(this.f10221q) : 0;
        return iS < iE1 ? iE1 : iS;
    }
}
