package I;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f3756e = new f(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3760d;

    public f(float f10, float f11, float f12, float f13) {
        this.f3757a = f10;
        this.f3758b = f11;
        this.f3759c = f12;
        this.f3760d = f13;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f3757a) & (fIntBitsToFloat < this.f3759c) & (fIntBitsToFloat2 >= this.f3758b) & (fIntBitsToFloat2 < this.f3760d);
    }

    public final long b() {
        float f10 = this.f3759c;
        float f11 = this.f3757a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f3760d;
        float f14 = this.f3758b;
        return (((long) Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f3759c - this.f3757a;
        return (((long) Float.floatToRawIntBits(this.f3760d - this.f3758b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final f d(f fVar) {
        return new f(Math.max(this.f3757a, fVar.f3757a), Math.max(this.f3758b, fVar.f3758b), Math.min(this.f3759c, fVar.f3759c), Math.min(this.f3760d, fVar.f3760d));
    }

    public final boolean e() {
        return (this.f3757a >= this.f3759c) | (this.f3758b >= this.f3760d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f3757a, fVar.f3757a) == 0 && Float.compare(this.f3758b, fVar.f3758b) == 0 && Float.compare(this.f3759c, fVar.f3759c) == 0 && Float.compare(this.f3760d, fVar.f3760d) == 0;
    }

    public final boolean f(f fVar) {
        return (this.f3757a < fVar.f3759c) & (fVar.f3757a < this.f3759c) & (this.f3758b < fVar.f3760d) & (fVar.f3758b < this.f3760d);
    }

    public final f g(float f10, float f11) {
        return new f(this.f3757a + f10, this.f3758b + f11, this.f3759c + f10, this.f3760d + f11);
    }

    public final f h(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new f(Float.intBitsToFloat(i10) + this.f3757a, Float.intBitsToFloat(i11) + this.f3758b, Float.intBitsToFloat(i10) + this.f3759c, Float.intBitsToFloat(i11) + this.f3760d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f3760d) + O.a.d(this.f3759c, O.a.d(this.f3758b, Float.hashCode(this.f3757a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + b.p(this.f3757a) + ", " + b.p(this.f3758b) + ", " + b.p(this.f3759c) + ", " + b.p(this.f3760d) + ')';
    }
}
