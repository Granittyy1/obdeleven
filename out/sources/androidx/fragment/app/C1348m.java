package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentAnim.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1348m {
    public static int a(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.m$a */
    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f17622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f17623b;

        public a(Animation animation) {
            this.f17622a = animation;
            this.f17623b = null;
        }

        public a(Animator animator) {
            this.f17622a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f17623b = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.m$b */
    /* JADX INFO: compiled from: FragmentAnim.java */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f17624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f17625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17628f;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f17628f = true;
            this.f17624b = viewGroup;
            this.f17625c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f17628f = true;
            if (this.f17626d) {
                return !this.f17627e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f17626d = true;
                androidx.core.view.B.a(this.f17624b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f17626d;
            ViewGroup viewGroup = this.f17624b;
            if (z10 || !this.f17628f) {
                viewGroup.endViewTransition(this.f17625c);
                this.f17627e = true;
            } else {
                this.f17628f = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f10) {
            this.f17628f = true;
            if (this.f17626d) {
                return !this.f17627e;
            }
            if (!super.getTransformation(j, transformation, f10)) {
                this.f17626d = true;
                androidx.core.view.B.a(this.f17624b, this);
            }
            return true;
        }
    }
}
