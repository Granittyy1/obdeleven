package H3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<Data> implements q<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3629b;

    /* JADX INFO: renamed from: H3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface InterfaceC0043a<Data> {
        B3.d<Data> b(AssetManager assetManager, String str);
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class b implements r<Uri, ParcelFileDescriptor>, InterfaceC0043a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f3630a;

        public b(AssetManager assetManager) {
            this.f3630a = assetManager;
        }

        @Override // H3.r
        public final q<Uri, ParcelFileDescriptor> a(u uVar) {
            return new a(this.f3630a, this);
        }

        @Override // H3.a.InterfaceC0043a
        public final B3.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new B3.h(assetManager, str);
        }
    }

    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class c implements r<Uri, InputStream>, InterfaceC0043a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f3631a;

        public c(AssetManager assetManager) {
            this.f3631a = assetManager;
        }

        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new a(this.f3631a, this);
        }

        @Override // H3.a.InterfaceC0043a
        public final B3.d<InputStream> b(AssetManager assetManager, String str) {
            return new B3.n(assetManager, str);
        }
    }

    public a(AssetManager assetManager, InterfaceC0043a<Data> interfaceC0043a) {
        this.f3628a = assetManager;
        this.f3629b = interfaceC0043a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [H3.a$a, java.lang.Object] */
    @Override // H3.q
    public final q.a a(Uri uri, int i10, int i11, A3.d dVar) {
        Uri uri2 = uri;
        return new q.a(new W3.b(uri2), this.f3629b.b(this.f3628a, uri2.toString().substring(22)));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
