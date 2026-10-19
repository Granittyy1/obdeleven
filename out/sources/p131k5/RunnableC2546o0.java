package p131k5;

/* JADX INFO: renamed from: k5.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2546o0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2481a f42316c;

    public RunnableC2546o0(C2481a c2481a, long j) {
        this.f42315b = j;
        this.f42316c = c2481a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42316c.y(this.f42315b);
    }
}
