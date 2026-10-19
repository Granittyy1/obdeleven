package p287x4;

import Z3.C0835a;
import Z3.r;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import java.io.File;
import java.io.FileNotFoundException;
import p165n4.w;

/* JADX INFO: compiled from: ShareInternalUtility.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final r a(C0835a c0835a, Uri uri, w wVar) throws FileNotFoundException {
        String path = uri.getPath();
        boolean zEqualsIgnoreCase = "file".equalsIgnoreCase(uri.getScheme());
        HttpMethod httpMethod = HttpMethod.f24772c;
        if (zEqualsIgnoreCase && path != null) {
            r.g gVar = new r.g(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new r(c0835a, "me/staging_resources", bundle, httpMethod, wVar, 32);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        r.g gVar2 = new r.g(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", gVar2);
        return new r(c0835a, "me/staging_resources", bundle2, httpMethod, wVar, 32);
    }
}
