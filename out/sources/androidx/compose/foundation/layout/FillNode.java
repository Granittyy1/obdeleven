package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FillNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Direction f10121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10122q;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!p013b0.a.d(j) || this.f10121p == Direction.f10109b) {
            iJ = p013b0.a.j(j);
            iH = p013b0.a.h(j);
        } else {
            int iRound = Math.round(p013b0.a.h(j) * this.f10122q);
            int iJ2 = p013b0.a.j(j);
            iJ = p013b0.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!p013b0.a.c(j) || this.f10121p == Direction.f10110c) {
            int i10 = p013b0.a.i(j);
            iG = p013b0.a.g(j);
            iG2 = i10;
        } else {
            int iRound2 = Math.round(p013b0.a.g(j) * this.f10122q);
            int i11 = p013b0.a.i(j);
            iG2 = p013b0.a.g(j);
            if (iRound2 < i11) {
                iRound2 = i11;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.a(iJ, iH, iG2, iG));
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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
}
