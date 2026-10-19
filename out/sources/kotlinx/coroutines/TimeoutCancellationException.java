package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TimeoutCancellationException extends CancellationException implements InterfaceC2711v<TimeoutCancellationException> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient F0 f43205b;

    public TimeoutCancellationException(String str, F0 f10) {
        super(str);
        this.f43205b = f10;
    }

    @Override // kotlinx.coroutines.InterfaceC2711v
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f43205b);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
