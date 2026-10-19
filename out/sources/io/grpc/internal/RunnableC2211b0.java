package io.grpc.internal;

import io.grpc.ConnectivityState;

/* JADX INFO: renamed from: io.grpc.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2211b0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U.e f37525b;

    public RunnableC2211b0(U.e eVar) {
        this.f37525b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U.e eVar = this.f37525b;
        U u10 = U.this;
        u10.f37459m = null;
        if (u10.f37469w != null) {
            A8.p.p("Unexpected non-null activeTransport", u10.f37467u == null);
            U.e eVar2 = this.f37525b;
            eVar2.f37480a.c(U.this.f37469w);
            return;
        }
        U.b bVar = u10.f37466t;
        U.b bVar2 = eVar.f37480a;
        if (bVar == bVar2) {
            u10.f37467u = bVar2;
            U u11 = U.this;
            u11.f37466t = null;
            U.f(u11, ConnectivityState.f36868c);
        }
    }
}
