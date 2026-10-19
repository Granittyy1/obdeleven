package androidx.compose.material3;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12205d;

    public L(long j, long j10, long j11, long j12) {
        this.f12202a = j;
        this.f12203b = j10;
        this.f12204c = j11;
        this.f12205d = j12;
    }

    public final L a(long j, long j10, long j11, long j12) {
        return new L(j != 16 ? j : this.f12202a, j10 != 16 ? j10 : this.f12203b, j11 != 16 ? j11 : this.f12204c, j12 != 16 ? j12 : this.f12205d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return androidx.compose.ui.graphics.H.c(this.f12202a, l10.f12202a) && androidx.compose.ui.graphics.H.c(this.f12203b, l10.f12203b) && androidx.compose.ui.graphics.H.c(this.f12204c, l10.f12204c) && androidx.compose.ui.graphics.H.c(this.f12205d, l10.f12205d);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12205d) + C4.b.c(this.f12204c, C4.b.c(this.f12203b, Long.hashCode(this.f12202a) * 31, 31), 31);
    }
}
