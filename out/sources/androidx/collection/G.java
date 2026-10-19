package androidx.collection;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G<K> extends M<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9076f;

    public G() {
        this((Object) null);
    }

    public final void b() {
        this.f9093e = 0;
        long[] jArr = this.f9089a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9089a;
            int i10 = this.f9092d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9090b, null, 0, this.f9092d);
        this.f9076f = U.a(this.f9092d) - this.f9093e;
    }

    public final int c(int i10) {
        int i11 = this.f9092d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9089a;
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
        this.f9092d = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9089a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9076f = U.a(this.f9092d) - this.f9093e;
        this.f9090b = new Object[iMax];
        this.f9091c = new float[iMax];
    }

    public final void e(float f10, Object obj) {
        long j;
        int i10;
        int i11;
        int iHashCode;
        float[] fArr;
        int i12;
        int iHashCode2 = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode2 ^ (iHashCode2 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f9092d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f9089a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i21 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            for (long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                if (kotlin.jvm.internal.i.a(this.f9090b[iNumberOfTrailingZeros], obj)) {
                    i10 = iNumberOfTrailingZeros;
                    break loop0;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iC = c(i14);
                if (this.f9076f != 0 || ((this.f9089a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j = j11;
                } else {
                    int i22 = this.f9092d;
                    if (i22 > 8) {
                        j = j11;
                        if (Long.compareUnsigned(((long) this.f9093e) * 32, ((long) i22) * 25) <= 0) {
                            long[] jArr2 = this.f9089a;
                            int i23 = this.f9092d;
                            Object[] objArr = this.f9090b;
                            float[] fArr2 = this.f9091c;
                            int i24 = (i23 + 7) >> 3;
                            int i25 = 0;
                            while (i25 < i24) {
                                long j15 = jArr2[i25] & j13;
                                jArr2[i25] = (-72340172838076674L) & ((~j15) + (j15 >>> 7));
                                i25++;
                                j13 = -9187201950435737472L;
                            }
                            int iR = kotlin.collections.k.R(jArr2);
                            int i26 = iR - 1;
                            jArr2[i26] = (jArr2[i26] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[iR] = jArr2[0];
                            int i27 = 0;
                            while (i27 != i23) {
                                int i28 = i27 >> 3;
                                int i29 = (i27 & 7) << 3;
                                long j16 = (jArr2[i28] >> i29) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    Object obj2 = objArr[i27];
                                    if (obj2 != null) {
                                        iHashCode = obj2.hashCode();
                                        i11 = -862048943;
                                    } else {
                                        i11 = -862048943;
                                        iHashCode = 0;
                                    }
                                    int i30 = iHashCode * i11;
                                    int i31 = (i30 << 16) ^ i30;
                                    int i32 = i31 >>> 7;
                                    int iC2 = c(i32);
                                    int i33 = i32 & i23;
                                    if (((iC2 - i33) & i23) / 8 == ((i27 - i33) & i23) / 8) {
                                        jArr2[i28] = (jArr2[i28] & (~(255 << i29))) | (((long) (i31 & 127)) << i29);
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27++;
                                    } else {
                                        int i34 = i27;
                                        int i35 = iC2 >> 3;
                                        long j17 = jArr2[i35];
                                        int i36 = (iC2 & 7) << 3;
                                        if (((j17 >> i36) & 255) == 128) {
                                            fArr = fArr2;
                                            jArr2[i35] = (j17 & (~(255 << i36))) | (((long) (i31 & 127)) << i36);
                                            jArr2[i28] = (jArr2[i28] & (~(255 << i29))) | (128 << i29);
                                            objArr[iC2] = objArr[i34];
                                            objArr[i34] = null;
                                            fArr[iC2] = fArr[i34];
                                            fArr[i34] = 0.0f;
                                            i12 = i34;
                                        } else {
                                            fArr = fArr2;
                                            jArr2[i35] = (((long) (i31 & 127)) << i36) | (j17 & (~(255 << i36)));
                                            Object obj3 = objArr[iC2];
                                            objArr[iC2] = objArr[i34];
                                            objArr[i34] = obj3;
                                            float f11 = fArr[iC2];
                                            fArr[iC2] = fArr[i34];
                                            fArr[i34] = f11;
                                            i12 = i34 - 1;
                                        }
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i27 = i12 + 1;
                                        fArr2 = fArr;
                                        i14 = i14;
                                    }
                                } else {
                                    i27++;
                                }
                            }
                            i14 = i14;
                            this.f9076f = U.a(this.f9092d) - this.f9093e;
                        }
                        iC = c(i14);
                    } else {
                        j = j11;
                    }
                    int i37 = 0;
                    int iC3 = U.c(this.f9092d);
                    long[] jArr3 = this.f9089a;
                    Object[] objArr2 = this.f9090b;
                    float[] fArr3 = this.f9091c;
                    int i38 = this.f9092d;
                    d(iC3);
                    long[] jArr4 = this.f9089a;
                    Object[] objArr3 = this.f9090b;
                    float[] fArr4 = this.f9091c;
                    int i39 = this.f9092d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr3[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr2[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : i37) * (-862048943);
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC4 = c(i41 >>> 7);
                            int i42 = iC4 >> 3;
                            int i43 = (iC4 & 7) << 3;
                            long j18 = (jArr4[i42] & (~(255 << i43))) | (((long) (i41 & 127)) << i43);
                            jArr4[i42] = j18;
                            jArr4[(((iC4 - 7) & i39) + (i39 & 7)) >> 3] = j18;
                            objArr3[iC4] = obj4;
                            fArr4[iC4] = fArr3[i40];
                        }
                        i40++;
                        i37 = 0;
                    }
                    iC = c(i14);
                }
                this.f9093e++;
                int i44 = this.f9076f;
                long[] jArr5 = this.f9089a;
                int i45 = iC >> 3;
                long j19 = jArr5[i45];
                int i46 = (iC & 7) << 3;
                this.f9076f = i44 - (((j19 >> i46) & 255) != 128 ? 0 : 1);
                int i47 = this.f9092d;
                long j20 = (j19 & (~(255 << i46))) | (j << i46);
                jArr5[i45] = j20;
                jArr5[(((iC - 7) & i47) + (i47 & 7)) >> 3] = j20;
                i10 = ~iC;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
        }
        if (i10 < 0) {
            i10 = ~i10;
        }
        this.f9090b[i10] = obj;
        this.f9091c[i10] = f10;
    }

    public G(int i10) {
        if (i10 >= 0) {
            d(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ G(Object obj) {
        this(6);
    }
}
