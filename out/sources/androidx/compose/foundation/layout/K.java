package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class K {
    public static long a(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.f10163b;
        return p013b0.b.a(layoutOrientation == layoutOrientation2 ? p013b0.a.j(j) : p013b0.a.i(j), layoutOrientation == layoutOrientation2 ? p013b0.a.h(j) : p013b0.a.g(j), layoutOrientation == layoutOrientation2 ? p013b0.a.i(j) : p013b0.a.j(j), layoutOrientation == layoutOrientation2 ? p013b0.a.g(j) : p013b0.a.h(j));
    }

    public static long b(int i10, long j) {
        return p013b0.b.a(0, p013b0.a.h(j), (i10 & 4) != 0 ? p013b0.a.i(j) : 0, p013b0.a.g(j));
    }

    public static final long c(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.f10163b ? p013b0.b.a(p013b0.a.j(j), p013b0.a.h(j), p013b0.a.i(j), p013b0.a.g(j)) : p013b0.b.a(p013b0.a.i(j), p013b0.a.g(j), p013b0.a.j(j), p013b0.a.h(j));
    }
}
