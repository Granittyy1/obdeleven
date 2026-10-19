package androidx.compose.ui.draw;

import Ia.l;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.F;
import androidx.compose.ui.layout.H;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.layout.InterfaceC1166l;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1198t;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import com.braze.support.BrazeLogger;
import kotlin.collections.y;
import p293xa.r;

/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PainterNode extends androidx.compose.ui.h.c implements InterfaceC1198t, InterfaceC1191l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Painter f13381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.d f13383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC1161g f13384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13385t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public I f13386u;

    public static boolean R1(long j) {
        return !I.h.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & BrazeLogger.SUPPRESS) < 2139095040;
    }

    public static boolean S1(long j) {
        return !I.h.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & BrazeLogger.SUPPRESS) < 2139095040;
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final F B(H h8, D d10, long j) {
        final Y yQ = d10.Q(T1(j));
        return h8.y1(yQ.f14220b, yQ.f14221c, y.p(), new l<Y.a, r>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Y.a aVar) {
                Y.a.g(aVar, yQ, 0, 0);
                return r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    public final boolean Q1() {
        return this.f13382q && this.f13381p.h() != 9205357640488583168L;
    }

    public final long T1(long j) {
        boolean z10 = false;
        boolean z11 = p013b0.a.d(j) && p013b0.a.c(j);
        if (p013b0.a.f(j) && p013b0.a.e(j)) {
            z10 = true;
        }
        if ((!Q1() && z11) || z10) {
            return p013b0.a.a(j, p013b0.a.h(j), 0, p013b0.a.g(j), 0, 10);
        }
        long jH = this.f13381p.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(p013b0.b.g(S1(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : p013b0.a.j(j), j))) << 32) | (((long) Float.floatToRawIntBits(p013b0.b.f(R1(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : p013b0.a.i(j), j))) & 4294967295L);
        if (Q1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!S1(this.f13381p.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f13381p.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!R1(this.f13381p.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f13381p.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : O.h.n(jFloatToRawIntBits2, this.f13384s.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return p013b0.a.a(j, p013b0.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, p013b0.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int c(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!Q1()) {
            return interfaceC1166l.I(i10);
        }
        long jT1 = T1(p013b0.b.b(0, i10, 7));
        return Math.max(p013b0.a.j(jT1), interfaceC1166l.I(i10));
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!Q1()) {
            return interfaceC1166l.k0(i10);
        }
        long jT1 = T1(p013b0.b.b(i10, 0, 13));
        return Math.max(p013b0.a.i(jT1), interfaceC1166l.k0(i10));
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int q(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!Q1()) {
            return interfaceC1166l.J(i10);
        }
        long jT1 = T1(p013b0.b.b(0, i10, 7));
        return Math.max(p013b0.a.j(jT1), interfaceC1166l.J(i10));
    }

    @Override // androidx.compose.ui.node.InterfaceC1198t
    public final int r(LookaheadCapablePlaceable lookaheadCapablePlaceable, InterfaceC1166l interfaceC1166l, int i10) {
        if (!Q1()) {
            return interfaceC1166l.s(i10);
        }
        long jT1 = T1(p013b0.b.b(i10, 0, 13));
        return Math.max(p013b0.a.i(jT1), interfaceC1166l.s(i10));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f13381p + ", sizeToIntrinsics=" + this.f13382q + ", alignment=" + this.f13383r + ", alpha=" + this.f13385t + ", colorFilter=" + this.f13386u + ')';
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        long jH = this.f13381p.h();
        boolean zS1 = S1(jH);
        J.a aVar = c1202x.f14624b;
        float fIntBitsToFloat = zS1 ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (aVar.j() >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(R1(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (aVar.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jN = (Float.intBitsToFloat((int) (aVar.j() >> 32)) == 0.0f || Float.intBitsToFloat((int) (aVar.j() & 4294967295L)) == 0.0f) ? 0L : O.h.n(jFloatToRawIntBits, this.f13384s.a(jFloatToRawIntBits, aVar.j()));
        long jA = this.f13383r.a((((long) Math.round(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jN >> 32)))) << 32), (((long) Math.round(Float.intBitsToFloat((int) (aVar.j() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (aVar.j() & 4294967295L)))) & 4294967295L), c1202x.getLayoutDirection());
        float f10 = (int) (jA >> 32);
        float f11 = (int) (jA & 4294967295L);
        aVar.f3941c.f3948a.g(f10, f11);
        try {
            this.f13381p.g(c1202x, jN, this.f13385t, this.f13386u);
            aVar.f3941c.f3948a.g(-f10, -f11);
            c1202x.A1();
        } catch (Throwable th) {
            aVar.f3941c.f3948a.g(-f10, -f11);
            throw th;
        }
    }
}
