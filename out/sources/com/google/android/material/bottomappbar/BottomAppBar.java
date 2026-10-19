package com.google.android.material.bottomappbar;

import A8.p;
import K5.t;
import M5.l;
import U5.f;
import W6.q;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p263v5.c;
import p263v5.d;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f26737m = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f26738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f26739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f26740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f26745i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Behavior f26747l;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f26752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f26753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f26754d;

        public a(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f26752b = actionMenuView;
            this.f26753c = i10;
            this.f26754d = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f26753c;
            boolean z10 = this.f26754d;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f26752b;
            actionMenuView.setTranslationX(bottomAppBar.e(actionMenuView, i10, z10));
        }
    }

    public static class b extends K0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f26757e;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26756d = parcel.readInt();
            this.f26757e = parcel.readInt() != 0;
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26756d);
            parcel.writeInt(this.f26757e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return l.c(getContext(), R.attr.motionDurationLong2, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
    }

    private float getFabTranslationX() {
        return f(this.f26741e);
    }

    private float getFabTranslationY() {
        if (this.f26743g == 1) {
            return -getTopEdgeTreatment().f47646e;
        }
        View viewD = d();
        return viewD != null ? (-((getMeasuredHeight() + getBottomInset()) - viewD.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private d getTopEdgeTreatment() {
        throw null;
    }

    public final View d() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        ArrayList<View> arrayList = coordinatorLayout.f16630c.f44661b.get(this);
        ArrayList<View> arrayList2 = coordinatorLayout.f16632e;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        for (View view : arrayList2) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int e(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11 = 0;
        if (this.f26745i != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zB = t.b(this);
        int measuredWidth = zB ? getMeasuredWidth() : 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f36271a & 8388615) == 8388611) {
                measuredWidth = zB ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zB ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            i11 = zB ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - (right + i11);
    }

    public final float f(int i10) {
        boolean zB = t.b(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewD = d();
        return ((getMeasuredWidth() / 2) - ((this.f26744h == -1 || viewD == null) ? 0 : (viewD.getMeasuredWidth() / 2) + this.f26744h)) * (zB ? -1 : 1);
    }

    public final boolean g() {
        View viewD = d();
        FloatingActionButton floatingActionButton = viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null;
        return floatingActionButton != null && floatingActionButton.k();
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f47646e;
    }

    public int getFabAlignmentMode() {
        return this.f26741e;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f26744h;
    }

    public int getFabAnchorMode() {
        return this.f26743g;
    }

    public int getFabAnimationMode() {
        return this.f26742f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f47644c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f47643b;
    }

    public boolean getHideOnScroll() {
        return this.j;
    }

    public int getMenuAlignmentMode() {
        return this.f26745i;
    }

    public final void h() {
        d topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f26746k && g()) {
            int i10 = this.f26743g;
        }
        throw null;
    }

    public final void i(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().f47645d) {
            return;
        }
        getTopEdgeTreatment().f47645d = f10;
        throw null;
    }

    public final void j(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.F(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            AnimatorSet animatorSet = this.f26740d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f26739c;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            h();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f26740d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (g()) {
            j(actionMenuView, this.f26741e, this.f26746k, false);
        } else {
            j(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f4135b);
        this.f26741e = bVar.f26756d;
        this.f26746k = bVar.f26757e;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f26756d = this.f26741e;
        bVar.f26757e = this.f26746k;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        p234t0.a.C0532a.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            d topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f47646e = f10;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        int i11;
        int i12 = 1;
        boolean z10 = this.f26746k;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.f26740d;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (g()) {
                i11 = i10;
            } else {
                z10 = false;
                i11 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - e(actionMenuView, i11, z10)) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new c(this, actionMenuView, i11, z10));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.f26740d = animatorSet3;
            animatorSet3.addListener(new f(i12, this));
            this.f26740d.start();
        }
        if (this.f26741e != i10 && isLaidOut()) {
            AnimatorSet animatorSet4 = this.f26739c;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f26742f == 1) {
                View viewD = d();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewD instanceof FloatingActionButton ? (FloatingActionButton) viewD : null, "translationX", f(i10));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewD2 = d();
                FloatingActionButton floatingActionButton = viewD2 instanceof FloatingActionButton ? (FloatingActionButton) viewD2 : null;
                if (floatingActionButton != null && !floatingActionButton.j()) {
                    floatingActionButton.i(new p263v5.b(this, i10), true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(l.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46341a));
            this.f26739c = animatorSet5;
            animatorSet5.addListener(new p263v5.a(this));
            this.f26739c.start();
        }
        this.f26741e = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f26744h == i10) {
            return;
        }
        this.f26744h = i10;
        h();
        throw null;
    }

    public void setFabAnchorMode(int i10) {
        this.f26743g = i10;
        h();
        throw null;
    }

    public void setFabAnimationMode(int i10) {
        this.f26742f = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f47647f) {
            return;
        }
        getTopEdgeTreatment().f47647f = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f47644c = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f47643b = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.j = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f26745i != i10) {
            this.f26745i = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                j(actionMenuView, this.f26741e, g(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f26738b != null) {
            drawable = drawable.mutate();
            p234t0.a.C0532a.g(drawable, this.f26738b.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f26738b = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f26747l == null) {
            this.f26747l = new Behavior();
        }
        return this.f26747l;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public WeakReference<BottomAppBar> f26748k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26749l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final a f26750m;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f26748k.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    int measuredWidth = floatingActionButton.getMeasuredWidth();
                    int measuredHeight = floatingActionButton.getMeasuredHeight();
                    Rect rect = behavior.j;
                    rect.set(0, 0, measuredWidth, measuredHeight);
                    floatingActionButton.l(rect);
                    int iHeight = rect.height();
                    bottomAppBar.i(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f5611e.a(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (behavior.f26749l == 0) {
                    if (bottomAppBar.f26743g == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (t.b(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
                    }
                }
                int i18 = BottomAppBar.f26737m;
                bottomAppBar.h();
                throw null;
            }
        }

        public Behavior() {
            this.f26750m = new a();
            this.j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f26748k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f26737m;
            View viewD = bottomAppBar.d();
            if (viewD != null) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                if (!viewD.isLaidOut()) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewD.getLayoutParams();
                    fVar.f16652d = 17;
                    int i12 = bottomAppBar.f26743g;
                    if (i12 == 1) {
                        fVar.f16652d = 49;
                    }
                    if (i12 == 0) {
                        fVar.f16652d |= 80;
                    }
                    this.f26749l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewD.getLayoutParams())).bottomMargin;
                    if (viewD instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewD;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d();
                        floatingActionButton.e(new q(1, bottomAppBar));
                        floatingActionButton.f();
                    }
                    viewD.addOnLayoutChangeListener(this.f26750m);
                    bottomAppBar.h();
                    throw null;
                }
            }
            coordinatorLayout.r(i10, bottomAppBar);
            super.l(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.t(coordinatorLayout, bottomAppBar, view2, view3, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f26750m = new a();
            this.j = new Rect();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
