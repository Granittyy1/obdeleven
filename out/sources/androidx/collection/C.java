package androidx.collection;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0885m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9072e;

    public C() {
        this((Object) null);
    }

    public final boolean b(int i10) {
        int i11;
        long j;
        int iC;
        int iNumberOfTrailingZeros;
        int i12 = this.f9195d;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f9194c;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f9192a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = i18;
            long j10 = (((-i20) >> 63) & (jArr[i19 + 1] << (64 - i20))) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i22 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                if (this.f9193b[iNumberOfTrailingZeros] == i10) {
                    i11 = i12;
                    break loop0;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iC2 = c(i22);
                if (this.f9072e != 0 || ((this.f9192a[iC2 >> 3] >> ((iC2 & 7) << 3)) & 255) == 254) {
                    i11 = i12;
                    j = j11;
                    iC = iC2;
                } else {
                    int i23 = this.f9194c;
                    if (i23 <= 8 || Long.compareUnsigned(((long) this.f9195d) * 32, ((long) i23) * 25) > 0) {
                        i11 = i12;
                        j = j11;
                        int iC3 = U.c(this.f9194c);
                        long[] jArr2 = this.f9192a;
                        int[] iArr = this.f9193b;
                        int i24 = this.f9194c;
                        d(iC3);
                        long[] jArr3 = this.f9192a;
                        int[] iArr2 = this.f9193b;
                        int i25 = this.f9194c;
                        for (int i26 = 0; i26 < i24; i26++) {
                            if (((jArr2[i26 >> 3] >> ((i26 & 7) << 3)) & 255) < 128) {
                                int i27 = iArr[i26];
                                int iHashCode2 = Integer.hashCode(i27) * (-862048943);
                                int i28 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC4 = c(i28 >>> 7);
                                long j15 = i28 & 127;
                                int i29 = iC4 >> 3;
                                int i30 = (iC4 & 7) << 3;
                                long j16 = (j15 << i30) | (jArr3[i29] & (~(255 << i30)));
                                jArr3[i29] = j16;
                                jArr3[(((iC4 - 7) & i25) + (i25 & 7)) >> 3] = j16;
                                iArr2[iC4] = i27;
                            }
                        }
                    } else {
                        long[] jArr4 = this.f9192a;
                        int i31 = this.f9194c;
                        int[] iArr3 = this.f9193b;
                        int i32 = (i31 + 7) >> 3;
                        int i33 = 0;
                        while (i33 < i32) {
                            long j17 = jArr4[i33] & j13;
                            jArr4[i33] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                            i33++;
                            i12 = i12;
                            j13 = -9187201950435737472L;
                        }
                        i11 = i12;
                        int iR = kotlin.collections.k.R(jArr4);
                        int i34 = iR - 1;
                        jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[iR] = jArr4[0];
                        int i35 = 0;
                        while (i35 != i31) {
                            int i36 = i35 >> 3;
                            int i37 = (i35 & 7) << 3;
                            long j18 = (jArr4[i36] >> i37) & 255;
                            if (j18 != 128 && j18 == 254) {
                                int iHashCode3 = Integer.hashCode(iArr3[i35]) * (-862048943);
                                int i38 = iHashCode3 ^ (iHashCode3 << 16);
                                int i39 = i38 >>> 7;
                                int iC5 = c(i39);
                                int i40 = i39 & i31;
                                if (((iC5 - i40) & i31) / 8 == ((i35 - i40) & i31) / 8) {
                                    jArr4[i36] = (((long) (i38 & 127)) << i37) | (jArr4[i36] & (~(255 << i37)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35++;
                                } else {
                                    int i41 = iC5 >> 3;
                                    long j19 = jArr4[i41];
                                    int i42 = (iC5 & 7) << 3;
                                    if (((j19 >> i42) & 255) == 128) {
                                        jArr4[i41] = (((long) (i38 & 127)) << i42) | ((~(255 << i42)) & j19);
                                        jArr4[i36] = (jArr4[i36] & (~(255 << i37))) | (128 << i37);
                                        iArr3[iC5] = iArr3[i35];
                                        iArr3[i35] = 0;
                                    } else {
                                        jArr4[i41] = (((long) (i38 & 127)) << i42) | ((~(255 << i42)) & j19);
                                        int i43 = iArr3[iC5];
                                        iArr3[iC5] = iArr3[i35];
                                        iArr3[i35] = i43;
                                        i35--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i35++;
                                    j11 = j11;
                                }
                            } else {
                                i35++;
                            }
                        }
                        j = j11;
                        this.f9072e = U.a(this.f9194c) - this.f9195d;
                    }
                    iC = c(i22);
                }
                this.f9195d++;
                int i44 = this.f9072e;
                long[] jArr5 = this.f9192a;
                int i45 = iC >> 3;
                long j20 = jArr5[i45];
                int i46 = (iC & 7) << 3;
                this.f9072e = i44 - (((j20 >> i46) & 255) == 128 ? 1 : 0);
                int i47 = this.f9194c;
                long j21 = (j20 & (~(255 << i46))) | (j << i46);
                jArr5[i45] = j21;
                jArr5[(((iC - 7) & i47) + (i47 & 7)) >> 3] = j21;
                iNumberOfTrailingZeros = iC;
                break;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i14 = i22;
        }
        this.f9193b[iNumberOfTrailingZeros] = i10;
        return this.f9195d != i11;
    }

    public final int c(int i10) {
        int i11 = this.f9194c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9192a;
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

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9194c = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9192a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9072e = U.a(this.f9194c) - this.f9195d;
        this.f9193b = new int[iMax];
    }

    public final boolean e(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f9194c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f9192a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f9193b[iNumberOfTrailingZeros] == i10) {
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
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            f(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void f(int i10) {
        this.f9195d--;
        long[] jArr = this.f9192a;
        int i11 = this.f9194c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
    }

    public C(int i10) {
        if (i10 >= 0) {
            d(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ C(Object obj) {
        this(6);
    }
}
