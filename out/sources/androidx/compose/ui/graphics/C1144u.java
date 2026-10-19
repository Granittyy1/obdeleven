package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.RectF;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1144u implements Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f13800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f13801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f13802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f13803d;

    public C1144u() {
        this(0);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void a(float f10, float f11, float f12, float f13) {
        this.f13800a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean b() {
        return this.f13800a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(float f10, float f11) {
        this.f13800a.rMoveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.f13800a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13800a.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(float f10, float f11, float f12, float f13) {
        this.f13800a.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f10, float f11, float f12, float f13) {
        this.f13800a.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void g(int i10) {
        this.f13800a.setFillType(i10 == 1 ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void h(float f10, float f11, float f12, float f13) {
        this.f13800a.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final int i() {
        return this.f13800a.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean isEmpty() {
        return this.f13800a.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void l(float f10, float f11) {
        this.f13800a.moveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13800a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void n(I.f fVar, Path.Direction direction) {
        android.graphics.Path.Direction direction2;
        boolean zIsNaN = Float.isNaN(fVar.f3757a);
        float f10 = fVar.f3760d;
        float f11 = fVar.f3759c;
        float f12 = fVar.f3758b;
        if (zIsNaN || Float.isNaN(f12) || Float.isNaN(f11) || Float.isNaN(f10)) {
            C1146w.b("Invalid rectangle, make sure no value is NaN");
        }
        if (this.f13801b == null) {
            this.f13801b = new RectF();
        }
        RectF rectF = this.f13801b;
        kotlin.jvm.internal.i.b(rectF);
        rectF.set(fVar.f3757a, f12, f11, f10);
        RectF rectF2 = this.f13801b;
        kotlin.jvm.internal.i.b(rectF2);
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            direction2 = android.graphics.Path.Direction.CCW;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            direction2 = android.graphics.Path.Direction.CW;
        }
        this.f13800a.addRect(rectF2, direction2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void o() {
        this.f13800a.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean p(Path path, Path path2, int i10) {
        android.graphics.Path.Op op;
        if (i10 == 0) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i10 == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((C1144u) path).f13800a;
        if (path2 instanceof C1144u) {
            return this.f13800a.op(path3, ((C1144u) path2).f13800a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void q(I.g gVar, Path.Direction direction) {
        android.graphics.Path.Direction direction2;
        if (this.f13801b == null) {
            this.f13801b = new RectF();
        }
        RectF rectF = this.f13801b;
        kotlin.jvm.internal.i.b(rectF);
        rectF.set(gVar.f3761a, gVar.f3762b, gVar.f3763c, gVar.f3764d);
        if (this.f13802c == null) {
            this.f13802c = new float[8];
        }
        float[] fArr = this.f13802c;
        kotlin.jvm.internal.i.b(fArr);
        long j = gVar.f3765e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j10 = gVar.f3766f;
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long j11 = gVar.f3767g;
        fArr[4] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        long j12 = gVar.f3768h;
        fArr[6] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        RectF rectF2 = this.f13801b;
        kotlin.jvm.internal.i.b(rectF2);
        float[] fArr2 = this.f13802c;
        kotlin.jvm.internal.i.b(fArr2);
        int iOrdinal = direction.ordinal();
        if (iOrdinal == 0) {
            direction2 = android.graphics.Path.Direction.CCW;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            direction2 = android.graphics.Path.Direction.CW;
        }
        this.f13800a.addRoundRect(rectF2, fArr2, direction2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void r(float f10, float f11) {
        this.f13800a.rLineTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.f13800a.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void s(Path path, long j) {
        if (!(path instanceof C1144u)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f13800a.addPath(((C1144u) path).f13800a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void t(float f10, float f11) {
        this.f13800a.lineTo(f10, f11);
    }

    public final I.f u() {
        if (this.f13801b == null) {
            this.f13801b = new RectF();
        }
        RectF rectF = this.f13801b;
        kotlin.jvm.internal.i.b(rectF);
        this.f13800a.computeBounds(rectF, true);
        return new I.f(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void v(long j) {
        Matrix matrix = this.f13803d;
        if (matrix == null) {
            this.f13803d = new Matrix();
        } else {
            kotlin.jvm.internal.i.b(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f13803d;
        kotlin.jvm.internal.i.b(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.f13803d;
        kotlin.jvm.internal.i.b(matrix3);
        this.f13800a.transform(matrix3);
    }

    public C1144u(android.graphics.Path path) {
        this.f13800a = path;
    }

    public /* synthetic */ C1144u(int i10) {
        this(new android.graphics.Path());
    }
}
