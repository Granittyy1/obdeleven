package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1450o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1445j.d f19908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f19910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1445j f19911e;

    public C1450o(C1445j c1445j, C1445j.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f19911e = c1445j;
        this.f19908b = dVar;
        this.f19909c = viewPropertyAnimator;
        this.f19910d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19909c.setListener(null);
        View view = this.f19910d;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1445j.d dVar = this.f19908b;
        RecyclerView.B b10 = dVar.f19880b;
        C1445j c1445j = this.f19911e;
        c1445j.h(b10);
        c1445j.f19872r.remove(dVar.f19880b);
        c1445j.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.B b10 = this.f19908b.f19880b;
        this.f19911e.getClass();
    }
}
