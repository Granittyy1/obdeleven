package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f27434b;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f27434b = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f27434b.f27396i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
