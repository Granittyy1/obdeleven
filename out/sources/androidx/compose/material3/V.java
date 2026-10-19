package androidx.compose.material3;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12411a = androidx.compose.ui.graphics.H.f13504l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.material.ripple.f f12412b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return androidx.compose.ui.graphics.H.c(this.f12411a, v10.f12411a) && kotlin.jvm.internal.i.a(this.f12412b, v10.f12412b);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        int iHashCode = Long.hashCode(this.f12411a) * 31;
        androidx.compose.material.ripple.f fVar = this.f12412b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        C4.v.h(this.f12411a, ", rippleAlpha=", sb2);
        sb2.append(this.f12412b);
        sb2.append(')');
        return sb2.toString();
    }
}
