package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CancelTimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CancelTimeoutCancellationException f14015b = new CancelTimeoutCancellationException();

    private CancelTimeoutCancellationException() {
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(C.f14014a);
        return this;
    }
}
