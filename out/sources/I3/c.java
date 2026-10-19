package I3;

import H3.q;
import H3.r;
import H3.u;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.InputStream;

/* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3818a;

    /* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements r<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f3819a;

        public a(Context context) {
            this.f3819a = context;
        }

        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new c(this.f3819a);
        }
    }

    public c(Context context) {
        this.f3818a = context.getApplicationContext();
    }

    @Override // H3.q
    public final q.a<InputStream> a(Uri uri, int i10, int i11, A3.d dVar) {
        Uri uri2 = uri;
        if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
            return null;
        }
        W3.b bVar = new W3.b(uri2);
        Context context = this.f3818a;
        return new q.a<>(bVar, new C3.a(uri2, new C3.c(com.bumptech.glide.b.b(context).f24473e.e(), new C3.a.C0022a(context.getContentResolver()), com.bumptech.glide.b.b(context).f24474f, context.getContentResolver())));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return C1787c0.m(uri2) && !uri2.getPathSegments().contains("video");
    }
}
