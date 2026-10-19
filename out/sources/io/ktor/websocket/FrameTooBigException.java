package io.ktor.websocket;

import kotlinx.coroutines.InterfaceC2711v;

/* JADX INFO: compiled from: FrameTooBigException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FrameTooBigException extends Exception implements InterfaceC2711v<FrameTooBigException> {
    private final long frameSize;

    public FrameTooBigException(long j) {
        this.frameSize = j;
    }

    @Override // kotlinx.coroutines.InterfaceC2711v
    public final Throwable a() {
        FrameTooBigException frameTooBigException = new FrameTooBigException(this.frameSize);
        frameTooBigException.initCause(this);
        return frameTooBigException;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.frameSize;
    }
}
