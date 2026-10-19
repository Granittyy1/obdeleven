package I2;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: WebViewAssetLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3806a;

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f3807b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f3808a;

        public a(Context context, File file) {
            try {
                this.f3808a = new File(J2.a.a(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        public final boolean a(Context context) throws IOException {
            String strA = J2.a.a(this.f3808a);
            String strA2 = J2.a.a(context.getCacheDir());
            String strA3 = J2.a.a(context.getDataDir());
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            String[] strArr = f3807b;
            for (int i10 = 0; i10 < 5; i10++) {
                if (strA.startsWith(strA3 + strArr[i10])) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: WebViewAssetLoader.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f3811c;

        public b(String str, a aVar) {
            if (str.isEmpty() || str.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f3809a = WebContentUtils.ASSET_LOADER_DUMMY_DOMAIN;
            this.f3810b = str;
            this.f3811c = aVar;
        }
    }

    public d(ArrayList arrayList) {
        this.f3806a = arrayList;
    }

    public final WebResourceResponse a(Uri uri) {
        for (b bVar : this.f3806a) {
            bVar.getClass();
            boolean zEquals = uri.getScheme().equals("http");
            String str = bVar.f3810b;
            a aVar = (!zEquals && (uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(bVar.f3809a) && uri.getPath().startsWith(str)) ? bVar.f3811c : null;
            if (aVar != null) {
                String strReplaceFirst = uri.getPath().replaceFirst(str, "");
                File file = aVar.f3808a;
                try {
                    String strA = J2.a.a(file);
                    String canonicalPath = new File(file, strReplaceFirst).getCanonicalPath();
                    File file2 = canonicalPath.startsWith(strA) ? new File(canonicalPath) : null;
                    if (file2 == null) {
                        Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", strReplaceFirst, file));
                        return new WebResourceResponse(null, null, null);
                    }
                    InputStream fileInputStream = new FileInputStream(file2);
                    if (file2.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(strReplaceFirst);
                    if (strGuessContentTypeFromName == null) {
                        strGuessContentTypeFromName = "text/plain";
                    }
                    return new WebResourceResponse(strGuessContentTypeFromName, null, fileInputStream);
                } catch (IOException e10) {
                    Log.e("WebViewAssetLoader", "Error opening the requested path: " + strReplaceFirst, e10);
                }
            }
        }
        return null;
    }
}
