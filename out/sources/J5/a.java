package J5;

import S5.i;
import S5.j;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: BorderDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f4015b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f4021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4022i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4025m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f4027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f4028p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f4014a = j.a.f5640a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f4016c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4017d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f4018e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f4019f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0050a f4020g = new C0050a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4026n = true;

    /* JADX INFO: renamed from: J5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BorderDrawable.java */
    public class C0050a extends Drawable.ConstantState {
        public C0050a() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return a.this;
        }
    }

    public a(i iVar) {
        this.f4027o = iVar;
        Paint paint = new Paint(1);
        this.f4015b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f4026n;
        Paint paint = this.f4015b;
        Rect rect = this.f4017d;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f4021h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{p222s0.a.e(this.f4022i, this.f4025m), p222s0.a.e(this.j, this.f4025m), p222s0.a.e(p222s0.a.h(this.j, 0), this.f4025m), p222s0.a.e(p222s0.a.h(this.f4024l, 0), this.f4025m), p222s0.a.e(this.f4024l, this.f4025m), p222s0.a.e(this.f4023k, this.f4025m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f4026n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f4018e;
        rectF.set(rect);
        S5.c cVar = this.f4027o.f5611e;
        RectF rectF2 = this.f4019f;
        rectF2.set(getBounds());
        float fMin = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        i iVar = this.f4027o;
        rectF2.set(getBounds());
        if (iVar.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4020g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f4021h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        i iVar = this.f4027o;
        RectF rectF = this.f4019f;
        rectF.set(getBounds());
        if (iVar.d(rectF)) {
            S5.c cVar = this.f4027o.f5611e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f4017d;
        copyBounds(rect);
        RectF rectF2 = this.f4018e;
        rectF2.set(rect);
        i iVar2 = this.f4027o;
        Path path = this.f4016c;
        this.f4014a.a(iVar2, 1.0f, rectF2, null, path);
        G5.c.b(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        i iVar = this.f4027o;
        RectF rectF = this.f4019f;
        rectF.set(getBounds());
        if (!iVar.d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f4021h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4028p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4026n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f4028p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f4025m)) != this.f4025m) {
            this.f4026n = true;
            this.f4025m = colorForState;
        }
        if (this.f4026n) {
            invalidateSelf();
        }
        return this.f4026n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f4015b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4015b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
