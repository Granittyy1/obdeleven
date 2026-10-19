package androidx.compose.ui;

import Ia.l;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.InterfaceC1198t;
import kotlin.collections.y;
import p293xa.r;

/* JADX INFO: compiled from: ZIndexModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ZIndexNode extends h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13277p;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(H h8, D d10, long j) {
        final Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, y.p(), new l<Y.a, r>() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar) {
                aVar.d(yQ, 0, 0, this.f13277p);
                return r.f47939a;
            }
        });
    }

    public final String toString() {
        return B7.b.d(new StringBuilder("ZIndexModifier(zIndex="), this.f13277p, ')');
    }
}
