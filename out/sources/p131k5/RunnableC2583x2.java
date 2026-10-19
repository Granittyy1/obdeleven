package p131k5;

/* JADX INFO: renamed from: k5.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2583x2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2567t2 f42531c;

    public RunnableC2583x2(C2567t2 c2567t2, long j) {
        this.f42530b = j;
        this.f42531c = c2567t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2567t2 c2567t2 = this.f42531c;
        ((C2523i1) c2567t2.f3968a).m().t(this.f42530b);
        c2567t2.f42465e = null;
    }
}
