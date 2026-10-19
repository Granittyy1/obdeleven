package A1;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f443d;

    public M(byte[] bArr) {
        this.f440a = bArr;
        this.f441b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f440a[this.f442c] & 255) >> this.f443d) & 1) == 1;
        c(1);
        return z10;
    }

    public final int b(int i10) {
        int i11 = this.f442c;
        int iMin = Math.min(i10, 8 - this.f443d);
        int i12 = i11 + 1;
        byte[] bArr = this.f440a;
        int i13 = ((bArr[i11] & 255) >> this.f443d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (bArr[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        c(i10);
        return i14;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f442c + i12;
        this.f442c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f443d;
        this.f443d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f442c = i13 + 1;
            this.f443d = i14 - 8;
        }
        int i15 = this.f442c;
        if (i15 < 0 || (i15 >= (i11 = this.f441b) && (i15 != i11 || this.f443d != 0))) {
            z10 = false;
        }
        p241t7.b.k(z10);
    }
}
