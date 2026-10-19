package p077g0;

import C4.b;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: TimeCycleSplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f35173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f35174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f35177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35179i;
    public float j;

    public final float a(float f10) {
        float fAbs;
        switch (this.f35172b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void b(float f10, float f11, float f12, int i10, int i11) {
        int i12 = this.f35175e;
        this.f35173c[i12] = i10;
        float[] fArr = this.f35174d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f35172b = Math.max(this.f35172b, i11);
        this.f35175e++;
    }

    public void c(int i10) {
        float[][] fArr;
        int i11 = this.f35175e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f35176f);
            return;
        }
        int[] iArr = this.f35173c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (true) {
            fArr = this.f35174d;
            if (i12 <= 0) {
                break;
            }
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            int i15 = i12 - 2;
            int i16 = iArr2[i15];
            if (i14 < i16) {
                int i17 = iArr[i16];
                int i18 = i14;
                int i19 = i18;
                while (i18 < i16) {
                    int i20 = iArr[i18];
                    if (i20 <= i17) {
                        int i21 = iArr[i19];
                        iArr[i19] = i20;
                        iArr[i18] = i21;
                        float[] fArr2 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = fArr2;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float[] fArr3 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = fArr3;
                iArr2[i15] = i19 - 1;
                iArr2[i13] = i14;
                int i23 = i12 + 1;
                iArr2[i12] = i16;
                i12 += 2;
                iArr2[i23] = i19 + 1;
            } else {
                i12 = i15;
            }
        }
        int i24 = 0;
        for (int i25 = 1; i25 < iArr.length; i25++) {
            if (iArr[i25] != iArr[i25 - 1]) {
                i24++;
            }
        }
        if (i24 == 0) {
            i24 = 1;
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 3);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f35175e; i27++) {
            if (i27 <= 0 || iArr[i27] != iArr[i27 - 1]) {
                dArr[i26] = ((double) iArr[i27]) * 0.01d;
                double[] dArr3 = dArr2[i26];
                float[] fArr4 = fArr[i27];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i26++;
            }
        }
        this.f35171a = b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f35176f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35175e; i10++) {
            StringBuilder sbF = b.f(string, "[");
            sbF.append(this.f35173c[i10]);
            sbF.append(" , ");
            sbF.append(decimalFormat.format(this.f35174d[i10]));
            sbF.append("] ");
            string = sbF.toString();
        }
        return string;
    }
}
