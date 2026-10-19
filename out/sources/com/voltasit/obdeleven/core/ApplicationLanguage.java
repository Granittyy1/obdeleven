package com.voltasit.obdeleven.core;

import com.voltasit.obdeleven.R;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class ApplicationLanguage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ApplicationLanguage f30004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ApplicationLanguage[] f30005c;
    private final String countryCode;
    private final int flag;
    private final String languageCode;
    private final String visibleLanguage;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.core.ApplicationLanguage$1, reason: invalid class name */
    public final enum AnonymousClass1 extends ApplicationLanguage {
        @Override // com.voltasit.obdeleven.core.ApplicationLanguage
        public final Locale f() {
            return new Locale(e());
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.core.ApplicationLanguage$2, reason: invalid class name */
    public final enum AnonymousClass2 extends ApplicationLanguage {
        @Override // com.voltasit.obdeleven.core.ApplicationLanguage
        public final String c() {
            return e() + "-" + b();
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1("ENGLISH", 0, "en", "US", "English", R.drawable.en_legacy);
        f30004b = anonymousClass1;
        f30005c = new ApplicationLanguage[]{anonymousClass1, new ApplicationLanguage("GERMAN", 1, "de", "DE", "Deutsch", R.drawable.de_legacy), new ApplicationLanguage("RUSSIAN", 2, "ru", "RU", "Русский", R.drawable.ru_legacy), new ApplicationLanguage("DANSK", 3, "da", "DK", "Dansk", R.drawable.da_legacy), new ApplicationLanguage("SPANISH", 4, "es", "ES", "Español", R.drawable.es_legacy), new ApplicationLanguage("NORWEGIAN", 5, "no", "NO", "Norwegian", R.drawable.no_legacy), new ApplicationLanguage("FINLAND", 6, "fi", "FI", "Suomi", R.drawable.fi_legacy), new ApplicationLanguage("LITHUANIAN", 7, "lt", "LT", "Lietuvių", R.drawable.lt_legacy), new ApplicationLanguage("CZECH", 8, "cs", "CZ", "Čeština", R.drawable.cs_legacy), new ApplicationLanguage("POLISH", 9, "pl", "PL", "Polski", R.drawable.pl_legacy), new ApplicationLanguage("SWEDEN", 10, "sv", "SE", "Svenska", R.drawable.sv_legacy), new ApplicationLanguage("NEDERLANDS", 11, "nl", "NL", "Nederlands", R.drawable.nl_legacy), new ApplicationLanguage("FRANCE", 12, "fr", "FR", "Français", R.drawable.fr_legacy), new ApplicationLanguage("PORTUGUESE", 13, "pt", "PT", "Portuguese", R.drawable.pt_legacy), new ApplicationLanguage("CHINESE", 14, "zh", "CN", "中文", R.drawable.zh_legacy), new ApplicationLanguage("LATVIAN", 15, "lv", "LV", "Latvian", R.drawable.lv_legacy), new ApplicationLanguage("BULGARIAN", 16, "bg", "BG", "Bulgarian", R.drawable.bg_legacy), new ApplicationLanguage("HUNGARIAN", 17, "hu", "HU", "Magyar", R.drawable.hu_legacy), new ApplicationLanguage("TURKISH", 18, "tr", "TR", "Turkish", R.drawable.tr_legacy), new ApplicationLanguage("ITALIAN", 19, "it", "IT", "Italiano", R.drawable.it_legacy), new ApplicationLanguage("ESTONIAN", 20, "et", "EE", "Estonian", R.drawable.et_legacy), new ApplicationLanguage("ROMANIAN", 21, "ro", "RO", "Romanian", R.drawable.ro_legacy), new ApplicationLanguage("CROATIAN", 22, "hr", "HR", "Hrvatski", R.drawable.hr_legacy), new ApplicationLanguage("SERBIAN", 23, "sr", "RS", "Serbian", R.drawable.sr_legacy), new ApplicationLanguage("UKRAINIAN", 24, "uk", "UA", "Ukrainian", R.drawable.ua_legacy), new ApplicationLanguage("SLOVENIAN", 25, "sl", "SI", "Slovenian", R.drawable.sl_legacy), new ApplicationLanguage("JAPANIESE", 26, "ja", "JP", "日本語", R.drawable.ja_legacy), new ApplicationLanguage("KOREAN", 27, "ko", "KR", "한국어", R.drawable.ko_legacy), new AnonymousClass2("BRAZILLIAN_PORTUGUESE", 28, "pt", "BR", "Brazillian Portuguese", R.drawable.ic_flag_br)};
    }

    public ApplicationLanguage(String str, int i10, String str2, String str3, String str4, int i11) {
        super(str, i10);
        this.languageCode = str2;
        this.countryCode = str3;
        this.visibleLanguage = str4;
        this.flag = i11;
    }

    public static ApplicationLanguage a(String str, String str2) {
        for (ApplicationLanguage applicationLanguage : values()) {
            if (applicationLanguage.languageCode.equals(str) && applicationLanguage.countryCode.equals(str2)) {
                return applicationLanguage;
            }
        }
        return f30004b;
    }

    public static ApplicationLanguage valueOf(String str) {
        return (ApplicationLanguage) Enum.valueOf(ApplicationLanguage.class, str);
    }

    public static ApplicationLanguage[] values() {
        return (ApplicationLanguage[]) f30005c.clone();
    }

    public final String b() {
        return this.countryCode;
    }

    public String c() {
        return this.languageCode;
    }

    public final int d() {
        return this.flag;
    }

    public final String e() {
        return this.languageCode;
    }

    public Locale f() {
        return new Locale(this.languageCode, this.countryCode);
    }

    public final String g() {
        return this.visibleLanguage;
    }
}
