package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.c;
import kotlinx.coroutines.C2693i;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final c<R> continuation;

    public ContinuationOutcomeReceiver(C2693i c2693i) {
        super(false);
        this.continuation = c2693i;
    }

    public final void onError(E e10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(b.a(e10));
        }
    }

    public final void onResult(R r10) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r10);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
