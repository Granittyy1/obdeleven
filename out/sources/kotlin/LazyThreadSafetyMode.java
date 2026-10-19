package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyThreadSafetyMode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LazyThreadSafetyMode f42971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LazyThreadSafetyMode f42972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LazyThreadSafetyMode f42973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LazyThreadSafetyMode[] f42974e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        f42971b = lazyThreadSafetyMode;
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        f42972c = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        f42973d = lazyThreadSafetyMode3;
        LazyThreadSafetyMode[] lazyThreadSafetyModeArr = {lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
        f42974e = lazyThreadSafetyModeArr;
        kotlin.enums.a.a(lazyThreadSafetyModeArr);
    }

    public LazyThreadSafetyMode() {
        throw null;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) f42974e.clone();
    }
}
