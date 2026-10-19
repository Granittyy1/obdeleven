package androidx.compose.runtime;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComputedProvidableCompositionLocal<T> extends AbstractC1099m0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1114v<T> f12796b;

    public ComputedProvidableCompositionLocal(Ia.l<? super InterfaceC1106q, ? extends T> lVar) {
        super(new Ia.a<T>() { // from class: androidx.compose.runtime.ComputedProvidableCompositionLocal.1
            @Override // Ia.a
            public final T invoke() {
                C1090i.d("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            }
        });
        this.f12796b = new C1114v<>(lVar);
    }

    @Override // androidx.compose.runtime.AbstractC1104p
    public final S0 a() {
        return this.f12796b;
    }

    @Override // androidx.compose.runtime.AbstractC1099m0
    public final C1101n0<T> b(T t8) {
        return new C1101n0<>(this, t8, t8 == null, null, true);
    }
}
