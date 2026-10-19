package okhttp3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f45382k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f45383l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f45384m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45393i;

    /* JADX INFO: compiled from: Cookie.kt */
    public static final class a {
        public static int a(int i10, int i11, String str, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
        public static long b(int i10, String str) {
            int iA = a(0, i10, str, false);
            Matcher matcher = i.f45384m.matcher(str);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int iQ = -1;
            int i14 = -1;
            int i15 = -1;
            while (iA < i10) {
                int iA2 = a(iA + 1, i10, str, true);
                matcher.region(iA, iA2);
                if (i12 == -1 && matcher.usePattern(i.f45384m).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.i.d(strGroup, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.i.d(strGroup2, "matcher.group(2)");
                    i14 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.i.d(strGroup3, "matcher.group(3)");
                    i15 = Integer.parseInt(strGroup3);
                } else if (i13 == -1 && matcher.usePattern(i.f45383l).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.i.d(strGroup4, "matcher.group(1)");
                    i13 = Integer.parseInt(strGroup4);
                } else if (iQ == -1) {
                    Pattern pattern = i.f45382k;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        kotlin.jvm.internal.i.d(strGroup5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        String strD = J4.n.d(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        kotlin.jvm.internal.i.d(strPattern, "MONTH_PATTERN.pattern()");
                        iQ = kotlin.text.n.Q(strPattern, strD, 0, false, 6) / 4;
                    } else if (i11 != -1 && matcher.usePattern(i.j).matches()) {
                        String strGroup6 = matcher.group(1);
                        kotlin.jvm.internal.i.d(strGroup6, "matcher.group(1)");
                        i11 = Integer.parseInt(strGroup6);
                    }
                } else if (i11 != -1) {
                }
                iA = a(iA2 + 1, i10, str, false);
            }
            if (70 <= i11 && i11 < 100) {
                i11 += 1900;
            }
            if (i11 >= 0 && i11 < 70) {
                i11 += 2000;
            }
            if (i11 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iQ == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i13 || i13 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(p172nb.b.f45030e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i11);
            gregorianCalendar.set(2, iQ - 1);
            gregorianCalendar.set(5, i13);
            gregorianCalendar.set(11, i12);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f45385a = str;
        this.f45386b = str2;
        this.f45387c = j10;
        this.f45388d = str3;
        this.f45389e = str4;
        this.f45390f = z10;
        this.f45391g = z11;
        this.f45392h = z12;
        this.f45393i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (kotlin.jvm.internal.i.a(iVar.f45385a, this.f45385a) && kotlin.jvm.internal.i.a(iVar.f45386b, this.f45386b) && iVar.f45387c == this.f45387c && kotlin.jvm.internal.i.a(iVar.f45388d, this.f45388d) && kotlin.jvm.internal.i.a(iVar.f45389e, this.f45389e) && iVar.f45390f == this.f45390f && iVar.f45391g == this.f45391g && iVar.f45392h == this.f45392h && iVar.f45393i == this.f45393i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45393i) + androidx.compose.animation.D.b(androidx.compose.animation.D.b(androidx.compose.animation.D.b(B1.a.b(this.f45389e, B1.a.b(this.f45388d, C4.b.c(this.f45387c, B1.a.b(this.f45386b, B1.a.b(this.f45385a, 527, 31), 31), 31), 31), 31), 31, this.f45390f), 31, this.f45391g), 31, this.f45392h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45385a);
        sb2.append('=');
        sb2.append(this.f45386b);
        if (this.f45392h) {
            long j10 = this.f45387c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = p197pb.c.f45940a.get().format(new Date(j10));
                kotlin.jvm.internal.i.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f45393i) {
            sb2.append("; domain=");
            sb2.append(this.f45388d);
        }
        sb2.append("; path=");
        sb2.append(this.f45389e);
        if (this.f45390f) {
            sb2.append("; secure");
        }
        if (this.f45391g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString()");
        return string;
    }
}
