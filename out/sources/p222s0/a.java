package p222s0;

import android.graphics.Color;
import androidx.core.view.C1293h;

/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<double[]> f46849a = new ThreadLocal<>();

    public static int a(float[] fArr) {
        int iF;
        int iRound;
        int iF2 = 0;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fAbs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f10) / 60) {
            case 0:
                iF2 = C1293h.f(fAbs, f13, 255.0f);
                iF = C1293h.f(fAbs2, f13, 255.0f);
                iRound = Math.round(f13 * 255.0f);
                break;
            case 1:
                iF2 = C1293h.f(fAbs2, f13, 255.0f);
                iF = C1293h.f(fAbs, f13, 255.0f);
                iRound = Math.round(f13 * 255.0f);
                break;
            case 2:
                iF2 = Math.round(f13 * 255.0f);
                iF = C1293h.f(fAbs, f13, 255.0f);
                iRound = C1293h.f(fAbs2, f13, 255.0f);
                break;
            case 3:
                iF2 = Math.round(f13 * 255.0f);
                iF = C1293h.f(fAbs2, f13, 255.0f);
                iRound = C1293h.f(fAbs, f13, 255.0f);
                break;
            case 4:
                iF2 = C1293h.f(fAbs2, f13, 255.0f);
                iF = Math.round(f13 * 255.0f);
                iRound = C1293h.f(fAbs, f13, 255.0f);
                break;
            case 5:
            case 6:
                iF2 = C1293h.f(fAbs, f13, 255.0f);
                iF = Math.round(f13 * 255.0f);
                iRound = C1293h.f(fAbs2, f13, 255.0f);
                break;
            default:
                iRound = 0;
                iF = 0;
                break;
        }
        return Color.rgb(g(iF2), g(iF), g(iRound));
    }

    public static int b(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        return Color.rgb(g((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d)), g((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d)), g((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d)));
    }

    public static double c(int i10) {
        ThreadLocal<double[]> threadLocal = f46849a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) iRed) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iGreen) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) iBlue) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d;
    }

    public static void d(int i10, float[] fArr) {
        float f10;
        float fAbs;
        float fRed = Color.red(i10) / 255.0f;
        float fGreen = Color.green(i10) / 255.0f;
        float fBlue = Color.blue(i10) / 255.0f;
        float fMax = Math.max(fRed, Math.max(fGreen, fBlue));
        float fMin = Math.min(fRed, Math.min(fGreen, fBlue));
        float f11 = fMax - fMin;
        float f12 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f10 = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == fRed) {
                f10 = ((fGreen - fBlue) / f11) % 6.0f;
            } else {
                f10 = fMax == fGreen ? ((fBlue - fRed) / f11) + 2.0f : ((fRed - fGreen) / f11) + 4.0f;
            }
            fAbs = f11 / (1.0f - Math.abs((2.0f * f12) - 1.0f));
        }
        float f13 = (f10 * 60.0f) % 360.0f;
        if (f13 < 0.0f) {
            f13 += 360.0f;
        }
        fArr[0] = f13 < 0.0f ? 0.0f : Math.min(f13, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f12 >= 0.0f ? Math.min(f12, 1.0f) : 0.0f;
    }

    public static int e(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, f(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), f(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), f(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    public static int f(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static int g(int i10) {
        if (i10 < 0) {
            return 0;
        }
        return Math.min(i10, 255);
    }

    public static int h(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
