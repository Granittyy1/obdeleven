package androidx.compose.animation;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p013b0.c f9665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9666c;

    /* JADX INFO: compiled from: FlingCalculator.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f9667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f9668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9669c;

        public a(float f10, float f11, long j) {
            this.f9667a = f10;
            this.f9668b = f11;
            this.f9669c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f9667a, aVar.f9667a) == 0 && Float.compare(this.f9668b, aVar.f9668b) == 0 && this.f9669c == aVar.f9669c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f9669c) + O.a.d(this.f9668b, Float.hashCode(this.f9667a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlingInfo(initialVelocity=");
            sb2.append(this.f9667a);
            sb2.append(", distance=");
            sb2.append(this.f9668b);
            sb2.append(", duration=");
            return C4.a.h(sb2, this.f9669c, ')');
        }
    }

    public r(float f10, p013b0.c cVar) {
        this.f9664a = f10;
        this.f9665b = cVar;
        float density = cVar.getDensity();
        float f11 = s.f9670a;
        this.f9666c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f10) {
        double dB = b(f10);
        double d10 = s.f9670a;
        double d11 = d10 - 1.0d;
        return new a(f10, (float) (Math.exp((d10 / d11) * dB) * ((double) (this.f9664a * this.f9666c))), (long) (Math.exp(dB / d11) * 1000.0d));
    }

    public final double b(float f10) {
        float[] fArr = C0898a.f9328a;
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (this.f9664a * this.f9666c)));
    }
}
