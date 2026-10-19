package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends Y implements H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f43221c;

    public Z(Executor executor) {
        Method method;
        this.f43221c = executor;
        Method method2 = kotlinx.coroutines.internal.c.f43469a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = kotlinx.coroutines.internal.c.f43469a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kotlinx.coroutines.H
    public final void N(long j, C2693i c2693i) {
        Executor executor = this.f43221c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new y0(this, c2693i), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                C2702l0.b(c2693i.f43448f, kotlin.jvm.internal.h.b("The task was rejected", e10));
            }
        }
        if (scheduledFutureSchedule != null) {
            c2693i.v(new C2682f(scheduledFutureSchedule));
        } else {
            D.j.N(j, c2693i);
        }
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        try {
            this.f43221c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C2702l0.b(eVar, kotlin.jvm.internal.h.b("The task was rejected", e10));
            N.f43200c.Z0(eVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f43221c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Z) && ((Z) obj).f43221c == this.f43221c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f43221c);
    }

    @Override // kotlinx.coroutines.H
    public final P m0(long j, Runnable runnable, kotlin.coroutines.e eVar) {
        Executor executor = this.f43221c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                C2702l0.b(eVar, kotlin.jvm.internal.h.b("The task was rejected", e10));
            }
        }
        return scheduledFutureSchedule != null ? new O(scheduledFutureSchedule) : D.j.m0(j, runnable, eVar);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final String toString() {
        return this.f43221c.toString();
    }
}
