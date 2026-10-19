package okhttp3;

import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Regex;
import me.zhanghai.android.materialprogressbar.R;
import p318zb.C2839f;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f45570k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f45576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f45577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45579i;
    public final boolean j;

    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45580a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45583d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f45585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f45586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f45587h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45581b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f45582c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45584e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f45585f = arrayList;
            arrayList.add("");
        }

        public final p a() {
            ArrayList arrayList;
            String str = this.f45580a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strC = b.c(this.f45581b, 0, 0, false, 7);
            String strC2 = b.c(this.f45582c, 0, 0, false, 7);
            String str2 = this.f45583d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = b();
            ArrayList arrayList2 = this.f45585f;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.c((String) it.next(), 0, 0, false, 7));
            }
            ArrayList<String> arrayList4 = this.f45586g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(kotlin.collections.m.y(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList.add(str3 != null ? b.c(str3, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f45587h;
            return new p(str, strC, strC2, str2, iB, arrayList3, arrayList, str4 != null ? b.c(str4, 0, 0, false, 7) : null, toString());
        }

        public final int b() {
            int i10 = this.f45584e;
            if (i10 != -1) {
                return i10;
            }
            String str = this.f45580a;
            kotlin.jvm.internal.i.b(str);
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0239  */
        /* JADX WARN: Code duplicated, block: B:102:0x023f A[LOOP:4: B:102:0x023f->B:231:?, LOOP_START, PHI: r4
          0x023f: PHI (r4v19 int) = (r4v12 int), (r4v20 int) binds: [B:101:0x023d, B:231:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:104:0x0243  */
        /* JADX WARN: Code duplicated, block: B:107:0x024f  */
        /* JADX WARN: Code duplicated, block: B:110:0x0256  */
        /* JADX WARN: Code duplicated, block: B:115:0x0262  */
        /* JADX WARN: Code duplicated, block: B:125:0x0295  */
        /* JADX WARN: Code duplicated, block: B:128:0x029b  */
        /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:131:0x02c5  */
        /* JADX WARN: Code duplicated, block: B:133:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:134:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:136:0x02eb  */
        /* JADX WARN: Code duplicated, block: B:137:0x02ee  */
        /* JADX WARN: Code duplicated, block: B:141:0x02f5  */
        /* JADX WARN: Code duplicated, block: B:198:0x041d  */
        /* JADX WARN: Code duplicated, block: B:225:0x0259 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:226:0x0253 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:229:0x024b A[EDGE_INSN: B:229:0x024b->B:106:0x024b BREAK  A[LOOP:4: B:102:0x023f->B:231:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0141  */
        /* JADX WARN: Code duplicated, block: B:76:0x014f  */
        /* JADX WARN: Code duplicated, block: B:77:0x0154  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public final void c(p pVar, String input) throws EOFException {
            int i10;
            byte b10;
            byte b11;
            int i11;
            int iE;
            byte bCharAt;
            String str;
            String str2;
            String str3;
            ArrayList arrayList;
            int i12;
            int i13;
            int i14;
            int i15;
            boolean z10;
            String str4;
            int i16;
            int i17;
            int i18;
            char cCharAt;
            int i19;
            int i20;
            ArrayList arrayList2;
            char cCharAt2;
            kotlin.jvm.internal.i.e(input, "input");
            byte[] bArr = p172nb.b.f45026a;
            int iN = p172nb.b.n(input, 0, input.length());
            int iO = p172nb.b.o(input, iN, input.length());
            byte b12 = -1;
            if (iO - iN >= 2) {
                char cCharAt3 = input.charAt(iN);
                char c10 = 'a';
                if ((kotlin.jvm.internal.i.g(cCharAt3, 97) >= 0 && kotlin.jvm.internal.i.g(cCharAt3, R.styleable.AppCompatTheme_windowFixedWidthMajor) <= 0) || (kotlin.jvm.internal.i.g(cCharAt3, 65) >= 0 && kotlin.jvm.internal.i.g(cCharAt3, 90) <= 0)) {
                    i10 = iN + 1;
                    while (true) {
                        if (i10 < iO) {
                            char cCharAt4 = input.charAt(i10);
                            if ((c10 > cCharAt4 || cCharAt4 >= '{') && (('A' > cCharAt4 || cCharAt4 >= '[') && !(('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 == '+' || cCharAt4 == '-' || cCharAt4 == '.'))) {
                                if (cCharAt4 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                i10++;
                                c10 = 'a';
                            }
                        }
                        i10 = -1;
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
            String str5 = "http";
            String str6 = "https";
            String str7 = "this as java.lang.String…ing(startIndex, endIndex)";
            if (i10 != -1) {
                if (kotlin.text.m.H(input, "https:", iN, true)) {
                    this.f45580a = "https";
                    iN += 6;
                } else {
                    if (!kotlin.text.m.H(input, "http:", iN, true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i10);
                        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f45580a = "http";
                    iN += 5;
                }
            } else {
                if (pVar == null) {
                    throw new IllegalArgumentException(B7.b.c("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? kotlin.text.o.t0(6, input).concat("...") : input));
                }
                this.f45580a = pVar.f45571a;
            }
            int i21 = iN;
            int i22 = 0;
            while (true) {
                b10 = 47;
                b11 = 92;
                if (i21 >= iO || !((cCharAt2 = input.charAt(i21)) == '\\' || cCharAt2 == '/')) {
                    break;
                }
                i22++;
                i21++;
            }
            ArrayList arrayList3 = this.f45585f;
            byte b13 = 35;
            if (i22 >= 2 || pVar == null) {
                i11 = iN + i22;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iE = p172nb.b.e(i11, iO, input, "@/\\?#");
                    if (iE != iO) {
                        bCharAt = input.charAt(iE);
                    } else {
                        bCharAt = b12;
                    }
                    if (bCharAt == b12 || bCharAt == b13 || bCharAt == b10 || bCharAt == b11 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z11) {
                            i20 = iE;
                            this.f45582c += "%40" + b.a(input, i11, i20, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                        } else {
                            int iF = p172nb.b.f(input, ':', i11, iE);
                            i20 = iE;
                            String strA = b.a(input, i11, iF, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z12) {
                                strA = this.f45581b + "%40" + strA;
                            }
                            this.f45581b = strA;
                            if (iF != i20) {
                                this.f45582c = b.a(input, iF + 1, i20, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z11 = true;
                            }
                            z12 = true;
                        }
                        i11 = i20 + 1;
                        arrayList3 = arrayList3;
                        iO = iO;
                        str7 = str7;
                        str6 = str6;
                        str5 = str5;
                        b10 = 47;
                        b13 = 35;
                        b11 = 92;
                        b12 = -1;
                    }
                }
                str = str7;
                str2 = str6;
                str3 = str5;
                arrayList = arrayList3;
                i12 = iO;
                i13 = i11;
                while (true) {
                    if (i13 >= iE) {
                        i14 = iE;
                        break;
                    }
                    cCharAt = input.charAt(i13);
                    if (cCharAt == '[') {
                        do {
                            i13++;
                            if (i13 < iE) {
                                break;
                            }
                        } while (input.charAt(i13) != ']');
                        i19 = 1;
                    } else {
                        if (cCharAt == ':') {
                            i14 = i13;
                            break;
                        }
                        i19 = 1;
                    }
                    i13 += i19;
                }
                i15 = i14 + 1;
                if (i15 < iE) {
                    this.f45583d = O.e.B(b.c(input, i11, i14, false, 4));
                    i17 = i11;
                    try {
                        i18 = Integer.parseInt(b.a(input, i15, iE, "", false, false, false, false, null, 248));
                        if (1 <= i18 || i18 >= 65536) {
                            i18 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f45584e = i18;
                    if (i18 != -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i15, iE);
                        kotlin.jvm.internal.i.d(strSubstring2, str);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    i11 = i17;
                    z10 = false;
                } else {
                    z10 = false;
                    this.f45583d = O.e.B(b.c(input, i11, i14, false, 4));
                    str4 = this.f45580a;
                    kotlin.jvm.internal.i.b(str4);
                    if (str4.equals(str3)) {
                        i16 = 80;
                    } else if (str4.equals(str2)) {
                        i16 = 443;
                    } else {
                        i16 = -1;
                    }
                    this.f45584e = i16;
                }
                if (this.f45583d != null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i11, i14);
                    kotlin.jvm.internal.i.d(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iN = iE;
            } else if (kotlin.jvm.internal.i.a(pVar.f45571a, this.f45580a)) {
                this.f45581b = pVar.e();
                this.f45582c = pVar.a();
                this.f45583d = pVar.f45574d;
                this.f45584e = pVar.f45575e;
                arrayList3.clear();
                arrayList3.addAll(pVar.c());
                if (iN == iO || input.charAt(iN) == '#') {
                    String strD = pVar.d();
                    this.f45586g = strD != null ? b.d(b.a(strD, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
                }
                arrayList = arrayList3;
                i12 = iO;
                z10 = false;
            } else {
                i11 = iN + i22;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    iE = p172nb.b.e(i11, iO, input, "@/\\?#");
                    if (iE != iO) {
                        bCharAt = input.charAt(iE);
                    } else {
                        bCharAt = b12;
                    }
                    if (bCharAt == b12) {
                        break;
                    } else {
                        break;
                    }
                }
                str = str7;
                str2 = str6;
                str3 = str5;
                arrayList = arrayList3;
                i12 = iO;
                i13 = i11;
                while (true) {
                    if (i13 >= iE) {
                        i14 = iE;
                        break;
                    }
                    cCharAt = input.charAt(i13);
                    if (cCharAt == '[') {
                        do {
                            i13++;
                            if (i13 < iE) {
                                break;
                                break;
                            }
                        } while (input.charAt(i13) != ']');
                        i19 = 1;
                    } else {
                        if (cCharAt == ':') {
                            i14 = i13;
                            break;
                        }
                        i19 = 1;
                    }
                    i13 += i19;
                }
                i15 = i14 + 1;
                if (i15 < iE) {
                    this.f45583d = O.e.B(b.c(input, i11, i14, false, 4));
                    i17 = i11;
                    i18 = Integer.parseInt(b.a(input, i15, iE, "", false, false, false, false, null, 248));
                    if (1 <= i18) {
                        i18 = -1;
                    } else {
                        i18 = -1;
                    }
                    this.f45584e = i18;
                    if (i18 != -1) {
                        StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = input.substring(i15, iE);
                        kotlin.jvm.internal.i.d(strSubstring4, str);
                        sb5.append(strSubstring4);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                    i11 = i17;
                    z10 = false;
                } else {
                    z10 = false;
                    this.f45583d = O.e.B(b.c(input, i11, i14, false, 4));
                    str4 = this.f45580a;
                    kotlin.jvm.internal.i.b(str4);
                    if (str4.equals(str3)) {
                        i16 = 80;
                    } else if (str4.equals(str2)) {
                        i16 = 443;
                    } else {
                        i16 = -1;
                    }
                    this.f45584e = i16;
                }
                if (this.f45583d != null) {
                    StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = input.substring(i11, i14);
                    kotlin.jvm.internal.i.d(strSubstring5, str);
                    sb6.append(strSubstring5);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
                iN = iE;
            }
            int i23 = i12;
            int iE2 = p172nb.b.e(iN, i23, input, "?#");
            if (iN != iE2) {
                char cCharAt5 = input.charAt(iN);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList2 = arrayList;
                    arrayList2.clear();
                    arrayList2.add("");
                    iN++;
                } else {
                    arrayList2 = arrayList;
                    arrayList2.set(arrayList.size() - 1, "");
                }
                int i24 = iN;
                while (i24 < iE2) {
                    int iE3 = p172nb.b.e(i24, iE2, input, "/\\");
                    boolean z15 = iE3 < iE2 ? true : z10;
                    arrayList2 = arrayList2;
                    String strA2 = b.a(input, i24, iE3, " \"<>^`{}|/\\?#", true, false, false, false, null, 240);
                    if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) Z3.n.f(1, arrayList2)).length() == 0) {
                                arrayList2.set(arrayList2.size() - 1, strA2);
                            } else {
                                arrayList2.add(strA2);
                            }
                            if (z15) {
                                arrayList2.add("");
                            }
                        } else if (((String) arrayList2.remove(arrayList2.size() - 1)).length() != 0 || arrayList2.isEmpty()) {
                            arrayList2.add("");
                        } else {
                            arrayList2.set(arrayList2.size() - 1, "");
                        }
                    }
                    i24 = z15 ? iE3 + 1 : iE3;
                    z10 = false;
                }
            }
            if (iE2 < i23 && input.charAt(iE2) == '?') {
                int iF2 = p172nb.b.f(input, '#', iE2, i23);
                this.f45586g = b.d(b.a(input, iE2 + 1, iF2, " \"'<>#", true, false, true, false, null, 208));
                iE2 = iF2;
            }
            if (iE2 >= i23 || input.charAt(iE2) != '#') {
                return;
            }
            this.f45587h = b.a(input, iE2 + 1, i23, "", true, false, false, true, null, 176);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x008b  */
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f45580a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.f45581b.length() > 0 || this.f45582c.length() > 0) {
                sb2.append(this.f45581b);
                if (this.f45582c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f45582c);
                }
                sb2.append('@');
            }
            String str2 = this.f45583d;
            if (str2 != null) {
                if (kotlin.text.n.K(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f45583d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f45583d);
                }
            }
            int i10 = -1;
            if (this.f45584e != -1 || this.f45580a != null) {
                int iB = b();
                String str3 = this.f45580a;
                if (str3 == null) {
                    sb2.append(':');
                    sb2.append(iB);
                } else {
                    if (str3.equals("http")) {
                        i10 = 80;
                    } else if (str3.equals("https")) {
                        i10 = 443;
                    }
                    if (iB != i10) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                }
            }
            ArrayList arrayList = this.f45585f;
            kotlin.jvm.internal.i.e(arrayList, "<this>");
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i11));
            }
            if (this.f45586g != null) {
                sb2.append('?');
                ArrayList arrayList2 = this.f45586g;
                kotlin.jvm.internal.i.b(arrayList2);
                b.e(arrayList2, sb2);
            }
            if (this.f45587h != null) {
                sb2.append('#');
                sb2.append(this.f45587h);
            }
            String string = sb2.toString();
            kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    public static final class b {
        public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) throws EOFException {
            int i13 = (i12 & 1) != 0 ? 0 : i10;
            int length = (i12 & 2) != 0 ? str.length() : i11;
            boolean z14 = (i12 & 8) != 0 ? false : z10;
            boolean z15 = (i12 & 16) != 0 ? false : z11;
            boolean z16 = (i12 & 32) != 0 ? false : z12;
            boolean z17 = (i12 & 64) == 0 ? z13 : false;
            int i14 = 128;
            Charset charset2 = (i12 & 128) != 0 ? null : charset;
            kotlin.jvm.internal.i.e(str, "<this>");
            int iCharCount = i13;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i15 = 32;
                int i16 = 43;
                int i17 = 127;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i14 && !z17) || kotlin.text.n.K(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z14 || (z15 && !b(str, iCharCount, length)))) || (iCodePointAt == 43 && z16)))) {
                    C2839f c2839f = new C2839f();
                    c2839f.g1(str, i13, iCharCount);
                    C2839f c2839f2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z14 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == i16 && z16) {
                                c2839f.f1(z14 ? "+" : "%2B");
                            } else {
                                if (iCodePointAt2 >= i15 && iCodePointAt2 != i17) {
                                    if ((iCodePointAt2 < 128 || z17) && !kotlin.text.n.K(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z14 && (!z15 || b(str, iCharCount, length))))) {
                                        c2839f.h1(iCodePointAt2);
                                    }
                                }
                                if (c2839f2 == null) {
                                    c2839f2 = new C2839f();
                                }
                                if (charset2 == null || charset2.equals(StandardCharsets.UTF_8)) {
                                    c2839f2.h1(iCodePointAt2);
                                } else {
                                    c2839f2.e1(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset2);
                                }
                                while (!c2839f2.j()) {
                                    byte b10 = c2839f2.readByte();
                                    c2839f.Z0(37);
                                    char[] cArr = p.f45570k;
                                    c2839f.Z0(cArr[((b10 & 255) >> 4) & 15]);
                                    c2839f.Z0(cArr[b10 & 15]);
                                }
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i17 = 127;
                        i15 = 32;
                        i16 = 43;
                    }
                    return c2839f.r0();
                }
                iCharCount += Character.charCount(iCodePointAt);
                i14 = 128;
            }
            String strSubstring = str.substring(i13, length);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static boolean b(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && p172nb.b.r(str.charAt(i10 + 1)) != -1 && p172nb.b.r(str.charAt(i12)) != -1;
        }

        public static String c(String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            kotlin.jvm.internal.i.e(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C2839f c2839f = new C2839f();
                    c2839f.g1(str, i10, iCharCount);
                    while (iCharCount < i11) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                            int iR = p172nb.b.r(str.charAt(iCharCount + 1));
                            int iR2 = p172nb.b.r(str.charAt(i13));
                            if (iR == -1 || iR2 == -1) {
                                c2839f.h1(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                c2839f.Z0((iR << 4) + iR2);
                                iCharCount = Character.charCount(iCodePointAt) + i13;
                            }
                        } else if (iCodePointAt == 43 && z10) {
                            c2839f.Z0(32);
                            iCharCount++;
                        } else {
                            c2839f.h1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return c2839f.r0();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static ArrayList d(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iP = kotlin.text.n.P(str, '&', i10, false, 4);
                if (iP == -1) {
                    iP = str.length();
                }
                int iP2 = kotlin.text.n.P(str, '=', i10, false, 4);
                if (iP2 == -1 || iP2 > iP) {
                    String strSubstring = str.substring(i10, iP);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iP2);
                    kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iP2 + 1, iP);
                    kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iP + 1;
            }
            return arrayList;
        }

        public static void e(ArrayList arrayList, StringBuilder sb2) {
            kotlin.jvm.internal.i.e(arrayList, "<this>");
            Na.g gVarI = Na.l.I(2, Na.l.J(0, arrayList.size()));
            int i10 = gVarI.f4687b;
            int i11 = gVarI.f4688c;
            int i12 = gVarI.f4689d;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                String str = (String) arrayList.get(i10);
                String str2 = (String) arrayList.get(i10 + 1);
                if (i10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 += i12;
                }
            }
        }
    }

    public p(String scheme, String str, String str2, String host, int i10, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        kotlin.jvm.internal.i.e(scheme, "scheme");
        kotlin.jvm.internal.i.e(host, "host");
        this.f45571a = scheme;
        this.f45572b = str;
        this.f45573c = str2;
        this.f45574d = host;
        this.f45575e = i10;
        this.f45576f = arrayList;
        this.f45577g = arrayList2;
        this.f45578h = str3;
        this.f45579i = str4;
        this.j = scheme.equals("https");
    }

    public final String a() {
        if (this.f45573c.length() == 0) {
            return "";
        }
        int length = this.f45571a.length() + 3;
        String str = this.f45579i;
        String strSubstring = str.substring(kotlin.text.n.P(str, ':', length, false, 4) + 1, kotlin.text.n.P(str, '@', 0, false, 6));
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f45571a.length() + 3;
        String str = this.f45579i;
        int iP = kotlin.text.n.P(str, '/', length, false, 4);
        String strSubstring = str.substring(iP, p172nb.b.e(iP, str.length(), str, "?#"));
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f45571a.length() + 3;
        String str = this.f45579i;
        int iP = kotlin.text.n.P(str, '/', length, false, 4);
        int iE = p172nb.b.e(iP, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iP < iE) {
            int i10 = iP + 1;
            int iF = p172nb.b.f(str, '/', i10, iE);
            String strSubstring = str.substring(i10, iF);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iP = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f45577g == null) {
            return null;
        }
        String str = this.f45579i;
        int iP = kotlin.text.n.P(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iP, p172nb.b.f(str, '#', iP, str.length()));
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f45572b.length() == 0) {
            return "";
        }
        int length = this.f45571a.length() + 3;
        String str = this.f45579i;
        String strSubstring = str.substring(length, p172nb.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.i.a(((p) obj).f45579i, this.f45579i);
    }

    public final a f() {
        int i10;
        a aVar = new a();
        String scheme = this.f45571a;
        aVar.f45580a = scheme;
        aVar.f45581b = e();
        aVar.f45582c = a();
        aVar.f45583d = this.f45574d;
        kotlin.jvm.internal.i.e(scheme, "scheme");
        if (scheme.equals("http")) {
            i10 = 80;
        } else {
            i10 = scheme.equals("https") ? 443 : -1;
        }
        int i11 = this.f45575e;
        aVar.f45584e = i11 != i10 ? i11 : -1;
        ArrayList arrayList = aVar.f45585f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        aVar.f45586g = strD != null ? b.d(b.a(strD, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
        if (this.f45578h != null) {
            String str = this.f45579i;
            strSubstring = str.substring(kotlin.text.n.P(str, '#', 0, false, 6) + 1);
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f45587h = strSubstring;
        return aVar;
    }

    public final a g(String link) throws EOFException {
        kotlin.jvm.internal.i.e(link, "link");
        try {
            a aVar = new a();
            aVar.c(this, link);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() throws EOFException {
        a aVarG = g("/...");
        kotlin.jvm.internal.i.b(aVarG);
        aVarG.f45581b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        aVarG.f45582c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVarG.a().f45579i;
    }

    public final int hashCode() {
        return this.f45579i.hashCode();
    }

    public final URI i() {
        a aVarF = f();
        String str = aVarF.f45583d;
        aVarF.f45583d = str != null ? new Regex("[\"<>^`{|}]").f("", str) : null;
        ArrayList arrayList = aVarF.f45585f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, b.a((String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, null, 227));
        }
        ArrayList arrayList2 = aVarF.f45586g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str2 = (String) arrayList2.get(i11);
                arrayList2.set(i11, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = aVarF.f45587h;
        aVarF.f45587h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = aVarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").f("", string));
                kotlin.jvm.internal.i.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.f45579i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String toString() {
        return this.f45579i;
    }
}
