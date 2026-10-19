package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class S<V extends AbstractC0913m> implements f0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0<V> f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9402b;

    public S(f0<V> f0Var, long j) {
        this.f9401a = f0Var;
        this.f9402b = j;
    }

    @Override // androidx.compose.animation.core.f0
    public final boolean a() {
        return this.f9401a.a();
    }

    @Override // androidx.compose.animation.core.f0
    public final long b(V v10, V v11, V v12) {
        return this.f9401a.b(v10, v11, v12) + this.f9402b;
    }

    @Override // androidx.compose.animation.core.f0
    public final V c(long j, V v10, V v11, V v12) {
        long j10 = this.f9402b;
        return j < j10 ? v12 : (V) this.f9401a.c(j - j10, v10, v11, v12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return s10.f9402b == this.f9402b && kotlin.jvm.internal.i.a(s10.f9401a, this.f9401a);
    }

    @Override // androidx.compose.animation.core.f0
    public final V f(long j, V v10, V v11, V v12) {
        long j10 = this.f9402b;
        return j < j10 ? v10 : (V) this.f9401a.f(j - j10, v10, v11, v12);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9402b) + (this.f9401a.hashCode() * 31);
    }
}
