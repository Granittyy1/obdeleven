package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Orientation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Orientation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Orientation f9957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Orientation f9958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Orientation[] f9959d;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        f9957b = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        f9958c = orientation2;
        Orientation[] orientationArr = {orientation, orientation2};
        f9959d = orientationArr;
        kotlin.enums.a.a(orientationArr);
    }

    public Orientation() {
        throw null;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) f9959d.clone();
    }
}
