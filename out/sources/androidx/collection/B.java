package androidx.collection;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B<V> extends AbstractC0883k<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9071f;

    public B(int i10) {
        if (i10 >= 0) {
            f(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f9190e = 0;
        long[] jArr = this.f9186a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9186a;
            int i10 = this.f9189d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9188c, null, 0, this.f9189d);
        this.f9071f = U.a(this.f9189d) - this.f9190e;
    }

    public final int d(int i10) {
        long j;
        int i11;
        int i12;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f9189d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f9186a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i21 = i18;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                if (this.f9187b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iE = e(i14);
                long j15 = 128;
                if (this.f9071f != 0 || ((this.f9186a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = j11;
                    i11 = 0;
                } else {
                    int i22 = this.f9189d;
                    if (i22 > 8) {
                        i12 = i14;
                        if (Long.compareUnsigned(((long) this.f9190e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr2 = this.f9186a;
                            int i23 = this.f9189d;
                            int[] iArr = this.f9187b;
                            Object[] objArr = this.f9188c;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            while (i25 < i24) {
                                long j16 = jArr2[i25] & j13;
                                jArr2[i25] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i25++;
                                j13 = -9187201950435737472L;
                            }
                            int iR = kotlin.collections.k.R(jArr2);
                            int i26 = iR - 1;
                            long j17 = 72057594037927935L;
                            jArr2[i26] = (jArr2[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iR] = jArr2[0];
                            int i27 = 0;
                            while (i27 != i23) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j18 = (jArr2[i28] >> i29) & 255;
                                if (j18 != j15 && j18 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr[i27]) * (-862048943);
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i31 = i30 >>> 7;
                                    int iE2 = e(i31);
                                    int i32 = i31 & i23;
                                    if (((iE2 - i32) & i23) / 8 == ((i27 - i32) & i23) / 8) {
                                        jArr2[i28] = (((long) (i30 & 127)) << i29) | (jArr2[i28] & (~(255 << i29)));
                                        jArr2[jArr2.length - 1] = (jArr2[0] & j17) | Long.MIN_VALUE;
                                        i27++;
                                    } else {
                                        int i33 = iE2 >> 3;
                                        long j19 = jArr2[i33];
                                        int i34 = (iE2 & 7) << 3;
                                        if (((j19 >> i34) & 255) == 128) {
                                            jArr2[i33] = (j19 & (~(255 << i34))) | (((long) (i30 & 127)) << i34);
                                            jArr2[i28] = (jArr2[i28] & (~(255 << i29))) | (128 << i29);
                                            iArr[iE2] = iArr[i27];
                                            iArr[i27] = 0;
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = null;
                                        } else {
                                            jArr2[i33] = (j19 & (~(255 << i34))) | (((long) (i30 & 127)) << i34);
                                            int i35 = iArr[iE2];
                                            iArr[iE2] = iArr[i27];
                                            iArr[i27] = i35;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i27];
                                            objArr[i27] = obj;
                                            i27--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27++;
                                        j17 = 72057594037927935L;
                                        j11 = j11;
                                    }
                                    j15 = 128;
                                } else {
                                    i27++;
                                }
                            }
                            j = j11;
                            i11 = 0;
                            this.f9071f = U.a(this.f9189d) - this.f9190e;
                        }
                        iE = e(i12);
                    } else {
                        i12 = i14;
                    }
                    j = j11;
                    i11 = 0;
                    int iC = U.c(this.f9189d);
                    long[] jArr3 = this.f9186a;
                    int[] iArr2 = this.f9187b;
                    Object[] objArr2 = this.f9188c;
                    int i36 = this.f9189d;
                    f(iC);
                    long[] jArr4 = this.f9186a;
                    int[] iArr3 = this.f9187b;
                    Object[] objArr3 = this.f9188c;
                    int i37 = this.f9189d;
                    for (int i38 = 0; i38 < i36; i38++) {
                        if (((jArr3[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < 128) {
                            int i39 = iArr2[i38];
                            int iHashCode3 = Integer.hashCode(i39) * (-862048943);
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i40 >>> 7);
                            long j20 = i40 & 127;
                            int i41 = iE3 >> 3;
                            int i42 = (iE3 & 7) << 3;
                            long j21 = (jArr4[i41] & (~(255 << i42))) | (j20 << i42);
                            jArr4[i41] = j21;
                            jArr4[(((iE3 - 7) & i37) + (i37 & 7)) >> 3] = j21;
                            iArr3[iE3] = i39;
                            objArr3[iE3] = objArr2[i38];
                        }
                    }
                    iE = e(i12);
                }
                this.f9190e++;
                int i43 = this.f9071f;
                long[] jArr5 = this.f9186a;
                int i44 = iE >> 3;
                long j22 = jArr5[i44];
                int i45 = (iE & 7) << 3;
                this.f9071f = i43 - (((j22 >> i45) & 255) != 128 ? i11 : 1);
                int i46 = this.f9189d;
                long j23 = (j22 & (~(255 << i45))) | (j << i45);
                jArr5[i44] = j23;
                jArr5[(((iE - 7) & i46) + (i46 & 7)) >> 3] = j23;
                return iE;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i14 = i14;
        }
    }

    public final int e(int i10) {
        int i11 = this.f9189d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9186a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9189d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9186a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9071f = U.a(this.f9189d) - this.f9190e;
        this.f9187b = new int[iMax];
        this.f9188c = new Object[iMax];
    }

    public final V g(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f9189d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f9186a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f9187b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f9190e--;
        long[] jArr2 = this.f9186a;
        int i18 = this.f9189d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i20 = (iNumberOfTrailingZeros & 7) << 3;
        long j12 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j12;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j12;
        Object[] objArr = this.f9188c;
        V v10 = (V) objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return v10;
    }

    public final void h(int i10, V v10) {
        int iD = d(i10);
        this.f9187b[iD] = i10;
        this.f9188c[iD] = v10;
    }

    public /* synthetic */ B() {
        this(6);
    }
}
