package io.ktor.websocket;

import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2711v;

/* JADX INFO: compiled from: ProtocolViolationException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProtocolViolationException extends Exception implements InterfaceC2711v<ProtocolViolationException> {
    private final String violation;

    public ProtocolViolationException(String violation) {
        i.e(violation, "violation");
        this.violation = violation;
    }

    @Override // kotlinx.coroutines.InterfaceC2711v
    public final Throwable a() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        protocolViolationException.initCause(this);
        return protocolViolationException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Received illegal frame: " + this.violation;
    }
}
