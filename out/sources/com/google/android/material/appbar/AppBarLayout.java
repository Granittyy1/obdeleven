package com.google.android.material.appbar;

import A8.p;
import B0.s;
import M5.l;
import S4.o;
import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1286a;
import androidx.core.view.InterfaceC1304t;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.play.integrity.internal.k;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p227s5.f;
import p227s5.g;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f26658z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n0 f26665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26666i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<View> f26670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f26671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f26672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f26673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f26674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f26675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f26676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f26677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f26678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f26679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f26680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Behavior f26681y;

    public static class BaseBehavior<T extends AppBarLayout> extends p227s5.c<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f26682k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f26683l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ValueAnimator f26684m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public b f26685n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public WeakReference<View> f26686o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f26687p;

        public class a extends C1286a {
            public a() {
            }

            @Override // androidx.core.view.C1286a
            public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
                super.onInitializeAccessibilityNodeInfo(view, sVar);
                sVar.n(BaseBehavior.this.f26687p);
                sVar.i(ScrollView.class.getName());
            }
        }

        public static class b extends K0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f26689d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f26690e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f26691f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f26692g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f26693h;

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
                this.f26689d = parcel.readByte() != 0;
                this.f26690e = parcel.readByte() != 0;
                this.f26691f = parcel.readInt();
                this.f26692g = parcel.readFloat();
                this.f26693h = parcel.readByte() != 0;
            }

            @Override // K0.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f26689d ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f26690e ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f26691f);
                parcel.writeFloat(this.f26692g);
                parcel.writeByte(this.f26693h ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View G(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof InterfaceC1304t) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View childAt;
            boolean zF;
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (childAt != null) {
                int i13 = ((c) childAt.getLayoutParams()).f26696a;
                if ((i13 & 1) != 0) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i11 <= 0 || (i13 & 12) == 0 ? (i13 & 2) == 0 || (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i10) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zF = false;
                    } else {
                        zF = true;
                    }
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
            if (appBarLayout.f26668l) {
                zF = appBarLayout.f(G(coordinatorLayout));
            }
            boolean zE = appBarLayout.e(zF);
            if (!z10) {
                if (zE) {
                    ArrayList<View> arrayList = coordinatorLayout.f16630c.f44661b.get(appBarLayout);
                    ArrayList arrayList2 = coordinatorLayout.f16632e;
                    arrayList2.clear();
                    if (arrayList != null) {
                        arrayList2.addAll(arrayList);
                    }
                    int size = arrayList2.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList2.get(i14)).getLayoutParams()).f16649a;
                        if (cVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) cVar).f46922g == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // p227s5.c
        public final int A(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // p227s5.c
        public final int B(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // p227s5.c
        public final void C(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            J(coordinatorLayout, appBarLayout);
            if (appBarLayout.f26668l) {
                appBarLayout.e(appBarLayout.f(G(coordinatorLayout)));
            }
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:65:0x014c  */
        /* JADX WARN: Code duplicated, block: B:67:0x0153  */
        @Override // p227s5.c
        public final int D(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int top;
            boolean z10;
            int i13;
            b bVar;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iX = x();
            int i14 = 0;
            if (i11 == 0 || iX < i11 || iX > i12) {
                this.f26682k = 0;
            } else {
                int iD = o.d(i10, i11, i12);
                if (iX != iD) {
                    if (!appBarLayout.f26663f) {
                        top = iD;
                        break;
                    }
                    int iAbs = Math.abs(iD);
                    int childCount = appBarLayout.getChildCount();
                    int i15 = 0;
                    while (true) {
                        if (i15 < childCount) {
                            View childAt = appBarLayout.getChildAt(i15);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f26698c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i15++;
                            } else if (interpolator != null) {
                                int i16 = cVar.f26696a;
                                if ((i16 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i16 & 2) != 0) {
                                        WeakHashMap<View, Z> weakHashMap = O.f16859a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f10 = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f10) * f10)) * Integer.signum(iD);
                                    break;
                                }
                            }
                        }
                        top = iD;
                        break;
                    }
                    f fVar = this.f46923b;
                    if (fVar != null) {
                        if (fVar.f46928d != top) {
                            fVar.f46928d = top;
                            fVar.a();
                            z10 = true;
                        }
                        int i17 = iX - iD;
                        this.f26682k = iD - top;
                        if (z10) {
                            for (i13 = 0; i13 < appBarLayout.getChildCount(); i13++) {
                                c cVar2 = (c) appBarLayout.getChildAt(i13).getLayoutParams();
                                bVar = cVar2.f26697b;
                                if (bVar == null && (cVar2.f26696a & 1) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i13);
                                    float fW = w();
                                    Rect rect = bVar.f26694a;
                                    childAt2.getDrawingRect(rect);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                    rect.offset(0, -appBarLayout.getTopInset());
                                    float fAbs = rect.top - Math.abs(fW);
                                    if (fAbs <= 0.0f) {
                                        float fAbs2 = Math.abs(fAbs / rect.height());
                                        float f11 = 1.0f - (fAbs2 >= 0.0f ? fAbs2 > 1.0f ? 1.0f : fAbs2 : 0.0f);
                                        float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (f11 * f11)));
                                        childAt2.setTranslationY(fHeight);
                                        Rect rect2 = bVar.f26695b;
                                        childAt2.getDrawingRect(rect2);
                                        rect2.offset(0, (int) (-fHeight));
                                        WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
                                        childAt2.setClipBounds(rect2);
                                    } else {
                                        WeakHashMap<View, Z> weakHashMap4 = O.f16859a;
                                        childAt2.setClipBounds(null);
                                        childAt2.setTranslationY(0.0f);
                                    }
                                }
                            }
                        }
                        if (!z10 && appBarLayout.f26663f) {
                            coordinatorLayout.c(appBarLayout);
                        }
                        appBarLayout.f26659b = w();
                        if (!appBarLayout.willNotDraw()) {
                            WeakHashMap<View, Z> weakHashMap5 = O.f16859a;
                            appBarLayout.postInvalidateOnAnimation();
                        }
                        L(coordinatorLayout, appBarLayout, iD, iD < iX ? -1 : 1, false);
                        i14 = i17;
                    } else {
                        this.f46924c = top;
                    }
                    z10 = false;
                    int i18 = iX - iD;
                    this.f26682k = iD - top;
                    if (z10) {
                        while (i13 < appBarLayout.getChildCount()) {
                            c cVar3 = (c) appBarLayout.getChildAt(i13).getLayoutParams();
                            bVar = cVar3.f26697b;
                            if (bVar == null) {
                            }
                        }
                    }
                    if (!z10) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.f26659b = w();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, Z> weakHashMap6 = O.f16859a;
                        appBarLayout.postInvalidateOnAnimation();
                    }
                    L(coordinatorLayout, appBarLayout, iD, iD < iX ? -1 : 1, false);
                    i14 = i18;
                }
            }
            K(coordinatorLayout, appBarLayout);
            return i14;
        }

        public final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(x() - i10);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iX = x();
            if (iX == i10) {
                ValueAnimator valueAnimator = this.f26684m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f26684m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f26684m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f26684m = valueAnimator3;
                valueAnimator3.setInterpolator(p216r5.a.f46345e);
                this.f26684m.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f26684m.setDuration(Math.min(iRound, 600));
            this.f26684m.setIntValues(iX, i10);
            this.f26684m.start();
        }

        public final void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int downNestedPreScrollRange;
            if (i10 != 0) {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i12 = i11;
                int i13 = downNestedPreScrollRange;
                if (i12 != i13) {
                    iArr[1] = D(coordinatorLayout, appBarLayout, x() - i10, i12, i13);
                }
            }
            if (appBarLayout.f26668l) {
                appBarLayout.e(appBarLayout.f(view));
            }
        }

        public final b I(Parcelable parcelable, T t8) {
            int iW = w();
            int childCount = t8.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t8.getChildAt(i10);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = K0.a.f4134c;
                    }
                    b bVar = new b(parcelable);
                    boolean z10 = iW == 0;
                    bVar.f26690e = z10;
                    bVar.f26689d = !z10 && (-iW) >= t8.getTotalScrollRange();
                    bVar.f26691f = i10;
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    bVar.f26693h = bottom == t8.getTopInset() + childAt.getMinimumHeight();
                    bVar.f26692g = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void J(CoordinatorLayout coordinatorLayout, T t8) {
            int paddingTop = t8.getPaddingTop() + t8.getTopInset();
            int iX = x() - paddingTop;
            int childCount = t8.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t8.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.f26696a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -iX;
                if (top <= i11 && bottom >= i11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t8.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i12 = cVar2.f26696a;
                if ((i12 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, Z> weakHashMap = O.f16859a;
                        if (t8.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= t8.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iX < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (iX < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    F(coordinatorLayout, t8, o.d(topInset + paddingTop, -t8.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
        public final void K(CoordinatorLayout coordinatorLayout, T t8) {
            View childAt;
            O.k(s.a.f1419k.a(), coordinatorLayout);
            boolean z10 = false;
            O.h(0, coordinatorLayout);
            O.k(s.a.f1420l.a(), coordinatorLayout);
            O.h(0, coordinatorLayout);
            if (t8.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f16649a instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i10++;
                }
            }
            View view = childAt;
            if (view == null) {
                return;
            }
            int childCount2 = t8.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                if (((c) t8.getChildAt(i11).getLayoutParams()).f26696a != 0) {
                    if (O.d(coordinatorLayout) == null) {
                        O.n(coordinatorLayout, new a());
                    }
                    boolean z11 = true;
                    if (x() != (-t8.getTotalScrollRange())) {
                        O.l(coordinatorLayout, s.a.f1419k, new com.google.android.material.appbar.c(t8, false));
                        z10 = true;
                    }
                    if (x() == 0) {
                        z11 = z10;
                    } else if (view.canScrollVertically(-1)) {
                        int i12 = -t8.getDownNestedPreScrollRange();
                        if (i12 != 0) {
                            O.l(coordinatorLayout, s.a.f1420l, new com.google.android.material.appbar.b(this, coordinatorLayout, t8, view, i12));
                        } else {
                            z11 = z10;
                        }
                    } else {
                        O.l(coordinatorLayout, s.a.f1420l, new com.google.android.material.appbar.c(t8, true));
                    }
                    this.f26687p = z11;
                    return;
                }
            }
        }

        @Override // p227s5.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f26685n;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            F(coordinatorLayout, appBarLayout, i11);
                        } else {
                            E(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            F(coordinatorLayout, appBarLayout, 0);
                        } else {
                            E(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (bVar.f26689d) {
                E(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (bVar.f26690e) {
                E(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(bVar.f26691f);
                int i12 = -childAt.getBottom();
                if (this.f26685n.f26693h) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i12;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.f26685n.f26692g) + i12;
                }
                E(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f26664g = 0;
            this.f26685n = null;
            int iD = o.d(w(), -appBarLayout.getTotalScrollRange(), 0);
            f fVar = this.f46923b;
            if (fVar == null) {
                this.f46924c = iD;
            } else if (fVar.f46928d != iD) {
                fVar.f46928d = iD;
                fVar.a();
            }
            L(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.f26659b = w();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                appBarLayout.postInvalidateOnAnimation();
            }
            K(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            H(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = D(coordinatorLayout, appBarLayout, x() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                K(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof b) {
                this.f26685n = (b) parcelable;
            } else {
                this.f26685n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b bVarI = I(absSavedState, (AppBarLayout) view);
            return bVarI == null ? absSavedState : bVarI;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.f26668l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z10 && (valueAnimator = this.f26684m) != null) {
                valueAnimator.cancel();
            }
            this.f26686o = null;
            this.f26683l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f26683l == 0 || i10 == 1) {
                J(coordinatorLayout, appBarLayout);
                if (appBarLayout.f26668l) {
                    appBarLayout.e(appBarLayout.f(view2));
                }
            }
            this.f26686o = new WeakReference<>(view2);
        }

        @Override // p227s5.e
        public final int x() {
            return w() + this.f26682k;
        }

        @Override // p227s5.c
        public final boolean z(View view) {
            WeakReference<View> weakReference = this.f26686o;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends p227s5.d {
        public ScrollingViewBehavior() {
        }

        @Override // p227s5.d
        public final float A(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f16649a;
                int iX = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).x() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iX > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iX / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // p227s5.d
        public final int B(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iD;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f16649a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f26682k + this.f46921f;
                if (this.f46922g == 0) {
                    iD = 0;
                } else {
                    float fA = A(view2);
                    int i10 = this.f46922g;
                    iD = o.d((int) (fA * i10), 0, i10);
                }
                int i11 = bottom - iD;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f26668l) {
                    appBarLayout.e(appBarLayout.f(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                O.k(s.a.f1419k.a(), coordinatorLayout);
                O.h(0, coordinatorLayout);
                O.k(s.a.f1420l.a(), coordinatorLayout);
                O.h(0, coordinatorLayout);
                O.n(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList arrayListE = coordinatorLayout.e(view);
            int size = arrayListE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListE.get(i10);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i10++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f46919d;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.d(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // p227s5.d
        public final AppBarLayout z(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46098B);
            this.f46922g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f26694a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f26695b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f26697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f26698c;
    }

    public interface d {
        void a();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        Integer numValueOf;
        super(Z5.a.a(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.f26660c = -1;
        this.f26661d = -1;
        this.f26662e = -1;
        this.f26664g = 0;
        this.f26674r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = K5.o.d(context3, attributeSet, g.f46929a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = K5.o.d(context2, attributeSet, p204q5.a.f46108a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            setBackground(drawable);
            final ColorStateList colorStateListA = P5.c.a(context2, typedArrayD2, 6);
            this.f26671o = colorStateListA != null;
            final ColorStateList colorStateListA2 = G5.c.a(getBackground());
            if (colorStateListA2 != null) {
                final S5.f fVar = new S5.f();
                fVar.k(colorStateListA2);
                if (colorStateListA != null) {
                    Context context4 = getContext();
                    TypedValue typedValueA = P5.b.a(context4, R.attr.colorSurface);
                    if (typedValueA != null) {
                        int i10 = typedValueA.resourceId;
                        numValueOf = Integer.valueOf(i10 != 0 ? p0.a.b.a(context4, i10) : typedValueA.data);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.f26673q = new ValueAnimator.AnimatorUpdateListener() { // from class: s5.a
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            int i11 = AppBarLayout.f26658z;
                            AppBarLayout appBarLayout = this.f46903b;
                            appBarLayout.getClass();
                            int iB = p.B(((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListA2.getDefaultColor(), colorStateListA.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
                            S5.f fVar2 = fVar;
                            fVar2.k(colorStateListValueOf);
                            if (appBarLayout.f26678v != null && (num2 = appBarLayout.f26679w) != null && num2.equals(num)) {
                                p234t0.a.C0532a.g(appBarLayout.f26678v, iB);
                            }
                            ArrayList<AppBarLayout.d> arrayList = appBarLayout.f26674r;
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            for (AppBarLayout.d dVar : arrayList) {
                                if (fVar2.f5566b.f5591c != null) {
                                    dVar.a();
                                }
                            }
                        }
                    };
                    setBackground(fVar);
                } else {
                    fVar.i(context2);
                    this.f26673q = new ValueAnimator.AnimatorUpdateListener() { // from class: s5.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i11 = AppBarLayout.f26658z;
                            AppBarLayout appBarLayout = this.f46908b;
                            appBarLayout.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            fVar.j(fFloatValue);
                            Drawable drawable2 = appBarLayout.f26678v;
                            if (drawable2 instanceof S5.f) {
                                ((S5.f) drawable2).j(fFloatValue);
                            }
                            Iterator it = appBarLayout.f26674r.iterator();
                            while (it.hasNext()) {
                                ((AppBarLayout.d) it.next()).a();
                            }
                        }
                    };
                    setBackground(fVar);
                }
            }
            this.f26675s = l.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f26676t = l.d(context2, R.attr.motionEasingStandardInterpolator, p216r5.a.f46341a);
            if (typedArrayD2.hasValue(4)) {
                d(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                g.a(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayD2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
            }
            if (typedArrayD2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
            }
            this.f26680x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f26668l = typedArrayD2.getBoolean(5, false);
            this.f26669m = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            O.d.u(this, new k(this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.f26696a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.f26696a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.f26696a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f26696a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46109b);
        cVar.f26696a = typedArrayObtainStyledAttributes.getInt(1, 0);
        cVar.f26697b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            cVar.f26698c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    public final void c() {
        Behavior behavior = this.f26681y;
        BaseBehavior.b bVarI = (behavior == null || this.f26660c == -1 || this.f26664g != 0) ? null : behavior.I(K0.a.f4134c, this);
        this.f26660c = -1;
        this.f26661d = -1;
        this.f26662e = -1;
        if (bVarI != null) {
            Behavior behavior2 = this.f26681y;
            if (behavior2.f26685n != null) {
                return;
            }
            behavior2.f26685n = bVarI;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final void d(boolean z10, boolean z11, boolean z12) {
        this.f26664g = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f26678v == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.f26659b);
        this.f26678v.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f26678v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e(boolean z10) {
        if (this.f26666i || this.f26667k == z10) {
            return false;
        }
        this.f26667k = z10;
        refreshDrawableState();
        if (getBackground() instanceof S5.f) {
            if (this.f26671o) {
                h(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            } else if (this.f26668l) {
                float f10 = this.f26680x;
                h(z10 ? 0.0f : f10, z10 ? f10 : 0.0f);
            }
        }
        return true;
    }

    public final boolean f(View view) {
        int i10;
        if (this.f26670n == null && (i10 = this.f26669m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f26669m);
            }
            if (viewFindViewById != null) {
                this.f26670n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f26670n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean g() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return !childAt.getFitsSystemWindows();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f26696a = 1;
        return cVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f26681y = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f26661d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f26696a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        WeakHashMap<View, Z> weakHashMap = O.f16859a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i12 & 2) != 0) {
                            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i11 += iMin;
                    }
                    iMin = minimumHeight + i13;
                    if (childCount == 0) {
                        WeakHashMap<View, Z> weakHashMap4 = O.f16859a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f26661d = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f26662e;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = cVar.f26696a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f26662e = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f26669m;
    }

    public S5.f getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof S5.f) {
            return (S5.f) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f26664g;
    }

    public Drawable getStatusBarForeground() {
        return this.f26678v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        n0 n0Var = this.f26665h;
        if (n0Var != null) {
            return n0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f26660c;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = cVar.f26696a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + minimumHeight;
                if (i11 == 0) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f26660c = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void h(float f10, float f11) {
        ValueAnimator valueAnimator = this.f26672p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f26672p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f26675s);
        this.f26672p.setInterpolator(this.f26676t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f26673q;
        if (animatorUpdateListener != null) {
            this.f26672p.addUpdateListener(animatorUpdateListener);
        }
        this.f26672p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.G(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.f26677u == null) {
            this.f26677u = new int[4];
        }
        int[] iArr = this.f26677u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.j;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969820;
        iArr[1] = (z10 && this.f26667k) ? R.attr.state_lifted : -2130969821;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969816;
        iArr[3] = (z10 && this.f26667k) ? R.attr.state_collapsed : -2130969815;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f26670n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26670n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = true;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (getFitsSystemWindows() && g()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        c();
        this.f26663f = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((c) getChildAt(i14).getLayoutParams()).f26698c != null) {
                this.f26663f = true;
                break;
            }
        }
        Drawable drawable = this.f26678v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f26666i) {
            return;
        }
        if (!this.f26668l) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((c) getChildAt(i15).getLayoutParams()).f26696a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        if (this.j != z11) {
            this.j = z11;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (getFitsSystemWindows() && g()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = o.d(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.E(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        d(z10, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f26668l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f26669m = -1;
        if (view != null) {
            this.f26670n = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f26670n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26670n = null;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f26669m = i10;
        WeakReference<View> weakReference = this.f26670n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26670n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f26666i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f26678v;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f26678v = drawableMutate;
            if (drawableMutate instanceof S5.f) {
                numValueOf = Integer.valueOf(((S5.f) drawableMutate).f5585v);
            } else {
                ColorStateList colorStateListA = G5.c.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.f26679w = numValueOf;
            Drawable drawable3 = this.f26678v;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f26678v.setState(getDrawableState());
                }
                Drawable drawable4 = this.f26678v;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                t0.a.b.b(drawable4, getLayoutDirection());
                this.f26678v.setVisible(getVisibility() == 0, false);
                this.f26678v.setCallback(this);
            }
            if (this.f26678v != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(!z10);
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(v.e(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f26678v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f26678v;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.f26696a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
