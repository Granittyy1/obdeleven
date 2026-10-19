package R2;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: StartWorkRunnable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K2.r f5240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K2.x f5241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f5242d;

    public u(K2.r processor, K2.x xVar, WorkerParameters.a aVar) {
        kotlin.jvm.internal.i.e(processor, "processor");
        this.f5240b = processor;
        this.f5241c = xVar;
        this.f5242d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5240b.g(this.f5241c, this.f5242d);
    }
}
