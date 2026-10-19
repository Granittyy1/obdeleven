package androidx.compose.material3;

/* JADX INFO: renamed from: androidx.compose.material3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1050e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12441d;

    public C1050e(long j, long j10, long j11, long j12) {
        this.f12438a = j;
        this.f12439b = j10;
        this.f12440c = j11;
        this.f12441d = j12;
    }

    public final C1050e a(long j, long j10, long j11, long j12) {
        return new C1050e(j != 16 ? j : this.f12438a, j10 != 16 ? j10 : this.f12439b, j11 != 16 ? j11 : this.f12440c, j12 != 16 ? j12 : this.f12441d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1050e)) {
            return false;
        }
        C1050e c1050e = (C1050e) obj;
        return androidx.compose.ui.graphics.H.c(this.f12438a, c1050e.f12438a) && androidx.compose.ui.graphics.H.c(this.f12439b, c1050e.f12439b) && androidx.compose.ui.graphics.H.c(this.f12440c, c1050e.f12440c) && androidx.compose.ui.graphics.H.c(this.f12441d, c1050e.f12441d);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12441d) + C4.b.c(this.f12440c, C4.b.c(this.f12439b, Long.hashCode(this.f12438a) * 31, 31), 31);
    }
}
