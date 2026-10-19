package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FlowExceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient InterfaceC2687d f43373b;

    public AbortFlowException(InterfaceC2687d interfaceC2687d) {
        super("Flow was aborted, no more elements needed");
        this.f43373b = interfaceC2687d;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
