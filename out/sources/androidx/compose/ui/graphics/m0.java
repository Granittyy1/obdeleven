package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13770a;

    public m0(long j) {
        this.f13770a = j;
    }

    @Override // androidx.compose.ui.graphics.C
    public final void a(float f10, long j, d0 d0Var) {
        d0Var.b(1.0f);
        long jB = this.f13770a;
        if (f10 != 1.0f) {
            jB = H.b(H.d(jB) * f10, jB);
        }
        d0Var.g(jB);
        if (d0Var.f() != null) {
            d0Var.e(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0) {
            return H.c(this.f13770a, ((m0) obj).f13770a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Long.hashCode(this.f13770a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) H.i(this.f13770a)) + ')';
    }
}
