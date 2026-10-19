package androidx.compose.material.ripple;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11996d;

    public f(float f10, float f11, float f12, float f13) {
        this.f11993a = f10;
        this.f11994b = f11;
        this.f11995c = f12;
        this.f11996d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11993a == fVar.f11993a && this.f11994b == fVar.f11994b && this.f11995c == fVar.f11995c && this.f11996d == fVar.f11996d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11996d) + O.a.d(this.f11995c, O.a.d(this.f11994b, Float.hashCode(this.f11993a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f11993a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f11994b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f11995c);
        sb2.append(", pressedAlpha=");
        return B7.b.d(sb2, this.f11996d, ')');
    }
}
