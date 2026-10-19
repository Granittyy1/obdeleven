package p052e0;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p107i6.f;

/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<androidx.concurrent.futures.a<T>> f34707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0358a f34708c = new C0358a();

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public class C0358a extends AbstractResolvableFuture<T> {
        public C0358a() {
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture
        public final String i() {
            androidx.concurrent.futures.a<T> aVar = a.this.f34707b.get();
            if (aVar == null) {
                return "Completer object has been garbage collected, future will fail soon";
            }
            return "tag=[" + aVar.f15869a + "]";
        }
    }

    public a(androidx.concurrent.futures.a<T> aVar) {
        this.f34707b = new WeakReference<>(aVar);
    }

    @Override // p107i6.f
    public final void a(Runnable runnable, Executor executor) {
        this.f34708c.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        androidx.concurrent.futures.a<T> aVar = this.f34707b.get();
        boolean zCancel = this.f34708c.cancel(z10);
        if (zCancel && aVar != null) {
            aVar.f15869a = null;
            aVar.f15870b = null;
            aVar.f15871c.k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        return this.f34708c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34708c.f15849b instanceof AbstractResolvableFuture.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34708c.isDone();
    }

    public final String toString() {
        return this.f34708c.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f34708c.get(j, timeUnit);
    }
}
