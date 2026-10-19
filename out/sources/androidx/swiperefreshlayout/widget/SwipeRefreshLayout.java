package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.C1305u;
import androidx.core.view.C1308x;
import androidx.core.view.InterfaceC1304t;
import androidx.core.view.InterfaceC1306v;
import androidx.core.view.InterfaceC1307w;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1307w, InterfaceC1306v, InterfaceC1304t {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int[] f20170L = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B2.d f20171A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public B2.e f20172B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B2.f f20173C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public B2.g f20174D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B2.g f20175E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f20176F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f20177G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f20178H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final a f20179I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final c f20180J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final d f20181K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f20182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f20183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f20186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1308x f20188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1305u f20189i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f20190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f20191l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20192m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20193n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20194o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f20195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f20196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecelerateInterpolator f20199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B2.a f20200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f20203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f20204y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20205z;

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int iAbs = swipeRefreshLayout.f20204y - Math.abs(swipeRefreshLayout.f20203x);
            int i10 = swipeRefreshLayout.f20202w;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout.f20200u.getTop());
            B2.d dVar = swipeRefreshLayout.f20171A;
            float f11 = 1.0f - f10;
            B2.d.a aVar = dVar.f1466b;
            if (f11 != aVar.f1486p) {
                aVar.f1486p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.e(f10);
        }
    }

    public interface e {
    }

    public interface f {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20184d = false;
        this.f20186f = -1.0f;
        this.j = new int[2];
        this.f20190k = new int[2];
        this.f20191l = new int[2];
        this.f20198s = -1;
        this.f20201v = -1;
        this.f20179I = new a();
        this.f20180J = new c();
        this.f20181K = new d();
        this.f20185e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f20193n = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f20199t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f20177G = (int) (displayMetrics.density * 40.0f);
        B2.a aVar = new B2.a(getContext());
        float f10 = aVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = aVar.getContext().obtainStyledAttributes(A2.a.f573a);
        aVar.f1459c = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.s(aVar, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(aVar.f1459c);
        aVar.setBackground(shapeDrawable);
        this.f20200u = aVar;
        B2.d dVar = new B2.d(getContext());
        this.f20171A = dVar;
        dVar.c(1);
        this.f20200u.setImageDrawable(this.f20171A);
        this.f20200u.setVisibility(8);
        addView(this.f20200u);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f20204y = i10;
        this.f20186f = i10;
        this.f20188h = new C1308x();
        this.f20189i = new C1305u(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f20177G;
        this.f20194o = i11;
        this.f20203x = i11;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f20170L);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f20200u.getBackground().setAlpha(i10);
        this.f20171A.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f20182b;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f20182b == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f20200u)) {
                    this.f20182b = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f20186f) {
            g(true, true);
            return;
        }
        this.f20184d = false;
        B2.d dVar = this.f20171A;
        B2.d.a aVar = dVar.f1466b;
        aVar.f1476e = 0.0f;
        aVar.f1477f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b();
        this.f20202w = this.f20194o;
        d dVar2 = this.f20181K;
        dVar2.reset();
        dVar2.setDuration(200L);
        dVar2.setInterpolator(this.f20199t);
        B2.a aVar2 = this.f20200u;
        aVar2.f1458b = bVar;
        aVar2.clearAnimation();
        this.f20200u.startAnimation(dVar2);
        B2.d dVar3 = this.f20171A;
        B2.d.a aVar3 = dVar3.f1466b;
        if (aVar3.f1484n) {
            aVar3.f1484n = false;
        }
        dVar3.invalidateSelf();
    }

    public final void d(float f10) {
        B2.g gVar;
        B2.g gVar2;
        B2.d dVar = this.f20171A;
        B2.d.a aVar = dVar.f1466b;
        if (!aVar.f1484n) {
            aVar.f1484n = true;
        }
        dVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f20186f));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f20186f;
        int i10 = this.f20205z;
        if (i10 <= 0) {
            i10 = this.f20204y;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f20203x + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f20200u.getVisibility() != 0) {
            this.f20200u.setVisibility(0);
        }
        this.f20200u.setScaleX(1.0f);
        this.f20200u.setScaleY(1.0f);
        if (f10 < this.f20186f) {
            if (this.f20171A.f1466b.f1490t > 76 && ((gVar2 = this.f20174D) == null || !gVar2.hasStarted() || gVar2.hasEnded())) {
                B2.g gVar3 = new B2.g(this, this.f20171A.f1466b.f1490t, 76);
                gVar3.setDuration(300L);
                B2.a aVar2 = this.f20200u;
                aVar2.f1458b = null;
                aVar2.clearAnimation();
                this.f20200u.startAnimation(gVar3);
                this.f20174D = gVar3;
            }
        } else if (this.f20171A.f1466b.f1490t < 255 && ((gVar = this.f20175E) == null || !gVar.hasStarted() || gVar.hasEnded())) {
            B2.g gVar4 = new B2.g(this, this.f20171A.f1466b.f1490t, 255);
            gVar4.setDuration(300L);
            B2.a aVar3 = this.f20200u;
            aVar3.f1458b = null;
            aVar3.clearAnimation();
            this.f20200u.startAnimation(gVar4);
            this.f20175E = gVar4;
        }
        B2.d dVar2 = this.f20171A;
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        B2.d.a aVar4 = dVar2.f1466b;
        aVar4.f1476e = 0.0f;
        aVar4.f1477f = fMin2;
        dVar2.invalidateSelf();
        B2.d dVar3 = this.f20171A;
        float fMin3 = Math.min(1.0f, fMax);
        B2.d.a aVar5 = dVar3.f1466b;
        if (fMin3 != aVar5.f1486p) {
            aVar5.f1486p = fMin3;
        }
        dVar3.invalidateSelf();
        B2.d dVar4 = this.f20171A;
        dVar4.f1466b.f1478g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f20194o);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f20189i.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f20189i.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f20189i.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f20189i.d(i10, i11, i12, i13, iArr, 0, null);
    }

    public final void e(float f10) {
        int i10 = this.f20202w;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f20203x - i10) * f10))) - this.f20200u.getTop());
    }

    public final void f() {
        this.f20200u.clearAnimation();
        this.f20171A.stop();
        this.f20200u.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f20203x - this.f20194o);
        this.f20194o = this.f20200u.getTop();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f20184d != z10) {
            this.f20176F = z11;
            b();
            this.f20184d = z10;
            a aVar = this.f20179I;
            if (!z10) {
                B2.f fVar = new B2.f(this);
                this.f20173C = fVar;
                fVar.setDuration(150L);
                B2.a aVar2 = this.f20200u;
                aVar2.f1458b = aVar;
                aVar2.clearAnimation();
                this.f20200u.startAnimation(this.f20173C);
                return;
            }
            this.f20202w = this.f20194o;
            c cVar = this.f20180J;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.f20199t);
            if (aVar != null) {
                this.f20200u.f1458b = aVar;
            }
            this.f20200u.clearAnimation();
            this.f20200u.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f20201v;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1308x c1308x = this.f20188h;
        return c1308x.f16998b | c1308x.f16997a;
    }

    public int getProgressCircleDiameter() {
        return this.f20177G;
    }

    public int getProgressViewEndOffset() {
        return this.f20204y;
    }

    public int getProgressViewStartOffset() {
        return this.f20203x;
    }

    public final void h(float f10) {
        float f11 = this.f20196q;
        float f12 = f10 - f11;
        float f13 = this.f20185e;
        if (f12 <= f13 || this.f20197r) {
            return;
        }
        this.f20195p = f11 + f13;
        this.f20197r = true;
        this.f20171A.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f20189i.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f20189i.f16991d;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        if (i14 == 0) {
            this.f20189i.d(i10, i11, i12, i13, this.f20190k, i14, iArr);
        }
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f20190k[1] : i16;
        if (i17 >= 0 || a()) {
            return;
        }
        float fAbs = this.f20187g + Math.abs(i17);
        this.f20187g = fAbs;
        d(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        k(view, i10, i11, i12, i13, i14, this.f20191l);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f20184d || this.f20192m) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f20203x - this.f20200u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f20198s = pointerId;
            this.f20197r = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f20196q = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f20197r = false;
            this.f20198s = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f20198s;
            if (i10 == -1) {
                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            h(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f20197r = false;
            this.f20198s = -1;
        } else if (actionMasked == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f20198s) {
                this.f20198s = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
            }
        }
        return this.f20197r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f20182b == null) {
            b();
        }
        View view = this.f20182b;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f20200u.getMeasuredWidth();
        int measuredHeight2 = this.f20200u.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f20194o;
        this.f20200u.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f20182b == null) {
            b();
        }
        View view = this.f20182b;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f20200u.measure(View.MeasureSpec.makeMeasureSpec(this.f20177G, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20177G, 1073741824));
        this.f20201v = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f20200u) {
                this.f20201v = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return this.f20189i.a(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f20189i.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f20187g;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f20187g = 0.0f;
                } else {
                    this.f20187g = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f20187g);
            }
        }
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int[] iArr2 = this.j;
        if (dispatchNestedPreScroll(i12, i13, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0, this.f20191l);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f20188h.f16997a = i10;
        startNestedScroll(i10 & 2);
        this.f20187g = 0.0f;
        this.f20192m = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setRefreshing(gVar.f20210b);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new g(super.onSaveInstanceState(), this.f20184d);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f20184d || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f20188h.f16997a = 0;
        this.f20192m = false;
        float f10 = this.f20187g;
        if (f10 > 0.0f) {
            c(f10);
            this.f20187g = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f20184d || this.f20192m) {
            return false;
        }
        if (actionMasked == 0) {
            this.f20198s = motionEvent.getPointerId(0);
            this.f20197r = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f20198s);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f20197r) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f20195p) * 0.5f;
                    this.f20197r = false;
                    c(y10);
                }
                this.f20198s = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f20198s);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                h(y11);
                if (this.f20197r) {
                    float f10 = (y11 - this.f20195p) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    d(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f20198s = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f20198s) {
                        this.f20198s = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f20182b;
        if (view != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (!O.d.p(view)) {
                if (this.f20178H || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z10);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.f20200u.setScaleX(f10);
        this.f20200u.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        B2.d dVar = this.f20171A;
        B2.d.a aVar = dVar.f1466b;
        aVar.f1480i = iArr;
        aVar.a(0);
        aVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = p0.a.b.a(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f20186f = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f20178H = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1305u c1305u = this.f20189i;
        if (c1305u.f16991d) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.d.z(c1305u.f16990c);
        }
        c1305u.f16991d = z10;
    }

    public void setOnRefreshListener(f fVar) {
        this.f20183c = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f20200u.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(p0.a.b.a(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f20184d == z10) {
            g(z10, false);
            return;
        }
        this.f20184d = z10;
        setTargetOffsetTopAndBottom((this.f20204y + this.f20203x) - this.f20194o);
        this.f20176F = false;
        a aVar = this.f20179I;
        this.f20200u.setVisibility(0);
        this.f20171A.setAlpha(255);
        B2.e eVar = new B2.e(this);
        this.f20172B = eVar;
        eVar.setDuration(this.f20193n);
        if (aVar != null) {
            this.f20200u.f1458b = aVar;
        }
        this.f20200u.clearAnimation();
        this.f20200u.startAnimation(this.f20172B);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f20177G = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f20177G = (int) (displayMetrics.density * 40.0f);
            }
            this.f20200u.setImageDrawable(null);
            this.f20171A.c(i10);
            this.f20200u.setImageDrawable(this.f20171A);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f20205z = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        B2.a aVar = this.f20200u;
        aVar.bringToFront();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        aVar.offsetTopAndBottom(i10);
        this.f20194o = aVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f20189i.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f20189i.h(0);
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20210b;

        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f20210b = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f20210b ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f20210b = parcel.readByte() != 0;
        }
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f20184d) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.f20171A.setAlpha(255);
            swipeRefreshLayout.f20171A.start();
            if (swipeRefreshLayout.f20176F && (fVar = swipeRefreshLayout.f20183c) != null) {
                fVar.onRefresh();
            }
            swipeRefreshLayout.f20194o = swipeRefreshLayout.f20200u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            B2.f fVar = new B2.f(swipeRefreshLayout);
            swipeRefreshLayout.f20173C = fVar;
            fVar.setDuration(150L);
            B2.a aVar = swipeRefreshLayout.f20200u;
            aVar.f1458b = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f20200u.startAnimation(swipeRefreshLayout.f20173C);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }
}
