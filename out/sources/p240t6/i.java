package p240t6;

import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DelegatingScheduledFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i<V> extends AbstractResolvableFuture<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledFuture<?> f47349i;

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: compiled from: DelegatingScheduledFuture.java */
    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public i(b<V> bVar) {
        this.f47349i = bVar.a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f47349i.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void d() {
        ScheduledFuture<?> scheduledFuture = this.f47349i;
        Object obj = this.f15849b;
        scheduledFuture.cancel((obj instanceof AbstractResolvableFuture.b) && ((AbstractResolvableFuture.b) obj).f15855a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f47349i.getDelay(timeUnit);
    }
}
