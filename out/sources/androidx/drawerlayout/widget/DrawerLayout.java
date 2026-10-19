package androidx.drawerlayout.widget;

import B0.s;
import B0.u;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.core.view.n0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f17290E = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f17291F = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean f17292G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final boolean f17293H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final boolean f17294I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList<View> f17295A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Rect f17296B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Matrix f17297C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final a f17298D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f17304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L0.c f17305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L0.c f17306i;
    public final h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f17307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17314r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17315s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f17316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f17317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f17318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f17319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f17320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WindowInsets f17321y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f17322z;

    public class a implements u {
        public a() {
        }

        @Override // B0.u
        public final boolean a(View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (!DrawerLayout.o(view) || drawerLayout.j(view) == 2) {
                return false;
            }
            drawerLayout.c(view, true);
            return true;
        }
    }

    public class b extends C1286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f17324a = new Rect();

        public b() {
        }

        @Override // androidx.core.view.C1286a
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewH = drawerLayout.h();
            if (viewH == null) {
                return true;
            }
            int iK = drawerLayout.k(viewH);
            drawerLayout.getClass();
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            Gravity.getAbsoluteGravity(iK, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            if (DrawerLayout.f17292G) {
                super.onInitializeAccessibilityNodeInfo(view, sVar);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(sVar.f1411a);
                super.onInitializeAccessibilityNodeInfo(view, new s(accessibilityNodeInfoObtain));
                sVar.f1413c = -1;
                AccessibilityNodeInfo accessibilityNodeInfo = sVar.f1411a;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    sVar.f1412b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                Rect rect = this.f17324a;
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                sVar.h(rect);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                sVar.i(accessibilityNodeInfoObtain.getClassName());
                accessibilityNodeInfo.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                sVar.a(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.m(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            sVar.i("androidx.drawerlayout.widget.DrawerLayout");
            AccessibilityNodeInfo accessibilityNodeInfo2 = sVar.f1411a;
            accessibilityNodeInfo2.setFocusable(false);
            accessibilityNodeInfo2.setFocused(false);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) s.a.f1414e.f1428a);
            accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) s.a.f1415f.f1428a);
        }

        @Override // androidx.core.view.C1286a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f17292G || DrawerLayout.m(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class c extends C1286a {
        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            if (DrawerLayout.m(view)) {
                return;
            }
            sVar.f1412b = -1;
            sVar.f1411a.setParent(null);
        }
    }

    public interface d {
        void a(float f10);

        void b(View view);

        void c(View view);
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f17327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17329d;
    }

    public static class f extends K0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17334h;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17330d = 0;
            this.f17330d = parcel.readInt();
            this.f17331e = parcel.readInt();
            this.f17332f = parcel.readInt();
            this.f17333g = parcel.readInt();
            this.f17334h = parcel.readInt();
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f17330d);
            parcel.writeInt(this.f17331e);
            parcel.writeInt(this.f17332f);
            parcel.writeInt(this.f17333g);
            parcel.writeInt(this.f17334h);
        }
    }

    public class h extends L0.c.AbstractC0064c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L0.c f17336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f17337c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View viewF;
                int width;
                h hVar = h.this;
                int i10 = hVar.f17336b.f4414o;
                int i11 = hVar.f17335a;
                boolean z10 = i11 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z10) {
                    viewF = drawerLayout.f(3);
                    width = (viewF != null ? -viewF.getWidth() : 0) + i10;
                } else {
                    viewF = drawerLayout.f(5);
                    width = drawerLayout.getWidth() - i10;
                }
                if (viewF != null) {
                    if (((!z10 || viewF.getLeft() >= width) && (z10 || viewF.getLeft() <= width)) || drawerLayout.j(viewF) != 0) {
                        return;
                    }
                    e eVar = (e) viewF.getLayoutParams();
                    hVar.f17336b.s(viewF, width, viewF.getTop());
                    eVar.f17328c = true;
                    drawerLayout.invalidate();
                    View viewF2 = drawerLayout.f(i11 == 3 ? 5 : 3);
                    if (viewF2 != null) {
                        drawerLayout.c(viewF2, true);
                    }
                    if (drawerLayout.f17315s) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        drawerLayout.getChildAt(i12).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.f17315s = true;
                }
            }
        }

        public h(int i10) {
            this.f17335a = i10;
        }

        @Override // L0.c.AbstractC0064c
        public final int a(int i10, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // L0.c.AbstractC0064c
        public final int b(int i10, View view) {
            return view.getTop();
        }

        @Override // L0.c.AbstractC0064c
        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.p(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // L0.c.AbstractC0064c
        public final void e(int i10, int i11) {
            int i12 = i10 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = i12 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
            if (viewF == null || drawerLayout.j(viewF) != 0) {
                return;
            }
            this.f17336b.b(i11, viewF);
        }

        @Override // L0.c.AbstractC0064c
        public final void f() {
            DrawerLayout.this.postDelayed(this.f17337c, 160L);
        }

        @Override // L0.c.AbstractC0064c
        public final void g(int i10, View view) {
            ((e) view.getLayoutParams()).f17328c = false;
            int i11 = this.f17335a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = drawerLayout.f(i11);
            if (viewF != null) {
                drawerLayout.c(viewF, true);
            }
        }

        @Override // L0.c.AbstractC0064c
        public final void h(int i10) {
            DrawerLayout.this.w(i10, this.f17336b.f4419t);
        }

        @Override // L0.c.AbstractC0064c
        public final void i(View view, int i10, int i11) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.b(3, view) ? i10 + width : drawerLayout.getWidth() - i10) / width;
            drawerLayout.t(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // L0.c.AbstractC0064c
        public final void j(View view, float f10, float f11) {
            int i10;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f12 = ((e) view.getLayoutParams()).f17327b;
            int width = view.getWidth();
            if (drawerLayout.b(3, view)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && f12 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f17336b.q(i10, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // L0.c.AbstractC0064c
        public final boolean k(int i10, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.p(view) && drawerLayout.b(this.f17335a, view) && drawerLayout.j(view) == 0;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f17292G = true;
        f17293H = true;
        f17294I = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.drawerLayoutStyle);
        this.f17299b = new c();
        this.f17302e = -1728053248;
        this.f17304g = new Paint();
        this.f17310n = true;
        this.f17311o = 3;
        this.f17312p = 3;
        this.f17313q = 3;
        this.f17314r = 3;
        this.f17298D = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f17301d = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.j = hVar;
        h hVar2 = new h(5);
        this.f17307k = hVar2;
        L0.c cVar = new L0.c(getContext(), this, hVar);
        cVar.f4402b = (int) (cVar.f4402b * 1.0f);
        this.f17305h = cVar;
        cVar.f4416q = 1;
        cVar.f4413n = f11;
        hVar.f17336b = cVar;
        L0.c cVar2 = new L0.c(getContext(), this, hVar2);
        cVar2.f4402b = (int) (1.0f * cVar2.f4402b);
        this.f17306i = cVar2;
        cVar2.f4416q = 2;
        cVar2.f4413n = f11;
        hVar2.f17336b = cVar2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setImportantForAccessibility(1);
        O.n(this, new b());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new Q0.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17290E);
            try {
                this.f17320x = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, P0.a.f4883a, com.voltasit.obdeleven.R.attr.drawerLayoutStyle, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f17300c = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f17300c = getResources().getDimension(com.voltasit.obdeleven.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f17295A = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String l(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public static boolean m(View view) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean n(View view) {
        return ((e) view.getLayoutParams()).f17326a == 0;
    }

    public static boolean o(View view) {
        if (p(view)) {
            return (((e) view.getLayoutParams()).f17329d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean p(View view) {
        int i10 = ((e) view.getLayoutParams()).f17326a;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean q(View view) {
        if (p(view)) {
            return ((e) view.getLayoutParams()).f17327b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void a(d dVar) {
        if (dVar == null) {
            return;
        }
        if (this.f17317u == null) {
            this.f17317u = new ArrayList();
        }
        this.f17317u.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.f17295A;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (!p(childAt)) {
                arrayList2.add(childAt);
            } else if (o(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (g() != null || p(view)) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
            view.setImportantForAccessibility(1);
        }
        if (f17292G) {
            return;
        }
        O.n(view, this.f17299b);
    }

    public final boolean b(int i10, View view) {
        return (k(view) & i10) == i10;
    }

    public final void c(View view, boolean z10) {
        if (!p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f17310n) {
            eVar.f17327b = 0.0f;
            eVar.f17329d = 0;
        } else if (z10) {
            eVar.f17329d |= 4;
            if (b(3, view)) {
                this.f17305h.s(view, -view.getWidth(), view.getTop());
            } else {
                this.f17306i.s(view, getWidth(), view.getTop());
            }
        } else {
            float f10 = ((e) view.getLayoutParams()).f17327b;
            float width = view.getWidth();
            int i10 = ((int) (width * 0.0f)) - ((int) (f10 * width));
            if (!b(3, view)) {
                i10 = -i10;
            }
            view.offsetLeftAndRight(i10);
            t(view, 0.0f);
            w(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((e) getChildAt(i10).getLayoutParams()).f17327b);
        }
        this.f17303f = fMax;
        boolean zG = this.f17305h.g();
        boolean zG2 = this.f17306i.g();
        if (zG || zG2) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        View viewF = f(8388611);
        if (viewF != null) {
            c(viewF, true);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + l(8388611));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f17303f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (this.f17296B == null) {
                this.f17296B = new Rect();
            }
            childAt.getHitRect(this.f17296B);
            if (this.f17296B.contains((int) x10, (int) y10) && !n(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f17297C == null) {
                            this.f17297C = new Matrix();
                        }
                        matrix.invert(this.f17297C);
                        motionEventObtain.transform(this.f17297C);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zN = n(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zN) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && p(childAt) && childAt.getHeight() >= height) {
                    if (b(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f10 = this.f17303f;
        if (f10 > 0.0f && zN) {
            int i13 = this.f17302e;
            Paint paint = this.f17304g;
            paint.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final void e(boolean z10) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (p(childAt) && (!z10 || eVar.f17328c)) {
                zS |= b(3, childAt) ? this.f17305h.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f17306i.s(childAt, getWidth(), childAt.getTop());
                eVar.f17328c = false;
            }
        }
        h hVar = this.j;
        DrawerLayout.this.removeCallbacks(hVar.f17337c);
        h hVar2 = this.f17307k;
        DrawerLayout.this.removeCallbacks(hVar2.f17337c);
        if (zS) {
            invalidate();
        }
    }

    public final View f(int i10) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f17329d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.f17326a = 0;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            e eVar = (e) layoutParams;
            e eVar2 = new e(eVar);
            eVar2.f17326a = 0;
            eVar2.f17326a = eVar.f17326a;
            return eVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e eVar3 = new e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar3.f17326a = 0;
            return eVar3;
        }
        e eVar4 = new e(layoutParams);
        eVar4.f17326a = 0;
        return eVar4;
    }

    public float getDrawerElevation() {
        if (f17293H) {
            return this.f17300c;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f17320x;
    }

    public final View h() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (p(childAt) && q(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int i(int i10) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int layoutDirection = getLayoutDirection();
        if (i10 == 3) {
            int i11 = this.f17311o;
            if (i11 != 3) {
                return i11;
            }
            int i12 = layoutDirection == 0 ? this.f17313q : this.f17314r;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f17312p;
            if (i13 != 3) {
                return i13;
            }
            int i14 = layoutDirection == 0 ? this.f17314r : this.f17313q;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f17313q;
            if (i15 != 3) {
                return i15;
            }
            int i16 = layoutDirection == 0 ? this.f17311o : this.f17312p;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f17314r;
        if (i17 != 3) {
            return i17;
        }
        int i18 = layoutDirection == 0 ? this.f17312p : this.f17311o;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public final int j(View view) {
        if (p(view)) {
            return i(((e) view.getLayoutParams()).f17326a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int k(View view) {
        int i10 = ((e) view.getLayoutParams()).f17326a;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return Gravity.getAbsoluteGravity(i10, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17310n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17310n = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f17322z || this.f17320x == null) {
            return;
        }
        WindowInsets windowInsets = this.f17321y;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f17320x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f17320x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        L0.c cVar = this.f17305h;
        boolean zR = cVar.r(motionEvent) | this.f17306i.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e(true);
                this.f17315s = false;
            } else if (actionMasked == 2) {
                int length = cVar.f4404d.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if ((cVar.f4410k & (1 << i10)) != 0) {
                        float f10 = cVar.f4406f[i10] - cVar.f4404d[i10];
                        float f11 = cVar.f4407g[i10] - cVar.f4405e[i10];
                        float f12 = (f11 * f11) + (f10 * f10);
                        int i11 = cVar.f4402b;
                        if (f12 > i11 * i11) {
                            h hVar = this.j;
                            DrawerLayout.this.removeCallbacks(hVar.f17337c);
                            h hVar2 = this.f17307k;
                            DrawerLayout.this.removeCallbacks(hVar2.f17337c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                e(true);
                this.f17315s = false;
            }
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f17318v = x10;
            this.f17319w = y10;
            z10 = this.f17303f > 0.0f && (viewH = cVar.h((int) x10, (int) y10)) != null && n(viewH);
            this.f17315s = false;
        }
        if (zR || z10) {
            return true;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (((e) getChildAt(i12).getLayoutParams()).f17328c) {
                return true;
            }
        }
        return this.f17315s;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || h() == null) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewH = h();
        if (viewH != null && j(viewH) == 0) {
            e(false);
        }
        return viewH != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f17309m = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (n(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(3, childAt)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f17327b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (eVar.f17327b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z12 = f10 != eVar.f17327b ? z11 : false;
                    int i19 = eVar.f17326a & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z12) {
                        t(childAt, f10);
                    }
                    int i27 = eVar.f17327b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f17294I && (rootWindowInsets = getRootWindowInsets()) != null) {
            p222s0.b bVarK = n0.h(null, rootWindowInsets).f16948a.k();
            L0.c cVar = this.f17305h;
            cVar.f4414o = Math.max(cVar.f4415p, bVarK.f46851a);
            L0.c cVar2 = this.f17306i;
            cVar2.f4414o = Math.max(cVar2.f4415p, bVarK.f46853c);
        }
        this.f17309m = false;
        this.f17310n = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i12 = 0;
        if (this.f17321y != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            if (getFitsSystemWindows()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z10) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f17326a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.f17321y;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.f17321y;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(i12, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (n(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!p(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f17293H) {
                        float fI = O.d.i(childAt);
                        float f10 = this.f17300c;
                        if (fI != f10) {
                            O.d.s(childAt, f10);
                        }
                    }
                    int iK = k(childAt) & 7;
                    int i14 = iK == 3 ? 1 : i12;
                    if ((i14 != 0 && z11) || (i14 == 0 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + l(iK) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f17301d + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
            i13++;
            i12 = 0;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewF;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f4135b);
        int i10 = fVar.f17330d;
        if (i10 != 0 && (viewF = f(i10)) != null) {
            r(viewF);
        }
        int i11 = fVar.f17331e;
        if (i11 != 3) {
            s(i11, 3);
        }
        int i12 = fVar.f17332f;
        if (i12 != 3) {
            s(i12, 5);
        }
        int i13 = fVar.f17333g;
        if (i13 != 3) {
            s(i13, 8388611);
        }
        int i14 = fVar.f17334h;
        if (i14 != 3) {
            s(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (f17293H) {
            return;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f17330d = 0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f17329d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                fVar.f17330d = eVar.f17326a;
                break;
            }
        }
        fVar.f17331e = this.f17311o;
        fVar.f17332f = this.f17312p;
        fVar.f17333g = this.f17313q;
        fVar.f17334h = this.f17314r;
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewG;
        L0.c cVar = this.f17305h;
        cVar.k(motionEvent);
        this.f17306i.k(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f17318v = x10;
            this.f17319w = y10;
            this.f17315s = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View viewH = cVar.h((int) x11, (int) y11);
            if (viewH != null && n(viewH)) {
                float f10 = x11 - this.f17318v;
                float f11 = y11 - this.f17319w;
                int i10 = cVar.f4402b;
                z10 = (f11 * f11) + (f10 * f10) >= ((float) (i10 * i10)) || (viewG = g()) == null || j(viewG) == 2;
            }
            e(z10);
        } else if (action == 3) {
            e(true);
            this.f17315s = false;
        }
        return true;
    }

    public final void r(View view) {
        if (!p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        e eVar = (e) view.getLayoutParams();
        if (this.f17310n) {
            eVar.f17327b = 1.0f;
            eVar.f17329d = 1;
            v(view, true);
            u(view);
        } else {
            eVar.f17329d |= 2;
            if (b(3, view)) {
                this.f17305h.s(view, 0, view.getTop());
            } else {
                this.f17306i.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f17309m) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i10, int i11) {
        View viewF;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
        if (i11 == 3) {
            this.f17311o = i10;
        } else if (i11 == 5) {
            this.f17312p = i10;
        } else if (i11 == 8388611) {
            this.f17313q = i10;
        } else if (i11 == 8388613) {
            this.f17314r = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f17305h : this.f17306i).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewF = f(absoluteGravity)) != null) {
                r(viewF);
                return;
            }
            return;
        }
        View viewF2 = f(absoluteGravity);
        if (viewF2 != null) {
            c(viewF2, true);
        }
    }

    public void setDrawerElevation(float f10) {
        this.f17300c = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (p(childAt)) {
                float f11 = this.f17300c;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                O.d.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.f17316t;
        if (dVar2 != null && (arrayList = this.f17317u) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            a(dVar);
        }
        this.f17316t = dVar;
    }

    public void setDrawerLockMode(int i10) {
        s(i10, 3);
        s(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f17302e = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f17320x = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f17320x = new ColorDrawable(i10);
        invalidate();
    }

    public final void t(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 == eVar.f17327b) {
            return;
        }
        eVar.f17327b = f10;
        ArrayList arrayList = this.f17317u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((d) this.f17317u.get(size)).a(f10);
            }
        }
    }

    public final void u(View view) {
        s.a aVar = s.a.f1423o;
        O.k(aVar.a(), view);
        O.h(0, view);
        if (!o(view) || j(view) == 2) {
            return;
        }
        O.l(view, aVar, this.f17298D);
    }

    public final void v(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || p(childAt)) && !(z10 && childAt == view)) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void w(int i10, View view) {
        int i11;
        View rootView;
        int i12 = this.f17305h.f4401a;
        int i13 = this.f17306i.f4401a;
        if (i12 == 1 || i13 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (i12 != 2 && i13 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((e) view.getLayoutParams()).f17327b;
            if (f10 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f17329d & 1) == 1) {
                    eVar.f17329d = 0;
                    ArrayList arrayList = this.f17317u;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((d) this.f17317u.get(size)).c(view);
                        }
                    }
                    v(view, false);
                    u(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f10 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f17329d & 1) == 0) {
                    eVar2.f17329d = 1;
                    ArrayList arrayList2 = this.f17317u;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((d) this.f17317u.get(size2)).b(view);
                        }
                    }
                    v(view, true);
                    u(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i11 != this.f17308l) {
            this.f17308l = i11;
            ArrayList arrayList3 = this.f17317u;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.f17317u.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f17320x = i10 != 0 ? p186p0.a.C0517a.b(getContext(), i10) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.f17326a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17291F);
        eVar.f17326a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }

    public static abstract class g implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public final void a(float f10) {
        }
    }
}
