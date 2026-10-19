package p275w5;

import S5.f;
import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f47750b;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f47750b = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        f fVar = this.f47750b.j;
        if (fVar != null) {
            f.b bVar = fVar.f5566b;
            if (bVar.f5597i != fFloatValue) {
                bVar.f5597i = fFloatValue;
                fVar.f5570f = true;
                fVar.invalidateSelf();
            }
        }
    }
}
