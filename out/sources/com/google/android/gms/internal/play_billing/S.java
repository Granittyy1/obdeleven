package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f26153c = new T(S.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26154b;

    public S(Object obj) {
        this.f26154b = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void b(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f26153c.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", B6.c.d("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f26154b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return C4.b.d(super.toString(), "[status=SUCCESS, result=[", this.f26154b.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f26154b;
    }
}
