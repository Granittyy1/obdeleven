package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: TouchBoundsExpansion.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1190k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14590d;

    public C1190k(float f10, float f11, float f12, float f13) {
        this.f14587a = f10;
        this.f14588b = f11;
        this.f14589c = f12;
        this.f14590d = f13;
        if (f10 < 0.0f) {
            R.a.a("Left must be non-negative");
        }
        if (f11 < 0.0f) {
            R.a.a("Top must be non-negative");
        }
        if (f12 < 0.0f) {
            R.a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        R.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190k)) {
            return false;
        }
        C1190k c1190k = (C1190k) obj;
        return p013b0.f.a(this.f14587a, c1190k.f14587a) && p013b0.f.a(this.f14588b, c1190k.f14588b) && p013b0.f.a(this.f14589c, c1190k.f14589c) && p013b0.f.a(this.f14590d, c1190k.f14590d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + O.a.d(this.f14590d, O.a.d(this.f14589c, O.a.d(this.f14588b, Float.hashCode(this.f14587a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) p013b0.f.b(this.f14587a)) + ", top=" + ((Object) p013b0.f.b(this.f14588b)) + ", end=" + ((Object) p013b0.f.b(this.f14589c)) + ", bottom=" + ((Object) p013b0.f.b(this.f14590d)) + ", isLayoutDirectionAware=true)";
    }
}
