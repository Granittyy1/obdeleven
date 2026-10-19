package androidx.compose.ui.graphics.layer;

import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.C1144u;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayer$clipDrawBlock$1 extends Lambda implements Ia.l<J.e, r> {
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$clipDrawBlock$1(b bVar) {
        super(1);
        this.this$0 = bVar;
    }

    @Override // Ia.l
    public final r invoke(J.e eVar) {
        J.e eVar2 = eVar;
        b bVar = this.this$0;
        C1144u c1144u = bVar.f13671l;
        if (bVar.f13673n && bVar.f13682w && c1144u != null) {
            J.a.b bVarW0 = eVar2.W0();
            long jE = bVarW0.e();
            bVarW0.a().g();
            try {
                bVarW0.f3948a.c(c1144u, 1);
                bVar.c(eVar2);
            } finally {
                C0936h.f(bVarW0, jE);
            }
        } else {
            bVar.c(eVar2);
        }
        return r.f47939a;
    }
}
