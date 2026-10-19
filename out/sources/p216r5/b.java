package p216r5;

import Z3.n;
import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: ArgbEvaluatorCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements TypeEvaluator<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f46346a = new b();

    @Override // android.animation.TypeEvaluator
    public final Integer evaluate(float f10, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fB = n.b(f12, f11, f10, f11);
        float fB2 = n.b(fPow4, fPow, f10, fPow);
        float fB3 = n.b(fPow5, fPow2, f10, fPow2);
        float fB4 = n.b(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fB2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fB3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fB4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fB * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
