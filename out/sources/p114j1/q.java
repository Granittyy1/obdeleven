package p114j1;

import p241t7.b;

/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f41055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41058d;

    public q() {
        this.f41055a = A.f40998c;
    }

    public final void a() {
        int i10;
        int i11 = this.f41056b;
        b.k(i11 >= 0 && (i11 < (i10 = this.f41058d) || (i11 == i10 && this.f41057c == 0)));
    }

    public final int b() {
        return ((this.f41058d - this.f41056b) * 8) - this.f41057c;
    }

    public final void c() {
        if (this.f41057c == 0) {
            return;
        }
        this.f41057c = 0;
        this.f41056b++;
        a();
    }

    public final int d() {
        b.k(this.f41057c == 0);
        return this.f41056b;
    }

    public final int e() {
        return (this.f41056b * 8) + this.f41057c;
    }

    public final boolean f() {
        boolean z10 = (this.f41055a[this.f41056b] & (128 >> this.f41057c)) != 0;
        n();
        return z10;
    }

    public final int g(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f41057c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f41057c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f41057c = i13;
            byte[] bArr = this.f41055a;
            int i14 = this.f41056b;
            this.f41056b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f41055a;
        int i15 = this.f41056b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f41057c = 0;
            this.f41056b = i15 + 1;
        }
        a();
        return i16;
    }

    public final void h(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f41055a;
            int i13 = this.f41056b;
            int i14 = i13 + 1;
            this.f41056b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f41057c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f41057c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f41055a;
            int i18 = this.f41056b;
            this.f41056b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f41057c = i17 - 8;
        }
        int i19 = this.f41057c + i16;
        this.f41057c = i19;
        byte[] bArr4 = this.f41055a;
        int i20 = this.f41056b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f41057c = 0;
            this.f41056b = i20 + 1;
        }
        a();
    }

    public final long i(int i10) {
        if (i10 <= 32) {
            int iG = g(i10);
            int i11 = A.f40996a;
            return 4294967295L & ((long) iG);
        }
        int iG2 = g(i10 - 32);
        int iG3 = g(32);
        int i12 = A.f40996a;
        return (4294967295L & ((long) iG3)) | ((((long) iG2) & 4294967295L) << 32);
    }

    public final void j(int i10, byte[] bArr) {
        b.k(this.f41057c == 0);
        System.arraycopy(this.f41055a, this.f41056b, bArr, 0, i10);
        this.f41056b += i10;
        a();
    }

    public final void k(int i10, byte[] bArr) {
        this.f41055a = bArr;
        this.f41056b = 0;
        this.f41057c = 0;
        this.f41058d = i10;
    }

    public final void l(r rVar) {
        k(rVar.f41064c, rVar.f41062a);
        m(rVar.f41063b * 8);
    }

    public final void m(int i10) {
        int i11 = i10 / 8;
        this.f41056b = i11;
        this.f41057c = i10 - (i11 * 8);
        a();
    }

    public final void n() {
        int i10 = this.f41057c + 1;
        this.f41057c = i10;
        if (i10 == 8) {
            this.f41057c = 0;
            this.f41056b++;
        }
        a();
    }

    public final void o(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f41056b + i11;
        this.f41056b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f41057c;
        this.f41057c = i13;
        if (i13 > 7) {
            this.f41056b = i12 + 1;
            this.f41057c = i13 - 8;
        }
        a();
    }

    public final void p(int i10) {
        b.k(this.f41057c == 0);
        this.f41056b += i10;
        a();
    }

    public q(int i10, byte[] bArr) {
        this.f41055a = bArr;
        this.f41058d = i10;
    }
}
