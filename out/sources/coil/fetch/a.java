package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.A;
import coil.decode.C1554a;
import coil.decode.DataSource;
import kotlin.collections.q;
import p318zb.v;

/* JADX INFO: compiled from: AssetUriFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22974b;

    /* JADX INFO: renamed from: coil.fetch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetUriFetcher.kt */
    public static final class C0241a implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            Uri uri = (Uri) obj;
            if (coil.util.k.d(uri)) {
                return new a(uri, kVar);
            }
            return null;
        }
    }

    public a(Uri uri, coil.request.k kVar) {
        this.f22973a = uri;
        this.f22974b = kVar;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) {
        String strU = q.U(q.K(this.f22973a.getPathSegments(), 1), "/", null, null, null, 62);
        coil.request.k kVar = this.f22974b;
        return new l(new A(v.b(v.g(kVar.f23098a.getAssets().open(strU))), new androidx.navigation.compose.v(kVar.f23098a, 1), new C1554a(strU)), coil.util.k.b(MimeTypeMap.getSingleton(), strU), DataSource.f22859d);
    }
}
