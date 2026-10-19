package p077g0;

import C4.b;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: SplineSet.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f35144b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f35145c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35147e;

    public final float a(float f10) {
        return (float) this.f35143a.b(f10);
    }

    public void b(float f10, int i10) {
        int[] iArr = this.f35144b;
        if (iArr.length < this.f35146d + 1) {
            this.f35144b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f35145c;
            this.f35145c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f35144b;
        int i11 = this.f35146d;
        iArr2[i11] = i10;
        this.f35145c[i11] = f10;
        this.f35146d = i11 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void c(int i10) {
        int i11 = this.f35146d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f35144b;
        float[] fArr = this.f35145c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
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
                        float f10 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = f10;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float f11 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = f11;
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
        int i24 = 1;
        for (int i25 = 1; i25 < this.f35146d; i25++) {
            int[] iArr3 = this.f35144b;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 1);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f35146d; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.f35144b;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.f35144b[i27]) * 0.01d;
                    dArr2[i26][0] = this.f35145c[i27];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.f35144b[i27]) * 0.01d;
                dArr2[i26][0] = this.f35145c[i27];
                i26++;
            }
        }
        this.f35143a = b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f35147e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35146d; i10++) {
            StringBuilder sbF = b.f(string, "[");
            sbF.append(this.f35144b[i10]);
            sbF.append(" , ");
            sbF.append(decimalFormat.format(this.f35145c[i10]));
            sbF.append("] ");
            string = sbF.toString();
        }
        return string;
    }
}
