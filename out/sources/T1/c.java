package T1;

import A1.F;
import A1.G;
import android.util.Pair;
import p114j1.A;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f5762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f5763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5764c;

    public c(long j, long[] jArr, long[] jArr2) {
        this.f5762a = jArr;
        this.f5763b = jArr2;
        this.f5764c = j == -9223372036854775807L ? A.F(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> a(long j, long[] jArr, long[] jArr2) {
        int iD = A.d(jArr, j, true);
        long j10 = jArr[iD];
        long j11 = jArr2[iD];
        int i10 = iD + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j12 == j10 ? 0.0d : (j - j10) / (j12 - j10)) * (jArr2[i10] - j11))) + j11));
    }

    @Override // T1.e
    public final long c() {
        return -1L;
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // T1.e
    public final long e(long j) {
        return A.F(((Long) a(j, this.f5762a, this.f5763b).second).longValue());
    }

    @Override // A1.F
    public final F.a i(long j) {
        Pair<Long, Long> pairA = a(A.Q(A.h(j, 0L, this.f5764c)), this.f5763b, this.f5762a);
        G g10 = new G(A.F(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new F.a(g10, g10);
    }

    @Override // T1.e
    public final int j() {
        return -2147483647;
    }

    @Override // A1.F
    public final long k() {
        return this.f5764c;
    }
}
