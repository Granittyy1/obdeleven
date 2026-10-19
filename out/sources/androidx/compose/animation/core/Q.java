package androidx.compose.animation.core;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q<T> implements InterfaceC0906f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0923x f9396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9397b;

    public Q(InterfaceC0923x interfaceC0923x, long j) {
        this.f9396a = interfaceC0923x;
        this.f9397b = j;
    }

    @Override // androidx.compose.animation.core.InterfaceC0906f
    public final <V extends AbstractC0913m> f0<V> a(d0<T, V> d0Var) {
        return new S(this.f9396a.a(d0Var), this.f9397b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return q10.f9397b == this.f9397b && kotlin.jvm.internal.i.a(q10.f9396a, this.f9396a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f9397b) + (this.f9396a.hashCode() * 31);
    }
}
