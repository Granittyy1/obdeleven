package androidx.compose.animation.core;

import com.google.android.gms.internal.measurement.C1787c0;

/* JADX INFO: renamed from: androidx.compose.animation.core.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0917q implements InterfaceC0921v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f9619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f9620g;

    public C0917q(float f10, float f11, float f12, float f13) {
        int iW;
        this.f9615b = f10;
        this.f9616c = f11;
        this.f9617d = f12;
        this.f9618e = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            M.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - 0.0f) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d10 = f14;
        double d11 = f15;
        double d12 = f16;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            iW = d11 == d12 ? 0 : C1787c0.w((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int iW2 = C1787c0.w((float) ((-(d15 + d16)) / d14), fArr, 0);
            iW = C1787c0.w((float) ((d15 - d16) / d14), fArr, iW2) + iW2;
            if (iW > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    iW--;
                }
            }
        }
        float f19 = (f15 - f14) * 2.0f;
        int iW3 = C1787c0.w((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, iW) + iW;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < iW3; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - 0.0f) * f20) + (((f13 - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f20) + f14) * f20) + 0.0f;
            fMin = Math.min(fMin, f21);
            fMax = Math.max(fMax, f21);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f9619f = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f9620g = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[PHI: r3
      0x0091: PHI (r3v33 float) = (r3v6 float), (r3v18 float), (r3v25 float), (r3v38 float), (r3v45 float) binds: [B:131:0x0261, B:121:0x0232, B:95:0x01db, B:48:0x00f1, B:22:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[PHI: r10
      0x00ca: PHI (r10v37 float) = (r10v17 float), (r10v28 float), (r10v45 float) binds: [B:70:0x0173, B:84:0x01a8, B:37:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.animation.core.InterfaceC0921v
    public final float b(float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float fMax = Math.max(f10, 1.1920929E-7f);
        float f21 = 0.0f - fMax;
        float f22 = this.f9615b;
        float f23 = f22 - fMax;
        float f24 = this.f9617d;
        float f25 = f24 - fMax;
        double d10 = f21;
        double d11 = ((d10 - (((double) f23) * 2.0d)) + ((double) f25)) * 3.0d;
        double d12 = ((double) (f23 - f21)) * 3.0d;
        double d13 = (((double) (f23 - f25)) * 3.0d) + ((double) (-f21)) + ((double) (1.0f - fMax));
        float f26 = Float.NaN;
        if (Math.abs(d13 - 0.0d) >= 1.0E-7d) {
            double d14 = d11 / d13;
            double d15 = d12 / d13;
            double d16 = ((d15 * 3.0d) - (d14 * d14)) / 9.0d;
            double d17 = (((d10 / d13) * 27.0d) + ((((2.0d * d14) * d14) * d14) - ((9.0d * d14) * d15))) / 54.0d;
            double d18 = d16 * d16 * d16;
            double d19 = (d17 * d17) + d18;
            double d20 = d14 / 3.0d;
            if (d19 < 0.0d) {
                double dSqrt = Math.sqrt(-d18);
                double d21 = (-d17) / dSqrt;
                if (d21 < -1.0d) {
                    d21 = -1.0d;
                }
                if (d21 > 1.0d) {
                    d21 = 1.0d;
                }
                double dAcos = Math.acos(d21);
                double dJ = D9.o.j((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dJ) - d20);
                f14 = fCos < 0.0f ? 0.0f : fCos;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - fCos) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dJ) - d20);
                    f14 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (Math.abs(f14 - fCos2) > 1.05E-6f) {
                        f14 = Float.NaN;
                    }
                    if (Float.isNaN(f14)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dJ) - d20);
                        if (fCos3 < 0.0f) {
                            f16 = 1.0f;
                            f15 = 0.0f;
                        } else {
                            f15 = fCos3;
                            f16 = 1.0f;
                        }
                        f11 = f15 > f16 ? 1.0f : f15;
                        if (Math.abs(f11 - fCos3) <= 1.05E-6f) {
                            f26 = f11;
                        }
                    } else {
                        f26 = f14;
                    }
                } else {
                    f26 = f14;
                }
            } else if (d19 == 0.0d) {
                float f27 = -D9.o.j((float) d17);
                float f28 = (float) d20;
                float f29 = (f27 * 2.0f) - f28;
                float f30 = f29 < 0.0f ? 0.0f : f29;
                if (f30 > 1.0f) {
                    f30 = 1.0f;
                }
                if (Math.abs(f30 - f29) > 1.05E-6f) {
                    f30 = Float.NaN;
                }
                if (Float.isNaN(f30)) {
                    float f31 = (-f27) - f28;
                    if (f31 < 0.0f) {
                        f13 = 1.0f;
                        f12 = 0.0f;
                    } else {
                        f12 = f31;
                        f13 = 1.0f;
                    }
                    f11 = f12 > f13 ? 1.0f : f12;
                    if (Math.abs(f11 - f31) <= 1.05E-6f) {
                        f26 = f11;
                    }
                } else {
                    f26 = f30;
                }
            } else {
                double dSqrt2 = Math.sqrt(d19);
                float fJ = (float) (((double) (D9.o.j((float) ((-d17) + dSqrt2)) - D9.o.j((float) (d17 + dSqrt2)))) - d20);
                f11 = fJ >= 0.0f ? fJ : 0.0f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                if (Math.abs(f11 - fJ) <= 1.05E-6f) {
                    f26 = f11;
                }
            }
        } else if (Math.abs(d11 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d22 = d11 * 2.0d;
            float f32 = (float) ((dSqrt3 - d12) / d22);
            f14 = f32 < 0.0f ? 0.0f : f32;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            if (Math.abs(f14 - f32) > 1.05E-6f) {
                f14 = Float.NaN;
            }
            if (Float.isNaN(f14)) {
                float f33 = (float) (((-d12) - dSqrt3) / d22);
                if (f33 < 0.0f) {
                    f18 = 1.0f;
                    f17 = 0.0f;
                } else {
                    f17 = f33;
                    f18 = 1.0f;
                }
                f11 = f17 > f18 ? 1.0f : f17;
                if (Math.abs(f11 - f33) <= 1.05E-6f) {
                    f26 = f11;
                }
            } else {
                f26 = f14;
            }
        } else if (Math.abs(d12 - 0.0d) >= 1.0E-7d) {
            float f34 = (float) ((-d10) / d12);
            if (f34 < 0.0f) {
                f20 = 1.0f;
                f19 = 0.0f;
            } else {
                f19 = f34;
                f20 = 1.0f;
            }
            f11 = f19 > f20 ? 1.0f : f19;
            if (Math.abs(f11 - f34) <= 1.05E-6f) {
                f26 = f11;
            }
        }
        boolean zIsNaN = Float.isNaN(f26);
        float f35 = this.f9618e;
        float f36 = this.f9616c;
        if (!zIsNaN) {
            float f37 = ((((((f36 - f35) + 0.33333334f) * f26) + (f35 - (2.0f * f36))) * f26) + f36) * 3.0f * f26;
            float f38 = this.f9619f;
            if (f37 < f38) {
                f37 = f38;
            }
            float f39 = this.f9620g;
            return f37 > f39 ? f39 : f37;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f22 + ", " + f36 + ", " + f24 + ", " + f35 + ") has no solution at " + f10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0917q) {
            C0917q c0917q = (C0917q) obj;
            if (this.f9615b == c0917q.f9615b && this.f9616c == c0917q.f9616c && this.f9617d == c0917q.f9617d && this.f9618e == c0917q.f9618e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9618e) + O.a.d(this.f9617d, O.a.d(this.f9616c, Float.hashCode(this.f9615b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f9615b);
        sb2.append(", b=");
        sb2.append(this.f9616c);
        sb2.append(", c=");
        sb2.append(this.f9617d);
        sb2.append(", d=");
        return B7.b.d(sb2, this.f9618e, ')');
    }
}
