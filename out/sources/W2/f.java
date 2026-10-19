package W2;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.k;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: ResourceUriMapper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements d<Uri, Uri> {
    @Override // W2.d
    public final Uri a(Uri uri, k kVar) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri2 = uri;
        if (!i.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || n.S(authority) || uri2.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri2.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = kVar.f23098a.getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri2.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(B1.a.h(uri2, "Invalid android.resource URI: ").toString());
        }
        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
    }
}
