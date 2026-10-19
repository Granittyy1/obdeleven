package io.grpc.internal;

import io.grpc.Status;
import java.io.InputStream;

/* JADX INFO: compiled from: ForwardingClientStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class H implements InterfaceC2236o {
    @Override // io.grpc.internal.P0
    public final void a(D9.f fVar) {
        ((U.b.a) this).f37473a.a(fVar);
    }

    @Override // io.grpc.internal.P0
    public final boolean b() {
        return ((U.b.a) this).f37473a.b();
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void c(int i10) {
        ((U.b.a) this).f37473a.c(i10);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void d(int i10) {
        ((U.b.a) this).f37473a.d(i10);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void e(androidx.compose.runtime.snapshots.j jVar) {
        ((U.b.a) this).f37473a.e(jVar);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void f(Status status) {
        ((U.b.a) this).f37473a.f(status);
    }

    @Override // io.grpc.internal.P0
    public final void flush() {
        ((U.b.a) this).f37473a.flush();
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void g(D9.j jVar) {
        ((U.b.a) this).f37473a.g(jVar);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void h(D9.l lVar) {
        ((U.b.a) this).f37473a.h(lVar);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void i() {
        ((U.b.a) this).f37473a.i();
    }

    @Override // io.grpc.internal.P0
    public final void k(InputStream inputStream) {
        ((U.b.a) this).f37473a.k(inputStream);
    }

    @Override // io.grpc.internal.P0
    public final void l() {
        ((U.b.a) this).f37473a.l();
    }

    @Override // io.grpc.internal.P0
    public final void request() {
        ((U.b.a) this).f37473a.request();
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(((U.b.a) this).f37473a, "delegate");
        return aVarB.toString();
    }
}
