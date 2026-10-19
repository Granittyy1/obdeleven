package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class Q {
    public static ObjectAnimator a(View view, O o10, int i10, int i11, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, e0 e0Var) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) o10.f2554b.getTag(R.id.transition_position);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iRound = Math.round(f14 - translationX) + i10;
        int iRound2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, o10.f2554b, iRound, iRound2, translationX, translationY);
        e0Var.a(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements F.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f2561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2566h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f2567i;
        public final float j;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f2561c = view;
            this.f2560b = view2;
            this.f2562d = i10 - Math.round(view.getTranslationX());
            this.f2563e = i11 - Math.round(view.getTranslationY());
            this.f2567i = f10;
            this.j = f11;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f2564f = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // D2.F.e
        public final void e(F f10) {
            View view = this.f2561c;
            view.setTranslationX(this.f2567i);
            view.setTranslationY(this.j);
            f10.B(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f2564f == null) {
                this.f2564f = new int[2];
            }
            int[] iArr = this.f2564f;
            float f10 = this.f2562d;
            View view = this.f2561c;
            iArr[0] = Math.round(view.getTranslationX() + f10);
            this.f2564f[1] = Math.round(view.getTranslationY() + this.f2563e);
            this.f2560b.setTag(R.id.transition_position, this.f2564f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.f2561c;
            this.f2565g = view.getTranslationX();
            this.f2566h = view.getTranslationY();
            view.setTranslationX(this.f2567i);
            view.setTranslationY(this.j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f10 = this.f2565g;
            View view = this.f2561c;
            view.setTranslationX(f10);
            view.setTranslationY(this.f2566h);
        }

        @Override // D2.F.e
        public final void a(F f10) {
        }

        @Override // D2.F.e
        public final void b(F f10) {
        }

        @Override // D2.F.e
        public final void c(F f10) {
        }

        @Override // D2.F.e
        public final void d(F f10) {
        }
    }
}
