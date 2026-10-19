package androidx.collection;

import com.braze.support.BrazeLogger;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: compiled from: OrderedScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J<E> extends OrderedScatterSet<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9085h;

    public J(int i10) {
        if (i10 >= 0) {
            f(U.e(i10));
        } else {
            D9.o.q("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(E e10) {
        int i10 = this.f9116g;
        int iD = d(e10);
        this.f9111b[iD] = e10;
        long[] jArr = this.f9112c;
        int i11 = this.f9113d;
        jArr[iD] = (((long) i11) & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((((long) iD) & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f9113d = iD;
        if (this.f9114e == Integer.MAX_VALUE) {
            this.f9114e = iD;
        }
        return this.f9116g != i10;
    }

    public final void c() {
        this.f9116g = 0;
        long[] jArr = this.f9110a;
        if (jArr != U.f9132a) {
            Q3.d.y(jArr, -9187201950435737472L);
            long[] jArr2 = this.f9110a;
            int i10 = this.f9115f;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        Q3.d.w(this.f9111b, null, 0, this.f9115f);
        Q3.d.y(this.f9112c, 4611686018427387903L);
        this.f9113d = BrazeLogger.SUPPRESS;
        this.f9114e = BrazeLogger.SUPPRESS;
        this.f9085h = U.a(this.f9115f) - this.f9116g;
    }

    public final int d(E e10) {
        long j;
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        int i13;
        int iHashCode;
        int i14;
        int iHashCode2 = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i15 = iHashCode2 ^ (iHashCode2 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f9115f;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr = this.f9110a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            long j12 = ((jArr[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr[i21] >>> i22);
            long j13 = i17;
            int i23 = i17;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = -9187201950435737472L;
            for (long j16 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j16 != 0; j16 &= j16 - 1) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j16) >> 3)) & i18;
                if (kotlin.jvm.internal.i.a(this.f9111b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i16);
                if (this.f9085h != 0 || ((this.f9110a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = j13;
                    i10 = 0;
                } else {
                    int i24 = this.f9115f;
                    if (i24 > 8) {
                        i11 = i16;
                        if (Long.compareUnsigned(((long) this.f9116g) * 32, ((long) i24) * 25) <= 0) {
                            long[] jArr2 = this.f9110a;
                            if (jArr2 == null) {
                                j = j13;
                                i10 = 0;
                            } else {
                                int i25 = this.f9115f;
                                Object[] objArr = this.f9111b;
                                long[] jArr3 = this.f9112c;
                                long[] jArr4 = new long[i25];
                                Arrays.fill(jArr4, 0, i25, 9223372034707292159L);
                                int i26 = (i25 + 7) >> 3;
                                int i27 = 0;
                                while (i27 < i26) {
                                    long j17 = jArr2[i27] & j15;
                                    jArr2[i27] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                    i27++;
                                    j15 = -9187201950435737472L;
                                }
                                int length = jArr2.length;
                                int i28 = length - 1;
                                int i29 = length - 2;
                                jArr2[i29] = (jArr2[i29] & 72057594037927935L) | (-72057594037927936L);
                                jArr2[i28] = jArr2[0];
                                int i30 = 0;
                                while (i30 != i25) {
                                    int i31 = i30 >> 3;
                                    int i32 = (i30 & 7) << 3;
                                    long j18 = (jArr2[i31] >> i32) & 255;
                                    if (j18 != 128 && j18 == 254) {
                                        Object obj = objArr[i30];
                                        if (obj != null) {
                                            iHashCode = obj.hashCode();
                                            i13 = -862048943;
                                        } else {
                                            i13 = -862048943;
                                            iHashCode = 0;
                                        }
                                        int i33 = iHashCode * i13;
                                        int i34 = (i33 << 16) ^ i33;
                                        int i35 = i34 >>> 7;
                                        int iE2 = e(i35);
                                        int i36 = i35 & i25;
                                        if (((iE2 - i36) & i25) / 8 == ((i30 - i36) & i25) / 8) {
                                            jArr2[i31] = (((long) (i34 & 127)) << i32) | (jArr2[i31] & (~(255 << i32)));
                                            if (jArr4[i30] == 9223372034707292159L) {
                                                long j19 = i30;
                                                jArr4[i30] = j19 | (j19 << 32);
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i30++;
                                        } else {
                                            int i37 = iE2 >> 3;
                                            long j20 = jArr2[i37];
                                            int i38 = (iE2 & 7) << 3;
                                            if (((j20 >> i38) & 255) == 128) {
                                                jArr2[i37] = (j20 & (~(255 << i38))) | (((long) (i34 & 127)) << i38);
                                                jArr2[i31] = (jArr2[i31] & (~(255 << i32))) | (128 << i32);
                                                objArr[iE2] = objArr[i30];
                                                objArr[i30] = null;
                                                jArr3[iE2] = jArr3[i30];
                                                jArr3[i30] = 4611686018427387903L;
                                                int i39 = (int) ((jArr4[i30] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    jArr4[i39] = ((long) iE2) | (jArr4[i39] & (-4294967296L));
                                                    jArr4[i30] = (jArr4[i30] & 4294967295L) | (-4294967296L);
                                                    i14 = BrazeLogger.SUPPRESS;
                                                } else {
                                                    i14 = Integer.MAX_VALUE;
                                                    jArr4[i30] = (((long) BrazeLogger.SUPPRESS) << 32) | ((long) iE2);
                                                }
                                                jArr4[iE2] = (((long) i30) << 32) | ((long) i14);
                                            } else {
                                                jArr2[i37] = (((long) (i34 & 127)) << i38) | (j20 & (~(255 << i38)));
                                                Object obj2 = objArr[iE2];
                                                objArr[iE2] = objArr[i30];
                                                objArr[i30] = obj2;
                                                long j21 = jArr3[iE2];
                                                jArr3[iE2] = jArr3[i30];
                                                jArr3[i30] = j21;
                                                int i40 = (int) ((jArr4[i30] >> 32) & 4294967295L);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j22 = iE2;
                                                    jArr4[i40] = (jArr4[i40] & (-4294967296L)) | j22;
                                                    jArr4[i30] = (jArr4[i30] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = iE2;
                                                    jArr4[i30] = j23 | (j23 << 32);
                                                    i40 = i30;
                                                }
                                                jArr4[iE2] = (((long) i40) << 32) | ((long) i30);
                                                i30--;
                                            }
                                            jArr2[jArr2.length - 1] = jArr2[0];
                                            i30++;
                                        }
                                        j13 = j13;
                                    } else {
                                        i30++;
                                    }
                                }
                                j = j13;
                                i10 = 0;
                                this.f9085h = U.a(this.f9115f) - this.f9116g;
                                long[] jArr5 = this.f9112c;
                                int length2 = jArr5.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j24 = jArr5[i41];
                                    int i42 = (int) ((j24 >> 31) & 2147483647L);
                                    int i43 = (int) (j24 & 2147483647L);
                                    long j25 = j24 & (-4611686018427387904L);
                                    if (i42 == Integer.MAX_VALUE) {
                                        i12 = Integer.MAX_VALUE;
                                        j11 = 4294967295L;
                                    } else {
                                        j11 = 4294967295L;
                                        i12 = (int) (jArr4[i42] & 4294967295L);
                                    }
                                    jArr5[i41] = ((j25 | ((long) i12)) << 31) | ((long) (i43 == Integer.MAX_VALUE ? BrazeLogger.SUPPRESS : (int) (jArr4[i43] & j11)));
                                }
                                int i44 = this.f9113d;
                                if (i44 != Integer.MAX_VALUE) {
                                    j10 = 4294967295L;
                                    this.f9113d = (int) (jArr4[i44] & 4294967295L);
                                } else {
                                    j10 = 4294967295L;
                                }
                                int i45 = this.f9114e;
                                if (i45 != Integer.MAX_VALUE) {
                                    this.f9114e = (int) (jArr4[i45] & j10);
                                }
                            }
                        }
                        iE = e(i11);
                    } else {
                        i11 = i16;
                    }
                    j = j13;
                    i10 = 0;
                    int iC = U.c(this.f9115f);
                    long[] jArr6 = this.f9110a;
                    Object[] objArr2 = this.f9111b;
                    long[] jArr7 = this.f9112c;
                    int i46 = this.f9115f;
                    int[] iArr = new int[i46];
                    f(iC);
                    long[] jArr8 = this.f9110a;
                    Object[] objArr3 = this.f9111b;
                    long[] jArr9 = this.f9112c;
                    int i47 = this.f9115f;
                    int i48 = 0;
                    while (i48 < i46) {
                        if (((jArr6[i48 >> 3] >> ((i48 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr2[i48];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                            int i49 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i49 >>> 7);
                            long j26 = i49 & 127;
                            int i50 = iE3 >> 3;
                            int i51 = (iE3 & 7) << 3;
                            long j27 = (j26 << i51) | (jArr8[i50] & (~(255 << i51)));
                            jArr8[i50] = j27;
                            jArr8[(((iE3 - 7) & i47) + (i47 & 7)) >> 3] = j27;
                            objArr3[iE3] = obj3;
                            jArr9[iE3] = jArr7[i48];
                            iArr[i48] = iE3;
                        }
                        i48++;
                        jArr6 = jArr6;
                        objArr2 = objArr2;
                    }
                    long[] jArr10 = this.f9112c;
                    int length3 = jArr10.length;
                    for (int i52 = 0; i52 < length3; i52++) {
                        long j28 = jArr10[i52];
                        int i53 = (int) ((j28 >> 31) & 2147483647L);
                        int i54 = (int) (j28 & 2147483647L);
                        jArr10[i52] = (((j28 & (-4611686018427387904L)) | ((long) (i53 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i53]))) << 31) | ((long) (i54 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i54]));
                    }
                    int i55 = this.f9113d;
                    if (i55 != Integer.MAX_VALUE) {
                        this.f9113d = iArr[i55];
                    }
                    int i56 = this.f9114e;
                    if (i56 != Integer.MAX_VALUE) {
                        this.f9114e = iArr[i56];
                    }
                    iE = e(i11);
                }
                this.f9116g++;
                int i57 = this.f9085h;
                long[] jArr11 = this.f9110a;
                int i58 = iE >> 3;
                long j29 = jArr11[i58];
                int i59 = (iE & 7) << 3;
                this.f9085h = i57 - (((j29 >> i59) & 255) != 128 ? i10 : 1);
                int i60 = this.f9115f;
                long j30 = (j29 & (~(255 << i59))) | (j << i59);
                jArr11[i58] = j30;
                jArr11[(((iE - 7) & i60) + (i60 & 7)) >> 3] = j30;
                return iE;
            }
            i20 += 8;
            i19 = (i19 + i20) & i18;
            i17 = i23;
        }
    }

    public final int e(int i10) {
        int i11 = this.f9115f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f9110a;
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
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, U.d(i10)) : 0;
        this.f9115f = iMax;
        if (iMax == 0) {
            jArr = U.f9132a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Q3.d.y(jArr, -9187201950435737472L);
        }
        this.f9110a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f9085h = U.a(this.f9115f) - this.f9116g;
        this.f9111b = iMax == 0 ? p233t.a.f46998c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = W.f9136a;
        } else {
            jArr2 = new long[iMax];
            Q3.d.y(jArr2, 4611686018427387903L);
        }
        this.f9112c = jArr2;
    }

    public final boolean g(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f9115f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f9110a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.i.a(this.f9111b[iNumberOfTrailingZeros], e10)) {
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
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i10) {
        this.f9116g--;
        long[] jArr = this.f9110a;
        int i11 = this.f9115f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f9111b[i10] = null;
        long[] jArr2 = this.f9112c;
        long j10 = jArr2[i10];
        int i14 = (int) ((j10 >> 31) & 2147483647L);
        int i15 = (int) (j10 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f9113d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f9114e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[EDGE_INSN: B:23:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean i(Collection<? extends E> elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        Object[] objArr = this.f9111b;
        int i10 = this.f9116g;
        long[] jArr = this.f9110a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j = jArr[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!kotlin.collections.q.J(elements, objArr[i14])) {
                                h(i14);
                            }
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f9116g;
    }
}
