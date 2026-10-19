package androidx.compose.material3;

/* JADX INFO: renamed from: androidx.compose.material3.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1052g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12453e;

    public C1052g(float f10, float f11, float f12, float f13, float f14) {
        this.f12449a = f10;
        this.f12450b = f11;
        this.f12451c = f12;
        this.f12452d = f13;
        this.f12453e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1052g)) {
            return false;
        }
        C1052g c1052g = (C1052g) obj;
        return p013b0.f.a(this.f12449a, c1052g.f12449a) && p013b0.f.a(this.f12450b, c1052g.f12450b) && p013b0.f.a(this.f12451c, c1052g.f12451c) && p013b0.f.a(this.f12452d, c1052g.f12452d) && p013b0.f.a(this.f12453e, c1052g.f12453e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12453e) + O.a.d(this.f12452d, O.a.d(this.f12451c, O.a.d(this.f12450b, Float.hashCode(this.f12449a) * 31, 31), 31), 31);
    }
}
