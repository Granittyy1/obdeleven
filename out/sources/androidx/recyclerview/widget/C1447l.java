package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1447l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.B f19894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f19895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1445j f19897e;

    public C1447l(View view, ViewPropertyAnimator viewPropertyAnimator, C1445j c1445j, RecyclerView.B b10) {
        this.f19897e = c1445j;
        this.f19894b = b10;
        this.f19895c = view;
        this.f19896d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f19895c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19896d.setListener(null);
        C1445j c1445j = this.f19897e;
        RecyclerView.B b10 = this.f19894b;
        c1445j.h(b10);
        c1445j.f19869o.remove(b10);
        c1445j.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f19897e.getClass();
    }
}
