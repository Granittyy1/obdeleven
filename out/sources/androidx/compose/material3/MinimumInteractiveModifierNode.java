package androidx.compose.material3;

import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: InteractiveComponentSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends androidx.compose.ui.h.c implements InterfaceC1182c, InterfaceC1198t {
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        float f10 = 0;
        float fX = Na.l.x(((p013b0.f) C1183d.a(this, InteractiveComponentSizeKt.f12188a)).f20481b, f10);
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        boolean z10 = this.f13997o && !Float.isNaN(fX) && Float.compare(fX, f10) > 0;
        int iE1 = Float.isNaN(fX) ? 0 : h8.e1(fX);
        final int iMax = z10 ? Math.max(yQ.f14220b, iE1) : yQ.f14220b;
        final int iMax2 = z10 ? Math.max(yQ.f14221c, iE1) : yQ.f14221c;
        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.MinimumInteractiveModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                aVar.d(yQ, Ka.a.b((iMax - yQ.f14220b) / 2.0f), Ka.a.b((iMax2 - yQ.f14221c) / 2.0f), 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }
}
