package p147l9;

import android.view.animation.Animation;

/* JADX INFO: compiled from: VehicleAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.a f44500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f44501b;

    public g(h hVar, h.a aVar) {
        this.f44501b = hVar;
        this.f44500a = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        synchronized (this.f44501b) {
            this.f44501b.j.remove(this.f44500a.itemView);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
