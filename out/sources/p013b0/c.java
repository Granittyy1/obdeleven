package p013b0;

import G0.a;
import com.braze.support.BrazeLogger;
import kotlinx.coroutines.C;
import p026c0.b;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long A0(float f10) {
        return W(v(f10));
    }

    float P0();

    default float T0(float f10) {
        return getDensity() * f10;
    }

    default long W(float f10) {
        float[] fArr = b.f22269a;
        if (!(P0() >= 1.03f)) {
            return a.i(f10 / P0(), 4294967296L);
        }
        p026c0.a aVarA = b.a(P0());
        return a.i(aVarA != null ? aVarA.a(f10) : f10 / P0(), 4294967296L);
    }

    default int Z0(long j) {
        return Math.round(s1(j));
    }

    default float e0(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = b.f22269a;
        if (P0() < 1.03f) {
            return P0() * n.c(j);
        }
        p026c0.a aVarA = b.a(P0());
        float fC = n.c(j);
        return aVarA == null ? P0() * fC : aVarA.b(fC);
    }

    default int e1(float f10) {
        float fT0 = T0(f10);
        return Float.isInfinite(fT0) ? BrazeLogger.SUPPRESS : Math.round(fT0);
    }

    float getDensity();

    default long o1(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fT0 = T0(h.b(j));
        float fT1 = T0(h.a(j));
        return (((long) Float.floatToRawIntBits(fT0)) << 32) | (((long) Float.floatToRawIntBits(fT1)) & 4294967295L);
    }

    default long p(long j) {
        if (j != 9205357640488583168L) {
            return C.c(v(Float.intBitsToFloat((int) (j >> 32))), v(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float s1(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return T0(e0(j));
    }

    default float u(int i10) {
        return i10 / getDensity();
    }

    default float v(float f10) {
        return f10 / getDensity();
    }

    default long w0(int i10) {
        return W(u(i10));
    }
}
