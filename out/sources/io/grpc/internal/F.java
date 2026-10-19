package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: compiled from: FailingClientStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends C2242r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Status f37181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ClientStreamListener.RpcProgress f37182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.grpc.c[] f37183e;

    public F(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.c[] cVarArr) {
        A8.p.f("error must not be OK", !status.f());
        this.f37181c = status;
        this.f37182d = rpcProgress;
        this.f37183e = cVarArr;
    }

    @Override // io.grpc.internal.C2242r0, io.grpc.internal.InterfaceC2236o
    public final void e(androidx.compose.runtime.snapshots.j jVar) {
        jVar.a(this.f37181c, "error");
        jVar.a(this.f37182d, "progress");
    }

    @Override // io.grpc.internal.C2242r0, io.grpc.internal.InterfaceC2236o
    public final void j(ClientStreamListener clientStreamListener) {
        A8.p.p("already started", !this.f37180b);
        this.f37180b = true;
        io.grpc.c[] cVarArr = this.f37183e;
        int length = cVarArr.length;
        int i10 = 0;
        while (true) {
            Status status = this.f37181c;
            if (i10 >= length) {
                clientStreamListener.d(status, this.f37182d, new io.grpc.m());
                return;
            } else {
                cVarArr[i10].g0(status);
                i10++;
            }
        }
    }
}
