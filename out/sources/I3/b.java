package I3;

import H3.i;
import H3.q;
import H3.r;
import H3.u;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: HttpUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q<Uri, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f3816b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<i, InputStream> f3817a;

    /* JADX INFO: compiled from: HttpUriLoader.java */
    public static class a implements r<Uri, InputStream> {
        @Override // H3.r
        public final q<Uri, InputStream> a(u uVar) {
            return new b(uVar.a(i.class, InputStream.class));
        }
    }

    public b(q<i, InputStream> qVar) {
        this.f3817a = qVar;
    }

    @Override // H3.q
    public final q.a<InputStream> a(Uri uri, int i10, int i11, A3.d dVar) {
        return this.f3817a.a(new i(uri.toString()), i10, i11, dVar);
    }

    @Override // H3.q
    public final boolean b(Uri uri) {
        return f3816b.contains(uri.getScheme());
    }
}
