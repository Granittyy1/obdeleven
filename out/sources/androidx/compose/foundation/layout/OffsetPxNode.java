package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OffsetPxNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super p013b0.c, p013b0.j> f10184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10185q;

    public OffsetPxNode() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                long j10 = this.this$0.f10184p.invoke(h8).f20484a;
                if (this.this$0.f10185q) {
                    androidx.compose.ui.layout.Y.a.h(aVar2, yQ, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                } else {
                    androidx.compose.ui.layout.Y.a.k(aVar2, yQ, (int) (j10 >> 32), (int) (j10 & 4294967295L), null, 12);
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
