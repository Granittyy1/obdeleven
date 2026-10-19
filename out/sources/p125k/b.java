package p125k;

import Z3.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.voltasit.obdeleven.R;
import p088h.a;

/* JADX INFO: compiled from: DrawerArrowDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f41215m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f41216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f41218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f41220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f41221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f41222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f41223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41224i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f41225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f41226l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f41216a = paint;
        this.f41222g = new Path();
        this.f41224i = false;
        this.f41226l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, a.f35701n, R.attr.drawerArrowStyle, 2132017380);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f41225k = (float) (Math.cos(f41215m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f41221f != z10) {
            this.f41221f = z10;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f41220e) {
            this.f41220e = fRound;
            invalidateSelf();
        }
        this.f41223h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f41218c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f41217b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f41219d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return n.b(f11, f10, f12, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f41226l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? t0.a.b.a(this) == 0 : t0.a.b.a(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f41217b;
        float fSqrt = (float) Math.sqrt(f10 * f10 * 2.0f);
        float f11 = this.j;
        float f12 = this.f41218c;
        float fA = a(f12, fSqrt, f11);
        float fA2 = a(f12, this.f41219d, this.j);
        float fRound = Math.round(a(0.0f, this.f41225k, this.j));
        float fA3 = a(0.0f, f41215m, this.j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(Math.sin(d11) * d10);
        Path path = this.f41222g;
        path.rewind();
        float f13 = this.f41220e;
        Paint paint = this.f41216a;
        float fA5 = a(paint.getStrokeWidth() + f13, -this.f41225k, this.j);
        float f14 = (-fA2) / 2.0f;
        path.moveTo(f14 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f14, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f15 = this.f41220e;
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + f15 + ((((int) (fHeight - (2.0f * f15))) / 4) * 2));
        if (this.f41221f) {
            canvas.rotate(fA4 * (this.f41224i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f41223h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f41223h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f41216a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41216a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
