package androidx.compose.runtime;

/* JADX INFO: compiled from: ValueHolders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N<T> implements S0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p293xa.g f12881a;

    public N(Ia.a<? extends T> aVar) {
        this.f12881a = kotlin.a.a(aVar);
    }

    @Override // androidx.compose.runtime.S0
    public final T a(InterfaceC1089h0 interfaceC1089h0) {
        return (T) this.f12881a.getValue();
    }
}
