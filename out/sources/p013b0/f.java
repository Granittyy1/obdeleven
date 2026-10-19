package p013b0;

import Ha.a;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@a
public final class f implements Comparable<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20481b;

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        return Float.compare(this.f20481b, fVar.f20481b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f20481b, ((f) obj).f20481b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20481b);
    }

    public final String toString() {
        return b(this.f20481b);
    }
}
