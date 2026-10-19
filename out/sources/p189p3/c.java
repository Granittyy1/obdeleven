package p189p3;

import android.content.Context;
import androidx.compose.foundation.gestures.d;
import com.airbnb.lottie.network.FileExtension;
import com.facebook.login.r;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f45800a;

    public c(r rVar) {
        this.f45800a = rVar;
    }

    public static String a(String str, FileExtension fileExtension, boolean z10) {
        String str2 = z10 ? ".temp" + fileExtension.extension : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return d.b("lottie_cache_", strReplaceAll, str2);
    }

    public final File b() {
        r rVar = this.f45800a;
        rVar.getClass();
        File file = new File(((Context) rVar.f25167b).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
