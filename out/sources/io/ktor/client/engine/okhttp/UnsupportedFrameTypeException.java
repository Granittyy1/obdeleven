package io.ktor.client.engine.okhttp;

import kotlin.jvm.internal.i;
import kotlinx.coroutines.InterfaceC2711v;

/* JADX INFO: compiled from: OkHttpWebsocketSession.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedFrameTypeException extends IllegalArgumentException implements InterfaceC2711v<UnsupportedFrameTypeException> {
    private final p098ha.a frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedFrameTypeException(p098ha.a frame) {
        super("Unsupported frame type: " + frame);
        i.e(frame, "frame");
    }

    @Override // kotlinx.coroutines.InterfaceC2711v
    public final Throwable a() {
        UnsupportedFrameTypeException unsupportedFrameTypeException = new UnsupportedFrameTypeException(this.frame);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
