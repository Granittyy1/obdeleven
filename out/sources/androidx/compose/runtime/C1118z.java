package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1118z implements t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<B, A> f13257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f13258c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1118z(Ia.l<? super B, ? extends A> lVar) {
        this.f13257b = lVar;
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        A a10 = this.f13258c;
        if (a10 != null) {
            a10.dispose();
        }
        this.f13258c = null;
    }

    @Override // androidx.compose.runtime.t0
    public final void d() {
        this.f13258c = this.f13257b.invoke(E.f12831a);
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
    }
}
