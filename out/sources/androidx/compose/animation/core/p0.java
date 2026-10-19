package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p0<V extends AbstractC0913m> implements i0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9614a;

    public p0(int i10) {
        this.f9614a = i10;
    }

    @Override // androidx.compose.animation.core.i0
    public final int d() {
        return this.f9614a;
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        return j < ((long) this.f9614a) * 1000000 ? v10 : v11;
    }

    @Override // androidx.compose.animation.core.i0
    public final int g() {
        return 0;
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        return v12;
    }
}
