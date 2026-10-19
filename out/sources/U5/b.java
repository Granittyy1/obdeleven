package U5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f6506b;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6506b = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6506b.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f6506b;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.j;
        int i10 = baseTransientBottomBar.f27390c;
        int i11 = baseTransientBottomBar.f27388a;
        int i12 = i10 - i11;
        snackbarContentLayout.f27430b.setAlpha(0.0f);
        long j = i11;
        ViewPropertyAnimator duration = snackbarContentLayout.f27430b.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f27432d;
        long j10 = i12;
        duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
        if (snackbarContentLayout.f27431c.getVisibility() == 0) {
            snackbarContentLayout.f27431c.setAlpha(0.0f);
            snackbarContentLayout.f27431c.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j10).start();
        }
    }
}
