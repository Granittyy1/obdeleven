package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DecodeFormat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecodeFormat f24517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecodeFormat f24518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DecodeFormat f24519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DecodeFormat[] f24520e;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        f24517b = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        f24518c = decodeFormat2;
        f24520e = new DecodeFormat[]{decodeFormat, decodeFormat2};
        f24519d = decodeFormat;
    }

    public DecodeFormat() {
        throw null;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) f24520e.clone();
    }
}
