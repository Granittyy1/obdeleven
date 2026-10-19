package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1198t;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WrapContentNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Direction f10239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Lambda f10241r;

    public WrapContentNode() {
        throw null;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(final androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        Direction direction = this.f10239p;
        Direction direction2 = Direction.f10109b;
        int iJ = direction != direction2 ? 0 : p013b0.a.j(j);
        Direction direction3 = this.f10239p;
        Direction direction4 = Direction.f10110c;
        int i10 = direction3 == direction4 ? p013b0.a.i(j) : 0;
        Direction direction5 = this.f10239p;
        int iG = BrazeLogger.SUPPRESS;
        int iH = (direction5 == direction2 || !this.f10240q) ? p013b0.a.h(j) : Integer.MAX_VALUE;
        if (this.f10239p == direction4 || !this.f10240q) {
            iG = p013b0.a.g(j);
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.a(iJ, iH, i10, iG));
        final int iD = Na.l.D(yQ.f14220b, p013b0.a.j(j), p013b0.a.h(j));
        final int iD2 = Na.l.D(yQ.f14221c, p013b0.a.i(j), p013b0.a.g(j));
        return h8.y1(iD, iD2, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Ia.p, kotlin.jvm.internal.Lambda] */
            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                ?? r10 = this.this$0.f10241r;
                int i11 = iD;
                androidx.compose.ui.layout.Y y10 = yQ;
                androidx.compose.ui.layout.Y.a.f(aVar, yQ, ((p013b0.j) r10.invoke(new p013b0.l((((long) (i11 - y10.f14220b)) << 32) | (((long) (iD2 - y10.f14221c)) & 4294967295L)), h8.getLayoutDirection())).f20484a);
                return p293xa.r.f47939a;
            }
        });
    }
}
