package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0897z extends AbstractC0879g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9227f;

    public C0897z() {
        e(U.e(6));
    }

    public final void c() {
        this.f9181e = 0;
        long[] jArr = this.f9177a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9177a;
            int i10 = this.f9180d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        this.f9227f = U.a(this.f9180d) - this.f9181e;
    }

    public final int d(int i10) {
        int i11 = this.f9180d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9177a;
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
        this.f9180d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9177a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9227f = U.a(this.f9180d) - this.f9181e;
        this.f9178b = new int[iMax];
        this.f9179c = new int[iMax];
    }

    public final void f(int i10, int i11) {
        long j;
        int i12;
        int i13;
        int[] iArr;
        C0897z c0897z = this;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = c0897z.f9180d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = c0897z.f9177a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            long j10 = ((jArr[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr[i20] >>> i21);
            long j11 = i16;
            int i22 = i19;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                if (c0897z.f9178b[iNumberOfTrailingZeros] == i10) {
                    i12 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iD = c0897z.d(i15);
                if (c0897z.f9227f != 0 || ((c0897z.f9177a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j = j11;
                } else {
                    int i23 = c0897z.f9180d;
                    if (i23 > 8) {
                        i13 = i15;
                        if (Long.compareUnsigned(((long) c0897z.f9181e) * 32, ((long) i23) * 25) <= 0) {
                            long[] jArr2 = c0897z.f9177a;
                            int i24 = c0897z.f9180d;
                            int[] iArr2 = c0897z.f9178b;
                            int[] iArr3 = c0897z.f9179c;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j15 = jArr2[i26] & j13;
                                jArr2[i26] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i26++;
                                j13 = -9187201950435737472L;
                            }
                            int iR = kotlin.collections.k.R(jArr2);
                            int i27 = iR - 1;
                            jArr2[i27] = (jArr2[i27] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iR] = jArr2[0];
                            int i28 = 0;
                            while (i28 != i24) {
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                long j16 = (jArr2[i29] >> i30) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i28]) * (-862048943);
                                    int i31 = (iHashCode2 << 16) ^ iHashCode2;
                                    int i32 = i31 >>> 7;
                                    int iD2 = c0897z.d(i32);
                                    int i33 = i32 & i24;
                                    if (((iD2 - i33) & i24) / 8 == ((i28 - i33) & i24) / 8) {
                                        jArr2[i29] = (jArr2[i29] & (~(255 << i30))) | (((long) (i31 & 127)) << i30);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                    } else {
                                        int i34 = iD2 >> 3;
                                        long j17 = jArr2[i34];
                                        int i35 = (iD2 & 7) << 3;
                                        if (((j17 >> i35) & 255) == 128) {
                                            jArr2[i34] = (j17 & (~(255 << i35))) | (((long) (i31 & 127)) << i35);
                                            jArr2[i29] = (jArr2[i29] & (~(255 << i30))) | (128 << i30);
                                            iArr2[iD2] = iArr2[i28];
                                            iArr2[i28] = 0;
                                            iArr3[iD2] = iArr3[i28];
                                            iArr3[i28] = 0;
                                        } else {
                                            jArr2[i34] = (((long) (i31 & 127)) << i35) | (j17 & (~(255 << i35)));
                                            int i36 = iArr2[iD2];
                                            iArr2[iD2] = iArr2[i28];
                                            iArr2[i28] = i36;
                                            int i37 = iArr3[iD2];
                                            iArr3[iD2] = iArr3[i28];
                                            iArr3[i28] = i37;
                                            i28--;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i28++;
                                        c0897z = this;
                                        j11 = j11;
                                    }
                                } else {
                                    i28++;
                                }
                            }
                            j = j11;
                            c0897z.f9227f = U.a(c0897z.f9180d) - c0897z.f9181e;
                        }
                        iD = c0897z.d(i13);
                    } else {
                        i13 = i15;
                    }
                    j = j11;
                    int iC = U.c(c0897z.f9180d);
                    long[] jArr3 = c0897z.f9177a;
                    int[] iArr4 = c0897z.f9178b;
                    int[] iArr5 = c0897z.f9179c;
                    int i38 = c0897z.f9180d;
                    c0897z.e(iC);
                    long[] jArr4 = c0897z.f9177a;
                    int[] iArr6 = c0897z.f9178b;
                    int[] iArr7 = c0897z.f9179c;
                    int i39 = c0897z.f9180d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr3[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            int i41 = iArr4[i40];
                            int iHashCode3 = Integer.hashCode(i41) * (-862048943);
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD3 = c0897z.d(i42 >>> 7);
                            iArr = iArr7;
                            long j18 = i42 & 127;
                            int i43 = iD3 >> 3;
                            int i44 = (iD3 & 7) << 3;
                            long j19 = (j18 << i44) | (jArr4[i43] & (~(255 << i44)));
                            jArr4[i43] = j19;
                            jArr4[(((iD3 - 7) & i39) + (i39 & 7)) >> 3] = j19;
                            iArr6[iD3] = i41;
                            iArr[iD3] = iArr5[i40];
                        } else {
                            iArr = iArr7;
                        }
                        i40++;
                        iArr7 = iArr;
                    }
                    iD = c0897z.d(i13);
                }
                c0897z.f9181e++;
                int i45 = c0897z.f9227f;
                long[] jArr5 = c0897z.f9177a;
                int i46 = iD >> 3;
                long j20 = jArr5[i46];
                int i47 = (iD & 7) << 3;
                c0897z.f9227f = i45 - (((j20 >> i47) & 255) == 128 ? 1 : 0);
                int i48 = c0897z.f9180d;
                long j21 = (j20 & (~(255 << i47))) | (j << i47);
                jArr5[i46] = j21;
                jArr5[(((iD - 7) & i48) + (i48 & 7)) >> 3] = j21;
                i12 = ~iD;
                break;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        c0897z.f9178b[i12] = i10;
        c0897z.f9179c[i12] = i11;
    }
}
