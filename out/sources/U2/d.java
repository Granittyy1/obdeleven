package U2;

import A0.f;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import coil.size.Scale;

/* JADX INFO: compiled from: ScaleDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f6328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scale f6329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f6330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6332f = 1.0f;

    public d(Drawable drawable, Scale scale) {
        this.f6328b = drawable;
        this.f6329c = scale;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f6330d, this.f6331e);
            float f10 = this.f6332f;
            canvas.scale(f10, f10);
            this.f6328b.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6328b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f6328b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6328b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6328b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @p293xa.d
    public final int getOpacity() {
        return this.f6328b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f6328b;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6328b;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f6330d = 0.0f;
            this.f6331e = 0.0f;
            this.f6332f = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dG = f.g(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f6329c);
        double d10 = 2;
        int iA = Ka.a.a((((double) iWidth) - (((double) intrinsicWidth) * dG)) / d10);
        int iA2 = Ka.a.a((((double) iHeight) - (((double) intrinsicHeight) * dG)) / d10);
        drawable.setBounds(iA, iA2, intrinsicWidth + iA, intrinsicHeight + iA2);
        this.f6330d = rect.left;
        this.f6331e = rect.top;
        this.f6332f = (float) dG;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f6328b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f6328b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f6328b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6328b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        this.f6328b.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f6328b.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6328b.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6328b.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f6328b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f6328b;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
