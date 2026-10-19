package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: TabLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f27525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabLayout.f f27527d;

    public b(TabLayout.f fVar, View view, View view2) {
        this.f27527d = fVar;
        this.f27525b = view;
        this.f27526c = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f27527d.c(this.f27525b, this.f27526c, valueAnimator.getAnimatedFraction());
    }
}
