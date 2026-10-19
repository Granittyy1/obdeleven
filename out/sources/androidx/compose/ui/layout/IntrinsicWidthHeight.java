package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicWidthHeight {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntrinsicWidthHeight f14184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntrinsicWidthHeight f14185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicWidthHeight[] f14186d;

    static {
        IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
        f14184b = intrinsicWidthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
        f14185c = intrinsicWidthHeight2;
        IntrinsicWidthHeight[] intrinsicWidthHeightArr = {intrinsicWidthHeight, intrinsicWidthHeight2};
        f14186d = intrinsicWidthHeightArr;
        kotlin.enums.a.a(intrinsicWidthHeightArr);
    }

    public IntrinsicWidthHeight() {
        throw null;
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) f14186d.clone();
    }
}
