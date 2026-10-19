package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m0<V extends AbstractC0913m> implements f0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0<V> f9576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepeatMode f9577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9579d;

    public m0(i0 i0Var, RepeatMode repeatMode, long j) {
        this.f9576a = i0Var;
        this.f9577b = repeatMode;
        this.f9578c = ((long) (i0Var.g() + i0Var.d())) * 1000000;
        this.f9579d = j * 1000000;
    }

    @Override // androidx.compose.animation.core.f0
    public final boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.f0
    public final long b(V v10, V v11, V v12) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        return this.f9576a.c(h(j), v10, v11, i(j, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        return this.f9576a.f(h(j), v10, v11, i(j, v10, v12, v11));
    }

    public final long h(long j) {
        long j10 = this.f9579d;
        if (j + j10 <= 0) {
            return 0L;
        }
        long j11 = j + j10;
        long j12 = this.f9578c;
        long j13 = j11 / j12;
        return (this.f9577b == RepeatMode.f9398b || j13 % ((long) 2) == 0) ? j11 - (j13 * j12) : ((j13 + 1) * j12) - j11;
    }

    public final V i(long j, V v10, V v11, V v12) {
        long j10 = this.f9579d;
        long j11 = j + j10;
        long j12 = this.f9578c;
        return j11 > j12 ? this.f9576a.c(j12 - j10, v10, v12, v11) : v11;
    }
}
