package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Scrollable.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlingCancellationException extends CancellationException {
    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(w.f10055a);
        return this;
    }
}
