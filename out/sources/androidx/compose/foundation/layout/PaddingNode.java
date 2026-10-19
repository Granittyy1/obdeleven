package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PaddingNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f10194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10195t;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        int iE1 = h8.e1(this.f10193r) + h8.e1(this.f10191p);
        int iE2 = h8.e1(this.f10194s) + h8.e1(this.f10192q);
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.i(j, -iE1, -iE2));
        return h8.y1(p013b0.b.g(yQ.f14220b + iE1, j), p013b0.b.f(yQ.f14221c + iE2, j), kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a aVar2 = aVar;
                PaddingNode paddingNode = this.this$0;
                if (paddingNode.f10195t) {
                    androidx.compose.ui.layout.Y.a.g(aVar2, yQ, h8.e1(paddingNode.f10191p), h8.e1(this.this$0.f10192q));
                } else {
                    aVar2.d(yQ, h8.e1(paddingNode.f10191p), h8.e1(this.this$0.f10192q), 0.0f);
                }
                return p293xa.r.f47939a;
            }
        });
    }
}
