package okhttp3;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: CipherSuite.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f45353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f45354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f45355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f45356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f45357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f45358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f45359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f45360i;
    public static final g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f45361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g f45362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f45363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f45364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f45365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f45366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f45367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f45368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f45369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f45370t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45371a;

    /* JADX INFO: compiled from: CipherSuite.kt */
    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a10 = str;
            String b10 = str2;
            kotlin.jvm.internal.i.e(a10, "a");
            kotlin.jvm.internal.i.e(b10, "b");
            int iMin = Math.min(a10.length(), b10.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = a10.charAt(i10);
                char cCharAt2 = b10.charAt(i10);
                if (cCharAt != cCharAt2) {
                    if (kotlin.jvm.internal.i.g(cCharAt, cCharAt2) >= 0) {
                        return 1;
                    }
                    return -1;
                }
            }
            int length = a10.length();
            int length2 = b10.length();
            if (length == length2) {
                return 0;
            }
            if (length >= length2) {
                return 1;
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: CipherSuite.kt */
    public static final class b {
        public static final g a(b bVar, String str) {
            g gVar = new g(str);
            g.f45355d.put(str, gVar);
            return gVar;
        }

        public final synchronized g b(String javaName) {
            g gVar;
            String strConcat;
            try {
                kotlin.jvm.internal.i.e(javaName, "javaName");
                LinkedHashMap linkedHashMap = g.f45355d;
                gVar = (g) linkedHashMap.get(javaName);
                if (gVar == null) {
                    if (kotlin.text.m.I(javaName, "TLS_", false)) {
                        String strSubstring = javaName.substring(4);
                        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                        strConcat = "SSL_".concat(strSubstring);
                    } else if (kotlin.text.m.I(javaName, "SSL_", false)) {
                        String strSubstring2 = javaName.substring(4);
                        kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        strConcat = "TLS_".concat(strSubstring2);
                    } else {
                        strConcat = javaName;
                    }
                    gVar = (g) linkedHashMap.get(strConcat);
                    if (gVar == null) {
                        gVar = new g(javaName);
                    }
                    linkedHashMap.put(javaName, gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return gVar;
        }
    }

    static {
        b bVar = new b();
        f45353b = bVar;
        f45354c = new a();
        f45355d = new LinkedHashMap();
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f45356e = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f45357f = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f45358g = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f45359h = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f45360i = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b.a(bVar, "TLS_FALLBACK_SCSV");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f45361k = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f45362l = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f45363m = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f45364n = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f45365o = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f45366p = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f45367q = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f45368r = b.a(bVar, "TLS_AES_128_GCM_SHA256");
        f45369s = b.a(bVar, "TLS_AES_256_GCM_SHA384");
        f45370t = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_SHA256");
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public g(String str) {
        this.f45371a = str;
    }

    public final String toString() {
        return this.f45371a;
    }
}
