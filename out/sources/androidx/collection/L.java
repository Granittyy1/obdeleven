package androidx.collection;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9088e;

    public L() {
        this((Object) null);
    }

    public final boolean d(E e10) {
        int i10 = this.f9125d;
        this.f9123b[f(e10)] = e10;
        return this.f9125d != i10;
    }

    public final void e() {
        this.f9125d = 0;
        long[] jArr = this.f9122a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9122a;
            int i10 = this.f9124c;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9123b, null, 0, this.f9124c);
        this.f9088e = U.a(this.f9124c) - this.f9125d;
    }

    public final int f(E e10) {
        long j;
        int i10;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f9124c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f9122a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i19 = i13;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (kotlin.jvm.internal.i.a(this.f9123b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iG = g(i12);
                long j15 = 255;
                if (this.f9088e != 0 || ((this.f9122a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j = j11;
                    i10 = 0;
                } else {
                    int i20 = this.f9124c;
                    if (i20 <= 8 || Long.compareUnsigned(((long) this.f9125d) * 32, ((long) i20) * 25) > 0) {
                        j = j11;
                        i10 = 0;
                        int iC = U.c(this.f9124c);
                        long[] jArr2 = this.f9122a;
                        Object[] objArr = this.f9123b;
                        int i21 = this.f9124c;
                        h(iC);
                        long[] jArr3 = this.f9122a;
                        Object[] objArr2 = this.f9123b;
                        int i22 = this.f9124c;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr2[i23 >> 3] >> ((i23 & 7) << 3)) & j15) < 128) {
                                Object obj = objArr[i23];
                                int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iG2 = g(i24 >>> 7);
                                long j16 = i24 & 127;
                                int i25 = iG2 >> 3;
                                int i26 = (iG2 & 7) << 3;
                                long j17 = (j16 << i26) | (jArr3[i25] & (~(255 << i26)));
                                jArr3[i25] = j17;
                                jArr3[(((iG2 - 7) & i22) + (i22 & 7)) >> 3] = j17;
                                objArr2[iG2] = obj;
                            }
                            i23++;
                            j15 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f9122a;
                        int i27 = this.f9124c;
                        Object[] objArr3 = this.f9123b;
                        int i28 = (i27 + 7) >> 3;
                        int i29 = 0;
                        while (i29 < i28) {
                            long j18 = jArr4[i29] & j13;
                            jArr4[i29] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                            i29++;
                            j13 = -9187201950435737472L;
                        }
                        int iR = kotlin.collections.k.R(jArr4);
                        int i30 = iR - 1;
                        jArr4[i30] = (jArr4[i30] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[iR] = jArr4[0];
                        int i31 = 0;
                        while (i31 != i27) {
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            long j19 = (jArr4[i32] >> i33) & 255;
                            if (j19 != 128 && j19 == 254) {
                                Object obj2 = objArr3[i31];
                                int iHashCode3 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i34 = iHashCode3 ^ (iHashCode3 << 16);
                                int i35 = i34 >>> 7;
                                int iG3 = g(i35);
                                int i36 = i35 & i27;
                                if (((iG3 - i36) & i27) / 8 == ((i31 - i36) & i27) / 8) {
                                    jArr4[i32] = (jArr4[i32] & (~(255 << i33))) | (((long) (i34 & 127)) << i33);
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                } else {
                                    int i37 = iG3 >> 3;
                                    long j20 = jArr4[i37];
                                    int i38 = (iG3 & 7) << 3;
                                    if (((j20 >> i38) & 255) == 128) {
                                        jArr4[i37] = (j20 & (~(255 << i38))) | (((long) (i34 & 127)) << i38);
                                        jArr4[i32] = (jArr4[i32] & (~(255 << i33))) | (128 << i33);
                                        objArr3[iG3] = objArr3[i31];
                                        objArr3[i31] = null;
                                    } else {
                                        jArr4[i37] = (((long) (i34 & 127)) << i38) | (j20 & (~(255 << i38)));
                                        Object obj3 = objArr3[iG3];
                                        objArr3[iG3] = objArr3[i31];
                                        objArr3[i31] = obj3;
                                        i31--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                    j11 = j11;
                                }
                            } else {
                                i31++;
                            }
                        }
                        j = j11;
                        i10 = 0;
                        this.f9088e = U.a(this.f9124c) - this.f9125d;
                    }
                    iG = g(i12);
                }
                this.f9125d++;
                int i39 = this.f9088e;
                long[] jArr5 = this.f9122a;
                int i40 = iG >> 3;
                long j21 = jArr5[i40];
                int i41 = (iG & 7) << 3;
                this.f9088e = i39 - (((j21 >> i41) & 255) != 128 ? i10 : 1);
                int i42 = this.f9124c;
                long j22 = (j21 & (~(255 << i41))) | (j << i41);
                jArr5[i40] = j22;
                jArr5[(((iG - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return iG;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    public final int g(int i10) {
        int i11 = this.f9124c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9122a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void h(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9124c = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9122a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9088e = U.a(this.f9124c) - this.f9125d;
        this.f9123b = iMax == 0 ? p233t.a.f46998c : new Object[iMax];
    }

    public final void i(E e10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f9124c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f9122a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.i.a(this.f9123b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(ScatterSet<E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Object[] objArr = elements.f9123b;
        long[] jArr = elements.f9122a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        k(objArr[(i10 << 3) + i12]);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void k(E e10) {
        this.f9123b[f(e10)] = e10;
    }

    public final boolean l(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f9124c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f9122a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.i.a(this.f9123b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            m(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void m(int i10) {
        this.f9125d--;
        long[] jArr = this.f9122a;
        int i11 = this.f9124c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f9123b[i10] = null;
    }

    public L(int i10) {
        if (i10 >= 0) {
            h(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ L(Object obj) {
        this(6);
    }
}
