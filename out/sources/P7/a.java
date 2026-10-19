package P7;

import java.util.Arrays;

/* JADX INFO: compiled from: BitArray.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4952c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4951b = new int[1];

    public final void a(boolean z10) {
        c(this.f4952c + 1);
        if (z10) {
            int[] iArr = this.f4951b;
            int i10 = this.f4952c;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f4952c++;
    }

    public final void b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f4952c + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public final void c(int i10) {
        int[] iArr = this.f4951b;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f4951b = iArr2;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        int[] iArr = (int[]) this.f4951b.clone();
        int i10 = this.f4952c;
        a aVar = new a();
        aVar.f4951b = iArr;
        aVar.f4952c = i10;
        return aVar;
    }

    public final boolean d(int i10) {
        return ((1 << (i10 & 31)) & this.f4951b[i10 / 32]) != 0;
    }

    public final int e() {
        return (this.f4952c + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4952c == aVar.f4952c && Arrays.equals(this.f4951b, aVar.f4951b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4951b) + (this.f4952c * 31);
    }

    public final String toString() {
        int i10 = this.f4952c;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f4952c; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
