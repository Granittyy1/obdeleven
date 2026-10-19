package androidx.compose.ui.unit;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LayoutDirection.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutDirection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayoutDirection f15717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LayoutDirection f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ LayoutDirection[] f15719d;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        f15717b = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        f15718c = layoutDirection2;
        LayoutDirection[] layoutDirectionArr = {layoutDirection, layoutDirection2};
        f15719d = layoutDirectionArr;
        a.a(layoutDirectionArr);
    }

    public LayoutDirection() {
        throw null;
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f15719d.clone();
    }
}
