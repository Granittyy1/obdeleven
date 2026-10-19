package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f43618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2693i f43619c;

    public y0(Z z10, C2693i c2693i) {
        this.f43618b = z10;
        this.f43619c = c2693i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43619c.D(this.f43618b, p293xa.r.f47939a);
    }
}
