package I3;

import H3.i;
import H3.q;
import H3.r;
import H3.u;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements q<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<i, InputStream> f3838a;

    /* JADX INFO: compiled from: UrlLoader.java */
    public static class a implements r<URL, InputStream> {
        @Override // H3.r
        public final q<URL, InputStream> a(u uVar) {
            return new h(uVar.a(i.class, InputStream.class));
        }
    }

    public h(q<i, InputStream> qVar) {
        this.f3838a = qVar;
    }

    @Override // H3.q
    public final q.a<InputStream> a(URL url, int i10, int i11, A3.d dVar) {
        return this.f3838a.a(new i(url), i10, i11, dVar);
    }

    @Override // H3.q
    public final /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
