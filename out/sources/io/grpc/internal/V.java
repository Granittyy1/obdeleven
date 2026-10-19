package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f37490b;

    public V(U u10) {
        this.f37490b = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U u10 = this.f37490b;
        u10.f37461o = null;
        u10.f37456i.a(ChannelLogger.ChannelLogLevel.f36863c, "CONNECTING after backoff");
        U.f(u10, ConnectivityState.f36867b);
        U.g(u10);
    }
}
