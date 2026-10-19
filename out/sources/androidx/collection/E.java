package androidx.collection;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E<V> extends AbstractC0888p<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9073f;

    public E(int i10) {
        if (i10 >= 0) {
            e(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f9203e = 0;
        long[] jArr = this.f9199a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9199a;
            int i10 = this.f9202d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9201c, null, 0, this.f9202d);
        this.f9073f = U.a(this.f9202d) - this.f9203e;
    }

    public final int d(int i10) {
        int i11 = this.f9202d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9199a;
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

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9202d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9199a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9073f = U.a(this.f9202d) - this.f9203e;
        this.f9200b = new long[iMax];
        this.f9201c = new Object[iMax];
    }

    public final V f(long j) {
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
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f9203e--;
        long[] jArr2 = this.f9199a;
        int i17 = this.f9202d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j13;
        Object[] objArr = this.f9201c;
        V v10 = (V) objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return v10;
    }

    public final void g(Object obj, long j) {
        int iNumberOfTrailingZeros;
        int i10;
        byte b10 = -862048943;
        int iHashCode = Long.hashCode(j) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f9202d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr = this.f9199a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j14) >> 3)) & i14;
                if (this.f9200b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iD = d(i12);
                if (this.f9073f == 0 && ((this.f9199a[iD >> 3] >> ((iD & 7) << 3)) & 255) != 254) {
                    int i21 = this.f9202d;
                    if (i21 > 8) {
                        i10 = i12;
                        if (Long.compareUnsigned(((long) this.f9203e) * 32, ((long) i21) * 25) <= 0) {
                            long[] jArr2 = this.f9199a;
                            int i22 = this.f9202d;
                            long[] jArr3 = this.f9200b;
                            Object[] objArr = this.f9201c;
                            int i23 = (i22 + 7) >> 3;
                            int i24 = 0;
                            while (i24 < i23) {
                                long j15 = jArr2[i24] & j13;
                                jArr2[i24] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i24++;
                                j13 = -9187201950435737472L;
                            }
                            int iR = kotlin.collections.k.R(jArr2);
                            int i25 = iR - 1;
                            jArr2[i25] = (jArr2[i25] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iR] = jArr2[0];
                            int i26 = 0;
                            while (i26 != i22) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j16 = (jArr2[i27] >> i28) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr3[i26]) * (-862048943);
                                    int i29 = (iHashCode2 << 16) ^ iHashCode2;
                                    int i30 = i29 >>> 7;
                                    int iD2 = d(i30);
                                    int i31 = i30 & i22;
                                    if (((iD2 - i31) & i22) / 8 == ((i26 - i31) & i22) / 8) {
                                        jArr2[i27] = (jArr2[i27] & (~(255 << i28))) | (((long) (i29 & 127)) << i28);
                                        jArr2[jArr2.length - i19] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                    } else {
                                        int i32 = iD2 >> 3;
                                        long j17 = jArr2[i32];
                                        int i33 = (iD2 & 7) << 3;
                                        if (((j17 >> i33) & 255) == 128) {
                                            jArr2[i32] = (((long) (i29 & 127)) << i33) | (j17 & (~(255 << i33)));
                                            jArr2[i27] = (jArr2[i27] & (~(255 << i28))) | (128 << i28);
                                            jArr3[iD2] = jArr3[i26];
                                            jArr3[i26] = 0;
                                            objArr[iD2] = objArr[i26];
                                            objArr[i26] = null;
                                        } else {
                                            jArr2[i32] = (((long) (i29 & 127)) << i33) | (j17 & (~(255 << i33)));
                                            long j18 = jArr3[iD2];
                                            jArr3[iD2] = jArr3[i26];
                                            jArr3[i26] = j18;
                                            Object obj2 = objArr[iD2];
                                            objArr[iD2] = objArr[i26];
                                            objArr[i26] = obj2;
                                            i26--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i19 = 1;
                                    }
                                } else {
                                    i26++;
                                }
                            }
                            this.f9073f = U.a(this.f9202d) - this.f9203e;
                        }
                        iD = d(i10);
                    } else {
                        i10 = i12;
                    }
                    int iC = U.c(this.f9202d);
                    long[] jArr4 = this.f9199a;
                    long[] jArr5 = this.f9200b;
                    Object[] objArr2 = this.f9201c;
                    int i34 = this.f9202d;
                    e(iC);
                    long[] jArr6 = this.f9199a;
                    long[] jArr7 = this.f9200b;
                    Object[] objArr3 = this.f9201c;
                    int i35 = this.f9202d;
                    int i36 = 0;
                    while (i36 < i34) {
                        if (((jArr4[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < 128) {
                            long j19 = jArr5[i36];
                            int iHashCode3 = Long.hashCode(j19) * (-862048943);
                            int i37 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD3 = d(i37 >>> 7);
                            long j20 = i37 & 127;
                            int i38 = iD3 >> 3;
                            int i39 = (iD3 & 7) << 3;
                            long j21 = (jArr6[i38] & (~(255 << i39))) | (j20 << i39);
                            jArr6[i38] = j21;
                            jArr6[(((iD3 - 7) & i35) + (i35 & 7)) >> 3] = j21;
                            jArr7[iD3] = j19;
                            objArr3[iD3] = objArr2[i36];
                        }
                        i36++;
                        jArr4 = jArr4;
                        jArr5 = jArr5;
                    }
                    iD = d(i10);
                }
                iNumberOfTrailingZeros = iD;
                this.f9203e++;
                int i40 = this.f9073f;
                long[] jArr8 = this.f9199a;
                int i41 = iNumberOfTrailingZeros >> 3;
                long j22 = jArr8[i41];
                int i42 = (iNumberOfTrailingZeros & 7) << 3;
                this.f9073f = i40 - (((j22 >> i42) & 255) != 128 ? 0 : 1);
                int i43 = this.f9202d;
                long j23 = (j22 & (~(255 << i42))) | (j11 << i42);
                jArr8[i41] = j23;
                jArr8[(((iNumberOfTrailingZeros - 7) & i43) + (i43 & 7)) >> 3] = j23;
                break;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i12 = i12;
            b10 = b10;
        }
        this.f9200b[iNumberOfTrailingZeros] = j;
        this.f9201c[iNumberOfTrailingZeros] = obj;
    }
}
