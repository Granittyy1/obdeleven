package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f27440b;

    public g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f27440b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        BaseTransientBottomBar baseTransientBottomBar = this.f27440b;
        BaseTransientBottomBar.g gVar = baseTransientBottomBar.f27396i;
        if (gVar == null) {
            return;
        }
        ViewParent parent = gVar.getParent();
        BaseTransientBottomBar.g gVar2 = baseTransientBottomBar.f27396i;
        if (parent != null) {
            gVar2.setVisibility(0);
        }
        if (gVar2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f27391d);
            valueAnimatorOfFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(baseTransientBottomBar.f27393f);
            valueAnimatorOfFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f27388a);
            animatorSet.addListener(new U5.f(i10, baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = gVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = gVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        gVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f27392e);
        valueAnimator.setDuration(baseTransientBottomBar.f27390c);
        valueAnimator.addListener(new U5.b(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
