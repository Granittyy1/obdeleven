package com.braze.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AnimationUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationUtils {
    private static final Interpolator accelerateInterpolator = new AccelerateInterpolator();
    private static final Interpolator decelerateInterpolator = new DecelerateInterpolator();

    public static final Animation createHorizontalAnimation(float f10, float f11, long j, boolean z10) {
        return setAnimationParams(new TranslateAnimation(1, f10, 1, f11, 2, 0.0f, 2, 0.0f), j, z10);
    }

    public static final Animation createVerticalAnimation(float f10, float f11, long j, boolean z10) {
        return setAnimationParams(new TranslateAnimation(2, 0.0f, 2, 0.0f, 1, f10, 1, f11), j, z10);
    }

    public static final Animation setAnimationParams(Animation animation, long j, boolean z10) {
        i.e(animation, "animation");
        animation.setDuration(j);
        if (z10) {
            animation.setInterpolator(accelerateInterpolator);
        } else {
            animation.setInterpolator(decelerateInterpolator);
        }
        return animation;
    }
}
