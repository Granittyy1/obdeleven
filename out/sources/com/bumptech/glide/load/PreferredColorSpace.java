package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PreferredColorSpace {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PreferredColorSpace f24525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final PreferredColorSpace f24526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PreferredColorSpace[] f24527d;

    static {
        PreferredColorSpace preferredColorSpace = new PreferredColorSpace("SRGB", 0);
        f24525b = preferredColorSpace;
        PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
        f24526c = preferredColorSpace2;
        f24527d = new PreferredColorSpace[]{preferredColorSpace, preferredColorSpace2};
    }

    public PreferredColorSpace() {
        throw null;
    }

    public static PreferredColorSpace valueOf(String str) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, str);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) f24527d.clone();
    }
}
