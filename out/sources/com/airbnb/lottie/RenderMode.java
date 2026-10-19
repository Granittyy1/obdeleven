package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RenderMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RenderMode f23340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ RenderMode[] f23341c;

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        f23340b = renderMode;
        f23341c = new RenderMode[]{renderMode, new RenderMode("HARDWARE", 1), new RenderMode("SOFTWARE", 2)};
    }

    public RenderMode() {
        throw null;
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) f23341c.clone();
    }
}
