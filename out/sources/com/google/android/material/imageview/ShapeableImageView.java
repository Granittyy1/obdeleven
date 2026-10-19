package com.google.android.material.imageview;

import P5.c;
import S5.f;
import S5.i;
import S5.j;
import S5.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f27216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f27217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f27218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f27219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f27220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f27221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f27222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f27223i;
    public i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f27224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Path f27225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f27226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f27227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f27228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f27229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f27230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27232s;

    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f27233a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.j == null) {
                return;
            }
            if (shapeableImageView.f27223i == null) {
                shapeableImageView.f27223i = new f(shapeableImageView.j);
            }
            RectF rectF = shapeableImageView.f27217c;
            Rect rect = this.f27233a;
            rectF.round(rect);
            shapeableImageView.f27223i.setBounds(rect);
            shapeableImageView.f27223i.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i10, int i11) {
        RectF rectF = this.f27217c;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        i iVar = this.j;
        Path path = this.f27221g;
        this.f27216b.a(iVar, 1.0f, rectF, null, path);
        Path path2 = this.f27225l;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f27218d;
        rectF2.set(0.0f, 0.0f, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f27229p;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f27231r;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return c() ? this.f27226m : this.f27228o;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (this.f27230q != Integer.MIN_VALUE || this.f27231r != Integer.MIN_VALUE) {
            if (c() && (i11 = this.f27231r) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && (i10 = this.f27230q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f27226m;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (this.f27230q != Integer.MIN_VALUE || this.f27231r != Integer.MIN_VALUE) {
            if (c() && (i11 = this.f27230q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && (i10 = this.f27231r) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f27228o;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f27230q;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return c() ? this.f27228o : this.f27226m;
    }

    public int getContentPaddingTop() {
        return this.f27227n;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public i getShapeAppearanceModel() {
        return this.j;
    }

    public ColorStateList getStrokeColor() {
        return this.f27222h;
    }

    public float getStrokeWidth() {
        return this.f27224k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f27225l, this.f27220f);
        if (this.f27222h == null) {
            return;
        }
        Paint paint = this.f27219e;
        paint.setStrokeWidth(this.f27224k);
        int colorForState = this.f27222h.getColorForState(getDrawableState(), this.f27222h.getDefaultColor());
        if (this.f27224k <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f27221g, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f27232s && isLayoutDirectionResolved()) {
            this.f27232s = true;
            if (!isPaddingRelative() && this.f27230q == Integer.MIN_VALUE && this.f27231r == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // S5.m
    public void setShapeAppearanceModel(i iVar) {
        this.j = iVar;
        f fVar = this.f27223i;
        if (fVar != null) {
            fVar.setShapeAppearanceModel(iVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f27222h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(p186p0.a.b(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f27224k != f10) {
            this.f27224k = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(Z5.a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f27216b = j.a.f5640a;
        this.f27221g = new Path();
        this.f27232s = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f27220f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f27217c = new RectF();
        this.f27218d = new RectF();
        this.f27225l = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p204q5.a.f46100D, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f27222h = c.a(context2, typedArrayObtainStyledAttributes, 9);
        this.f27224k = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f27226m = dimensionPixelSize;
        this.f27227n = dimensionPixelSize;
        this.f27228o = dimensionPixelSize;
        this.f27229p = dimensionPixelSize;
        this.f27226m = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f27227n = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f27228o = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f27229p = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f27230q = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f27231r = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f27219e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.j = i.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new a());
    }
}
