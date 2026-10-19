package io.grpc.internal;

/* JADX INFO: compiled from: ForwardingNameResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L extends io.grpc.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.n f37263a;

    public L(io.grpc.n nVar) {
        this.f37263a = nVar;
    }

    @Override // io.grpc.n
    public String a() {
        return this.f37263a.a();
    }

    @Override // io.grpc.n
    public final void b() {
        this.f37263a.b();
    }

    @Override // io.grpc.n
    public void c() {
        this.f37263a.c();
    }

    @Override // io.grpc.n
    public void d(io.grpc.n.d dVar) {
        this.f37263a.d(dVar);
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.f37263a, "delegate");
        return aVarB.toString();
    }
}
