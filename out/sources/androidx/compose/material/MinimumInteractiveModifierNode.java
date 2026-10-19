package androidx.compose.material;

import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: InteractiveComponentSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MinimumInteractiveModifierNode extends androidx.compose.ui.h.c implements InterfaceC1182c, InterfaceC1198t {
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        boolean z10 = this.f13997o && ((Boolean) C1183d.a(this, InteractiveComponentSizeKt.f11762a)).booleanValue();
        long j10 = InteractiveComponentSizeKt.f11763b;
        final Y yQ = d10.Q(j);
        final int iMax = z10 ? Math.max(yQ.f14220b, h8.e1(p013b0.h.b(j10))) : yQ.f14220b;
        final int iMax2 = z10 ? Math.max(yQ.f14221c, h8.e1(p013b0.h.a(j10))) : yQ.f14221c;
        return h8.y1(iMax, iMax2, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.MinimumInteractiveModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Y.a aVar) {
                aVar.d(yQ, Ka.a.b((iMax - yQ.f14220b) / 2.0f), Ka.a.b((iMax2 - yQ.f14221c) / 2.0f), 0.0f);
                return p293xa.r.f47939a;
            }
        });
    }
}
