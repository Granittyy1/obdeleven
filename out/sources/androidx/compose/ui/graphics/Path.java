package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
public interface Path {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Path.kt */
    public static final class Direction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Direction f13511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f13512c;

        static {
            Direction direction = new Direction("CounterClockwise", 0);
            f13511b = direction;
            Direction[] directionArr = {direction, new Direction("Clockwise", 1)};
            f13512c = directionArr;
            kotlin.enums.a.a(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f13512c.clone();
        }
    }

    default void a(float f10, float f11, float f12, float f13) {
        f(f10, f11, f12, f13);
    }

    boolean b();

    void c(float f10, float f11);

    void close();

    void d(float f10, float f11, float f12, float f13, float f14, float f15);

    @p293xa.d
    void e(float f10, float f11, float f12, float f13);

    @p293xa.d
    void f(float f10, float f11, float f12, float f13);

    void g(int i10);

    default void h(float f10, float f11, float f12, float f13) {
        e(f10, f11, f12, f13);
    }

    int i();

    boolean isEmpty();

    void l(float f10, float f11);

    void m(float f10, float f11, float f12, float f13, float f14, float f15);

    void n(I.f fVar, Direction direction);

    default void o() {
        reset();
    }

    boolean p(Path path, Path path2, int i10);

    void q(I.g gVar, Direction direction);

    void r(float f10, float f11);

    void reset();

    void s(Path path, long j);

    void t(float f10, float f11);
}
