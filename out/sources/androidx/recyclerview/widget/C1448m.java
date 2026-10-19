package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1448m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.B f19898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f19900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f19902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1445j f19903g;

    public C1448m(C1445j c1445j, RecyclerView.B b10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f19903g = c1445j;
        this.f19898b = b10;
        this.f19899c = i10;
        this.f19900d = view;
        this.f19901e = i11;
        this.f19902f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f19899c;
        View view = this.f19900d;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f19901e != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f19902f.setListener(null);
        C1445j c1445j = this.f19903g;
        RecyclerView.B b10 = this.f19898b;
        c1445j.h(b10);
        c1445j.f19870p.remove(b10);
        c1445j.r();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f19903g.getClass();
    }
}
