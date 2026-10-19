package V2;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import coil.request.k;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: UriKeyer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b<Uri> {
    @Override // V2.b
    public final String a(Uri uri, k kVar) {
        Uri uri2 = uri;
        if (!i.a(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri2);
        sb2.append('-');
        Configuration configuration = kVar.f23098a.getResources().getConfiguration();
        Bitmap.Config[] configArr = coil.util.k.f23160a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
