package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.Path;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements androidx.compose.ui.node.T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ia.p<View, Matrix, p293xa.r> f14977q = new Ia.p<View, Matrix, p293xa.r>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // Ia.p
        public final p293xa.r invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f14978r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Method f14979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Field f14980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f14981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f14982v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f14983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1223h0 f14984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> f14985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<p293xa.r> f14986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1248u0 f14987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f14989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14990i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.graphics.F f14991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1237o0<View> f14992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f14995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14996p;

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((ViewLayer) view).f14987f.b();
            kotlin.jvm.internal.i.b(outlineB);
            outline.set(outlineB);
        }
    }

    /* JADX INFO: compiled from: ViewLayer.android.kt */
    public static final class b {
        public static void a(View view) {
            try {
                if (!ViewLayer.f14981u) {
                    ViewLayer.f14981u = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f14979s = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.f14980t = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f14979s = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f14980t = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f14979s;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f14980t;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f14980t;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f14979s;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                ViewLayer.f14982v = true;
            }
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, C1223h0 c1223h0, Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        super(androidComposeView.getContext());
        this.f14983b = androidComposeView;
        this.f14984c = c1223h0;
        this.f14985d = pVar;
        this.f14986e = aVar;
        this.f14987f = new C1248u0();
        this.f14991k = new androidx.compose.ui.graphics.F();
        this.f14992l = new C1237o0<>(f14977q);
        this.f14993m = androidx.compose.ui.graphics.q0.f13791b;
        this.f14994n = true;
        setWillNotDraw(false);
        c1223h0.addView(this);
        this.f14995o = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            C1248u0 c1248u0 = this.f14987f;
            if (c1248u0.f15101g) {
                c1248u0.e();
                return c1248u0.f15099e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f14990i) {
            this.f14990i = z10;
            this.f14983b.E(this, z10);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void a(float[] fArr) {
        androidx.compose.ui.graphics.a0.e(fArr, this.f14992l.b(this));
    }

    @Override // androidx.compose.ui.node.T
    public final void b() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f14983b;
        androidComposeView.f14658G = true;
        this.f14985d = null;
        this.f14986e = null;
        androidComposeView.N(this);
        this.f14984c.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.T
    public final boolean c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f14988g) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f14987f.c(j);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.T
    public final void d(androidx.compose.ui.graphics.i0 i0Var) {
        Ia.a<p293xa.r> aVar;
        int i10 = i0Var.f13630b | this.f14996p;
        if ((i10 & 4096) != 0) {
            long j = i0Var.f13642o;
            this.f14993m = j;
            setPivotX(androidx.compose.ui.graphics.q0.b(j) * getWidth());
            setPivotY(androidx.compose.ui.graphics.q0.c(this.f14993m) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(i0Var.f13631c);
        }
        if ((i10 & 2) != 0) {
            setScaleY(i0Var.f13632d);
        }
        if ((i10 & 4) != 0) {
            setAlpha(i0Var.f13633e);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(i0Var.f13634f);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(i0Var.f13635g);
        }
        if ((i10 & 32) != 0) {
            setElevation(i0Var.f13636h);
        }
        if ((i10 & 1024) != 0) {
            setRotation(i0Var.f13640m);
        }
        if ((i10 & 256) != 0) {
            setRotationX(i0Var.f13638k);
        }
        if ((i10 & 512) != 0) {
            setRotationY(i0Var.f13639l);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(i0Var.f13641n);
        }
        boolean z10 = true;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = i0Var.f13644q;
        androidx.compose.ui.graphics.h0.a aVar2 = androidx.compose.ui.graphics.h0.f13629a;
        boolean z13 = z12 && i0Var.f13643p != aVar2;
        if ((i10 & 24576) != 0) {
            this.f14988g = z12 && i0Var.f13643p == aVar2;
            m();
            setClipToOutline(z13);
        }
        boolean zD = this.f14987f.d(i0Var.f13649v, i0Var.f13633e, z13, i0Var.f13636h, i0Var.f13646s);
        C1248u0 c1248u0 = this.f14987f;
        if (c1248u0.f15100f) {
            setOutlineProvider(c1248u0.b() != null ? f14978r : null);
        }
        boolean z14 = getManualClipPath() != null;
        if (z11 != z14 || (z14 && zD)) {
            invalidate();
        }
        if (!this.j && getElevation() > 0.0f && (aVar = this.f14986e) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f14992l.c();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if ((i10 & 64) != 0) {
                setOutlineAmbientShadowColor(Q3.d.K(i0Var.f13637i));
            }
            if ((i10 & 128) != 0) {
                setOutlineSpotShadowColor(Q3.d.K(i0Var.j));
            }
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            setRenderEffect(null);
        }
        if ((i10 & 32768) != 0) {
            int i12 = i0Var.f13645r;
            if (androidx.compose.ui.graphics.O.a(i12, 1)) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.O.a(i12, 2)) {
                setLayerType(0, null);
                z10 = false;
            } else {
                setLayerType(0, null);
            }
            this.f14994n = z10;
        }
        this.f14996p = i0Var.f13630b;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        androidx.compose.ui.graphics.F f10 = this.f14991k;
        C1138n c1138n = f10.f13476a;
        Canvas canvas2 = c1138n.f13771a;
        c1138n.f13771a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            c1138n.g();
            this.f14987f.a(c1138n);
            z10 = true;
        }
        Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar = this.f14985d;
        if (pVar != null) {
            pVar.invoke(c1138n, null);
        }
        if (z10) {
            c1138n.o();
        }
        f10.f13476a.f13771a = canvas2;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.T
    public final long e(long j, boolean z10) {
        C1237o0<View> c1237o0 = this.f14992l;
        if (!z10) {
            return !c1237o0.f15081h ? androidx.compose.ui.graphics.a0.b(j, c1237o0.b(this)) : j;
        }
        float[] fArrA = c1237o0.a(this);
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return !c1237o0.f15081h ? androidx.compose.ui.graphics.a0.b(j, fArrA) : j;
    }

    @Override // androidx.compose.ui.node.T
    public final void f(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.q0.b(this.f14993m) * i10);
        setPivotY(androidx.compose.ui.graphics.q0.c(this.f14993m) * i11);
        setOutlineProvider(this.f14987f.b() != null ? f14978r : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        m();
        this.f14992l.c();
    }

    @Override // androidx.compose.ui.node.T
    public final void g(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        this.f14984c.addView(this);
        C1237o0<View> c1237o0 = this.f14992l;
        c1237o0.f15078e = false;
        c1237o0.f15079f = false;
        c1237o0.f15081h = true;
        c1237o0.f15080g = true;
        androidx.compose.ui.graphics.a0.d(c1237o0.f15076c);
        androidx.compose.ui.graphics.a0.d(c1237o0.f15077d);
        this.f14988g = false;
        this.j = false;
        this.f14993m = androidx.compose.ui.graphics.q0.f13791b;
        this.f14985d = pVar;
        this.f14986e = aVar;
        setInvalidated(false);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C1223h0 getContainer() {
        return this.f14984c;
    }

    public long getLayerId() {
        return this.f14995o;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f14983b;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f14983b.getUniqueDrawingId();
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.T
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo4getUnderlyingMatrixsQKQjiQ() {
        return this.f14992l.b(this);
    }

    @Override // androidx.compose.ui.node.T
    public final void h(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        boolean z10 = getElevation() > 0.0f;
        this.j = z10;
        if (z10) {
            e10.t();
        }
        this.f14984c.a(e10, this, getDrawingTime());
        if (this.j) {
            e10.h();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f14994n;
    }

    @Override // androidx.compose.ui.node.T
    public final void i(I.c cVar, boolean z10) {
        C1237o0<View> c1237o0 = this.f14992l;
        if (!z10) {
            float[] fArrB = c1237o0.b(this);
            if (c1237o0.f15081h) {
                return;
            }
            androidx.compose.ui.graphics.a0.c(fArrB, cVar);
            return;
        }
        float[] fArrA = c1237o0.a(this);
        if (fArrA != null) {
            if (c1237o0.f15081h) {
                return;
            }
            androidx.compose.ui.graphics.a0.c(fArrA, cVar);
        } else {
            cVar.f3750a = 0.0f;
            cVar.f3751b = 0.0f;
            cVar.f3752c = 0.0f;
            cVar.f3753d = 0.0f;
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.T
    public final void invalidate() {
        if (this.f14990i) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f14983b.invalidate();
    }

    @Override // androidx.compose.ui.node.T
    public final void j(float[] fArr) {
        float[] fArrA = this.f14992l.a(this);
        if (fArrA != null) {
            androidx.compose.ui.graphics.a0.e(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void k(long j) {
        int i10 = (int) (j >> 32);
        int left = getLeft();
        C1237o0<View> c1237o0 = this.f14992l;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            c1237o0.c();
        }
        int i11 = (int) (j & 4294967295L);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            c1237o0.c();
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void l() {
        if (!this.f14990i || f14982v) {
            return;
        }
        b.a(this);
        setInvalidated(false);
    }

    public final void m() {
        Rect rect;
        if (this.f14988g) {
            Rect rect2 = this.f14989h;
            if (rect2 == null) {
                this.f14989h = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.i.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f14989h;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
