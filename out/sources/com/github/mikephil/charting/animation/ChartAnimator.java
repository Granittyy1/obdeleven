package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    protected float mPhaseY = 1.0f;
    protected float mPhaseX = 1.0f;

    public ChartAnimator() {
    }

    private ObjectAnimator xAnimator(int i10, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i10);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator yAnimator(int i10, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.setDuration(i10);
        return objectAnimatorOfFloat;
    }

    public void animateX(int i10) {
        animateX(i10, Easing.Linear);
    }

    public void animateXY(int i10, int i11) {
        Easing.EasingFunction easingFunction = Easing.Linear;
        animateXY(i10, i11, easingFunction, easingFunction);
    }

    public void animateY(int i10) {
        animateY(i10, Easing.Linear);
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setPhaseX(float f10) {
        float f11 = 1.0f;
        if (f10 > 1.0f) {
            f10 = f11;
        } else {
            f11 = 0.0f;
            if (f10 < 0.0f) {
                f10 = f11;
            }
        }
        this.mPhaseX = f10;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setPhaseY(float f10) {
        float f11 = 1.0f;
        if (f10 > 1.0f) {
            f10 = f11;
        } else {
            f11 = 0.0f;
            if (f10 < 0.0f) {
                f10 = f11;
            }
        }
        this.mPhaseY = f10;
    }

    public void animateX(int i10, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i10, easingFunction);
        objectAnimatorXAnimator.addUpdateListener(this.mListener);
        objectAnimatorXAnimator.start();
    }

    public void animateXY(int i10, int i11, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i10, easingFunction);
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i11, easingFunction);
        if (i10 > i11) {
            objectAnimatorXAnimator.addUpdateListener(this.mListener);
        } else {
            objectAnimatorYAnimator.addUpdateListener(this.mListener);
        }
        objectAnimatorXAnimator.start();
        objectAnimatorYAnimator.start();
    }

    public void animateY(int i10, Easing.EasingFunction easingFunction) {
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i10, easingFunction);
        objectAnimatorYAnimator.addUpdateListener(this.mListener);
        objectAnimatorYAnimator.start();
    }

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    public void animateXY(int i10, int i11, Easing.EasingFunction easingFunction, Easing.EasingFunction easingFunction2) {
        ObjectAnimator objectAnimatorXAnimator = xAnimator(i10, easingFunction);
        ObjectAnimator objectAnimatorYAnimator = yAnimator(i11, easingFunction2);
        if (i10 > i11) {
            objectAnimatorXAnimator.addUpdateListener(this.mListener);
        } else {
            objectAnimatorYAnimator.addUpdateListener(this.mListener);
        }
        objectAnimatorXAnimator.start();
        objectAnimatorYAnimator.start();
    }
}
