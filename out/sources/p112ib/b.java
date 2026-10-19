package p112ib;

/* JADX INFO: compiled from: ZipCryptoEngine.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f36860b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f36861a = new int[3];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) == 1 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            f36860b[i10] = i11;
        }
    }

    public final void a(byte b10) {
        int[] iArr = this.f36861a;
        int i10 = iArr[0];
        int[] iArr2 = f36860b;
        int i11 = iArr2[(b10 ^ i10) & 255] ^ (i10 >>> 8);
        iArr[0] = i11;
        int i12 = iArr[1] + (i11 & 255);
        iArr[1] = i12;
        int i13 = (i12 * 134775813) + 1;
        iArr[1] = i13;
        int i14 = iArr[2];
        iArr[2] = iArr2[(i14 ^ ((byte) (i13 >> 24))) & 255] ^ (i14 >>> 8);
    }
}
