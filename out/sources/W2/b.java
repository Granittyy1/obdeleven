package W2;

import android.net.Uri;
import coil.request.k;
import java.io.File;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: FileUriMapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d<Uri, File> {
    @Override // W2.d
    public final File a(Uri uri, k kVar) {
        Uri uri2 = uri;
        if (coil.util.k.d(uri2)) {
            return null;
        }
        String scheme = uri2.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri2.getPath();
        if (path == null) {
            path = "";
        }
        if (!n.g0(path, '/') || ((String) q.P(uri2.getPathSegments())) == null) {
            return null;
        }
        if (!i.a(uri2.getScheme(), "file")) {
            return new File(uri2.toString());
        }
        String path2 = uri2.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
