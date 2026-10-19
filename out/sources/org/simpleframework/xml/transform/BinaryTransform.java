package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class BinaryTransform implements Transform<byte[]> {
    private static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    private static int hexToBin(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 <= 'F') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    @Override // org.simpleframework.xml.transform.Transform
    public byte[] read(String str) throws Exception {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: ".concat(str));
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iHexToBin = hexToBin(str.charAt(i10));
            int iHexToBin2 = hexToBin(str.charAt(i10 + 1));
            if (iHexToBin == -1 || iHexToBin2 == -1) {
                throw new IllegalArgumentException("contains illegal character for hexBinary: ".concat(str));
            }
            bArr[i10 / 2] = (byte) ((iHexToBin * 16) + iHexToBin2);
        }
        return bArr;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = hexCode;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
