package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicSize {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final IntrinsicSize f10155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntrinsicSize f10156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicSize[] f10157d;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        f10155b = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        f10156c = intrinsicSize2;
        IntrinsicSize[] intrinsicSizeArr = {intrinsicSize, intrinsicSize2};
        f10157d = intrinsicSizeArr;
        kotlin.enums.a.a(intrinsicSizeArr);
    }

    public IntrinsicSize() {
        throw null;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f10157d.clone();
    }
}
