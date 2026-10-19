package io.grpc.internal;

import io.grpc.MethodDescriptor;
import io.grpc.Status;

/* JADX INFO: compiled from: FailingClientTransport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G implements InterfaceC2238p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f37190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClientStreamListener.RpcProgress f37191b;

    public G(Status status, ClientStreamListener.RpcProgress rpcProgress) {
        A8.p.f("error must not be OK", !status.f());
        this.f37190a = status;
        this.f37191b = rpcProgress;
    }

    @Override // io.grpc.internal.InterfaceC2238p
    public final InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) {
        return new F(this.f37190a, this.f37191b, cVarArr);
    }

    @Override // D9.q
    public final D9.r e() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
