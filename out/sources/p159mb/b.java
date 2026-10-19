package p159mb;

import java.io.File;
import java.io.UnsupportedEncodingException;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: compiled from: Zip4jUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static boolean a(String str) throws ZipException {
        if (c(str)) {
            return new File(str).exists();
        }
        throw new ZipException("path is null");
    }

    public static String b(byte[] bArr, boolean z10) {
        if (z10) {
            try {
                return new String(bArr, "UTF8");
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        try {
            return new String(bArr, "Cp850");
        } catch (UnsupportedEncodingException unused2) {
            return new String(bArr);
        }
    }

    public static boolean c(String str) {
        return str != null && str.trim().length() > 0;
    }
}
