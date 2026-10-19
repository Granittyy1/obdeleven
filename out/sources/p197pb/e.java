package p197pb;

import com.braze.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import kotlin.text.Regex;
import kotlin.text.m;
import kotlin.text.n;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.j;
import okhttp3.o;
import okhttp3.p;
import okhttp3.z;
import okio.ByteString;
import p172nb.b;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    static {
        ByteString byteString = ByteString.f45705d;
        ByteString.a.c("\"\\");
        ByteString.a.c("\t ,=");
    }

    public static final boolean a(z zVar) {
        if (i.a(zVar.f45680b.f45662b, "HEAD")) {
            return false;
        }
        int i10 = zVar.f45683e;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && b.k(zVar) == -1 && !"chunked".equalsIgnoreCase(z.c("Transfer-Encoding", zVar))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004c  */
    public static final void b(j jVar, p url, o headers) {
        List listUnmodifiableList;
        String str;
        okhttp3.i iVar;
        i.e(jVar, "<this>");
        i.e(url, "url");
        i.e(headers, "headers");
        if (jVar == j.f45545a) {
            return;
        }
        Pattern pattern = okhttp3.i.j;
        List<String> listA = headers.A("Set-Cookie");
        int size = listA.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            String setCookie = listA.get(i10);
            i.e(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c10 = ';';
            int iG = b.g(setCookie, ';', 0, 0, 6);
            char c11 = '=';
            int iG2 = b.g(setCookie, '=', 0, iG, 2);
            if (iG2 == iG) {
                iVar = null;
                break;
            }
            String strZ = b.z(setCookie, 0, iG2);
            if (strZ.length() == 0 || b.m(strZ) != -1) {
                iVar = null;
                break;
            }
            String strZ2 = b.z(setCookie, iG2 + 1, iG);
            if (b.m(strZ2) != -1) {
                iVar = null;
                break;
            }
            int i11 = iG + 1;
            int length = setCookie.length();
            long j = 253402300799999L;
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            long jB = 253402300799999L;
            long j10 = -1;
            String str2 = null;
            String str3 = null;
            while (true) {
                if (i11 >= length) {
                    if (j10 == Long.MIN_VALUE) {
                        j = Long.MIN_VALUE;
                    } else if (j10 != -1) {
                        long j11 = jCurrentTimeMillis + (j10 <= 9223372036854775L ? j10 * ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS) : Long.MAX_VALUE);
                        if (j11 >= jCurrentTimeMillis && j11 <= 253402300799999L) {
                            j = j11;
                        }
                    } else {
                        j = jB;
                    }
                    String str4 = url.f45574d;
                    String str5 = str2;
                    if (str5 == null) {
                        str5 = str4;
                    } else if (!i.a(str4, str5) && (!m.C(str4, str5, false) || str4.charAt((str4.length() - str5.length()) - 1) != '.' || b.f45031f.e(str4))) {
                        iVar = null;
                        break;
                    }
                    if (str4.length() != str5.length() && PublicSuffixDatabase.f45540g.a(str5) == null) {
                        iVar = null;
                        break;
                    }
                    String strSubstring = "/";
                    String str6 = str3;
                    if (str6 == null || !m.I(str6, "/", false)) {
                        String strB = url.b();
                        int iU = n.U(strB, '/', 0, 6);
                        if (iU != 0) {
                            strSubstring = strB.substring(0, iU);
                            i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        str = strSubstring;
                    } else {
                        str = str6;
                    }
                    iVar = new okhttp3.i(strZ, strZ2, j, str5, str, z11, z12, z13, z10);
                    break;
                }
                int iF = b.f(setCookie, c10, i11, length);
                int iF2 = b.f(setCookie, c11, i11, iF);
                String strZ3 = b.z(setCookie, i11, iF2);
                String strZ4 = iF2 < iF ? b.z(setCookie, iF2 + 1, iF) : "";
                if (strZ3.equalsIgnoreCase("expires")) {
                    try {
                        jB = okhttp3.i.a.b(strZ4.length(), strZ4);
                        z13 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (strZ3.equalsIgnoreCase("max-age")) {
                    try {
                        long j12 = Long.parseLong(strZ4);
                        j10 = j12 > 0 ? j12 : Long.MIN_VALUE;
                    } catch (NumberFormatException e10) {
                        if (!new Regex("-?\\d+").e(strZ4)) {
                            throw e10;
                        }
                        j10 = m.I(strZ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                    }
                    z13 = true;
                } else if (strZ3.equalsIgnoreCase("domain")) {
                    if (m.C(strZ4, ".", false)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String strB2 = O.e.B(n.Z(strZ4, "."));
                    if (strB2 == null) {
                        throw new IllegalArgumentException();
                    }
                    str2 = strB2;
                    z10 = false;
                } else if (strZ3.equalsIgnoreCase("path")) {
                    str3 = strZ4;
                } else if (strZ3.equalsIgnoreCase("secure")) {
                    z11 = true;
                } else if (strZ3.equalsIgnoreCase("httponly")) {
                    z12 = true;
                }
                i11 = iF + 1;
                c10 = ';';
                c11 = '=';
            }
            if (iVar != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            i.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = EmptyList.f42983b;
        }
        listUnmodifiableList.isEmpty();
    }
}
