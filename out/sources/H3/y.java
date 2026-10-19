package H3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class y<Data> implements q<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f3702b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3703a;

    /* JADX INFO: compiled from: UriLoader.java */
    public static final class a implements r<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3704a;

        public a(ContentResolver contentResolver) {
            this.f3704a = contentResolver;
        }

        @Override // H3.r
        public final q<Uri, AssetFileDescriptor> a(u uVar) {
            return new y(this);
        }

        @Override // H3.y.c
        public final B3.d<AssetFileDescriptor> b(Uri uri) {
            return new B3.a(this.f3704a, uri);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class b implements r<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3705a;

        public b(ContentResolver contentResolver) {
            this.f3705a = contentResolver;
        }

        @Override // H3.r
        public final q<Uri, ParcelFileDescriptor> a(u uVar) {
            return new y(this);
        }

        @Override // H3.y.c
        public final B3.d<ParcelFileDescriptor> b(Uri uri) {
            return new B3.i(this.f3705a, uri);
        }
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public interface c<Data> {
        B3.d<Data> b(Uri uri);
    }

    /* JADX INFO: compiled from: UriLoader.java */
    public static class d implements r<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f3706a;

        public d(ContentResolver contentResolver) {
            this.f3706a = contentResolver;
        }

        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new y(this);
        }

        @Override // H3.y.c
        public final B3.d<InputStream> b(Uri uri) {
            return new B3.o(this.f3706a, uri);
        }
    }

    public y(c<Data> cVar) {
        this.f3703a = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [H3.y$c, java.lang.Object] */
    @Override // H3.q
    public final q.a a(Uri uri, int i10, int i11, A3.d dVar) {
        Uri uri2 = uri;
        return new q.a(new W3.b(uri2), this.f3703a.b(uri2));
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        return f3702b.contains(uri.getScheme());
    }
}
