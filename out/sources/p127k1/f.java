package p127k1;

import p241t7.b;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f41463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41466d = 0;

    public f(byte[] bArr, int i10, int i11) {
        this.f41463a = bArr;
        this.f41465c = i10;
        this.f41464b = i11;
        a();
    }

    public final void a() {
        int i10;
        int i11 = this.f41465c;
        b.k(i11 >= 0 && (i11 < (i10 = this.f41464b) || (i11 == i10 && this.f41466d == 0)));
    }

    public final void b() {
        int i10 = this.f41466d;
        if (i10 > 0) {
            l(8 - i10);
        }
    }

    public final boolean c(int i10) {
        int i11 = this.f41465c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f41466d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f41464b) {
                break;
            }
            if (j(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f41464b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean d() {
        int i10 = this.f41465c;
        int i11 = this.f41466d;
        int i12 = 0;
        while (this.f41465c < this.f41464b && !e()) {
            i12++;
        }
        boolean z10 = this.f41465c == this.f41464b;
        this.f41465c = i10;
        this.f41466d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public final boolean e() {
        boolean z10 = (this.f41463a[this.f41465c] & (128 >> this.f41466d)) != 0;
        k();
        return z10;
    }

    public final int f(int i10) {
        int i11;
        this.f41466d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f41466d;
            int i13 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f41466d = i14;
            byte[] bArr = this.f41463a;
            int i15 = this.f41465c;
            i12 |= (bArr[i15] & 255) << i14;
            if (!j(i15 + 1)) {
                i13 = 1;
            }
            this.f41465c = i15 + i13;
        }
        byte[] bArr2 = this.f41463a;
        int i16 = this.f41465c;
        int i17 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f41466d = 0;
            this.f41465c = i16 + (j(i16 + 1) ? 2 : 1);
        }
        a();
        return i17;
    }

    public final int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    public final int h() {
        int iG = g();
        return ((iG + 1) / 2) * (iG % 2 == 0 ? -1 : 1);
    }

    public final int i() {
        return g();
    }

    public final boolean j(int i10) {
        if (2 <= i10 && i10 < this.f41464b) {
            byte[] bArr = this.f41463a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        int i10 = this.f41466d + 1;
        this.f41466d = i10;
        if (i10 == 8) {
            this.f41466d = 0;
            int i11 = this.f41465c;
            this.f41465c = i11 + (j(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final void l(int i10) {
        int i11 = this.f41465c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f41465c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f41466d;
        this.f41466d = i14;
        if (i14 > 7) {
            this.f41465c = i13 + 1;
            this.f41466d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f41465c) {
                a();
                return;
            } else if (j(i11)) {
                this.f41465c++;
                i11 += 2;
            }
        }
    }
}
