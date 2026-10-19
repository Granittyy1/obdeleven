package io.grpc.internal;

import io.grpc.MethodDescriptor;

/* JADX INFO: renamed from: io.grpc.internal.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClientTransport.java */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2238p extends D9.q<Object> {

    /* JADX INFO: renamed from: io.grpc.internal.p$a */
    /* JADX INFO: compiled from: ClientTransport.java */
    public interface a {
        void onFailure();
    }

    InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr);
}
