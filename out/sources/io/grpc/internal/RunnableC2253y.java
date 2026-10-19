package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelayedClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2253y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2251w f37742b;

    public RunnableC2253y(C2251w c2251w) {
        this.f37742b = c2251w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37742b.f37709f.c();
    }
}
