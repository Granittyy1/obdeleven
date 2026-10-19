package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f16947b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16948a;

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f16949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Field f16950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f16951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f16952d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f16949a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f16950b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f16951c = declaredField3;
                declaredField3.setAccessible(true);
                f16952d = true;
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class d extends c {
        public d() {
        }

        @Override // androidx.core.view.n0.e
        public void c(int i10, p222s0.b bVar) {
            this.f16959c.setInsets(l.a(i10), bVar.d());
        }

        public d(n0 n0Var) {
            super(n0Var);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f16960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p222s0.b[] f16961b;

        public e() {
            this(new n0((n0) null));
        }

        public final void a() {
            p222s0.b[] bVarArr = this.f16961b;
            if (bVarArr != null) {
                p222s0.b bVarG = bVarArr[0];
                p222s0.b bVarG2 = bVarArr[1];
                n0 n0Var = this.f16960a;
                if (bVarG2 == null) {
                    bVarG2 = n0Var.f16948a.g(2);
                }
                if (bVarG == null) {
                    bVarG = n0Var.f16948a.g(1);
                }
                g(p222s0.b.a(bVarG, bVarG2));
                p222s0.b bVar = this.f16961b[4];
                if (bVar != null) {
                    f(bVar);
                }
                p222s0.b bVar2 = this.f16961b[5];
                if (bVar2 != null) {
                    d(bVar2);
                }
                p222s0.b bVar3 = this.f16961b[6];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        public n0 b() {
            throw null;
        }

        public void c(int i10, p222s0.b bVar) {
            char c10;
            if (this.f16961b == null) {
                this.f16961b = new p222s0.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    p222s0.b[] bVarArr = this.f16961b;
                    if (i11 != 1) {
                        c10 = 2;
                        if (i11 == 2) {
                            c10 = 1;
                        } else if (i11 != 4) {
                            c10 = '\b';
                            if (i11 == 8) {
                                c10 = 3;
                            } else if (i11 == 16) {
                                c10 = 4;
                            } else if (i11 == 32) {
                                c10 = 5;
                            } else if (i11 == 64) {
                                c10 = 6;
                            } else if (i11 == 128) {
                                c10 = 7;
                            } else if (i11 != 256) {
                                throw new IllegalArgumentException(J4.i.b(i11, "type needs to be >= FIRST and <= LAST, type="));
                            }
                        }
                    } else {
                        c10 = 0;
                    }
                    bVarArr[c10] = bVar;
                }
            }
        }

        public void e(p222s0.b bVar) {
            throw null;
        }

        public void g(p222s0.b bVar) {
            throw null;
        }

        public e(n0 n0Var) {
            this.f16960a = n0Var;
        }

        public void d(p222s0.b bVar) {
        }

        public void f(p222s0.b bVar) {
        }

        public void h(p222s0.b bVar) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class h extends g {
        public h(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        @Override // androidx.core.view.n0.k
        public n0 a() {
            return n0.h(null, this.f16966c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f16966c, hVar.f16966c) && Objects.equals(this.f16970g, hVar.f16970g);
        }

        @Override // androidx.core.view.n0.k
        public C1296k f() {
            DisplayCutout displayCutout = this.f16966c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C1296k(displayCutout);
        }

        @Override // androidx.core.view.n0.k
        public int hashCode() {
            return this.f16966c.hashCode();
        }

        public h(n0 n0Var, h hVar) {
            super(n0Var, hVar);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class j extends i {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final n0 f16975q = n0.h(null, WindowInsets.CONSUMED);

        public j(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public p222s0.b g(int i10) {
            return p222s0.b.c(this.f16966c.getInsets(l.a(i10)));
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public p222s0.b h(int i10) {
            return p222s0.b.c(this.f16966c.getInsetsIgnoringVisibility(l.a(i10)));
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public boolean q(int i10) {
            return this.f16966c.isVisible(l.a(i10));
        }

        public j(n0 n0Var, j jVar) {
            super(n0Var, jVar);
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class l {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16947b = j.f16975q;
        } else {
            f16947b = k.f16976b;
        }
    }

    public n0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16948a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f16948a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f16948a = new h(this, windowInsets);
        } else {
            this.f16948a = new g(this, windowInsets);
        }
    }

    public static p222s0.b e(p222s0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f46851a - i10);
        int iMax2 = Math.max(0, bVar.f46852b - i11);
        int iMax3 = Math.max(0, bVar.f46853c - i12);
        int iMax4 = Math.max(0, bVar.f46854d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : p222s0.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static n0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        n0 n0Var = new n0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            n0 n0VarA = O.e.a(view);
            k kVar = n0Var.f16948a;
            kVar.t(n0VarA);
            kVar.d(view.getRootView());
        }
        return n0Var;
    }

    @Deprecated
    public final int a() {
        return this.f16948a.l().f46854d;
    }

    @Deprecated
    public final int b() {
        return this.f16948a.l().f46851a;
    }

    @Deprecated
    public final int c() {
        return this.f16948a.l().f46853c;
    }

    @Deprecated
    public final int d() {
        return this.f16948a.l().f46852b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return Objects.equals(this.f16948a, ((n0) obj).f16948a);
    }

    @Deprecated
    public final n0 f(int i10, int i11, int i12, int i13) {
        e cVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            cVar = new d(this);
        } else {
            cVar = i14 >= 29 ? new c(this) : new b(this);
        }
        cVar.g(p222s0.b.b(i10, i11, i12, i13));
        return cVar.b();
    }

    public final WindowInsets g() {
        k kVar = this.f16948a;
        if (kVar instanceof f) {
            return ((f) kVar).f16966c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f16948a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f16953e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f16954f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f16955g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f16956h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f16957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p222s0.b f16958d;

        public b() {
            this.f16957c = i();
        }

        private static WindowInsets i() {
            if (!f16954f) {
                try {
                    f16953e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f16954f = true;
            }
            Field field = f16953e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f16956h) {
                try {
                    f16955g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f16956h = true;
            }
            Constructor<WindowInsets> constructor = f16955g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.n0.e
        public n0 b() {
            a();
            n0 n0VarH = n0.h(null, this.f16957c);
            p222s0.b[] bVarArr = this.f16961b;
            k kVar = n0VarH.f16948a;
            kVar.r(bVarArr);
            kVar.u(this.f16958d);
            return n0VarH;
        }

        @Override // androidx.core.view.n0.e
        public void e(p222s0.b bVar) {
            this.f16958d = bVar;
        }

        @Override // androidx.core.view.n0.e
        public void g(p222s0.b bVar) {
            WindowInsets windowInsets = this.f16957c;
            if (windowInsets != null) {
                this.f16957c = windowInsets.replaceSystemWindowInsets(bVar.f46851a, bVar.f46852b, bVar.f46853c, bVar.f46854d);
            }
        }

        public b(n0 n0Var) {
            super(n0Var);
            this.f16957c = n0Var.g();
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f16959c;

        public c() {
            this.f16959c = androidx.compose.foundation.L.b();
        }

        @Override // androidx.core.view.n0.e
        public n0 b() {
            a();
            n0 n0VarH = n0.h(null, this.f16959c.build());
            n0VarH.f16948a.r(this.f16961b);
            return n0VarH;
        }

        @Override // androidx.core.view.n0.e
        public void d(p222s0.b bVar) {
            this.f16959c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // androidx.core.view.n0.e
        public void e(p222s0.b bVar) {
            this.f16959c.setStableInsets(bVar.d());
        }

        @Override // androidx.core.view.n0.e
        public void f(p222s0.b bVar) {
            this.f16959c.setSystemGestureInsets(bVar.d());
        }

        @Override // androidx.core.view.n0.e
        public void g(p222s0.b bVar) {
            this.f16959c.setSystemWindowInsets(bVar.d());
        }

        @Override // androidx.core.view.n0.e
        public void h(p222s0.b bVar) {
            this.f16959c.setTappableElementInsets(bVar.d());
        }

        public c(n0 n0Var) {
            WindowInsets.Builder builderB;
            super(n0Var);
            WindowInsets windowInsetsG = n0Var.g();
            if (windowInsetsG != null) {
                builderB = I3.f.b(windowInsetsG);
            } else {
                builderB = androidx.compose.foundation.L.b();
            }
            this.f16959c = builderB;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class g extends f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p222s0.b f16971m;

        public g(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
            this.f16971m = null;
        }

        @Override // androidx.core.view.n0.k
        public n0 b() {
            return n0.h(null, this.f16966c.consumeStableInsets());
        }

        @Override // androidx.core.view.n0.k
        public n0 c() {
            return n0.h(null, this.f16966c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.n0.k
        public final p222s0.b j() {
            if (this.f16971m == null) {
                WindowInsets windowInsets = this.f16966c;
                this.f16971m = p222s0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f16971m;
        }

        @Override // androidx.core.view.n0.k
        public boolean o() {
            return this.f16966c.isConsumed();
        }

        @Override // androidx.core.view.n0.k
        public void u(p222s0.b bVar) {
            this.f16971m = bVar;
        }

        public g(n0 n0Var, g gVar) {
            super(n0Var, gVar);
            this.f16971m = null;
            this.f16971m = gVar.f16971m;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class f extends k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f16962h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f16963i;
        public static Class<?> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f16964k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f16965l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f16966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p222s0.b[] f16967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p222s0.b f16968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n0 f16969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p222s0.b f16970g;

        public f(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var);
            this.f16968e = null;
            this.f16966c = windowInsets;
        }

        private static void A() {
            try {
                f16963i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                f16964k = cls.getDeclaredField("mVisibleInsets");
                f16965l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f16964k.setAccessible(true);
                f16965l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f16962h = true;
        }

        private p222s0.b v(int i10, boolean z10) {
            p222s0.b bVarA = p222s0.b.f46850e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = p222s0.b.a(bVarA, w(i11, z10));
                }
            }
            return bVarA;
        }

        private p222s0.b x() {
            n0 n0Var = this.f16969f;
            return n0Var != null ? n0Var.f16948a.j() : p222s0.b.f46850e;
        }

        private p222s0.b y(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f16962h) {
                A();
            }
            Method method = f16963i;
            if (method != null && j != null && f16964k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) f16964k.get(f16965l.get(objInvoke));
                    if (rect != null) {
                        return p222s0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.n0.k
        public void d(View view) {
            p222s0.b bVarY = y(view);
            if (bVarY == null) {
                bVarY = p222s0.b.f46850e;
            }
            s(bVarY);
        }

        @Override // androidx.core.view.n0.k
        public void e(n0 n0Var) {
            n0Var.f16948a.t(this.f16969f);
            n0Var.f16948a.s(this.f16970g);
        }

        @Override // androidx.core.view.n0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f16970g, ((f) obj).f16970g);
            }
            return false;
        }

        @Override // androidx.core.view.n0.k
        public p222s0.b g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.n0.k
        public p222s0.b h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.n0.k
        public final p222s0.b l() {
            if (this.f16968e == null) {
                WindowInsets windowInsets = this.f16966c;
                this.f16968e = p222s0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f16968e;
        }

        @Override // androidx.core.view.n0.k
        public n0 n(int i10, int i11, int i12, int i13) {
            e cVar;
            n0 n0VarH = n0.h(null, this.f16966c);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                cVar = new d(n0VarH);
            } else {
                cVar = i14 >= 29 ? new c(n0VarH) : new b(n0VarH);
            }
            cVar.g(n0.e(l(), i10, i11, i12, i13));
            cVar.e(n0.e(j(), i10, i11, i12, i13));
            return cVar.b();
        }

        @Override // androidx.core.view.n0.k
        public boolean p() {
            return this.f16966c.isRound();
        }

        @Override // androidx.core.view.n0.k
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.n0.k
        public void r(p222s0.b[] bVarArr) {
            this.f16967d = bVarArr;
        }

        @Override // androidx.core.view.n0.k
        public void s(p222s0.b bVar) {
            this.f16970g = bVar;
        }

        @Override // androidx.core.view.n0.k
        public void t(n0 n0Var) {
            this.f16969f = n0Var;
        }

        public p222s0.b w(int i10, boolean z10) {
            p222s0.b bVarJ;
            int i11;
            if (i10 == 1) {
                return z10 ? p222s0.b.b(0, Math.max(x().f46852b, l().f46852b), 0, 0) : p222s0.b.b(0, l().f46852b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    p222s0.b bVarX = x();
                    p222s0.b bVarJ2 = j();
                    return p222s0.b.b(Math.max(bVarX.f46851a, bVarJ2.f46851a), 0, Math.max(bVarX.f46853c, bVarJ2.f46853c), Math.max(bVarX.f46854d, bVarJ2.f46854d));
                }
                p222s0.b bVarL = l();
                n0 n0Var = this.f16969f;
                bVarJ = n0Var != null ? n0Var.f16948a.j() : null;
                int iMin = bVarL.f46854d;
                if (bVarJ != null) {
                    iMin = Math.min(iMin, bVarJ.f46854d);
                }
                return p222s0.b.b(bVarL.f46851a, 0, bVarL.f46853c, iMin);
            }
            p222s0.b bVar = p222s0.b.f46850e;
            if (i10 == 8) {
                p222s0.b[] bVarArr = this.f16967d;
                bVarJ = bVarArr != null ? bVarArr[3] : null;
                if (bVarJ != null) {
                    return bVarJ;
                }
                p222s0.b bVarL2 = l();
                p222s0.b bVarX2 = x();
                int i12 = bVarL2.f46854d;
                if (i12 > bVarX2.f46854d) {
                    return p222s0.b.b(0, 0, 0, i12);
                }
                p222s0.b bVar2 = this.f16970g;
                return (bVar2 == null || bVar2.equals(bVar) || (i11 = this.f16970g.f46854d) <= bVarX2.f46854d) ? bVar : p222s0.b.b(0, 0, 0, i11);
            }
            if (i10 == 16) {
                return k();
            }
            if (i10 == 32) {
                return i();
            }
            if (i10 == 64) {
                return m();
            }
            if (i10 != 128) {
                return bVar;
            }
            n0 n0Var2 = this.f16969f;
            C1296k c1296kF = n0Var2 != null ? n0Var2.f16948a.f() : f();
            if (c1296kF == null) {
                return bVar;
            }
            int i13 = Build.VERSION.SDK_INT;
            return p222s0.b.b(i13 >= 28 ? C1296k.a.d(c1296kF.f16941a) : 0, i13 >= 28 ? C1296k.a.f(c1296kF.f16941a) : 0, i13 >= 28 ? C1296k.a.e(c1296kF.f16941a) : 0, i13 >= 28 ? C1296k.a.c(c1296kF.f16941a) : 0);
        }

        public boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(p222s0.b.f46850e);
        }

        public f(n0 n0Var, f fVar) {
            this(n0Var, new WindowInsets(fVar.f16966c));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class i extends h {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p222s0.b f16972n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p222s0.b f16973o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p222s0.b f16974p;

        public i(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
            this.f16972n = null;
            this.f16973o = null;
            this.f16974p = null;
        }

        @Override // androidx.core.view.n0.k
        public p222s0.b i() {
            if (this.f16973o == null) {
                this.f16973o = p222s0.b.c(this.f16966c.getMandatorySystemGestureInsets());
            }
            return this.f16973o;
        }

        @Override // androidx.core.view.n0.k
        public p222s0.b k() {
            if (this.f16972n == null) {
                this.f16972n = p222s0.b.c(this.f16966c.getSystemGestureInsets());
            }
            return this.f16972n;
        }

        @Override // androidx.core.view.n0.k
        public p222s0.b m() {
            if (this.f16974p == null) {
                this.f16974p = p222s0.b.c(this.f16966c.getTappableElementInsets());
            }
            return this.f16974p;
        }

        @Override // androidx.core.view.n0.f, androidx.core.view.n0.k
        public n0 n(int i10, int i11, int i12, int i13) {
            return n0.h(null, this.f16966c.inset(i10, i11, i12, i13));
        }

        public i(n0 n0Var, i iVar) {
            super(n0Var, iVar);
            this.f16972n = null;
            this.f16973o = null;
            this.f16974p = null;
        }

        @Override // androidx.core.view.n0.g, androidx.core.view.n0.k
        public void u(p222s0.b bVar) {
        }
    }

    public n0(n0 n0Var) {
        if (n0Var != null) {
            k kVar = n0Var.f16948a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (kVar instanceof j)) {
                this.f16948a = new j(this, (j) kVar);
            } else if (i10 >= 29 && (kVar instanceof i)) {
                this.f16948a = new i(this, (i) kVar);
            } else if (i10 >= 28 && (kVar instanceof h)) {
                this.f16948a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.f16948a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.f16948a = new f(this, (f) kVar);
            } else {
                this.f16948a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.f16948a = new k(this);
    }

    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n0 f16976b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f16977a;

        static {
            e cVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                cVar = new d();
            } else {
                cVar = i10 >= 29 ? new c() : new b();
            }
            f16976b = cVar.b().f16948a.a().f16948a.b().f16948a.c();
        }

        public k(n0 n0Var) {
            this.f16977a = n0Var;
        }

        public n0 a() {
            return this.f16977a;
        }

        public n0 b() {
            return this.f16977a;
        }

        public n0 c() {
            return this.f16977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && Objects.equals(l(), kVar.l()) && Objects.equals(j(), kVar.j()) && Objects.equals(f(), kVar.f());
        }

        public C1296k f() {
            return null;
        }

        public p222s0.b g(int i10) {
            return p222s0.b.f46850e;
        }

        public p222s0.b h(int i10) {
            if ((i10 & 8) == 0) {
                return p222s0.b.f46850e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public p222s0.b i() {
            return l();
        }

        public p222s0.b j() {
            return p222s0.b.f46850e;
        }

        public p222s0.b k() {
            return l();
        }

        public p222s0.b l() {
            return p222s0.b.f46850e;
        }

        public p222s0.b m() {
            return l();
        }

        public n0 n(int i10, int i11, int i12, int i13) {
            return f16976b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void d(View view) {
        }

        public void e(n0 n0Var) {
        }

        public void r(p222s0.b[] bVarArr) {
        }

        public void s(p222s0.b bVar) {
        }

        public void t(n0 n0Var) {
        }

        public void u(p222s0.b bVar) {
        }
    }
}
