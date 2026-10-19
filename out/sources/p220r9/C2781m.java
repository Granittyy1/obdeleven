package p220r9;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: renamed from: r9.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AnimationUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2781m {
    public static void a(final TextView textView, int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setObjectValues(Double.valueOf(0), Double.valueOf(i10));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r9.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                textView.setText(String.valueOf(((Double) valueAnimator2.getAnimatedValue()).intValue()));
            }
        });
        valueAnimator.setEvaluator(new C2780l());
        valueAnimator.setDuration(1000L);
        valueAnimator.start();
    }
}
