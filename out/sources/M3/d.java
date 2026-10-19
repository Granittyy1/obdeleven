package M3;

import D3.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: ResourceDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements A3.e<Uri, Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4563a;

    public d(Context context) {
        this.f4563a = context.getApplicationContext();
    }

    @Override // A3.e
    public final boolean a(Uri uri, A3.d dVar) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // A3.e
    public final /* bridge */ /* synthetic */ o<Drawable> b(Uri uri, int i10, int i11, A3.d dVar) throws IOException {
        return c(uri);
    }

    public final o c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = this.f4563a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(B1.a.h(uri, "Failed to obtain context or unrecognized Uri format for: "), e10);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(B1.a.h(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(B1.a.h(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(B1.a.h(uri, "Unrecognized Uri format: "), e11);
            }
        }
        Drawable drawableA = a.a(context, contextCreatePackageContext, identifier, null);
        if (drawableA != null) {
            return new c(drawableA);
        }
        return null;
    }
}
