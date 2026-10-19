package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: Oklab.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f13604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f13605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f13606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f13607g;

    static {
        float[] fArrF = d.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.b(a.f13557b.f13558a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f13604d = fArrF;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f13605e = fArr;
        f13606f = d.e(fArrF);
        f13607g = d.e(fArr);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] a(float[] fArr) {
        d.h(f13604d, fArr);
        fArr[0] = D9.o.j(fArr[0]);
        fArr[1] = D9.o.j(fArr[1]);
        fArr[2] = D9.o.j(fArr[2]);
        d.h(f13605e, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f13607g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f13606f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f19) + ((fArr2[3] * f18) + (fArr2[0] * f17)))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] f(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        d.h(f13607g, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        d.h(f13606f, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f13607g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f13606f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f13604d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fJ = D9.o.j(f14);
        float fJ2 = D9.o.j(f15);
        float fJ3 = D9.o.j(f16);
        float[] fArr2 = f13605e;
        return Q3.d.c((fArr2[6] * fJ3) + (fArr2[3] * fJ2) + (fArr2[0] * fJ), (fArr2[7] * fJ3) + (fArr2[4] * fJ2) + (fArr2[1] * fJ), (fArr2[8] * fJ3) + (fArr2[5] * fJ2) + (fArr2[2] * fJ), f13, cVar);
    }
}
