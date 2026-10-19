package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class U<T, V extends AbstractC0913m> implements InterfaceC0903c<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0<V> f9468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0<T, V> f9469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f9470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f9471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f9472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f9473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V f9474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V f9476i;

    public U() {
        throw null;
    }

    public U(InterfaceC0906f<T> interfaceC0906f, d0<T, V> d0Var, T t8, T t10, V v10) {
        this.f9468a = interfaceC0906f.a(d0Var);
        this.f9469b = d0Var;
        this.f9470c = t10;
        this.f9471d = t8;
        this.f9472e = d0Var.a().invoke(t8);
        this.f9473f = d0Var.a().invoke(t10);
        this.f9474g = v10 != null ? (V) Q3.d.k(v10) : (V) d0Var.a().invoke(t8).c();
        this.f9475h = -1L;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final boolean a() {
        return this.f9468a.a();
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final long b() {
        if (this.f9475h < 0) {
            this.f9475h = this.f9468a.b(this.f9472e, this.f9473f, this.f9474g);
        }
        return this.f9475h;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final d0<T, V> c() {
        return this.f9469b;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final V d(long j) {
        if (!e(j)) {
            return (V) this.f9468a.c(j, this.f9472e, this.f9473f, this.f9474g);
        }
        V v10 = this.f9476i;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.f9468a.e(this.f9472e, this.f9473f, this.f9474g);
        this.f9476i = v11;
        return v11;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final T f(long j) {
        if (e(j)) {
            return this.f9470c;
        }
        AbstractC0913m abstractC0913mF = this.f9468a.f(j, this.f9472e, this.f9473f, this.f9474g);
        int iB = abstractC0913mF.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (Float.isNaN(abstractC0913mF.a(i10))) {
                M.b("AnimationVector cannot contain a NaN. " + abstractC0913mF + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) this.f9469b.b().invoke(abstractC0913mF);
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final T g() {
        return this.f9470c;
    }

    public final void h(T t8) {
        if (kotlin.jvm.internal.i.a(t8, this.f9471d)) {
            return;
        }
        this.f9471d = t8;
        this.f9472e = this.f9469b.a().invoke(t8);
        this.f9476i = null;
        this.f9475h = -1L;
    }

    public final void i(T t8) {
        if (kotlin.jvm.internal.i.a(this.f9470c, t8)) {
            return;
        }
        this.f9470c = t8;
        this.f9473f = this.f9469b.a().invoke(t8);
        this.f9476i = null;
        this.f9475h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f9471d + " -> " + this.f9470c + ",initial velocity: " + this.f9474g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f9468a;
    }
}
