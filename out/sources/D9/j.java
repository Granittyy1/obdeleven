package D9;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Deadline.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2887e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f2889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f2890h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f2893d;

    /* JADX INFO: compiled from: Deadline.java */
    public static class a extends b {
    }

    /* JADX INFO: compiled from: Deadline.java */
    public static abstract class b {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f2888f = nanos;
        f2889g = -nanos;
        f2890h = TimeUnit.SECONDS.toNanos(1L);
    }

    public j(long j) {
        a aVar = f2887e;
        long jNanoTime = System.nanoTime();
        this.f2891b = aVar;
        long jMin = Math.min(f2888f, Math.max(f2889g, j));
        this.f2892c = jNanoTime + jMin;
        this.f2893d = jMin <= 0;
    }

    public final void a(j jVar) {
        a aVar = jVar.f2891b;
        a aVar2 = this.f2891b;
        if (aVar2 == aVar) {
            return;
        }
        throw new AssertionError("Tickers (" + aVar2 + " and " + jVar.f2891b + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final boolean b() {
        if (!this.f2893d) {
            long j = this.f2892c;
            this.f2891b.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.f2893d = true;
        }
        return true;
    }

    public final long c(TimeUnit timeUnit) {
        this.f2891b.getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f2893d && this.f2892c - jNanoTime <= 0) {
            this.f2893d = true;
        }
        return timeUnit.convert(this.f2892c - jNanoTime, TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        a(jVar2);
        long j = this.f2892c - jVar2.f2892c;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        a aVar = this.f2891b;
        if (aVar != null ? aVar == jVar.f2891b : jVar.f2891b == null) {
            return this.f2892c == jVar.f2892c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.f2891b, Long.valueOf(this.f2892c)).hashCode();
    }

    public final String toString() {
        long jC = c(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jC);
        long j = f2890h;
        long j10 = jAbs / j;
        long jAbs2 = Math.abs(jC) % j;
        StringBuilder sb2 = new StringBuilder();
        if (jC < 0) {
            sb2.append('-');
        }
        sb2.append(j10);
        if (jAbs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb2.append("s from now");
        a aVar = f2887e;
        a aVar2 = this.f2891b;
        if (aVar2 != aVar) {
            sb2.append(" (ticker=" + aVar2 + ")");
        }
        return sb2.toString();
    }
}
