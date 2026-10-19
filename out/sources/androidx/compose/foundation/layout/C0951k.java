package androidx.compose.foundation.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0951k implements InterfaceC0950j, InterfaceC0948h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.ui.layout.e0 f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10306b;

    public C0951k(androidx.compose.ui.layout.e0 e0Var, long j) {
        this.f10305a = e0Var;
        this.f10306b = j;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0950j
    public final long c() {
        return this.f10306b;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0950j
    public final float d() {
        long j = this.f10306b;
        if (!p013b0.a.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f10305a.u(p013b0.a.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951k)) {
            return false;
        }
        C0951k c0951k = (C0951k) obj;
        return kotlin.jvm.internal.i.a(this.f10305a, c0951k.f10305a) && p013b0.a.b(this.f10306b, c0951k.f10306b);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0948h
    public final androidx.compose.ui.h f(androidx.compose.ui.h hVar, androidx.compose.ui.f fVar) {
        return C0949i.f10304a.f(hVar, fVar);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10306b) + (this.f10305a.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0950j
    public final float i() {
        long j = this.f10306b;
        if (!p013b0.a.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.f10305a.u(p013b0.a.g(j));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0948h
    public final androidx.compose.ui.h j() {
        return C0949i.f10304a.j();
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f10305a + ", constraints=" + ((Object) p013b0.a.l(this.f10306b)) + ')';
    }
}
