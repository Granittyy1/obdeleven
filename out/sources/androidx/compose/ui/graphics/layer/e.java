package androidx.compose.ui.graphics.layer;

import A8.A;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.unit.LayoutDirection;
import p293xa.r;

/* JADX INFO: compiled from: GraphicsLayerV29.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements GraphicsLayerImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f13709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J.a f13710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f13711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f13713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13716i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13730x;

    public e() {
        F f10 = new F();
        J.a aVar = new J.a();
        this.f13709b = f10;
        this.f13710c = aVar;
        RenderNode renderNodeB = I2.c.b();
        this.f13711d = renderNodeB;
        this.f13712e = 0L;
        renderNodeB.setClipToBounds(false);
        M(renderNodeB, 0);
        this.f13715h = 1.0f;
        this.f13716i = 3;
        this.j = 1.0f;
        this.f13717k = 1.0f;
        long j = H.f13495b;
        this.f13721o = j;
        this.f13722p = j;
        this.f13726t = 8.0f;
        this.f13730x = 0;
    }

    public static void M(RenderNode renderNode, int i10) {
        if (a.a(i10, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.a(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void A(long j) {
        this.f13722p = j;
        this.f13711d.setSpotShadowColor(Q3.d.K(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void B(long j, int i10, int i11) {
        this.f13711d.setPosition(i10, i11, ((int) (j >> 32)) + i10, ((int) (4294967295L & j)) + i11);
        this.f13712e = A.k(j);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float C() {
        return this.f13718l;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float D() {
        return this.f13723q;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void E(int i10) {
        this.f13730x = i10;
        if (a.a(i10, 1) || !C1149z.a(this.f13716i, 3)) {
            M(this.f13711d, 1);
        } else {
            M(this.f13711d, this.f13730x);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final Matrix F() {
        Matrix matrix = this.f13713f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13713f = matrix;
        }
        this.f13711d.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void G(p013b0.c cVar, LayoutDirection layoutDirection, b bVar, Ia.l<? super J.e, r> lVar) {
        J.a aVar = this.f13710c;
        RecordingCanvas recordingCanvasBeginRecording = this.f13711d.beginRecording();
        try {
            F f10 = this.f13709b;
            C1138n c1138n = f10.f13476a;
            Canvas canvas = c1138n.f13771a;
            c1138n.f13771a = recordingCanvasBeginRecording;
            J.a.b bVar2 = aVar.f3941c;
            bVar2.g(cVar);
            bVar2.i(layoutDirection);
            bVar2.f3949b = bVar;
            bVar2.j(this.f13712e);
            bVar2.f(c1138n);
            ((GraphicsLayer$clipDrawBlock$1) lVar).invoke(aVar);
            f10.f13476a.f13771a = canvas;
        } finally {
            this.f13711d.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float H() {
        return this.f13720n;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float I() {
        return this.f13717k;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int J() {
        return this.f13716i;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void K(E e10) {
        C1139o.a(e10).drawRenderNode(this.f13711d);
    }

    public final void L() {
        boolean z10 = this.f13727u;
        boolean z11 = false;
        boolean z12 = z10 && !this.f13714g;
        if (z10 && this.f13714g) {
            z11 = true;
        }
        if (z12 != this.f13728v) {
            this.f13728v = z12;
            this.f13711d.setClipToBounds(z12);
        }
        if (z11 != this.f13729w) {
            this.f13729w = z11;
            this.f13711d.setClipToOutline(z11);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float a() {
        return this.f13715h;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void b(float f10) {
        this.f13715h = f10;
        this.f13711d.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void c() {
        this.f13711d.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void d(float f10) {
        this.f13724r = f10;
        this.f13711d.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f13711d.setRenderEffect(null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void f(float f10) {
        this.f13725s = f10;
        this.f13711d.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void g(float f10) {
        this.f13719m = f10;
        this.f13711d.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void h(float f10) {
        this.f13717k = f10;
        this.f13711d.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void i(float f10) {
        this.j = f10;
        this.f13711d.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final boolean j() {
        return this.f13711d.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void k(float f10) {
        this.f13718l = f10;
        this.f13711d.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void l(float f10) {
        this.f13726t = f10;
        this.f13711d.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void m(float f10) {
        this.f13723q = f10;
        this.f13711d.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void n(float f10) {
        this.f13720n = f10;
        this.f13711d.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float o() {
        return this.j;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void p(Outline outline, long j) {
        this.f13711d.setOutline(outline);
        this.f13714g = outline != null;
        L();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final int q() {
        return this.f13730x;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float r() {
        return this.f13724r;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float s() {
        return this.f13725s;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void t(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f13711d.resetPivot();
        } else {
            this.f13711d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f13711d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long u() {
        return this.f13721o;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float v() {
        return this.f13719m;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final long w() {
        return this.f13722p;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final float x() {
        return this.f13726t;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void y(long j) {
        this.f13721o = j;
        this.f13711d.setAmbientShadowColor(Q3.d.K(j));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public final void z(boolean z10) {
        this.f13727u = z10;
        L();
    }
}
