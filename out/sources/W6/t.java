package W6;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: compiled from: SwipeDismissTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f7048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f7049c;

    public t(u uVar, ViewGroup.LayoutParams layoutParams) {
        this.f7049c = uVar;
        this.f7048b = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f7048b;
        layoutParams.height = iIntValue;
        this.f7049c.f7054f.setLayoutParams(layoutParams);
    }
}
