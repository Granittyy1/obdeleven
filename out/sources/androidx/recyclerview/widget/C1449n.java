package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1449n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1445j.d f19904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f19906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1445j f19907e;

    public C1449n(C1445j c1445j, C1445j.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f19907e = c1445j;
        this.f19904b = dVar;
        this.f19905c = viewPropertyAnimator;
        this.f19906d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19905c.setListener(null);
        View view = this.f19906d;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C1445j.d dVar = this.f19904b;
        RecyclerView.B b10 = dVar.f19879a;
        C1445j c1445j = this.f19907e;
        c1445j.h(b10);
        c1445j.f19872r.remove(dVar.f19879a);
        c1445j.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.B b10 = this.f19904b.f19879a;
        this.f19907e.getClass();
    }
}
