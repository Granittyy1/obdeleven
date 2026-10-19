package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2020x1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2020x1 f26298f = new C2020x1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f26300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f26301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26303e;

    public C2020x1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f26302d = -1;
        this.f26299a = i10;
        this.f26300b = iArr;
        this.f26301c = objArr;
        this.f26303e = z10;
    }

    public static C2020x1 b() {
        return new C2020x1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iR;
        int iS;
        int iR2;
        int i10 = this.f26302d;
        if (i10 != -1) {
            return i10;
        }
        int iR3 = 0;
        for (int i11 = 0; i11 < this.f26299a; i11++) {
            int i12 = this.f26300b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        zzei zzeiVar = (zzei) this.f26301c[i11];
                        int iR4 = AbstractC2001r0.r(i15);
                        int iG = zzeiVar.g();
                        iR3 = AbstractC2001r0.r(iG) + iG + iR4 + iR3;
                    } else if (i14 == 3) {
                        int iR5 = AbstractC2001r0.r(i13 << 3);
                        iR = iR5 + iR5;
                        iS = ((C2020x1) this.f26301c[i11]).a();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new zzfp());
                        }
                        ((Integer) this.f26301c[i11]).getClass();
                        iR2 = AbstractC2001r0.r(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f26301c[i11]).getClass();
                    iR2 = AbstractC2001r0.r(i13 << 3) + 8;
                }
                iR3 = iR2 + iR3;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f26301c[i11]).longValue();
                iR = AbstractC2001r0.r(i16);
                iS = AbstractC2001r0.s(jLongValue);
            }
            iR3 = iS + iR + iR3;
        }
        this.f26302d = iR3;
        return iR3;
    }

    public final void c(int i10, Object obj) {
        if (!this.f26303e) {
            throw new UnsupportedOperationException();
        }
        e(this.f26299a + 1);
        int[] iArr = this.f26300b;
        int i11 = this.f26299a;
        iArr[i11] = i10;
        this.f26301c[i11] = obj;
        this.f26299a = i11 + 1;
    }

    public final void d(F1 f10) throws IOException {
        if (this.f26299a != 0) {
            for (int i10 = 0; i10 < this.f26299a; i10++) {
                int i11 = this.f26300b[i10];
                Object obj = this.f26301c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((C2004s0) f10).p(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((C2004s0) f10).l(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ((C2004s0) f10).g(i13, (zzei) obj);
                } else if (i12 == 3) {
                    C2004s0 c2004s0 = (C2004s0) f10;
                    c2004s0.f26249a.G(i13, 3);
                    ((C2020x1) obj).d(f10);
                    c2004s0.f26249a.G(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzfp());
                    }
                    ((C2004s0) f10).k(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f26300b;
        if (i10 > iArr.length) {
            int i11 = this.f26299a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f26300b = Arrays.copyOf(iArr, i10);
            this.f26301c = Arrays.copyOf(this.f26301c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2020x1)) {
            return false;
        }
        C2020x1 c2020x1 = (C2020x1) obj;
        int i10 = this.f26299a;
        if (i10 == c2020x1.f26299a) {
            int[] iArr = this.f26300b;
            int[] iArr2 = c2020x1.f26300b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f26301c;
            Object[] objArr2 = c2020x1.f26301c;
            int i12 = this.f26299a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f26299a;
        int i11 = i10 + 527;
        int[] iArr = this.f26300b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f26301c;
        int i15 = this.f26299a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public C2020x1() {
        this(0, new int[8], new Object[8], true);
    }
}
