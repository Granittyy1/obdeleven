package p131k5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class D2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v3 f41752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41753e;

    public D2(C2587y2 c2587y2, o3 o3Var, boolean z10, v3 v3Var) {
        this.f41750b = o3Var;
        this.f41751c = z10;
        this.f41752d = v3Var;
        this.f41753e = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2587y2 c2587y2 = this.f41753e;
        InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
        if (interfaceC2561s0 == null) {
            c2587y2.d().f41712f.c("Discarding data. Failed to set user property");
            return;
        }
        c2587y2.A(interfaceC2561s0, this.f41751c ? null : this.f41752d, this.f41750b);
        c2587y2.I();
    }
}
