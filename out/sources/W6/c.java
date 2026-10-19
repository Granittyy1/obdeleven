package W6;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.view.ViewGroup;

/* JADX INFO: compiled from: FiamAnimator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Application f7008c;

    public c(ViewGroup viewGroup, Application application) {
        this.f7007b = viewGroup;
        this.f7008c = application;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f7007b.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(this.f7008c.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
    }
}
