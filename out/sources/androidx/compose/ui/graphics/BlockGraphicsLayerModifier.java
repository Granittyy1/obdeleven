package androidx.compose.ui.graphics;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super U, p293xa.r> f13474p;

    public BlockGraphicsLayerModifier(Ia.l<? super U, p293xa.r> lVar) {
        this.f13474p = lVar;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a.k(aVar, yQ, 0, 0, this.f13474p, 4);
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f13474p + ')';
    }
}
