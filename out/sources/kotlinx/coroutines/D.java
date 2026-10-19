package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends V implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f43171k;

    static {
        Long l10;
        D d10 = new D();
        j = d10;
        d10.f1(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f43171k = timeUnit.toNanos(l10.longValue());
    }

    @Override // kotlinx.coroutines.W
    public final Thread j1() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(D.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.W
    public final void k1(long j10, V.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.V
    public final void l1(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.l1(runnable);
    }

    @Override // kotlinx.coroutines.V, kotlinx.coroutines.H
    public final P m0(long j10, Runnable runnable, kotlin.coroutines.e eVar) {
        long j11 = 0;
        if (j10 > 0) {
            j11 = j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10;
        }
        if (j11 >= 4611686018427387903L) {
            return t0.f43613b;
        }
        long jNanoTime = System.nanoTime();
        V.b bVar = new V.b(runnable, j11 + jNanoTime);
        o1(jNanoTime, bVar);
        return bVar;
    }

    public final synchronized void p1() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            V.f43210g.set(this, null);
            V.f43211h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        D0.f43172a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    _thread = null;
                    p1();
                    if (n1()) {
                        return;
                    }
                    j1();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j10 = Long.MAX_VALUE;
                long j11 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jH1 = h1();
                    if (jH1 == j10) {
                        long jNanoTime = System.nanoTime();
                        if (j11 == j10) {
                            j11 = f43171k + jNanoTime;
                        }
                        long j12 = j11 - jNanoTime;
                        if (j12 <= 0) {
                            _thread = null;
                            p1();
                            if (n1()) {
                                return;
                            }
                            j1();
                            return;
                        }
                        jH1 = Na.l.A(jH1, j12);
                    } else {
                        j11 = Long.MAX_VALUE;
                    }
                    if (jH1 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            p1();
                            if (n1()) {
                                return;
                            }
                            j1();
                            return;
                        }
                        LockSupport.parkNanos(this, jH1);
                    }
                    j10 = Long.MAX_VALUE;
                }
            }
        } catch (Throwable th) {
            _thread = null;
            p1();
            if (!n1()) {
                j1();
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.V, kotlinx.coroutines.U
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
