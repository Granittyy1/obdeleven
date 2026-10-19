package ac;

/* JADX INFO: compiled from: Hex.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f8128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i10, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i10 > 0 ? length / i10 : 0)];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (i10 > 0 && i12 % i10 == 0 && i11 > 0) {
                cArr[i11] = '-';
                i11++;
            }
            int i13 = i11 + 1;
            char[] cArr2 = f8128a;
            byte b10 = bArr[i12];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            i11 += 2;
            cArr[i13] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
