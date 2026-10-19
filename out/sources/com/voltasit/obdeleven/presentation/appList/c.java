package com.voltasit.obdeleven.presentation.appList;

import android.view.animation.Animation;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AppAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f31313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f31314b;

    public c(a aVar, a.b bVar) {
        this.f31313a = aVar;
        this.f31314b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i.e(animation, "animation");
        a aVar = this.f31313a;
        a.b bVar = this.f31314b;
        synchronized (aVar) {
            aVar.j.remove(bVar.itemView);
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
