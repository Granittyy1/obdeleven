package D2;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: D2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FloatArrayEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0687n implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f2678a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f10, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f2678a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i10 = 0; i10 < fArr5.length; i10++) {
            float f11 = fArr3[i10];
            fArr5[i10] = Z3.n.b(fArr4[i10], f11, f10, f11);
        }
        return fArr5;
    }
}
