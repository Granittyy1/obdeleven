package io.grpc.internal;

import io.grpc.ChannelLogger;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f37497b;

    public Z(U u10) {
        this.f37497b = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U u10 = this.f37497b;
        u10.f37456i.a(ChannelLogger.ChannelLogLevel.f36863c, "Terminated");
        ManagedChannelImpl.n nVar = ManagedChannelImpl.n.this;
        ManagedChannelImpl.this.f37332z.remove(u10);
        ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
        ManagedChannelImpl.g(managedChannelImpl);
    }
}
