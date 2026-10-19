package p077g0;

/* JADX INFO: compiled from: CurveFit.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: CurveFit.java */
    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f35101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f35102b;

        @Override // p077g0.b
        public final double b(double d10) {
            return this.f35102b[0];
        }

        @Override // p077g0.b
        public final void c(double d10, double[] dArr) {
            double[] dArr2 = this.f35102b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p077g0.b
        public final void d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f35102b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // p077g0.b
        public final void e(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f35102b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // p077g0.b
        public final double[] f() {
            return new double[]{this.f35101a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new g(dArr, dArr2);
        }
        if (i10 == 2) {
            double d10 = dArr[0];
            double[] dArr3 = dArr2[0];
            a aVar = new a();
            aVar.f35101a = d10;
            aVar.f35102b = dArr3;
            return aVar;
        }
        f fVar = new f();
        int length = dArr2[0].length;
        fVar.f35131c = new double[length];
        fVar.f35129a = dArr;
        fVar.f35130b = dArr2;
        if (length > 2) {
            double d11 = 0.0d;
            int i11 = 0;
            while (true) {
                double d12 = d11;
                if (i11 >= dArr.length) {
                    break;
                }
                double d13 = dArr2[i11][0];
                if (i11 > 0) {
                    Math.hypot(d13 - d11, d13 - d12);
                }
                i11++;
                d11 = d13;
            }
        }
        return fVar;
    }

    public abstract double b(double d10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract void e(double d10, double[] dArr);

    public abstract double[] f();
}
