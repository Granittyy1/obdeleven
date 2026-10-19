package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r0<V extends AbstractC0913m> implements i0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0<V> f9632c;

    public r0(int i10, int i11, InterfaceC0921v interfaceC0921v) {
        this.f9630a = i10;
        this.f9631b = i11;
        this.f9632c = new k0<>(new C(i10, i11, interfaceC0921v));
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        return (V) this.f9632c.c(j, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.i0
    public final int d() {
        return this.f9631b;
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        return (V) this.f9632c.f(j, v10, v11, v12);
    }

    @Override // androidx.compose.animation.core.i0
    public final int g() {
        return this.f9630a;
    }
}
