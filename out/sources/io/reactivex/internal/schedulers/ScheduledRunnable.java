package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, p148la.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f40894b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f40895c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f40896d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f40897e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    public ScheduledRunnable(Runnable runnable, p196pa.a aVar) {
        super(3);
        this.actual = runnable;
        lazySet(0, aVar);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f40897e) {
                return;
            }
            if (obj == f40895c) {
                future.cancel(false);
                return;
            } else if (obj == f40896d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // p148la.b
    public final boolean d() {
        Object obj = get(0);
        return obj == f40894b || obj == f40897e;
    }

    @Override // p148la.b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f40897e;
            if (obj6 == obj || obj6 == (obj4 = f40895c) || obj6 == (obj5 = f40896d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z10);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f40894b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((p196pa.a) obj2).a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f40896d;
        Object obj3 = f40895c;
        Object obj4 = f40894b;
        Object obj5 = f40897e;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            try {
                p231sa.a.c(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((p196pa.a) obj6).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((p196pa.a) obj7).a(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
