package p077g0;

/* JADX INFO: compiled from: LinearCurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f35129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[][] f35130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f35131c;

    @Override // p077g0.b
    public final double b(double d10) {
        double d11;
        double d12;
        double dG;
        double[] dArr = this.f35129a;
        int length = dArr.length;
        double d13 = dArr[0];
        double[][] dArr2 = this.f35130b;
        if (d10 <= d13) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            dG = g(d13);
        } else {
            int i10 = length - 1;
            double d14 = dArr[i10];
            if (d10 < d14) {
                int i11 = 0;
                while (i11 < i10) {
                    double d15 = dArr[i11];
                    if (d10 == d15) {
                        return dArr2[i11][0];
                    }
                    int i12 = i11 + 1;
                    double d16 = dArr[i12];
                    if (d10 < d16) {
                        double d17 = (d10 - d15) / (d16 - d15);
                        return (dArr2[i12][0] * d17) + ((1.0d - d17) * dArr2[i11][0]);
                    }
                    i11 = i12;
                }
                return 0.0d;
            }
            d11 = dArr2[i10][0];
            d12 = d10 - d14;
            dG = g(d14);
        }
        return (dG * d12) + d11;
    }

    @Override // p077g0.b
    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f35129a;
        int length = dArr2.length;
        double[][] dArr3 = this.f35130b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        double[] dArr4 = this.f35131c;
        if (d10 <= d11) {
            e(d11, dArr4);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d10 - dArr2[0]) * dArr4[i11]) + dArr3[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr2[i12];
        if (d10 >= d12) {
            e(d12, dArr4);
            while (i10 < length2) {
                dArr[i10] = ((d10 - dArr2[i12]) * dArr4[i10]) + dArr3[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d10 == dArr2[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = dArr3[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d13 = dArr2[i15];
            if (d10 < d13) {
                double d14 = dArr2[i13];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    dArr[i10] = (dArr3[i15][i10] * d15) + ((1.0d - d15) * dArr3[i13][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // p077g0.b
    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f35129a;
        int length = dArr.length;
        double[][] dArr2 = this.f35130b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        double[] dArr3 = this.f35131c;
        if (d10 <= d11) {
            e(d11, dArr3);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d10 - dArr[0]) * dArr3[i11]) + dArr2[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        double d12 = dArr[i12];
        if (d10 >= d12) {
            e(d12, dArr3);
            while (i10 < length2) {
                fArr[i10] = (float) (((d10 - dArr[i12]) * dArr3[i10]) + dArr2[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d10 == dArr[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) dArr2[i13][i14];
                }
            }
            int i15 = i13 + 1;
            double d13 = dArr[i15];
            if (d10 < d13) {
                double d14 = dArr[i13];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    fArr[i10] = (float) ((dArr2[i15][i10] * d15) + ((1.0d - d15) * dArr2[i13][i10]));
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p077g0.b
    public final void e(double d10, double[] dArr) {
        double[] dArr2 = this.f35129a;
        int length = dArr2.length;
        double[][] dArr3 = this.f35130b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 <= d11) {
            d10 = d11;
        } else {
            d11 = dArr2[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d10 <= d12) {
                double d13 = d12 - dArr2[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = (dArr3[i11][i12] - dArr3[i10][i12]) / d13;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // p077g0.b
    public final double[] f() {
        return this.f35129a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public final double g(double d10) {
        double[] dArr = this.f35129a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 < d11) {
            d10 = d11;
        } else {
            d11 = dArr[length - 1];
            if (d10 >= d11) {
                d10 = d11;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d10 <= d12) {
                double d13 = d12 - dArr[i10];
                double[][] dArr2 = this.f35130b;
                return (dArr2[i11][0] - dArr2[i10][0]) / d13;
            }
            i10 = i11;
        }
        return 0.0d;
    }
}
