package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B0 implements InterfaceC1215d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f14822g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f14823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14828f;

    public B0(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f14823a = renderNodeCreate;
        if (f14822g) {
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
                F0.c(renderNodeCreate, F0.a(renderNodeCreate));
                F0.d(renderNodeCreate, F0.b(renderNodeCreate));
            }
            E0.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f14822g = false;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean A() {
        return this.f14823a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int B() {
        return this.f14825c;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void C(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            F0.c(this.f14823a, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void D(androidx.compose.ui.graphics.F f10, Path path, Ia.l<? super androidx.compose.ui.graphics.E, p293xa.r> lVar) {
        DisplayListCanvas displayListCanvasStart = this.f14823a.start(getWidth(), getHeight());
        Canvas canvasV = f10.a().v();
        f10.a().w((Canvas) displayListCanvasStart);
        C1138n c1138nA = f10.a();
        if (path != null) {
            c1138nA.g();
            c1138nA.l(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) lVar).invoke(c1138nA);
        if (path != null) {
            c1138nA.o();
        }
        f10.a().w(canvasV);
        this.f14823a.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int E() {
        return this.f14826d;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean F() {
        return this.f14823a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void G(boolean z10) {
        this.f14823a.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            F0.d(this.f14823a, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void I(Matrix matrix) {
        this.f14823a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final float J() {
        return this.f14823a.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final float a() {
        return this.f14823a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void b(float f10) {
        this.f14823a.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void c() {
        E0.a(this.f14823a);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void d(float f10) {
        this.f14823a.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void f(float f10) {
        this.f14823a.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void g(float f10) {
        this.f14823a.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int getHeight() {
        return this.f14827e - this.f14825c;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int getWidth() {
        return this.f14826d - this.f14824b;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void h(float f10) {
        this.f14823a.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void i(float f10) {
        this.f14823a.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean j() {
        return this.f14823a.isValid();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void k(float f10) {
        this.f14823a.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void l(float f10) {
        this.f14823a.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void m(float f10) {
        this.f14823a.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean n() {
        return this.f14828f;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void o(int i10) {
        this.f14824b += i10;
        this.f14826d += i10;
        this.f14823a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int p() {
        return this.f14827e;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void q(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f14823a);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int r() {
        return this.f14824b;
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void s(float f10) {
        this.f14823a.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void t(int i10) {
        if (androidx.compose.ui.graphics.O.a(i10, 1)) {
            this.f14823a.setLayerType(2);
            this.f14823a.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.O.a(i10, 2)) {
            this.f14823a.setLayerType(0);
            this.f14823a.setHasOverlappingRendering(false);
        } else {
            this.f14823a.setLayerType(0);
            this.f14823a.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void u(boolean z10) {
        this.f14828f = z10;
        this.f14823a.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean v(int i10, int i11, int i12, int i13) {
        this.f14824b = i10;
        this.f14825c = i11;
        this.f14826d = i12;
        this.f14827e = i13;
        return this.f14823a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void w(float f10) {
        this.f14823a.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void x(float f10) {
        this.f14823a.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void y(int i10) {
        this.f14825c += i10;
        this.f14827e += i10;
        this.f14823a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void z(Outline outline) {
        this.f14823a.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void e() {
    }
}
