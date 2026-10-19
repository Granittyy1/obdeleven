package H3;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class z<Data> implements q<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f3707b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<i, Data> f3708a;

    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class a implements r<Uri, InputStream> {
        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new z(uVar.a(i.class, InputStream.class));
        }
    }

    public z(q<i, Data> qVar) {
        this.f3708a = qVar;
    }

    @Override // H3.q
    public final q.a a(Uri uri, int i10, int i11, A3.d dVar) {
        return this.f3708a.a(new i(uri.toString()), i10, i11, dVar);
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        return f3707b.contains(uri.getScheme());
    }
}
