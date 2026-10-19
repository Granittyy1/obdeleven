package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.C1308x;
import androidx.core.view.InterfaceC1306v;
import androidx.core.view.InterfaceC1307w;
import androidx.core.view.n0;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements B, InterfaceC1306v, InterfaceC1307w {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f8570D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final n0 f8571E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Rect f8572F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final c f8573A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1308x f8574B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final f f8575C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f8578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f8579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C f8580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f8581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8583i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f8587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f8588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f8589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f8590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n0 f8591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n0 f8592s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n0 f8593t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n0 f8594u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f8595v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OverScroller f8596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f8597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f8598y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f8599z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8597x = null;
            actionBarOverlayLayout.f8584k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f8597x = null;
            actionBarOverlayLayout.f8584k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f8597x = actionBarOverlayLayout.f8579e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f8598y);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f8597x = actionBarOverlayLayout.f8579e.animate().translationY(-actionBarOverlayLayout.f8579e.getHeight()).setListener(actionBarOverlayLayout.f8598y);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        n0.e cVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            cVar = new n0.d();
        } else {
            cVar = i10 >= 29 ? new n0.c() : new n0.b();
        }
        cVar.g(p222s0.b.b(0, 1, 0, 1));
        f8571E = cVar.b();
        f8572F = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8577c = 0;
        this.f8587n = new Rect();
        this.f8588o = new Rect();
        this.f8589p = new Rect();
        this.f8590q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        n0 n0Var = n0.f16947b;
        this.f8591r = n0Var;
        this.f8592s = n0Var;
        this.f8593t = n0Var;
        this.f8594u = n0Var;
        this.f8598y = new a();
        this.f8599z = new b();
        this.f8573A = new c();
        r(context);
        this.f8574B = new C1308x();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.f8575C = fVar;
        addView(fVar);
    }

    public static boolean p(View view, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.B
    public final boolean a() {
        s();
        return this.f8580f.a();
    }

    @Override // androidx.appcompat.widget.B
    public final void b() {
        s();
        this.f8580f.b();
    }

    @Override // androidx.appcompat.widget.B
    public final boolean c() {
        s();
        return this.f8580f.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.B
    public final void d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.j.a aVar) {
        s();
        this.f8580f.d(fVar, aVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f8581g != null) {
            if (this.f8579e.getVisibility() == 0) {
                translationY = (int) (this.f8579e.getTranslationY() + this.f8579e.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f8581g.setBounds(0, translationY, getWidth(), this.f8581g.getIntrinsicHeight() + translationY);
            this.f8581g.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.B
    public final boolean e() {
        s();
        return this.f8580f.e();
    }

    @Override // androidx.appcompat.widget.B
    public final boolean f() {
        s();
        return this.f8580f.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.B
    public final boolean g() {
        s();
        return this.f8580f.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8579e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1308x c1308x = this.f8574B;
        return c1308x.f16998b | c1308x.f16997a;
    }

    public CharSequence getTitle() {
        s();
        return this.f8580f.getTitle();
    }

    @Override // androidx.appcompat.widget.B
    public final void h(int i10) {
        s();
        if (i10 == 2) {
            this.f8580f.getClass();
        } else if (i10 == 5) {
            this.f8580f.getClass();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.B
    public final void i() {
        s();
        this.f8580f.h();
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        l(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        n0 n0VarH = n0.h(this, windowInsets);
        boolean zP = p(this.f8579e, new Rect(n0VarH.b(), n0VarH.d(), n0VarH.c(), n0VarH.a()), false);
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        Rect rect = this.f8587n;
        androidx.core.view.O.d.b(this, n0VarH, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        n0.k kVar = n0VarH.f16948a;
        n0 n0VarN = kVar.n(i10, i11, i12, i13);
        this.f8591r = n0VarN;
        boolean z10 = true;
        if (!this.f8592s.equals(n0VarN)) {
            this.f8592s = this.f8591r;
            zP = true;
        }
        Rect rect2 = this.f8588o;
        if (rect2.equals(rect)) {
            z10 = zP;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f16948a.c().f16948a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        androidx.core.view.O.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        n0 n0Var;
        int i12;
        n0.e bVar;
        s();
        measureChildWithMargins(this.f8579e, i10, 0, i11, 0);
        e eVar = (e) this.f8579e.getLayoutParams();
        int iMax = Math.max(0, this.f8579e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f8579e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f8579e.getMeasuredState());
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        boolean z10 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z10) {
            measuredHeight = this.f8576b;
            if (this.f8583i && this.f8579e.getTabContainer() != null) {
                measuredHeight += this.f8576b;
            }
        } else {
            measuredHeight = this.f8579e.getVisibility() != 8 ? this.f8579e.getMeasuredHeight() : 0;
        }
        Rect rect = this.f8587n;
        Rect rect2 = this.f8589p;
        rect2.set(rect);
        this.f8593t = this.f8591r;
        if (this.f8582h || z10) {
            p222s0.b bVarB = p222s0.b.b(this.f8593t.b(), this.f8593t.d() + measuredHeight, this.f8593t.c(), this.f8593t.a());
            n0Var = this.f8593t;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                bVar = new n0.d(n0Var);
            } else if (i12 >= 29) {
                bVar = new n0.c(n0Var);
            } else {
                bVar = new n0.b(n0Var);
            }
            bVar.g(bVarB);
            this.f8593t = bVar.b();
        } else {
            f fVar = this.f8575C;
            n0 n0Var2 = f8571E;
            Rect rect3 = this.f8590q;
            androidx.core.view.O.d.b(fVar, n0Var2, rect3);
            if (rect3.equals(f8572F)) {
                p222s0.b bVarB2 = p222s0.b.b(this.f8593t.b(), this.f8593t.d() + measuredHeight, this.f8593t.c(), this.f8593t.a());
                n0Var = this.f8593t;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    bVar = new n0.d(n0Var);
                } else if (i12 >= 29) {
                    bVar = new n0.c(n0Var);
                } else {
                    bVar = new n0.b(n0Var);
                }
                bVar.g(bVarB2);
                this.f8593t = bVar.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f8593t = this.f8593t.f16948a.n(0, measuredHeight, 0, 0);
            }
        }
        p(this.f8578d, rect2, true);
        if (!this.f8594u.equals(this.f8593t)) {
            n0 n0Var3 = this.f8593t;
            this.f8594u = n0Var3;
            androidx.core.view.O.b(this.f8578d, n0Var3);
        }
        measureChildWithMargins(this.f8578d, i10, 0, i11, 0);
        e eVar2 = (e) this.f8578d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f8578d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f8578d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f8578d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.j || !z10) {
            return false;
        }
        this.f8596w.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, BrazeLogger.SUPPRESS);
        if (this.f8596w.getFinalY() > this.f8579e.getHeight()) {
            q();
            this.f8573A.run();
        } else {
            q();
            this.f8599z.run();
        }
        this.f8584k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f8585l + i11;
        this.f8585l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        p100i.t tVar;
        p138l.g gVar;
        this.f8574B.f16997a = i10;
        this.f8585l = getActionBarHideOffset();
        q();
        d dVar = this.f8595v;
        if (dVar == null || (gVar = (tVar = (p100i.t) dVar).f36447s) == null) {
            return;
        }
        gVar.a();
        tVar.f36447s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f8579e.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.j || this.f8584k) {
            return;
        }
        if (this.f8585l <= this.f8579e.getHeight()) {
            q();
            postDelayed(this.f8599z, 600L);
        } else {
            q();
            postDelayed(this.f8573A, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f8586m ^ i10;
        this.f8586m = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f8595v;
        if (dVar != null) {
            p100i.t tVar = (p100i.t) dVar;
            tVar.f36443o = !z11;
            if (z10 || !z11) {
                if (tVar.f36444p) {
                    tVar.f36444p = false;
                    tVar.z(true);
                }
            } else if (!tVar.f36444p) {
                tVar.f36444p = true;
                tVar.z(true);
            }
        }
        if ((i11 & 256) == 0 || this.f8595v == null) {
            return;
        }
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        androidx.core.view.O.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f8577c = i10;
        d dVar = this.f8595v;
        if (dVar != null) {
            ((p100i.t) dVar).f36442n = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.f8599z);
        removeCallbacks(this.f8573A);
        ViewPropertyAnimator viewPropertyAnimator = this.f8597x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8570D);
        this.f8576b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f8581g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f8596w = new OverScroller(context);
    }

    public final void s() {
        C wrapper;
        if (this.f8578d == null) {
            this.f8578d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f8579e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof C) {
                wrapper = (C) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f8580f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f8579e.setTranslationY(-Math.max(0, Math.min(i10, this.f8579e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f8595v = dVar;
        if (getWindowToken() != null) {
            ((p100i.t) this.f8595v).f36442n = this.f8577c;
            int i10 = this.f8586m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                androidx.core.view.O.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f8583i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.j) {
            this.j = z10;
            if (z10) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        s();
        this.f8580f.setIcon(i10);
    }

    public void setLogo(int i10) {
        s();
        this.f8580f.l(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f8582h = z10;
    }

    @Override // androidx.appcompat.widget.B
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f8580f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.B
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f8580f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f8580f.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
    }
}
