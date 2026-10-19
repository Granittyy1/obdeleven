package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1142s implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f13794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13795b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Shader f13796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public I f13797d;

    public C1142s(Paint paint) {
        this.f13794a = paint;
    }

    @Override // androidx.compose.ui.graphics.d0
    public final float a() {
        return this.f13794a.getAlpha() / 255.0f;
    }

    @Override // androidx.compose.ui.graphics.d0
    public final void b(float f10) {
        this.f13794a.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    @Override // androidx.compose.ui.graphics.d0
    public final long c() {
        return Q3.d.d(this.f13794a.getColor());
    }

    @Override // androidx.compose.ui.graphics.d0
    public final Paint d() {
        return this.f13794a;
    }

    @Override // androidx.compose.ui.graphics.d0
    public final void e(Shader shader) {
        this.f13796c = shader;
        this.f13794a.setShader(shader);
    }

    @Override // androidx.compose.ui.graphics.d0
    public final Shader f() {
        return this.f13796c;
    }

    @Override // androidx.compose.ui.graphics.d0
    public final void g(long j) {
        this.f13794a.setColor(Q3.d.K(j));
    }

    public final int h() {
        Paint.Cap strokeCap = this.f13794a.getStrokeCap();
        int i10 = strokeCap == null ? -1 : C1143t.a.f13798a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int i() {
        Paint.Join strokeJoin = this.f13794a.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : C1143t.a.f13799b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void j(int i10) {
        if (C1149z.a(this.f13795b, i10)) {
            return;
        }
        this.f13795b = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = this.f13794a;
        if (i11 >= 29) {
            paint.setBlendMode(C1137m.a(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(C1137m.b(i10)));
        }
    }

    public final void k(I i10) {
        this.f13797d = i10;
        this.f13794a.setColorFilter(i10 != null ? i10.f13507a : null);
    }

    public final void l(int i10) {
        this.f13794a.setFilterBitmap(!P.a(i10, 0));
    }

    public final void m(p019b6.d dVar) {
        this.f13794a.setPathEffect(null);
    }

    public final void n(int i10) {
        Paint.Cap cap;
        if (n0.a(i10, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (n0.a(i10, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = n0.a(i10, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.f13794a.setStrokeCap(cap);
    }

    public final void o(int i10) {
        Paint.Join join;
        if (o0.a(i10, 0)) {
            join = Paint.Join.MITER;
        } else if (o0.a(i10, 2)) {
            join = Paint.Join.BEVEL;
        } else {
            join = o0.a(i10, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.f13794a.setStrokeJoin(join);
    }

    public final void p(float f10) {
        this.f13794a.setStrokeMiter(f10);
    }

    public final void q(float f10) {
        this.f13794a.setStrokeWidth(f10);
    }

    public final void r(int i10) {
        this.f13794a.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
