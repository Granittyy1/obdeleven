package io.grpc.internal;

/* JADX INFO: compiled from: DelayedStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f36986b;

    public A(B b10) {
        this.f36986b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36986b.f37005c.request();
    }
}
