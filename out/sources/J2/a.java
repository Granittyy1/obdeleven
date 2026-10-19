package J2;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: AssetHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static String a(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }
}
