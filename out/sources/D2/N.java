package D2;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f2548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f2549c;

    /* JADX INFO: compiled from: TransitionUtils.java */
    public static class a implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f2550a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f2551b = new float[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f2552c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f2550a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f2551b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f11 = fArr2[i10];
                float f12 = fArr[i10];
                fArr2[i10] = Z3.n.b(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.f2552c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f2547a = true;
        f2548b = true;
        f2549c = i10 >= 28;
    }
}
