package io.grpc.internal;

import io.grpc.MethodDescriptor;

/* JADX INFO: compiled from: ForwardingManagedChannel.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class K extends D9.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManagedChannelImpl f37239a;

    public K(ManagedChannelImpl managedChannelImpl) {
        this.f37239a = managedChannelImpl;
    }

    @Override // D9.a
    public final String a() {
        return this.f37239a.f37326t.a();
    }

    @Override // D9.a
    public final <RequestT, ResponseT> D9.b<RequestT, ResponseT> f(MethodDescriptor<RequestT, ResponseT> methodDescriptor, io.grpc.b bVar) {
        return this.f37239a.f37326t.f(methodDescriptor, bVar);
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f37239a, "delegate");
        return aVarB.toString();
    }
}
