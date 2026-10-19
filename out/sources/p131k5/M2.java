package p131k5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class M2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f41902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2496d f41903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41904e;

    public M2(C2587y2 c2587y2, o3 o3Var, boolean z10, C2496d c2496d, C2496d c2496d2) {
        this.f41901b = o3Var;
        this.f41902c = z10;
        this.f41903d = c2496d;
        this.f41904e = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2587y2 c2587y2 = this.f41904e;
        InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
        if (interfaceC2561s0 == null) {
            c2587y2.d().f41712f.c("Discarding data. Failed to send conditional user property to service");
            return;
        }
        c2587y2.A(interfaceC2561s0, this.f41902c ? null : this.f41903d, this.f41901b);
        c2587y2.I();
    }
}
