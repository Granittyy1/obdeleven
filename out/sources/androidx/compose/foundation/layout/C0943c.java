package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.C1165k;
import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0943c extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1165k f10251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10253r;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final C1165k c1165k = this.f10251p;
        final float f10 = this.f10252q;
        float f11 = this.f10253r;
        final androidx.compose.ui.layout.Y yQ = d10.Q(c1165k != null ? p013b0.a.a(j, 0, 0, 0, 0, 11) : p013b0.a.a(j, 0, 0, 0, 0, 14));
        int iV = yQ.V(c1165k);
        if (iV == Integer.MIN_VALUE) {
            iV = 0;
        }
        int i10 = c1165k != null ? yQ.f14221c : yQ.f14220b;
        int iG = (c1165k != null ? p013b0.a.g(j) : p013b0.a.h(j)) - i10;
        final int iD = Na.l.D((!Float.isNaN(f10) ? h8.e1(f10) : 0) - iV, 0, iG);
        final int iD2 = Na.l.D(((!Float.isNaN(f11) ? h8.e1(f11) : 0) - i10) + iV, 0, iG - iD);
        final int iMax = c1165k != null ? yQ.f14220b : Math.max(yQ.f14220b + iD + iD2, p013b0.a.j(j));
        final int iMax2 = c1165k != null ? Math.max(yQ.f14221c + iD + iD2, p013b0.a.i(j)) : yQ.f14221c;
        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                int i11;
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                int i12 = 0;
                if (c1165k instanceof C1165k) {
                    i11 = 0;
                } else {
                    i11 = !p013b0.f.a(f10, Float.NaN) ? iD : (iMax - iD2) - yQ.f14220b;
                }
                if (c1165k instanceof C1165k) {
                    i12 = !p013b0.f.a(f10, Float.NaN) ? iD : (iMax2 - iD2) - yQ.f14221c;
                }
                androidx.compose.ui.layout.Y.a.g(aVar2, yQ, i11, i12);
                return p293xa.r.f47939a;
            }
        });
    }
}
