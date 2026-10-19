package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicMinMax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntrinsicMinMax f14181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntrinsicMinMax f14182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicMinMax[] f14183d;

    static {
        IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
        f14181b = intrinsicMinMax;
        IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
        f14182c = intrinsicMinMax2;
        IntrinsicMinMax[] intrinsicMinMaxArr = {intrinsicMinMax, intrinsicMinMax2};
        f14183d = intrinsicMinMaxArr;
        kotlin.enums.a.a(intrinsicMinMaxArr);
    }

    public IntrinsicMinMax() {
        throw null;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f14183d.clone();
    }
}
