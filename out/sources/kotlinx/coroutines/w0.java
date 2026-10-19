package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w0<T> extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JobSupport.a f43615f;

    public w0(JobSupport.a aVar) {
        this.f43615f = aVar;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        Object objW = k().W();
        boolean z10 = objW instanceof C2708s;
        JobSupport.a aVar = this.f43615f;
        if (z10) {
            aVar.resumeWith(kotlin.b.a(((C2708s) objW).f43531a));
        } else {
            aVar.resumeWith(o0.a(objW));
        }
    }
}
