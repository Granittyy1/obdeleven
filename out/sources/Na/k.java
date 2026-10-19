package Na;

import java.util.Iterator;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements f<Long>, Iterable<Long>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4701d;

    public k(long j, long j10) {
        this.f4699b = j;
        if (j < j10) {
            long j11 = j10 % 1;
            long j12 = j % 1;
            long j13 = ((j11 < 0 ? j11 + 1 : j11) - (j12 < 0 ? j12 + 1 : j12)) % 1;
            j10 -= j13 < 0 ? j13 + 1 : j13;
        }
        this.f4700c = j10;
        this.f4701d = 1L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!isEmpty() || !((k) obj).isEmpty()) {
                k kVar = (k) obj;
                if (this.f4699b == kVar.f4699b) {
                    if (this.f4700c == kVar.f4700c) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f4699b;
        long j10 = ((long) 31) * (j ^ (j >>> 32));
        long j11 = this.f4700c;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    @Override // Na.f
    public final boolean isEmpty() {
        return this.f4699b > this.f4700c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new j(this.f4699b, this.f4700c, this.f4701d);
    }

    @Override // Na.f
    public final Comparable k() {
        return Long.valueOf(this.f4699b);
    }

    @Override // Na.f
    public final Comparable q() {
        return Long.valueOf(this.f4700c);
    }

    public final String toString() {
        return this.f4699b + ".." + this.f4700c;
    }
}
