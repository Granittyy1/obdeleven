package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K<K, V> extends T<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9086f;

    public K() {
        this((Object) null);
    }

    public final void f() {
        this.f9131e = 0;
        long[] jArr = this.f9127a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9127a;
            int i10 = this.f9130d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9129c, null, 0, this.f9130d);
        Q3.d.w(this.f9128b, null, 0, this.f9130d);
        this.f9086f = U.a(this.f9130d) - this.f9131e;
    }

    public final int g(int i10) {
        int i11 = this.f9130d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9127a;
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

    public final int h(K k10) {
        long j;
        int i10;
        int i11;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f9130d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f9127a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j11 = i14;
            int i20 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                if (kotlin.jvm.internal.i.a(this.f9128b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iG = g(i13);
                if (this.f9086f != 0 || ((this.f9127a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j = j11;
                    i10 = 0;
                } else {
                    int i21 = this.f9130d;
                    if (i21 <= 8 || Long.compareUnsigned(((long) this.f9131e) * 32, ((long) i21) * 25) > 0) {
                        j = j11;
                        i10 = 0;
                        int iC = U.c(this.f9130d);
                        long[] jArr2 = this.f9127a;
                        Object[] objArr = this.f9128b;
                        Object[] objArr2 = this.f9129c;
                        int i22 = this.f9130d;
                        i(iC);
                        long[] jArr3 = this.f9127a;
                        Object[] objArr3 = this.f9128b;
                        Object[] objArr4 = this.f9129c;
                        int i23 = this.f9130d;
                        int i24 = 0;
                        while (i24 < i22) {
                            if (((jArr2[i24 >> 3] >> ((i24 & 7) << 3)) & 255) < 128) {
                                Object obj = objArr[i24];
                                int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                int iG2 = g(i25 >>> 7);
                                long j15 = i25 & 127;
                                int i26 = iG2 >> 3;
                                int i27 = (iG2 & 7) << 3;
                                long j16 = (j15 << i27) | (jArr3[i26] & (~(255 << i27)));
                                jArr3[i26] = j16;
                                jArr3[(((iG2 - 7) & i23) + (i23 & 7)) >> 3] = j16;
                                objArr3[iG2] = obj;
                                objArr4[iG2] = objArr2[i24];
                            }
                            i24++;
                            jArr2 = jArr2;
                            objArr = objArr;
                        }
                    } else {
                        long[] jArr4 = this.f9127a;
                        int i28 = this.f9130d;
                        Object[] objArr5 = this.f9128b;
                        Object[] objArr6 = this.f9129c;
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
                        jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[iR] = jArr4[0];
                        int i32 = 0;
                        while (i32 != i28) {
                            int i33 = i32 >> 3;
                            int i34 = (i32 & 7) << 3;
                            long j18 = (jArr4[i33] >> i34) & 255;
                            if (j18 != 128 && j18 == 254) {
                                Object obj2 = objArr5[i32];
                                int iHashCode3 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i35 = iHashCode3 ^ (iHashCode3 << 16);
                                int i36 = i35 >>> 7;
                                int iG3 = g(i36);
                                int i37 = i36 & i28;
                                if (((iG3 - i37) & i28) / 8 == ((i32 - i37) & i28) / 8) {
                                    jArr4[i33] = ((~(255 << i34)) & jArr4[i33]) | (((long) (i35 & 127)) << i34);
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i32++;
                                } else {
                                    int i38 = i32;
                                    int i39 = iG3 >> 3;
                                    long j19 = jArr4[i39];
                                    int i40 = (iG3 & 7) << 3;
                                    if (((j19 >> i40) & 255) == 128) {
                                        jArr4[i39] = (((long) (i35 & 127)) << i40) | (j19 & (~(255 << i40)));
                                        jArr4[i33] = (jArr4[i33] & (~(255 << i34))) | (128 << i34);
                                        objArr5[iG3] = objArr5[i38];
                                        objArr5[i38] = null;
                                        objArr6[iG3] = objArr6[i38];
                                        objArr6[i38] = null;
                                        i11 = i38;
                                    } else {
                                        jArr4[i39] = (((long) (i35 & 127)) << i40) | (j19 & (~(255 << i40)));
                                        Object obj3 = objArr5[iG3];
                                        objArr5[iG3] = objArr5[i38];
                                        objArr5[i38] = obj3;
                                        Object obj4 = objArr6[iG3];
                                        objArr6[iG3] = objArr6[i38];
                                        objArr6[i38] = obj4;
                                        i11 = i38 - 1;
                                    }
                                    jArr4[jArr4.length - 1] = jArr4[0];
                                    i32 = i11 + 1;
                                    j11 = j11;
                                }
                            } else {
                                i32++;
                            }
                        }
                        j = j11;
                        i10 = 0;
                        this.f9086f = U.a(this.f9130d) - this.f9131e;
                    }
                    iG = g(i13);
                }
                this.f9131e++;
                int i41 = this.f9086f;
                long[] jArr5 = this.f9127a;
                int i42 = iG >> 3;
                long j20 = jArr5[i42];
                int i43 = (iG & 7) << 3;
                this.f9086f = i41 - (((j20 >> i43) & 255) != 128 ? i10 : 1);
                int i44 = this.f9130d;
                long j21 = (j20 & (~(255 << i43))) | (j << i43);
                jArr5[i42] = j21;
                jArr5[(((iG - 7) & i44) + (i44 & 7)) >> 3] = j21;
                return ~iG;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
        }
    }

    public final void i(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9130d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
            int i11 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i11] = (jArr[i11] & (~j)) | j;
        }
        this.f9127a = jArr;
        this.f9086f = U.a(this.f9130d) - this.f9131e;
        Object[] objArr = p233t.a.f46998c;
        this.f9128b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f9129c = objArr;
    }

    public final V j(K k10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f9130d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f9127a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.i.a(this.f9128b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return k(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V k(int i10) {
        this.f9131e--;
        long[] jArr = this.f9127a;
        int i11 = this.f9130d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f9128b[i10] = null;
        Object[] objArr = this.f9129c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void l(K k10, V v10) {
        int iH = h(k10);
        if (iH < 0) {
            iH = ~iH;
        }
        this.f9128b[iH] = k10;
        this.f9129c[iH] = v10;
    }

    public K(int i10) {
        if (i10 >= 0) {
            i(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ K(Object obj) {
        this(6);
    }
}
