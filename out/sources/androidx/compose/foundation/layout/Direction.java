package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Direction {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Direction f10109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Direction f10110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Direction f10111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Direction[] f10112e;

    static {
        Direction direction = new Direction("Vertical", 0);
        f10109b = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        f10110c = direction2;
        Direction direction3 = new Direction("Both", 2);
        f10111d = direction3;
        Direction[] directionArr = {direction, direction2, direction3};
        f10112e = directionArr;
        kotlin.enums.a.a(directionArr);
    }

    public Direction() {
        throw null;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) f10112e.clone();
    }
}
