package androidx.compose.ui.graphics.layer;

import A8.A;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import p293xa.r;

/* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final AtomicBoolean f13684A = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f13685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J.a f13686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f13687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f13689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13692i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f13704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f13705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13707y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13708z;

    public d(AndroidComposeView androidComposeView, F f10, J.a aVar) {
        this.f13685b = f10;
        this.f13686c = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f13687d = renderNodeCreate;
        this.f13688e = 0L;
        this.f13691h = 0L;
        if (f13684A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                m.c(renderNodeCreate, m.a(renderNodeCreate));
                m.d(renderNodeCreate, m.b(renderNodeCreate));
            }
            l.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        M(0);
        this.f13692i = 0;
        this.j = 3;
        this.f13693k = 1.0f;
        this.f13695m = 1.0f;
        this.f13696n = 1.0f;
        int i10 = H.f13505m;
        this.f13700r = H.a.a();
        this.f13701s = H.a.a();
        this.f13705w = 8.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13701s = j;
            m.d(this.f13687d, Q3.d.K(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void B(long j, int i10, int i11) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (4294967295L & j);
        this.f13687d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (p013b0.l.b(this.f13688e, j)) {
            return;
        }
        if (this.f13694l) {
            this.f13687d.setPivotX(i12 / 2.0f);
            this.f13687d.setPivotY(i13 / 2.0f);
        }
        this.f13688e = j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float C() {
        return this.f13697o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float D() {
        return this.f13702t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void E(int i10) {
        this.f13692i = i10;
        if (a.a(i10, 1) || !C1149z.a(this.j, 3)) {
            M(1);
        } else {
            M(this.f13692i);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix F() {
        Matrix matrix = this.f13689f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13689f = matrix;
        }
        this.f13687d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(p013b0.c cVar, LayoutDirection layoutDirection, b bVar, Ia.l<? super J.e, r> lVar) {
        Canvas canvasStart = this.f13687d.start(Math.max((int) (this.f13688e >> 32), (int) (this.f13691h >> 32)), Math.max((int) (this.f13688e & 4294967295L), (int) (this.f13691h & 4294967295L)));
        try {
            F f10 = this.f13685b;
            Canvas canvasV = f10.a().v();
            f10.a().w(canvasStart);
            C1138n c1138nA = f10.a();
            J.a aVar = this.f13686c;
            long jK = A.k(this.f13688e);
            p013b0.c cVarB = aVar.W0().b();
            LayoutDirection layoutDirectionD = aVar.W0().d();
            E eA = aVar.W0().a();
            long jE = aVar.W0().e();
            b bVarC = aVar.W0().c();
            J.a.b bVarW0 = aVar.W0();
            bVarW0.g(cVar);
            bVarW0.i(layoutDirection);
            bVarW0.f(c1138nA);
            bVarW0.j(jK);
            bVarW0.h(bVar);
            c1138nA.g();
            try {
                ((GraphicsLayer$clipDrawBlock$1) lVar).invoke(aVar);
                c1138nA.o();
                J.a.b bVarW1 = aVar.W0();
                bVarW1.g(cVarB);
                bVarW1.i(layoutDirectionD);
                bVarW1.f(eA);
                bVarW1.j(jE);
                bVarW1.h(bVarC);
                f10.a().w(canvasV);
                this.f13687d.end(canvasStart);
            } catch (Throwable th) {
                c1138nA.o();
                J.a.b bVarW2 = aVar.W0();
                bVarW2.g(cVarB);
                bVarW2.i(layoutDirectionD);
                bVarW2.f(eA);
                bVarW2.j(jE);
                bVarW2.h(bVarC);
                throw th;
            }
        } catch (Throwable th2) {
            this.f13687d.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f13699q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float I() {
        return this.f13696n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int J() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(E e10) {
        DisplayListCanvas displayListCanvasA = C1139o.a(e10);
        kotlin.jvm.internal.i.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f13687d);
    }

    public final void L() {
        boolean z10 = this.f13706x;
        boolean z11 = false;
        boolean z12 = z10 && !this.f13690g;
        if (z10 && this.f13690g) {
            z11 = true;
        }
        if (z12 != this.f13707y) {
            this.f13707y = z12;
            this.f13687d.setClipToBounds(z12);
        }
        if (z11 != this.f13708z) {
            this.f13708z = z11;
            this.f13687d.setClipToOutline(z11);
        }
    }

    public final void M(int i10) {
        RenderNode renderNode = this.f13687d;
        if (a.a(i10, 1)) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.a(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f13693k;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f10) {
        this.f13693k = f10;
        this.f13687d.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c() {
        l.a(this.f13687d);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f10) {
        this.f13703u = f10;
        this.f13687d.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f10) {
        this.f13704v = f10;
        this.f13687d.setRotation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f10) {
        this.f13698p = f10;
        this.f13687d.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f10) {
        this.f13696n = f10;
        this.f13687d.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f10) {
        this.f13695m = f10;
        this.f13687d.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean j() {
        return this.f13687d.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f10) {
        this.f13697o = f10;
        this.f13687d.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f10) {
        this.f13705w = f10;
        this.f13687d.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f10) {
        this.f13702t = f10;
        this.f13687d.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n(float f10) {
        this.f13699q = f10;
        this.f13687d.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float o() {
        return this.f13695m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void p(Outline outline, long j) {
        this.f13691h = j;
        this.f13687d.setOutline(outline);
        this.f13690g = outline != null;
        L();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int q() {
        return this.f13692i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float r() {
        return this.f13703u;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float s() {
        return this.f13704v;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f13694l = true;
            this.f13687d.setPivotX(((int) (this.f13688e >> 32)) / 2.0f);
            this.f13687d.setPivotY(((int) (4294967295L & this.f13688e)) / 2.0f);
        } else {
            this.f13694l = false;
            this.f13687d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f13687d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long u() {
        return this.f13700r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f13698p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long w() {
        return this.f13701s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float x() {
        return this.f13705w;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13700r = j;
            m.c(this.f13687d, Q3.d.K(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z10) {
        this.f13706x = z10;
        L();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e() {
    }
}
