package p271w0;

import android.os.LocaleList;
import java.util.Locale;
import p307z0.c;

/* JADX INFO: compiled from: LocaleListCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f47682b = new g(new i(b.a(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f47683a;

    /* JADX INFO: compiled from: LocaleListCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Locale[] f47684a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f47684a;
            for (Locale locale3 : localeArr) {
                if (locale3.equals(locale)) {
                    return false;
                }
            }
            for (Locale locale4 : localeArr) {
                if (locale4.equals(locale2)) {
                    return false;
                }
            }
            String strC = c.c(c.a(c.b(locale)));
            if (!strC.isEmpty()) {
                return strC.equals(c.c(c.a(c.b(locale2))));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: compiled from: LocaleListCompat.java */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public g(i iVar) {
        this.f47683a = iVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f47682b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(strArrSplit[i10]);
        }
        return new g(new i(b.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f47683a.equals(((g) obj).f47683a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47683a.f47685a.hashCode();
    }

    public final String toString() {
        return this.f47683a.f47685a.toString();
    }
}
