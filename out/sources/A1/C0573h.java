package A1;

/* JADX INFO: renamed from: A1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ConstantBitrateSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public class C0573h implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f519g;

    public C0573h(long j, long j10, int i10, int i11, boolean z10) {
        this.f513a = j;
        this.f514b = j10;
        this.f515c = i11 == -1 ? 1 : i11;
        this.f517e = i10;
        this.f519g = z10;
        if (j == -1) {
            this.f516d = -1L;
            this.f518f = -9223372036854775807L;
        } else {
            long j11 = j - j10;
            this.f516d = j11;
            this.f518f = (Math.max(0L, j11) * 8000000) / ((long) i10);
        }
    }

    @Override // A1.F
    public final boolean d() {
        return this.f516d != -1 || this.f519g;
    }

    @Override // A1.F
    public final F.a i(long j) {
        long j10 = this.f516d;
        long j11 = this.f514b;
        if (j10 == -1 && !this.f519g) {
            G g10 = new G(0L, j11);
            return new F.a(g10, g10);
        }
        int i10 = this.f517e;
        long j12 = this.f515c;
        long jMin = (((((long) i10) * j) / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i10);
        G g11 = new G(jMax2, jMax);
        if (j10 != -1 && jMax2 < j) {
            long j13 = jMax + j12;
            if (j13 < this.f513a) {
                return new F.a(g11, new G((Math.max(0L, j13 - j11) * 8000000) / ((long) i10), j13));
            }
        }
        return new F.a(g11, g11);
    }

    @Override // A1.F
    public final long k() {
        return this.f518f;
    }
}
