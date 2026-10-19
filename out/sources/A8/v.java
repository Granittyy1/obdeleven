package A8;

import G8.B;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import java.util.LinkedHashMap;
import p304y9.G;

/* JADX INFO: compiled from: TextTableMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public static B a(G input) {
        kotlin.jvm.internal.i.e(input, "input");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = input.f48460b;
        if (str != null) {
            f.f(DatabaseLanguage.GERMAN, "getCode(...)", linkedHashMap, str);
        }
        String str2 = input.f48461c;
        if (str2 != null) {
            f.f(DatabaseLanguage.FINLAND, "getCode(...)", linkedHashMap, str2);
        }
        String str3 = input.f48462d;
        if (str3 != null) {
            f.f(DatabaseLanguage.RUSSIAN, "getCode(...)", linkedHashMap, str3);
        }
        DatabaseLanguage databaseLanguage = DatabaseLanguage.SLOVENIA;
        String str4 = input.f48463e;
        if (str4 != null) {
            f.f(databaseLanguage, "getCode(...)", linkedHashMap, str4);
        }
        String str5 = input.f48464f;
        if (str5 != null) {
            f.f(DatabaseLanguage.KOREAN, "getCode(...)", linkedHashMap, str5);
        }
        String str6 = input.f48465g;
        if (str6 != null) {
            f.f(DatabaseLanguage.PORTUGAL, "getCode(...)", linkedHashMap, str6);
        }
        String str7 = input.f48466h;
        if (str7 != null) {
            f.f(DatabaseLanguage.GREECE, "getCode(...)", linkedHashMap, str7);
        }
        String str8 = input.f48467i;
        if (str8 != null) {
            f.f(DatabaseLanguage.ENGLISH, "getCode(...)", linkedHashMap, str8);
        }
        String str9 = input.j;
        if (str9 != null) {
            f.f(DatabaseLanguage.CROATIAN, "getCode(...)", linkedHashMap, str9);
        }
        String str10 = input.f48468k;
        if (str10 != null) {
            f.f(DatabaseLanguage.ITALIAN, "getCode(...)", linkedHashMap, str10);
        }
        String str11 = input.f48469l;
        if (str11 != null) {
            f.f(DatabaseLanguage.FRANCE, "getCode(...)", linkedHashMap, str11);
        }
        String str12 = input.f48470m;
        if (str12 != null) {
            f.f(DatabaseLanguage.HUNGARIAN, "getCode(...)", linkedHashMap, str12);
        }
        String str13 = input.f48471n;
        if (str13 != null) {
            f.f(DatabaseLanguage.SPANISH, "getCode(...)", linkedHashMap, str13);
        }
        String str14 = input.f48472o;
        if (str14 != null) {
            f.f(DatabaseLanguage.CHINESE, "getCode(...)", linkedHashMap, str14);
        }
        String str15 = input.f48473p;
        if (str15 != null) {
            f.f(DatabaseLanguage.CZECH, "getCode(...)", linkedHashMap, str15);
        }
        String str16 = input.f48474q;
        if (str16 != null) {
            f.f(DatabaseLanguage.JAPAN, "getCode(...)", linkedHashMap, str16);
        }
        String str17 = input.f48475r;
        if (str17 != null) {
            f.f(databaseLanguage, "getCode(...)", linkedHashMap, str17);
        }
        String str18 = input.f48476s;
        if (str18 != null) {
            f.f(DatabaseLanguage.POLISH, "getCode(...)", linkedHashMap, str18);
        }
        String str19 = input.f48477t;
        if (str19 != null) {
            f.f(DatabaseLanguage.DANISH, "getCode(...)", linkedHashMap, str19);
        }
        String str20 = input.f48478u;
        if (str20 != null) {
            f.f(DatabaseLanguage.NETHERLANDS, "getCode(...)", linkedHashMap, str20);
        }
        String str21 = input.f48479v;
        if (str21 != null) {
            f.f(DatabaseLanguage.TURKEY, "getCode(...)", linkedHashMap, str21);
        }
        String str22 = input.f48480w;
        if (str22 != null) {
            f.f(DatabaseLanguage.ROMANIAN, "getCode(...)", linkedHashMap, str22);
        }
        return new B(input.f48459a, linkedHashMap);
    }
}
