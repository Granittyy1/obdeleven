package androidx.compose.animation.core;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N<T> implements InterfaceC0920u<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9389a;

    public N(int i10) {
        this.f9389a = i10;
    }

    @Override // androidx.compose.animation.core.InterfaceC0923x
    public final /* bridge */ /* synthetic */ j0 b() {
        return a((d0) VectorConvertersKt.f9477a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof N) && ((N) obj).f9389a == this.f9389a;
    }

    public final int hashCode() {
        return this.f9389a;
    }

    @Override // androidx.compose.animation.core.InterfaceC0906f
    public final <V extends AbstractC0913m> i0<V> a(d0<T, V> d0Var) {
        return new p0(this.f9389a);
    }

    public N() {
        this(0);
    }
}
