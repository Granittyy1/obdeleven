package M5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: MaterialSideContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f4584d;

    public j(k kVar, boolean z10, int i10) {
        this.f4584d = kVar;
        this.f4582b = z10;
        this.f4583c = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k kVar = this.f4584d;
        kVar.f4567b.setTranslationX(0.0f);
        kVar.c(0.0f, this.f4583c, this.f4582b);
    }
}
