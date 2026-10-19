package io.grpc.internal;

import java.util.Collection;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: RetriableStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f37129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0.w f37130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Future f37131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Future f37132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B0 f37133f;

    public C0(B0 b10, Collection collection, B0.w wVar, Future future, Future future2) {
        this.f37133f = b10;
        this.f37129b = collection;
        this.f37130c = wVar;
        this.f37131d = future;
        this.f37132e = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (B0.w wVar : this.f37129b) {
            if (wVar != this.f37130c) {
                wVar.f37119a.f(B0.f37043C);
            }
        }
        Future future = this.f37131d;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f37132e;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f37133f.u();
    }
}
