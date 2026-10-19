package androidx.compose.animation;

import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.animation.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0898a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f9328a;

    /* JADX INFO: renamed from: androidx.compose.animation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SplineBasedDecay.kt */
    public static final class C0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f9329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f9330b;

        public C0119a(float f10, float f11) {
            this.f9329a = f10;
            this.f9330b = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0119a)) {
                return false;
            }
            C0119a c0119a = (C0119a) obj;
            return Float.compare(this.f9329a, c0119a.f9329a) == 0 && Float.compare(this.f9330b, c0119a.f9330b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f9330b) + (Float.hashCode(this.f9329a) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
            sb2.append(this.f9329a);
            sb2.append(", velocityCoefficient=");
            return B7.b.d(sb2, this.f9330b, ')');
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[R.styleable.AppCompatTheme_switchStyle];
        f9328a = fArr;
        float[] fArr2 = new float[R.styleable.AppCompatTheme_switchStyle];
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f20 = i10 / 100;
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            fArr[i10] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f20) {
                        f24 = f14;
                    } else {
                        f19 = f14;
                    }
                    f23 = 0.5f;
                }
            }
            fArr2[i10] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C0119a a(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fC = Na.l.C(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fC);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f9328a;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float fB = Z3.n.b(fC, f14, f17, f16);
            f11 = f17;
            f12 = fB;
        }
        return new C0119a(f12, f11);
    }
}
