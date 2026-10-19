package W6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: SwipeDismissTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f7045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f7047d;

    public s(u uVar, ViewGroup.LayoutParams layoutParams, int i10) {
        this.f7047d = uVar;
        this.f7045b = layoutParams;
        this.f7046c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f7047d;
        h hVar = uVar.f7055g;
        View view = uVar.f7054f;
        X6.c cVar = hVar.f7018a;
        if (cVar.c() != null) {
            cVar.c().onClick(view);
        }
        uVar.f7054f.setAlpha(1.0f);
        uVar.f7054f.setTranslationX(0.0f);
        ViewGroup.LayoutParams layoutParams = this.f7045b;
        layoutParams.height = this.f7046c;
        uVar.f7054f.setLayoutParams(layoutParams);
    }
}
