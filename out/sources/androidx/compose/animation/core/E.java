package androidx.compose.animation.core;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class E<T> implements InterfaceC0906f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0920u<T> f9355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepeatMode f9356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9357c;

    public E() {
        throw null;
    }

    public E(InterfaceC0920u interfaceC0920u, RepeatMode repeatMode, long j) {
        this.f9355a = interfaceC0920u;
        this.f9356b = repeatMode;
        this.f9357c = j;
    }

    @Override // androidx.compose.animation.core.InterfaceC0906f
    public final <V extends AbstractC0913m> f0<V> a(d0<T, V> d0Var) {
        return new m0(this.f9355a.a((d0) d0Var), this.f9356b, this.f9357c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return kotlin.jvm.internal.i.a(e10.f9355a, this.f9355a) && e10.f9356b == this.f9356b && e10.f9357c == this.f9357c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9357c) + ((this.f9356b.hashCode() + (this.f9355a.hashCode() * 31)) * 31);
    }
}
