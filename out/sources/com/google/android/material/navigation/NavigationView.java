package com.google.android.material.navigation;

import K5.f;
import K5.g;
import K5.g.c;
import K5.g.h;
import K5.k;
import N5.d;
import N5.e;
import S5.i;
import S5.n;
import S5.o;
import S5.p;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.C0845b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.c0;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationView extends k implements M5.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f27322w = {R.attr.state_checked};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f27323x = {-16842910};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f27324i;
    public final g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f27325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f27327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p138l.f f27328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f27329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f27333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final M5.k f27334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M5.f f27335u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f27336v;

    public class a extends DrawerLayout.g {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                M5.f fVar = navigationView.f27335u;
                Objects.requireNonNull(fVar);
                view.post(new d(0, fVar));
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void c(View view) {
            M5.f fVar;
            M5.f.a aVar;
            NavigationView navigationView = NavigationView.this;
            if (view != navigationView || (aVar = (fVar = navigationView.f27335u).f4573a) == null) {
                return;
            }
            aVar.c(fVar.f4575c);
        }
    }

    public interface b {
        boolean b(MenuItem menuItem);
    }

    public static class c extends K0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bundle f27338d;

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
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27338d = parcel.readBundle(classLoader);
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f27338d);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        int i10;
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.navigationViewStyle, com.voltasit.obdeleven.R.style.Widget_Design_NavigationView), attributeSet, com.voltasit.obdeleven.R.attr.navigationViewStyle);
        g gVar = new g();
        this.j = gVar;
        this.f27327m = new int[2];
        this.f27330p = true;
        this.f27331q = true;
        this.f27332r = 0;
        this.f27333s = Build.VERSION.SDK_INT >= 33 ? new p(this) : new o(this);
        this.f27334t = new M5.k(this);
        this.f27335u = new M5.f(this, this);
        this.f27336v = new a();
        Context context2 = getContext();
        f fVar = new f(context2);
        this.f27324i = fVar;
        int[] iArr = p204q5.a.f46131y;
        K5.o.a(context2, attributeSet, com.voltasit.obdeleven.R.attr.navigationViewStyle, com.voltasit.obdeleven.R.style.Widget_Design_NavigationView);
        K5.o.b(context2, attributeSet, iArr, com.voltasit.obdeleven.R.attr.navigationViewStyle, com.voltasit.obdeleven.R.style.Widget_Design_NavigationView, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.voltasit.obdeleven.R.attr.navigationViewStyle, com.voltasit.obdeleven.R.style.Widget_Design_NavigationView);
        c0 c0Var = new c0(context2, typedArrayObtainStyledAttributes);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            Drawable drawableB = c0Var.b(1);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            setBackground(drawableB);
        }
        this.f27332r = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        Drawable background = getBackground();
        ColorStateList colorStateListA = G5.c.a(background);
        if (background == null || colorStateListA != null) {
            S5.f fVar2 = new S5.f(i.b(context2, attributeSet, com.voltasit.obdeleven.R.attr.navigationViewStyle, com.voltasit.obdeleven.R.style.Widget_Design_NavigationView).a());
            if (colorStateListA != null) {
                fVar2.k(colorStateListA);
            }
            fVar2.i(context2);
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            setBackground(fVar2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0));
        }
        setFitsSystemWindows(typedArrayObtainStyledAttributes.getBoolean(2, false));
        this.f27326l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListA2 = typedArrayObtainStyledAttributes.hasValue(31) ? c0Var.a(31) : null;
        int resourceId = typedArrayObtainStyledAttributes.hasValue(34) ? typedArrayObtainStyledAttributes.getResourceId(34, 0) : 0;
        if (resourceId == 0 && colorStateListA2 == null) {
            colorStateListA2 = f(R.attr.textColorSecondary);
        }
        ColorStateList colorStateListA3 = typedArrayObtainStyledAttributes.hasValue(14) ? c0Var.a(14) : f(R.attr.textColorSecondary);
        int resourceId2 = typedArrayObtainStyledAttributes.hasValue(24) ? typedArrayObtainStyledAttributes.getResourceId(24, 0) : 0;
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(25, true);
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setItemIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0));
        }
        ColorStateList colorStateListA4 = typedArrayObtainStyledAttributes.hasValue(26) ? c0Var.a(26) : null;
        if (resourceId2 == 0 && colorStateListA4 == null) {
            colorStateListA4 = f(R.attr.textColorPrimary);
        }
        Drawable drawableB2 = c0Var.b(10);
        if (drawableB2 == null && (typedArrayObtainStyledAttributes.hasValue(17) || typedArrayObtainStyledAttributes.hasValue(18))) {
            drawableB2 = g(c0Var, P5.c.b(getContext(), c0Var, 19));
            ColorStateList colorStateListB = P5.c.b(context2, c0Var, 16);
            if (colorStateListB != null) {
                gVar.f4311o = new RippleDrawable(Q5.a.b(colorStateListB), null, g(c0Var, null));
                gVar.i();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            i10 = 0;
            setItemHorizontalPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(11, 0));
        } else {
            i10 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(27)) {
            setItemVerticalPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(27, i10));
        }
        setDividerInsetStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, i10));
        setDividerInsetEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, i10));
        setSubheaderInsetStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(33, i10));
        setSubheaderInsetEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(32, i10));
        setTopInsetScrimEnabled(typedArrayObtainStyledAttributes.getBoolean(35, this.f27330p));
        setBottomInsetScrimEnabled(typedArrayObtainStyledAttributes.getBoolean(4, this.f27331q));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        setItemMaxLines(typedArrayObtainStyledAttributes.getInt(15, 1));
        fVar.f8462e = new com.google.android.material.navigation.a(this);
        gVar.f4302e = 1;
        gVar.g(context2, fVar);
        if (resourceId != 0) {
            gVar.f4305h = resourceId;
            gVar.i();
        }
        gVar.f4306i = colorStateListA2;
        gVar.i();
        gVar.f4309m = colorStateListA3;
        gVar.i();
        int overScrollMode = getOverScrollMode();
        gVar.f4297C = overScrollMode;
        NavigationMenuView navigationMenuView = gVar.f4299b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (resourceId2 != 0) {
            gVar.j = resourceId2;
            gVar.i();
        }
        gVar.f4307k = z10;
        gVar.i();
        gVar.f4308l = colorStateListA4;
        gVar.i();
        gVar.f4310n = drawableB2;
        gVar.i();
        gVar.f4314r = dimensionPixelSize;
        gVar.i();
        fVar.b(gVar, fVar.f8458a);
        if (gVar.f4299b == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) gVar.f4304g.inflate(com.voltasit.obdeleven.R.layout.design_navigation_menu, (ViewGroup) this, false);
            gVar.f4299b = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(gVar.new h(gVar.f4299b));
            if (gVar.f4303f == null) {
                gVar.f4303f = gVar.new c();
            }
            int i11 = gVar.f4297C;
            if (i11 != -1) {
                gVar.f4299b.setOverScrollMode(i11);
            }
            LinearLayout linearLayout = (LinearLayout) gVar.f4304g.inflate(com.voltasit.obdeleven.R.layout.design_navigation_item_header, (ViewGroup) gVar.f4299b, false);
            gVar.f4300c = linearLayout;
            WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
            linearLayout.setImportantForAccessibility(2);
            gVar.f4299b.setAdapter(gVar.f4303f);
        }
        addView(gVar.f4299b);
        if (typedArrayObtainStyledAttributes.hasValue(28)) {
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(28, 0);
            g.c cVar = gVar.f4303f;
            if (cVar != null) {
                cVar.f4326c = true;
            }
            getMenuInflater().inflate(resourceId3, fVar);
            g.c cVar2 = gVar.f4303f;
            if (cVar2 != null) {
                cVar2.f4326c = false;
            }
            gVar.i();
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            gVar.f4300c.addView(gVar.f4304g.inflate(typedArrayObtainStyledAttributes.getResourceId(9, 0), (ViewGroup) gVar.f4300c, false));
            NavigationMenuView navigationMenuView3 = gVar.f4299b;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        c0Var.g();
        this.f27329o = new e(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f27329o);
    }

    private MenuInflater getMenuInflater() {
        if (this.f27328n == null) {
            this.f27328n = new p138l.f(getContext());
        }
        return this.f27328n;
    }

    @Override // M5.b
    public final void a(C0845b c0845b) {
        h();
        this.f27334t.f4571f = c0845b;
    }

    @Override // M5.b
    public final void b(C0845b c0845b) {
        int i10 = ((DrawerLayout.e) h().second).f17326a;
        M5.k kVar = this.f27334t;
        C0845b c0845b2 = kVar.f4571f;
        kVar.f4571f = c0845b;
        if (c0845b2 == null) {
            return;
        }
        kVar.c(c0845b.f8201c, i10, c0845b.f8202d == 0);
    }

    @Override // M5.b
    public final void c() {
        Pair<DrawerLayout, DrawerLayout.e> pairH = h();
        final DrawerLayout drawerLayout = (DrawerLayout) pairH.first;
        M5.k kVar = this.f27334t;
        C0845b c0845b = kVar.f4571f;
        kVar.f4571f = null;
        if (c0845b == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i10 = ((DrawerLayout.e) pairH.second).f17326a;
        int i11 = N5.c.f4649a;
        kVar.b(c0845b, i10, new N5.b(drawerLayout, this), new ValueAnimator.AnimatorUpdateListener() { // from class: N5.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(p222s0.a.h(-1728053248, p216r5.a.c(valueAnimator.getAnimatedFraction(), c.f4649a, 0)));
            }
        });
    }

    @Override // M5.b
    public final void d() {
        h();
        this.f27334t.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n nVar = this.f27333s;
        if (nVar.b()) {
            Path path = nVar.f5670e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // K5.k
    public final void e(n0 n0Var) {
        g gVar = this.j;
        gVar.getClass();
        int iD = n0Var.d();
        if (gVar.f4295A != iD) {
            gVar.f4295A = iD;
            int i10 = (gVar.f4300c.getChildCount() <= 0 && gVar.f4321y) ? gVar.f4295A : 0;
            NavigationMenuView navigationMenuView = gVar.f4299b;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = gVar.f4299b;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, n0Var.a());
        O.b(gVar.f4300c, n0Var);
    }

    public final ColorStateList f(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListB = p186p0.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListB.getDefaultColor();
        int[] iArr = f27323x;
        return new ColorStateList(new int[][]{iArr, f27322w, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListB.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final InsetDrawable g(c0 c0Var, ColorStateList colorStateList) {
        TypedArray typedArray = c0Var.f8929b;
        S5.f fVar = new S5.f(i.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0), new S5.a(0)).a());
        fVar.k(colorStateList);
        return new InsetDrawable((Drawable) fVar, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public M5.k getBackHelper() {
        return this.f27334t;
    }

    public MenuItem getCheckedItem() {
        return this.j.f4303f.f4325b;
    }

    public int getDividerInsetEnd() {
        return this.j.f4317u;
    }

    public int getDividerInsetStart() {
        return this.j.f4316t;
    }

    public int getHeaderCount() {
        return this.j.f4300c.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.j.f4310n;
    }

    public int getItemHorizontalPadding() {
        return this.j.f4312p;
    }

    public int getItemIconPadding() {
        return this.j.f4314r;
    }

    public ColorStateList getItemIconTintList() {
        return this.j.f4309m;
    }

    public int getItemMaxLines() {
        return this.j.f4322z;
    }

    public ColorStateList getItemTextColor() {
        return this.j.f4308l;
    }

    public int getItemVerticalPadding() {
        return this.j.f4313q;
    }

    public Menu getMenu() {
        return this.f27324i;
    }

    public int getSubheaderInsetEnd() {
        return this.j.f4319w;
    }

    public int getSubheaderInsetStart() {
        return this.j.f4318v;
    }

    public final Pair<DrawerLayout, DrawerLayout.e> h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.e)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // K5.k, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A8.p.G(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            M5.f fVar = this.f27335u;
            if (fVar.f4573a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                a aVar = this.f27336v;
                if (aVar == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f17317u;
                    if (arrayList != null) {
                        arrayList.remove(aVar);
                    }
                }
                drawerLayout.a(aVar);
                if (DrawerLayout.o(this)) {
                    fVar.a(true);
                }
            }
        }
    }

    @Override // K5.k, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f27329o);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            a aVar = this.f27336v;
            if (aVar == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f17317u;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(aVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = this.f27326l;
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i12), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f4135b);
        Bundle bundle = cVar.f27338d;
        f fVar = this.f27324i;
        fVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = fVar.f8477u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.h(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f27338d = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f27324i.f8477u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelableL = jVar.l()) != null) {
                        sparseArray.put(id, parcelableL);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return cVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.e) && (i14 = this.f27332r) > 0 && (getBackground() instanceof S5.f)) {
            int i15 = ((DrawerLayout.e) getLayoutParams()).f17326a;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            boolean z10 = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) == 3;
            S5.f fVar = (S5.f) getBackground();
            i.a aVarE = fVar.f5566b.f5589a.e();
            float f10 = i14;
            aVarE.e(f10);
            aVarE.f(f10);
            aVarE.d(f10);
            aVarE.c(f10);
            if (z10) {
                aVarE.e(0.0f);
                aVarE.c(0.0f);
            } else {
                aVarE.f(0.0f);
                aVarE.d(0.0f);
            }
            i iVarA = aVarE.a();
            fVar.setShapeAppearanceModel(iVarA);
            n nVar = this.f27333s;
            nVar.f5668c = iVarA;
            nVar.c();
            nVar.a(this);
            nVar.f5669d = new RectF(0.0f, 0.0f, i10, i11);
            nVar.c();
            nVar.a(this);
            nVar.f5667b = true;
            nVar.a(this);
        }
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f27331q = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.f27324i.findItem(i10);
        if (menuItemFindItem != null) {
            this.j.f4303f.b((androidx.appcompat.view.menu.h) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i10) {
        g gVar = this.j;
        gVar.f4317u = i10;
        gVar.i();
    }

    public void setDividerInsetStart(int i10) {
        g gVar = this.j;
        gVar.f4316t = i10;
        gVar.i();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        A8.p.E(this, f10);
    }

    public void setForceCompatClippingEnabled(boolean z10) {
        n nVar = this.f27333s;
        if (z10 != nVar.f5666a) {
            nVar.f5666a = z10;
            nVar.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        g gVar = this.j;
        gVar.f4310n = drawable;
        gVar.i();
    }

    public void setItemBackgroundResource(int i10) {
        setItemBackground(p186p0.a.C0517a.b(getContext(), i10));
    }

    public void setItemHorizontalPadding(int i10) {
        g gVar = this.j;
        gVar.f4312p = i10;
        gVar.i();
    }

    public void setItemHorizontalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        g gVar = this.j;
        gVar.f4312p = dimensionPixelSize;
        gVar.i();
    }

    public void setItemIconPadding(int i10) {
        g gVar = this.j;
        gVar.f4314r = i10;
        gVar.i();
    }

    public void setItemIconPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        g gVar = this.j;
        gVar.f4314r = dimensionPixelSize;
        gVar.i();
    }

    public void setItemIconSize(int i10) {
        g gVar = this.j;
        if (gVar.f4315s != i10) {
            gVar.f4315s = i10;
            gVar.f4320x = true;
            gVar.i();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        g gVar = this.j;
        gVar.f4309m = colorStateList;
        gVar.i();
    }

    public void setItemMaxLines(int i10) {
        g gVar = this.j;
        gVar.f4322z = i10;
        gVar.i();
    }

    public void setItemTextAppearance(int i10) {
        g gVar = this.j;
        gVar.j = i10;
        gVar.i();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        g gVar = this.j;
        gVar.f4307k = z10;
        gVar.i();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        g gVar = this.j;
        gVar.f4308l = colorStateList;
        gVar.i();
    }

    public void setItemVerticalPadding(int i10) {
        g gVar = this.j;
        gVar.f4313q = i10;
        gVar.i();
    }

    public void setItemVerticalPaddingResource(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        g gVar = this.j;
        gVar.f4313q = dimensionPixelSize;
        gVar.i();
    }

    public void setNavigationItemSelectedListener(b bVar) {
        this.f27325k = bVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        g gVar = this.j;
        if (gVar != null) {
            gVar.f4297C = i10;
            NavigationMenuView navigationMenuView = gVar.f4299b;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i10);
            }
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        g gVar = this.j;
        gVar.f4319w = i10;
        gVar.i();
    }

    public void setSubheaderInsetStart(int i10) {
        g gVar = this.j;
        gVar.f4318v = i10;
        gVar.i();
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f27330p = z10;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f27324i.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.j.f4303f.b((androidx.appcompat.view.menu.h) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
