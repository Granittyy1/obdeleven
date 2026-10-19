package S5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: MaterialShapeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class f extends Drawable implements m {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Paint f5565y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.f[] f5567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.f[] f5568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f5569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Matrix f5571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f5572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f5573i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f5574k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Region f5575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Region f5576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f5577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f5578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f5579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final R5.a f5580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f5581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f5582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f5583t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f5584u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5585v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f5586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f5587x;

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f5565y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        b bVar = this.f5566b;
        this.f5582s.a(bVar.f5589a, bVar.f5597i, rectF, this.f5581r, path);
        if (this.f5566b.f5596h != 1.0f) {
            Matrix matrix = this.f5571g;
            matrix.reset();
            float f10 = this.f5566b.f5596h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f5586w, true);
    }

    public final int c(int i10) {
        int i11;
        b bVar = this.f5566b;
        float f10 = bVar.f5600m + 0.0f + bVar.f5599l;
        H5.a aVar = bVar.f5590b;
        if (aVar == null || !aVar.f3731a || p222s0.a.h(i10, 255) != aVar.f3734d) {
            return i10;
        }
        float f11 = aVar.f3735e;
        float fMin = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iB = A8.p.B(fMin, p222s0.a.h(i10, 255), aVar.f3732b);
        if (fMin > 0.0f && (i11 = aVar.f3733c) != 0) {
            iB = p222s0.a.e(p222s0.a.h(i11, H5.a.f3730f), iB);
        }
        return p222s0.a.h(iB, iAlpha);
    }

    public final void d(Canvas canvas) {
        this.f5569e.cardinality();
        int i10 = this.f5566b.f5602o;
        Path path = this.f5572h;
        R5.a aVar = this.f5580q;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f5322a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            l.f fVar = this.f5567c[i11];
            int i12 = this.f5566b.f5601n;
            Matrix matrix = l.f.f5664b;
            fVar.a(matrix, aVar, i12, canvas);
            this.f5568d[i11].a(matrix, aVar, this.f5566b.f5601n, canvas);
        }
        if (this.f5587x) {
            b bVar = this.f5566b;
            int iSin = (int) (Math.sin(Math.toRadians(bVar.f5603p)) * ((double) bVar.f5602o));
            b bVar2 = this.f5566b;
            int iCos = (int) (Math.cos(Math.toRadians(bVar2.f5603p)) * ((double) bVar2.f5602o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f5565y);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f5578o;
        paint.setColorFilter(this.f5583t);
        int alpha = paint.getAlpha();
        int i10 = this.f5566b.f5598k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f5579p;
        paint2.setColorFilter(this.f5584u);
        paint2.setStrokeWidth(this.f5566b.j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f5566b.f5598k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z10 = this.f5570f;
        Path path = this.f5572h;
        if (z10) {
            float f10 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            i iVar = this.f5566b.f5589a;
            i.a aVarE = iVar.e();
            c bVar = iVar.f5611e;
            if (!(bVar instanceof g)) {
                bVar = new S5.b(f10, bVar);
            }
            aVarE.f5622e = bVar;
            c bVar2 = iVar.f5612f;
            if (!(bVar2 instanceof g)) {
                bVar2 = new S5.b(f10, bVar2);
            }
            aVarE.f5623f = bVar2;
            c bVar3 = iVar.f5614h;
            if (!(bVar3 instanceof g)) {
                bVar3 = new S5.b(f10, bVar3);
            }
            aVarE.f5625h = bVar3;
            c bVar4 = iVar.f5613g;
            if (!(bVar4 instanceof g)) {
                bVar4 = new S5.b(f10, bVar4);
            }
            aVarE.f5624g = bVar4;
            i iVarA = aVarE.a();
            this.f5577n = iVarA;
            float f11 = this.f5566b.f5597i;
            RectF rectF = this.f5574k;
            rectF.set(g());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f5582s.a(iVarA, f11, rectF, null, this.f5573i);
            b(g(), path);
            this.f5570f = false;
        }
        b bVar5 = this.f5566b;
        bVar5.getClass();
        if (bVar5.f5601n > 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (!this.f5566b.f5589a.d(g()) && !path.isConvex() && i12 < 29) {
                canvas.save();
                b bVar6 = this.f5566b;
                int iSin = (int) (Math.sin(Math.toRadians(bVar6.f5603p)) * ((double) bVar6.f5602o));
                b bVar7 = this.f5566b;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(bVar7.f5603p)) * ((double) bVar7.f5602o)));
                if (this.f5587x) {
                    RectF rectF2 = this.f5586w;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f5566b.f5601n * 2) + ((int) rectF2.width()) + iWidth, (this.f5566b.f5601n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f5566b.f5601n) - iWidth;
                    float f13 = (getBounds().top - this.f5566b.f5601n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar8 = this.f5566b;
        Paint.Style style = bVar8.f5604q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, bVar8.f5589a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (!iVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = iVar.f5612f.a(rectF) * this.f5566b.f5597i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f5579p;
        Path path = this.f5573i;
        i iVar = this.f5577n;
        RectF rectF = this.f5574k;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, iVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.j;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5566b.f5598k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f5566b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f5566b.getClass();
        if (this.f5566b.f5589a.d(g())) {
            outline.setRoundRect(getBounds(), this.f5566b.f5589a.f5611e.a(g()) * this.f5566b.f5597i);
        } else {
            RectF rectFG = g();
            Path path = this.f5572h;
            b(rectFG, path);
            G5.c.b(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f5566b.f5595g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f5575l;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f5572h;
        b(rectFG, path);
        Region region2 = this.f5576m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f5566b.f5604q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5579p.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f5566b.f5590b = new H5.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f5570f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f5566b.f5593e) == null || !colorStateList.isStateful())) {
            this.f5566b.getClass();
            ColorStateList colorStateList3 = this.f5566b.f5592d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f5566b.f5591c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(float f10) {
        b bVar = this.f5566b;
        if (bVar.f5600m != f10) {
            bVar.f5600m = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f5566b;
        if (bVar.f5591c != colorStateList) {
            bVar.f5591c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f5566b.f5591c == null || color2 == (colorForState2 = this.f5566b.f5591c.getColorForState(iArr, (color2 = (paint2 = this.f5578o).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f5566b.f5592d == null || color == (colorForState = this.f5566b.f5592d.getColorForState(iArr, (color = (paint = this.f5579p).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5583t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f5584u;
        b bVar = this.f5566b;
        ColorStateList colorStateList = bVar.f5593e;
        PorterDuff.Mode mode = bVar.f5594f;
        Paint paint = this.f5578o;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            this.f5585v = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.f5585v = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.f5583t = porterDuffColorFilter;
        this.f5566b.getClass();
        this.f5584u = null;
        this.f5566b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f5583t) && Objects.equals(porterDuffColorFilter3, this.f5584u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5566b = new b(this.f5566b);
        return this;
    }

    public final void n() {
        b bVar = this.f5566b;
        float f10 = bVar.f5600m + 0.0f;
        bVar.f5601n = (int) Math.ceil(0.75f * f10);
        this.f5566b.f5602o = (int) Math.ceil(f10 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f5570f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10 = l(iArr) || m();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f5566b;
        if (bVar.f5598k != i10) {
            bVar.f5598k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5566b.getClass();
        super.invalidateSelf();
    }

    @Override // S5.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f5566b.f5589a = iVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5566b.f5593e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f5566b;
        if (bVar.f5594f != mode) {
            bVar.f5594f = mode;
            m();
            super.invalidateSelf();
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(i.b(context, attributeSet, i10, i11).a());
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public f(b bVar) {
        j jVar;
        this.f5567c = new l.f[4];
        this.f5568d = new l.f[4];
        this.f5569e = new BitSet(8);
        this.f5571g = new Matrix();
        this.f5572h = new Path();
        this.f5573i = new Path();
        this.j = new RectF();
        this.f5574k = new RectF();
        this.f5575l = new Region();
        this.f5576m = new Region();
        Paint paint = new Paint(1);
        this.f5578o = paint;
        Paint paint2 = new Paint(1);
        this.f5579p = paint2;
        this.f5580q = new R5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f5640a;
        } else {
            jVar = new j();
        }
        this.f5582s = jVar;
        this.f5586w = new RectF();
        this.f5587x = true;
        this.f5566b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f5581r = new a();
    }

    /* JADX INFO: compiled from: MaterialShapeDrawable.java */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f5589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public H5.a f5590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f5591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f5592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f5593e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PorterDuff.Mode f5594f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Rect f5595g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f5596h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f5597i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f5598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f5599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f5600m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5601n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5602o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f5603p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Paint.Style f5604q;

        public b(i iVar) {
            this.f5591c = null;
            this.f5592d = null;
            this.f5593e = null;
            this.f5594f = PorterDuff.Mode.SRC_IN;
            this.f5595g = null;
            this.f5596h = 1.0f;
            this.f5597i = 1.0f;
            this.f5598k = 255;
            this.f5599l = 0.0f;
            this.f5600m = 0.0f;
            this.f5601n = 0;
            this.f5602o = 0;
            this.f5603p = 0;
            this.f5604q = Paint.Style.FILL_AND_STROKE;
            this.f5589a = iVar;
            this.f5590b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f5570f = true;
            return fVar;
        }

        public b(b bVar) {
            this.f5591c = null;
            this.f5592d = null;
            this.f5593e = null;
            this.f5594f = PorterDuff.Mode.SRC_IN;
            this.f5595g = null;
            this.f5596h = 1.0f;
            this.f5597i = 1.0f;
            this.f5598k = 255;
            this.f5599l = 0.0f;
            this.f5600m = 0.0f;
            this.f5601n = 0;
            this.f5602o = 0;
            this.f5603p = 0;
            this.f5604q = Paint.Style.FILL_AND_STROKE;
            this.f5589a = bVar.f5589a;
            this.f5590b = bVar.f5590b;
            this.j = bVar.j;
            this.f5591c = bVar.f5591c;
            this.f5592d = bVar.f5592d;
            this.f5594f = bVar.f5594f;
            this.f5593e = bVar.f5593e;
            this.f5598k = bVar.f5598k;
            this.f5596h = bVar.f5596h;
            this.f5602o = bVar.f5602o;
            this.f5597i = bVar.f5597i;
            this.f5599l = bVar.f5599l;
            this.f5600m = bVar.f5600m;
            this.f5601n = bVar.f5601n;
            this.f5603p = bVar.f5603p;
            this.f5604q = bVar.f5604q;
            if (bVar.f5595g != null) {
                this.f5595g = new Rect(bVar.f5595g);
            }
        }
    }
}
