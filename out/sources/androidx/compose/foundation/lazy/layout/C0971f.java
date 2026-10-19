package androidx.compose.foundation.lazy.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0971f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyLayoutIntervalContent.Interval f10717c;

    public C0971f(int i10, int i11, LazyLayoutIntervalContent.Interval interval) {
        this.f10715a = i10;
        this.f10716b = i11;
        this.f10717c = interval;
        if (i10 < 0) {
            p245u.c.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        p245u.c.a("size should be > 0");
    }
}
