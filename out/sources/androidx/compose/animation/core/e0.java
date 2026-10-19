package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorConverters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e0<T, V extends AbstractC0913m> implements d0<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<T, V> f9540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<V, T> f9541b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(Ia.l<? super T, ? extends V> lVar, Ia.l<? super V, ? extends T> lVar2) {
        this.f9540a = lVar;
        this.f9541b = lVar2;
    }

    @Override // androidx.compose.animation.core.d0
    public final Ia.l<T, V> a() {
        return this.f9540a;
    }

    @Override // androidx.compose.animation.core.d0
    public final Ia.l<V, T> b() {
        return this.f9541b;
    }
}
