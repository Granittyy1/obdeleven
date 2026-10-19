package com.google.android.material.sidesheet;

import B0.s;
import B0.u;
import M5.k;
import S4.o;
import S5.f;
import S5.i;
import T5.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C0845b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements M5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T5.d f27354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f27355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f27356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f27357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SideSheetBehavior<V>.d f27358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f27359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27361i;
    public L0.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f27363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27366o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference<V> f27368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference<View> f27369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f27370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f27371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k f27372u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f27373v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashSet f27374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f27375x;

    public class a extends L0.c.AbstractC0064c {
        public a() {
        }

        @Override // L0.c.AbstractC0064c
        public final int a(int i10, View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return o.d(i10, sideSheetBehavior.f27354b.g(), sideSheetBehavior.f27354b.f());
        }

        @Override // L0.c.AbstractC0064c
        public final int b(int i10, View view) {
            return view.getTop();
        }

        @Override // L0.c.AbstractC0064c
        public final int c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f27364m + sideSheetBehavior.f27367p;
        }

        @Override // L0.c.AbstractC0064c
        public final void h(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f27360h) {
                    sideSheetBehavior.x(1);
                }
            }
        }

        @Override // L0.c.AbstractC0064c
        public final void i(View view, int i10, int i11) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f27369r;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f27354b.p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f27374w;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f27354b.b(i10);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((T5.c) it.next()).b();
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        @Override // L0.c.AbstractC0064c
        public final void j(View view, float f10, float f11) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            int i10 = 3;
            if (!sideSheetBehavior.f27354b.k(f10)) {
                if (sideSheetBehavior.f27354b.n(view, f10)) {
                    if (sideSheetBehavior.f27354b.m(f10, f11) || sideSheetBehavior.f27354b.l(view)) {
                        i10 = 5;
                    }
                } else if (f10 == 0.0f || Math.abs(f10) <= Math.abs(f11)) {
                    int left = view.getLeft();
                    if (Math.abs(left - sideSheetBehavior.f27354b.d()) >= Math.abs(left - sideSheetBehavior.f27354b.e())) {
                        i10 = 5;
                    }
                } else {
                    i10 = 5;
                }
            }
            sideSheetBehavior.z(view, i10, true);
        }

        @Override // L0.c.AbstractC0064c
        public final boolean k(int i10, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f27361i == 1 || (weakReference = sideSheetBehavior.f27368q) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.x(5);
            WeakReference<V> weakReference = sideSheetBehavior.f27368q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.f27368q.get().requestLayout();
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f27381c = new h(0, this);

        public d() {
        }

        public final void a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f27368q;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f27379a = i10;
            if (this.f27380b) {
                return;
            }
            V v10 = sideSheetBehavior.f27368q.get();
            h hVar = this.f27381c;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            v10.postOnAnimation(hVar);
            this.f27380b = true;
        }
    }

    public SideSheetBehavior() {
        this.f27358f = new d();
        this.f27360h = true;
        this.f27361i = 5;
        this.f27363l = 0.1f;
        this.f27370s = -1;
        this.f27374w = new LinkedHashSet();
        this.f27375x = new a();
    }

    public final void A() {
        V v10;
        WeakReference<V> weakReference = this.f27368q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        O.k(262144, v10);
        O.h(0, v10);
        O.k(1048576, v10);
        O.h(0, v10);
        final int i10 = 5;
        if (this.f27361i != 5) {
            O.l(v10, s.a.f1423o, new u() { // from class: T5.e
                @Override // B0.u
                public final boolean a(View view) {
                    this.f6025a.w(i10);
                    return true;
                }
            });
        }
        final int i11 = 3;
        if (this.f27361i != 3) {
            O.l(v10, s.a.f1421m, new u() { // from class: T5.e
                @Override // B0.u
                public final boolean a(View view) {
                    this.f6025a.w(i11);
                    return true;
                }
            });
        }
    }

    @Override // M5.b
    public final void a(C0845b c0845b) {
        k kVar = this.f27372u;
        if (kVar == null) {
            return;
        }
        kVar.f4571f = c0845b;
    }

    @Override // M5.b
    public final void b(C0845b c0845b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f27372u;
        if (kVar == null) {
            return;
        }
        T5.d dVar = this.f27354b;
        int i10 = 5;
        if (dVar != null && dVar.j() != 0) {
            i10 = 3;
        }
        C0845b c0845b2 = kVar.f4571f;
        kVar.f4571f = c0845b;
        if (c0845b2 != null) {
            kVar.c(c0845b.f8201c, i10, c0845b.f8202d == 0);
        }
        WeakReference<V> weakReference = this.f27368q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f27368q.get();
        WeakReference<View> weakReference2 = this.f27369r;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.f27354b.o(marginLayoutParams, (int) ((v10.getScaleX() * this.f27364m) + this.f27367p));
        view.requestLayout();
    }

    @Override // M5.b
    public final void c() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        k kVar = this.f27372u;
        if (kVar == null) {
            return;
        }
        C0845b c0845b = kVar.f4571f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        kVar.f4571f = null;
        int i10 = 5;
        if (c0845b == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        T5.d dVar = this.f27354b;
        if (dVar != null && dVar.j() != 0) {
            i10 = 3;
        }
        b bVar = new b();
        WeakReference<View> weakReference = this.f27369r;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.f27354b.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: T5.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f6029b.f27354b.o(marginLayoutParams, p216r5.a.c(valueAnimator.getAnimatedFraction(), iC, 0));
                    view.requestLayout();
                }
            };
        }
        kVar.b(c0845b, i10, bVar, animatorUpdateListener);
    }

    @Override // M5.b
    public final void d() {
        k kVar = this.f27372u;
        if (kVar == null) {
            return;
        }
        kVar.a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        this.f27368q = null;
        this.j = null;
        this.f27372u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void j() {
        this.f27368q = null;
        this.j = null;
        this.f27372u = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        L0.c cVar;
        VelocityTracker velocityTracker;
        if ((!v10.isShown() && O.e(v10) == null) || !this.f27360h) {
            this.f27362k = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f27371t) != null) {
            velocityTracker.recycle();
            this.f27371t = null;
        }
        if (this.f27371t == null) {
            this.f27371t = VelocityTracker.obtain();
        }
        this.f27371t.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f27373v = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f27362k) {
            this.f27362k = false;
            return false;
        }
        return (this.f27362k || (cVar = this.j) == null || !cVar.r(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        V v11;
        V v12;
        int i11;
        View viewFindViewById;
        f fVar = this.f27355c;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int iH = 0;
        if (this.f27368q == null) {
            this.f27368q = new WeakReference<>(v10);
            this.f27372u = new k(v10);
            if (fVar != null) {
                v10.setBackground(fVar);
                float fI = this.f27359g;
                if (fI == -1.0f) {
                    fI = O.d.i(v10);
                }
                fVar.j(fI);
            } else {
                ColorStateList colorStateList = this.f27356d;
                if (colorStateList != null) {
                    O.d.q(v10, colorStateList);
                }
            }
            int i12 = this.f27361i == 5 ? 4 : 0;
            if (v10.getVisibility() != i12) {
                v10.setVisibility(i12);
            }
            A();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
            if (O.e(v10) == null) {
                O.o(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i13 = Gravity.getAbsoluteGravity(((CoordinatorLayout.f) v10.getLayoutParams()).f16651c, i10) == 3 ? 1 : 0;
        T5.d dVar = this.f27354b;
        if (dVar == null || dVar.j() != i13) {
            i iVar = this.f27357e;
            CoordinatorLayout.f fVar2 = null;
            if (i13 == 0) {
                this.f27354b = new T5.b(this);
                if (iVar != null) {
                    WeakReference<V> weakReference = this.f27368q;
                    if (weakReference != null && (v12 = weakReference.get()) != null && (v12.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar2 = (CoordinatorLayout.f) v12.getLayoutParams();
                    }
                    if (fVar2 == null || ((ViewGroup.MarginLayoutParams) fVar2).rightMargin <= 0) {
                        i.a aVarE = iVar.e();
                        aVarE.f(0.0f);
                        aVarE.d(0.0f);
                        i iVarA = aVarE.a();
                        if (fVar != null) {
                            fVar.setShapeAppearanceModel(iVarA);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(J4.i.c(i13, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f27354b = new T5.a(this);
                if (iVar != null) {
                    WeakReference<V> weakReference2 = this.f27368q;
                    if (weakReference2 != null && (v11 = weakReference2.get()) != null && (v11.getLayoutParams() instanceof CoordinatorLayout.f)) {
                        fVar2 = (CoordinatorLayout.f) v11.getLayoutParams();
                    }
                    if (fVar2 == null || ((ViewGroup.MarginLayoutParams) fVar2).leftMargin <= 0) {
                        i.a aVarE2 = iVar.e();
                        aVarE2.e(0.0f);
                        aVarE2.c(0.0f);
                        i iVarA2 = aVarE2.a();
                        if (fVar != null) {
                            fVar.setShapeAppearanceModel(iVarA2);
                        }
                    }
                }
            }
        }
        if (this.j == null) {
            this.j = new L0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f27375x);
        }
        int iH2 = this.f27354b.h(v10);
        coordinatorLayout.r(i10, v10);
        this.f27365n = coordinatorLayout.getWidth();
        this.f27366o = this.f27354b.i(coordinatorLayout);
        this.f27364m = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f27367p = marginLayoutParams != null ? this.f27354b.a(marginLayoutParams) : 0;
        int i14 = this.f27361i;
        if (i14 == 1 || i14 == 2) {
            iH = iH2 - this.f27354b.h(v10);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f27361i);
            }
            iH = this.f27354b.e();
        }
        v10.offsetLeftAndRight(iH);
        if (this.f27369r == null && (i11 = this.f27370s) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f27369r = new WeakReference<>(viewFindViewById);
        }
        for (T5.c cVar : this.f27374w) {
            if (cVar instanceof T5.i) {
                ((T5.i) cVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(View view, Parcelable parcelable) {
        int i10 = ((c) parcelable).f27378d;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f27361i = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable s(View view) {
        return new c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27361i == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.j.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f27371t) != null) {
            velocityTracker.recycle();
            this.f27371t = null;
        }
        if (this.f27371t == null) {
            this.f27371t = VelocityTracker.obtain();
        }
        this.f27371t.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.f27362k && y()) {
            float fAbs = Math.abs(this.f27373v - motionEvent.getX());
            L0.c cVar = this.j;
            if (fAbs > cVar.f4402b) {
                cVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f27362k;
    }

    public final void w(final int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(Q8.d.a(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference<V> weakReference = this.f27368q;
        if (weakReference == null || weakReference.get() == null) {
            x(i10);
            return;
        }
        V v10 = this.f27368q.get();
        Runnable runnable = new Runnable() { // from class: T5.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior sideSheetBehavior = this.f6027b;
                View view = (View) sideSheetBehavior.f27368q.get();
                if (view != null) {
                    sideSheetBehavior.z(view, i10, false);
                }
            }
        };
        ViewParent parent = v10.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (v10.isAttachedToWindow()) {
                v10.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    public final void x(int i10) {
        V v10;
        if (this.f27361i == i10) {
            return;
        }
        this.f27361i = i10;
        WeakReference<V> weakReference = this.f27368q;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        int i11 = this.f27361i == 5 ? 4 : 0;
        if (v10.getVisibility() != i11) {
            v10.setVisibility(i11);
        }
        Iterator it = this.f27374w.iterator();
        while (it.hasNext()) {
            ((T5.c) it.next()).a();
        }
        A();
    }

    public final boolean y() {
        return this.j != null && (this.f27360h || this.f27361i == 1);
    }

    public final void z(View view, int i10, boolean z10) {
        int iD;
        if (i10 == 3) {
            iD = this.f27354b.d();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException(J4.i.b(i10, "Invalid state to get outer edge offset: "));
            }
            iD = this.f27354b.e();
        }
        L0.c cVar = this.j;
        if (cVar == null || (!z10 ? cVar.s(view, iD, view.getTop()) : cVar.q(iD, view.getTop()))) {
            x(i10);
        } else {
            x(2);
            this.f27358f.a(i10);
        }
    }

    public static class c extends K0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f27378d;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27378d = parcel.readInt();
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27378d);
        }

        public c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f27378d = sideSheetBehavior.f27361i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27358f = new d();
        this.f27360h = true;
        this.f27361i = 5;
        this.f27363l = 0.1f;
        this.f27370s = -1;
        this.f27374w = new LinkedHashSet();
        this.f27375x = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46101E);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f27356d = P5.c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f27357e = i.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f27370s = resourceId;
            WeakReference<View> weakReference = this.f27369r;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f27369r = null;
            WeakReference<V> weakReference2 = this.f27368q;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    if (v10.isLaidOut()) {
                        v10.requestLayout();
                    }
                }
            }
        }
        i iVar = this.f27357e;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f27355c = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f27356d;
            if (colorStateList != null) {
                this.f27355c.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f27355c.setTint(typedValue.data);
            }
        }
        this.f27359g = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f27360h = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
