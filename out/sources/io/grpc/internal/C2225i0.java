package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: renamed from: io.grpc.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2225i0 extends io.grpc.i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.i.d f37558a;

    public C2225i0(Throwable th) {
        Status statusG = Status.f36904k.h("Panic! This is a bug!").g(th);
        io.grpc.i.d dVar = io.grpc.i.d.f36978e;
        A8.p.f("drop status shouldn't be OK", !statusG.f());
        this.f37558a = new io.grpc.i.d(null, null, statusG, true);
    }

    @Override // io.grpc.i.h
    public final io.grpc.i.d a(C2250v0 c2250v0) {
        return this.f37558a;
    }

    public final String toString() {
        com.google.common.base.d.a aVar = new com.google.common.base.d.a(C2225i0.class.getSimpleName());
        aVar.c(this.f37558a, "panicPickResult");
        return aVar.toString();
    }
}
