package com.google.android.material.floatingactionbutton;

import A8.p;
import J5.e;
import J5.f;
import K5.o;
import K5.t;
import K5.u;
import S5.i;
import S5.m;
import W6.q;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.C0856i;
import androidx.appcompat.widget.C0860m;
import androidx.collection.X;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p216r5.g;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends u implements I5.a, m, CoordinatorLayout.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f27143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f27144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f27145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f27146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f27147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27149i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f27152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f27153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0860m f27154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I5.b f27155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f27156q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.b.f {
        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.b.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f27152m = new Rect();
        this.f27153n = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = o.d(context2, attributeSet, p204q5.a.j, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f27143c = P5.c.a(context2, typedArrayD, 1);
        this.f27144d = t.c(typedArrayD.getInt(2, -1), null);
        this.f27147g = P5.c.a(context2, typedArrayD, 12);
        this.f27148h = typedArrayD.getInt(7, -1);
        this.f27149i = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, 0.0f);
        float dimension2 = typedArrayD.getDimension(9, 0.0f);
        float dimension3 = typedArrayD.getDimension(11, 0.0f);
        this.f27151l = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        g gVarA = g.a(context2, typedArrayD, 15);
        g gVarA2 = g.a(context2, typedArrayD, 8);
        S5.g gVar = i.f5606m;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p204q5.a.f46127u, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        i iVarA = i.a(context2, resourceId, resourceId2, gVar).a();
        boolean z10 = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        C0860m c0860m = new C0860m(this);
        this.f27154o = c0860m;
        c0860m.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.f27155p = new I5.b(this);
        getImpl().n(iVarA);
        getImpl().g(this.f27143c, this.f27144d, this.f27147g, dimensionPixelSize);
        getImpl().f27184k = dimensionPixelSize2;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27182h != dimension) {
            impl.f27182h = dimension;
            impl.k(dimension, impl.f27183i, impl.j);
        }
        com.google.android.material.floatingactionbutton.b impl2 = getImpl();
        if (impl2.f27183i != dimension2) {
            impl2.f27183i = dimension2;
            impl2.k(impl2.f27182h, dimension2, impl2.j);
        }
        com.google.android.material.floatingactionbutton.b impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.f27182h, impl3.f27183i, dimension3);
        }
        getImpl().f27186m = gVarA;
        getImpl().f27187n = gVarA2;
        getImpl().f27180f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f27156q == null) {
            this.f27156q = new f(this, new b());
        }
        return this.f27156q;
    }

    @Override // I5.a
    public final boolean a() {
        return this.f27155p.f3899b;
    }

    public final void d() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27193t == null) {
            impl.f27193t = new ArrayList<>();
        }
        impl.f27193t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(q qVar) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27192s == null) {
            impl.f27192s = new ArrayList<>();
        }
        impl.f27192s.add(qVar);
    }

    public final void f() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        c cVar = new c();
        if (impl.f27194u == null) {
            impl.f27194u = new ArrayList<>();
        }
        impl.f27194u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f27149i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f27143c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f27144d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f27183i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f27179e;
    }

    public int getCustomSize() {
        return this.f27149i;
    }

    public int getExpandedComponentIdHint() {
        return this.f27155p.f3900c;
    }

    public g getHideMotionSpec() {
        return getImpl().f27187n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f27147g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f27147g;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f27175a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f27186m;
    }

    public int getSize() {
        return this.f27148h;
    }

    public int getSizeDimension() {
        return g(this.f27148h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f27145e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f27146f;
    }

    public boolean getUseCompatPadding() {
        return this.f27151l;
    }

    public final void h() {
        i(null, true);
    }

    public final void i(a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.f27195v.getVisibility() == 0) {
            if (impl.f27191r == 1) {
                return;
            }
        } else if (impl.f27191r != 2) {
            return;
        }
        Animator animator = impl.f27185l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        FloatingActionButton floatingActionButton = impl.f27195v;
        if (!floatingActionButton.isLaidOut() || floatingActionButton.isInEditMode()) {
            floatingActionButton.b(z10 ? 8 : 4, z10);
            if (aVar2 != null) {
                aVar2.f27160a.a(aVar2.f27161b);
                return;
            }
            return;
        }
        g gVar = impl.f27187n;
        AnimatorSet animatorSetB = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, com.google.android.material.floatingactionbutton.b.f27165F, com.google.android.material.floatingactionbutton.b.f27166G);
        animatorSetB.addListener(new J5.b(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f27193t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    public final boolean j() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27195v.getVisibility() == 0) {
            if (impl.f27191r != 1) {
                return false;
            }
        } else if (impl.f27191r == 2) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final boolean k() {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27195v.getVisibility() != 0) {
            if (impl.f27191r != 2) {
                return false;
            }
        } else if (impl.f27191r == 1) {
            return false;
        }
        return true;
    }

    public final void l(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f27152m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f27145e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f27146f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0856i.c(colorForState, mode));
    }

    public final void n() {
        o(null, true);
    }

    public final void o(v5.b.a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.f27195v.getVisibility() != 0) {
            if (impl.f27191r == 2) {
                return;
            }
        } else if (impl.f27191r != 1) {
            return;
        }
        Animator animator = impl.f27185l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f27186m == null;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        FloatingActionButton floatingActionButton = impl.f27195v;
        boolean z12 = floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
        Matrix matrix = impl.f27173A;
        if (!z12) {
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f27189p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f27160a.b();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f10 = z11 ? 0.4f : 0.0f;
            impl.f27189p = f10;
            impl.a(f10, matrix);
            floatingActionButton.setImageMatrix(matrix);
        }
        g gVar = impl.f27186m;
        AnimatorSet animatorSetB = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, com.google.android.material.floatingactionbutton.b.f27163D, com.google.android.material.floatingactionbutton.b.f27164E);
        animatorSetB.addListener(new J5.c(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f27192s;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener(it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        S5.f fVar = impl.f27176b;
        FloatingActionButton floatingActionButton = impl.f27195v;
        if (fVar != null) {
            p.F(floatingActionButton, fVar);
        }
        if (impl instanceof f) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f27174B == null) {
            impl.f27174B = new e(impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f27174B);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f27195v.getViewTreeObserver();
        e eVar = impl.f27174B;
        if (eVar != null) {
            viewTreeObserver.removeOnPreDrawListener(eVar);
            impl.f27174B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.j = (sizeDimension - this.f27150k) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f27152m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof V5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        V5.a aVar = (V5.a) parcelable;
        super.onRestoreInstanceState(aVar.f4135b);
        Bundle bundle = aVar.f6726d.get("expandableWidgetHelper");
        bundle.getClass();
        I5.b bVar = this.f27155p;
        bVar.getClass();
        bVar.f3899b = bundle.getBoolean("expanded", false);
        bVar.f3900c = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f3899b) {
            View view = bVar.f3898a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        V5.a aVar = new V5.a(parcelableOnSaveInstanceState);
        X<String, Bundle> x10 = aVar.f6726d;
        I5.b bVar = this.f27155p;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f3899b);
        bundle.putInt("expandedComponentIdHint", bVar.f3900c);
        x10.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27153n;
            rect.set(0, 0, measuredWidth, measuredHeight);
            l(rect);
            f fVar = this.f27156q;
            int i10 = -(fVar.f27180f ? Math.max((fVar.f27184k - fVar.f27195v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f27143c != colorStateList) {
            this.f27143c = colorStateList;
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            S5.f fVar = impl.f27176b;
            if (fVar != null) {
                fVar.setTintList(colorStateList);
            }
            J5.a aVar = impl.f27178d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f4025m = colorStateList.getColorForState(aVar.getState(), aVar.f4025m);
                }
                aVar.f4028p = colorStateList;
                aVar.f4026n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f27144d != mode) {
            this.f27144d = mode;
            S5.f fVar = getImpl().f27176b;
            if (fVar != null) {
                fVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27182h != f10) {
            impl.f27182h = f10;
            impl.k(f10, impl.f27183i, impl.j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27183i != f10) {
            impl.f27183i = f10;
            impl.k(impl.f27182h, f10, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.j != f10) {
            impl.j = f10;
            impl.k(impl.f27182h, impl.f27183i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f27149i) {
            this.f27149i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        S5.f fVar = getImpl().f27176b;
        if (fVar != null) {
            fVar.j(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f27180f) {
            getImpl().f27180f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f27155p.f3900c = i10;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f27187n = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            com.google.android.material.floatingactionbutton.b impl = getImpl();
            float f10 = impl.f27189p;
            impl.f27189p = f10;
            Matrix matrix = impl.f27173A;
            impl.a(f10, matrix);
            impl.f27195v.setImageMatrix(matrix);
            if (this.f27145e != null) {
                m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f27154o.c(i10);
        m();
    }

    public void setMaxImageSize(int i10) {
        this.f27150k = i10;
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        if (impl.f27190q != i10) {
            impl.f27190q = i10;
            float f10 = impl.f27189p;
            impl.f27189p = f10;
            Matrix matrix = impl.f27173A;
            impl.a(f10, matrix);
            impl.f27195v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<com.google.android.material.floatingactionbutton.b.f> arrayList = getImpl().f27194u;
        if (arrayList != null) {
            Iterator<com.google.android.material.floatingactionbutton.b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<com.google.android.material.floatingactionbutton.b.f> arrayList = getImpl().f27194u;
        if (arrayList != null) {
            Iterator<com.google.android.material.floatingactionbutton.b.f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().b();
                throw null;
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        com.google.android.material.floatingactionbutton.b impl = getImpl();
        impl.f27181g = z10;
        impl.q();
    }

    @Override // S5.m
    public void setShapeAppearanceModel(i iVar) {
        getImpl().n(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f27186m = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f27149i = 0;
        if (i10 != this.f27148h) {
            this.f27148h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f27145e != colorStateList) {
            this.f27145e = colorStateList;
            m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f27146f != mode) {
            this.f27146f = mode;
            m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f27151l != z10) {
            this.f27151l = z10;
            getImpl().i();
        }
    }

    @Override // K5.u, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Rect f27157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f27158c;

        public BaseBehavior() {
            this.f27158c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean e(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f27152m;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void g(CoordinatorLayout.f fVar) {
            if (fVar.f16656h == 0) {
                fVar.f16656h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f16649a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListE = coordinatorLayout.e(floatingActionButton);
            int size = arrayListE.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) arrayListE.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f16649a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(i10, floatingActionButton);
            Rect rect = floatingActionButton.f27152m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    floatingActionButton.offsetTopAndBottom(i11);
                }
                if (i13 != 0) {
                    WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                    floatingActionButton.offsetLeftAndRight(i13);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f27158c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f16654f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.f27157b == null) {
                this.f27157b = new Rect();
            }
            Rect rect = this.f27157b;
            K5.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
            } else {
                floatingActionButton.o(null, false);
            }
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f27158c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f16654f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
            } else {
                floatingActionButton.o(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46117k);
            this.f27158c = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f27147g != colorStateList) {
            this.f27147g = colorStateList;
            getImpl().m(this.f27147g);
        }
    }

    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
    }
}
