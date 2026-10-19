package p131k5;

import U4.C0804l;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493c1 extends D1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f42109k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2508f1 f42110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2508f1 f42111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue<C2513g1<?>> f42112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f42113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2503e1 f42114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2503e1 f42115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f42116i;
    public final Semaphore j;

    public C2493c1(C2523i1 c2523i1) {
        super(c2523i1);
        this.f42116i = new Object();
        this.j = new Semaphore(2);
        this.f42112e = new PriorityBlockingQueue<>();
        this.f42113f = new LinkedBlockingQueue();
        this.f42114g = new C2503e1(this, "Thread death: Uncaught exception on worker thread");
        this.f42115h = new C2503e1(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) throws IllegalStateException {
        q();
        v(new C2513g1<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean B() {
        return Thread.currentThread() == this.f42110c;
    }

    public final void C() {
        if (Thread.currentThread() != this.f42111d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // J2.l
    public final void p() {
        if (Thread.currentThread() != this.f42110c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p131k5.D1
    public final boolean s() {
        return false;
    }

    public final <T> T t(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            i().z(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                d().f41715i.c("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        T t8 = atomicReference.get();
        if (t8 == null) {
            d().f41715i.c("Timed out waiting for ".concat(str));
        }
        return t8;
    }

    public final C2513g1 u(Callable callable) throws IllegalStateException {
        q();
        C2513g1<?> c2513g1 = new C2513g1<>(this, callable, false);
        if (Thread.currentThread() == this.f42110c) {
            if (!this.f42112e.isEmpty()) {
                d().f41715i.c("Callable skipped the worker queue.");
            }
            c2513g1.run();
        } else {
            v(c2513g1);
        }
        return c2513g1;
    }

    public final void v(C2513g1<?> c2513g1) {
        synchronized (this.f42116i) {
            try {
                this.f42112e.add(c2513g1);
                C2508f1 c2508f1 = this.f42110c;
                if (c2508f1 == null) {
                    C2508f1 c2508f2 = new C2508f1(this, "Measurement Worker", this.f42112e);
                    this.f42110c = c2508f2;
                    c2508f2.setUncaughtExceptionHandler(this.f42114g);
                    this.f42110c.start();
                } else {
                    synchronized (c2508f1.f42162b) {
                        c2508f1.f42162b.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Runnable runnable) throws IllegalStateException {
        q();
        C2513g1 c2513g1 = new C2513g1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f42116i) {
            try {
                this.f42113f.add(c2513g1);
                C2508f1 c2508f1 = this.f42111d;
                if (c2508f1 == null) {
                    C2508f1 c2508f2 = new C2508f1(this, "Measurement Network", this.f42113f);
                    this.f42111d = c2508f2;
                    c2508f2.setUncaughtExceptionHandler(this.f42115h);
                    this.f42111d.start();
                } else {
                    synchronized (c2508f1.f42162b) {
                        c2508f1.f42162b.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C2513g1 y(Callable callable) throws IllegalStateException {
        q();
        C2513g1<?> c2513g1 = new C2513g1<>(this, callable, true);
        if (Thread.currentThread() == this.f42110c) {
            c2513g1.run();
        } else {
            v(c2513g1);
        }
        return c2513g1;
    }

    public final void z(Runnable runnable) throws IllegalStateException {
        q();
        C0804l.h(runnable);
        v(new C2513g1<>(this, runnable, false, "Task exception on worker thread"));
    }
}
