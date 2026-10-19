package okhttp3;

import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: okhttp3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2753d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2753d f45335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2753d f45336o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f45345i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f45347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45348m;

    /* JADX INFO: renamed from: okhttp3.d$a */
    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f45350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45351c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45352d;

        public final C2753d a() {
            return new C2753d(this.f45349a, this.f45350b, -1, -1, false, false, false, this.f45351c, -1, this.f45352d, false, false, null);
        }
    }

    /* JADX INFO: renamed from: okhttp3.d$b */
    /* JADX INFO: compiled from: CacheControl.kt */
    public static final class b {
        /* JADX WARN: Code duplicated, block: B:102:0x012a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:103:0x0120 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:0x013c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:105:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x0168 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x017a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:108:0x018c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x01bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:110:0x01d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:0x01e3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:112:0x0144 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:113:0x015b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:0x019e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:115:0x01ae A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x0149 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:117:0x01db A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:118:0x01c8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:119:0x0196 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:120:0x0184 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x0172 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x0065 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:133:0x006b A[EDGE_INSN: B:133:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x004d->B:20:0x005e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0048  */
        /* JADX WARN: Code duplicated, block: B:17:0x004f  */
        /* JADX WARN: Code duplicated, block: B:20:0x005e A[LOOP:2: B:16:0x004d->B:20:0x005e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:64:0x0152  */
        /* JADX WARN: Code duplicated, block: B:67:0x0160  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:82:0x01b4  */
        public static C2753d a(o oVar) {
            int i10;
            int i11;
            int length;
            int length2;
            String string;
            String string2;
            int i12;
            o headers = oVar;
            kotlin.jvm.internal.i.e(headers, "headers");
            int size = oVar.size();
            boolean z10 = true;
            boolean z11 = true;
            int i13 = 0;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int iY = -1;
            int iY2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iY3 = -1;
            int iY4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i13 < size) {
                String strK = headers.k(i13);
                String strV = headers.v(i13);
                if (kotlin.text.m.D(strK, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strV;
                    }
                    i11 = 0;
                    while (i11 < strV.length()) {
                        length = strV.length();
                        length2 = i11;
                        while (true) {
                            if (length2 < length) {
                                size = size;
                                length2 = strV.length();
                                break;
                            }
                            size = size;
                            if (kotlin.text.n.K("=,;", strV.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = size;
                        }
                        String strSubstring = strV.substring(i11, length2);
                        kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = kotlin.text.n.p0(strSubstring).toString();
                        if (length2 != strV.length() || strV.charAt(length2) == ',' || strV.charAt(length2) == ';') {
                            z11 = z11;
                            i11 = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = p172nb.b.f45026a;
                            int length4 = strV.length();
                            while (true) {
                                if (length3 >= length4) {
                                    i12 = 1;
                                    length3 = strV.length();
                                    break;
                                }
                                char cCharAt = strV.charAt(length3);
                                int i14 = length4;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    i12 = 1;
                                    break;
                                }
                                length3++;
                                length4 = i14;
                            }
                            if (length3 < strV.length()) {
                                z11 = z11;
                                if (strV.charAt(length3) == '\"') {
                                    int i15 = length3 + i12;
                                    int iP = kotlin.text.n.P(strV, '\"', i15, false, 4);
                                    string2 = strV.substring(i15, iP);
                                    kotlin.jvm.internal.i.d(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i11 = iP + 1;
                                }
                            } else {
                                z11 = z11;
                            }
                            int length5 = strV.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strV.length();
                                    break;
                                }
                                int i16 = length5;
                                if (kotlin.text.n.K(",;", strV.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i16;
                            }
                            String strSubstring2 = strV.substring(length3, length6);
                            kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            string2 = kotlin.text.n.p0(strSubstring2).toString();
                            i11 = length6;
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z10 = true;
                            z12 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z10 = true;
                            z13 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                iY = p172nb.b.y(-1, string2);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                iY2 = p172nb.b.y(-1, string2);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z10 = true;
                                z14 = true;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z10 = true;
                                z15 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z10 = true;
                                z16 = true;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                iY3 = p172nb.b.y(BrazeLogger.SUPPRESS, string2);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                iY4 = p172nb.b.y(-1, string2);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z10 = true;
                                z17 = true;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z10 = true;
                                z18 = true;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z10 = true;
                                z19 = true;
                            }
                            z10 = true;
                        }
                    }
                    i10 = size;
                    boolean z20 = z10;
                    i13 += z20 ? 1 : 0;
                    z10 = z20 ? 1 : 0;
                    size = i10;
                    headers = oVar;
                } else {
                    if (!kotlin.text.m.D(strK, "Pragma", z10)) {
                        i10 = size;
                    }
                    boolean z21 = z10;
                    i13 += z21 ? 1 : 0;
                    z10 = z21 ? 1 : 0;
                    size = i10;
                    headers = oVar;
                }
                z11 = false;
                i11 = 0;
                while (i11 < strV.length()) {
                    length = strV.length();
                    length2 = i11;
                    while (true) {
                        if (length2 < length) {
                            size = size;
                            length2 = strV.length();
                            break;
                        }
                        size = size;
                        if (kotlin.text.n.K("=,;", strV.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = size;
                    }
                    String strSubstring3 = strV.substring(i11, length2);
                    kotlin.jvm.internal.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = kotlin.text.n.p0(strSubstring3).toString();
                    if (length2 != strV.length()) {
                        z11 = z11;
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        z11 = z11;
                        i11 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z10 = true;
                        z12 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z10 = true;
                        z13 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            iY = p172nb.b.y(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iY2 = p172nb.b.y(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z10 = true;
                            z14 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z10 = true;
                            z15 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z10 = true;
                            z16 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iY3 = p172nb.b.y(BrazeLogger.SUPPRESS, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iY4 = p172nb.b.y(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z10 = true;
                            z17 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z10 = true;
                            z18 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z10 = true;
                            z19 = true;
                        }
                        z10 = true;
                    }
                }
                i10 = size;
                boolean z22 = z10;
                i13 += z22 ? 1 : 0;
                z10 = z22 ? 1 : 0;
                size = i10;
                headers = oVar;
            }
            return new C2753d(z12, z13, iY, iY2, z14, z15, z16, iY3, iY4, z17, z18, z19, !z11 ? null : str);
        }
    }

    static {
        a aVar = new a();
        aVar.f45349a = true;
        f45335n = aVar.a();
        a aVar2 = new a();
        aVar2.f45352d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        int i10 = BrazeLogger.SUPPRESS;
        long seconds = timeUnit.toSeconds(BrazeLogger.SUPPRESS);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        aVar2.f45351c = i10;
        f45336o = aVar2.a();
    }

    public C2753d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f45337a = z10;
        this.f45338b = z11;
        this.f45339c = i10;
        this.f45340d = i11;
        this.f45341e = z12;
        this.f45342f = z13;
        this.f45343g = z14;
        this.f45344h = i12;
        this.f45345i = i13;
        this.j = z15;
        this.f45346k = z16;
        this.f45347l = z17;
        this.f45348m = str;
    }

    public final String toString() {
        String str = this.f45348m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f45337a) {
            sb2.append("no-cache, ");
        }
        if (this.f45338b) {
            sb2.append("no-store, ");
        }
        int i10 = this.f45339c;
        if (i10 != -1) {
            sb2.append("max-age=");
            sb2.append(i10);
            sb2.append(", ");
        }
        int i11 = this.f45340d;
        if (i11 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i11);
            sb2.append(", ");
        }
        if (this.f45341e) {
            sb2.append("private, ");
        }
        if (this.f45342f) {
            sb2.append("public, ");
        }
        if (this.f45343g) {
            sb2.append("must-revalidate, ");
        }
        int i12 = this.f45344h;
        if (i12 != -1) {
            sb2.append("max-stale=");
            sb2.append(i12);
            sb2.append(", ");
        }
        int i13 = this.f45345i;
        if (i13 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i13);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f45346k) {
            sb2.append("no-transform, ");
        }
        if (this.f45347l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f45348m = string;
        return string;
    }
}
