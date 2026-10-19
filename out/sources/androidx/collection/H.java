package androidx.collection;

/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class H<K> extends O<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9077f;

    public H() {
        this((Object) null);
    }

    public final void b() {
        this.f9107e = 0;
        long[] jArr = this.f9103a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9103a;
            int i10 = this.f9106d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9104b, null, 0, this.f9106d);
        this.f9077f = U.a(this.f9106d) - this.f9107e;
    }

    public final int c(int i10) {
        int i11 = this.f9106d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9103a;
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

    public final int d(K k10) {
        long j;
        int i10;
        int i11;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f9106d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f9103a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = i14;
            int i20 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                if (kotlin.jvm.internal.i.a(this.f9104b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iC = c(i13);
                if (this.f9077f != 0 || ((this.f9103a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = j11;
                    i10 = 0;
                } else {
                    int i21 = this.f9106d;
                    if (i21 <= 8 || Long.compareUnsigned(((long) this.f9107e) * 32, ((long) i21) * 25) > 0) {
                        j = j11;
                        i10 = 0;
                        int iC2 = U.c(this.f9106d);
                        long[] jArr2 = this.f9103a;
                        Object[] objArr = this.f9104b;
                        int[] iArr = this.f9105c;
                        int i22 = this.f9106d;
                        e(iC2);
                        long[] jArr3 = this.f9103a;
                        Object[] objArr2 = this.f9104b;
                        int[] iArr2 = this.f9105c;
                        int i23 = this.f9106d;
                        int i24 = 0;
                        while (i24 < i22) {
                            if (((jArr2[i24 >> 3] >> ((i24 & 7) << 3)) & 255) < 128) {
                                Object obj = objArr[i24];
                                int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC3 = c(i25 >>> 7);
                                long j15 = i25 & 127;
                                int i26 = iC3 >> 3;
                                int i27 = (iC3 & 7) << 3;
                                long j16 = (j15 << i27) | (jArr3[i26] & (~(255 << i27)));
                                jArr3[i26] = j16;
                                jArr3[(((iC3 - 7) & i23) + (i23 & 7)) >> 3] = j16;
                                objArr2[iC3] = obj;
                                iArr2[iC3] = iArr[i24];
                            }
                            i24++;
                            jArr2 = jArr2;
                            objArr = objArr;
                        }
                    } else {
                        long[] jArr4 = this.f9103a;
                        int i28 = this.f9106d;
                        Object[] objArr3 = this.f9104b;
                        int[] iArr3 = this.f9105c;
                        int i29 = (i28 + 7) >> 3;
                        int i30 = 0;
                        while (i30 < i29) {
                            long j17 = jArr4[i30] & j13;
                            jArr4[i30] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                            i30++;
                            j13 = -9187201950435737472L;
                        }
                        int iR = kotlin.collections.k.R(jArr4);
                        int i31 = iR - 1;
                        long j18 = 72057594037927935L;
                        jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[iR] = jArr4[0];
                        int i32 = 0;
                        while (i32 != i28) {
                            int i33 = i32 >> 3;
                            int i34 = (i32 & 7) << 3;
                            long j19 = (jArr4[i33] >> i34) & 255;
                            if (j19 != 128 && j19 == 254) {
                                Object obj2 = objArr3[i32];
                                int iHashCode3 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i35 = iHashCode3 ^ (iHashCode3 << 16);
                                int i36 = i35 >>> 7;
                                int iC4 = c(i36);
                                int i37 = i36 & i28;
                                if (((iC4 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                    jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (((long) (i35 & 127)) << i34);
                                    jArr4[jArr4.length - 1] = (jArr4[0] & j18) | Long.MIN_VALUE;
                                    i32++;
                                } else {
                                    int i38 = i32;
                                    int i39 = iC4 >> 3;
                                    long j20 = jArr4[i39];
                                    int i40 = (iC4 & 7) << 3;
                                    if (((j20 >> i40) & 255) == 128) {
                                        jArr4[i39] = (((long) (i35 & 127)) << i40) | (j20 & (~(255 << i40)));
                                        jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (128 << i34);
                                        objArr3[iC4] = objArr3[i38];
                                        objArr3[i38] = null;
                                        iArr3[iC4] = iArr3[i38];
                                        iArr3[i38] = 0;
                                        i11 = i38;
                                    } else {
                                        jArr4[i39] = (((long) (i35 & 127)) << i40) | (j20 & (~(255 << i40)));
                                        Object obj3 = objArr3[iC4];
                                        objArr3[iC4] = objArr3[i38];
                                        objArr3[i38] = obj3;
                                        int i41 = iArr3[iC4];
                                        iArr3[iC4] = iArr3[i38];
                                        iArr3[i38] = i41;
                                        i11 = i38 - 1;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i32 = i11 + 1;
                                    j18 = 72057594037927935L;
                                    j11 = j11;
                                }
                            } else {
                                i32++;
                            }
                        }
                        j = j11;
                        i10 = 0;
                        this.f9077f = U.a(this.f9106d) - this.f9107e;
                    }
                    iC = c(i13);
                }
                this.f9107e++;
                int i42 = this.f9077f;
                long[] jArr5 = this.f9103a;
                int i43 = iC >> 3;
                long j21 = jArr5[i43];
                int i44 = (iC & 7) << 3;
                this.f9077f = i42 - (((j21 >> i44) & 255) != 128 ? i10 : 1);
                int i45 = this.f9106d;
                long j22 = (j21 & (~(255 << i44))) | (j << i44);
                jArr5[i43] = j22;
                jArr5[(((iC - 7) & i45) + (i45 & 7)) >> 3] = j22;
                return ~iC;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
        }
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9106d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9103a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9077f = U.a(this.f9106d) - this.f9107e;
        this.f9104b = new Object[iMax];
        this.f9105c = new int[iMax];
    }

    public final void f(int i10) {
        this.f9107e--;
        long[] jArr = this.f9103a;
        int i11 = this.f9106d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f9104b[i10] = null;
    }

    public final void g(int i10, Object obj) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f9104b[iD] = obj;
        this.f9105c[iD] = i10;
    }

    public H(int i10) {
        if (i10 >= 0) {
            e(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ H(Object obj) {
        this(6);
    }
}
