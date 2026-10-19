package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class T implements InterfaceC2677c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43204b;

    public T(boolean z10) {
        this.f43204b = z10;
    }

    @Override // kotlinx.coroutines.InterfaceC2677c0
    public final boolean c() {
        return this.f43204b;
    }

    @Override // kotlinx.coroutines.InterfaceC2677c0
    public final r0 d() {
        return null;
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("Empty{"), this.f43204b ? "Active" : "New", '}');
    }
}
