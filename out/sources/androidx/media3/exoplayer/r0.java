package androidx.media3.exoplayer;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f18600c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18602b;

    static {
        r0 r0Var = new r0(0L, 0L);
        new r0(Long.MAX_VALUE, Long.MAX_VALUE);
        new r0(Long.MAX_VALUE, 0L);
        new r0(0L, Long.MAX_VALUE);
        f18600c = r0Var;
    }

    public r0(long j, long j10) {
        p241t7.b.e(j >= 0);
        p241t7.b.e(j10 >= 0);
        this.f18601a = j;
        this.f18602b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f18601a == r0Var.f18601a && this.f18602b == r0Var.f18602b;
    }

    public final int hashCode() {
        return (((int) this.f18601a) * 31) + ((int) this.f18602b);
    }
}
