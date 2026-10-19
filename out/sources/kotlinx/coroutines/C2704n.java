package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2704n extends AbstractC2698j0 implements InterfaceC2703m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JobSupport f43514f;

    public C2704n(JobSupport jobSupport) {
        this.f43514f = jobSupport;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        this.f43514f.E(k());
    }

    @Override // kotlinx.coroutines.InterfaceC2703m
    public final boolean b(Throwable th) {
        return k().J(th);
    }
}
