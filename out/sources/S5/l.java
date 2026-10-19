package S5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: ShapePath.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f5643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f5644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f5645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f5646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f5647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5648f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5649g = new ArrayList();

    /* JADX INFO: compiled from: ShapePath.java */
    public static class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f5650c;

        public a(c cVar) {
            this.f5650c = cVar;
        }

        @Override // S5.l.f
        public final void a(Matrix matrix, R5.a aVar, int i10, Canvas canvas) {
            c cVar = this.f5650c;
            float f10 = cVar.f5659f;
            float f11 = cVar.f5660g;
            RectF rectF = new RectF(cVar.f5655b, cVar.f5656c, cVar.f5657d, cVar.f5658e);
            aVar.getClass();
            boolean z10 = f11 < 0.0f;
            Path path = aVar.f5328g;
            int[] iArr = R5.a.f5320k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f5327f;
                iArr[2] = aVar.f5326e;
                iArr[3] = aVar.f5325d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i10;
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar.f5325d;
                iArr[2] = aVar.f5326e;
                iArr[3] = aVar.f5327f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f13 = 1.0f - (i10 / fWidth);
            float[] fArr = R5.a.f5321l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f5323b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f5329h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f5651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f5652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f5653e;

        public b(d dVar, float f10, float f11) {
            this.f5651c = dVar;
            this.f5652d = f10;
            this.f5653e = f11;
        }

        @Override // S5.l.f
        public final void a(Matrix matrix, R5.a aVar, int i10, Canvas canvas) {
            d dVar = this.f5651c;
            float f10 = dVar.f5662c;
            float f11 = this.f5653e;
            float f12 = dVar.f5661b;
            float f13 = this.f5652d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f5665a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = R5.a.f5319i;
            iArr[0] = aVar.f5327f;
            iArr[1] = aVar.f5326e;
            iArr[2] = aVar.f5325d;
            Paint paint = aVar.f5324c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, R5.a.j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f5651c;
            return (float) Math.toDegrees(Math.atan((dVar.f5662c - this.f5653e) / (dVar.f5661b - this.f5652d)));
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class c extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f5654h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f5655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f5656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f5657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f5658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f5659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f5660g;

        public c(float f10, float f11, float f12, float f13) {
            this.f5655b = f10;
            this.f5656c = f11;
            this.f5657d = f12;
            this.f5658e = f13;
        }

        @Override // S5.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5663a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5654h;
            rectF.set(this.f5655b, this.f5656c, this.f5657d, this.f5658e);
            path.arcTo(rectF, this.f5659f, this.f5660g, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f5661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5662c;

        @Override // S5.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5663a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5661b, this.f5662c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f5663a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: compiled from: ShapePath.java */
    public static abstract class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Matrix f5664b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f5665a = new Matrix();

        public abstract void a(Matrix matrix, R5.a aVar, int i10, Canvas canvas);
    }

    public l() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f5646d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f5644b;
        float f14 = this.f5645c;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f5659f = this.f5646d;
        cVar.f5660g = f12;
        this.f5649g.add(new a(cVar));
        this.f5646d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f5648f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        d dVar = new d();
        dVar.f5661b = f10;
        dVar.f5662c = f11;
        this.f5648f.add(dVar);
        b bVar = new b(dVar, this.f5644b, this.f5645c);
        float fB = bVar.b() + 270.0f;
        float fB2 = bVar.b() + 270.0f;
        a(fB);
        this.f5649g.add(bVar);
        this.f5646d = fB2;
        this.f5644b = f10;
        this.f5645c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.f5643a = f10;
        this.f5644b = 0.0f;
        this.f5645c = f10;
        this.f5646d = f11;
        this.f5647e = (f11 + f12) % 360.0f;
        this.f5648f.clear();
        this.f5649g.clear();
    }
}
