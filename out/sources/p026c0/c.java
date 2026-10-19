package p026c0;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p026c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f22272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f22273b;

    /* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
    public static final class a {
        public static final float a(float f10, float[] fArr, float[] fArr2) {
            float f11;
            float f12;
            float f13;
            float f14;
            float fMax;
            float fAbs = Math.abs(f10);
            float fSignum = Math.signum(f10);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fMax = fSignum * fArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                int i11 = i10 - 1;
                if (i11 >= fArr.length - 1) {
                    float f15 = fArr[fArr.length - 1];
                    float f16 = fArr2[fArr.length - 1];
                    if (f15 == 0.0f) {
                        return 0.0f;
                    }
                    return (f16 / f15) * f10;
                }
                if (i11 == -1) {
                    float f17 = fArr[0];
                    f13 = fArr2[0];
                    f14 = f17;
                    f12 = 0.0f;
                    f11 = 0.0f;
                } else {
                    float f18 = fArr[i11];
                    float f19 = fArr[i10];
                    f11 = fArr2[i11];
                    f12 = f18;
                    f13 = fArr2[i10];
                    f14 = f19;
                }
                fMax = fSignum * (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11);
            }
            return fMax;
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f22272a = fArr;
        this.f22273b = fArr2;
    }

    @Override // p026c0.a
    public final float a(float f10) {
        return a.a(f10, this.f22273b, this.f22272a);
    }

    @Override // p026c0.a
    public final float b(float f10) {
        return a.a(f10, this.f22272a, this.f22273b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f22272a, cVar.f22272a) && Arrays.equals(this.f22273b, cVar.f22273b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22273b) + (Arrays.hashCode(this.f22272a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f22272a);
        i.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f22273b);
        i.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
