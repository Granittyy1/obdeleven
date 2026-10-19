package p103i2;

import A1.F;
import A1.G;
import java.math.RoundingMode;
import p114j1.A;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f36597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36601e;

    public d(b bVar, int i10, long j, long j10) {
        this.f36597a = bVar;
        this.f36598b = i10;
        this.f36599c = j;
        long j11 = (j10 - j) / ((long) bVar.f36592c);
        this.f36600d = j11;
        this.f36601e = a(j11);
    }

    public final long a(long j) {
        long j10 = j * ((long) this.f36598b);
        long j11 = this.f36597a.f36591b;
        int i10 = A.f40996a;
        return A.L(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override // A1.F
    public final boolean d() {
        return true;
    }

    @Override // A1.F
    public final F.a i(long j) {
        b bVar = this.f36597a;
        long j10 = (((long) bVar.f36591b) * j) / (((long) this.f36598b) * 1000000);
        long j11 = this.f36600d;
        long jH = A.h(j10, 0L, j11 - 1);
        long j12 = ((long) bVar.f36592c) * jH;
        long j13 = this.f36599c;
        long jA = a(jH);
        G g10 = new G(jA, j12 + j13);
        if (jA >= j || jH == j11 - 1) {
            return new F.a(g10, g10);
        }
        long j14 = jH + 1;
        return new F.a(g10, new G(a(j14), (((long) bVar.f36592c) * j14) + j13));
    }

    @Override // A1.F
    public final long k() {
        return this.f36601e;
    }
}
