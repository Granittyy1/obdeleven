package p131k5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class K2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2588z f41855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41856e;

    public K2(C2587y2 c2587y2, o3 o3Var, boolean z10, C2588z c2588z) {
        this.f41853b = o3Var;
        this.f41854c = z10;
        this.f41855d = c2588z;
        this.f41856e = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2587y2 c2587y2 = this.f41856e;
        InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
        if (interfaceC2561s0 == null) {
            c2587y2.d().f41712f.c("Discarding data. Failed to send event to service");
            return;
        }
        C2588z c2588z = this.f41855d;
        o3 o3Var = this.f41853b;
        if (this.f41854c) {
            c2588z = null;
        }
        c2587y2.A(interfaceC2561s0, c2588z, o3Var);
        c2587y2.I();
    }
}
