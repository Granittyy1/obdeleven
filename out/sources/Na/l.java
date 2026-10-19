package Na;

import J4.n;
import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes2.dex */
public class l extends C1787c0 {
    public static long A(long j, long j10) {
        return j > j10 ? j10 : j;
    }

    public static double B(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float C(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int D(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long E(long j, long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException(C4.a.h(n.f("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j11), j10, '.'));
        }
        if (j < j10) {
            return j10;
        }
        return j > j11 ? j11 : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long F(long j, k kVar) {
        if (kVar instanceof e) {
            return ((Number) G(Long.valueOf(j), (e) kVar)).longValue();
        }
        if (kVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + kVar + '.');
        }
        long j10 = kVar.f4699b;
        if (j < Long.valueOf(j10).longValue()) {
            return Long.valueOf(j10).longValue();
        }
        long j11 = kVar.f4700c;
        return j > Long.valueOf(j11).longValue() ? Long.valueOf(j11).longValue() : j;
    }

    public static <T extends Comparable<? super T>> T G(T t8, e<T> eVar) {
        if (eVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
        }
        if (!eVar.e(t8, eVar.k()) || eVar.e(eVar.k(), t8)) {
            return (!eVar.e(eVar.q(), t8) || eVar.e(t8, eVar.q())) ? t8 : eVar.q();
        }
        return eVar.k();
    }

    public static g H(i iVar) {
        return new g(iVar.f4688c, iVar.f4687b, -iVar.f4689d);
    }

    public static g I(int i10, i iVar) {
        kotlin.jvm.internal.i.e(iVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (z10) {
            if (iVar.f4689d <= 0) {
                i10 = -i10;
            }
            return new g(iVar.f4687b, iVar.f4688c, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static i J(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new i(i10, i11 - 1, 1);
        }
        i iVar = i.f4694e;
        return i.f4694e;
    }

    public static float x(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static long y(long j, long j10) {
        return j < j10 ? j10 : j;
    }

    public static float z(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }
}
