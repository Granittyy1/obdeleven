package p131k5;

/* JADX INFO: renamed from: k5.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2575v2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2559r2 f42497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2559r2 f42498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f42499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2567t2 f42501f;

    public RunnableC2575v2(C2567t2 c2567t2, C2559r2 c2559r2, C2559r2 c2559r3, long j, boolean z10) {
        this.f42497b = c2559r2;
        this.f42498c = c2559r3;
        this.f42499d = j;
        this.f42500e = z10;
        this.f42501f = c2567t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42501f.B(this.f42497b, this.f42498c, this.f42499d, this.f42500e, null);
    }
}
