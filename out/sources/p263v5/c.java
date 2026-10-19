package p263v5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f47639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f47641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f47642f;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f47642f = bottomAppBar;
        this.f47639c = actionMenuView;
        this.f47640d = i10;
        this.f47641e = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f47638b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f47638b) {
            return;
        }
        BottomAppBar bottomAppBar = this.f47642f;
        bottomAppBar.getClass();
        bottomAppBar.j(this.f47639c, this.f47640d, this.f47641e, false);
    }
}
