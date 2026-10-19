package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class IntrinsicSizeModifier extends androidx.compose.ui.h.c implements InterfaceC1198t {
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        long jQ1 = Q1(d10, j);
        if (R1()) {
            jQ1 = p013b0.b.e(j, jQ1);
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(jQ1);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                androidx.compose.ui.layout.Y y10 = yQ;
                if (aVar2.b() == LayoutDirection.f15717b || aVar2.c() == 0) {
                    androidx.compose.ui.layout.Y.a.a(aVar2, y10);
                    y10.q0(p013b0.j.d(0L, y10.f14224f), 0.0f, null);
                } else {
                    int i10 = (int) 0;
                    long jC = ((long) ((aVar2.c() - y10.f14220b) - i10)) << 32;
                    androidx.compose.ui.layout.Y.a.a(aVar2, y10);
                    y10.q0(p013b0.j.d((((long) i10) & 4294967295L) | jC, y10.f14224f), 0.0f, null);
                }
                return p293xa.r.f47939a;
            }
        });
    }

    public abstract long Q1(androidx.compose.ui.layout.D d10, long j);

    public abstract boolean R1();

    public int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return interfaceC1166l.I(i10);
    }

    public int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return interfaceC1166l.k0(i10);
    }

    public int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return interfaceC1166l.J(i10);
    }

    public int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return interfaceC1166l.s(i10);
    }
}
