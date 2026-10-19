package androidx.compose.material;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p270w.a f11775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p270w.a f11776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p270w.a f11777c;

    public N() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return kotlin.jvm.internal.i.a(this.f11775a, n10.f11775a) && kotlin.jvm.internal.i.a(this.f11776b, n10.f11776b) && kotlin.jvm.internal.i.a(this.f11777c, n10.f11777c);
    }

    public final int hashCode() {
        return this.f11777c.hashCode() + ((this.f11776b.hashCode() + (this.f11775a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f11775a + ", medium=" + this.f11776b + ", large=" + this.f11777c + ')';
    }

    public N(int i10) {
        p270w.f fVarB = p270w.g.b(4);
        p270w.f fVarB2 = p270w.g.b(4);
        p270w.f fVarB3 = p270w.g.b(0);
        this.f11775a = fVarB;
        this.f11776b = fVarB2;
        this.f11777c = fVarB3;
    }
}
