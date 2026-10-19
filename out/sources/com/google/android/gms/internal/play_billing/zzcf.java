package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcf extends zzbw {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzbw f26336h = new zzcf(0, null, new Object[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f26337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f26338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f26339g;

    public zzcf(int i10, Object obj, Object[] objArr) {
        this.f26337e = obj;
        this.f26338f = objArr;
        this.f26339g = i10;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012c A[PHI: r3
      0x012c: PHI (r3v5 ??) = (r3v2 ??), (r3v6 short[]) binds: [B:74:0x0192, B:57:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzcf b(int i10, Object[] objArr, C2012v c2012v) {
        int iHighestOneBit;
        short[] sArr;
        char c10;
        char c11;
        ?? r10;
        ?? r11;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (zzcf) f26336h;
        }
        int i12 = 1;
        C2009u c2009u = null;
        ?? r12 = 0;
        C2009u c2009u2 = null;
        C2009u c2009u3 = null;
        if (i11 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new zzcf(1, null, objArrCopyOf);
        }
        C1989n.b(i11, objArrCopyOf.length >> 1);
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i13 = iHighestOneBit - 1;
            byte b10 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i11) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj = objArrCopyOf[i17];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i17 ^ i12];
                    Objects.requireNonNull(obj2);
                    int I10 = A8.p.I(obj.hashCode());
                    while (true) {
                        int i18 = I10 & i13;
                        int i19 = bArr[i18] & 255;
                        if (i19 == 255) {
                            bArr[i18] = (byte) i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj;
                                objArrCopyOf[i16 ^ 1] = obj2;
                            }
                            i15++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i19 == true ? 1 : 0])) {
                            int i20 = ~i19;
                            Object obj3 = objArrCopyOf[i20 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            c2009u2 = new C2009u(obj, obj2, obj3);
                            objArrCopyOf[i20 == true ? 1 : 0] = obj2;
                            break;
                        }
                        I10 = i18 + 1;
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 == i11) {
                    r10 = bArr;
                } else {
                    r11 = new Object[]{bArr, Integer.valueOf(i15), c2009u2};
                    c11 = 2;
                }
                c10 = 1;
                r12 = r11;
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i21 = 0;
                for (int i22 = 0; i22 < i11; i22++) {
                    int i23 = i21 + i21;
                    int i24 = i22 + i22;
                    Object obj4 = objArrCopyOf[i24];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArrCopyOf[i24 ^ 1];
                    Objects.requireNonNull(obj5);
                    int I11 = A8.p.I(obj4.hashCode());
                    while (true) {
                        int i25 = I11 & i13;
                        char c12 = (char) sArr[i25];
                        if (c12 == 65535) {
                            sArr[i25] = (short) i23;
                            if (i21 < i22) {
                                objArrCopyOf[i23] = obj4;
                                objArrCopyOf[i23 ^ 1] = obj5;
                            }
                            i21++;
                            break;
                        }
                        if (obj4.equals(objArrCopyOf[c12])) {
                            int i26 = c12 ^ 1;
                            Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                            Objects.requireNonNull(obj6);
                            C2009u c2009u4 = new C2009u(obj4, obj5, obj6);
                            objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                            c2009u3 = c2009u4;
                            break;
                        }
                        I11 = i25 + 1;
                    }
                }
                if (i21 == i11) {
                    r10 = sArr;
                } else {
                    c11 = 2;
                    r12 = new Object[]{sArr, Integer.valueOf(i21), c2009u3};
                    c10 = 1;
                }
            } else {
                int i27 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i28 = 0;
                int i29 = 0;
                while (i28 < i11) {
                    int i30 = i29 + i29;
                    int i31 = i28 + i28;
                    Object obj7 = objArrCopyOf[i31];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i31 ^ i27];
                    Objects.requireNonNull(obj8);
                    int I12 = A8.p.I(obj7.hashCode());
                    while (true) {
                        int i32 = I12 & i13;
                        ?? r15 = sArr[i32];
                        if (r15 == b10) {
                            sArr[i32] = i30;
                            if (i29 < i28) {
                                objArrCopyOf[i30] = obj7;
                                objArrCopyOf[i30 ^ 1] = obj8;
                            }
                            i29++;
                            break;
                        }
                        if (obj7.equals(objArrCopyOf[r15])) {
                            int i33 = r15 ^ 1;
                            Object obj9 = objArrCopyOf[i33 == true ? 1 : 0];
                            Objects.requireNonNull(obj9);
                            C2009u c2009u5 = new C2009u(obj7, obj8, obj9);
                            objArrCopyOf[i33 == true ? 1 : 0] = obj8;
                            c2009u = c2009u5;
                            break;
                        }
                        I12 = i32 + 1;
                        b10 = -1;
                    }
                    i28++;
                    b10 = -1;
                    i27 = 1;
                }
                if (i29 == i11) {
                    r10 = sArr;
                } else {
                    c10 = 1;
                    c11 = 2;
                    r12 = new Object[]{sArr, Integer.valueOf(i29), c2009u};
                }
            }
            c11 = 2;
            r11 = r10;
            c10 = 1;
            r12 = r11;
        }
        boolean z10 = r12 instanceof Object[];
        ?? r13 = r12;
        if (z10) {
            Object[] objArr2 = (Object[]) r12;
            C2009u c2009u6 = (C2009u) objArr2[c11];
            if (c2012v == null) {
                throw c2009u6.a();
            }
            c2012v.f26275c = c2009u6;
            Object obj10 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r13 = obj10;
            i11 = iIntValue;
        }
        return new zzcf(i11, r13, objArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f26339g;
            Object[] objArr = this.f26338f;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f26337e;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int I10 = A8.p.I(obj.hashCode());
                    while (true) {
                        int i11 = I10 & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            I10 = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int I11 = A8.p.I(obj.hashCode());
                    while (true) {
                        int i13 = I11 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            I11 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int I12 = A8.p.I(obj.hashCode());
                    while (true) {
                        int i14 = I12 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            I12 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26339g;
    }
}
