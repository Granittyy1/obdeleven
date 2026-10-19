package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2209a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U.b f37522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f37524d;

    public RunnableC2209a0(U u10, U.b bVar, boolean z10) {
        this.f37524d = u10;
        this.f37522b = bVar;
        this.f37523c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37524d.f37465s.G(this.f37522b, this.f37523c);
    }
}
