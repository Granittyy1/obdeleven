package io.ktor.http;

import com.braze.Constants;
import com.google.android.gms.internal.measurement.M1;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: URLParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f40525a = M1.k("");

    public static final int a(String str, int i10, int i11) {
        boolean z10 = false;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '[') {
                z10 = true;
            } else if (cCharAt == ']') {
                z10 = false;
            } else if (cCharAt == ':' && !z10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void b(x xVar, String urlString) {
        kotlin.jvm.internal.i.e(xVar, "<this>");
        kotlin.jvm.internal.i.e(urlString, "urlString");
        if (kotlin.text.n.S(urlString)) {
            return;
        }
        try {
            c(xVar, urlString);
        } catch (Throwable th) {
            throw new URLParserException("Fail to parse url: ".concat(urlString), th);
        }
    }

    public static final void c(final x xVar, String urlString) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        io.ktor.util.k uVar;
        int i16;
        int i17;
        List<String> listF0;
        int iIntValue;
        kotlin.jvm.internal.i.e(xVar, "<this>");
        kotlin.jvm.internal.i.e(urlString, "urlString");
        int length = urlString.length();
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                i18 = -1;
                break;
            } else if (!O.h.j(urlString.charAt(i18))) {
                break;
            } else {
                i18++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i19 = length2 - 1;
            if (!O.h.j(urlString.charAt(length2))) {
                break;
            }
            if (i19 < 0) {
                length2 = -1;
                break;
            }
            length2 = i19;
        }
        int i20 = length2 + 1;
        char cCharAt = urlString.charAt(i18);
        char c10 = 'A';
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i10 = i18;
            i11 = i10;
        } else {
            i11 = -1;
            i10 = i18;
        }
        while (true) {
            if (i10 < i20) {
                char cCharAt2 = urlString.charAt(i10);
                if (cCharAt2 == ':') {
                    if (i11 != -1) {
                        throw new IllegalArgumentException(J4.i.b(i11, "Illegal character in scheme at position "));
                    }
                    i12 = i10 - i18;
                    break;
                } else if (cCharAt2 != '/' && cCharAt2 != '?' && cCharAt2 != '#') {
                    if (i11 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                        i11 = i10;
                    }
                    i10++;
                }
            }
            i12 = -1;
            break;
        }
        if (i12 > 0) {
            String strSubstring = urlString.substring(i18, i18 + i12);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            A a10 = A.f40443c;
            int length3 = strSubstring.length();
            int i21 = 0;
            while (true) {
                if (i21 >= length3) {
                    i21 = -1;
                    break;
                }
                char cCharAt3 = strSubstring.charAt(i21);
                if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ' ')) != cCharAt3) {
                    break;
                } else {
                    i21++;
                }
            }
            if (i21 != -1) {
                StringBuilder sb2 = new StringBuilder(strSubstring.length());
                sb2.append((CharSequence) strSubstring, 0, i21);
                int iN = kotlin.text.n.N(strSubstring);
                if (i21 <= iN) {
                    while (true) {
                        char cCharAt4 = strSubstring.charAt(i21);
                        if (c10 <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ' ');
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb2.append(cCharAt4);
                        if (i21 == iN) {
                            break;
                        }
                        i21++;
                        c10 = 'A';
                    }
                }
                strSubstring = sb2.toString();
                kotlin.jvm.internal.i.d(strSubstring, "StringBuilder(capacity).…builderAction).toString()");
            }
            A a11 = (A) A.f40444d.get(strSubstring);
            if (a11 == null) {
                a11 = new A(strSubstring, 0);
            }
            xVar.f40516a = a11;
            i13 = 1;
            i18 += i12 + 1;
        } else {
            i13 = 1;
        }
        int i22 = 0;
        while (true) {
            i14 = i18 + i22;
            if (i14 >= i20 || urlString.charAt(i14) != '/') {
                break;
            } else {
                i22 += i13;
            }
        }
        if (xVar.f40516a.f40445a.equals("file")) {
            if (i22 != 2) {
                if (i22 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                xVar.f40517b = "";
                String strSubstring2 = urlString.substring(i14, i20);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                y.d(xVar, "/".concat(strSubstring2));
                return;
            }
            int iP = kotlin.text.n.P(urlString, '/', i14, false, 4);
            if (iP == -1 || iP == i20) {
                String strSubstring3 = urlString.substring(i14, i20);
                kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                xVar.f40517b = strSubstring3;
                return;
            } else {
                String strSubstring4 = urlString.substring(i14, iP);
                kotlin.jvm.internal.i.d(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                xVar.f40517b = strSubstring4;
                String strSubstring5 = urlString.substring(iP, i20);
                kotlin.jvm.internal.i.d(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
                y.d(xVar, strSubstring5);
                return;
            }
        }
        if (xVar.f40516a.f40445a.equals("mailto")) {
            if (i22 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iQ = kotlin.text.n.Q(urlString, "@", i14, false, 4);
            if (iQ == -1) {
                throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring6 = urlString.substring(i14, iQ);
            kotlin.jvm.internal.i.d(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
            String strD = CodecsKt.d(strSubstring6);
            xVar.f40520e = strD != null ? CodecsKt.f(strD, false) : null;
            String strSubstring7 = urlString.substring(iQ + 1, i20);
            kotlin.jvm.internal.i.d(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
            xVar.f40517b = strSubstring7;
            return;
        }
        if (i22 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i23 = 0;
                for (int i24 = 5; i23 < i24; i24 = 5) {
                    cArr[i23] = "@/\\?#".charAt(i23);
                    i23++;
                }
                int iR = kotlin.text.n.R(urlString, cArr, i14, false);
                Integer numValueOf = Integer.valueOf(iR);
                if (iR <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i20;
                if (iIntValue >= i20 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iA = a(urlString, i14, iIntValue);
                if (iA != -1) {
                    String strSubstring8 = urlString.substring(i14, iA);
                    kotlin.jvm.internal.i.d(strSubstring8, "this as java.lang.String…ing(startIndex, endIndex)");
                    xVar.f40520e = strSubstring8;
                    String strSubstring9 = urlString.substring(iA + 1, iIntValue);
                    kotlin.jvm.internal.i.d(strSubstring9, "this as java.lang.String…ing(startIndex, endIndex)");
                    xVar.f40521f = strSubstring9;
                } else {
                    String strSubstring10 = urlString.substring(i14, iIntValue);
                    kotlin.jvm.internal.i.d(strSubstring10, "this as java.lang.String…ing(startIndex, endIndex)");
                    xVar.f40520e = strSubstring10;
                }
                i14 = iIntValue + 1;
            }
            int iA2 = a(urlString, i14, iIntValue);
            Integer numValueOf2 = Integer.valueOf(iA2);
            if (iA2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring11 = urlString.substring(i14, iIntValue2);
            kotlin.jvm.internal.i.d(strSubstring11, "this as java.lang.String…ing(startIndex, endIndex)");
            xVar.f40517b = strSubstring11;
            int i25 = iIntValue2 + 1;
            if (i25 < iIntValue) {
                String strSubstring12 = urlString.substring(i25, iIntValue);
                kotlin.jvm.internal.i.d(strSubstring12, "this as java.lang.String…ing(startIndex, endIndex)");
                xVar.f40518c = Integer.parseInt(strSubstring12);
            } else {
                xVar.f40518c = 0;
            }
            i14 = iIntValue;
        }
        List<String> list = f40525a;
        if (i14 >= i20) {
            if (urlString.charAt(length2) != '/') {
                list = EmptyList.f42983b;
            }
            kotlin.jvm.internal.i.e(list, "<set-?>");
            xVar.f40523h = list;
            return;
        }
        List<String> listL = i22 == 0 ? kotlin.collections.q.L(xVar.f40523h) : EmptyList.f42983b;
        kotlin.jvm.internal.i.e(listL, "<set-?>");
        xVar.f40523h = listL;
        char[] cArr2 = new char[2];
        for (int i26 = 0; i26 < 2; i26++) {
            cArr2[i26] = "?#".charAt(i26);
        }
        int iR2 = kotlin.text.n.R(urlString, cArr2, i14, false);
        Integer numValueOf3 = Integer.valueOf(iR2);
        if (iR2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i20;
        if (iIntValue3 > i14) {
            String strSubstring13 = urlString.substring(i14, iIntValue3);
            kotlin.jvm.internal.i.d(strSubstring13, "this as java.lang.String…ing(startIndex, endIndex)");
            Collection collection = (xVar.f40523h.size() == 1 && ((CharSequence) kotlin.collections.q.O(xVar.f40523h)).length() == 0) ? EmptyList.f42983b : xVar.f40523h;
            if (strSubstring13.equals("/")) {
                listF0 = list;
                i17 = 1;
            } else {
                i17 = 1;
                listF0 = kotlin.text.n.f0(strSubstring13, new char[]{'/'});
            }
            if (i22 != i17) {
                list = EmptyList.f42983b;
            }
            xVar.f40523h = kotlin.collections.q.c0(collection, kotlin.collections.q.c0(list, listF0));
            i14 = iIntValue3;
        }
        if (i14 < i20 && urlString.charAt(i14) == '?') {
            int i27 = i14 + 1;
            if (i27 == i20) {
                xVar.f40519d = true;
                i14 = i20;
            } else {
                int i28 = 0;
                int iP2 = kotlin.text.n.P(urlString, '#', i27, false, 4);
                Integer numValueOf4 = iP2 > 0 ? Integer.valueOf(iP2) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i20;
                String strSubstring14 = urlString.substring(i27, iIntValue4);
                kotlin.jvm.internal.i.d(strSubstring14, "this as java.lang.String…ing(startIndex, endIndex)");
                if (kotlin.text.n.N(strSubstring14) < 0) {
                    r.f40513b.getClass();
                    uVar = C2478c.f40473c;
                } else {
                    r.a aVar = r.f40513b;
                    t tVarA = v.a();
                    int iN2 = kotlin.text.n.N(strSubstring14);
                    int i29 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                    int i30 = -1;
                    int i31 = 0;
                    if (iN2 >= 0) {
                        int i32 = 0;
                        while (true) {
                            if (i28 != i29) {
                                char cCharAt5 = strSubstring14.charAt(i32);
                                if (cCharAt5 == '&') {
                                    w.a(tVarA, strSubstring14, i31, i30, i32, false);
                                    i16 = i32;
                                    i28++;
                                    i30 = -1;
                                    i31 = i16 + 1;
                                } else {
                                    i16 = i32;
                                    if (cCharAt5 == '=' && i30 == -1) {
                                        i30 = i16;
                                    }
                                }
                                if (i16 != iN2) {
                                    i32 = i16 + 1;
                                    i29 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                                } else {
                                    i15 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                                }
                            }
                            Map<String, List<String>> values = tVarA.f40530a;
                            kotlin.jvm.internal.i.e(values, "values");
                            uVar = new u(values);
                        }
                    } else {
                        i15 = 1000;
                    }
                    if (i28 != i15) {
                        w.a(tVarA, strSubstring14, i31, i30, strSubstring14.length(), false);
                    }
                    Map<String, List<String>> values2 = tVarA.f40530a;
                    kotlin.jvm.internal.i.e(values2, "values");
                    uVar = new u(values2);
                }
                uVar.c(new Ia.p<String, List<? extends String>, p293xa.r>() { // from class: io.ktor.http.URLParserKt$parseQuery$1
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(String str, List<? extends String> list2) {
                        String key = str;
                        List<? extends String> values3 = list2;
                        kotlin.jvm.internal.i.e(key, "key");
                        kotlin.jvm.internal.i.e(values3, "values");
                        xVar.f40524i.b(key, values3);
                        return p293xa.r.f47939a;
                    }
                });
                i14 = iIntValue4;
            }
        }
        if (i14 >= i20 || urlString.charAt(i14) != '#') {
            return;
        }
        String strSubstring15 = urlString.substring(i14 + 1, i20);
        kotlin.jvm.internal.i.d(strSubstring15, "this as java.lang.String…ing(startIndex, endIndex)");
        xVar.f40522g = strSubstring15;
    }
}
