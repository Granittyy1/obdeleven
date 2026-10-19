package androidx.compose.foundation.lazy;

import androidx.compose.runtime.N0;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.InterfaceC1198t;
import kotlin.collections.y;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ParentSizeNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N0<Integer> f10380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public N0<Integer> f10381r;

    public ParentSizeNode() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(H h8, D d10, long j) {
        N0<Integer> n10 = this.f10380q;
        int iRound = (n10 == null || n10.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(n10.getValue().floatValue() * this.f10379p);
        N0<Integer> n11 = this.f10381r;
        int iRound2 = (n11 == null || n11.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(n11.getValue().floatValue() * this.f10379p);
        int iJ = iRound != Integer.MAX_VALUE ? iRound : p013b0.a.j(j);
        int i10 = iRound2 != Integer.MAX_VALUE ? iRound2 : p013b0.a.i(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = p013b0.a.h(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = p013b0.a.g(j);
        }
        final Y yQ = d10.Q(p013b0.b.a(iJ, iRound, i10, iRound2));
        return h8.y1(yQ.f14220b, yQ.f14221c, y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.lazy.ParentSizeNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                aVar.d(yQ, 0, 0, 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }
}
