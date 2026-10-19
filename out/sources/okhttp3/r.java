package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f45588d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f45589e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f45592c;

    /* JADX INFO: compiled from: MediaType.kt */
    public static final class a {
        public static r a(String str) {
            kotlin.jvm.internal.i.e(str, "<this>");
            Matcher matcher = r.f45588d.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(p005a4.o.c('\"', "No subtype found for: \"", str).toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.i.d(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            String strD = J4.n.d(locale, "US", strGroup, locale, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.i.d(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.i.d(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = r.f45589e.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(B7.b.g(sb2, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (kotlin.text.m.I(strGroup4, "'", false) && kotlin.text.m.C(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.i.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new r(str, strD, (String[]) arrayList.toArray(new String[0]));
        }

        public static r b(String str) {
            kotlin.jvm.internal.i.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public r(String str, String str2, String[] strArr) {
        this.f45590a = str;
        this.f45591b = str2;
        this.f45592c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f45592c;
        int i10 = 0;
        int iN = kotlinx.coroutines.C.n(0, strArr.length - 1, 2);
        if (iN < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!kotlin.text.m.D(strArr[i10], "charset", true)) {
                if (i10 == iN) {
                    str = null;
                    break;
                }
                i10 += 2;
            } else {
                str = strArr[i10 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && kotlin.jvm.internal.i.a(((r) obj).f45590a, this.f45590a);
    }

    public final int hashCode() {
        return this.f45590a.hashCode();
    }

    public final String toString() {
        return this.f45590a;
    }
}
