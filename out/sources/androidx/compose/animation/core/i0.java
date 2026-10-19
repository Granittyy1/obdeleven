package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public interface i0<V extends AbstractC0913m> extends j0<V> {
    @Override // androidx.compose.animation.core.f0
    default long b(V v10, V v11, V v12) {
        return ((long) (g() + d())) * 1000000;
    }

    int d();

    int g();
}
