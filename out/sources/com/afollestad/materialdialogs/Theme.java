package com.afollestad.materialdialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Theme {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Theme f23261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Theme f23262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Theme[] f23263d;

    static {
        Theme theme = new Theme("LIGHT", 0);
        f23261b = theme;
        Theme theme2 = new Theme("DARK", 1);
        f23262c = theme2;
        f23263d = new Theme[]{theme, theme2};
    }

    public Theme() {
        throw null;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) f23263d.clone();
    }
}
