package T7;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: ByteMatrix.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f6041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6043c;

    public b(int i10, int i11) {
        this.f6041a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f6042b = i10;
        this.f6043c = i11;
    }

    public final byte a(int i10, int i11) {
        return this.f6041a[i11][i10];
    }

    public final void b(int i10, int i11, int i12) {
        this.f6041a[i11][i10] = (byte) i12;
    }

    public final void c(int i10, int i11, boolean z10) {
        this.f6041a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i10 = this.f6042b;
        int i11 = this.f6043c;
        StringBuilder sb2 = new StringBuilder((i10 * 2 * i11) + 2);
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = this.f6041a[i12];
            for (int i13 = 0; i13 < i10; i13++) {
                byte b10 = bArr[i13];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
