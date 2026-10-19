package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OffsetNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10178p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10180r;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                OffsetNode offsetNode = this.this$0;
                if (offsetNode.f10180r) {
                    androidx.compose.ui.layout.Y.a.g(aVar2, yQ, h8.e1(offsetNode.f10178p), h8.e1(this.this$0.f10179q));
                } else {
                    aVar2.d(yQ, h8.e1(offsetNode.f10178p), h8.e1(this.this$0.f10179q), 0.0f);
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }
}
