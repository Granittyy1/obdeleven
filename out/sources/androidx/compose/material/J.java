package androidx.compose.material;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11765a = androidx.compose.ui.graphics.H.f13504l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.material.ripple.f f11766b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return androidx.compose.ui.graphics.H.c(this.f11765a, j.f11765a) && kotlin.jvm.internal.i.a(this.f11766b, j.f11766b);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        int iHashCode = Long.hashCode(this.f11765a) * 31;
        androidx.compose.material.ripple.f fVar = this.f11766b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        C4.v.h(this.f11765a, ", rippleAlpha=", sb2);
        sb2.append(this.f11766b);
        sb2.append(')');
        return sb2.toString();
    }
}
