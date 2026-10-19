package androidx.compose.material3;

/* JADX INFO: renamed from: androidx.compose.material3.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Card.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1058j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12590d;

    public C1058j(long j, long j10, long j11, long j12) {
        this.f12587a = j;
        this.f12588b = j10;
        this.f12589c = j11;
        this.f12590d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1058j)) {
            return false;
        }
        C1058j c1058j = (C1058j) obj;
        return androidx.compose.ui.graphics.H.c(this.f12587a, c1058j.f12587a) && androidx.compose.ui.graphics.H.c(this.f12588b, c1058j.f12588b) && androidx.compose.ui.graphics.H.c(this.f12589c, c1058j.f12589c) && androidx.compose.ui.graphics.H.c(this.f12590d, c1058j.f12590d);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12590d) + C4.b.c(this.f12589c, C4.b.c(this.f12588b, Long.hashCode(this.f12587a) * 31, 31), 31);
    }
}
