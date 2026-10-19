package com.voltasit.obdeleven.presentation.garage;

import android.view.animation.Animation;

/* JADX INFO: compiled from: GarageAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f32367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f32368b;

    public f(a aVar, a.b bVar) {
        this.f32367a = aVar;
        this.f32368b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
        a aVar = this.f32367a;
        a.b bVar = this.f32368b;
        synchronized (this) {
            aVar.f32355d.remove(bVar.itemView);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.i.e(animation, "animation");
    }
}
