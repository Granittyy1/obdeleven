package io.grpc.internal;

import io.grpc.StatusException;

/* JADX INFO: compiled from: Http2Ping.java */
/* JADX INFO: loaded from: classes3.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2238p.a f37438b;

    public S(InterfaceC2238p.a aVar, StatusException statusException) {
        this.f37438b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37438b.onFailure();
    }
}
