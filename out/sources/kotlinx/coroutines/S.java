package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class S extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P f43203f;

    public S(P p10) {
        this.f43203f = p10;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        this.f43203f.dispose();
    }
}
