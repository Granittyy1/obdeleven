package com.voltasit.obdeleven.presentation.main;

import android.animation.Animator;

/* JADX INFO: compiled from: MainFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainFragment f32631b;

    public g(MainFragment mainFragment) {
        this.f32631b = mainFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p10) {
        kotlin.jvm.internal.i.e(p10, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p10) {
        kotlin.jvm.internal.i.e(p10, "p0");
        this.f32631b.f32522q = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p10) {
        kotlin.jvm.internal.i.e(p10, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p10) {
        kotlin.jvm.internal.i.e(p10, "p0");
    }
}
