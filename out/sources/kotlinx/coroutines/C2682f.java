package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: kotlinx.coroutines.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2682f implements InterfaceC2689g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledFuture f43302b;

    public C2682f(ScheduledFuture scheduledFuture) {
        this.f43302b = scheduledFuture;
    }

    @Override // kotlinx.coroutines.InterfaceC2689g
    public final void a(Throwable th) {
        if (th != null) {
            this.f43302b.cancel(false);
        }
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f43302b + ']';
    }
}
