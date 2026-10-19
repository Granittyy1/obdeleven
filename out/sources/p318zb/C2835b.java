package p318zb;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: zb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C2835b extends I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f49062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f49063i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f49064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C2835b f49065l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2835b f49067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f49068g;

    /* JADX INFO: renamed from: zb.b$a */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class a {
        public static final void a(C2835b c2835b, long j, boolean z10) {
            C2835b c2835b2;
            ReentrantLock reentrantLock = C2835b.f49062h;
            if (C2835b.f49065l == null) {
                C2835b.f49065l = new C2835b();
                C0565b c0565b = new C0565b("Okio Watchdog");
                c0565b.setDaemon(true);
                c0565b.start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z10) {
                c2835b.f49068g = Math.min(j, c2835b.c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                c2835b.f49068g = j + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c2835b.f49068g = c2835b.c();
            }
            long j10 = c2835b.f49068g - jNanoTime;
            C2835b c2835b3 = C2835b.f49065l;
            i.b(c2835b3);
            while (true) {
                c2835b2 = c2835b3.f49067f;
                if (c2835b2 == null || j10 < c2835b2.f49068g - jNanoTime) {
                    break;
                }
                i.b(c2835b2);
                c2835b3 = c2835b2;
            }
            c2835b.f49067f = c2835b2;
            c2835b3.f49067f = c2835b;
            if (c2835b3 == C2835b.f49065l) {
                C2835b.f49063i.signal();
            }
        }

        public static C2835b b() throws InterruptedException {
            C2835b c2835b = C2835b.f49065l;
            i.b(c2835b);
            C2835b c2835b2 = c2835b.f49067f;
            if (c2835b2 == null) {
                long jNanoTime = System.nanoTime();
                C2835b.f49063i.await(C2835b.j, TimeUnit.MILLISECONDS);
                C2835b c2835b3 = C2835b.f49065l;
                i.b(c2835b3);
                if (c2835b3.f49067f != null || System.nanoTime() - jNanoTime < C2835b.f49064k) {
                    return null;
                }
                return C2835b.f49065l;
            }
            long jNanoTime2 = c2835b2.f49068g - System.nanoTime();
            if (jNanoTime2 > 0) {
                C2835b.f49063i.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            C2835b c2835b4 = C2835b.f49065l;
            i.b(c2835b4);
            c2835b4.f49067f = c2835b2.f49067f;
            c2835b2.f49067f = null;
            c2835b2.f49066e = 2;
            return c2835b2;
        }
    }

    /* JADX INFO: renamed from: zb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    public static final class C0565b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLock = C2835b.f49062h;
                    ReentrantLock reentrantLock2 = C2835b.f49062h;
                    reentrantLock2.lock();
                    try {
                        C2835b c2835bB = a.b();
                        if (c2835bB == C2835b.f49065l) {
                            C2835b.f49065l = null;
                            reentrantLock2.unlock();
                            return;
                        } else {
                            r rVar = r.f47939a;
                            reentrantLock2.unlock();
                            if (c2835bB != null) {
                                c2835bB.k();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f49062h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        i.d(conditionNewCondition, "newCondition(...)");
        f49063i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f49064k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j10 = this.f49055c;
        boolean z10 = this.f49053a;
        if (j10 != 0 || z10) {
            ReentrantLock reentrantLock = f49062h;
            reentrantLock.lock();
            try {
                if (this.f49066e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f49066e = 1;
                a.a(this, j10, z10);
                r rVar = r.f47939a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f49062h;
        reentrantLock.lock();
        try {
            int i10 = this.f49066e;
            this.f49066e = 0;
            if (i10 != 1) {
                boolean z10 = i10 == 2;
                reentrantLock.unlock();
                return z10;
            }
            C2835b c2835b = f49065l;
            while (c2835b != null) {
                C2835b c2835b2 = c2835b.f49067f;
                if (c2835b2 == this) {
                    c2835b.f49067f = this.f49067f;
                    this.f49067f = null;
                    reentrantLock.unlock();
                    return false;
                }
                c2835b = c2835b2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void k() {
    }
}
