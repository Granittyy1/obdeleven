package okhttp3;

import io.intercom.android.sdk.api.TaggingSocketFactory;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: OkHttpClient.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements Cloneable, InterfaceC2754e.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final List<Protocol> f45607C = p172nb.b.l(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final List<h> f45608D = p172nb.b.l(h.f45372e, h.f45373f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f45609A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final F3.e f45610B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f45611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p019b6.c f45612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<q> f45613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<q> f45614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m.b f45615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2751b f45617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45618i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f45619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2752c f45620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f45621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProxySelector f45622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2751b f45623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SocketFactory f45624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f45625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X509TrustManager f45626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<h> f45627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<Protocol> f45628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p281wb.d f45629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CertificatePinner f45630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p281wb.c f45631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f45632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f45633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f45634z;

    /* JADX INFO: compiled from: OkHttpClient.kt */
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public F3.e f45635A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f45636a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p019b6.c f45637b = new p019b6.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45638c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f45639d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public m.b f45640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C2751b f45642g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f45643h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f45644i;
        public j j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C2752c f45645k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public l f45646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ProxySelector f45647m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C2751b f45648n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public SocketFactory f45649o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f45650p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public X509TrustManager f45651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List<h> f45652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List<? extends Protocol> f45653s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p281wb.d f45654t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public CertificatePinner f45655u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p281wb.c f45656v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f45657w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f45658x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f45659y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public long f45660z;

        public a() {
            m.a aVar = m.f45561a;
            kotlin.jvm.internal.i.e(aVar, "<this>");
            this.f45640e = new androidx.compose.ui.graphics.colorspace.s(4, aVar);
            this.f45641f = true;
            C2751b c2751b = C2751b.f45310a;
            this.f45642g = c2751b;
            this.f45643h = true;
            this.f45644i = true;
            this.j = j.f45545a;
            this.f45646l = l.f45552a;
            this.f45648n = c2751b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            kotlin.jvm.internal.i.d(socketFactory, "getDefault()");
            this.f45649o = socketFactory;
            this.f45652r = t.f45608D;
            this.f45653s = t.f45607C;
            this.f45654t = p281wb.d.f47837a;
            this.f45655u = CertificatePinner.f45281c;
            this.f45657w = 10000;
            this.f45658x = 10000;
            this.f45659y = 10000;
            this.f45660z = 1024L;
        }

        public final void a(q interceptor) {
            kotlin.jvm.internal.i.e(interceptor, "interceptor");
            this.f45638c.add(interceptor);
        }

        public final void b(TaggingSocketFactory taggingSocketFactory) {
            if (!taggingSocketFactory.equals(this.f45649o)) {
                this.f45635A = null;
            }
            this.f45649o = taggingSocketFactory;
        }
    }

    public t(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f45611b = aVar.f45636a;
        this.f45612c = aVar.f45637b;
        this.f45613d = p172nb.b.x(aVar.f45638c);
        this.f45614e = p172nb.b.x(aVar.f45639d);
        this.f45615f = aVar.f45640e;
        this.f45616g = aVar.f45641f;
        this.f45617h = aVar.f45642g;
        this.f45618i = aVar.f45643h;
        this.j = aVar.f45644i;
        this.f45619k = aVar.j;
        this.f45620l = aVar.f45645k;
        this.f45621m = aVar.f45646l;
        ProxySelector proxySelector = aVar.f45647m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f45622n = proxySelector == null ? p269vb.a.f47672a : proxySelector;
        this.f45623o = aVar.f45648n;
        this.f45624p = aVar.f45649o;
        List<h> list = aVar.f45652r;
        this.f45627s = list;
        this.f45628t = aVar.f45653s;
        this.f45629u = aVar.f45654t;
        this.f45632x = aVar.f45657w;
        this.f45633y = aVar.f45658x;
        this.f45634z = aVar.f45659y;
        this.f45609A = aVar.f45660z;
        F3.e eVar = aVar.f45635A;
        this.f45610B = eVar == null ? new F3.e() : eVar;
        List<h> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f45625q = null;
                    this.f45631w = null;
                    this.f45626r = null;
                    this.f45630v = CertificatePinner.f45281c;
                    break;
                }
                if (((h) it.next()).f45374a) {
                    SSLSocketFactory sSLSocketFactory = aVar.f45650p;
                    if (sSLSocketFactory == null) {
                        p244tb.h hVar = p244tb.h.f47384a;
                        X509TrustManager x509TrustManagerN = p244tb.h.f47384a.n();
                        this.f45626r = x509TrustManagerN;
                        this.f45625q = p244tb.h.f47384a.m(x509TrustManagerN);
                        p281wb.c cVarB = p244tb.h.f47384a.b(x509TrustManagerN);
                        this.f45631w = cVarB;
                        CertificatePinner certificatePinner = aVar.f45655u;
                        certificatePinner.getClass();
                        this.f45630v = kotlin.jvm.internal.i.a(certificatePinner.f45283b, cVarB) ? certificatePinner : new CertificatePinner(certificatePinner.f45282a, cVarB);
                        break;
                    }
                    this.f45625q = sSLSocketFactory;
                    p281wb.c cVar = aVar.f45656v;
                    kotlin.jvm.internal.i.b(cVar);
                    this.f45631w = cVar;
                    X509TrustManager x509TrustManager = aVar.f45651q;
                    kotlin.jvm.internal.i.b(x509TrustManager);
                    this.f45626r = x509TrustManager;
                    CertificatePinner certificatePinner2 = aVar.f45655u;
                    certificatePinner2.getClass();
                    this.f45630v = kotlin.jvm.internal.i.a(certificatePinner2.f45283b, cVar) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f45282a, cVar);
                    break;
                }
            }
        } else {
            this.f45625q = null;
            this.f45631w = null;
            this.f45626r = null;
            this.f45630v = CertificatePinner.f45281c;
            break;
        }
        List<q> list3 = this.f45613d;
        kotlin.jvm.internal.i.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        List<q> list4 = this.f45614e;
        kotlin.jvm.internal.i.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list4.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list4).toString());
        }
        List<h> list5 = this.f45627s;
        boolean z10 = list5 instanceof Collection;
        X509TrustManager x509TrustManager2 = this.f45626r;
        p281wb.c cVar2 = this.f45631w;
        SSLSocketFactory sSLSocketFactory2 = this.f45625q;
        if (!z10 || !list5.isEmpty()) {
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((h) it2.next()).f45374a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (cVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.i.a(this.f45630v, CertificatePinner.f45281c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.InterfaceC2754e.a
    public final okhttp3.internal.connection.e a(u request) {
        kotlin.jvm.internal.i.e(request, "request");
        return new okhttp3.internal.connection.e(this, request, false);
    }

    public final a b() {
        a aVar = new a();
        aVar.f45636a = this.f45611b;
        aVar.f45637b = this.f45612c;
        kotlin.collections.p.z(aVar.f45638c, this.f45613d);
        kotlin.collections.p.z(aVar.f45639d, this.f45614e);
        aVar.f45640e = this.f45615f;
        aVar.f45641f = this.f45616g;
        aVar.f45642g = this.f45617h;
        aVar.f45643h = this.f45618i;
        aVar.f45644i = this.j;
        aVar.j = this.f45619k;
        aVar.f45645k = this.f45620l;
        aVar.f45646l = this.f45621m;
        aVar.f45647m = this.f45622n;
        aVar.f45648n = this.f45623o;
        aVar.f45649o = this.f45624p;
        aVar.f45650p = this.f45625q;
        aVar.f45651q = this.f45626r;
        aVar.f45652r = this.f45627s;
        aVar.f45653s = this.f45628t;
        aVar.f45654t = this.f45629u;
        aVar.f45655u = this.f45630v;
        aVar.f45656v = this.f45631w;
        aVar.f45657w = this.f45632x;
        aVar.f45658x = this.f45633y;
        aVar.f45659y = this.f45634z;
        aVar.f45660z = this.f45609A;
        aVar.f45635A = this.f45610B;
        return aVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public t() {
        this(new a());
    }
}
