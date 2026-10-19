package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioNode extends androidx.compose.ui.h.c implements InterfaceC1198t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f10089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10090q;

    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final androidx.compose.ui.layout.F B(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, long j) {
        long jQ1;
        if (this.f10090q) {
            jQ1 = Q1(j, true);
            if (p013b0.l.b(jQ1, 0L)) {
                jQ1 = R1(j, true);
                if (p013b0.l.b(jQ1, 0L)) {
                    jQ1 = S1(j, true);
                    if (p013b0.l.b(jQ1, 0L)) {
                        jQ1 = T1(j, true);
                        if (p013b0.l.b(jQ1, 0L)) {
                            jQ1 = Q1(j, false);
                            if (p013b0.l.b(jQ1, 0L)) {
                                jQ1 = R1(j, false);
                                if (p013b0.l.b(jQ1, 0L)) {
                                    jQ1 = S1(j, false);
                                    if (p013b0.l.b(jQ1, 0L)) {
                                        jQ1 = T1(j, false);
                                        if (p013b0.l.b(jQ1, 0L)) {
                                            jQ1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            jQ1 = R1(j, true);
            if (p013b0.l.b(jQ1, 0L)) {
                jQ1 = Q1(j, true);
                if (p013b0.l.b(jQ1, 0L)) {
                    jQ1 = T1(j, true);
                    if (p013b0.l.b(jQ1, 0L)) {
                        jQ1 = S1(j, true);
                        if (p013b0.l.b(jQ1, 0L)) {
                            jQ1 = R1(j, false);
                            if (p013b0.l.b(jQ1, 0L)) {
                                jQ1 = Q1(j, false);
                                if (p013b0.l.b(jQ1, 0L)) {
                                    jQ1 = T1(j, false);
                                    if (p013b0.l.b(jQ1, 0L)) {
                                        jQ1 = S1(j, false);
                                        if (p013b0.l.b(jQ1, 0L)) {
                                            jQ1 = 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!p013b0.l.b(jQ1, 0L)) {
            int i10 = (int) (jQ1 >> 32);
            int i11 = (int) (4294967295L & jQ1);
            if (!((i10 >= 0) & (i11 >= 0))) {
                p013b0.i.a("width and height must be >= 0");
            }
            j = p013b0.b.h(i10, i10, i11, i11);
        }
        final androidx.compose.ui.layout.Y yQ = d10.Q(j);
        return h8.y1(yQ.f14220b, yQ.f14221c, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar) {
                androidx.compose.ui.layout.Y.a.g(aVar, yQ, 0, 0);
                return p293xa.r.f47939a;
            }
        });
    }

    public final long Q1(long j, boolean z10) {
        int iRound;
        int iG = p013b0.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f10089p)) <= 0) {
            return 0L;
        }
        if (!z10 || C0946f.b(j, iRound, iG)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long R1(long j, boolean z10) {
        int iRound;
        int iH = p013b0.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f10089p)) <= 0) {
            return 0L;
        }
        if (!z10 || C0946f.b(j, iH, iRound)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long S1(long j, boolean z10) {
        int i10 = p013b0.a.i(j);
        int iRound = Math.round(i10 * this.f10089p);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || C0946f.b(j, iRound, i10)) {
            return (((long) iRound) << 32) | (((long) i10) & 4294967295L);
        }
        return 0L;
    }

    public final long T1(long j, boolean z10) {
        int iJ = p013b0.a.j(j);
        int iRound = Math.round(iJ / this.f10089p);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || C0946f.b(j, iJ, iRound)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f10089p) : interfaceC1166l.I(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f10089p) : interfaceC1166l.k0(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f10089p) : interfaceC1166l.J(i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f10089p) : interfaceC1166l.s(i10);
    }
}
