package p015b2;

import Q8.d;
import android.graphics.Color;
import android.graphics.PointF;
import com.google.common.primitives.Ints;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f20521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f20522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20527i;
    public final int j;

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f20536i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20537k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f20528a = i10;
            this.f20529b = i11;
            this.f20530c = i12;
            this.f20531d = i13;
            this.f20532e = i14;
            this.f20533f = i15;
            this.f20534g = i16;
            this.f20535h = i17;
            this.f20536i = i18;
            this.j = i19;
            this.f20537k = i20;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f20538a = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f20539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f20540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f20541d;

        static {
            int i10 = A.f40996a;
            Locale locale = Locale.US;
            f20539b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f20540c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f20541d = Pattern.compile("\\\\an(\\d+)");
        }

        public static PointF a(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f20539b.matcher(str);
            Matcher matcher2 = f20540c.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    k.e("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f10 = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f10, Float.parseFloat(strGroup2.trim()));
        }
    }

    public c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f20519a = str;
        this.f20520b = i10;
        this.f20521c = num;
        this.f20522d = num2;
        this.f20523e = f10;
        this.f20524f = z10;
        this.f20525g = z11;
        this.f20526h = z12;
        this.f20527i = z13;
        this.j = i11;
    }

    public static int a(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i10;
                default:
                    d.e("Ignoring unknown alignment: ", str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static boolean b(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            k.g("Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            p241t7.b.e(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.j0(((j >> 24) & 255) ^ 255), Ints.j0(j & 255), Ints.j0((j >> 8) & 255), Ints.j0((j >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            k.g("Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
