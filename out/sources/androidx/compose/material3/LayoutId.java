package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
final class LayoutId {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayoutId f12206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LayoutId f12207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LayoutId[] f12208d;

    static {
        LayoutId layoutId = new LayoutId("Selector", 0);
        f12206b = layoutId;
        LayoutId layoutId2 = new LayoutId("InnerCircle", 1);
        f12207c = layoutId2;
        f12208d = new LayoutId[]{layoutId, layoutId2};
    }

    public LayoutId() {
        throw null;
    }

    public static LayoutId valueOf(String str) {
        return (LayoutId) Enum.valueOf(LayoutId.class, str);
    }

    public static LayoutId[] values() {
        return (LayoutId[]) f12208d.clone();
    }
}
