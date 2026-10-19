package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutOrientation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayoutOrientation f10163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ LayoutOrientation[] f10164c;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        f10163b = layoutOrientation;
        LayoutOrientation[] layoutOrientationArr = {layoutOrientation, new LayoutOrientation("Vertical", 1)};
        f10164c = layoutOrientationArr;
        kotlin.enums.a.a(layoutOrientationArr);
    }

    public LayoutOrientation() {
        throw null;
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) f10164c.clone();
    }
}
