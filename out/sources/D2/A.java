package D2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: RectEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public final class A implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f2474a;

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f10, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i10 = rect3.left;
        int i11 = i10 + ((int) ((rect4.left - i10) * f10));
        int i12 = rect3.top;
        int i13 = i12 + ((int) ((rect4.top - i12) * f10));
        int i14 = rect3.right;
        int i15 = i14 + ((int) ((rect4.right - i14) * f10));
        int i16 = rect3.bottom;
        int i17 = i16 + ((int) ((rect4.bottom - i16) * f10));
        Rect rect5 = this.f2474a;
        if (rect5 == null) {
            return new Rect(i11, i13, i15, i17);
        }
        rect5.set(i11, i13, i15, i17);
        return rect5;
    }
}
