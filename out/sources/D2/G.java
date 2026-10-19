package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.C0873a;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public final class G extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0873a f2527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f2528c;

    public G(F f10, C0873a c0873a) {
        this.f2528c = f10;
        this.f2527b = c0873a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2527b.remove(animator);
        this.f2528c.f2514s.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2528c.f2514s.add(animator);
    }
}
