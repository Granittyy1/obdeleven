package com.google.android.material.bottomsheet;

import B0.s;
import K5.r;
import K5.t;
import M5.g;
import M5.h;
import S4.o;
import S5.f;
import S5.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.activity.C0845b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.Constants;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements M5.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f26758A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f26759B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ValueAnimator f26760C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f26761D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f26762E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f26763F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final float f26764G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f26765H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final float f26766I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f26767J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f26768K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f26769L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f26770M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public L0.c f26771N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f26772O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f26773P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f26774Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final float f26775R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f26776S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f26777T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f26778U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public WeakReference<V> f26779V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public WeakReference<View> f26780W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ArrayList<c> f26781X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public VelocityTracker f26782Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public h f26783Z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26791i;
    public final f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ColorStateList f26792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f26793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f26796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f26797p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26798p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f26799q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f26800q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f26801r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f26802r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f26803s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public HashMap f26804s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f26805t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SparseIntArray f26806t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f26807u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final b f26808u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f26809v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f26811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f26812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i f26813z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            bottomSheetBehavior.J(5);
            WeakReference<V> weakReference = bottomSheetBehavior.f26779V;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            bottomSheetBehavior.f26779V.get().requestLayout();
        }
    }

    public class b extends L0.c.AbstractC0064c {
        public b() {
        }

        @Override // L0.c.AbstractC0064c
        public final int a(int i10, View view) {
            return view.getLeft();
        }

        @Override // L0.c.AbstractC0064c
        public final int b(int i10, View view) {
            return o.d(i10, BottomSheetBehavior.this.D(), d());
        }

        @Override // L0.c.AbstractC0064c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f26767J ? bottomSheetBehavior.f26778U : bottomSheetBehavior.f26765H;
        }

        @Override // L0.c.AbstractC0064c
        public final void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f26769L) {
                    bottomSheetBehavior.J(1);
                }
            }
        }

        @Override // L0.c.AbstractC0064c
        public final void i(View view, int i10, int i11) {
            BottomSheetBehavior.this.z(i11);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0085  */
        /* JADX WARN: Code duplicated, block: B:6:0x000d  */
        @Override // L0.c.AbstractC0064c
        public final void j(View view, float f10, float f11) {
            int i10 = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f11 < 0.0f) {
                if (bottomSheetBehavior.f26785c) {
                    i10 = 3;
                } else {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    bottomSheetBehavior.getClass();
                    if (top <= bottomSheetBehavior.f26763F) {
                        i10 = 3;
                    }
                }
            } else if (bottomSheetBehavior.f26767J && bottomSheetBehavior.K(view, f11)) {
                if (Math.abs(f10) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f26787e) {
                    if (view.getTop() > (bottomSheetBehavior.D() + bottomSheetBehavior.f26778U) / 2) {
                        i10 = 5;
                    } else if (bottomSheetBehavior.f26785c || Math.abs(view.getTop() - bottomSheetBehavior.D()) < Math.abs(view.getTop() - bottomSheetBehavior.f26763F)) {
                        i10 = 3;
                    }
                } else {
                    i10 = 5;
                }
            } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.f26785c) {
                    int i11 = bottomSheetBehavior.f26763F;
                    if (top2 < i11) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior.f26765H)) {
                            i10 = 3;
                        } else {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - bottomSheetBehavior.f26765H)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i10 = 4;
                    }
                } else if (Math.abs(top2 - bottomSheetBehavior.f26762E) < Math.abs(top2 - bottomSheetBehavior.f26765H)) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (bottomSheetBehavior.f26785c) {
                i10 = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - bottomSheetBehavior.f26763F) < Math.abs(top3 - bottomSheetBehavior.f26765H)) {
                    bottomSheetBehavior.getClass();
                } else {
                    i10 = 4;
                }
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.L(view, i10, true);
        }

        @Override // L0.c.AbstractC0064c
        public final boolean k(int i10, View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f26770M;
            if (i11 == 1 || bottomSheetBehavior.f26802r0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f26798p0 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.f26780W;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.f26779V;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f26822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f26823c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f26822b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                L0.c cVar = bottomSheetBehavior.f26771N;
                if (cVar != null && cVar.g()) {
                    eVar.a(eVar.f26821a);
                } else if (bottomSheetBehavior.f26770M == 2) {
                    bottomSheetBehavior.J(eVar.f26821a);
                }
            }
        }

        public e() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.f26779V;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f26821a = i10;
            if (this.f26822b) {
                return;
            }
            V v10 = bottomSheetBehavior.f26779V.get();
            a aVar = this.f26823c;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            v10.postOnAnimation(aVar);
            this.f26822b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f26784b = 0;
        this.f26785c = true;
        this.f26793l = -1;
        this.f26794m = -1;
        this.f26759B = new e();
        this.f26764G = 0.5f;
        this.f26766I = -1.0f;
        this.f26769L = true;
        this.f26770M = 4;
        this.f26775R = 0.1f;
        this.f26781X = new ArrayList<>();
        this.f26800q0 = -1;
        this.f26806t0 = new SparseIntArray();
        this.f26808u0 = new b();
    }

    public static View A(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (O.d.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewA = A(viewGroup.getChildAt(i10));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior B(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f16649a;
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int C(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final int D() {
        if (this.f26785c) {
            return this.f26762E;
        }
        return Math.max(this.f26761D, this.f26803s ? 0 : this.f26811x);
    }

    public final int E(int i10) {
        if (i10 == 3) {
            return D();
        }
        if (i10 == 4) {
            return this.f26765H;
        }
        if (i10 == 5) {
            return this.f26778U;
        }
        if (i10 == 6) {
            return this.f26763F;
        }
        throw new IllegalArgumentException(J4.i.b(i10, "Invalid state to get top offset: "));
    }

    public final boolean F() {
        WeakReference<V> weakReference = this.f26779V;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        this.f26779V.get().getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void G(boolean z10) {
        if (this.f26767J != z10) {
            this.f26767J = z10;
            if (!z10 && this.f26770M == 5) {
                I(4);
            }
            M();
        }
    }

    public final void H(int i10) {
        if (i10 == -1) {
            if (this.f26789g) {
                return;
            } else {
                this.f26789g = true;
            }
        } else {
            if (!this.f26789g && this.f26788f == i10) {
                return;
            }
            this.f26789g = false;
            this.f26788f = Math.max(0, i10);
        }
        P();
    }

    public final void I(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(Q8.d.a(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f26767J || i10 != 5) {
            int i11 = (i10 == 6 && this.f26785c && E(i10) <= this.f26762E) ? 3 : i10;
            WeakReference<V> weakReference = this.f26779V;
            if (weakReference == null || weakReference.get() == null) {
                J(i10);
                return;
            }
            V v10 = this.f26779V.get();
            p275w5.a aVar = new p275w5.a(this, v10, i11);
            ViewParent parent = v10.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                if (v10.isAttachedToWindow()) {
                    v10.post(aVar);
                    return;
                }
            }
            aVar.run();
        }
    }

    public final void J(int i10) {
        V v10;
        if (this.f26770M == i10) {
            return;
        }
        this.f26770M = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.f26767J;
        }
        WeakReference<V> weakReference = this.f26779V;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            O(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            O(false);
        }
        N(i10, true);
        while (true) {
            ArrayList<c> arrayList = this.f26781X;
            if (i11 >= arrayList.size()) {
                M();
                return;
            } else {
                arrayList.get(i11).c(i10, v10);
                i11++;
            }
        }
    }

    public final boolean K(View view, float f10) {
        if (this.f26768K) {
            return true;
        }
        if (view.getTop() < this.f26765H) {
            return false;
        }
        return Math.abs(((f10 * this.f26775R) + ((float) view.getTop())) - ((float) this.f26765H)) / ((float) y()) > 0.5f;
    }

    public final void L(View view, int i10, boolean z10) {
        int iE = E(i10);
        L0.c cVar = this.f26771N;
        if (cVar == null || (!z10 ? cVar.s(view, view.getLeft(), iE) : cVar.q(view.getLeft(), iE))) {
            J(i10);
            return;
        }
        J(2);
        N(i10, true);
        this.f26759B.a(i10);
    }

    public final void M() {
        V v10;
        int iA;
        WeakReference<V> weakReference = this.f26779V;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        O.k(524288, v10);
        O.h(0, v10);
        O.k(262144, v10);
        O.h(0, v10);
        O.k(1048576, v10);
        O.h(0, v10);
        SparseIntArray sparseIntArray = this.f26806t0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            O.k(i10, v10);
            O.h(0, v10);
            sparseIntArray.delete(0);
        }
        if (!this.f26785c && this.f26770M != 6) {
            String string = v10.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            p275w5.d dVar = new p275w5.d(this, 6);
            ArrayList arrayListF = O.f(v10);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListF.size()) {
                    int i12 = -1;
                    for (int i13 = 0; i13 < 32 && i12 == -1; i13++) {
                        int i14 = O.f16862d[i13];
                        boolean z10 = true;
                        for (int i15 = 0; i15 < arrayListF.size(); i15++) {
                            z10 &= ((s.a) arrayListF.get(i15)).a() != i14;
                        }
                        if (z10) {
                            i12 = i14;
                        }
                    }
                    iA = i12;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((s.a) arrayListF.get(i11)).f1428a).getLabel())) {
                    iA = ((s.a) arrayListF.get(i11)).a();
                    break;
                }
                i11++;
            }
            if (iA != -1) {
                s.a aVar = new s.a(null, iA, string, dVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = O.d(v10);
                C1286a c1286a = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C1286a.C0173a ? ((C1286a.C0173a) accessibilityDelegateD).f16888a : new C1286a(accessibilityDelegateD);
                if (c1286a == null) {
                    c1286a = new C1286a();
                }
                O.n(v10, c1286a);
                O.k(aVar.a(), v10);
                O.f(v10).add(aVar);
                O.h(0, v10);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f26767J && this.f26770M != 5) {
            O.l(v10, s.a.f1423o, new p275w5.d(this, 5));
        }
        int i16 = this.f26770M;
        if (i16 == 3) {
            O.l(v10, s.a.f1422n, new p275w5.d(this, this.f26785c ? 4 : 6));
            return;
        }
        if (i16 == 4) {
            O.l(v10, s.a.f1421m, new p275w5.d(this, this.f26785c ? 3 : 6));
        } else {
            if (i16 != 6) {
                return;
            }
            O.l(v10, s.a.f1422n, new p275w5.d(this, 4));
            O.l(v10, s.a.f1421m, new p275w5.d(this, 3));
        }
    }

    public final void N(int i10, boolean z10) {
        f fVar = this.j;
        ValueAnimator valueAnimator = this.f26760C;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.f26770M == 3 && (this.f26812y || F());
        if (this.f26758A == z11 || fVar == null) {
            return;
        }
        this.f26758A = z11;
        if (z10 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(fVar.f5566b.f5597i, z11 ? x() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fX = this.f26758A ? x() : 1.0f;
        f.b bVar = fVar.f5566b;
        if (bVar.f5597i != fX) {
            bVar.f5597i = fX;
            fVar.f5570f = true;
            fVar.invalidateSelf();
        }
    }

    public final void O(boolean z10) {
        WeakReference<V> weakReference = this.f26779V;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f26804s0 != null) {
                    return;
                } else {
                    this.f26804s0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f26779V.get() && z10) {
                    this.f26804s0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.f26804s0 = null;
        }
    }

    public final void P() {
        V v10;
        if (this.f26779V != null) {
            w();
            if (this.f26770M != 4 || (v10 = this.f26779V.get()) == null) {
                return;
            }
            v10.requestLayout();
        }
    }

    @Override // M5.b
    public final void a(C0845b c0845b) {
        h hVar = this.f26783Z;
        if (hVar == null) {
            return;
        }
        hVar.f4571f = c0845b;
    }

    @Override // M5.b
    public final void b(C0845b c0845b) {
        h hVar = this.f26783Z;
        if (hVar == null) {
            return;
        }
        C0845b c0845b2 = hVar.f4571f;
        hVar.f4571f = c0845b;
        if (c0845b2 == null) {
            return;
        }
        hVar.b(c0845b.f8201c);
    }

    @Override // M5.b
    public final void c() {
        h hVar = this.f26783Z;
        if (hVar == null) {
            return;
        }
        C0845b c0845b = hVar.f4571f;
        hVar.f4571f = null;
        if (c0845b == null || Build.VERSION.SDK_INT < 34) {
            I(this.f26767J ? 5 : 4);
            return;
        }
        boolean z10 = this.f26767J;
        int i10 = hVar.f4569d;
        int i11 = hVar.f4568c;
        float f10 = c0845b.f8201c;
        if (!z10) {
            AnimatorSet animatorSetA = hVar.a();
            animatorSetA.setDuration(p216r5.a.c(f10, i11, i10));
            animatorSetA.start();
            I(4);
            return;
        }
        a aVar = new a();
        V v10 = hVar.f4567b;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.TRANSLATION_Y, v10.getScaleY() * v10.getHeight());
        objectAnimatorOfFloat.setInterpolator(new X0.b());
        objectAnimatorOfFloat.setDuration(p216r5.a.c(f10, i11, i10));
        objectAnimatorOfFloat.addListener(new g(hVar));
        objectAnimatorOfFloat.addListener(aVar);
        objectAnimatorOfFloat.start();
    }

    @Override // M5.b
    public final void d() {
        h hVar = this.f26783Z;
        if (hVar == null) {
            return;
        }
        C0845b c0845b = hVar.f4571f;
        hVar.f4571f = null;
        if (c0845b == null) {
            return;
        }
        AnimatorSet animatorSetA = hVar.a();
        animatorSetA.setDuration(hVar.f4570e);
        animatorSetA.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(CoordinatorLayout.f fVar) {
        this.f26779V = null;
        this.f26771N = null;
        this.f26783Z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void j() {
        this.f26779V = null;
        this.f26771N = null;
        this.f26783Z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i10;
        L0.c cVar;
        if (!v10.isShown() || !this.f26769L) {
            this.f26772O = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f26798p0 = -1;
            this.f26800q0 = -1;
            VelocityTracker velocityTracker = this.f26782Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f26782Y = null;
            }
        }
        if (this.f26782Y == null) {
            this.f26782Y = VelocityTracker.obtain();
        }
        this.f26782Y.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f26800q0 = (int) motionEvent.getY();
            if (this.f26770M != 2) {
                WeakReference<View> weakReference = this.f26780W;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.p(view, x10, this.f26800q0)) {
                    this.f26798p0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f26802r0 = true;
                }
            }
            this.f26772O = this.f26798p0 == -1 && !coordinatorLayout.p(v10, x10, this.f26800q0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26802r0 = false;
            this.f26798p0 = -1;
            if (this.f26772O) {
                this.f26772O = false;
                return false;
            }
        }
        if (!this.f26772O && (cVar = this.f26771N) != null && cVar.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f26780W;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f26772O || this.f26770M == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f26771N == null || (i10 = this.f26800q0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f26771N.f4402b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11 = this.f26794m;
        f fVar = this.j;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.f26779V == null) {
            this.f26790h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f26796o || this.f26789g) ? false : true;
            if (this.f26797p || this.f26799q || this.f26801r || this.f26805t || this.f26807u || this.f26809v || z10) {
                p275w5.c cVar = new p275w5.c(this, z10);
                int paddingStart = v10.getPaddingStart();
                v10.getPaddingTop();
                int paddingEnd = v10.getPaddingEnd();
                int paddingBottom = v10.getPaddingBottom();
                t.a aVar = new t.a();
                aVar.f4363a = paddingStart;
                aVar.f4364b = paddingEnd;
                aVar.f4365c = paddingBottom;
                O.d.u(v10, new r(cVar, aVar));
                if (v10.isAttachedToWindow()) {
                    O.c.c(v10);
                } else {
                    v10.addOnAttachStateChangeListener(new K5.s());
                }
            }
            O.p(v10, new p275w5.h(v10));
            this.f26779V = new WeakReference<>(v10);
            this.f26783Z = new h(v10);
            if (fVar != null) {
                v10.setBackground(fVar);
                float fI = this.f26766I;
                if (fI == -1.0f) {
                    fI = O.d.i(v10);
                }
                fVar.j(fI);
            } else {
                ColorStateList colorStateList = this.f26792k;
                if (colorStateList != null) {
                    O.d.q(v10, colorStateList);
                }
            }
            M();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
        }
        if (this.f26771N == null) {
            this.f26771N = new L0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f26808u0);
        }
        int top = v10.getTop();
        coordinatorLayout.r(i10, v10);
        this.f26777T = coordinatorLayout.getWidth();
        this.f26778U = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f26776S = height;
        int iMin = this.f26778U;
        int i13 = iMin - height;
        int i14 = this.f26811x;
        if (i13 < i14) {
            if (this.f26803s) {
                if (i11 != -1) {
                    iMin = Math.min(iMin, i11);
                }
                this.f26776S = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i11 != -1) {
                    iMin2 = Math.min(iMin2, i11);
                }
                this.f26776S = iMin2;
            }
        }
        this.f26762E = Math.max(0, this.f26778U - this.f26776S);
        this.f26763F = (int) ((1.0f - this.f26764G) * this.f26778U);
        w();
        int i15 = this.f26770M;
        if (i15 == 3) {
            v10.offsetTopAndBottom(D());
        } else if (i15 == 6) {
            v10.offsetTopAndBottom(this.f26763F);
        } else if (this.f26767J && i15 == 5) {
            v10.offsetTopAndBottom(this.f26778U);
        } else if (i15 == 4) {
            v10.offsetTopAndBottom(this.f26765H);
        } else if (i15 == 1 || i15 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        N(this.f26770M, false);
        this.f26780W = new WeakReference<>(A(v10));
        while (true) {
            ArrayList<c> arrayList = this.f26781X;
            if (i12 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i12).a(v10);
            i12++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(C(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f26793l, marginLayoutParams.width), C(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f26794m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(View view) {
        WeakReference<View> weakReference = this.f26780W;
        return (weakReference == null || view != weakReference.get() || this.f26770M == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        boolean z10 = this.f26769L;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f26780W;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < D()) {
                int iD = top - D();
                iArr[1] = iD;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                v10.offsetTopAndBottom(-iD);
                J(3);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                v10.offsetTopAndBottom(-i11);
                J(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i14 = this.f26765H;
            if (i13 > i14 && !this.f26767J) {
                int i15 = top - i14;
                iArr[1] = i15;
                WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
                v10.offsetTopAndBottom(-i15);
                J(4);
            } else {
                if (!z10) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap<View, Z> weakHashMap4 = O.f16859a;
                v10.offsetTopAndBottom(-i11);
                J(1);
            }
        }
        z(v10.getTop());
        this.f26773P = i11;
        this.f26774Q = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f26784b;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f26788f = dVar.f26817e;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f26785c = dVar.f26818f;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f26767J = dVar.f26819g;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f26768K = dVar.f26820h;
            }
        }
        int i11 = dVar.f26816d;
        if (i11 == 1 || i11 == 2) {
            this.f26770M = 4;
        } else {
            this.f26770M = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable s(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean t(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.f26773P = 0;
        this.f26774Q = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        int top;
        int top2;
        int i11;
        float yVelocity;
        int i12 = 3;
        if (v10.getTop() == D()) {
            J(3);
            return;
        }
        WeakReference<View> weakReference = this.f26780W;
        if (weakReference != null && view == weakReference.get() && this.f26774Q) {
            if (this.f26773P > 0) {
                if (!this.f26785c && v10.getTop() > this.f26763F) {
                    i12 = 6;
                }
            } else if (this.f26767J) {
                VelocityTracker velocityTracker = this.f26782Y;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, this.f26786d);
                    yVelocity = this.f26782Y.getYVelocity(this.f26798p0);
                }
                if (K(v10, yVelocity)) {
                    i12 = 5;
                } else if (this.f26773P == 0) {
                    top2 = v10.getTop();
                    if (this.f26785c) {
                        i11 = this.f26763F;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - this.f26765H)) {
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f26765H)) {
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top2 - this.f26762E) >= Math.abs(top2 - this.f26765H)) {
                        i12 = 4;
                    }
                } else {
                    if (!this.f26785c) {
                        top = v10.getTop();
                        if (Math.abs(top - this.f26763F) < Math.abs(top - this.f26765H)) {
                            i12 = 6;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f26773P == 0) {
                top2 = v10.getTop();
                if (this.f26785c) {
                    i11 = this.f26763F;
                    if (top2 < i11) {
                        if (top2 >= Math.abs(top2 - this.f26765H)) {
                        }
                    } else if (Math.abs(top2 - i11) < Math.abs(top2 - this.f26765H)) {
                        i12 = 4;
                    }
                    i12 = 6;
                } else if (Math.abs(top2 - this.f26762E) >= Math.abs(top2 - this.f26765H)) {
                    i12 = 4;
                }
            } else {
                if (!this.f26785c) {
                    top = v10.getTop();
                    if (Math.abs(top - this.f26763F) < Math.abs(top - this.f26765H)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            L(v10, i12, false);
            this.f26774Q = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f26770M;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        L0.c cVar = this.f26771N;
        if (cVar != null && (this.f26769L || i10 == 1)) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f26798p0 = -1;
            this.f26800q0 = -1;
            VelocityTracker velocityTracker = this.f26782Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f26782Y = null;
            }
        }
        if (this.f26782Y == null) {
            this.f26782Y = VelocityTracker.obtain();
        }
        this.f26782Y.addMovement(motionEvent);
        if (this.f26771N != null && ((this.f26769L || this.f26770M == 1) && actionMasked == 2 && !this.f26772O)) {
            float fAbs = Math.abs(this.f26800q0 - motionEvent.getY());
            L0.c cVar2 = this.f26771N;
            if (fAbs > cVar2.f4402b) {
                cVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f26772O;
    }

    public final void w() {
        int iY = y();
        if (this.f26785c) {
            this.f26765H = Math.max(this.f26778U - iY, this.f26762E);
        } else {
            this.f26765H = this.f26778U - iY;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final float x() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        float f10;
        float f11 = 0.0f;
        if (this.j != null && (weakReference = this.f26779V) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v10 = this.f26779V.get();
            if (F() && (rootWindowInsets = v10.getRootWindowInsets()) != null) {
                f fVar = this.j;
                float fA = fVar.f5566b.f5589a.f5611e.a(fVar.g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fA <= 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = radius / fA;
                    }
                } else {
                    f10 = 0.0f;
                }
                f fVar2 = this.j;
                float fA2 = fVar2.f5566b.f5589a.f5612f.a(fVar2.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA2 > 0.0f) {
                        f11 = radius2 / fA2;
                    }
                }
                return Math.max(f10, f11);
            }
        }
        return 0.0f;
    }

    public final int y() {
        int i10;
        if (this.f26789g) {
            return Math.min(Math.max(this.f26790h, this.f26778U - ((this.f26777T * 9) / 16)), this.f26776S) + this.f26810w;
        }
        return (this.f26796o || this.f26797p || (i10 = this.f26795n) <= 0) ? this.f26788f + this.f26810w : Math.max(this.f26788f, i10 + this.f26791i);
    }

    public final void z(int i10) {
        V v10 = this.f26779V.get();
        if (v10 != null) {
            ArrayList<c> arrayList = this.f26781X;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f26765H;
            if (i10 <= i11 && i11 != D()) {
                D();
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList.get(i12).b(v10);
            }
        }
    }

    public static class d extends K0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f26818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f26819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f26820h;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26816d = parcel.readInt();
            this.f26817e = parcel.readInt();
            this.f26818f = parcel.readInt() == 1;
            this.f26819g = parcel.readInt() == 1;
            this.f26820h = parcel.readInt() == 1;
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26816d);
            parcel.writeInt(this.f26817e);
            parcel.writeInt(this.f26818f ? 1 : 0);
            parcel.writeInt(this.f26819g ? 1 : 0);
            parcel.writeInt(this.f26820h ? 1 : 0);
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f26816d = bottomSheetBehavior.f26770M;
            this.f26817e = bottomSheetBehavior.f26788f;
            this.f26818f = bottomSheetBehavior.f26785c;
            this.f26819g = bottomSheetBehavior.f26767J;
            this.f26820h = bottomSheetBehavior.f26768K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f26784b = 0;
        this.f26785c = true;
        this.f26793l = -1;
        this.f26794m = -1;
        this.f26759B = new e();
        this.f26764G = 0.5f;
        this.f26766I = -1.0f;
        this.f26769L = true;
        this.f26770M = 4;
        this.f26775R = 0.1f;
        this.f26781X = new ArrayList<>();
        this.f26800q0 = -1;
        this.f26806t0 = new SparseIntArray();
        this.f26808u0 = new b();
        this.f26791i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46111d);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f26792k = P5.c.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f26813z = i.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        i iVar = this.f26813z;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.j = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f26792k;
            if (colorStateList != null) {
                this.j.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x(), 1.0f);
        this.f26760C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f26760C.addUpdateListener(new p275w5.b(this));
        this.f26766I = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f26793l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f26794m = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            H(i10);
        } else {
            H(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        G(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.f26796o = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f26785c != z10) {
            this.f26785c = z10;
            if (this.f26779V != null) {
                w();
            }
            J((this.f26785c && this.f26770M == 6) ? 3 : this.f26770M);
            N(this.f26770M, true);
            M();
        }
        this.f26768K = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f26769L = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f26784b = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f10 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.f26764G = f10;
            if (this.f26779V != null) {
                this.f26763F = (int) ((1.0f - f10) * this.f26778U);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i11 = typedValuePeekValue2.data;
                if (i11 >= 0) {
                    this.f26761D = i11;
                    N(this.f26770M, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f26761D = dimensionPixelOffset;
                    N(this.f26770M, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f26787e = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f26797p = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f26799q = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f26801r = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f26803s = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f26805t = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f26807u = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f26809v = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f26812y = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f26786d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public static abstract class c {
        public abstract void b(View view);

        public abstract void c(int i10, View view);

        public void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
