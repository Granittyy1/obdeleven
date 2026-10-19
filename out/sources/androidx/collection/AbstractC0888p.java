package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888p<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f9199a = U.f9132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f9200b = C0890s.f9209a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f9201c = p233t.a.f46998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9203e;

    public final boolean a(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f9202d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f9199a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f9200b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final V b(long j) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f9202d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f9199a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f9200b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.f9201c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[LOOP:0: B:14:0x0023->B:35:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[EDGE_INSN: B:38:0x0079->B:36:0x0079 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0076], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0888p)) {
            return false;
        }
        AbstractC0888p abstractC0888p = (AbstractC0888p) obj;
        if (abstractC0888p.f9203e != this.f9203e) {
            return false;
        }
        long[] jArr = this.f9200b;
        Object[] objArr = this.f9201c;
        long[] jArr2 = this.f9199a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr2[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            long j10 = jArr[i14];
                            Object obj2 = objArr[i14];
                            if (obj2 == null) {
                                if (abstractC0888p.b(j10) != null || !abstractC0888p.a(j10)) {
                                    return false;
                                }
                            } else if (!obj2.equals(abstractC0888p.b(j10))) {
                                return false;
                            }
                            i11 = 8;
                        }
                        j >>= i11;
                    }
                    if (i12 != i11) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f9200b;
        Object[] objArr = this.f9201c;
        long[] jArr2 = this.f9199a;
        int length = jArr2.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr2[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            long j10 = jArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j10);
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f9203e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f9200b;
        Object[] objArr = this.f9201c;
        long[] jArr2 = this.f9199a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j = jArr2[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j10 = jArr[i16];
                            Object obj = objArr[i16];
                            sb2.append(j10);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i13++;
                            if (i13 < this.f9203e) {
                                sb2.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i17 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i17;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
