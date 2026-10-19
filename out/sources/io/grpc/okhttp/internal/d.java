package io.grpc.okhttp.internal;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: OkHostnameVerifier.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f38000a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f38001b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        String str3;
        char[] cArr;
        char c10;
        int i10;
        char c11;
        if (f38001b.matcher(str).matches()) {
            List<String> listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (str.equalsIgnoreCase(listA.get(i11))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i12 = 2;
        List<String> listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i13 = 0;
        boolean z10 = false;
        while (i13 < size2) {
            if (c(lowerCase, listA2.get(i13))) {
                return true;
            }
            i13++;
            z10 = true;
        }
        if (!z10) {
            b bVar = new b(x509Certificate.getSubjectX500Principal());
            bVar.f37993c = 0;
            bVar.f37994d = 0;
            bVar.f37995e = 0;
            bVar.f37996f = 0;
            String str4 = bVar.f37991a;
            bVar.f37997g = str4.toCharArray();
            String strC = bVar.c();
            if (strC == null) {
                str3 = null;
            } else {
                while (true) {
                    int i14 = bVar.f37993c;
                    int i15 = bVar.f37992b;
                    if (i14 == i15) {
                        break;
                    }
                    char c12 = bVar.f37997g[i14];
                    char c13 = '\\';
                    if (c12 == '\"') {
                        int i16 = i14 + 1;
                        bVar.f37993c = i16;
                        bVar.f37994d = i16;
                        bVar.f37995e = i16;
                        while (true) {
                            int i17 = bVar.f37993c;
                            if (i17 == i15) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                            }
                            char[] cArr2 = bVar.f37997g;
                            char c14 = cArr2[i17];
                            if (c14 == '\"') {
                                bVar.f37993c = i17 + 1;
                                while (true) {
                                    int i18 = bVar.f37993c;
                                    if (i18 >= i15 || bVar.f37997g[i18] != ' ') {
                                        break;
                                    }
                                    bVar.f37993c = i18 + 1;
                                }
                                char[] cArr3 = bVar.f37997g;
                                int i19 = bVar.f37994d;
                                str2 = new String(cArr3, i19, bVar.f37995e - i19);
                                break;
                            }
                            if (c14 == '\\') {
                                cArr2[bVar.f37995e] = bVar.b();
                            } else {
                                cArr2[bVar.f37995e] = c14;
                            }
                            bVar.f37993c++;
                            bVar.f37995e++;
                            i12 = 2;
                        }
                    } else if (c12 == '#') {
                        if (i14 + 4 >= i15) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                        }
                        bVar.f37994d = i14;
                        bVar.f37993c = i14 + 1;
                        while (true) {
                            int i20 = bVar.f37993c;
                            if (i20 == i15 || (c10 = (cArr = bVar.f37997g)[i20]) == '+' || c10 == ',' || c10 == ';') {
                                bVar.f37995e = i20;
                                break;
                            }
                            if (c10 == ' ') {
                                bVar.f37995e = i20;
                                bVar.f37993c = i20 + 1;
                                while (true) {
                                    int i21 = bVar.f37993c;
                                    if (i21 >= i15 || bVar.f37997g[i21] != ' ') {
                                        break;
                                    }
                                    bVar.f37993c = i21 + 1;
                                }
                            } else {
                                if (c10 >= 'A' && c10 <= 'F') {
                                    cArr[i20] = (char) (c10 + ' ');
                                }
                                bVar.f37993c = i20 + 1;
                            }
                        }
                        int i22 = bVar.f37995e;
                        int i23 = bVar.f37994d;
                        int i24 = i22 - i23;
                        if (i24 < 5 || (i24 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                        }
                        int i25 = i24 / 2;
                        byte[] bArr = new byte[i25];
                        int i26 = i23 + 1;
                        for (int i27 = 0; i27 < i25; i27++) {
                            bArr[i27] = (byte) bVar.a(i26);
                            i26 += i12;
                        }
                        str2 = new String(bVar.f37997g, bVar.f37994d, i24);
                    } else if (c12 == '+' || c12 == ',' || c12 == ';') {
                        str2 = "";
                    } else {
                        bVar.f37994d = i14;
                        bVar.f37995e = i14;
                        while (true) {
                            int i28 = bVar.f37993c;
                            if (i28 >= i15) {
                                char[] cArr4 = bVar.f37997g;
                                int i29 = bVar.f37994d;
                                str2 = new String(cArr4, i29, bVar.f37995e - i29);
                                break;
                            }
                            char[] cArr5 = bVar.f37997g;
                            char c15 = cArr5[i28];
                            if (c15 != ' ') {
                                if (c15 != ';') {
                                    if (c15 == c13) {
                                        int i30 = bVar.f37995e;
                                        bVar.f37995e = i30 + 1;
                                        cArr5[i30] = bVar.b();
                                        bVar.f37993c++;
                                    } else if (c15 != '+' && c15 != ',') {
                                        int i31 = bVar.f37995e;
                                        bVar.f37995e = i31 + 1;
                                        cArr5[i31] = c15;
                                        bVar.f37993c = i28 + 1;
                                    }
                                    c13 = '\\';
                                }
                                int i32 = bVar.f37994d;
                                str2 = new String(cArr5, i32, bVar.f37995e - i32);
                                break;
                            }
                            int i33 = bVar.f37995e;
                            bVar.f37996f = i33;
                            bVar.f37993c = i28 + 1;
                            bVar.f37995e = i33 + 1;
                            cArr5[i33] = ' ';
                            while (true) {
                                i10 = bVar.f37993c;
                                if (i10 >= i15) {
                                    break;
                                }
                                char[] cArr6 = bVar.f37997g;
                                if (cArr6[i10] != ' ') {
                                    break;
                                }
                                int i34 = bVar.f37995e;
                                bVar.f37995e = i34 + 1;
                                cArr6[i34] = ' ';
                                bVar.f37993c = i10 + 1;
                            }
                            if (i10 == i15 || (c11 = bVar.f37997g[i10]) == ',' || c11 == '+' || c11 == ';') {
                                char[] cArr7 = bVar.f37997g;
                                int i35 = bVar.f37994d;
                                str2 = new String(cArr7, i35, bVar.f37996f - i35);
                                break;
                            }
                            c13 = '\\';
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str3 = str2;
                    } else {
                        int i36 = bVar.f37993c;
                        if (i36 >= i15) {
                            break;
                        }
                        char c16 = bVar.f37997g[i36];
                        if (c16 != ',' && c16 != ';' && c16 != '+') {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                        bVar.f37993c = i36 + 1;
                        strC = bVar.c();
                        if (strC == null) {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                    }
                }
                str3 = null;
            }
            if (str3 != null) {
                return c(lowerCase, str3);
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
