package io.grpc.internal;

/* JADX INFO: compiled from: RetriableStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 implements B0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7.d f37178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f37179b;

    public E0(B0 b10, N7.d dVar) {
        this.f37179b = b10;
        this.f37178a = dVar;
    }

    @Override // io.grpc.internal.B0.m
    public final void a(B0.w wVar) {
        wVar.f37119a.k(this.f37179b.f37045a.f36889d.b(this.f37178a));
        wVar.f37119a.flush();
    }
}
