package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class S3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S3 f25587f = new S3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f25589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f25590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25592e;

    public S3() {
        this(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY0;
        int i10 = this.f25591d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f25588a; i11++) {
            int i12 = this.f25589b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                iY0 = zzja.y0(i13, ((Long) this.f25590c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f25590c[i11]).getClass();
                iY0 = zzja.p0(i13);
            } else if (i14 != 2) {
                if (i14 == 3) {
                    iA = ((S3) this.f25590c[i11]).a() + (zzja.A0(i13) << 1) + iA;
                } else {
                    if (i14 != 5) {
                        int i15 = zzkb.f26066b;
                        throw new IllegalStateException(new zzke("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f25590c[i11]).getClass();
                    iY0 = zzja.r0(i13);
                }
            } else {
                iY0 = zzja.k0(i13, (zzij) this.f25590c[i11]);
            }
            iA = iY0 + iA;
        }
        this.f25591d = iA;
        return iA;
    }

    public final void b(int i10) {
        int[] iArr = this.f25589b;
        if (i10 > iArr.length) {
            int i11 = this.f25588a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f25589b = Arrays.copyOf(iArr, i10);
            this.f25590c = Arrays.copyOf(this.f25590c, i10);
        }
    }

    public final void c(int i10, Object obj) {
        if (!this.f25592e) {
            throw new UnsupportedOperationException();
        }
        b(this.f25588a + 1);
        int[] iArr = this.f25589b;
        int i11 = this.f25588a;
        iArr[i11] = i10;
        this.f25590c[i11] = obj;
        this.f25588a = i11 + 1;
    }

    public final void d(InterfaceC1791c4 interfaceC1791c4) throws IOException {
        if (this.f25588a == 0) {
            return;
        }
        interfaceC1791c4.getClass();
        for (int i10 = 0; i10 < this.f25588a; i10++) {
            int i11 = this.f25589b[i10];
            Object obj = this.f25590c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                ((B2) interfaceC1791c4).i(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                ((B2) interfaceC1791c4).d(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                ((B2) interfaceC1791c4).e(i12, (zzij) obj);
            } else if (i13 == 3) {
                zzja.a aVar = ((B2) interfaceC1791c4).f25401a;
                aVar.R0(i12, 3);
                ((S3) obj).d(interfaceC1791c4);
                aVar.R0(i12, 4);
            } else {
                if (i13 != 5) {
                    int i14 = zzkb.f26066b;
                    throw new RuntimeException(new zzke("Protocol message tag had invalid wire type."));
                }
                ((B2) interfaceC1791c4).h(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S3)) {
            return false;
        }
        S3 s10 = (S3) obj;
        int i10 = this.f25588a;
        if (i10 == s10.f25588a) {
            int[] iArr = this.f25589b;
            int[] iArr2 = s10.f25589b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f25590c;
            Object[] objArr2 = s10.f25590c;
            int i12 = this.f25588a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25588a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f25589b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f25590c;
        int i15 = this.f25588a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public S3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f25591d = -1;
        this.f25588a = i10;
        this.f25589b = iArr;
        this.f25590c = objArr;
        this.f25592e = z10;
    }
}
