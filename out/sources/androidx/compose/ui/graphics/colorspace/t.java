package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f13616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f13617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f13618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f13619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f13620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f13621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f13622g;

    public /* synthetic */ t(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Double.compare(this.f13616a, tVar.f13616a) == 0 && Double.compare(this.f13617b, tVar.f13617b) == 0 && Double.compare(this.f13618c, tVar.f13618c) == 0 && Double.compare(this.f13619d, tVar.f13619d) == 0 && Double.compare(this.f13620e, tVar.f13620e) == 0 && Double.compare(this.f13621f, tVar.f13621f) == 0 && Double.compare(this.f13622g, tVar.f13622g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f13622g) + ((Double.hashCode(this.f13621f) + ((Double.hashCode(this.f13620e) + ((Double.hashCode(this.f13619d) + ((Double.hashCode(this.f13618c) + ((Double.hashCode(this.f13617b) + (Double.hashCode(this.f13616a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f13616a + ", a=" + this.f13617b + ", b=" + this.f13618c + ", c=" + this.f13619d + ", d=" + this.f13620e + ", e=" + this.f13621f + ", f=" + this.f13622g + ')';
    }

    public t(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f13616a = d10;
        this.f13617b = d11;
        this.f13618c = d12;
        this.f13619d = d13;
        this.f13620e = d14;
        this.f13621f = d15;
        this.f13622g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
