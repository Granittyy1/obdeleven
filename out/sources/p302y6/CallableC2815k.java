package p302y6;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: y6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2815k implements Callable<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f48379b;

    public CallableC2815k(x xVar) {
        this.f48379b = xVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f48379b.run();
        return null;
    }
}
