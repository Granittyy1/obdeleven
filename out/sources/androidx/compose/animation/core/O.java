package androidx.compose.animation.core;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9392c;

    public final long a(float f10, float f11, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f12 = f10 - this.f9390a;
        double d10 = j / 1000.0d;
        float f13 = this.f9392c;
        double d11 = ((double) f13) * ((double) f13);
        double d12 = this.f9391b;
        double d13 = ((double) (-f13)) * d12;
        if (f13 <= 1.0f) {
            if (f13 == 1.0f) {
                double d14 = f12;
                double d15 = (d12 * d14) + ((double) f11);
                double d16 = (-d12) * d10;
                double d17 = (d10 * d15) + d14;
                dSin = Math.exp(d16) * d17;
                dExp = Math.exp(d16) * d17 * (-this.f9391b);
                dExp2 = Math.exp(d16) * d15;
            } else {
                double d18 = 1;
                double dSqrt = Math.sqrt(d18 - d11) * d12;
                double d19 = f12;
                double d20 = (((-d13) * d19) + ((double) f11)) * (d18 / dSqrt);
                double d21 = dSqrt * d10;
                double d22 = d10 * d13;
                dSin = ((Math.sin(d21) * d20) + (Math.cos(d21) * d19)) * Math.exp(d22);
                dCos = (((Math.cos(d21) * dSqrt * d20) + (Math.sin(d21) * (-dSqrt) * d19)) * Math.exp(d22)) + (d13 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f9390a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d11 - ((double) 1)) * d12;
        double d23 = d13 + dSqrt2;
        double d24 = d13 - dSqrt2;
        double d25 = f12;
        double d26 = ((d24 * d25) - ((double) f11)) / (d24 - d23);
        double d27 = d25 - d26;
        double d28 = d24 * d10;
        double d29 = d10 * d23;
        dSin = (Math.exp(d29) * d26) + (Math.exp(d28) * d27);
        dExp = Math.exp(d28) * d27 * d24;
        dExp2 = Math.exp(d29) * d26 * d23;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f9390a))) << 32);
    }
}
