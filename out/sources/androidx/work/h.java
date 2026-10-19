package androidx.work;

import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C2700k0;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h<R> implements p107i6.f<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<R> f20359b;

    public h() {
        throw null;
    }

    public h(C2700k0 c2700k0) {
        this.f20359b = new androidx.work.impl.utils.futures.a<>();
        c2700k0.B(new Ia.l<Throwable, p293xa.r>(this) { // from class: androidx.work.JobListenableFuture$1
            final /* synthetic */ h<Object> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                Throwable th2 = th;
                if (th2 == null) {
                    if (!this.this$0.f20359b.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    this.this$0.f20359b.cancel(true);
                } else {
                    androidx.work.impl.utils.futures.a<Object> aVar = this.this$0.f20359b;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    aVar.l(th2);
                }
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // p107i6.f
    public final void a(Runnable runnable, Executor executor) {
        this.f20359b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f20359b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f20359b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20359b.f20427b instanceof AbstractFuture.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20359b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.f20359b.get(j, timeUnit);
    }
}
