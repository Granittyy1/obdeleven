package U5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6508c;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f6508c = baseTransientBottomBar;
        this.f6507b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6508c.d(this.f6507b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f6508c;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.j;
        snackbarContentLayout.f27430b.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = snackbarContentLayout.f27430b.animate().alpha(0.0f);
        long j = baseTransientBottomBar.f27389b;
        ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f27432d;
        long j10 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
        if (snackbarContentLayout.f27431c.getVisibility() == 0) {
            snackbarContentLayout.f27431c.setAlpha(1.0f);
            snackbarContentLayout.f27431c.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j10).start();
        }
    }
}
