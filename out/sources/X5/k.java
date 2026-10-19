package X5;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7254c;

    public /* synthetic */ k(int i10, Object obj) {
        this.f7253b = i10;
        this.f7254c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7253b) {
            case 0:
                r rVar = (r) this.f7254c;
                rVar.getClass();
                rVar.f7278d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                p128k2.j jVar = (p128k2.j) this.f7254c;
                jVar.getClass();
                jVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
