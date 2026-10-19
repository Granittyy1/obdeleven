package androidx.compose.ui.text;

import A1.C0575j;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f15314b = O.h.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15315c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15316a;

    public /* synthetic */ E(long j) {
        this.f15316a = j;
    }

    public static final boolean a(long j, long j10) {
        return j == j10;
    }

    public static final boolean b(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int c(long j) {
        return d(j) - e(j);
    }

    public static final int d(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int e(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean f(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String g(long j) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return C0575j.b(sb2, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return this.f15316a == ((E) obj).f15316a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15316a);
    }

    public final String toString() {
        return g(this.f15316a);
    }
}
