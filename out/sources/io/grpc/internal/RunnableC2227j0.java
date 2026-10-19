package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2227j0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManagedChannelImpl.d f37563b;

    public RunnableC2227j0(ManagedChannelImpl.d dVar) {
        this.f37563b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ManagedChannelImpl.this.h();
    }
}
