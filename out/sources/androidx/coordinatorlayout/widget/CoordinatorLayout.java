package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.X;
import androidx.core.view.C1308x;
import androidx.core.view.InterfaceC1306v;
import androidx.core.view.InterfaceC1307w;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import com.voltasit.obdeleven.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1306v, InterfaceC1307w {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f16624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Class<?>[] f16625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f16626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final i f16627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final A0.e f16628y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p161n0.a<View> f16630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f16631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f16633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f16634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16636i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f16637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f16638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f16639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n0 f16641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f16643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f16644r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f16645s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1308x f16646t;

    public class a implements InterfaceC1309y {
        public a() {
        }

        @Override // androidx.core.view.InterfaceC1309y
        public final n0 g(View view, n0 n0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f16641o, n0Var)) {
                coordinatorLayout.f16641o = n0Var;
                boolean z10 = n0Var.d() > 0;
                coordinatorLayout.f16642p = z10;
                coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                n0.k kVar = n0Var.f16948a;
                if (!kVar.o()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, Z> weakHashMap = O.f16859a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f16649a != null && kVar.o()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return n0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean e(Rect rect, View view) {
            return false;
        }

        public boolean f(View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean n(View view) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable s(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean t(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void j() {
        }

        public void g(f fVar) {
        }

        public void i(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void r(View view, Parcelable parcelable) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public void o(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f16644r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f16644r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends K0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SparseArray<Parcelable> f16665d;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f16665d = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f16665d.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f16665d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f16665d.keyAt(i11);
                parcelableArr[i11] = this.f16665d.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            float fM = O.d.m(view);
            float fM2 = O.d.m(view2);
            if (fM > fM2) {
                return -1;
            }
            return fM < fM2 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f16624u = r10 != null ? r10.getName() : null;
        f16627x = new i();
        f16625v = new Class[]{Context.class, AttributeSet.class};
        f16626w = new ThreadLocal<>();
        f16628y = new A0.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f16629b = new ArrayList();
        this.f16630c = new p161n0.a<>();
        this.f16631d = new ArrayList();
        this.f16632e = new ArrayList();
        this.f16633f = new int[2];
        this.f16634g = new int[2];
        this.f16646t = new C1308x();
        int[] iArr = p151m0.a.f44550a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.j = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.j;
                iArr2[i10] = (int) (iArr2[i10] * f10);
            }
        }
        this.f16643q = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f16628y.a();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int i13 = fVar.f16651c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f16652d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i17 != 1) {
            iWidth = i17 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            iHeight = i18 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i15 == 1) {
            iWidth -= i11 / 2;
        } else if (i15 != 5) {
            iWidth -= i11;
        }
        if (i16 == 16) {
            iHeight -= i12 / 2;
        } else if (i16 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f i(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f16650b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f16650b = true;
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f16650b = true;
            }
        }
        return fVar;
    }

    public static void w(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f16657i;
        if (i11 != i10) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f16657i = i10;
        }
    }

    public static void x(int i10, View view) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.j;
        if (i11 != i10) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.j = i10;
        }
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    public final void c(View view) {
        ArrayList<View> arrayList = this.f16630c.f44661b.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View view2 = arrayList.get(i10);
            c cVar = ((f) view2.getLayoutParams()).f16649a;
            if (cVar != null) {
                cVar.h(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c cVar = ((f) view.getLayoutParams()).f16649a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16643q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        X<View, ArrayList<View>> x10 = this.f16630c.f44661b;
        int i10 = x10.f9139d;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList<View> arrayListM = x10.m(i11);
            if (arrayListM != null && arrayListM.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(x10.h(i11));
            }
        }
        ArrayList arrayList2 = this.f16632e;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    public final void f(Rect rect, View view) {
        ThreadLocal<Matrix> threadLocal = p161n0.b.f44664a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = p161n0.b.f44664a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        p161n0.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = p161n0.b.f44665b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f16629b);
    }

    public final n0 getLastWindowInsets() {
        return this.f16641o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1308x c1308x = this.f16646t;
        return c1308x.f16998b | c1308x.f16997a;
    }

    public Drawable getStatusBarBackground() {
        return this.f16643q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i10) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        C1308x c1308x = this.f16646t;
        if (i10 == 1) {
            c1308x.f16998b = 0;
        } else {
            c1308x.f16997a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f16649a;
                if (cVar != null) {
                    cVar.u(this, childAt, view, i10);
                }
                if (i10 == 0) {
                    fVar.f16660m = false;
                } else if (i10 == 1) {
                    fVar.f16661n = false;
                }
                fVar.f16662o = false;
            }
        }
        this.f16638l = null;
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f16649a) != null) {
                    int[] iArr2 = this.f16633f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, i11, i12, i13, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            q(1);
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        k(view, i10, i11, i12, i13, 0, this.f16634g);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f16649a;
                if (cVar != null) {
                    boolean zT = cVar.t(this, childAt, view, view2, i10, i11);
                    z10 |= zT;
                    if (i11 == 0) {
                        fVar.f16660m = zT;
                    } else if (i11 == 1) {
                        fVar.f16661n = zT;
                    }
                } else if (i11 == 0) {
                    fVar.f16660m = false;
                } else if (i11 == 1) {
                    fVar.f16661n = false;
                }
            }
        }
        return z10;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        C1308x c1308x = this.f16646t;
        if (i11 == 1) {
            c1308x.f16998b = i10;
        } else {
            c1308x.f16997a = i10;
        }
        this.f16638l = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f16649a) != null) {
                    int[] iArr2 = this.f16633f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f16640n) {
            if (this.f16639m == null) {
                this.f16639m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f16639m);
        }
        if (this.f16641o == null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (getFitsSystemWindows()) {
                O.c.c(this);
            }
        }
        this.f16636i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f16640n && this.f16639m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f16639m);
        }
        View view = this.f16638l;
        if (view != null) {
            j(0, view);
        }
        this.f16636i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f16642p || this.f16643q == null) {
            return;
        }
        n0 n0Var = this.f16641o;
        int iD = n0Var != null ? n0Var.d() : 0;
        if (iD > 0) {
            this.f16643q.setBounds(0, 0, getWidth(), iD);
            this.f16643q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f16629b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f16649a) == null || !cVar.l(this, view, layoutDirection))) {
                r(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVar;
        int i15;
        ArrayList arrayList;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        int iMax;
        u();
        int childCount = getChildCount();
        int i23 = 0;
        loop0: while (true) {
            if (i23 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i23);
            X<View, ArrayList<View>> x10 = this.f16630c.f44661b;
            int i24 = x10.f9139d;
            for (int i25 = 0; i25 < i24; i25++) {
                ArrayList<View> arrayListM = x10.m(i25);
                if (arrayListM != null && arrayListM.contains(childAt)) {
                    z10 = true;
                    break loop0;
                }
            }
            i23++;
        }
        if (z10 != this.f16640n) {
            if (z10) {
                if (this.f16636i) {
                    if (this.f16639m == null) {
                        this.f16639m = new g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f16639m);
                }
                this.f16640n = true;
            } else {
                if (this.f16636i && this.f16639m != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f16639m);
                }
                this.f16640n = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int layoutDirection = getLayoutDirection();
        boolean z13 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z14 = this.f16641o != null && getFitsSystemWindows();
        ArrayList arrayList2 = this.f16629b;
        int size3 = arrayList2.size();
        int i28 = suggestedMinimumWidth;
        int i29 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i30 = 0;
        while (i30 < size3) {
            View view = (View) arrayList2.get(i30);
            if (view.getVisibility() == 8) {
                i20 = i30;
                i15 = size3;
                arrayList = arrayList2;
                i18 = paddingLeft;
                i21 = paddingRight;
                i16 = layoutDirection;
                z12 = true;
                z11 = false;
            } else {
                f fVar = (f) view.getLayoutParams();
                int i31 = fVar.f16653e;
                if (i31 < 0 || mode == 0) {
                    i12 = iCombineMeasuredStates;
                    i13 = i30;
                } else {
                    int iH = h(i31);
                    i12 = iCombineMeasuredStates;
                    int i32 = fVar.f16651c;
                    if (i32 == 0) {
                        i32 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, layoutDirection) & 7;
                    i13 = i30;
                    if ((absoluteGravity != 3 || z13) && !(absoluteGravity == 5 && z13)) {
                        if ((absoluteGravity == 5 && !z13) || (absoluteGravity == 3 && z13)) {
                            iMax = Math.max(0, iH - paddingLeft);
                        }
                        if (z14 || view.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iC = this.f16641o.c() + this.f16641o.b();
                            int iA = this.f16641o.a() + this.f16641o.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        cVar = fVar.f16649a;
                        if (cVar != null) {
                            int i33 = i12;
                            i20 = i13;
                            z11 = false;
                            i18 = paddingLeft;
                            i19 = i33;
                            i21 = paddingRight;
                            i22 = i29;
                            i16 = layoutDirection;
                            i17 = i28;
                            i15 = size3;
                            arrayList = arrayList2;
                            if (!cVar.m(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                            }
                            int iMax2 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax3 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i28 = iMax2;
                            iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                            i29 = iMax3;
                            z12 = true;
                        } else {
                            i15 = size3;
                            arrayList = arrayList2;
                            i16 = layoutDirection;
                            z11 = false;
                            i17 = i28;
                            int i34 = i13;
                            i18 = paddingLeft;
                            i19 = i12;
                            i20 = i34;
                            i21 = paddingRight;
                            i22 = i29;
                        }
                        measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                        int iMax4 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax5 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i28 = iMax4;
                        iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                        i29 = iMax5;
                        z12 = true;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iH);
                    }
                    i14 = iMax;
                    if (z14) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVar = fVar.f16649a;
                    if (cVar != null) {
                        int i35 = i12;
                        i20 = i13;
                        z11 = false;
                        i18 = paddingLeft;
                        i19 = i35;
                        i21 = paddingRight;
                        i22 = i29;
                        i16 = layoutDirection;
                        i17 = i28;
                        i15 = size3;
                        arrayList = arrayList2;
                        if (!cVar.m(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                        }
                        int iMax6 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax7 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        i28 = iMax6;
                        iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                        i29 = iMax7;
                        z12 = true;
                    } else {
                        i15 = size3;
                        arrayList = arrayList2;
                        i16 = layoutDirection;
                        z11 = false;
                        i17 = i28;
                        int i36 = i13;
                        i18 = paddingLeft;
                        i19 = i12;
                        i20 = i36;
                        i21 = paddingRight;
                        i22 = i29;
                    }
                    measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                    int iMax8 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax9 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i28 = iMax8;
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    i29 = iMax9;
                    z12 = true;
                }
                i14 = 0;
                if (z14) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVar = fVar.f16649a;
                if (cVar != null) {
                    int i37 = i12;
                    i20 = i13;
                    z11 = false;
                    i18 = paddingLeft;
                    i19 = i37;
                    i21 = paddingRight;
                    i22 = i29;
                    i16 = layoutDirection;
                    i17 = i28;
                    i15 = size3;
                    arrayList = arrayList2;
                    if (!cVar.m(this, view, iMakeMeasureSpec, i14, iMakeMeasureSpec2)) {
                    }
                    int iMax10 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax11 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i28 = iMax10;
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    i29 = iMax11;
                    z12 = true;
                } else {
                    i15 = size3;
                    arrayList = arrayList2;
                    i16 = layoutDirection;
                    z11 = false;
                    i17 = i28;
                    int i38 = i13;
                    i18 = paddingLeft;
                    i19 = i12;
                    i20 = i38;
                    i21 = paddingRight;
                    i22 = i29;
                }
                measureChildWithMargins(view, iMakeMeasureSpec, i14, iMakeMeasureSpec2, 0);
                int iMax12 = Math.max(i17, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax13 = Math.max(i22, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i28 = iMax12;
                iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                i29 = iMax13;
                z12 = true;
            }
            i30 = i20 + 1;
            paddingLeft = i18;
            paddingRight = i21;
            layoutDirection = i16;
            size3 = i15;
            arrayList2 = arrayList;
        }
        int i39 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i28, i10, (-16777216) & i39), View.resolveSizeAndState(i29, i11, i39 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f16649a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f16649a) != null) {
                    zN |= cVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        l(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        n(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f4135b);
        SparseArray<Parcelable> sparseArray = hVar.f16665d;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = i(childAt).f16649a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f16649a;
            if (id != -1 && cVar != null && (parcelableS = cVar.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        hVar.f16665d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return m(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        boolean zV;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16637k == null) {
            zT = t(motionEvent, 1);
            if (!zT) {
                zV = false;
            }
            motionEventObtain = null;
            if (this.f16637k == null) {
                zV |= super.onTouchEvent(motionEvent);
            } else if (zT) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                v(false);
            }
            return zV;
        }
        zT = false;
        c cVar = ((f) this.f16637k.getLayoutParams()).f16649a;
        if (cVar != null) {
            zV = cVar.v(this, this.f16637k, motionEvent);
        } else {
            zV = false;
        }
        motionEventObtain = null;
        if (this.f16637k == null) {
            zV |= super.onTouchEvent(motionEvent);
        } else if (zT) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked != 1) {
            v(false);
        } else {
            v(false);
        }
        return zV;
    }

    public final boolean p(View view, int i10, int i11) {
        A0.e eVar = f16628y;
        Rect rectA = a();
        f(rectA, view);
        try {
            return rectA.contains(i10, i11);
        } finally {
            rectA.setEmpty();
            eVar.b(rectA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        Rect rect2;
        boolean z10;
        int i13;
        Rect rect3;
        ArrayList arrayList;
        int i14;
        boolean zH;
        boolean z11;
        boolean z12;
        int width;
        int i15;
        int i16;
        int i17;
        int height;
        int i18;
        int i19;
        int i20;
        A0.e eVar;
        c cVar;
        int i21 = i10;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f16629b;
        int size = arrayList2.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        int i22 = 0;
        while (true) {
            A0.e eVar2 = f16628y;
            if (i22 >= size) {
                Rect rect4 = rectA3;
                Rect rect5 = rectA2;
                Rect rect6 = rectA;
                rect6.setEmpty();
                eVar2.b(rect6);
                rect5.setEmpty();
                eVar2.b(rect5);
                rect4.setEmpty();
                eVar2.b(rect4);
                return;
            }
            View view = (View) arrayList2.get(i22);
            f fVar = (f) view.getLayoutParams();
            if (i21 != 0 || view.getVisibility() != 8) {
                int i23 = 0;
                while (i23 < i22) {
                    if (fVar.f16659l == ((View) arrayList2.get(i23))) {
                        f fVar2 = (f) view.getLayoutParams();
                        if (fVar2.f16658k != null) {
                            Rect rectA4 = a();
                            Rect rectA5 = a();
                            Rect rectA6 = a();
                            f(rectA4, fVar2.f16658k);
                            d(view, rectA5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            eVar = eVar2;
                            g(layoutDirection, rectA4, rectA6, fVar2, measuredWidth, measuredHeight);
                            boolean z13 = (rectA6.left == rectA5.left && rectA6.top == rectA5.top) ? false : true;
                            b(fVar2, rectA6, measuredWidth, measuredHeight);
                            int i24 = rectA6.left - rectA5.left;
                            int i25 = rectA6.top - rectA5.top;
                            if (i24 != 0) {
                                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                                view.offsetLeftAndRight(i24);
                            }
                            if (i25 != 0) {
                                WeakHashMap<View, Z> weakHashMap3 = O.f16859a;
                                view.offsetTopAndBottom(i25);
                            }
                            if (z13 && (cVar = fVar2.f16649a) != null) {
                                cVar.h(this, view, fVar2.f16658k);
                            }
                            rectA4.setEmpty();
                            eVar.b(rectA4);
                            rectA5.setEmpty();
                            eVar.b(rectA5);
                            rectA6.setEmpty();
                            eVar.b(rectA6);
                        } else {
                            eVar = eVar2;
                        }
                    } else {
                        eVar = eVar2;
                    }
                    i23++;
                    eVar2 = eVar;
                    size = size;
                    arrayList2 = arrayList2;
                    layoutDirection = layoutDirection;
                    fVar = fVar;
                    i22 = i22;
                    rectA3 = rectA3;
                    rectA2 = rectA2;
                    rectA = rectA;
                }
                f fVar3 = fVar;
                int i26 = layoutDirection;
                A0.e eVar3 = eVar2;
                i11 = i22;
                Rect rect7 = rectA3;
                rect = rectA2;
                Rect rect8 = rectA;
                ArrayList arrayList3 = arrayList2;
                int i27 = size;
                d(view, rect, true);
                if (fVar3.f16655g == 0 || rect.isEmpty()) {
                    i12 = i26;
                    rect2 = rect8;
                } else {
                    i12 = i26;
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar3.f16655g, i12);
                    int i28 = absoluteGravity & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i28 == 48) {
                        rect2 = rect8;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i28 != 80) {
                        rect2 = rect8;
                    } else {
                        rect2 = rect8;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i29 = absoluteGravity & 7;
                    if (i29 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i29 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (fVar3.f16656h == 0 || view.getVisibility() != 0) {
                    z10 = false;
                } else {
                    WeakHashMap<View, Z> weakHashMap4 = O.f16859a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar4 = (f) view.getLayoutParams();
                        c cVar2 = fVar4.f16649a;
                        Rect rectA7 = a();
                        Rect rectA8 = a();
                        rectA8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.e(rectA7, view)) {
                            rectA7.set(rectA8);
                        } else if (!rectA8.contains(rectA7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA7.toShortString() + " | Bounds:" + rectA8.toShortString());
                        }
                        rectA8.setEmpty();
                        eVar3.b(rectA8);
                        if (rectA7.isEmpty()) {
                            rectA7.setEmpty();
                            eVar3.b(rectA7);
                            z10 = false;
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar4.f16656h, i12);
                            if ((absoluteGravity2 & 48) != 48 || (i19 = (rectA7.top - ((ViewGroup.MarginLayoutParams) fVar4).topMargin) - fVar4.j) >= (i20 = rect2.top)) {
                                z11 = false;
                            } else {
                                x(i20 - i19, view);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectA7.bottom) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin) + fVar4.j) < (i18 = rect2.bottom)) {
                                x(height - i18, view);
                                z11 = true;
                            }
                            if (z11) {
                                z10 = false;
                            } else {
                                z10 = false;
                                x(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i16 = (rectA7.left - ((ViewGroup.MarginLayoutParams) fVar4).leftMargin) - fVar4.f16657i) >= (i17 = rect2.left)) {
                                z12 = z10 ? 1 : 0;
                            } else {
                                w(i17 - i16, view);
                                z12 = true;
                            }
                            boolean z14 = z12;
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectA7.right) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin) + fVar4.f16657i) < (i15 = rect2.right)) {
                                z14 = z12;
                                w(width - i15, view);
                                z14 = true;
                            }
                            if (!z14) {
                                w(z10 ? 1 : 0, view);
                            }
                            rectA7.setEmpty();
                            eVar3.b(rectA7);
                        }
                    } else {
                        z10 = false;
                    }
                }
                i13 = i10;
                if (i13 != 2) {
                    rect3 = rect7;
                    rect3.set(((f) view.getLayoutParams()).f16663p);
                    if (rect3.equals(rect)) {
                        size = i27;
                        arrayList = arrayList3;
                    } else {
                        ((f) view.getLayoutParams()).f16663p.set(rect);
                    }
                } else {
                    rect3 = rect7;
                }
                int i30 = i11 + 1;
                size = i27;
                while (true) {
                    arrayList = arrayList3;
                    if (i30 >= size) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i30);
                    f fVar5 = (f) view2.getLayoutParams();
                    c cVar3 = fVar5.f16649a;
                    if (cVar3 == null || !cVar3.f(view2, view)) {
                        i14 = 1;
                    } else if (i13 == 0 && fVar5.f16662o) {
                        fVar5.f16662o = z10;
                        i14 = 1;
                    } else {
                        if (i13 != 2) {
                            zH = cVar3.h(this, view2, view);
                        } else {
                            cVar3.i(this, view);
                            zH = true;
                        }
                        i14 = 1;
                        if (i13 == 1) {
                            fVar5.f16662o = zH;
                        }
                    }
                    i30 += i14;
                    arrayList3 = arrayList;
                }
            } else {
                i13 = i21;
                i12 = layoutDirection;
                i11 = i22;
                rect3 = rectA3;
                rect = rectA2;
                rect2 = rectA;
                arrayList = arrayList2;
            }
            i22 = i11 + 1;
            arrayList2 = arrayList;
            rectA2 = rect;
            i21 = i13;
            rectA = rect2;
            rectA3 = rect3;
            layoutDirection = i12;
        }
    }

    public final void r(int i10, View view) {
        int i11;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f16658k;
        if (view2 == null && fVar.f16654f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        A0.e eVar = f16628y;
        if (view2 != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            try {
                f(rectA, view2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i10, rectA, rectA2, fVar2, measuredWidth, measuredHeight);
                b(fVar2, rectA2, measuredWidth, measuredHeight);
                view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
                return;
            } finally {
                rectA.setEmpty();
                eVar.b(rectA);
                rectA2.setEmpty();
                eVar.b(rectA2);
            }
        }
        int i12 = fVar.f16653e;
        if (i12 < 0) {
            f fVar3 = (f) view.getLayoutParams();
            Rect rectA3 = a();
            rectA3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
            if (this.f16641o != null) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectA3.left = this.f16641o.b() + rectA3.left;
                    rectA3.top = this.f16641o.d() + rectA3.top;
                    rectA3.right -= this.f16641o.c();
                    rectA3.bottom -= this.f16641o.a();
                }
            }
            Rect rectA4 = a();
            int i13 = fVar3.f16651c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), rectA3, rectA4, i10);
            view.layout(rectA4.left, rectA4.top, rectA4.right, rectA4.bottom);
            rectA3.setEmpty();
            eVar.b(rectA3);
            rectA4.setEmpty();
            eVar.b(rectA4);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        int i14 = fVar4.f16651c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int iH = h(i12) - measuredWidth2;
        if (i15 == 1) {
            iH += measuredWidth2 / 2;
        } else if (i15 == 5) {
            iH += measuredWidth2;
        }
        if (i16 != 16) {
            i11 = i16 != 80 ? 0 : measuredHeight2;
        } else {
            i11 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(iH, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f16649a;
        if (cVar == null || !cVar.q(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f16635h) {
            return;
        }
        v(false);
        this.f16635h = true;
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16644r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f16643q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16643q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16643q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f16643q;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                t0.a.b.b(drawable3, getLayoutDirection());
                this.f16643q.setVisible(getVisibility() == 0, false);
                this.f16643q.setCallback(this);
            }
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? p186p0.a.C0517a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f16643q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f16643q.setVisible(z10, false);
    }

    public final boolean t(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f16631d;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        i iVar = f16627x;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            c cVar = ((f) view.getLayoutParams()).f16649a;
            if (zK && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 == 0) {
                        cVar.k(this, view, motionEventObtain);
                    } else if (i10 == 1) {
                        cVar.v(this, view, motionEventObtain);
                    }
                }
            } else if (!zK && cVar != null) {
                if (i10 == 0) {
                    zK = cVar.k(this, view, motionEvent);
                } else if (i10 == 1) {
                    zK = cVar.v(this, view, motionEvent);
                }
                if (zK) {
                    this.f16637k = view;
                }
            }
        }
        arrayList.clear();
        return zK;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v4 android.view.View
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f16649a;
            if (cVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.k(this, childAt, motionEventObtain);
                } else {
                    cVar.v(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).getClass();
        }
        this.f16637k = null;
        this.f16635h = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16643q;
    }

    public final void y() {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        if (!getFitsSystemWindows()) {
            O.d.u(this, null);
            return;
        }
        if (this.f16645s == null) {
            this.f16645s = new a();
        }
        O.d.u(this, this.f16645s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f16649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f16650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f16653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f16654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16657i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public View f16658k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f16659l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f16660m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f16661n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f16662o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Rect f16663p;

        public f() {
            super(-2, -2);
            this.f16650b = false;
            this.f16651c = 0;
            this.f16652d = 0;
            this.f16653e = -1;
            this.f16654f = -1;
            this.f16655g = 0;
            this.f16656h = 0;
            this.f16663p = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 == 0) {
                return this.f16660m;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f16661n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f16649a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f16649a = cVar;
                this.f16650b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            c cVarNewInstance;
            super(context, attributeSet);
            this.f16650b = false;
            this.f16651c = 0;
            this.f16652d = 0;
            this.f16653e = -1;
            this.f16654f = -1;
            this.f16655g = 0;
            this.f16656h = 0;
            this.f16663p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p151m0.a.f44551b);
            this.f16651c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f16654f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.f16652d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f16653e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.f16655g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f16656h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f16650b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f16624u;
                if (TextUtils.isEmpty(string)) {
                    cVarNewInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f16624u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f16626w;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f16625v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVarNewInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(B7.b.c("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f16649a = cVarNewInstance;
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f16649a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f16650b = false;
            this.f16651c = 0;
            this.f16652d = 0;
            this.f16653e = -1;
            this.f16654f = -1;
            this.f16655g = 0;
            this.f16656h = 0;
            this.f16663p = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16650b = false;
            this.f16651c = 0;
            this.f16652d = 0;
            this.f16653e = -1;
            this.f16654f = -1;
            this.f16655g = 0;
            this.f16656h = 0;
            this.f16663p = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16650b = false;
            this.f16651c = 0;
            this.f16652d = 0;
            this.f16653e = -1;
            this.f16654f = -1;
            this.f16655g = 0;
            this.f16656h = 0;
            this.f16663p = new Rect();
        }
    }
}
