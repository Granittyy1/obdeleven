package androidx.compose.ui.text.style;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ResolvedTextDirection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ResolvedTextDirection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResolvedTextDirection f15650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ResolvedTextDirection f15651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ResolvedTextDirection[] f15652d;

    static {
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection("Ltr", 0);
        f15650b = resolvedTextDirection;
        ResolvedTextDirection resolvedTextDirection2 = new ResolvedTextDirection("Rtl", 1);
        f15651c = resolvedTextDirection2;
        ResolvedTextDirection[] resolvedTextDirectionArr = {resolvedTextDirection, resolvedTextDirection2};
        f15652d = resolvedTextDirectionArr;
        kotlin.enums.a.a(resolvedTextDirectionArr);
    }

    public ResolvedTextDirection() {
        throw null;
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) f15652d.clone();
    }
}
