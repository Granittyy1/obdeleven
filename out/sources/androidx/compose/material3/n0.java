package androidx.compose.material3;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12655e;

    public n0(long j, long j10, long j11, long j12, long j13) {
        this.f12651a = j;
        this.f12652b = j10;
        this.f12653c = j11;
        this.f12654d = j12;
        this.f12655e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return androidx.compose.ui.graphics.H.c(this.f12651a, n0Var.f12651a) && androidx.compose.ui.graphics.H.c(this.f12652b, n0Var.f12652b) && androidx.compose.ui.graphics.H.c(this.f12653c, n0Var.f12653c) && androidx.compose.ui.graphics.H.c(this.f12654d, n0Var.f12654d) && androidx.compose.ui.graphics.H.c(this.f12655e, n0Var.f12655e);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12655e) + C4.b.c(this.f12654d, C4.b.c(this.f12653c, C4.b.c(this.f12652b, Long.hashCode(this.f12651a) * 31, 31), 31), 31);
    }
}
