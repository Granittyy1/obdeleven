package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f13760l = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K.a f13761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f13762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J.a f13763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f13765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p013b0.c f13767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LayoutDirection f13768i;
    public Lambda j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f13769k;

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof n) || (outline2 = ((n) view).f13765f) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public n(K.a aVar, F f10, J.a aVar2) {
        super(aVar.getContext());
        this.f13761b = aVar;
        this.f13762c = f10;
        this.f13763d = aVar2;
        setOutlineProvider(f13760l);
        this.f13766g = true;
        this.f13767h = J.d.f3952a;
        this.f13768i = LayoutDirection.f15717b;
        GraphicsLayerImpl.f13657a.getClass();
        this.j = (Lambda) GraphicsLayerImpl.Companion.f13659b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        F f10 = this.f13762c;
        C1138n c1138n = f10.f13476a;
        Canvas canvas2 = c1138n.f13771a;
        c1138n.f13771a = canvas;
        p013b0.c cVar = this.f13767h;
        LayoutDirection layoutDirection = this.f13768i;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.f13769k;
        ?? r10 = this.j;
        J.a aVar = this.f13763d;
        p013b0.c cVarB = aVar.f3941c.b();
        J.a.b bVar2 = aVar.f3941c;
        LayoutDirection layoutDirectionD = bVar2.d();
        E eA = bVar2.a();
        long jE = bVar2.e();
        b bVar3 = bVar2.f3949b;
        bVar2.g(cVar);
        bVar2.i(layoutDirection);
        bVar2.f(c1138n);
        bVar2.j(jFloatToRawIntBits);
        bVar2.f3949b = bVar;
        c1138n.g();
        try {
            r10.invoke(aVar);
            c1138n.o();
            bVar2.g(cVarB);
            bVar2.i(layoutDirectionD);
            bVar2.f(eA);
            bVar2.j(jE);
            bVar2.f3949b = bVar3;
            f10.f13476a.f13771a = canvas2;
            this.f13764e = false;
        } catch (Throwable th) {
            c1138n.o();
            bVar2.g(cVarB);
            bVar2.i(layoutDirectionD);
            bVar2.f(eA);
            bVar2.j(jE);
            bVar2.f3949b = bVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f13766g;
    }

    public final F getCanvasHolder() {
        return this.f13762c;
    }

    public final View getOwnerView() {
        return this.f13761b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f13766g;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f13764e) {
            return;
        }
        this.f13764e = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f13766g != z10) {
            this.f13766g = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f13764e = z10;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
