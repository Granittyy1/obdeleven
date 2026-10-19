package com.voltasit.obdeleven.core;

import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public enum DatabaseLanguage {
    ENGLISH("English", 0, R.drawable.en_legacy),
    GERMAN("Deutsch", 1, R.drawable.de_legacy),
    SPANISH("Español", 2, R.drawable.es_legacy),
    RUSSIAN("Русский", 3, R.drawable.ru_legacy),
    FRANCE("Français", 4, R.drawable.fr_legacy),
    CZECH("Čeština", 5, R.drawable.cs_legacy),
    DANISH("Danish", 6, R.drawable.da_legacy),
    FINLAND("Suomi", 7, R.drawable.fi_legacy),
    CROATIAN("Hrvatski", 8, R.drawable.hr_legacy),
    HUNGARIAN("Magyar", 9, R.drawable.hu_legacy),
    ITALIAN("Italiano", 10, R.drawable.it_legacy),
    JAPAN("日本語", 11, R.drawable.ja_legacy),
    KOREAN("한국어", 12, R.drawable.ko_legacy),
    NETHERLANDS("Nederlands", 13, R.drawable.nl_legacy),
    POLISH("Polski", 14, R.drawable.pl_legacy),
    PORTUGAL("Português", 15, R.drawable.pt_legacy),
    ROMANIAN("Romanian", 16, R.drawable.ro_legacy),
    SLOVENIA("Slovenščina", 17, R.drawable.sl_legacy),
    /* JADX INFO: Fake field, exist only in values array */
    SWEDEN("Svenska", 18, R.drawable.sv_legacy),
    TURKEY("Turkey", 19, R.drawable.tr_legacy),
    GREECE("Ελληνικά", 20, R.drawable.el_legacy),
    CHINESE("中文", 21, R.drawable.zh_legacy);

    private final String code;
    private final int flag;
    private final String visibleLanguage;

    DatabaseLanguage(String str, int i10, int i11) {
        this.code = str;
        this.visibleLanguage = str;
        this.flag = i11;
    }

    public static DatabaseLanguage a(String str) {
        for (DatabaseLanguage databaseLanguage : values()) {
            if (databaseLanguage.code.equals(str)) {
                return databaseLanguage;
            }
        }
        return ENGLISH;
    }

    public final String b() {
        return this.code;
    }

    public final int c() {
        return this.flag;
    }

    public final String d() {
        return this.visibleLanguage;
    }
}
