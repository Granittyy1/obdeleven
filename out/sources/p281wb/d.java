package p281wb;

import A8.f;
import J4.n;
import O.e;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import p172nb.b;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f47837a = new d();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.f42983b;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.f42983b;
        }
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(J4.i.c(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbE = f.e(length2, "endIndex > string.length: ", " > ");
            sbE.append(str.length());
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        long j = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i11 = i12;
                    } else {
                        j += (long) 4;
                        i11 += 2;
                    }
                }
                j += (long) i10;
            }
            i11++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    public static boolean c(String host, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        i.e(host, "host");
        byte[] bArr = b.f45026a;
        if (b.f45031f.e(host)) {
            String strB = e.B(host);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (i.a(strB, e.B((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(host)) {
                Locale locale = Locale.US;
                host = n.d(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                for (String strD : listA2) {
                    if (host.length() == 0 || m.I(host, ".", false) || m.C(host, "..", false) || strD == null || strD.length() == 0 || m.I(strD, ".", false) || m.C(strD, "..", false)) {
                        zA = false;
                    } else {
                        String strConcat = !m.C(host, ".", false) ? host.concat(".") : host;
                        if (!m.C(strD, ".", false)) {
                            strD = strD.concat(".");
                        }
                        if (b(strD)) {
                            Locale locale2 = Locale.US;
                            strD = n.d(locale2, "US", strD, locale2, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!kotlin.text.n.J(strD, "*", false)) {
                            zA = i.a(strConcat, strD);
                        } else if (!m.I(strD, "*.", false) || kotlin.text.n.P(strD, '*', 1, false, 4) != -1 || strConcat.length() < strD.length() || "*.".equals(strD)) {
                            zA = false;
                        } else {
                            String strSubstring = strD.substring(1);
                            i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (m.C(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || kotlin.text.n.U(strConcat, '.', length - 1, 4) == -1)) {
                                zA = true;
                            } else {
                                zA = false;
                            }
                        }
                    }
                    if (zA) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        i.e(host, "host");
        i.e(session, "session");
        if (!b(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return c(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
