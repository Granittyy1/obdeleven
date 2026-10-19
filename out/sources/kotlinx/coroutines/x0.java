package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2693i f43617f;

    public x0(C2693i c2693i) {
        this.f43617f = c2693i;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        this.f43617f.resumeWith(p293xa.r.f47939a);
    }
}
