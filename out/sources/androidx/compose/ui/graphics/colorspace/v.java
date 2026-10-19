package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: Xyz.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends c {
    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] a(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float b(int i10) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float c(int i10) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long e(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float[] f(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final float g(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // androidx.compose.ui.graphics.colorspace.c
    public final long h(float f10, float f11, float f12, float f13, c cVar) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return Q3.d.c(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, cVar);
    }
}
