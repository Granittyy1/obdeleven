package androidx.compose.runtime;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C<T> extends AbstractC1099m0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0<T> f12791b;

    public C(Ia.a aVar, I0 i10) {
        super(aVar);
        this.f12791b = i10;
    }

    @Override // androidx.compose.runtime.AbstractC1099m0
    public final C1101n0<T> b(T t8) {
        return new C1101n0<>(this, t8, t8 == null, this.f12791b, true);
    }
}
