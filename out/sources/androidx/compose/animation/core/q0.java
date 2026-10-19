package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q0<V extends AbstractC0913m> implements j0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0<V> f9621a;

    public q0(float f10, float f11, V v10) {
        int[] iArr = h0.f9549a;
        this.f9621a = new k0<>(v10 != null ? new P3.b(f10, f11, v10) : new g0(f10, f11));
    }

    @Override // androidx.compose.animation.core.j0, androidx.compose.animation.core.f0
    public final boolean a() {
        this.f9621a.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.f0
    public final long b(V v10, V v11, V v12) {
        return this.f9621a.b(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        return (V) this.f9621a.c(j, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.f0
    public final V e(V v10, V v11, V v12) {
        return (V) this.f9621a.e(v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        return (V) this.f9621a.f(j, v10, v11, v12);
    }
}
