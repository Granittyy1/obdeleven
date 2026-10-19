package io.grpc.internal;

import com.braze.Constants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SerializingExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 implements Executor, Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f37233e = Logger.getLogger(J0.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f37234f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f37235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f37236c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f37237d = 0;

    /* JADX INFO: compiled from: SerializingExecutor.java */
    public static abstract class a {
        public abstract boolean a(J0 j10);

        public abstract void b(J0 j10);
    }

    /* JADX INFO: compiled from: SerializingExecutor.java */
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<J0> f37238a;

        public b(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f37238a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.J0.a
        public final boolean a(J0 j10) {
            return this.f37238a.compareAndSet(j10, 0, -1);
        }

        @Override // io.grpc.internal.J0.a
        public final void b(J0 j10) {
            this.f37238a.set(j10, 0);
        }
    }

    /* JADX INFO: compiled from: SerializingExecutor.java */
    public static final class c extends a {
        @Override // io.grpc.internal.J0.a
        public final boolean a(J0 j10) {
            synchronized (j10) {
                try {
                    if (j10.f37237d != 0) {
                        return false;
                    }
                    j10.f37237d = -1;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.J0.a
        public final void b(J0 j10) {
            synchronized (j10) {
                j10.f37237d = 0;
            }
        }
    }

    static {
        a cVar;
        try {
            cVar = new b(AtomicIntegerFieldUpdater.newUpdater(J0.class, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE));
        } catch (Throwable th) {
            f37233e.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            cVar = new c();
        }
        f37234f = cVar;
    }

    public J0(Executor executor) {
        A8.p.j(executor, "'executor' must not be null.");
        this.f37235b = executor;
    }

    public final void a(Runnable runnable) {
        a aVar = f37234f;
        if (aVar.a(this)) {
            try {
                this.f37235b.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f37236c.remove(runnable);
                }
                aVar.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f37236c;
        A8.p.j(runnable, "'r' must not be null.");
        concurrentLinkedQueue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        a aVar = f37234f;
        while (true) {
            concurrentLinkedQueue = this.f37236c;
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e10) {
                    f37233e.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e10);
                }
            } catch (Throwable th) {
                aVar.b(this);
                throw th;
            }
        }
        aVar.b(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a(null);
    }
}
