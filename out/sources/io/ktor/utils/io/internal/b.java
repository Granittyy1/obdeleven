package io.ktor.utils.io.internal;

import io.ktor.utils.io.ClosedWriteChannelException;

/* JADX INFO: compiled from: ByteBufferChannelInternals.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f40607b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f40608a;

    public b(Throwable th) {
        this.f40608a = th;
    }

    public final Throwable a() {
        Throwable th = this.f40608a;
        return th == null ? new ClosedWriteChannelException("The channel was closed") : th;
    }

    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
