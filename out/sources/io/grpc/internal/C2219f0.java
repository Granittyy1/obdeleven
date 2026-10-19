package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: renamed from: io.grpc.internal.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KeepAliveManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2219f0 implements InterfaceC2238p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeepAliveManager.c f37539a;

    public C2219f0(KeepAliveManager.c cVar) {
        this.f37539a = cVar;
    }

    @Override // io.grpc.internal.InterfaceC2238p.a
    public final void onFailure() {
        this.f37539a.f37262a.q(Status.f36905l.h("Keepalive failed. The connection is likely gone"));
    }
}
