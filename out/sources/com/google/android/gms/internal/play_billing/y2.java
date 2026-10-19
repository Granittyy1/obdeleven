package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2 f26311c = new x2(this);

    public y2(w2 w2Var) {
        this.f26310b = new WeakReference(w2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void b(Runnable runnable, Executor executor) {
        this.f26311c.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        w2 w2Var = (w2) this.f26310b.get();
        boolean zCancel = this.f26311c.cancel(z10);
        if (!zCancel || w2Var == null) {
            return zCancel;
        }
        w2Var.f26293a = null;
        w2Var.f26294b = null;
        w2Var.f26295c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f26311c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26311c.f26290b instanceof C1990n0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26311c.isDone();
    }

    public final String toString() {
        return this.f26311c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f26311c.get(j, timeUnit);
    }
}
