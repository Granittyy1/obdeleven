package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Fade.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0686m extends e0 {

    /* JADX INFO: renamed from: D2.m$a */
    /* JADX INFO: compiled from: Fade.java */
    public static class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2677c = false;

        public a(View view) {
            this.f2676b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.f2676b;
            T.b(view, 1.0f);
            if (this.f2677c) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            View view = this.f2676b;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f2677c = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C0686m(int i10) {
        S(i10);
    }

    @Override // D2.e0
    public final ObjectAnimator Q(ViewGroup viewGroup, View view, O o10, O o11) {
        Float f10;
        float fFloatValue = (o10 == null || (f10 = (Float) o10.f2553a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
        return T(view, fFloatValue != 1.0f ? fFloatValue : 0.0f, 1.0f);
    }

    @Override // D2.e0
    public final ObjectAnimator R(ViewGroup viewGroup, View view, O o10) {
        Float f10;
        T.f2571a.getClass();
        return T(view, (o10 == null || (f10 = (Float) o10.f2553a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f10.floatValue(), 0.0f);
    }

    public final ObjectAnimator T(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        T.b(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, T.f2572b, f11);
        objectAnimatorOfFloat.addListener(new a(view));
        a(new C0685l(view));
        return objectAnimatorOfFloat;
    }

    @Override // D2.F
    public final void j(O o10) {
        e0.O(o10);
        o10.f2553a.put("android:fade:transitionAlpha", Float.valueOf(T.f2571a.m(o10.f2554b)));
    }
}
