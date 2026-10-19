package T1;

import A1.C0573h;

/* JADX INFO: compiled from: ConstantBitrateSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends C0573h implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5756i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f5757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f5758l;

    public a(long j, long j10, int i10, int i11, boolean z10) {
        super(j, j10, i10, i11, z10);
        this.f5755h = j10;
        this.f5756i = i10;
        this.j = i11;
        this.f5757k = z10;
        this.f5758l = j == -1 ? -1L : j;
    }

    @Override // T1.e
    public final long c() {
        return this.f5758l;
    }

    @Override // T1.e
    public final long e(long j) {
        return (Math.max(0L, j - this.f514b) * 8000000) / ((long) this.f517e);
    }

    @Override // T1.e
    public final int j() {
        return this.f5756i;
    }
}
