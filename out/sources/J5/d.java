package J5;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements TypeEvaluator<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatEvaluator f4037a;

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f10, Float f11, Float f12) {
        float fFloatValue = this.f4037a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (fFloatValue < 0.1f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
