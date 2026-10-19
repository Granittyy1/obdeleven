package io.grpc.okhttp;

import io.grpc.internal.C2220g;
import java.util.logging.Level;

/* JADX INFO: compiled from: OkHttpChannelBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2220g.a f37842b;

    public b(C2220g.a aVar) {
        this.f37842b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2220g.a aVar = this.f37842b;
        long j = aVar.f37543a;
        long jMax = Math.max(2 * j, j);
        C2220g c2220g = C2220g.this;
        if (c2220g.f37542b.compareAndSet(j, jMax)) {
            C2220g.f37540c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{c2220g.f37541a, Long.valueOf(jMax)});
        }
    }
}
