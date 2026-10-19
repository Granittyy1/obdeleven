package androidx.viewpager.widget;

import B0.s;
import Z3.n;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int[] f20215p0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f20216q0 = new a();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Interpolator f20217r0 = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f20218A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f20219B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f20220C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f20221D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f20222E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f20223F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f20224G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f20225H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public VelocityTracker f20226I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f20227J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f20228K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f20229L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f20230M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final EdgeEffect f20231N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final EdgeEffect f20232O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f20233P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f20234Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f20235R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f20236S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public i f20237T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ArrayList f20238U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final c f20239V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f20240W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f20242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f20243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f20244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H2.a f20245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f20248i;
    public ClassLoader j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scroller f20249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f20251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f20253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f20257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20264z;

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f20267b - eVar2.f20267b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.p();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f20270e;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20274d;

        public f() {
            super(-1, -1);
            this.f20273c = 0.0f;
        }
    }

    public class g extends C1286a {
        public g() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            H2.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            H2.a aVar2 = viewPager.f20245f;
            if (aVar2 != null) {
                z10 = aVar2.getCount() > 1;
            }
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() != 4096 || (aVar = viewPager.f20245f) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(viewPager.f20246g);
            accessibilityEvent.setToIndex(viewPager.f20246g);
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            sVar.i(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            H2.a aVar = viewPager.f20245f;
            sVar.n(aVar != null && aVar.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                sVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                sVar.a(8192);
            }
        }

        @Override // androidx.core.view.C1286a
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i10 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f20246g + 1);
                return true;
            }
            if (i10 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f20246g - 1);
            return true;
        }
    }

    public interface h {
        void a(ViewPager viewPager, H2.a aVar);
    }

    public interface i {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.e();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    public static class k extends K0.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f20277d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Parcelable f20278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ClassLoader f20279f;

        public static class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new k[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f20277d = parcel.readInt();
            this.f20278e = parcel.readParcelable(classLoader);
            this.f20279f = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return q.c(sb2, this.f20277d, "}");
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20277d);
            parcel.writeParcelable(this.f20278e, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20242c = new ArrayList<>();
        this.f20243d = new e();
        this.f20244e = new Rect();
        this.f20247h = -1;
        this.f20248i = null;
        this.j = null;
        this.f20256r = -3.4028235E38f;
        this.f20257s = Float.MAX_VALUE;
        this.f20262x = 1;
        this.f20225H = -1;
        this.f20233P = true;
        this.f20239V = new c();
        this.f20240W = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f20249k = new Scroller(context2, f20217r0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f20220C = viewConfiguration.getScaledPagingTouchSlop();
        this.f20227J = (int) (400.0f * f10);
        this.f20228K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f20231N = new EdgeEffect(context2);
        this.f20232O = new EdgeEffect(context2);
        this.f20229L = (int) (25.0f * f10);
        this.f20230M = (int) (2.0f * f10);
        this.f20218A = (int) (f10 * 16.0f);
        O.n(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        H2.b bVar = new H2.b();
        bVar.f3627c = this;
        bVar.f3626b = new Rect();
        O.d.u(this, bVar);
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f20260v != z10) {
            this.f20260v = z10;
        }
    }

    public final e a(int i10, int i11) {
        e eVar = new e();
        eVar.f20267b = i10;
        eVar.f20266a = this.f20245f.instantiateItem((ViewGroup) this, i10);
        eVar.f20269d = this.f20245f.getPageWidth(i10);
        ArrayList<e> arrayList = this.f20242c;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i11, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e eVarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (eVarH = h(childAt)) != null && eVarH.f20267b == this.f20246g) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e eVarH;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (eVarH = h(childAt)) != null && eVarH.f20267b == this.f20246g) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new f();
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f20271a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f20271a = z10;
        if (!this.f20259u) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f20274d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final boolean b(int i10) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        boolean zM = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f20244e;
            if (i10 == 17) {
                int i11 = g(rect, viewFindNextFocus).left;
                int i12 = g(rect, viewFindFocus).left;
                if (viewFindFocus == null || i11 < i12) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                    zM = zRequestFocus;
                } else {
                    int i13 = this.f20246g;
                    if (i13 > 0) {
                        u(i13 - 1, true);
                        zM = true;
                    }
                }
            } else if (i10 == 66) {
                zRequestFocus = (viewFindFocus == null || g(rect, viewFindNextFocus).left > g(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : m();
                zM = zRequestFocus;
            }
        } else if (i10 == 17 || i10 == 1) {
            int i14 = this.f20246g;
            if (i14 > 0) {
                u(i14 - 1, true);
                zM = true;
            }
        } else if (i10 == 66 || i10 == 2) {
            zM = m();
        }
        if (zM) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zM;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f20245f == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f20256r));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f20257s));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f20250l = true;
        if (this.f20249k.isFinished() || !this.f20249k.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f20249k.getCurrX();
        int currY = this.f20249k.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!n(currX)) {
                this.f20249k.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z10) {
        boolean z11 = this.f20240W == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f20249k.isFinished()) {
                this.f20249k.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f20249k.getCurrX();
                int currY = this.f20249k.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f20261w = false;
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f20242c;
            if (i10 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i10);
            if (eVar.f20268c) {
                eVar.f20268c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            c cVar = this.f20239V;
            if (!z10) {
                cVar.run();
            } else {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                postOnAnimation(cVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zB;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            zB = false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode == 22) {
                    zB = keyEvent.hasModifiers(2) ? m() : b(66);
                } else if (keyCode != 61) {
                    zB = false;
                } else if (keyEvent.hasNoModifiers()) {
                    zB = b(2);
                } else if (keyEvent.hasModifiers(1)) {
                    zB = b(1);
                } else {
                    zB = false;
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i10 = this.f20246g;
                if (i10 > 0) {
                    u(i10 - 1, true);
                    zB = true;
                } else {
                    zB = false;
                }
            } else {
                zB = b(17);
            }
        }
        return zB;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e eVarH;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (eVarH = h(childAt)) != null && eVarH.f20267b == this.f20246g && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        H2.a aVar;
        EdgeEffect edgeEffect = this.f20232O;
        EdgeEffect edgeEffect2 = this.f20231N;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f20245f) != null && aVar.getCount() > 1)) {
            if (!edgeEffect2.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f20256r * width);
                edgeEffect2.setSize(height, width);
                zDraw = edgeEffect2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!edgeEffect.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f20257s + 1.0f)) * width2);
                edgeEffect.setSize(height2, width2);
                zDraw |= edgeEffect.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            edgeEffect2.finish();
            edgeEffect.finish();
        }
        if (zDraw) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f20253o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int count = this.f20245f.getCount();
        this.f20241b = count;
        ArrayList<e> arrayList = this.f20242c;
        boolean z10 = arrayList.size() < (this.f20262x * 2) + 1 && arrayList.size() < count;
        int iMax = this.f20246g;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            e eVar = arrayList.get(i10);
            int itemPosition = this.f20245f.getItemPosition(eVar.f20266a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f20245f.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f20245f.destroyItem((ViewGroup) this, eVar.f20267b, eVar.f20266a);
                    int i11 = this.f20246g;
                    if (i11 == eVar.f20267b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = eVar.f20267b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f20246g) {
                            iMax = itemPosition;
                        }
                        eVar.f20267b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f20245f.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, f20216q0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                f fVar = (f) getChildAt(i13).getLayoutParams();
                if (!fVar.f20271a) {
                    fVar.f20273c = 0.0f;
                }
            }
            v(iMax, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i10) {
        i iVar = this.f20237T;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
        ArrayList arrayList = this.f20236S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f20236S.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i10);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f();
    }

    public H2.a getAdapter() {
        return this.f20245f;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f20246g;
    }

    public int getOffscreenPageLimit() {
        return this.f20262x;
    }

    public int getPageMargin() {
        return this.f20252n;
    }

    public final e h(View view) {
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f20242c;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i10);
            if (this.f20245f.isViewFromObject(view, eVar.f20266a)) {
                return eVar;
            }
            i10++;
        }
    }

    public final e i() {
        e eVar;
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f20252n / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        e eVar2 = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList<e> arrayList = this.f20242c;
            if (i11 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i11);
            if (z10 || eVar3.f20267b == (i10 = i12 + 1)) {
                eVar = eVar3;
            } else {
                float f13 = f10 + f12 + f11;
                e eVar4 = this.f20243d;
                eVar4.f20270e = f13;
                eVar4.f20267b = i10;
                eVar4.f20269d = this.f20245f.getPageWidth(i10);
                i11--;
                eVar = eVar4;
            }
            f10 = eVar.f20270e;
            float f14 = eVar.f20269d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar2;
            }
            if (scrollX < f14 || i11 == arrayList.size() - 1) {
                return eVar;
            }
            int i13 = eVar.f20267b;
            float f15 = eVar.f20269d;
            i11++;
            z10 = false;
            e eVar5 = eVar;
            i12 = i13;
            f12 = f15;
            eVar2 = eVar5;
        }
    }

    public final e j(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f20242c;
            if (i11 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i11);
            if (eVar.f20267b == i10) {
                return eVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void k(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.f20235R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f20271a) {
                    int i13 = fVar.f20272b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        i iVar = this.f20237T;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
        ArrayList arrayList = this.f20236S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                i iVar2 = (i) this.f20236S.get(i15);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        this.f20234Q = true;
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f20225H) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f20221D = motionEvent.getX(i10);
            this.f20225H = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f20226I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        H2.a aVar = this.f20245f;
        if (aVar == null || this.f20246g >= aVar.getCount() - 1) {
            return false;
        }
        u(this.f20246g + 1, true);
        return true;
    }

    public final boolean n(int i10) {
        if (this.f20242c.size() == 0) {
            if (this.f20233P) {
                return false;
            }
            this.f20234Q = false;
            k(0, 0.0f, 0);
            if (this.f20234Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e eVarI = i();
        int clientWidth = getClientWidth();
        int i11 = this.f20252n;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = eVarI.f20267b;
        float f11 = ((i10 / f10) - eVarI.f20270e) / (eVarI.f20269d + (i11 / f10));
        this.f20234Q = false;
        k(i13, f11, (int) (i12 * f11));
        if (this.f20234Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f20221D - f10;
        this.f20221D = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f20256r * clientWidth;
        float f13 = this.f20257s * clientWidth;
        ArrayList<e> arrayList = this.f20242c;
        boolean z12 = false;
        e eVar = arrayList.get(0);
        e eVar2 = (e) n.f(1, arrayList);
        if (eVar.f20267b != 0) {
            f12 = eVar.f20270e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f20267b != this.f20245f.getCount() - 1) {
            f13 = eVar2.f20270e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f20231N.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f20232O.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f20221D = (scrollX - i10) + this.f20221D;
        scrollTo(i10, getScrollY());
        n(i10);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20233P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f20239V);
        Scroller scroller = this.f20249k;
        if (scroller != null && !scroller.isFinished()) {
            this.f20249k.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f20252n <= 0 || this.f20253o == null) {
            return;
        }
        ArrayList<e> arrayList = this.f20242c;
        if (arrayList.size() <= 0 || this.f20245f == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f20252n / f11;
        int i11 = 0;
        e eVar = arrayList.get(0);
        float f13 = eVar.f20270e;
        int size = arrayList.size();
        int i12 = eVar.f20267b;
        int i13 = arrayList.get(size - 1).f20267b;
        while (i12 < i13) {
            while (true) {
                i10 = eVar.f20267b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = arrayList.get(i11);
            }
            if (i12 == i10) {
                float f14 = eVar.f20270e;
                float f15 = eVar.f20269d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f20245f.getPageWidth(i12);
                f10 = (f13 + pageWidth) * f11;
                f13 = pageWidth + f12 + f13;
            }
            if (this.f20252n + f10 > scrollX) {
                this.f20253o.setBounds(Math.round(f10), this.f20254p, Math.round(this.f20252n + f10), this.f20255q);
                this.f20253o.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            arrayList = arrayList;
            f12 = f12;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10 = this.f20220C;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            s();
            return false;
        }
        if (action != 0) {
            if (this.f20263y) {
                return true;
            }
            if (this.f20264z) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.f20223F = x10;
            this.f20221D = x10;
            float y10 = motionEvent.getY();
            this.f20224G = y10;
            this.f20222E = y10;
            this.f20225H = motionEvent.getPointerId(0);
            this.f20264z = false;
            this.f20250l = true;
            this.f20249k.computeScrollOffset();
            if (this.f20240W != 2 || Math.abs(this.f20249k.getFinalX() - this.f20249k.getCurrX()) <= this.f20230M) {
                d(false);
                this.f20263y = false;
            } else {
                this.f20249k.abortAnimation();
                this.f20261w = false;
                p();
                this.f20263y = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.f20225H;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f20221D;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f20224G);
                if (f10 != 0.0f) {
                    float f11 = this.f20221D;
                    if ((f11 >= this.f20219B || f10 <= 0.0f) && ((f11 <= getWidth() - this.f20219B || f10 >= 0.0f) && c((int) f10, (int) x11, (int) y11, this, false))) {
                        this.f20221D = x11;
                        this.f20222E = y11;
                        this.f20264z = true;
                        return false;
                    }
                }
                float f12 = i10;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.f20263y = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.f20223F;
                    float f14 = i10;
                    this.f20221D = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.f20222E = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.f20264z = true;
                }
                if (this.f20263y && o(x11)) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f20226I == null) {
            this.f20226I = VelocityTracker.obtain();
        }
        this.f20226I.addMovement(motionEvent);
        return this.f20263y;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        e eVarH;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f20271a) {
                    int i18 = fVar.f20272b;
                    int i19 = i18 & 7;
                    int i20 = i18 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.f20271a && (eVarH = h(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (eVarH.f20270e * f10)) + paddingLeft;
                    if (fVar2.f20274d) {
                        fVar2.f20274d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * fVar2.f20273c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f20254p = paddingTop;
        this.f20255q = i15 - paddingBottom;
        this.f20235R = i16;
        if (this.f20233P) {
            z11 = false;
            t(this.f20246g, 0, false, false);
        } else {
            z11 = false;
        }
        this.f20233P = z11;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f fVar;
        f fVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f20219B = Math.min(measuredWidth / 10, this.f20218A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f20271a) {
                int i15 = fVar2.f20272b;
                int i16 = i15 & 7;
                int i17 = i15 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f20258t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f20259u = true;
        p();
        this.f20259u = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f20271a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f20273c), 1073741824), this.f20258t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        e eVarH;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (eVarH = h(childAt)) != null && eVarH.f20267b == this.f20246g && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f4135b);
        H2.a aVar = this.f20245f;
        ClassLoader classLoader = kVar.f20279f;
        if (aVar != null) {
            aVar.restoreState(kVar.f20278e, classLoader);
            v(kVar.f20277d, 0, false, true);
        } else {
            this.f20247h = kVar.f20277d;
            this.f20248i = kVar.f20278e;
            this.j = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f20277d = this.f20246g;
        H2.a aVar = this.f20245f;
        if (aVar != null) {
            kVar.f20278e = aVar.saveState();
        }
        return kVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f20252n;
            r(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        H2.a aVar;
        int i10 = this.f20220C;
        boolean zS = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f20245f) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.f20226I == null) {
            this.f20226I = VelocityTracker.obtain();
        }
        this.f20226I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f20249k.abortAnimation();
            this.f20261w = false;
            p();
            float x10 = motionEvent.getX();
            this.f20223F = x10;
            this.f20221D = x10;
            float y10 = motionEvent.getY();
            this.f20224G = y10;
            this.f20222E = y10;
            this.f20225H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f20221D = motionEvent.getX(actionIndex);
                        this.f20225H = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        l(motionEvent);
                        this.f20221D = motionEvent.getX(motionEvent.findPointerIndex(this.f20225H));
                    }
                } else if (this.f20263y) {
                    t(this.f20246g, 0, true, false);
                    zS = s();
                }
            } else if (!this.f20263y) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f20225H);
                if (iFindPointerIndex == -1) {
                    zS = s();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x11 - this.f20221D);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.f20222E);
                    if (fAbs > i10 && fAbs > fAbs2) {
                        this.f20263y = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f10 = this.f20223F;
                        float f11 = i10;
                        this.f20221D = x11 - f10 > 0.0f ? f10 + f11 : f10 - f11;
                        this.f20222E = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f20263y) {
                        zS = o(motionEvent.getX(motionEvent.findPointerIndex(this.f20225H)));
                    }
                }
            } else if (this.f20263y) {
                zS = o(motionEvent.getX(motionEvent.findPointerIndex(this.f20225H)));
            }
        } else if (this.f20263y) {
            VelocityTracker velocityTracker = this.f20226I;
            velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, this.f20228K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f20225H);
            this.f20261w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e eVarI = i();
            float f12 = clientWidth;
            float f13 = this.f20252n / f12;
            int iMax = eVarI.f20267b;
            float f14 = ((scrollX / f12) - eVarI.f20270e) / (eVarI.f20269d + f13);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f20225H)) - this.f20223F)) <= this.f20229L || Math.abs(xVelocity) <= this.f20227J) {
                iMax += (int) (f14 + (iMax >= this.f20246g ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList<e> arrayList = this.f20242c;
            if (arrayList.size() > 0) {
                iMax = Math.max(arrayList.get(0).f20267b, Math.min(iMax, ((e) n.f(1, arrayList)).f20267b));
            }
            v(iMax, xVelocity, true, true);
            zS = s();
        }
        if (zS) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void p() {
        q(this.f20246g);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[PHI: r7 r11 r15
      0x00bc: PHI (r7v13 int) = (r7v12 int), (r7v4 int), (r7v16 int) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r11v26 int) = (r11v1 int), (r11v25 int), (r11v29 int) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:61:0x00de, B:58:0x00ca, B:50:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x013b A[PHI: r3 r12
      0x013b: PHI (r3v42 float) = (r3v40 float), (r3v41 float), (r3v39 float) binds: [B:95:0x0162, B:92:0x014c, B:85:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r12v10 int) = (r12v8 int), (r12v9 int), (r12v7 int) binds: [B:95:0x0162, B:92:0x014c, B:85:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    public final void q(int i10) {
        e eVarJ;
        String hexString;
        ArrayList<e> arrayList;
        e eVarA;
        e eVarH;
        e eVarH2;
        int i11;
        int i12;
        e eVar;
        e eVar2;
        e eVar3;
        int i13 = this.f20246g;
        if (i13 != i10) {
            eVarJ = j(i13);
            this.f20246g = i10;
        } else {
            eVarJ = null;
        }
        if (this.f20245f == null || this.f20261w || getWindowToken() == null) {
            return;
        }
        this.f20245f.startUpdate((ViewGroup) this);
        int i14 = this.f20262x;
        int iMax = Math.max(0, this.f20246g - i14);
        int count = this.f20245f.getCount();
        int iMin = Math.min(count - 1, this.f20246g + i14);
        if (count != this.f20241b) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f20241b + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f20245f.getClass());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.f20242c;
            if (i15 < arrayList.size()) {
                eVarA = arrayList.get(i15);
                int i16 = eVarA.f20267b;
                int i17 = this.f20246g;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            eVarA = null;
            break;
        }
        if (eVarA == null && count > 0) {
            eVarA = a(this.f20246g, i15);
        }
        if (eVarA != null) {
            int i18 = i15 - 1;
            e eVar4 = i18 >= 0 ? arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVarA.f20269d);
            float f10 = 0.0f;
            for (int i19 = this.f20246g - 1; i19 >= 0; i19--) {
                if (f10 < paddingLeft || i19 >= iMax) {
                    if (eVar4 == null || i19 != eVar4.f20267b) {
                        f10 += a(i19, i18 + 1).f20269d;
                        i15++;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                    } else {
                        f10 += eVar4.f20269d;
                        i18--;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                    }
                    eVar4 = eVar3;
                } else {
                    if (eVar4 == null) {
                        break;
                    }
                    if (i19 == eVar4.f20267b && !eVar4.f20268c) {
                        arrayList.remove(i18);
                        this.f20245f.destroyItem((ViewGroup) this, i19, eVar4.f20266a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            eVar3 = arrayList.get(i18);
                        } else {
                            eVar3 = null;
                        }
                        eVar4 = eVar3;
                    }
                }
            }
            float f11 = eVarA.f20269d;
            int i20 = i15 + 1;
            if (f11 < 2.0f) {
                e eVar5 = i20 < arrayList.size() ? arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f20246g + 1; i22 < count; i22++) {
                    if (f11 >= paddingRight && i22 > iMin) {
                        if (eVar5 == null) {
                            break;
                        }
                        if (i22 == eVar5.f20267b && !eVar5.f20268c) {
                            arrayList.remove(i21);
                            this.f20245f.destroyItem((ViewGroup) this, i22, eVar5.f20266a);
                            if (i21 < arrayList.size()) {
                                eVar5 = arrayList.get(i21);
                            } else {
                                eVar5 = null;
                            }
                        }
                    } else if (eVar5 == null || i22 != eVar5.f20267b) {
                        e eVarA2 = a(i22, i21);
                        i21++;
                        f11 += eVarA2.f20269d;
                        if (i21 < arrayList.size()) {
                            eVar5 = arrayList.get(i21);
                        } else {
                            eVar5 = null;
                        }
                    } else {
                        f11 += eVar5.f20269d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            eVar5 = arrayList.get(i21);
                        } else {
                            eVar5 = null;
                        }
                    }
                }
            }
            int count2 = this.f20245f.getCount();
            int clientWidth2 = getClientWidth();
            float f12 = clientWidth2 > 0 ? this.f20252n / clientWidth2 : 0.0f;
            if (eVarJ != null) {
                int i23 = eVarJ.f20267b;
                int i24 = eVarA.f20267b;
                if (i23 < i24) {
                    float pageWidth = eVarJ.f20270e + eVarJ.f20269d + f12;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= eVarA.f20267b && i26 < arrayList.size()) {
                        e eVar6 = arrayList.get(i26);
                        while (true) {
                            eVar2 = eVar6;
                            if (i25 <= eVar2.f20267b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            eVar6 = arrayList.get(i26);
                        }
                        while (i25 < eVar2.f20267b) {
                            pageWidth += this.f20245f.getPageWidth(i25) + f12;
                            i25++;
                        }
                        eVar2.f20270e = pageWidth;
                        pageWidth += eVar2.f20269d + f12;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float pageWidth2 = eVarJ.f20270e;
                    while (true) {
                        i23--;
                        if (i23 < eVarA.f20267b || size < 0) {
                            break;
                        }
                        e eVar7 = arrayList.get(size);
                        while (true) {
                            eVar = eVar7;
                            if (i23 >= eVar.f20267b || size <= 0) {
                                break;
                            }
                            size--;
                            eVar7 = arrayList.get(size);
                        }
                        while (i23 > eVar.f20267b) {
                            pageWidth2 -= this.f20245f.getPageWidth(i23) + f12;
                            i23--;
                        }
                        pageWidth2 -= eVar.f20269d + f12;
                        eVar.f20270e = pageWidth2;
                    }
                }
            }
            int size2 = arrayList.size();
            float pageWidth3 = eVarA.f20270e;
            int i27 = eVarA.f20267b;
            int i28 = i27 - 1;
            this.f20256r = i27 == 0 ? pageWidth3 : -3.4028235E38f;
            int i29 = count2 - 1;
            this.f20257s = i27 == i29 ? (eVarA.f20269d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                e eVar8 = arrayList.get(i30);
                while (true) {
                    i12 = eVar8.f20267b;
                    if (i28 <= i12) {
                        break;
                    }
                    pageWidth3 -= this.f20245f.getPageWidth(i28) + f12;
                    i28--;
                }
                pageWidth3 -= eVar8.f20269d + f12;
                eVar8.f20270e = pageWidth3;
                if (i12 == 0) {
                    this.f20256r = pageWidth3;
                }
                i30--;
                i28--;
            }
            float pageWidth4 = eVarA.f20270e + eVarA.f20269d + f12;
            int i31 = eVarA.f20267b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                e eVar9 = arrayList.get(i20);
                while (true) {
                    i11 = eVar9.f20267b;
                    if (i31 >= i11) {
                        break;
                    }
                    pageWidth4 += this.f20245f.getPageWidth(i31) + f12;
                    i31++;
                }
                if (i11 == i29) {
                    this.f20257s = (eVar9.f20269d + pageWidth4) - 1.0f;
                }
                eVar9.f20270e = pageWidth4;
                pageWidth4 += eVar9.f20269d + f12;
                i20++;
            }
            this.f20245f.setPrimaryItem((ViewGroup) this, this.f20246g, eVarA.f20266a);
        }
        this.f20245f.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            f fVar = (f) childAt.getLayoutParams();
            fVar.getClass();
            if (!fVar.f20271a && fVar.f20273c == 0.0f && (eVarH2 = h(childAt)) != null) {
                fVar.f20273c = eVarH2.f20269d;
            }
        }
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                eVarH = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    eVarH = h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        eVarH = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (eVarH == null || eVarH.f20267b != this.f20246g) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    e eVarH3 = h(childAt2);
                    if (eVarH3 != null && eVarH3.f20267b == this.f20246g && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void r(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f20242c.isEmpty()) {
            if (!this.f20249k.isFinished()) {
                this.f20249k.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        e eVarJ = j(this.f20246g);
        int iMin = (int) ((eVarJ != null ? Math.min(eVarJ.f20270e, this.f20257s) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f20259u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.f20225H = -1;
        this.f20263y = false;
        this.f20264z = false;
        VelocityTracker velocityTracker = this.f20226I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20226I = null;
        }
        this.f20231N.onRelease();
        this.f20232O.onRelease();
        return this.f20231N.isFinished() || this.f20232O.isFinished();
    }

    public void setAdapter(H2.a aVar) {
        ArrayList<e> arrayList;
        H2.a aVar2 = this.f20245f;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f20245f.startUpdate((ViewGroup) this);
            int i10 = 0;
            while (true) {
                arrayList = this.f20242c;
                if (i10 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i10);
                this.f20245f.destroyItem((ViewGroup) this, eVar.f20267b, eVar.f20266a);
                i10++;
            }
            this.f20245f.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((f) getChildAt(i11).getLayoutParams()).f20271a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f20246g = 0;
            scrollTo(0, 0);
        }
        this.f20245f = aVar;
        this.f20241b = 0;
        if (aVar != null) {
            if (this.f20251m == null) {
                this.f20251m = new j();
            }
            this.f20245f.setViewPagerObserver(this.f20251m);
            this.f20261w = false;
            boolean z10 = this.f20233P;
            this.f20233P = true;
            this.f20241b = this.f20245f.getCount();
            if (this.f20247h >= 0) {
                this.f20245f.restoreState(this.f20248i, this.j);
                v(this.f20247h, 0, false, true);
                this.f20247h = -1;
                this.f20248i = null;
                this.j = null;
            } else if (z10) {
                requestLayout();
            } else {
                p();
            }
        }
        ArrayList arrayList2 = this.f20238U;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f20238U.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((h) this.f20238U.get(i12)).a(this, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f20261w = false;
        v(i10, 0, !this.f20233P, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 != this.f20262x) {
            this.f20262x = i10;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f20237T = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f20252n;
        this.f20252n = i10;
        int width = getWidth();
        r(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f20253o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f20240W == i10) {
            return;
        }
        this.f20240W = i10;
        i iVar = this.f20237T;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
        ArrayList arrayList = this.f20236S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f20236S.get(i11);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i10);
                }
            }
        }
    }

    public final void t(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        int scrollX;
        int iAbs;
        e eVarJ = j(i10);
        if (eVarJ != null) {
            iMax = (int) (Math.max(this.f20256r, Math.min(eVarJ.f20270e, this.f20257s)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z10) {
            if (z11) {
                f(i10);
            }
            d(false);
            scrollTo(iMax, 0);
            n(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f20249k;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f20250l ? this.f20249k.getCurrX() : this.f20249k.getStartX();
                this.f20249k.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = iMax - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                d(false);
                p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i11);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    iAbs = (int) (((Math.abs(i13) / ((this.f20245f.getPageWidth(this.f20246g) * f10) + this.f20252n)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.f20250l = false;
                this.f20249k.startScroll(i12, scrollY, i13, i14, iMin);
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            f(i10);
        }
    }

    public final void u(int i10, boolean z10) {
        this.f20261w = false;
        v(i10, 0, z10, false);
    }

    public final void v(int i10, int i11, boolean z10, boolean z11) {
        H2.a aVar = this.f20245f;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f20242c;
        if (!z11 && this.f20246g == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f20245f.getCount()) {
            i10 = this.f20245f.getCount() - 1;
        }
        int i12 = this.f20262x;
        int i13 = this.f20246g;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                arrayList.get(i14).f20268c = true;
            }
        }
        boolean z12 = this.f20246g != i10;
        if (!this.f20233P) {
            q(i10);
            t(i10, i11, z10, z12);
        } else {
            this.f20246g = i10;
            if (z12) {
                f(i10);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20253o;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f20273c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f20215p0);
        fVar.f20272b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(p186p0.a.C0517a.b(getContext(), i10));
    }
}
