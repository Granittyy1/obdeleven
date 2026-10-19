package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0876d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f9170a = U.f9132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f9171b = C0877e.f9173a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9172c;

    public final boolean equals(Object obj) {
        float[] fArr;
        int i10;
        float[] fArr2;
        int i11;
        int i12;
        long j;
        int iNumberOfTrailingZeros;
        if (obj == this) {
            return true;
        }
        int i13 = 0;
        if (!(obj instanceof AbstractC0876d)) {
            return false;
        }
        AbstractC0876d abstractC0876d = (AbstractC0876d) obj;
        abstractC0876d.getClass();
        float[] fArr3 = this.f9171b;
        long[] jArr = this.f9170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i14 = 0;
        while (true) {
            long j10 = jArr[i14];
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = i13;
                while (i17 < i16) {
                    if ((j10 & 255) < 128) {
                        float f10 = fArr3[(i14 << 3) + i17];
                        abstractC0876d.getClass();
                        int iHashCode = Float.hashCode(f10) * (-862048943);
                        int i18 = iHashCode ^ (iHashCode << 16);
                        int i19 = i18 & 127;
                        int i20 = abstractC0876d.f9172c;
                        int i21 = (i18 >>> 7) & i20;
                        int i22 = 0;
                        while (true) {
                            long[] jArr2 = abstractC0876d.f9170a;
                            int i23 = i21 >> 3;
                            int i24 = (i21 & 7) << 3;
                            long j12 = (jArr2[i23] >>> i24) | ((jArr2[i23 + 1] << (64 - i24)) & ((-i24) >> 63));
                            fArr2 = fArr3;
                            long j13 = (((long) i19) * 72340172838076673L) ^ j12;
                            for (long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                                iNumberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j14) >> 3)) & i20;
                                if (abstractC0876d.f9171b[iNumberOfTrailingZeros] == f10) {
                                    j = -9187201950435737472L;
                                    break;
                                }
                            }
                            long j15 = ((~j12) << 6) & j12;
                            j = -9187201950435737472L;
                            if ((j15 & (-9187201950435737472L)) != 0) {
                                iNumberOfTrailingZeros = -1;
                                break;
                            }
                            i22 += 8;
                            i21 = (i21 + i22) & i20;
                            fArr3 = fArr2;
                        }
                        if (!(iNumberOfTrailingZeros >= 0)) {
                            return false;
                        }
                        i11 = 0;
                        i12 = 8;
                    } else {
                        fArr2 = fArr3;
                        i11 = i13;
                        i12 = i15;
                        j = j11;
                    }
                    j10 >>= i12;
                    i17++;
                    i13 = i11;
                    i15 = i12;
                    j11 = j;
                    fArr3 = fArr2;
                }
                fArr = fArr3;
                i10 = i13;
                if (i16 != i15) {
                    return true;
                }
            } else {
                fArr = fArr3;
                i10 = i13;
            }
            if (i14 == length) {
                return true;
            }
            i14++;
            i13 = i10;
            fArr3 = fArr;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f9171b;
        long[] jArr = this.f9170a;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            iHashCode = Float.hashCode(fArr[(i11 << 3) + i13]) + iHashCode;
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        float[] fArr = this.f9171b;
        long[] jArr = this.f9170a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j) < 128) {
                        float f10 = fArr[(i10 << 3) + i13];
                        if (i11 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(f10);
                        i11++;
                    }
                    j >>= 8;
                }
                if (i12 == 8) {
                    if (i10 == length) {
                        i10++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
            if (i10 == length) {
                sb2.append((CharSequence) "]");
                break;
            }
            i10++;
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
