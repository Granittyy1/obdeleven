package p085g9;

import android.view.animation.Animation;

/* JADX INFO: compiled from: GaugeAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f35641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f35642b;

    public b(c cVar, c.a aVar) {
        this.f35642b = cVar;
        this.f35641a = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        synchronized (this.f35642b) {
            this.f35642b.f35648f.remove(this.f35641a.itemView);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
