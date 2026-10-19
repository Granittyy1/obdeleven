package p077g0;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ArcCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f35081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0369a[] f35082b;

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArcCurveFit.java */
    public static class C0369a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final double[] f35083s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f35084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f35085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f35086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f35087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f35088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f35089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f35090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f35091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f35092i;
        public double j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f35093k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f35094l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f35095m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f35096n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f35097o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f35098p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f35099q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f35100r;

        public final double a() {
            double d10 = this.j * this.f35098p;
            double dHypot = this.f35096n / Math.hypot(d10, (-this.f35093k) * this.f35097o);
            if (this.f35099q) {
                d10 = -d10;
            }
            return d10 * dHypot;
        }

        public final double b() {
            double d10 = this.j * this.f35098p;
            double d11 = (-this.f35093k) * this.f35097o;
            double dHypot = this.f35096n / Math.hypot(d10, d11);
            return this.f35099q ? (-d11) * dHypot : d11 * dHypot;
        }

        public final double c(double d10) {
            double d11 = (d10 - this.f35086c) * this.f35092i;
            double d12 = this.f35089f;
            double d13 = this.f35088e;
            return ((d12 - d13) * d11) + d13;
        }

        public final double d(double d10) {
            double d11 = (d10 - this.f35086c) * this.f35092i;
            double d12 = this.f35091h;
            double d13 = this.f35090g;
            return ((d12 - d13) * d11) + d13;
        }

        public final double e() {
            return (this.j * this.f35097o) + this.f35094l;
        }

        public final double f() {
            return (this.f35093k * this.f35098p) + this.f35095m;
        }

        public final void g(double d10) {
            double d11 = (this.f35099q ? this.f35087d - d10 : d10 - this.f35086c) * this.f35092i;
            double d12 = 0.0d;
            if (d11 > 0.0d) {
                d12 = 1.0d;
                if (d11 < 1.0d) {
                    double[] dArr = this.f35084a;
                    double length = d11 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    double d13 = dArr[i10];
                    d12 = ((dArr[i10 + 1] - d13) * (length - ((double) i10))) + d13;
                }
            }
            double d14 = d12 * 1.5707963267948966d;
            this.f35097o = Math.sin(d14);
            this.f35098p = Math.cos(d14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        C0369a c0369a;
        double[] dArr3;
        a aVar = this;
        double[] dArr4 = dArr;
        aVar.f35081a = dArr4;
        int i10 = 1;
        aVar.f35082b = new C0369a[dArr4.length - 1];
        ?? r10 = 0;
        int i11 = 0;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            C0369a[] c0369aArr = aVar.f35082b;
            if (i11 >= c0369aArr.length) {
                return;
            }
            int i14 = iArr[i11];
            if (i14 == 0) {
                i13 = 3;
            } else if (i14 == i10) {
                i12 = i10;
                i13 = i12;
            } else {
                if (i14 != 2) {
                    if (i14 == 3) {
                        if (i12 != i10) {
                            i12 = i10;
                        }
                        i13 = i12;
                    } else if (i14 == 4) {
                        i13 = 4;
                    } else if (i14 == 5) {
                        i13 = 5;
                    }
                }
                i12 = 2;
                i13 = i12;
            }
            double d10 = dArr4[i11];
            int i15 = i11 + 1;
            double d11 = dArr4[i15];
            double[] dArr5 = dArr2[i11];
            double d12 = dArr5[r10];
            double d13 = dArr5[i10];
            double[] dArr6 = dArr2[i15];
            double d14 = dArr6[r10];
            int i16 = i11;
            int i17 = i12;
            double d15 = dArr6[i10];
            C0369a c0369a2 = new C0369a();
            c0369a2.f35100r = r10;
            double d16 = d14 - d12;
            double d17 = d15 - d13;
            boolean z10 = true;
            if (i13 != 1) {
                if (i13 == 4) {
                    c0369a2.f35099q = d17 > 0.0d;
                } else if (i13 != 5) {
                    c0369a2.f35099q = false;
                } else {
                    c0369a2.f35099q = d17 < 0.0d;
                }
                z10 = true;
            } else {
                c0369a2.f35099q = true;
            }
            c0369a2.f35086c = r16;
            c0369a2.f35087d = d11;
            double d18 = d11 - d10;
            double d19 = 1.0d / d18;
            c0369a2.f35092i = d19;
            if (3 == i13) {
                c0369a2.f35100r = z10;
            }
            if (c0369a2.f35100r || Math.abs(d16) < 0.001d || Math.abs(d17) < 0.001d) {
                c0369a = c0369a2;
                c0369a.f35100r = true;
                c0369a.f35088e = d12;
                c0369a.f35089f = d14;
                c0369a.f35090g = d13;
                c0369a.f35091h = d15;
                double dHypot = Math.hypot(d17, d16);
                c0369a.f35085b = dHypot;
                c0369a.f35096n = dHypot * d19;
                c0369a.f35094l = d16 / d18;
                c0369a.f35095m = d17 / d18;
            } else {
                c0369a2.f35084a = new double[R.styleable.AppCompatTheme_switchStyle];
                boolean z11 = c0369a2.f35099q;
                c0369a2.j = ((double) (z11 ? -1 : 1)) * d16;
                c0369a2.f35093k = d17 * ((double) (z11 ? 1 : -1));
                c0369a2.f35094l = z11 ? d14 : d12;
                c0369a2.f35095m = z11 ? d13 : d15;
                double d20 = d13 - d15;
                double dHypot2 = 0.0d;
                double d21 = 0.0d;
                double d22 = 0.0d;
                int i18 = 0;
                while (true) {
                    dArr3 = C0369a.f35083s;
                    if (i18 >= 91) {
                        break;
                    }
                    C0369a c0369a3 = c0369a2;
                    double d23 = dHypot2;
                    double radians = Math.toRadians((((double) i18) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d16;
                    double dCos = Math.cos(radians) * d20;
                    if (i18 > 0) {
                        dHypot2 = Math.hypot(dSin - d21, dCos - d22) + d23;
                        dArr3[i18] = dHypot2;
                    } else {
                        dHypot2 = d23;
                    }
                    i18++;
                    d22 = dCos;
                    d21 = dSin;
                    c0369a2 = c0369a3;
                }
                c0369a = c0369a2;
                c0369a.f35085b = dHypot2;
                for (int i19 = 0; i19 < 91; i19++) {
                    dArr3[i19] = dArr3[i19] / dHypot2;
                }
                int i20 = 0;
                while (true) {
                    double[] dArr7 = c0369a.f35084a;
                    if (i20 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i20) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i20] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i20] = 0.0d;
                    } else {
                        int i21 = -iBinarySearch;
                        int i22 = i21 - 2;
                        double d24 = dArr3[i22];
                        dArr7[i20] = (((length - d24) / (dArr3[i21 - 1] - d24)) + ((double) i22)) / ((double) 90);
                    }
                    i20++;
                }
                c0369a.f35096n = c0369a.f35085b * c0369a.f35092i;
            }
            c0369aArr[i16] = c0369a;
            aVar = this;
            dArr4 = dArr;
            i11 = i15;
            i12 = i17;
            r10 = 0;
            i10 = 1;
        }
    }

    @Override // p077g0.b
    public final double b(double d10) {
        C0369a[] c0369aArr = this.f35082b;
        C0369a c0369a = c0369aArr[0];
        double d11 = c0369a.f35086c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0369a.f35100r) {
                return (d12 * c0369aArr[0].f35094l) + c0369a.c(d11);
            }
            c0369a.g(d11);
            return (c0369aArr[0].a() * d12) + c0369aArr[0].e();
        }
        if (d10 > c0369aArr[c0369aArr.length - 1].f35087d) {
            double d13 = c0369aArr[c0369aArr.length - 1].f35087d;
            double d14 = d10 - d13;
            int length = c0369aArr.length - 1;
            return (d14 * c0369aArr[length].f35094l) + c0369aArr[length].c(d13);
        }
        for (int i10 = 0; i10 < c0369aArr.length; i10++) {
            C0369a c0369a2 = c0369aArr[i10];
            if (d10 <= c0369a2.f35087d) {
                if (c0369a2.f35100r) {
                    return c0369a2.c(d10);
                }
                c0369a2.g(d10);
                return c0369aArr[i10].e();
            }
        }
        return Double.NaN;
    }

    @Override // p077g0.b
    public final void c(double d10, double[] dArr) {
        C0369a[] c0369aArr = this.f35082b;
        C0369a c0369a = c0369aArr[0];
        double d11 = c0369a.f35086c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0369a.f35100r) {
                double dC = c0369a.c(d11);
                C0369a c0369a2 = c0369aArr[0];
                dArr[0] = (c0369a2.f35094l * d12) + dC;
                dArr[1] = (d12 * c0369aArr[0].f35095m) + c0369a2.d(d11);
                return;
            }
            c0369a.g(d11);
            dArr[0] = (c0369aArr[0].a() * d12) + c0369aArr[0].e();
            dArr[1] = (c0369aArr[0].b() * d12) + c0369aArr[0].f();
            return;
        }
        if (d10 <= c0369aArr[c0369aArr.length - 1].f35087d) {
            for (int i10 = 0; i10 < c0369aArr.length; i10++) {
                C0369a c0369a3 = c0369aArr[i10];
                if (d10 <= c0369a3.f35087d) {
                    if (c0369a3.f35100r) {
                        dArr[0] = c0369a3.c(d10);
                        dArr[1] = c0369aArr[i10].d(d10);
                        return;
                    } else {
                        c0369a3.g(d10);
                        dArr[0] = c0369aArr[i10].e();
                        dArr[1] = c0369aArr[i10].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = c0369aArr[c0369aArr.length - 1].f35087d;
        double d14 = d10 - d13;
        int length = c0369aArr.length - 1;
        C0369a c0369a4 = c0369aArr[length];
        if (c0369a4.f35100r) {
            double dC2 = c0369a4.c(d13);
            C0369a c0369a5 = c0369aArr[length];
            dArr[0] = (c0369a5.f35094l * d14) + dC2;
            dArr[1] = (d14 * c0369aArr[length].f35095m) + c0369a5.d(d13);
            return;
        }
        c0369a4.g(d10);
        dArr[0] = (c0369aArr[length].a() * d14) + c0369aArr[length].e();
        dArr[1] = (c0369aArr[length].b() * d14) + c0369aArr[length].f();
    }

    @Override // p077g0.b
    public final void d(double d10, float[] fArr) {
        C0369a[] c0369aArr = this.f35082b;
        C0369a c0369a = c0369aArr[0];
        double d11 = c0369a.f35086c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0369a.f35100r) {
                double dC = c0369a.c(d11);
                C0369a c0369a2 = c0369aArr[0];
                fArr[0] = (float) ((c0369a2.f35094l * d12) + dC);
                fArr[1] = (float) ((d12 * c0369aArr[0].f35095m) + c0369a2.d(d11));
                return;
            }
            c0369a.g(d11);
            fArr[0] = (float) ((c0369aArr[0].a() * d12) + c0369aArr[0].e());
            fArr[1] = (float) ((c0369aArr[0].b() * d12) + c0369aArr[0].f());
            return;
        }
        if (d10 <= c0369aArr[c0369aArr.length - 1].f35087d) {
            for (int i10 = 0; i10 < c0369aArr.length; i10++) {
                C0369a c0369a3 = c0369aArr[i10];
                if (d10 <= c0369a3.f35087d) {
                    if (c0369a3.f35100r) {
                        fArr[0] = (float) c0369a3.c(d10);
                        fArr[1] = (float) c0369aArr[i10].d(d10);
                        return;
                    } else {
                        c0369a3.g(d10);
                        fArr[0] = (float) c0369aArr[i10].e();
                        fArr[1] = (float) c0369aArr[i10].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = c0369aArr[c0369aArr.length - 1].f35087d;
        double d14 = d10 - d13;
        int length = c0369aArr.length - 1;
        C0369a c0369a4 = c0369aArr[length];
        if (!c0369a4.f35100r) {
            c0369a4.g(d10);
            fArr[0] = (float) c0369aArr[length].e();
            fArr[1] = (float) c0369aArr[length].f();
        } else {
            double dC2 = c0369a4.c(d13);
            C0369a c0369a5 = c0369aArr[length];
            fArr[0] = (float) ((c0369a5.f35094l * d14) + dC2);
            fArr[1] = (float) ((d14 * c0369aArr[length].f35095m) + c0369a5.d(d13));
        }
    }

    @Override // p077g0.b
    public final void e(double d10, double[] dArr) {
        C0369a[] c0369aArr = this.f35082b;
        double d11 = c0369aArr[0].f35086c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0369aArr[c0369aArr.length - 1].f35087d) {
            d10 = c0369aArr[c0369aArr.length - 1].f35087d;
        }
        for (int i10 = 0; i10 < c0369aArr.length; i10++) {
            C0369a c0369a = c0369aArr[i10];
            if (d10 <= c0369a.f35087d) {
                if (c0369a.f35100r) {
                    dArr[0] = c0369a.f35094l;
                    dArr[1] = c0369a.f35095m;
                    return;
                } else {
                    c0369a.g(d10);
                    dArr[0] = c0369aArr[i10].a();
                    dArr[1] = c0369aArr[i10].b();
                    return;
                }
            }
        }
    }

    @Override // p077g0.b
    public final double[] f() {
        return this.f35081a;
    }
}
