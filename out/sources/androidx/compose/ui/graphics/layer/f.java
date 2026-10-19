package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import p293xa.r;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f13731A = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K.a f13732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f13733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f13734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f13735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f13736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13739i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f13754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f13755z;

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public f(K.a aVar) {
        F f10 = new F();
        J.a aVar2 = new J.a();
        this.f13732b = aVar;
        this.f13733c = f10;
        n nVar = new n(aVar, f10, aVar2);
        this.f13734d = nVar;
        this.f13735e = aVar.getResources();
        this.f13736f = new Rect();
        aVar.addView(nVar);
        nVar.setClipBounds(null);
        this.f13739i = 0L;
        View.generateViewId();
        this.f13742m = 3;
        this.f13743n = 0;
        this.f13744o = 1.0f;
        this.f13746q = 1.0f;
        this.f13747r = 1.0f;
        long j = H.f13495b;
        this.f13751v = j;
        this.f13752w = j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13752w = j;
            this.f13734d.setOutlineSpotShadowColor(Q3.d.K(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void B(long j, int i10, int i11) {
        boolean zB = p013b0.l.b(this.f13739i, j);
        n nVar = this.f13734d;
        if (zB) {
            int i12 = this.f13737g;
            if (i12 != i10) {
                nVar.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f13738h;
            if (i13 != i11) {
                nVar.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (M()) {
                this.j = true;
            }
            int i14 = (int) (j >> 32);
            int i15 = (int) (4294967295L & j);
            nVar.layout(i10, i11, i10 + i14, i11 + i15);
            this.f13739i = j;
            if (this.f13745p) {
                nVar.setPivotX(i14 / 2.0f);
                nVar.setPivotY(i15 / 2.0f);
            }
        }
        this.f13737g = i10;
        this.f13738h = i11;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float C() {
        return this.f13748s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float D() {
        return this.f13753x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void E(int i10) {
        this.f13743n = i10;
        if (androidx.compose.ui.graphics.layer.a.a(i10, 1) || !C1149z.a(this.f13742m, 3)) {
            L(1);
        } else {
            L(this.f13743n);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix F() {
        return this.f13734d.getMatrix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(p013b0.c cVar, LayoutDirection layoutDirection, b bVar, Ia.l<? super J.e, r> lVar) {
        n nVar = this.f13734d;
        ViewParent parent = nVar.getParent();
        K.a aVar = this.f13732b;
        if (parent == null) {
            aVar.addView(nVar);
        }
        nVar.f13767h = cVar;
        nVar.f13768i = layoutDirection;
        nVar.j = (Lambda) lVar;
        nVar.f13769k = bVar;
        if (nVar.isAttachedToWindow()) {
            nVar.setVisibility(4);
            nVar.setVisibility(0);
            try {
                F f10 = this.f13733c;
                a aVar2 = f13731A;
                C1138n c1138n = f10.f13476a;
                Canvas canvas = c1138n.f13771a;
                c1138n.f13771a = aVar2;
                aVar.a(c1138n, nVar, nVar.getDrawingTime());
                f10.f13476a.f13771a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f13750u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float I() {
        return this.f13747r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int J() {
        return this.f13742m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(E e10) {
        Rect rect;
        boolean z10 = this.j;
        n nVar = this.f13734d;
        if (z10) {
            if (!M() || this.f13740k) {
                rect = null;
            } else {
                rect = this.f13736f;
                rect.left = 0;
                rect.top = 0;
                rect.right = nVar.getWidth();
                rect.bottom = nVar.getHeight();
            }
            nVar.setClipBounds(rect);
        }
        if (C1139o.a(e10).isHardwareAccelerated()) {
            this.f13732b.a(e10, nVar, nVar.getDrawingTime());
        }
    }

    public final void L(int i10) {
        boolean z10 = true;
        boolean zA = androidx.compose.ui.graphics.layer.a.a(i10, 1);
        n nVar = this.f13734d;
        if (zA) {
            nVar.setLayerType(2, null);
        } else if (androidx.compose.ui.graphics.layer.a.a(i10, 2)) {
            nVar.setLayerType(0, null);
            z10 = false;
        } else {
            nVar.setLayerType(0, null);
        }
        nVar.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    public final boolean M() {
        return this.f13741l || this.f13734d.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f13744o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f10) {
        this.f13744o = f10;
        this.f13734d.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c() {
        this.f13732b.removeViewInLayout(this.f13734d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f10) {
        this.f13754y = f10;
        this.f13734d.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f13734d.setRenderEffect(null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f10) {
        this.f13755z = f10;
        this.f13734d.setRotation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f10) {
        this.f13749t = f10;
        this.f13734d.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f10) {
        this.f13747r = f10;
        this.f13734d.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f10) {
        this.f13746q = f10;
        this.f13734d.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f10) {
        this.f13748s = f10;
        this.f13734d.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f10) {
        this.f13734d.setCameraDistance(f10 * this.f13735e.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f10) {
        this.f13753x = f10;
        this.f13734d.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n(float f10) {
        this.f13750u = f10;
        this.f13734d.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float o() {
        return this.f13746q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void p(Outline outline, long j) {
        n nVar = this.f13734d;
        nVar.f13765f = outline;
        nVar.invalidateOutline();
        if (M() && outline != null) {
            nVar.setClipToOutline(true);
            if (this.f13741l) {
                this.f13741l = false;
                this.j = true;
            }
        }
        this.f13740k = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int q() {
        return this.f13743n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float r() {
        return this.f13754y;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float s() {
        return this.f13755z;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(long j) {
        long j10 = 9223372034707292159L & j;
        n nVar = this.f13734d;
        if (j10 != 9205357640488583168L) {
            this.f13745p = false;
            nVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            nVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                nVar.resetPivot();
                return;
            }
            this.f13745p = true;
            nVar.setPivotX(((int) (this.f13739i >> 32)) / 2.0f);
            nVar.setPivotY(((int) (this.f13739i & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long u() {
        return this.f13751v;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f13749t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long w() {
        return this.f13752w;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float x() {
        return this.f13734d.getCameraDistance() / this.f13735e.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13751v = j;
            this.f13734d.setOutlineAmbientShadowColor(Q3.d.K(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z10) {
        boolean z11 = false;
        this.f13741l = z10 && !this.f13740k;
        this.j = true;
        if (z10 && this.f13740k) {
            z11 = true;
        }
        this.f13734d.setClipToOutline(z11);
    }
}
