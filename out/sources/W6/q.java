package W6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: compiled from: SwipeDismissTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7039c;

    public /* synthetic */ q(int i10, Object obj) {
        this.f7038b = i10;
        this.f7039c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f7038b) {
            case 0:
                u uVar = (u) this.f7039c;
                View view = uVar.f7054f;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height = view.getHeight();
                ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(uVar.f7053e);
                duration.addListener(new s(uVar, layoutParams, height));
                duration.addUpdateListener(new t(uVar, layoutParams));
                duration.start();
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f7038b) {
            case 1:
                ((BottomAppBar) this.f7039c).getClass();
                throw null;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
