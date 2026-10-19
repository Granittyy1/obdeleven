package okhttp3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: okhttp3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Address.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2750a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f45302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f45303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f45304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CertificatePinner f45305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2751b f45306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f45307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f45308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<Protocol> f45309i;
    public final List<h> j;

    public C2750a(String uriHost, int i10, l dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, C2751b proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.i.e(uriHost, "uriHost");
        kotlin.jvm.internal.i.e(dns, "dns");
        kotlin.jvm.internal.i.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.i.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.i.e(protocols, "protocols");
        kotlin.jvm.internal.i.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.i.e(proxySelector, "proxySelector");
        this.f45301a = dns;
        this.f45302b = socketFactory;
        this.f45303c = sSLSocketFactory;
        this.f45304d = hostnameVerifier;
        this.f45305e = certificatePinner;
        this.f45306f = proxyAuthenticator;
        this.f45307g = proxySelector;
        p.a aVar = new p.a();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            aVar.f45580a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            aVar.f45580a = "https";
        }
        String strB = O.e.B(p.b.c(uriHost, 0, 0, false, 7));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        aVar.f45583d = strB;
        if (1 > i10 || i10 >= 65536) {
            throw new IllegalArgumentException(J4.i.b(i10, "unexpected port: ").toString());
        }
        aVar.f45584e = i10;
        this.f45308h = aVar.a();
        this.f45309i = p172nb.b.x(protocols);
        this.j = p172nb.b.x(connectionSpecs);
    }

    public final boolean a(C2750a that) {
        kotlin.jvm.internal.i.e(that, "that");
        return kotlin.jvm.internal.i.a(this.f45301a, that.f45301a) && kotlin.jvm.internal.i.a(this.f45306f, that.f45306f) && kotlin.jvm.internal.i.a(this.f45309i, that.f45309i) && kotlin.jvm.internal.i.a(this.j, that.j) && kotlin.jvm.internal.i.a(this.f45307g, that.f45307g) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f45303c, that.f45303c) && kotlin.jvm.internal.i.a(this.f45304d, that.f45304d) && kotlin.jvm.internal.i.a(this.f45305e, that.f45305e) && this.f45308h.f45575e == that.f45308h.f45575e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2750a) {
            C2750a c2750a = (C2750a) obj;
            if (kotlin.jvm.internal.i.a(this.f45308h, c2750a.f45308h) && a(c2750a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45305e) + ((Objects.hashCode(this.f45304d) + ((Objects.hashCode(this.f45303c) + ((this.f45307g.hashCode() + p005a4.p.d(p005a4.p.d((this.f45306f.hashCode() + ((this.f45301a.hashCode() + B1.a.b(this.f45308h.f45579i, 527, 31)) * 31)) * 31, 31, this.f45309i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        p pVar = this.f45308h;
        sb2.append(pVar.f45574d);
        sb2.append(':');
        sb2.append(pVar.f45575e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.f45307g);
        sb2.append('}');
        return sb2.toString();
    }
}
