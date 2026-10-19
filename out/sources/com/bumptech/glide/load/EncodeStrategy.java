package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EncodeStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EncodeStrategy f24521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EncodeStrategy f24522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EncodeStrategy f24523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EncodeStrategy[] f24524e;

    static {
        EncodeStrategy encodeStrategy = new EncodeStrategy("SOURCE", 0);
        f24521b = encodeStrategy;
        EncodeStrategy encodeStrategy2 = new EncodeStrategy("TRANSFORMED", 1);
        f24522c = encodeStrategy2;
        EncodeStrategy encodeStrategy3 = new EncodeStrategy("NONE", 2);
        f24523d = encodeStrategy3;
        f24524e = new EncodeStrategy[]{encodeStrategy, encodeStrategy2, encodeStrategy3};
    }

    public EncodeStrategy() {
        throw null;
    }

    public static EncodeStrategy valueOf(String str) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, str);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) f24524e.clone();
    }
}
