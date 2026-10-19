package p221s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f46838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f46839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f46840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f46841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f46842e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f46845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f46846i;
    public ColorStateList j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46843f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46844g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f46847k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f10) {
        this.f46838a = f10;
        Paint paint = new Paint(5);
        this.f46839b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f46845h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f46845h.getDefaultColor()));
        this.f46840c = new RectF();
        this.f46841d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f46840c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f46841d;
        rect2.set(rect);
        if (this.f46843f) {
            rect2.inset((int) Math.ceil(c.a(this.f46842e, this.f46838a, this.f46844g)), (int) Math.ceil(c.b(this.f46842e, this.f46838a, this.f46844g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f46839b;
        if (this.f46846i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f46846i);
            z10 = true;
        }
        RectF rectF = this.f46840c;
        float f10 = this.f46838a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f46841d, this.f46838a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f46845h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f46845h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f46839b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f46847k) == null) {
            return z10;
        }
        this.f46846i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f46839b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46839b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f46846i = a(colorStateList, this.f46847k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f46847k = mode;
        this.f46846i = a(this.j, mode);
        invalidateSelf();
    }
}
