package P7;

import java.util.Arrays;

/* JADX INFO: compiled from: BitMatrix.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f4956e;

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f4953b = i10;
        this.f4954c = i11;
        int i12 = (i10 + 31) / 32;
        this.f4955d = i12;
        this.f4956e = new int[i12 * i11];
    }

    public final boolean a(int i10, int i11) {
        return ((this.f4956e[(i10 / 32) + (i11 * this.f4955d)] >>> (i10 & 31)) & 1) != 0;
    }

    public final Object clone() throws CloneNotSupportedException {
        int[] iArr = (int[]) this.f4956e.clone();
        return new b(this.f4953b, this.f4954c, this.f4955d, iArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4953b == bVar.f4953b && this.f4954c == bVar.f4954c && this.f4955d == bVar.f4955d && Arrays.equals(this.f4956e, bVar.f4956e);
    }

    public final int hashCode() {
        int i10 = this.f4953b;
        return Arrays.hashCode(this.f4956e) + (((((((i10 * 31) + i10) * 31) + this.f4954c) * 31) + this.f4955d) * 31);
    }

    public final String toString() {
        int i10 = this.f4953b;
        int i11 = this.f4954c;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb2.append(a(i13, i12) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f4953b = i10;
        this.f4954c = i11;
        this.f4955d = i12;
        this.f4956e = iArr;
    }
}
