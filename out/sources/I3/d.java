package I3;

import H3.q;
import H3.r;
import H3.u;
import K3.s;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.InputStream;

/* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3820a;

    /* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements r<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3821a;

        public a(Context context) {
            this.f3821a = context;
        }

        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new d(this.f3821a);
        }
    }

    public d(Context context) {
        this.f3820a = context.getApplicationContext();
    }

    @Override // H3.q
    public final q.a<InputStream> a(Uri uri, int i10, int i11, A3.d dVar) {
        Long l10;
        Uri uri2 = uri;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384 || (l10 = (Long) dVar.c(s.f4273d)) == null || l10.longValue() != -1) {
            return null;
        }
        W3.b bVar = new W3.b(uri2);
        Context context = this.f3820a;
        return new q.a<>(bVar, new C3.a(uri2, new C3.c(com.bumptech.glide.b.b(context).f24473e.e(), new C3.a.b(context.getContentResolver()), com.bumptech.glide.b.b(context).f24474f, context.getContentResolver())));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return C1787c0.m(uri2) && uri2.getPathSegments().contains("video");
    }
}
