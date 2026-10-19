package com.google.android.material.behavior;

import M5.l;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.voltasit.obdeleven.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<a> f26715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f26718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TimeInterpolator f26719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f26722i;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f26715b = new LinkedHashSet<>();
        this.f26720g = 0;
        this.f26721h = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f26720g = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f26716c = l.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.f26717d = l.c(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f26718e = l.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46344d);
        this.f26719f = l.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46343c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet<a> linkedHashSet = this.f26715b;
        if (i10 > 0) {
            if (this.f26721h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f26722i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f26721h = 1;
            Iterator<a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f26722i = view.animate().translationY(this.f26720g).setInterpolator(this.f26719f).setDuration(this.f26717d).setListener(new p251u5.a(this));
            return;
        }
        if (i10 >= 0 || this.f26721h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f26722i;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f26721h = 2;
        Iterator<a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f26722i = view.animate().translationY(0).setInterpolator(this.f26718e).setDuration(this.f26716c).setListener(new p251u5.a(this));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26715b = new LinkedHashSet<>();
        this.f26720g = 0;
        this.f26721h = 2;
    }
}
