package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1392j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18443d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18444e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18446g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18447h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18449k = 0.97f;
    public float j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18450l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18451m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18445f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18448i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18452n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18453o = -9223372036854775807L;

    public C1392j(float f10, long j, long j10) {
        this.f18440a = j;
        this.f18441b = j10;
        this.f18442c = f10;
    }

    public final void a() {
        long j;
        long j10 = this.f18443d;
        if (j10 != -9223372036854775807L) {
            j = this.f18444e;
            if (j == -9223372036854775807L) {
                long j11 = this.f18446g;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j = this.f18447h;
                if (j == -9223372036854775807L || j10 <= j) {
                    j = j10;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f18445f == j) {
            return;
        }
        this.f18445f = j;
        this.f18448i = j;
        this.f18452n = -9223372036854775807L;
        this.f18453o = -9223372036854775807L;
        this.f18451m = -9223372036854775807L;
    }
}
