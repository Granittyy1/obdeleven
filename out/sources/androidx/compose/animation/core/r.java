package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r<T, V extends AbstractC0913m> implements InterfaceC0903c<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f9622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0<T, V> f9623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f9624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f9625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f9626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V f9627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f9628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9629h;

    public r(InterfaceC0918s<T> interfaceC0918s, d0<T, V> d0Var, T t8, V v10) {
        l0 l0VarB = interfaceC0918s.b();
        this.f9622a = l0VarB;
        this.f9623b = d0Var;
        this.f9624c = t8;
        V vInvoke = d0Var.a().invoke(t8);
        this.f9625d = vInvoke;
        this.f9626e = (V) Q3.d.k(v10);
        this.f9628g = (T) d0Var.b().invoke(l0VarB.b(vInvoke, v10));
        if (l0VarB.f9573c == null) {
            l0VarB.f9573c = (V) vInvoke.c();
        }
        V v11 = l0VarB.f9573c;
        if (v11 == null) {
            kotlin.jvm.internal.i.m("velocityVector");
            throw null;
        }
        int iB = v11.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            vInvoke.getClass();
            jMax = Math.max(jMax, l0VarB.f9571a.d(v10.a(i10)));
        }
        this.f9629h = jMax;
        V v12 = (V) Q3.d.k(l0VarB.c(jMax, vInvoke, v10));
        this.f9627f = v12;
        int iB2 = v12.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            V v13 = this.f9627f;
            v13.e(Na.l.C(v13.a(i11), -this.f9622a.a(), this.f9622a.a()), i11);
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final long b() {
        return this.f9629h;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final d0<T, V> c() {
        return this.f9623b;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final V d(long j) {
        if (e(j)) {
            return this.f9627f;
        }
        return (V) this.f9622a.c(j, this.f9625d, this.f9626e);
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final T f(long j) {
        if (e(j)) {
            return this.f9628g;
        }
        Ia.l<V, T> lVarB = this.f9623b.b();
        V v10 = this.f9626e;
        l0 l0Var = this.f9622a;
        V v11 = this.f9625d;
        if (l0Var.f9572b == null) {
            l0Var.f9572b = (V) v11.c();
        }
        V v12 = l0Var.f9572b;
        if (v12 == null) {
            kotlin.jvm.internal.i.m("valueVector");
            throw null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = l0Var.f9572b;
            if (v13 == null) {
                kotlin.jvm.internal.i.m("valueVector");
                throw null;
            }
            v13.e(l0Var.f9571a.c(v11.a(i10), v10.a(i10), j), i10);
        }
        V v14 = l0Var.f9572b;
        if (v14 != null) {
            return lVarB.invoke(v14);
        }
        kotlin.jvm.internal.i.m("valueVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.InterfaceC0903c
    public final T g() {
        return this.f9628g;
    }
}
