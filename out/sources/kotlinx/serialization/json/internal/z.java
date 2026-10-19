package kotlinx.serialization.json.internal;

import A1.C0575j;
import androidx.compose.foundation.C0936h;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f44035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f44037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44038e;

    public z(String source) {
        kotlin.jvm.internal.i.e(source, "source");
        n nVar = new n();
        nVar.f43995a = new Object[8];
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        nVar.f43996b = iArr;
        nVar.f43997c = -1;
        this.f44035b = nVar;
        this.f44037d = new StringBuilder();
        this.f44038e = source;
    }

    public static /* synthetic */ void n(z zVar, String str, int i10, String str2, int i11) {
        if ((i11 & 2) != 0) {
            i10 = zVar.f44034a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        zVar.m(i10, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f44037d.append((char) (p(charSequence, i10 + 3) + (p(charSequence, i10) << 12) + (p(charSequence, i10 + 1) << 8) + (p(charSequence, i10 + 2) << 4)));
            return i11;
        }
        this.f44034a = i10;
        if (i11 < charSequence.length()) {
            return a(charSequence, this.f44034a);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i10 = this.f44034a;
        if (i10 == -1) {
            return false;
        }
        while (true) {
            String str = this.f44038e;
            if (i10 >= str.length()) {
                this.f44034a = i10;
                return false;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f44034a = i10;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i10++;
        }
    }

    public final void c(int i10, String str) {
        if (q().length() - i10 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (q().charAt(i10 + i11) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f44034a = str.length() + i10;
    }

    public final String d() {
        g('\"');
        int i10 = this.f44034a;
        String str = this.f44038e;
        int iP = kotlin.text.n.P(str, '\"', i10, false, 4);
        if (iP == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i11 = i10;
        while (i11 < iP) {
            if (str.charAt(i11) == '\\') {
                int iU = this.f44034a;
                char cCharAt = str.charAt(i11);
                boolean z10 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.f44037d.append((CharSequence) q(), iU, i11);
                        int iU2 = u(i11 + 1);
                        if (iU2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iU2 + 1;
                        char cCharAt2 = str.charAt(iU2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c10 = cCharAt2 < 'u' ? e.f43981a[cCharAt2] : (char) 0;
                            if (c10 == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.f44037d.append(c10);
                        }
                        iU = u(iA);
                        if (iU == -1) {
                            n(this, "Unexpected EOF", iU, null, 4);
                            throw null;
                        }
                    } else {
                        i11++;
                        if (i11 >= str.length()) {
                            this.f44037d.append((CharSequence) q(), iU, i11);
                            iU = u(i11);
                            if (iU == -1) {
                                n(this, "Unexpected EOF", iU, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i11);
                    }
                    i11 = iU;
                    z10 = true;
                    cCharAt = str.charAt(i11);
                }
                String string = !z10 ? q().subSequence(iU, i11).toString() : l(iU, i11);
                this.f44034a = i11 + 1;
                return string;
            }
            i11++;
        }
        this.f44034a = iP + 1;
        String strSubstring = str.substring(i10, iP);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte e() {
        String str;
        int i10 = this.f44034a;
        while (true) {
            str = this.f44038e;
            if (i10 == -1 || i10 >= str.length()) {
                break;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f44034a = i11;
                return C.e.h(cCharAt);
            }
            i10 = i11;
        }
        this.f44034a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b10) {
        byte bE = e();
        if (bE == b10) {
            return bE;
        }
        o(b10, true);
        throw null;
    }

    public void g(char c10) {
        int i10 = this.f44034a;
        if (i10 == -1) {
            y(c10);
            throw null;
        }
        while (true) {
            String str = this.f44038e;
            if (i10 >= str.length()) {
                this.f44034a = -1;
                y(c10);
                throw null;
            }
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f44034a = i11;
                if (cCharAt == c10) {
                    return;
                }
                y(c10);
                throw null;
            }
            i10 = i11;
        }
    }

    public final long h() {
        boolean z10;
        String str;
        double dPow;
        int iU = u(v());
        String str2 = "EOF";
        int i10 = 0;
        if (iU >= q().length() || iU == -1) {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
        if (q().charAt(iU) == '\"') {
            iU++;
            if (iU == q().length()) {
                n(this, "EOF", 0, null, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = iU;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j = 0;
        long j10 = 0;
        while (true) {
            if (i11 == q().length()) {
                str = str2;
                break;
            }
            char cCharAt = q().charAt(i11);
            if ((cCharAt == 'e' || cCharAt == 'E') && !z11) {
                if (i11 == iU) {
                    n(this, "Unexpected symbol " + cCharAt + " in numeric literal", i10, null, 6);
                    throw null;
                }
                i11++;
                z11 = true;
            } else if (cCharAt == '-' && z11) {
                if (i11 == iU) {
                    n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                    throw null;
                }
                i11++;
                i10 = 0;
                z13 = false;
            } else if (cCharAt != '+' || !z11) {
                str = str2;
                if (cCharAt != '-') {
                    if (C.e.h(cCharAt) != 0) {
                        break;
                    }
                    i11++;
                    int i12 = cCharAt - '0';
                    if (i12 < 0 || i12 >= 10) {
                        n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    if (z11) {
                        j = (j * ((long) 10)) + ((long) i12);
                    } else {
                        j10 = (j10 * ((long) 10)) - ((long) i12);
                        if (j10 > 0) {
                            n(this, "Numeric value overflow", 0, null, 6);
                            throw null;
                        }
                    }
                    str2 = str;
                    i10 = 0;
                } else {
                    if (i11 != iU) {
                        n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i11++;
                    str2 = str;
                    i10 = 0;
                    z12 = true;
                }
            } else {
                if (i11 == iU) {
                    n(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                    throw null;
                }
                i11++;
                i10 = 0;
            }
            z13 = true;
        }
        boolean z14 = i11 != iU;
        if (iU == i11 || (z12 && iU == i11 - 1)) {
            n(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z10) {
            if (!z14) {
                n(this, str, 0, null, 6);
                throw null;
            }
            if (q().charAt(i11) != '\"') {
                n(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i11++;
        }
        this.f44034a = i11;
        if (z11) {
            double d10 = j10;
            boolean z15 = z13;
            if (!z15) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z15) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j);
            }
            double d11 = d10 * dPow;
            if (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d11) != d11) {
                n(this, "Can't convert " + d11 + " to Long", 0, null, 6);
                throw null;
            }
            j10 = (long) d11;
        }
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        n(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String i() {
        String str = this.f44036c;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.i.b(str);
        this.f44036c = null;
        return str;
    }

    public final String j() {
        String strL;
        String str = this.f44036c;
        if (str != null) {
            kotlin.jvm.internal.i.b(str);
            this.f44036c = null;
            return str;
        }
        int iV = v();
        if (iV >= q().length() || iV == -1) {
            n(this, "EOF", iV, null, 4);
            throw null;
        }
        byte bH = C.e.h(q().charAt(iV));
        if (bH == 1) {
            return i();
        }
        if (bH != 0) {
            n(this, "Expected beginning of the string, but got " + q().charAt(iV), 0, null, 6);
            throw null;
        }
        boolean z10 = false;
        while (C.e.h(q().charAt(iV)) == 0) {
            iV++;
            if (iV >= q().length()) {
                this.f44037d.append((CharSequence) q(), this.f44034a, iV);
                int iU = u(iV);
                if (iU == -1) {
                    this.f44034a = iV;
                    return l(0, 0);
                }
                iV = iU;
                z10 = true;
            }
        }
        if (z10) {
            strL = l(this.f44034a, iV);
        } else {
            strL = q().subSequence(this.f44034a, iV).toString();
        }
        this.f44034a = iV;
        return strL;
    }

    public final String k() {
        String strJ = j();
        if (!kotlin.jvm.internal.i.a(strJ, "null") || q().charAt(this.f44034a - 1) == '\"') {
            return strJ;
        }
        n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final String l(int i10, int i11) {
        this.f44037d.append((CharSequence) q(), i10, i11);
        StringBuilder sb2 = this.f44037d;
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public final void m(int i10, String message, String hint) {
        kotlin.jvm.internal.i.e(message, "message");
        kotlin.jvm.internal.i.e(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbF = C4.b.f(message, " at path: ");
        sbF.append(this.f44035b.a());
        sbF.append(strConcat);
        throw O.e.g(sbF.toString(), q(), i10);
    }

    public final void o(byte b10, boolean z10) {
        String strP = C.e.p(b10);
        int i10 = z10 ? this.f44034a - 1 : this.f44034a;
        n(this, C0936h.d("Expected ", strP, ", but had '", (this.f44034a == q().length() || i10 < 0) ? "EOF" : String.valueOf(q().charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    public final int p(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String q() {
        return this.f44038e;
    }

    public final String r(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.i.e(keyToMatch, "keyToMatch");
        int i10 = this.f44034a;
        try {
            if (e() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.i.a(t(z10), keyToMatch)) {
                return null;
            }
            this.f44036c = null;
            if (e() != 5) {
                return null;
            }
            return t(z10);
        } finally {
            this.f44034a = i10;
            this.f44036c = null;
        }
    }

    public byte s() {
        String strQ = q();
        int i10 = this.f44034a;
        while (true) {
            int iU = u(i10);
            if (iU == -1) {
                this.f44034a = iU;
                return (byte) 10;
            }
            char cCharAt = strQ.charAt(iU);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f44034a = iU;
                return C.e.h(cCharAt);
            }
            i10 = iU + 1;
        }
    }

    public final String t(boolean z10) {
        String strI;
        byte bS = s();
        if (z10) {
            if (bS != 1 && bS != 0) {
                return null;
            }
            strI = j();
        } else {
            if (bS != 1) {
                return null;
            }
            strI = i();
        }
        this.f44036c = strI;
        return strI;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) q());
        sb2.append("', currentPosition=");
        return C0575j.b(sb2, this.f44034a, ')');
    }

    public final int u(int i10) {
        if (i10 < this.f44038e.length()) {
            return i10;
        }
        return -1;
    }

    public int v() {
        char cCharAt;
        int i10 = this.f44034a;
        if (i10 == -1) {
            return i10;
        }
        while (true) {
            String str = this.f44038e;
            if (i10 >= str.length() || !((cCharAt = str.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10++;
        }
        this.f44034a = i10;
        return i10;
    }

    public final boolean w() {
        int iV = v();
        String strQ = q();
        if (iV >= strQ.length() || iV == -1 || strQ.charAt(iV) != ',') {
            return false;
        }
        this.f44034a++;
        return true;
    }

    public final boolean x(boolean z10) {
        int iU = u(v());
        int length = q().length() - iU;
        if (length < 4 || iU == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != q().charAt(iU + i10)) {
                return false;
            }
        }
        if (length > 4 && C.e.h(q().charAt(iU + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f44034a = iU + 4;
        return true;
    }

    public final void y(char c10) {
        int i10 = this.f44034a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f44034a = i10 - 1;
                String strJ = j();
                this.f44034a = i10;
                if (kotlin.jvm.internal.i.a(strJ, "null")) {
                    m(this.f44034a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f44034a = i10;
                throw th;
            }
        }
        o(C.e.h(c10), true);
        throw null;
    }
}
