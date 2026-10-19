package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Q implements InterfaceC2689g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f43202b;

    public Q(P p10) {
        this.f43202b = p10;
    }

    @Override // kotlinx.coroutines.InterfaceC2689g
    public final void a(Throwable th) {
        this.f43202b.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f43202b + ']';
    }
}
