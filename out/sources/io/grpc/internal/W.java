package io.grpc.internal;

import io.grpc.ChannelLogger;
import io.grpc.ConnectivityState;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class W implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f37491b;

    public W(U u10) {
        this.f37491b = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f37491b.f37468v.f2882a == ConnectivityState.f36870e) {
            this.f37491b.f37456i.a(ChannelLogger.ChannelLogLevel.f36863c, "CONNECTING as requested");
            U.f(this.f37491b, ConnectivityState.f36867b);
            U.g(this.f37491b);
        }
    }
}
