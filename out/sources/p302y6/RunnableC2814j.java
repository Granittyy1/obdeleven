package p302y6;

/* JADX INFO: renamed from: y6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2814j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2818n f48378b;

    public RunnableC2814j(C2818n c2818n) {
        this.f48378b = c2818n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48378b.f48384d.set(Boolean.TRUE);
    }
}
