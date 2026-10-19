package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class GradientType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GradientType f23379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final GradientType f23380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ GradientType[] f23381d;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        f23379b = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        f23380c = gradientType2;
        f23381d = new GradientType[]{gradientType, gradientType2};
    }

    public GradientType() {
        throw null;
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) f23381d.clone();
    }
}
