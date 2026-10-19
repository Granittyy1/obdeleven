package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k0 f13652d = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13655c;

    public k0(float f10, long j, long j10) {
        this.f13653a = j;
        this.f13654b = j10;
        this.f13655c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return H.c(this.f13653a, k0Var.f13653a) && I.d.b(this.f13654b, k0Var.f13654b) && this.f13655c == k0Var.f13655c;
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Float.hashCode(this.f13655c) + C4.b.c(this.f13654b, Long.hashCode(this.f13653a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        C4.v.h(this.f13653a, ", offset=", sb2);
        sb2.append((Object) I.d.i(this.f13654b));
        sb2.append(", blurRadius=");
        return B7.b.d(sb2, this.f13655c, ')');
    }

    public /* synthetic */ k0() {
        this(0.0f, Q3.d.e(4278190080L), 0L);
    }
}
