package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: compiled from: ForwardingConnectionClientTransport.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J implements InterfaceC2243s {
    public abstract InterfaceC2243s a();

    @Override // io.grpc.internal.InterfaceC2239p0
    public void c(Status status) {
        a().c(status);
    }

    @Override // io.grpc.internal.InterfaceC2239p0
    public final Runnable d(InterfaceC2239p0.a aVar) {
        return a().d(aVar);
    }

    @Override // D9.q
    public final D9.r e() {
        return a().e();
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(a(), "delegate");
        return aVarB.toString();
    }
}
