package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.C1081d0;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.b0;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollNode extends androidx.compose.ui.h.c implements InterfaceC1198t, b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ScrollState f9820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9822r;

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        Lb.a.b(j, this.f9822r ? Orientation.f9957b : Orientation.f9958c);
        boolean z10 = this.f9822r;
        int iH = BrazeLogger.SUPPRESS;
        int iG = z10 ? Integer.MAX_VALUE : p013b0.a.g(j);
        if (this.f9822r) {
            iH = p013b0.a.h(j);
        }
        final Y yQ = d10.Q(p013b0.a.a(j, 0, iH, 0, iG, 5));
        int i10 = yQ.f14220b;
        int iH2 = p013b0.a.h(j);
        if (i10 > iH2) {
            i10 = iH2;
        }
        int i11 = yQ.f14221c;
        int iG2 = p013b0.a.g(j);
        if (i11 > iG2) {
            i11 = iG2;
        }
        final int i12 = yQ.f14221c - i11;
        int i13 = yQ.f14220b - i10;
        if (!this.f9822r) {
            i12 = i13;
        }
        ScrollState scrollState = this.f9820p;
        C1081d0 c1081d0 = scrollState.f9827d;
        C1081d0 c1081d1 = scrollState.f9824a;
        c1081d0.m(i12);
        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
        try {
            if (c1081d1.o() > i12) {
                c1081d1.m(i12);
            }
            p293xa.r rVar = p293xa.r.f47939a;
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
            this.f9820p.f9825b.m(this.f9822r ? i11 : i10);
            return h8.y1(i10, i11, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.ScrollNode$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Y.a aVar) {
                    Y.a aVar2 = aVar;
                    int iO = this.this$0.f9820p.f9824a.o();
                    int i14 = i12;
                    if (iO < 0) {
                        iO = 0;
                    }
                    if (iO > i14) {
                        iO = i14;
                    }
                    ScrollNode scrollNode = this.this$0;
                    final int i15 = scrollNode.f9821q ? iO - i14 : -iO;
                    boolean z11 = scrollNode.f9822r;
                    final int i16 = z11 ? 0 : i15;
                    if (!z11) {
                        i15 = 0;
                    }
                    final Y y10 = yQ;
                    Ia.l<Y.a, p293xa.r> lVar = new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(Y.a aVar3) {
                            Y.a.h(aVar3, y10, i16, i15);
                            return p293xa.r.f47939a;
                        }
                    };
                    aVar2.f14225a = true;
                    lVar.invoke(aVar2);
                    aVar2.f14225a = false;
                    return p293xa.r.f47939a;
                }
            });
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f9822r) {
            i10 = BrazeLogger.SUPPRESS;
        }
        return interfaceC1166l.I(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!this.f9822r) {
            i10 = BrazeLogger.SUPPRESS;
        }
        return interfaceC1166l.k0(i10);
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        androidx.compose.ui.semantics.t.m(wVar);
        androidx.compose.ui.semantics.j jVar = new androidx.compose.ui.semantics.j(new Ia.a<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.f9820p.f9824a.o());
            }
        }, this.f9821q, new Ia.a<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Float invoke() {
                return Float.valueOf(this.this$0.f9820p.f9827d.o());
            }
        });
        if (this.f9822r) {
            androidx.compose.ui.semantics.t.o(wVar, jVar);
        } else {
            androidx.compose.ui.semantics.t.h(wVar, jVar);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (this.f9822r) {
            i10 = BrazeLogger.SUPPRESS;
        }
        return interfaceC1166l.J(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!this.f9822r) {
            i10 = BrazeLogger.SUPPRESS;
        }
        return interfaceC1166l.s(i10);
    }
}
