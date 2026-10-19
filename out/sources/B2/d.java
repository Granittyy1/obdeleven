package B2;

import Z3.n;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinearInterpolator f1464h = new LinearInterpolator();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final X0.b f1465i = new X0.b();
    public static final int[] j = {-16777216};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Resources f1468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ValueAnimator f1469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1471g;

    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f1472a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f1473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f1474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f1475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f1478g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f1479h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f1480i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f1482l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f1483m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f1484n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f1485o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f1486p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f1487q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1488r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1489s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1490t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1491u;

        public a() {
            Paint paint = new Paint();
            this.f1473b = paint;
            Paint paint2 = new Paint();
            this.f1474c = paint2;
            Paint paint3 = new Paint();
            this.f1475d = paint3;
            this.f1476e = 0.0f;
            this.f1477f = 0.0f;
            this.f1478g = 0.0f;
            this.f1479h = 5.0f;
            this.f1486p = 1.0f;
            this.f1490t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i10) {
            this.j = i10;
            this.f1491u = this.f1480i[i10];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f1468d = context.getResources();
        a aVar = new a();
        this.f1466b = aVar;
        aVar.f1480i = j;
        aVar.a(0);
        aVar.f1479h = 2.5f;
        aVar.f1473b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f1464h);
        valueAnimatorOfFloat.addListener(new c(this, aVar));
        this.f1469e = valueAnimatorOfFloat;
    }

    public static void d(float f10, a aVar) {
        if (f10 <= 0.75f) {
            aVar.f1491u = aVar.f1480i[aVar.j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = aVar.f1480i;
        int i10 = aVar.j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        aVar.f1491u = ((i13 + ((int) ((((i12 >> 24) & 255) - i13) * f11))) << 24) | ((i14 + ((int) ((((i12 >> 16) & 255) - i14) * f11))) << 16) | ((i15 + ((int) ((((i12 >> 8) & 255) - i15) * f11))) << 8) | (i16 + ((int) (f11 * ((i12 & 255) - i16))));
    }

    public final void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f1471g) {
            d(f10, aVar);
            float fFloor = (float) (Math.floor(aVar.f1483m / 0.8f) + 1.0d);
            float f11 = aVar.f1481k;
            float f12 = aVar.f1482l;
            aVar.f1476e = (((f12 - 0.01f) - f11) * f10) + f11;
            aVar.f1477f = f12;
            float f13 = aVar.f1483m;
            aVar.f1478g = n.b(fFloor, f13, f10, f13);
            return;
        }
        if (f10 != 1.0f || z10) {
            float f14 = aVar.f1483m;
            X0.b bVar = f1465i;
            if (f10 < 0.5f) {
                interpolation = aVar.f1481k;
                interpolation2 = (bVar.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = aVar.f1481k + 0.79f;
                interpolation = f15 - (((1.0f - bVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + this.f1470f) * 216.0f;
            aVar.f1476e = interpolation;
            aVar.f1477f = interpolation2;
            aVar.f1478g = f16;
            this.f1467c = f17;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f1468d.getDisplayMetrics().density;
        float f15 = f11 * f14;
        a aVar = this.f1466b;
        aVar.f1479h = f15;
        aVar.f1473b.setStrokeWidth(f15);
        aVar.f1487q = f10 * f14;
        aVar.a(0);
        aVar.f1488r = (int) (f12 * f14);
        aVar.f1489s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1467c, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f1466b;
        RectF rectF = aVar.f1472a;
        float f10 = aVar.f1487q;
        float fMin = (aVar.f1479h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f1488r * aVar.f1486p) / 2.0f, aVar.f1479h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = aVar.f1476e;
        float f12 = aVar.f1478g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((aVar.f1477f + f12) * 360.0f) - f13;
        Paint paint = aVar.f1473b;
        paint.setColor(aVar.f1491u);
        paint.setAlpha(aVar.f1490t);
        float f15 = aVar.f1479h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f1475d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (aVar.f1484n) {
            Path path = aVar.f1485o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f1485o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (aVar.f1488r * aVar.f1486p) / 2.0f;
            aVar.f1485o.moveTo(0.0f, 0.0f);
            aVar.f1485o.lineTo(aVar.f1488r * aVar.f1486p, 0.0f);
            Path path3 = aVar.f1485o;
            float f18 = aVar.f1488r;
            float f19 = aVar.f1486p;
            path3.lineTo((f18 * f19) / 2.0f, aVar.f1489s * f19);
            aVar.f1485o.offset((rectF.centerX() + fMin2) - f17, (aVar.f1479h / 2.0f) + rectF.centerY());
            aVar.f1485o.close();
            Paint paint2 = aVar.f1474c;
            paint2.setColor(aVar.f1491u);
            paint2.setAlpha(aVar.f1490t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f1485o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1466b.f1490t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f1469e.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f1466b.f1490t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1466b.f1473b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f1469e.cancel();
        a aVar = this.f1466b;
        float f10 = aVar.f1476e;
        aVar.f1481k = f10;
        float f11 = aVar.f1477f;
        aVar.f1482l = f11;
        aVar.f1483m = aVar.f1478g;
        if (f11 != f10) {
            this.f1471g = true;
            this.f1469e.setDuration(666L);
            this.f1469e.start();
            return;
        }
        aVar.a(0);
        aVar.f1481k = 0.0f;
        aVar.f1482l = 0.0f;
        aVar.f1483m = 0.0f;
        aVar.f1476e = 0.0f;
        aVar.f1477f = 0.0f;
        aVar.f1478g = 0.0f;
        this.f1469e.setDuration(1332L);
        this.f1469e.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f1469e.cancel();
        this.f1467c = 0.0f;
        a aVar = this.f1466b;
        if (aVar.f1484n) {
            aVar.f1484n = false;
        }
        aVar.a(0);
        aVar.f1481k = 0.0f;
        aVar.f1482l = 0.0f;
        aVar.f1483m = 0.0f;
        aVar.f1476e = 0.0f;
        aVar.f1477f = 0.0f;
        aVar.f1478g = 0.0f;
        invalidateSelf();
    }
}
