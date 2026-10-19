package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;

/* JADX INFO: compiled from: Rgb.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Rgb extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final J4.i f13543r = new J4.i(4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f13544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f13547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f13548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f13549i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f13550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ia.l<Double, Double> f13551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Y1.d f13552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f13553n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Ia.l<Double, Double> f13554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f13555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f13556q;

    /* JADX INFO: compiled from: Rgb.kt */
    public static final class a {
        public static float a(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            return f16 < 0.0f ? -f16 : f16;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, u uVar, t tVar, int i10) {
        double d10 = tVar.f13616a;
        boolean z10 = d10 == -3.0d;
        double d11 = tVar.f13622g;
        double d12 = tVar.f13621f;
        this(str, fArr, uVar, null, z10 ? new F1.a(1, tVar) : d10 == -2.0d ? new r(tVar) : (d12 == 0.0d && d11 == 0.0d) ? new s(0, tVar) : new I4.l(tVar), d10 == -3.0d ? new I4.e(tVar) : d10 == -2.0d ? new I4.f(2, tVar) : (d12 == 0.0d && d11 == 0.0d) ? new F0.b(tVar) : new q(0, tVar), 0.0f, 1.0f, tVar, i10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] a(float[] fArr) {
        d.h(this.j, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d10 = fArr[0];
        Y1.d dVar = this.f13552m;
        fArr[0] = (float) dVar.g(d10);
        fArr[1] = (float) dVar.g(fArr[1]);
        fArr[2] = (float) dVar.g(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i10) {
        return this.f13546f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i10) {
        return this.f13545e;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final boolean d() {
        return this.f13556q;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f10, float f11, float f12) {
        double d10 = f10;
        n nVar = this.f13555p;
        float fG = (float) nVar.g(d10);
        float fG2 = (float) nVar.g(f11);
        float fG3 = (float) nVar.g(f12);
        float[] fArr = this.f13549i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f13 = (fArr[6] * fG3) + (fArr[3] * fG2) + (fArr[0] * fG);
        return (((long) Float.floatToRawIntBits((fArr[7] * fG3) + (fArr[4] * fG2) + (fArr[1] * fG))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Rgb.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.f13545e, this.f13545e) != 0 || Float.compare(rgb.f13546f, this.f13546f) != 0 || !kotlin.jvm.internal.i.a(this.f13544d, rgb.f13544d) || !Arrays.equals(this.f13548h, rgb.f13548h)) {
            return false;
        }
        t tVar = rgb.f13547g;
        t tVar2 = this.f13547g;
        if (tVar2 != null) {
            return kotlin.jvm.internal.i.a(tVar2, tVar);
        }
        if (tVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.i.a(this.f13550k, rgb.f13550k)) {
            return kotlin.jvm.internal.i.a(this.f13553n, rgb.f13553n);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] f(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d10 = fArr[0];
        n nVar = this.f13555p;
        fArr[0] = (float) nVar.g(d10);
        fArr[1] = (float) nVar.g(fArr[1]);
        fArr[2] = (float) nVar.g(fArr[2]);
        d.h(this.f13549i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f10, float f11, float f12) {
        double d10 = f10;
        n nVar = this.f13555p;
        float fG = (float) nVar.g(d10);
        float fG2 = (float) nVar.g(f11);
        float fG3 = (float) nVar.g(f12);
        float[] fArr = this.f13549i;
        return (fArr[8] * fG3) + (fArr[5] * fG2) + (fArr[2] * fG);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = this.j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        Y1.d dVar = this.f13552m;
        return Q3.d.c((float) dVar.g(f14), (float) dVar.g(f15), (float) dVar.g(f16), f13, cVar);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f13548h) + ((this.f13544d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f13545e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f13546f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        t tVar = this.f13547g;
        int iHashCode2 = iFloatToIntBits2 + (tVar != null ? tVar.hashCode() : 0);
        if (tVar == null) {
            return this.f13553n.hashCode() + ((this.f13550k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x0202  */
    /* JADX WARN: Code duplicated, block: B:46:0x0204  */
    /* JADX WARN: Code duplicated, block: B:48:0x0208  */
    /* JADX WARN: Code duplicated, block: B:52:0x0222 A[EDGE_INSN: B:76:0x0222->B:52:0x0222 BREAK  A[LOOP:0: B:62:0x0241->B:68:0x0272], EDGE_INSN: B:77:0x0222->B:52:0x0222 BREAK  A[LOOP:0: B:62:0x0241->B:68:0x0272]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0230  */
    /* JADX WARN: Code duplicated, block: B:64:0x0247  */
    /* JADX WARN: Code duplicated, block: B:66:0x025f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0222 A[ADDED_TO_REGION, EDGE_INSN: B:76:0x0222->B:52:0x0222 BREAK  A[LOOP:0: B:62:0x0241->B:68:0x0272], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public Rgb(String str, float[] fArr, u uVar, float[] fArr2, j jVar, j jVar2, float f10, float f11, t tVar, int i10) {
        int i11;
        float[] fArr3;
        int i12;
        boolean z10;
        Rgb rgb;
        double d10;
        super(i10, b.f13559a, str);
        this.f13544d = uVar;
        this.f13545e = f10;
        this.f13546f = f11;
        this.f13547g = tVar;
        this.f13550k = jVar;
        this.f13551l = new Ia.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Double invoke(Double d11) {
                double dG = this.this$0.f13550k.g(d11.doubleValue());
                Rgb rgb2 = this.this$0;
                return Double.valueOf(Na.l.B(dG, rgb2.f13545e, rgb2.f13546f));
            }
        };
        this.f13552m = new Y1.d(1, this);
        this.f13553n = jVar2;
        this.f13554o = new Ia.l<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            {
                super(1);
            }

            @Override // Ia.l
            public final Double invoke(Double d11) {
                double dDoubleValue = d11.doubleValue();
                Rgb rgb2 = this.this$0;
                return Double.valueOf(rgb2.f13553n.g(Na.l.B(dDoubleValue, rgb2.f13545e, rgb2.f13546f)));
            }
        };
        this.f13555p = new n(this);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 < f11) {
            float[] fArr4 = new float[6];
            if (fArr.length == 9) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                float f14 = f12 + f13 + fArr[2];
                fArr4[0] = f12 / f14;
                fArr4[1] = f13 / f14;
                float f15 = fArr[3];
                float f16 = fArr[4];
                float f17 = f15 + f16 + fArr[5];
                fArr4[2] = f15 / f17;
                fArr4[3] = f16 / f17;
                float f18 = fArr[6];
                float f19 = fArr[7];
                float f20 = f18 + f19 + fArr[8];
                fArr4[4] = f18 / f20;
                fArr4[5] = f19 / f20;
            } else {
                System.arraycopy(fArr, 0, fArr4, 0, 6);
            }
            this.f13548h = fArr4;
            if (fArr2 == null) {
                float f21 = fArr4[0];
                float f22 = fArr4[1];
                float f23 = fArr4[2];
                float f24 = fArr4[3];
                float f25 = fArr4[4];
                float f26 = fArr4[5];
                float f27 = 1;
                float f28 = (f27 - f21) / f22;
                float f29 = (f27 - f23) / f24;
                float f30 = (f27 - f25) / f26;
                float f31 = uVar.f13623a;
                float f32 = uVar.f13624b;
                float f33 = (f27 - f31) / f32;
                float f34 = f21 / f22;
                float f35 = (f23 / f24) - f34;
                float f36 = (f31 / f32) - f34;
                float f37 = f29 - f28;
                float f38 = (f25 / f26) - f34;
                float f39 = (((f33 - f28) * f35) - (f36 * f37)) / (((f30 - f28) * f35) - (f37 * f38));
                float f40 = (f36 - (f38 * f39)) / f35;
                float f41 = (1.0f - f40) - f39;
                float f42 = f41 / f22;
                float f43 = f40 / f24;
                float f44 = f39 / f26;
                this.f13549i = new float[]{f42 * f21, f41, ((1.0f - f21) - f22) * f42, f43 * f23, f40, ((1.0f - f23) - f24) * f43, f44 * f25, f39, ((1.0f - f25) - f26) * f44};
            } else if (fArr2.length == 9) {
                this.f13549i = fArr2;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.j = d.e(this.f13549i);
            float fA = a.a(fArr4);
            float[] fArr5 = f.f13567a;
            if (fA / a.a(f.f13568b) > 0.9f) {
                float[] fArr6 = f.f13567a;
                float f45 = fArr4[0];
                float f46 = fArr6[0];
                float f47 = fArr4[1];
                float f48 = fArr6[1];
                float f49 = fArr4[2];
                float f50 = fArr6[2];
                float f51 = fArr4[3];
                float f52 = fArr6[3];
                float f53 = fArr4[4];
                float f54 = fArr6[4];
                float f55 = fArr4[5];
                float f56 = fArr6[5];
                i11 = 0;
                float[] fArr7 = {f45 - f46, f47 - f48, f49 - f50, f51 - f52, f53 - f54, f55 - f56};
                float f57 = fArr7[0];
                float f58 = fArr7[1];
                if (((f48 - f56) * f57) - ((f46 - f54) * f58) >= 0.0f && ((f46 - f50) * f58) - ((f48 - f52) * f57) >= 0.0f) {
                    float f59 = fArr7[2];
                    float f60 = fArr7[3];
                    if (((f52 - f48) * f59) - ((f50 - f46) * f60) >= 0.0f && ((f50 - f54) * f60) - ((f52 - f56) * f59) >= 0.0f) {
                        float f61 = fArr7[4];
                        float f62 = fArr7[5];
                        if (((f56 - f52) * f61) - ((f54 - f50) * f62) < 0.0f || ((f54 - f46) * f62) - ((f56 - f48) * f61) < 0.0f) {
                        }
                    }
                }
                if (i10 == 0) {
                    z10 = 1;
                } else {
                    fArr3 = f.f13567a;
                    if (fArr4 == fArr3) {
                        i12 = i11;
                        while (true) {
                            if (i12 < 6) {
                                if (Float.compare(fArr4[i12], fArr3[i12]) != 0 || Math.abs(fArr4[i12] - fArr3[i12]) <= 0.001f) {
                                    i12++;
                                }
                            } else {
                                if (!d.c(uVar, k.f13602d)) {
                                    break;
                                }
                                float[] fArr8 = f.f13567a;
                                rgb = f.f13571e;
                                d10 = 0.0d;
                                while (true) {
                                    if (d10 > 1.0d) {
                                        if (Math.abs(jVar.g(d10) - rgb.f13550k.g(d10)) > 0.001d) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    z10 = 1;
                                    d10 += 0.00392156862745098d;
                                }
                            }
                            z10 = i11;
                        }
                    } else if (!d.c(uVar, k.f13602d) && f10 == 0.0f && f11 == 1.0f) {
                        float[] fArr9 = f.f13567a;
                        rgb = f.f13571e;
                        d10 = 0.0d;
                        while (true) {
                            if (d10 > 1.0d) {
                                z10 = 1;
                            } else if (Math.abs(jVar.g(d10) - rgb.f13550k.g(d10)) > 0.001d || Math.abs(jVar2.g(d10) - rgb.f13553n.g(d10)) > 0.001d) {
                                break;
                            } else {
                                d10 += 0.00392156862745098d;
                            }
                        }
                        z10 = i11;
                    } else {
                        z10 = i11;
                    }
                }
                this.f13556q = z10;
                return;
            }
            i11 = 0;
            int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                z10 = 1;
            } else {
                fArr3 = f.f13567a;
                if (fArr4 == fArr3) {
                    i12 = i11;
                    while (true) {
                        if (i12 < 6) {
                            if (Float.compare(fArr4[i12], fArr3[i12]) != 0) {
                            }
                            i12++;
                        } else {
                            if (!d.c(uVar, k.f13602d)) {
                                break;
                            }
                            float[] fArr10 = f.f13567a;
                            rgb = f.f13571e;
                            d10 = 0.0d;
                            while (true) {
                                if (d10 > 1.0d) {
                                    if (Math.abs(jVar.g(d10) - rgb.f13550k.g(d10)) > 0.001d) {
                                        break;
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                z10 = 1;
                                d10 += 0.00392156862745098d;
                            }
                        }
                        z10 = i11;
                    }
                } else if (!d.c(uVar, k.f13602d)) {
                    z10 = i11;
                } else {
                    float[] fArr11 = f.f13567a;
                    rgb = f.f13571e;
                    d10 = 0.0d;
                    while (true) {
                        if (d10 > 1.0d) {
                            if (Math.abs(jVar.g(d10) - rgb.f13550k.g(d10)) > 0.001d) {
                                break;
                                break;
                            } else {
                                break;
                                break;
                            }
                        }
                        z10 = 1;
                        d10 += 0.00392156862745098d;
                    }
                    z10 = i11;
                }
            }
            this.f13556q = z10;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, u uVar, final double d10, float f10, float f11, int i10) {
        j jVar = f13543r;
        this(str, fArr, uVar, null, d10 == 1.0d ? jVar : new j() { // from class: androidx.compose.ui.graphics.colorspace.o
            @Override // androidx.compose.ui.graphics.colorspace.j
            public final double g(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, 1.0d / d10);
            }
        }, d10 != 1.0d ? new j() { // from class: androidx.compose.ui.graphics.colorspace.p
            @Override // androidx.compose.ui.graphics.colorspace.j
            public final double g(double d11) {
                if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                return Math.pow(d11, d10);
            }
        } : jVar, f10, f11, new t(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
