package io.grpc.internal;

/* JADX INFO: compiled from: ForwardingClientStreamListener.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I implements ClientStreamListener {
    @Override // io.grpc.internal.Q0
    public final void a(Q0.a aVar) {
        ((U.b.a.C0391a) this).f37475a.a(aVar);
    }

    @Override // io.grpc.internal.ClientStreamListener
    public final void b(io.grpc.m mVar) {
        ((U.b.a.C0391a) this).f37475a.b(mVar);
    }

    @Override // io.grpc.internal.Q0
    public final void c() {
        ((U.b.a.C0391a) this).f37475a.c();
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(((U.b.a.C0391a) this).f37475a, "delegate");
        return aVarB.toString();
    }
}
