package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.C1138n;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class D0 implements InterfaceC1215d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f14887a = androidx.compose.ui.graphics.B.b();

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean A() {
        return this.f14887a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int B() {
        return this.f14887a.getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void C(int i10) {
        this.f14887a.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void D(androidx.compose.ui.graphics.F f10, Path path, Ia.l<? super androidx.compose.ui.graphics.E, p293xa.r> lVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f14887a.beginRecording();
        C1138n c1138n = f10.f13476a;
        Canvas canvas = c1138n.f13771a;
        c1138n.f13771a = recordingCanvasBeginRecording;
        if (path != null) {
            c1138n.g();
            c1138n.l(path, 1);
        }
        ((RenderNodeLayer$updateDisplayList$1$1) lVar).invoke(c1138n);
        if (path != null) {
            c1138n.o();
        }
        f10.f13476a.f13771a = canvas;
        this.f14887a.endRecording();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int E() {
        return this.f14887a.getRight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean F() {
        return this.f14887a.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void G(boolean z10) {
        this.f14887a.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void H(int i10) {
        this.f14887a.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void I(Matrix matrix) {
        this.f14887a.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final float J() {
        return this.f14887a.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final float a() {
        return this.f14887a.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void b(float f10) {
        this.f14887a.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void c() {
        this.f14887a.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void d(float f10) {
        this.f14887a.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void e() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14887a.setRenderEffect(null);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void f(float f10) {
        this.f14887a.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void g(float f10) {
        this.f14887a.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int getHeight() {
        return this.f14887a.getHeight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int getWidth() {
        return this.f14887a.getWidth();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void h(float f10) {
        this.f14887a.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void i(float f10) {
        this.f14887a.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean j() {
        return this.f14887a.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void k(float f10) {
        this.f14887a.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void l(float f10) {
        this.f14887a.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void m(float f10) {
        this.f14887a.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean n() {
        return this.f14887a.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void o(int i10) {
        this.f14887a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int p() {
        return this.f14887a.getBottom();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void q(Canvas canvas) {
        canvas.drawRenderNode(this.f14887a);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final int r() {
        return this.f14887a.getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void s(float f10) {
        this.f14887a.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void t(int i10) {
        RenderNode renderNode = this.f14887a;
        if (androidx.compose.ui.graphics.O.a(i10, 1)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.O.a(i10, 2)) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void u(boolean z10) {
        this.f14887a.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final boolean v(int i10, int i11, int i12, int i13) {
        return this.f14887a.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void w(float f10) {
        this.f14887a.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void x(float f10) {
        this.f14887a.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void y(int i10) {
        this.f14887a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1215d0
    public final void z(Outline outline) {
        this.f14887a.setOutline(outline);
    }
}
