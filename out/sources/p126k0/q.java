package p126k0;

import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import java.util.LinkedHashMap;
import p077g0.c;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Comparable<q> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f41367s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f41368b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f41370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41375i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41369c = 0;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41376k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41377l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f41378m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f41379n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f41380o = new LinkedHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f41381p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f41382q = new double[18];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double[] f41383r = new double[18];

    public static boolean b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public static void e(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public final void a(b.a aVar) {
        int iOrdinal;
        this.f41368b = c.c(aVar.f16492d.f16580d);
        b.c cVar = aVar.f16492d;
        this.f41376k = cVar.f16581e;
        this.f41377l = cVar.f16578b;
        this.j = cVar.f16584h;
        this.f41369c = cVar.f16582f;
        this.f41378m = aVar.f16493e.f16511C;
        for (String str : aVar.f16495g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f16495g.get(str);
            if (constraintAttribute != null && (iOrdinal = constraintAttribute.f16366c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f41380o.put(str, constraintAttribute);
            }
        }
    }

    public final void c(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f41372f;
        float fCos = this.f41373g;
        float f10 = this.f41374h;
        float f11 = this.f41375i;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        n nVar = this.f41379n;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d13) * d12)) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = (f10 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        return Float.compare(this.f41371e, qVar.f41371e);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f41372f = f10;
        this.f41373g = f11;
        this.f41374h = f12;
        this.f41375i = f13;
    }

    public final void f(n nVar, q qVar) {
        double d10 = (((this.f41374h / 2.0f) + this.f41372f) - qVar.f41372f) - (qVar.f41374h / 2.0f);
        double d11 = (((this.f41375i / 2.0f) + this.f41373g) - qVar.f41373g) - (qVar.f41375i / 2.0f);
        this.f41379n = nVar;
        this.f41372f = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f41378m)) {
            this.f41373g = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f41373g = (float) Math.toRadians(this.f41378m);
        }
    }
}
