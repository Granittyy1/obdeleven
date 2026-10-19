package p077g0;

/* JADX INFO: compiled from: StopLogicEngine.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f35158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f35160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f35161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35166i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35170n;

    @Override // p077g0.m
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f35166i - this.f35169m) < 1.0E-5f;
    }

    @Override // p077g0.m
    public final float b() {
        return this.f35167k ? -c(this.f35170n) : c(this.f35170n);
    }

    public final float c(float f10) {
        float f11;
        float f12;
        float f13 = this.f35161d;
        if (f10 <= f13) {
            f11 = this.f35158a;
            f12 = this.f35159b;
        } else {
            int i10 = this.j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f35162e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f14 = f10 - f13;
                float f15 = this.f35163f;
                if (f14 >= f15) {
                    return 0.0f;
                }
                float f16 = this.f35160c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f35159b;
            f12 = this.f35160c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    public final void d(float f10, float f11, float f12, float f13, float f14) {
        this.f35166i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.j = 2;
                this.f35158a = f10;
                this.f35159b = fSqrt;
                this.f35160c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f35161d = f17;
                this.f35162e = fSqrt / f12;
                this.f35164g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f35165h = f11;
                this.f35166i = f11;
                return;
            }
            this.j = 3;
            this.f35158a = f10;
            this.f35159b = f13;
            this.f35160c = f13;
            float f18 = (f13 - f10) / f12;
            this.f35161d = f18;
            float f19 = f13 / f12;
            this.f35163f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f35162e = ((f11 - f20) - f21) / f13;
            this.f35164g = f20;
            this.f35165h = f11 - f21;
            this.f35166i = f11;
            return;
        }
        if (f16 >= f11) {
            this.j = 1;
            this.f35158a = f10;
            this.f35159b = 0.0f;
            this.f35164g = f11;
            this.f35161d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.j = 2;
            this.f35158a = f10;
            this.f35159b = f10;
            this.f35160c = 0.0f;
            this.f35164g = f22;
            this.f35165h = f11;
            this.f35161d = f23;
            this.f35162e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f35161d = f24;
        float f25 = fSqrt2 / f12;
        this.f35162e = f25;
        if (fSqrt2 < f13) {
            this.j = 2;
            this.f35158a = f10;
            this.f35159b = fSqrt2;
            this.f35160c = 0.0f;
            this.f35161d = f24;
            this.f35162e = f25;
            this.f35164g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f35165h = f11;
            return;
        }
        this.j = 3;
        this.f35158a = f10;
        this.f35159b = f13;
        this.f35160c = f13;
        float f26 = (f13 - f10) / f12;
        this.f35161d = f26;
        float f27 = f13 / f12;
        this.f35163f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f35162e = ((f11 - f28) - f29) / f13;
        this.f35164g = f28;
        this.f35165h = f11 - f29;
        this.f35166i = f11;
    }

    @Override // p077g0.m
    public final float getInterpolation(float f10) {
        float f11;
        float f12 = this.f35161d;
        if (f10 <= f12) {
            float f13 = this.f35158a;
            f11 = ((((this.f35159b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.j;
            if (i10 == 1) {
                f11 = this.f35164g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f35162e;
                if (f14 < f15) {
                    float f16 = this.f35164g;
                    float f17 = this.f35159b;
                    f11 = ((((this.f35160c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f35165h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f35163f;
                    if (f18 <= f19) {
                        float f20 = this.f35165h;
                        float f21 = this.f35160c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f35166i;
                    }
                }
            }
        }
        this.f35169m = f11;
        this.f35170n = f10;
        return this.f35167k ? this.f35168l - f11 : this.f35168l + f11;
    }
}
