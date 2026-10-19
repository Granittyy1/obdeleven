package p077g0;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: KeyCycleOscillator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<b> f35115f;

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f35116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f35117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double[] f35118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f35119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f35120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f35121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p077g0.b f35122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double[] f35123h;
    }

    /* JADX INFO: compiled from: KeyCycleOscillator.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f35125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f35126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f35127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f35128e;

        public b(float f10, float f11, float f12, float f13, int i10) {
            this.f35124a = i10;
            this.f35125b = f13;
            this.f35126c = f11;
            this.f35127d = f10;
            this.f35128e = f12;
        }
    }

    public final float a(float f10) {
        double dSignum;
        double dAbs;
        a aVar = this.f35110a;
        p077g0.b bVar = aVar.f35122g;
        if (bVar != null) {
            bVar.c(f10, aVar.f35123h);
        } else {
            double[] dArr = aVar.f35123h;
            dArr[0] = aVar.f35120e[0];
            dArr[1] = aVar.f35121f[0];
            dArr[2] = aVar.f35117b[0];
        }
        double[] dArr2 = aVar.f35123h;
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        double d12 = f10;
        h hVar = aVar.f35116a;
        hVar.getClass();
        double d13 = 0.0d;
        if (d12 > 0.0d) {
            if (d12 >= 1.0d) {
                d13 = 1.0d;
            } else {
                int iBinarySearch = Arrays.binarySearch(hVar.f35137b, d12);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                float[] fArr = hVar.f35136a;
                float f11 = fArr[iBinarySearch];
                int i10 = iBinarySearch - 1;
                float f12 = fArr[i10];
                double[] dArr3 = hVar.f35137b;
                double d14 = dArr3[iBinarySearch];
                double d15 = dArr3[i10];
                double d16 = ((double) (f11 - f12)) / (d14 - d15);
                d13 = ((((d12 * d12) - (d15 * d15)) * d16) / 2.0d) + ((d12 - d15) * (((double) f12) - (d16 * d15))) + hVar.f35138c[i10];
            }
        }
        double d17 = d13 + d11;
        switch (hVar.f35140e) {
            case 1:
                dSignum = Math.signum(0.5d - (d17 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d17 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d17 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d17 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d11 + d17) * 6.283185307179586d);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d17 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = hVar.f35139d.b(d17 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d17);
                break;
        }
        return (float) ((dSignum * aVar.f35123h[2]) + d10);
    }

    public final void c() {
        int i10;
        ArrayList<b> arrayList = this.f35115f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new d());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        int i11 = this.f35112c;
        String str = this.f35113d;
        a aVar = new a();
        h hVar = new h();
        hVar.f35136a = new float[0];
        hVar.f35137b = new double[0];
        aVar.f35116a = hVar;
        hVar.f35140e = i11;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i12 = 0;
            while (iIndexOf2 != -1) {
                dArr3[i12] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                int i13 = iIndexOf2 + 1;
                i12++;
                iIndexOf = i13;
                iIndexOf2 = str.indexOf(44, i13);
            }
            dArr3[i12] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i12 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d10 = 1.0d / ((double) length2);
            char c10 = 0;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr5 = new double[length];
            int i14 = 0;
            while (i14 < dArrCopyOf.length) {
                double d11 = dArrCopyOf[i14];
                int i15 = i14 + length2;
                dArr4[i15][c10] = d11;
                double[][] dArr6 = dArr4;
                double d12 = ((double) i14) * d10;
                dArr5[i15] = d12;
                if (i14 > 0) {
                    int i16 = (length2 * 2) + i14;
                    dArr6[i16][c10] = d11 + 1.0d;
                    dArr5[i16] = d12 + 1.0d;
                    int i17 = i14 - 1;
                    dArr6[i17][c10] = (d11 - 1.0d) - d10;
                    dArr5[i17] = (d12 - 1.0d) - d10;
                }
                i14++;
                dArr4 = dArr6;
                c10 = 0;
            }
            hVar.f35139d = new g(dArr5, dArr4);
        }
        aVar.f35117b = new float[size];
        aVar.f35118c = new double[size];
        aVar.f35119d = new float[size];
        aVar.f35120e = new float[size];
        aVar.f35121f = new float[size];
        float[] fArr = new float[size];
        this.f35110a = aVar;
        int i18 = 0;
        for (b bVar : arrayList) {
            float f10 = bVar.f35127d;
            dArr[i18] = ((double) f10) * 0.01d;
            double[] dArr7 = dArr2[i18];
            float f11 = bVar.f35125b;
            dArr7[0] = f11;
            float f12 = bVar.f35126c;
            dArr7[1] = f12;
            float f13 = bVar.f35128e;
            dArr7[2] = f13;
            a aVar2 = this.f35110a;
            aVar2.f35118c[i18] = ((double) bVar.f35124a) / 100.0d;
            aVar2.f35119d[i18] = f10;
            aVar2.f35120e[i18] = f12;
            aVar2.f35121f[i18] = f13;
            aVar2.f35117b[i18] = f11;
            i18++;
        }
        a aVar3 = this.f35110a;
        double[] dArr8 = aVar3.f35118c;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr8.length, 3);
        float[] fArr2 = aVar3.f35117b;
        aVar3.f35123h = new double[fArr2.length + 2];
        double[] dArr10 = new double[fArr2.length + 2];
        double d13 = dArr8[0];
        float[] fArr3 = aVar3.f35119d;
        h hVar2 = aVar3.f35116a;
        if (d13 > 0.0d) {
            hVar2.a(0.0d, fArr3[0]);
        }
        int length3 = dArr8.length - 1;
        if (dArr8[length3] < 1.0d) {
            hVar2.a(1.0d, fArr3[length3]);
        }
        for (int i19 = 0; i19 < dArr9.length; i19++) {
            double[] dArr11 = dArr9[i19];
            dArr11[0] = aVar3.f35120e[i19];
            dArr11[1] = aVar3.f35121f[i19];
            dArr11[2] = fArr2[i19];
            hVar2.a(dArr8[i19], fArr3[i19]);
        }
        int i20 = 0;
        double d14 = 0.0d;
        while (true) {
            float[] fArr4 = hVar2.f35136a;
            if (i20 >= fArr4.length) {
                break;
            }
            d14 += (double) fArr4[i20];
            i20++;
        }
        int i21 = 1;
        double d15 = 0.0d;
        while (true) {
            float[] fArr5 = hVar2.f35136a;
            if (i21 >= fArr5.length) {
                break;
            }
            int i22 = i21 - 1;
            float f14 = (fArr5[i22] + fArr5[i21]) / 2.0f;
            double[] dArr12 = hVar2.f35137b;
            d15 = ((dArr12[i21] - dArr12[i22]) * ((double) f14)) + d15;
            i21++;
        }
        int i23 = 0;
        while (true) {
            float[] fArr6 = hVar2.f35136a;
            if (i23 >= fArr6.length) {
                break;
            }
            fArr6[i23] = fArr6[i23] * ((float) (d14 / d15));
            i23++;
        }
        hVar2.f35138c[0] = 0.0d;
        int i24 = 1;
        while (true) {
            float[] fArr7 = hVar2.f35136a;
            if (i24 >= fArr7.length) {
                break;
            }
            int i25 = i24 - 1;
            float f15 = (fArr7[i25] + fArr7[i24]) / 2.0f;
            double[] dArr13 = hVar2.f35137b;
            double d16 = dArr13[i24] - dArr13[i25];
            double[] dArr14 = hVar2.f35138c;
            dArr14[i24] = (d16 * ((double) f15)) + dArr14[i25];
            i24++;
        }
        if (dArr8.length > 1) {
            i10 = 0;
            aVar3.f35122g = p077g0.b.a(0, dArr8, dArr9);
        } else {
            i10 = 0;
            aVar3.f35122g = null;
        }
        p077g0.b.a(i10, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f35111b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (b bVar : this.f35115f) {
            StringBuilder sbF = C4.b.f(string, "[");
            sbF.append(bVar.f35124a);
            sbF.append(" , ");
            sbF.append(decimalFormat.format(bVar.f35125b));
            sbF.append("] ");
            string = sbF.toString();
        }
        return string;
    }

    public void b(ConstraintAttribute constraintAttribute) {
    }
}
