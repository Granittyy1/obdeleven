package com.afollestad.materialdialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class GravityEnum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GravityEnum f23188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GravityEnum f23189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GravityEnum f23190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ GravityEnum[] f23191e;

    static {
        GravityEnum gravityEnum = new GravityEnum("START", 0);
        f23188b = gravityEnum;
        GravityEnum gravityEnum2 = new GravityEnum("CENTER", 1);
        f23189c = gravityEnum2;
        GravityEnum gravityEnum3 = new GravityEnum("END", 2);
        f23190d = gravityEnum3;
        f23191e = new GravityEnum[]{gravityEnum, gravityEnum2, gravityEnum3};
    }

    public GravityEnum() {
        throw null;
    }

    public static GravityEnum valueOf(String str) {
        return (GravityEnum) Enum.valueOf(GravityEnum.class, str);
    }

    public static GravityEnum[] values() {
        return (GravityEnum[]) f23191e.clone();
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return 8388611;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 8388613;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }
}
