package androidx.compose.material3;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12194d;

    public J(float f10, float f11, float f12, float f13) {
        this.f12191a = f10;
        this.f12192b = f11;
        this.f12193c = f12;
        this.f12194d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        if (p013b0.f.a(this.f12191a, j.f12191a) && p013b0.f.a(this.f12192b, j.f12192b) && p013b0.f.a(this.f12193c, j.f12193c)) {
            return p013b0.f.a(this.f12194d, j.f12194d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f12194d) + O.a.d(this.f12193c, O.a.d(this.f12192b, Float.hashCode(this.f12191a) * 31, 31), 31);
    }
}
