package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1138n implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f13771a = C1139o.f13774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f13773c;

    @Override // androidx.compose.ui.graphics.E
    public final void a(float f10, float f11) {
        this.f13771a.scale(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void b(long j, long j10, d0 d0Var) {
        this.f13771a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void c(float f10, float f11, float f12, float f13, d0 d0Var) {
        this.f13771a.drawRect(f10, f11, f12, f13, d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void d(W w3, long j, long j10, long j11, long j12, d0 d0Var) {
        if (this.f13772b == null) {
            this.f13772b = new Rect();
            this.f13773c = new Rect();
        }
        Canvas canvas = this.f13771a;
        Bitmap bitmapA = r.a(w3);
        Rect rect = this.f13772b;
        kotlin.jvm.internal.i.b(rect);
        int i10 = (int) (j >> 32);
        rect.left = i10;
        int i11 = (int) (j & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j10 >> 32));
        rect.bottom = i11 + ((int) (j10 & 4294967295L));
        p293xa.r rVar = p293xa.r.f47939a;
        Rect rect2 = this.f13773c;
        kotlin.jvm.internal.i.b(rect2);
        int i12 = (int) (j11 >> 32);
        rect2.left = i12;
        int i13 = (int) (j11 & 4294967295L);
        rect2.top = i13;
        rect2.right = i12 + ((int) (j12 >> 32));
        rect2.bottom = i13 + ((int) (j12 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void e(W w3, long j, d0 d0Var) {
        this.f13771a.drawBitmap(r.a(w3), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void f(float f10, float f11, float f12, float f13, float f14, float f15, d0 d0Var) {
        this.f13771a.drawArc(f10, f11, f12, f13, f14, f15, false, d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void g() {
        this.f13771a.save();
    }

    @Override // androidx.compose.ui.graphics.E
    public final void h() {
        G.a(this.f13771a, false);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void i(float[] fArr) {
        if (F8.a.h(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        L4.b.h(fArr, matrix);
        this.f13771a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void j(Path path, d0 d0Var) {
        Canvas canvas = this.f13771a;
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1144u) path).f13800a, d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void k(float f10, float f11, float f12, float f13, int i10) {
        this.f13771a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void l(Path path, int i10) {
        Canvas canvas = this.f13771a;
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1144u) path).f13800a, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void m(float f10, float f11) {
        this.f13771a.translate(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void n() {
        this.f13771a.rotate(45.0f);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void o() {
        this.f13771a.restore();
    }

    @Override // androidx.compose.ui.graphics.E
    public final void r(float f10, long j, d0 d0Var) {
        this.f13771a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f10, d0Var.d());
    }

    @Override // androidx.compose.ui.graphics.E
    public final void s(I.f fVar, d0 d0Var) {
        Canvas canvas = this.f13771a;
        Paint paintD = d0Var.d();
        canvas.saveLayer(fVar.f3757a, fVar.f3758b, fVar.f3759c, fVar.f3760d, paintD, 31);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void t() {
        G.a(this.f13771a, true);
    }

    @Override // androidx.compose.ui.graphics.E
    public final void u(float f10, float f11, float f12, float f13, float f14, float f15, d0 d0Var) {
        this.f13771a.drawRoundRect(f10, f11, f12, f13, f14, f15, d0Var.d());
    }

    public final Canvas v() {
        return this.f13771a;
    }

    public final void w(Canvas canvas) {
        this.f13771a = canvas;
    }
}
