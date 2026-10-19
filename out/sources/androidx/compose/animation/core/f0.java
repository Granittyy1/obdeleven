package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public interface f0<V extends AbstractC0913m> {
    boolean a();

    long b(V v10, V v11, V v12);

    V c(long j, V v10, V v11, V v12);

    default V e(V v10, V v11, V v12) {
        return (V) c(b(v10, v11, v12), v10, v11, v12);
    }

    V f(long j, V v10, V v11, V v12);
}
