package com.voltasit.obdeleven.presentation.controlunitlist;

import android.view.animation.Animation;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ControlUnitAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f32036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f32037b;

    public d(a aVar, a.b bVar) {
        this.f32036a = aVar;
        this.f32037b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i.e(animation, "animation");
        a aVar = this.f32036a;
        a.b bVar = this.f32037b;
        synchronized (this) {
            aVar.f32026e.remove(bVar.itemView);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        i.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        i.e(animation, "animation");
    }
}
