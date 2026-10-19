package W6;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: SwipeDismissTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f7042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f7043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f7044f;

    public r(u uVar, float f10, float f11, float f12, float f13) {
        this.f7044f = uVar;
        this.f7040b = f10;
        this.f7041c = f11;
        this.f7042d = f12;
        this.f7043e = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = (valueAnimator.getAnimatedFraction() * this.f7041c) + this.f7040b;
        float animatedFraction2 = (valueAnimator.getAnimatedFraction() * this.f7043e) + this.f7042d;
        u uVar = this.f7044f;
        uVar.c(animatedFraction);
        uVar.f7054f.setAlpha(animatedFraction2);
    }
}
