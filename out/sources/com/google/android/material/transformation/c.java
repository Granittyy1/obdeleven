package com.google.android.material.transformation;

import C5.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: FabTransformationBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f27707b;

    public c(d dVar) {
        this.f27707b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f27707b;
        d.C0023d revealInfo = dVar.getRevealInfo();
        revealInfo.f2421c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
