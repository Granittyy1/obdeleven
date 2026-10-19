package p159mb;

import java.io.DataInput;
import java.io.IOException;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: compiled from: Raw.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static void a(int i10, byte[] bArr) {
        bArr[0] = (byte) i10;
        bArr[1] = (byte) (i10 >> 8);
        bArr[2] = (byte) (i10 >> 16);
        bArr[3] = (byte) (i10 >> 24);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 0;
        bArr[9] = 0;
        bArr[10] = 0;
        bArr[11] = 0;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
    }

    public static int b(byte[] bArr) {
        return ((((bArr[3] & 255) << 8) | (bArr[2] & 255)) << 16) | (bArr[0] & 255) | ((bArr[1] & 255) << 8);
    }

    public static int c(DataInput dataInput, byte[] bArr) throws ZipException {
        try {
            dataInput.readFully(bArr, 0, 4);
            return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((((bArr[3] & 255) << 8) | (bArr[2] & 255)) << 16);
        } catch (IOException e10) {
            throw new ZipException((Exception) e10);
        }
    }

    public static long d(byte[] bArr) {
        return (((((((((((((((long) (bArr[7] & 255)) << 8) | ((long) (bArr[6] & 255))) << 8) | ((long) (bArr[5] & 255))) << 8) | ((long) (bArr[4] & 255))) << 8) | ((long) (bArr[3] & 255))) << 8) | ((long) (bArr[2] & 255))) << 8) | ((long) (bArr[1] & 255))) << 8) | ((long) (bArr[0] & 255));
    }

    public static int e(int i10, byte[] bArr) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }
}
