package androidx.compose.animation.core;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: androidx.compose.animation.core.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ArcSpline.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0915o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[][] f9583a;

    /* JADX INFO: renamed from: androidx.compose.animation.core.o$a */
    /* JADX INFO: compiled from: ArcSpline.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f9585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f9586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f9587d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f9588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f9589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f9590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f9591h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f9592i;
        public final float[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float f9593k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final float f9594l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final float f9595m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final float f9596n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final float f9597o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f9598p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float f9599q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final float f9600r;

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            float f16;
            this.f9584a = f10;
            this.f9585b = f11;
            this.f9586c = f12;
            this.f9587d = f13;
            this.f9588e = f14;
            this.f9589f = f15;
            float f17 = f14 - f12;
            float f18 = f15 - f13;
            boolean z10 = true;
            boolean z11 = i10 == 1 || (i10 == 4 ? f18 > 0.0f : !(i10 != 5 || f18 >= 0.0f));
            float f19 = z11 ? -1.0f : 1.0f;
            this.f9595m = f19;
            float f20 = 1 / (f11 - f10);
            this.f9593k = f20;
            this.j = new float[R.styleable.AppCompatTheme_switchStyle];
            boolean z12 = i10 == 3;
            if (z12 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
                float fHypot = (float) Math.hypot(f18, f17);
                this.f9590g = fHypot;
                this.f9594l = fHypot * f20;
                this.f9599q = f17 * f20;
                this.f9600r = f18 * f20;
                this.f9596n = Float.NaN;
                this.f9597o = Float.NaN;
            } else {
                this.f9596n = f17 * f19;
                this.f9597o = f18 * (-f19);
                this.f9599q = z11 ? f14 : f12;
                this.f9600r = z11 ? f13 : f15;
                float f21 = f14 - f12;
                float f22 = f13 - f15;
                float[] fArr = C0916p.f9613a;
                int i11 = 90;
                float f23 = 90;
                float f24 = f22;
                float fHypot2 = 0.0f;
                float f25 = 0.0f;
                int i12 = 1;
                while (true) {
                    double radians = (float) Math.toRadians((((double) i12) * 90.0d) / ((double) i11));
                    float fSin = ((float) Math.sin(radians)) * f21;
                    float fCos = ((float) Math.cos(radians)) * f22;
                    f16 = f23;
                    fHypot2 += (float) Math.hypot(fSin - f25, fCos - f24);
                    fArr[i12] = fHypot2;
                    i11 = 90;
                    if (i12 == 90) {
                        break;
                    }
                    i12++;
                    f24 = fCos;
                    f23 = f16;
                    f25 = fSin;
                }
                this.f9590g = fHypot2;
                int i13 = 1;
                while (true) {
                    fArr[i13] = fArr[i13] / fHypot2;
                    if (i13 == 90) {
                        break;
                    } else {
                        i13++;
                    }
                }
                float[] fArr2 = this.j;
                int length = fArr2.length;
                for (int i14 = 0; i14 < length; i14++) {
                    float f26 = i14 / 100.0f;
                    int iBinarySearch = Arrays.binarySearch(fArr, 0, 91, f26);
                    if (iBinarySearch >= 0) {
                        fArr2[i14] = iBinarySearch / f16;
                    } else {
                        if (iBinarySearch == -1) {
                            fArr2[i14] = 0.0f;
                        } else {
                            int i15 = -iBinarySearch;
                            int i16 = i15 - 2;
                            float f27 = i16;
                            float f28 = fArr[i16];
                            fArr2[i14] = (((f26 - f28) / (fArr[i15 - 1] - f28)) + f27) / f16;
                        }
                    }
                }
                this.f9594l = this.f9590g * this.f9593k;
                z10 = z12;
            }
            this.f9598p = z10;
        }

        public final float a() {
            float f10 = this.f9596n * this.f9592i;
            return f10 * this.f9595m * (this.f9594l / ((float) Math.hypot(f10, (-this.f9597o) * this.f9591h)));
        }

        public final float b() {
            float f10 = this.f9596n * this.f9592i;
            float f11 = (-this.f9597o) * this.f9591h;
            return f11 * this.f9595m * (this.f9594l / ((float) Math.hypot(f10, f11)));
        }

        public final void c(float f10) {
            float f11 = (this.f9595m == -1.0f ? this.f9585b - f10 : f10 - this.f9584a) * this.f9593k;
            float fB = 0.0f;
            if (f11 > 0.0f) {
                fB = 1.0f;
                if (f11 < 1.0f) {
                    float f12 = f11 * 100;
                    int i10 = (int) f12;
                    float[] fArr = this.j;
                    float f13 = fArr[i10];
                    fB = Z3.n.b(fArr[i10 + 1], f13, f12 - i10, f13);
                }
            }
            double d10 = fB * 1.5707964f;
            this.f9591h = (float) Math.sin(d10);
            this.f9592i = (float) Math.cos(d10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023 A[PHI: r10
      0x0023: PHI (r10v1 int) = (r10v0 int), (r10v6 int), (r10v7 int) binds: [B:5:0x0014, B:10:0x001d, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    public C0915o(int[] iArr, float[] fArr, float[][] fArr2) {
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            int i13 = iArr[i12];
            int i14 = 3;
            if (i13 == 0) {
                i11 = i14;
            } else if (i13 == 1) {
                i10 = 1;
                i11 = i10;
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        i14 = 4;
                        if (i13 != 4) {
                            i14 = 5;
                            if (i13 == 5) {
                                i11 = i14;
                            }
                        } else {
                            i11 = i14;
                        }
                    } else {
                        if (i10 != 1) {
                            i10 = 1;
                        }
                        i11 = i10;
                    }
                }
                i10 = 2;
                i11 = i10;
            }
            float[] fArr3 = fArr2[i12];
            int i15 = i12 + 1;
            float[] fArr4 = fArr2[i15];
            float f10 = fArr[i12];
            float f11 = fArr[i15];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            a[] aVarArr2 = new a[length2];
            int i16 = 0;
            while (i16 < length2) {
                int i17 = i16 * 2;
                int i18 = i17 + 1;
                int i19 = i16;
                a[] aVarArr3 = aVarArr2;
                aVarArr3[i19] = new a(i11, f10, f11, fArr3[i17], fArr3[i18], fArr4[i17], fArr4[i18]);
                i16 = i19 + 1;
                aVarArr2 = aVarArr3;
            }
            aVarArr[i12] = aVarArr2;
            i12 = i15;
        }
        this.f9583a = aVarArr;
    }
}
