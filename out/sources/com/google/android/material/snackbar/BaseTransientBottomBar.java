package com.google.android.material.snackbar;

import A8.p;
import K5.o;
import K5.t;
import K5.x;
import M5.l;
import S5.i;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f27391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f27392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f27393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f27394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f27395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f27396i;
    public final SnackbarContentLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f27397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f27398l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f27405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f27407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f27408v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final X0.b f27385x = p216r5.a.f46342b;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final LinearInterpolator f27386y = p216r5.a.f46341a;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final X0.c f27387z = p216r5.a.f46344d;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f27384B = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Handler f27383A = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f27399m = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f27409w = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final f f27410k;

        public Behavior() {
            f fVar = new f();
            this.f26729h = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.f26730i = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f26727f = 0;
            this.f27410k = fVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            f fVar = this.f27410k;
            fVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    h.b().e(fVar.f27415a);
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                h.b().d(fVar.f27415a);
            }
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean w(View view) {
            this.f27410k.getClass();
            return view instanceof g;
        }
    }

    public class a implements Handler.Callback {
        /* JADX WARN: Code duplicated, block: B:22:0x0093  */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            int height = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i11 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.f27408v;
                if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
                    baseTransientBottomBar.d(i11);
                } else {
                    g gVar = baseTransientBottomBar.f27396i;
                    if (gVar.getVisibility() != 0) {
                        baseTransientBottomBar.d(i11);
                    } else if (gVar.getAnimationMode() == 1) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar.f27391d);
                        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                        valueAnimatorOfFloat.setDuration(baseTransientBottomBar.f27389b);
                        valueAnimatorOfFloat.addListener(new U5.a(baseTransientBottomBar, i11));
                        valueAnimatorOfFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height2 = gVar.getHeight();
                        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height2);
                        valueAnimator.setInterpolator(baseTransientBottomBar.f27392e);
                        valueAnimator.setDuration(baseTransientBottomBar.f27390c);
                        valueAnimator.addListener(new U5.c(baseTransientBottomBar, i11));
                        valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                        valueAnimator.start();
                    }
                }
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            g gVar2 = baseTransientBottomBar2.f27396i;
            if (gVar2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = gVar2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.f) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams2;
                    Behavior behavior = new Behavior();
                    f fVar2 = behavior.f27410k;
                    fVar2.getClass();
                    fVar2.f27415a = baseTransientBottomBar2.f27409w;
                    behavior.f26724c = new com.google.android.material.snackbar.f(baseTransientBottomBar2);
                    fVar.b(behavior);
                    if (baseTransientBottomBar2.c() == null) {
                        fVar.f16655g = 80;
                    }
                }
                gVar2.f27426l = true;
                ViewGroup viewGroup = baseTransientBottomBar2.f27394g;
                viewGroup.addView(gVar2);
                gVar2.f27426l = false;
                if (baseTransientBottomBar2.c() != null) {
                    int[] iArr = new int[2];
                    baseTransientBottomBar2.c().getLocationOnScreen(iArr);
                    int i12 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    height = (viewGroup.getHeight() + iArr2[1]) - i12;
                }
                baseTransientBottomBar2.f27403q = height;
                baseTransientBottomBar2.g();
                gVar2.setVisibility(4);
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (gVar2.isLaidOut()) {
                baseTransientBottomBar2.f();
            } else {
                baseTransientBottomBar2.f27406t = true;
            }
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f27396i == null || (context = baseTransientBottomBar.f27395h) == null) {
                return;
            }
            int iHeight = x.a(context).height();
            int[] iArr = new int[2];
            g gVar = baseTransientBottomBar.f27396i;
            gVar.getLocationInWindow(iArr);
            int height = (iHeight - (gVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f27396i.getTranslationY());
            int i10 = baseTransientBottomBar.f27404r;
            if (height >= i10) {
                baseTransientBottomBar.f27405s = i10;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f27396i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                X0.b bVar = BaseTransientBottomBar.f27385x;
                return;
            }
            int i11 = baseTransientBottomBar.f27404r;
            baseTransientBottomBar.f27405s = i11;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i11 - height) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.f27396i.requestLayout();
        }
    }

    public class c implements h.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.h.b
        public final void a() {
            Handler handler = BaseTransientBottomBar.f27383A;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.h.b
        public final void b(int i10) {
            Handler handler = BaseTransientBottomBar.f27383A;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    public static class d implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<BaseTransientBottomBar> f27413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakReference<View> f27414c;

        public d(Snackbar snackbar, Button button) {
            this.f27413b = new WeakReference<>(snackbar);
            this.f27414c = new WeakReference<>(button);
        }

        public final void a() {
            WeakReference<View> weakReference = this.f27414c;
            if (weakReference.get() != null) {
                weakReference.get().removeOnAttachStateChangeListener(this);
                View view = weakReference.get();
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            weakReference.clear();
            this.f27413b.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            WeakReference<BaseTransientBottomBar> weakReference = this.f27413b;
            if (weakReference.get() == null) {
                a();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar = weakReference.get();
            X0.b bVar = BaseTransientBottomBar.f27385x;
            baseTransientBottomBar.getClass();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            if (this.f27413b.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (this.f27413b.get() == null) {
                a();
            } else if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f27415a;
    }

    public static class g extends FrameLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f27416m = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BaseTransientBottomBar<?> f27417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f27418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f27420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f27421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f27423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ColorStateList f27424i;
        public PorterDuff.Mode j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f27425k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f27426l;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public g(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(Z5.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p204q5.a.f46102F);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                O.d.s(this, dimensionPixelSize);
            }
            this.f27419d = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f27418c = i.b(context2, attributeSet, 0, 0).a();
            }
            this.f27420e = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(P5.c.a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(t.c(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f27421f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f27422g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f27423h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f27416m);
            setFocusable(true);
            if (getBackground() == null) {
                int iB = p.B(getBackgroundOverlayColorAlpha(), p.w(R.attr.colorSurface, this), p.w(R.attr.colorOnSurface, this));
                i iVar = this.f27418c;
                if (iVar != null) {
                    X0.b bVar = BaseTransientBottomBar.f27385x;
                    S5.f fVar = new S5.f(iVar);
                    fVar.k(ColorStateList.valueOf(iB));
                    drawable = fVar;
                } else {
                    Resources resources = getResources();
                    X0.b bVar2 = BaseTransientBottomBar.f27385x;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iB);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.f27424i;
                if (colorStateList != null) {
                    p234t0.a.C0532a.h(drawable, colorStateList);
                }
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                setBackground(drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f27417b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f27421f;
        }

        public int getAnimationMode() {
            return this.f27419d;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f27420e;
        }

        public int getMaxInlineActionWidth() {
            return this.f27423h;
        }

        public int getMaxWidth() {
            return this.f27422g;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f27417b;
            if (baseTransientBottomBar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = baseTransientBottomBar.f27396i.getRootWindowInsets()) != null) {
                baseTransientBottomBar.f27404r = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                baseTransientBottomBar.g();
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.c.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z10;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f27417b;
            if (baseTransientBottomBar != null) {
                h hVarB = h.b();
                c cVar = baseTransientBottomBar.f27409w;
                synchronized (hVarB.f27442a) {
                    z10 = true;
                    if (!hVarB.c(cVar)) {
                        h.c cVar2 = hVarB.f27445d;
                        if (!(cVar2 != null && cVar2.f27447a.get() == cVar)) {
                            z10 = false;
                        }
                    }
                }
                if (z10) {
                    BaseTransientBottomBar.f27383A.post(new com.google.android.material.snackbar.e(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f27417b;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f27406t) {
                return;
            }
            baseTransientBottomBar.f();
            baseTransientBottomBar.f27406t = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.f27422g;
            if (i12 <= 0 || getMeasuredWidth() <= i12) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }

        public void setAnimationMode(int i10) {
            this.f27419d = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f27424i != null) {
                drawable = drawable.mutate();
                p234t0.a.C0532a.h(drawable, this.f27424i);
                p234t0.a.C0532a.i(drawable, this.j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f27424i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                p234t0.a.C0532a.h(drawableMutate, colorStateList);
                p234t0.a.C0532a.i(drawableMutate, this.j);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.j = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                p234t0.a.C0532a.i(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f27426l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f27425k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f27417b;
            if (baseTransientBottomBar != null) {
                X0.b bVar = BaseTransientBottomBar.f27385x;
                baseTransientBottomBar.g();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f27416m);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i10 = 0;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f27394g = viewGroup;
        this.j = snackbarContentLayout2;
        this.f27395h = context;
        o.c(context, o.f4356a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f27384B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        g gVar = (g) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f27396i = gVar;
        gVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = gVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f27431c.setTextColor(p.B(actionTextColorAlpha, p.w(R.attr.colorSurface, snackbarContentLayout), snackbarContentLayout.f27431c.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(gVar.getMaxInlineActionWidth());
        gVar.addView(snackbarContentLayout);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        gVar.setAccessibilityLiveRegion(1);
        gVar.setImportantForAccessibility(1);
        gVar.setFitsSystemWindows(true);
        O.d.u(gVar, new U5.d(this));
        O.n(gVar, new U5.e(i10, this));
        this.f27408v = (AccessibilityManager) context.getSystemService("accessibility");
        this.f27390c = l.c(context, R.attr.motionDurationLong2, androidx.recyclerview.widget.t.d.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f27388a = l.c(context, R.attr.motionDurationLong2, 150);
        this.f27389b = l.c(context, R.attr.motionDurationMedium1, 75);
        this.f27391d = l.d(context, R.attr.motionEasingEmphasizedInterpolator, f27386y);
        this.f27393f = l.d(context, R.attr.motionEasingEmphasizedInterpolator, f27387z);
        this.f27392e = l.d(context, R.attr.motionEasingEmphasizedInterpolator, f27385x);
    }

    public void a() {
        b(3);
    }

    public final void b(int i10) {
        h hVarB = h.b();
        c cVar = this.f27409w;
        synchronized (hVarB.f27442a) {
            try {
                if (hVarB.c(cVar)) {
                    hVarB.a(hVarB.f27444c, i10);
                } else {
                    h.c cVar2 = hVarB.f27445d;
                    if (cVar2 != null && cVar2.f27447a.get() == cVar) {
                        hVarB.a(hVarB.f27445d, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final View c() {
        d dVar = this.f27398l;
        if (dVar == null) {
            return null;
        }
        return dVar.f27414c.get();
    }

    public final void d(int i10) {
        h hVarB = h.b();
        c cVar = this.f27409w;
        synchronized (hVarB.f27442a) {
            try {
                if (hVarB.c(cVar)) {
                    hVarB.f27444c = null;
                    h.c cVar2 = hVarB.f27445d;
                    if (cVar2 != null && cVar2 != null) {
                        hVarB.f27444c = cVar2;
                        hVarB.f27445d = null;
                        h.b bVar = cVar2.f27447a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            hVarB.f27444c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f27407u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e) this.f27407u.get(size)).a(this, i10);
            }
        }
        ViewParent parent = this.f27396i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f27396i);
        }
    }

    public final void e() {
        h hVarB = h.b();
        c cVar = this.f27409w;
        synchronized (hVarB.f27442a) {
            try {
                if (hVarB.c(cVar)) {
                    hVarB.f(hVarB.f27444c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.f27407u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e) this.f27407u.get(size)).b(this);
            }
        }
    }

    public final void f() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f27408v;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        g gVar = this.f27396i;
        if (z10) {
            gVar.post(new com.google.android.material.snackbar.g(this));
            return;
        }
        if (gVar.getParent() != null) {
            gVar.setVisibility(0);
        }
        e();
    }

    public final void g() {
        g gVar = this.f27396i;
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || gVar.f27425k == null || gVar.getParent() == null) {
            return;
        }
        int i10 = c() != null ? this.f27403q : this.f27400n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = gVar.f27425k;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f27401o;
        int i13 = rect.right + this.f27402p;
        int i14 = rect.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            gVar.requestLayout();
        }
        if ((z10 || this.f27405s != this.f27404r) && Build.VERSION.SDK_INT >= 29 && this.f27404r > 0) {
            ViewGroup.LayoutParams layoutParams2 = gVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).f16649a instanceof SwipeDismissBehavior)) {
                b bVar = this.f27399m;
                gVar.removeCallbacks(bVar);
                gVar.post(bVar);
            }
        }
    }

    public static abstract class e<B> {
        public void b(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public void a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        }
    }
}
