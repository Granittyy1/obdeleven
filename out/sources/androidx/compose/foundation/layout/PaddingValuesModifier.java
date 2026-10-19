package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PaddingValuesModifier extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public L f10198p;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        float fB = this.f10198p.b(h8.getLayoutDirection());
        float fD = this.f10198p.d();
        float fC = this.f10198p.c(h8.getLayoutDirection());
        float fA = this.f10198p.a();
        float f10 = 0;
        if (!((Float.compare(fA, f10) >= 0) & (Float.compare(fB, f10) >= 0) & (Float.compare(fD, f10) >= 0) & (Float.compare(fC, f10) >= 0))) {
            p258v.a.a("Padding must be non-negative");
        }
        final int iE1 = h8.e1(fB);
        int iE2 = h8.e1(fC) + iE1;
        final int iE3 = h8.e1(fD);
        int iE4 = h8.e1(fA) + iE3;
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.i(j, -iE2, -iE4));
        return h8.y1(p013b0.b.g(yQ.f14220b + iE2, j), p013b0.b.f(yQ.f14221c + iE4, j), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                aVar.d(yQ, iE1, iE3, 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }
}
