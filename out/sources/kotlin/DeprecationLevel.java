package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeprecationLevel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DeprecationLevel f42969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevel[] f42970c;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        f42969b = deprecationLevel;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, new DeprecationLevel("ERROR", 1), new DeprecationLevel("HIDDEN", 2)};
        f42970c = deprecationLevelArr;
        kotlin.enums.a.a(deprecationLevelArr);
    }

    public DeprecationLevel() {
        throw null;
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f42970c.clone();
    }
}
