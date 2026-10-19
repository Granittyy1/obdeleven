package androidx.compose.animation.core;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC0924y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f9350b;

    public B(float f10, float f11, float f12) {
        this.f9349a = f12;
        O o10 = new O();
        o10.f9390a = 1.0f;
        o10.f9391b = Math.sqrt(50.0d);
        o10.f9392c = 1.0f;
        if (f10 < 0.0f) {
            M.a("Damping ratio must be non-negative");
        }
        o10.f9392c = f10;
        double d10 = o10.f9391b;
        if (((float) (d10 * d10)) <= 0.0f) {
            M.a("Spring stiffness constant must be positive.");
        }
        o10.f9391b = Math.sqrt(f11);
        this.f9350b = o10;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final float c(long j, float f10, float f11, float f12) {
        O o10 = this.f9350b;
        o10.f9390a = f11;
        return Float.intBitsToFloat((int) (o10.a(f10, f12, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final long d(float f10, float f11, float f12) {
        double dLog;
        long j;
        O o10 = this.f9350b;
        double d10 = o10.f9391b;
        float f13 = (float) (d10 * d10);
        float f14 = o10.f9392c;
        float f15 = this.f9349a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d11 = f13;
            double d12 = f14;
            double d13 = f17;
            double d14 = f16;
            double d15 = 1.0f;
            double dSqrt = d12 * 2.0d * Math.sqrt(d11);
            double d16 = (dSqrt * dSqrt) - (d11 * 4.0d);
            double dSqrt2 = d16 < 0.0d ? 0.0d : Math.sqrt(d16);
            double d17 = -dSqrt;
            double d18 = (d17 + dSqrt2) * 0.5d;
            double dSqrt3 = (d16 < 0.0d ? Math.sqrt(Math.abs(d16)) : 0.0d) * 0.5d;
            double d19 = (d17 - dSqrt2) * 0.5d;
            if (d14 == 0.0d && d13 == 0.0d) {
                j = 0;
            } else {
                if (d14 < 0.0d) {
                    d13 = -d13;
                }
                double dAbs = Math.abs(d14);
                double dAbs2 = Double.MAX_VALUE;
                if (d12 > 1.0d) {
                    double d20 = (d18 * dAbs) - d13;
                    double d21 = d18 - d19;
                    double d22 = d20 / d21;
                    double d23 = dAbs - d22;
                    double dLog2 = Math.log(Math.abs(d15 / d23)) / d18;
                    double dLog3 = Math.log(Math.abs(d15 / d22)) / d19;
                    if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog2 = dLog3;
                    } else if ((Double.doubleToRawLongBits(dLog3) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog2 = Math.max(dLog2, dLog3);
                    }
                    double d24 = d23 * d18;
                    double d25 = dLog2;
                    double dLog4 = Math.log(d24 / ((-d22) * d19)) / (d19 - d18);
                    if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
                        d15 = -d15;
                        dLog = d25;
                    } else if (dLog4 <= 0.0d) {
                        dLog = Math.log((-((d22 * d19) * d19)) / (d24 * d18)) / d21;
                    } else if ((-((Math.exp(dLog4 * d19) * d22) + (Math.exp(d18 * dLog4) * d23))) < d15) {
                        d15 = -d15;
                        dLog = (d22 <= 0.0d || d23 >= 0.0d) ? d25 : 0.0d;
                    } else {
                        dLog = Math.log((-((d22 * d19) * d19)) / (d24 * d18)) / d21;
                    }
                    double d26 = d22 * d19;
                    if (Math.abs((Math.exp(d19 * dLog) * d26) + (Math.exp(d18 * dLog) * d24)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d27 = d18 * dLog;
                            double d28 = d19 * dLog;
                            double dExp = dLog - ((((Math.exp(d28) * d22) + (Math.exp(d27) * d23)) + d15) / ((Math.exp(d28) * d26) + (Math.exp(d27) * d24)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d12 < 1.0d) {
                    double d29 = (d13 - (d18 * dAbs)) / dSqrt3;
                    dLog = Math.log(d15 / Math.sqrt((d29 * d29) + (dAbs * dAbs))) / d18;
                } else {
                    double d30 = d18 * dAbs;
                    double d31 = d13 - d30;
                    double dLog5 = Math.log(Math.abs(d15 / dAbs)) / d18;
                    double dLog6 = Math.log(Math.abs(d15 / d31));
                    double dLog7 = dLog6;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog7 = dLog6 - Math.log(Math.abs(dLog7 / d18));
                    }
                    double d32 = dLog7 / d18;
                    if ((Double.doubleToRawLongBits(dLog5) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog5 = d32;
                    } else if ((Double.doubleToRawLongBits(d32) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog5 = Math.max(dLog5, d32);
                    }
                    double d33 = (-(d30 + d31)) / (d18 * d31);
                    double d34 = d18 * d33;
                    double dExp2 = (Math.exp(d34) * d31 * d33) + (Math.exp(d34) * dAbs);
                    if (Double.isNaN(d33) || d33 <= 0.0d) {
                        d15 = -d15;
                    } else if (d33 <= 0.0d || (-dExp2) >= d15) {
                        dLog5 = (-(2.0d / d18)) - (dAbs / d31);
                    } else {
                        if (d31 < 0.0d && dAbs > 0.0d) {
                            dLog5 = 0.0d;
                        }
                        d15 = -d15;
                    }
                    dLog = dLog5;
                    int i12 = 0;
                    while (dAbs2 > 0.001d && i12 < 100) {
                        i12++;
                        double d35 = d18 * dLog;
                        double dExp3 = dLog - (((Math.exp(d35) * ((d31 * dLog) + dAbs)) + d15) / (Math.exp(d35) * (((((double) 1) + d35) * d31) + d30)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final float e(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.InterfaceC0924y
    public final float f(long j, float f10, float f11, float f12) {
        O o10 = this.f9350b;
        o10.f9390a = f11;
        return Float.intBitsToFloat((int) (o10.a(f10, f12, j / 1000000) >> 32));
    }
}
