package p077g0;

/* JADX INFO: compiled from: SpringStopEngine.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f35148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f35149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f35150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35156i;

    @Override // p077g0.m
    public final boolean a() {
        double d10 = ((double) this.f35152e) - this.f35150c;
        double d11 = this.f35149b;
        double d12 = this.f35153f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f35154g))) / d11) <= ((double) this.f35155h);
    }

    @Override // p077g0.m
    public final float b() {
        return 0.0f;
    }

    @Override // p077g0.m
    public final float getInterpolation(float f10) {
        k kVar;
        float f11;
        k kVar2 = this;
        double d10 = f10 - kVar2.f35151d;
        if (d10 <= 0.0d) {
            kVar = kVar2;
            f11 = f10;
        } else {
            double d11 = kVar2.f35149b;
            double d12 = kVar2.f35148a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) kVar2.f35154g)) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / ((double) iSqrt);
            int i10 = 0;
            while (i10 < iSqrt) {
                float f12 = kVar2.f35152e;
                double d14 = f12;
                double d15 = kVar2.f35150c;
                int i11 = iSqrt;
                int i12 = i10;
                double d16 = (-d11) * (d14 - d15);
                float f13 = kVar2.f35153f;
                double d17 = d11;
                double d18 = f13;
                double d19 = kVar2.f35154g;
                double d20 = ((((d16 - (d12 * d18)) / d19) * d13) / 2.0d) + d18;
                double d21 = ((((-((((d13 * d20) / 2.0d) + d14) - d15)) * d17) - (d20 * d12)) / d19) * d13;
                float f14 = f13 + ((float) d21);
                this.f35153f = f14;
                float f15 = f12 + ((float) (((d21 / 2.0d) + d18) * d13));
                this.f35152e = f15;
                int i13 = this.f35156i;
                if (i13 > 0) {
                    if (f15 < 0.0f && (i13 & 1) == 1) {
                        this.f35152e = -f15;
                        this.f35153f = -f14;
                    }
                    float f16 = this.f35152e;
                    if (f16 > 1.0f && (i13 & 2) == 2) {
                        this.f35152e = 2.0f - f16;
                        this.f35153f = -this.f35153f;
                    }
                }
                i10 = i12 + 1;
                kVar2 = this;
                iSqrt = i11;
                d11 = d17;
            }
            kVar = kVar2;
            f11 = f10;
        }
        kVar.f35151d = f11;
        if (a()) {
            kVar.f35152e = (float) kVar.f35150c;
        }
        return kVar.f35152e;
    }
}
