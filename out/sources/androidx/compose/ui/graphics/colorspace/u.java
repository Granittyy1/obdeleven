package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: WhitePoint.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13624b;

    public u(float f10, float f11) {
        this.f13623a = f10;
        this.f13624b = f11;
    }

    public final float[] a() {
        float f10 = this.f13623a;
        float f11 = this.f13624b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f13623a, uVar.f13623a) == 0 && Float.compare(this.f13624b, uVar.f13624b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13624b) + (Float.hashCode(this.f13623a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f13623a);
        sb2.append(", y=");
        return B7.b.d(sb2, this.f13624b, ')');
    }
}
