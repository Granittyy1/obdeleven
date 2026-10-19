package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f45372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f45373f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f45376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f45377d;

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45378a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f45379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f45380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45381d;

        public final h a() {
            return new h(this.f45378a, this.f45381d, this.f45379b, this.f45380c);
        }

        public final void b(String... cipherSuites) {
            kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
            if (!this.f45378a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f45379b = (String[]) cipherSuites.clone();
        }

        public final void c(g... cipherSuites) {
            kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
            if (!this.f45378a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (g gVar : cipherSuites) {
                arrayList.add(gVar.f45371a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
            if (!this.f45378a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f45380c = (String[]) tlsVersions.clone();
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f45378a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.a());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    static {
        g gVar = g.f45368r;
        g gVar2 = g.f45369s;
        g gVar3 = g.f45370t;
        g gVar4 = g.f45362l;
        g gVar5 = g.f45364n;
        g gVar6 = g.f45363m;
        g gVar7 = g.f45365o;
        g gVar8 = g.f45367q;
        g gVar9 = g.f45366p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.j, g.f45361k, g.f45359h, g.f45360i, g.f45357f, g.f45358g, g.f45356e};
        a aVar = new a();
        aVar.c((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.e(tlsVersion, tlsVersion2);
        if (!aVar.f45378a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar.f45381d = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.c((g[]) Arrays.copyOf(gVarArr, 16));
        aVar2.e(tlsVersion, tlsVersion2);
        if (!aVar2.f45378a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar2.f45381d = true;
        f45372e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((g[]) Arrays.copyOf(gVarArr, 16));
        aVar3.e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!aVar3.f45378a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        aVar3.f45381d = true;
        aVar3.a();
        f45373f = new h(false, false, null, null);
    }

    public h(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f45374a = z10;
        this.f45375b = z11;
        this.f45376c = strArr;
        this.f45377d = strArr2;
    }

    public final List<g> a() {
        String[] strArr = this.f45376c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(g.f45353b.b(str));
        }
        return kotlin.collections.q.o0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f45374a) {
            return false;
        }
        String[] strArr = this.f45377d;
        if (strArr != null && !p172nb.b.j(strArr, sSLSocket.getEnabledProtocols(), p317za.b.f49025b)) {
            return false;
        }
        String[] strArr2 = this.f45376c;
        return strArr2 == null || p172nb.b.j(strArr2, sSLSocket.getEnabledCipherSuites(), g.f45354c);
    }

    public final List<TlsVersion> c() {
        String[] strArr = this.f45377d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.a.a(str));
        }
        return kotlin.collections.q.o0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z10 = hVar.f45374a;
        boolean z11 = this.f45374a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f45376c, hVar.f45376c) && Arrays.equals(this.f45377d, hVar.f45377d) && this.f45375b == hVar.f45375b);
    }

    public final int hashCode() {
        if (!this.f45374a) {
            return 17;
        }
        String[] strArr = this.f45376c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f45377d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f45375b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f45374a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb2.append(Objects.toString(a(), "[all enabled]"));
        sb2.append(", tlsVersions=");
        sb2.append(Objects.toString(c(), "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        return Z3.o.d(sb2, this.f45375b, ')');
    }
}
