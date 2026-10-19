package A1;

import java.util.Arrays;

/* JADX INFO: renamed from: A1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0572g implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f512f;

    public C0572g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f508b = iArr;
        this.f509c = jArr;
        this.f510d = jArr2;
        this.f511e = jArr3;
        int length = iArr.length;
        this.f507a = length;
        if (length > 0) {
            this.f512f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f512f = 0L;
        }
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // A1.F
    public final F.a i(long j) {
        long[] jArr = this.f511e;
        int iD = p114j1.A.d(jArr, j, true);
        long j10 = jArr[iD];
        long[] jArr2 = this.f509c;
        G g10 = new G(j10, jArr2[iD]);
        if (j10 >= j || iD == this.f507a - 1) {
            return new F.a(g10, g10);
        }
        int i10 = iD + 1;
        return new F.a(g10, new G(jArr[i10], jArr2[i10]));
    }

    @Override // A1.F
    public final long k() {
        return this.f512f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f507a + ", sizes=" + Arrays.toString(this.f508b) + ", offsets=" + Arrays.toString(this.f509c) + ", timeUs=" + Arrays.toString(this.f511e) + ", durationsUs=" + Arrays.toString(this.f510d) + ")";
    }
}
