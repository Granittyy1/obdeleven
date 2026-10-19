package U5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6513c;

    public /* synthetic */ f(int i10, Object obj) {
        this.f6512b = i10;
        this.f6513c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6512b) {
            case 0:
                ((BaseTransientBottomBar) this.f6513c).e();
                break;
            default:
                BottomAppBar bottomAppBar = (BottomAppBar) this.f6513c;
                bottomAppBar.getClass();
                bottomAppBar.f26740d = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6512b) {
            case 1:
                ((BottomAppBar) this.f6513c).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
