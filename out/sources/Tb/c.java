package Tb;

import java.io.Closeable;

/* JADX INFO: compiled from: IsoFile.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends a implements Closeable {
    public static byte[] i(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i10 = 0; i10 < Math.min(4, str.length()); i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
        }
        return bArr;
    }
}
