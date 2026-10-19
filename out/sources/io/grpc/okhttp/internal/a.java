package io.grpc.okhttp.internal;

import C4.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ConnectionSpec.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37982e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f37984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f37985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37986d;

    static {
        CipherSuite[] cipherSuiteArr = {CipherSuite.f37944o, CipherSuite.f37945p, CipherSuite.f37946q, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.f37943n, CipherSuite.f37942m, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        C0397a c0397a = new C0397a(true);
        c0397a.a(cipherSuiteArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c0397a.b(tlsVersion, tlsVersion2);
        if (!c0397a.f37987a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0397a.f37990d = true;
        a aVar = new a(c0397a);
        f37982e = aVar;
        C0397a c0397a2 = new C0397a(aVar);
        c0397a2.b(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!c0397a2.f37987a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        c0397a2.f37990d = true;
        new a(c0397a2);
        new a(new C0397a(false));
    }

    public a(C0397a c0397a) {
        this.f37983a = c0397a.f37987a;
        this.f37984b = c0397a.f37988b;
        this.f37985c = c0397a.f37989c;
        this.f37986d = c0397a.f37990d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        boolean z10 = aVar.f37983a;
        boolean z11 = this.f37983a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f37984b, aVar.f37984b) && Arrays.equals(this.f37985c, aVar.f37985c) && this.f37986d == aVar.f37986d);
    }

    public final int hashCode() {
        if (this.f37983a) {
            return ((((527 + Arrays.hashCode(this.f37984b)) * 31) + Arrays.hashCode(this.f37985c)) * 31) + (!this.f37986d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        TlsVersion tlsVersion;
        if (!this.f37983a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f37984b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            CipherSuite[] cipherSuiteArr = new CipherSuite[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                cipherSuiteArr[i10] = str.startsWith("SSL_") ? CipherSuite.valueOf("TLS_" + str.substring(4)) : CipherSuite.valueOf(str);
            }
            String[] strArr2 = j.f38020a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) cipherSuiteArr.clone()));
        }
        StringBuilder sbA = C7.g.a("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f37985c;
        TlsVersion[] tlsVersionArr = new TlsVersion[strArr3.length];
        for (int i11 = 0; i11 < strArr3.length; i11++) {
            String str2 = strArr3[i11];
            if ("TLSv1.3".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                tlsVersion = TlsVersion.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(B7.b.c("Unexpected TLS version: ", str2));
                }
                tlsVersion = TlsVersion.SSL_3_0;
            }
            tlsVersionArr[i11] = tlsVersion;
        }
        String[] strArr4 = j.f38020a;
        sbA.append(Collections.unmodifiableList(Arrays.asList((Object[]) tlsVersionArr.clone())));
        sbA.append(", supportsTlsExtensions=");
        return v.f(sbA, this.f37986d, ")");
    }

    /* JADX INFO: renamed from: io.grpc.okhttp.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConnectionSpec.java */
    public static final class C0397a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f37988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f37989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37990d;

        public C0397a(boolean z10) {
            this.f37987a = z10;
        }

        public final void a(CipherSuite... cipherSuiteArr) {
            if (!this.f37987a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[cipherSuiteArr.length];
            for (int i10 = 0; i10 < cipherSuiteArr.length; i10++) {
                strArr[i10] = cipherSuiteArr[i10].javaName;
            }
            this.f37988b = strArr;
        }

        public final void b(TlsVersion... tlsVersionArr) {
            if (!this.f37987a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (tlsVersionArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i10 = 0; i10 < tlsVersionArr.length; i10++) {
                strArr[i10] = tlsVersionArr[i10].javaName;
            }
            this.f37989c = strArr;
        }

        public C0397a(a aVar) {
            this.f37987a = aVar.f37983a;
            this.f37988b = aVar.f37984b;
            this.f37989c = aVar.f37985c;
            this.f37990d = aVar.f37986d;
        }
    }
}
