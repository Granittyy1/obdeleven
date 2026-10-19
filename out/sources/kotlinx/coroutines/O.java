package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class O implements P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f43201b;

    public O(ScheduledFuture scheduledFuture) {
        this.f43201b = scheduledFuture;
    }

    @Override // kotlinx.coroutines.P
    public final void dispose() {
        this.f43201b.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f43201b + ']';
    }
}
