package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1446k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.B f19890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f19892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1445j f19893e;

    public C1446k(View view, ViewPropertyAnimator viewPropertyAnimator, C1445j c1445j, RecyclerView.B b10) {
        this.f19893e = c1445j;
        this.f19890b = b10;
        this.f19891c = viewPropertyAnimator;
        this.f19892d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19891c.setListener(null);
        this.f19892d.setAlpha(1.0f);
        C1445j c1445j = this.f19893e;
        RecyclerView.B b10 = this.f19890b;
        c1445j.h(b10);
        c1445j.f19871q.remove(b10);
        c1445j.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f19893e.getClass();
    }
}
