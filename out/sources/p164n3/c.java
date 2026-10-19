package p164n3;

import D9.o;
import java.util.Arrays;

/* JADX INFO: compiled from: GradientColor.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f44829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f44830b;

    public c(float[] fArr, int[] iArr) {
        this.f44829a = fArr;
        this.f44830b = iArr;
    }

    public final c a(float[] fArr) {
        int i10;
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            float f10 = fArr[i11];
            float[] fArr2 = this.f44829a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f44830b;
            if (iBinarySearch >= 0) {
                i10 = iArr2[iBinarySearch];
            } else {
                int i12 = -(iBinarySearch + 1);
                if (i12 == 0) {
                    i10 = iArr2[0];
                } else if (i12 == iArr2.length - 1) {
                    i10 = iArr2[iArr2.length - 1];
                } else {
                    int i13 = i12 - 1;
                    float f11 = fArr2[i13];
                    i10 = o.i((f10 - f11) / (fArr2[i12] - f11), iArr2[i13], iArr2[i12]);
                }
            }
            iArr[i11] = i10;
        }
        return new c(fArr, iArr);
    }
}
