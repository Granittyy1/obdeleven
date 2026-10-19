package androidx.compose.ui.text.style;

/* JADX INFO: compiled from: TextGeometricTransform.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f15675c = new j(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15677b;

    public j(float f10, float f11) {
        this.f15676a = f10;
        this.f15677b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15676a == jVar.f15676a && this.f15677b == jVar.f15677b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15677b) + (Float.hashCode(this.f15676a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f15676a);
        sb2.append(", skewX=");
        return B7.b.d(sb2, this.f15677b, ')');
    }

    public j() {
        this(1.0f, 0.0f);
    }
}
