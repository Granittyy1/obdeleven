package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f10201c;

    public Q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return Float.compare(this.f10199a, q10.f10199a) == 0 && this.f10200b == q10.f10200b && kotlin.jvm.internal.i.a(this.f10201c, q10.f10201c) && kotlin.jvm.internal.i.a(null, null);
    }

    public final int hashCode() {
        int iB = androidx.compose.animation.D.b(Float.hashCode(this.f10199a) * 31, 31, this.f10200b);
        r rVar = this.f10201c;
        return (iB + (rVar == null ? 0 : rVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f10199a + ", fill=" + this.f10200b + ", crossAxisAlignment=" + this.f10201c + ", flowLayoutData=null)";
    }

    public Q(int i10) {
        this.f10199a = 0.0f;
        this.f10200b = true;
        this.f10201c = null;
    }
}
