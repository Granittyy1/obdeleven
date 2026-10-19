package androidx.compose.material3;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12252f;

    public O(long j, long j10, long j11, long j12, long j13, long j14) {
        this.f12247a = j;
        this.f12248b = j10;
        this.f12249c = j11;
        this.f12250d = j12;
        this.f12251e = j13;
        this.f12252f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return androidx.compose.ui.graphics.H.c(this.f12247a, o10.f12247a) && androidx.compose.ui.graphics.H.c(this.f12248b, o10.f12248b) && androidx.compose.ui.graphics.H.c(this.f12249c, o10.f12249c) && androidx.compose.ui.graphics.H.c(this.f12250d, o10.f12250d) && androidx.compose.ui.graphics.H.c(this.f12251e, o10.f12251e) && androidx.compose.ui.graphics.H.c(this.f12252f, o10.f12252f);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f12252f) + C4.b.c(this.f12251e, C4.b.c(this.f12250d, C4.b.c(this.f12249c, C4.b.c(this.f12248b, Long.hashCode(this.f12247a) * 31, 31), 31), 31), 31);
    }
}
