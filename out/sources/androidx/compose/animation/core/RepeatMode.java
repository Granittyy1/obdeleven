package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RepeatMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RepeatMode f9398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RepeatMode f9399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ RepeatMode[] f9400d;

    static {
        RepeatMode repeatMode = new RepeatMode("Restart", 0);
        f9398b = repeatMode;
        RepeatMode repeatMode2 = new RepeatMode("Reverse", 1);
        f9399c = repeatMode2;
        RepeatMode[] repeatModeArr = {repeatMode, repeatMode2};
        f9400d = repeatModeArr;
        kotlin.enums.a.a(repeatModeArr);
    }

    public RepeatMode() {
        throw null;
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f9400d.clone();
    }
}
