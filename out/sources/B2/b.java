package B2;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.a f1460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1461c;

    public b(d dVar, d.a aVar) {
        this.f1461c = dVar;
        this.f1460b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f1461c;
        dVar.getClass();
        d.a aVar = this.f1460b;
        d.d(fFloatValue, aVar);
        dVar.a(fFloatValue, aVar, false);
        dVar.invalidateSelf();
    }
}
