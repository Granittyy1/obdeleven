package E2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.C0873a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p211r0.j;

/* JADX INFO: compiled from: VectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends E2.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2989k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0030g f2990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f2991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorFilter f2992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f2995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f2996i;
    public final Rect j;

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class a extends e {
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p211r0.d f2997d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p211r0.d f2999f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f2998e = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3000g = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3001h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3002i = 0.0f;
        public float j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f3003k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint.Cap f3004l = Paint.Cap.BUTT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Paint.Join f3005m = Paint.Join.MITER;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f3006n = 4.0f;

        @Override // E2.g.d
        public final boolean a() {
            return this.f2999f.b() || this.f2997d.b();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        @Override // E2.g.d
        public final boolean b(int[] iArr) {
            boolean z10;
            p211r0.d dVar = this.f2999f;
            boolean z11 = false;
            if (dVar.b()) {
                ColorStateList colorStateList = dVar.f46235b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != dVar.f46236c) {
                    dVar.f46236c = colorForState;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            p211r0.d dVar2 = this.f2997d;
            if (dVar2.b()) {
                ColorStateList colorStateList2 = dVar2.f46235b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != dVar2.f46236c) {
                    dVar2.f46236c = colorForState2;
                    z11 = true;
                }
            }
            return z10 | z11;
        }

        public float getFillAlpha() {
            return this.f3001h;
        }

        public int getFillColor() {
            return this.f2999f.f46236c;
        }

        public float getStrokeAlpha() {
            return this.f3000g;
        }

        public int getStrokeColor() {
            return this.f2997d.f46236c;
        }

        public float getStrokeWidth() {
            return this.f2998e;
        }

        public float getTrimPathEnd() {
            return this.j;
        }

        public float getTrimPathOffset() {
            return this.f3003k;
        }

        public float getTrimPathStart() {
            return this.f3002i;
        }

        public void setFillAlpha(float f10) {
            this.f3001h = f10;
        }

        public void setFillColor(int i10) {
            this.f2999f.f46236c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f3000g = f10;
        }

        public void setStrokeColor(int i10) {
            this.f2997d.f46236c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f2998e = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.j = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f3003k = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f3002i = f10;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E2.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class C0030g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f3036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f3037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f3038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f3040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f3041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f3042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3043i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f3044k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f3045l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3035a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public g() {
        this.f2994g = true;
        this.f2995h = new float[9];
        this.f2996i = new Matrix();
        this.j = new Rect();
        C0030g c0030g = new C0030g();
        c0030g.f3037c = null;
        c0030g.f3038d = f2989k;
        c0030g.f3036b = new f();
        this.f2990c = c0030g;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2988b;
        if (drawable == null) {
            return false;
        }
        p234t0.a.C0532a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2992e;
        if (colorFilter == null) {
            colorFilter = this.f2991d;
        }
        Matrix matrix = this.f2996i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2995h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && t0.a.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0030g c0030g = this.f2990c;
        Bitmap bitmap = c0030g.f3040f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0030g.f3040f.getHeight()) {
            c0030g.f3040f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0030g.f3044k = true;
        }
        if (this.f2994g) {
            C0030g c0030g2 = this.f2990c;
            if (c0030g2.f3044k || c0030g2.f3041g != c0030g2.f3037c || c0030g2.f3042h != c0030g2.f3038d || c0030g2.j != c0030g2.f3039e || c0030g2.f3043i != c0030g2.f3036b.getRootAlpha()) {
                C0030g c0030g3 = this.f2990c;
                c0030g3.f3040f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0030g3.f3040f);
                f fVar = c0030g3.f3036b;
                fVar.a(fVar.f3027g, f.f3020p, canvas2, iMin, iMin2);
                C0030g c0030g4 = this.f2990c;
                c0030g4.f3041g = c0030g4.f3037c;
                c0030g4.f3042h = c0030g4.f3038d;
                c0030g4.f3043i = c0030g4.f3036b.getRootAlpha();
                c0030g4.j = c0030g4.f3039e;
                c0030g4.f3044k = false;
            }
        } else {
            C0030g c0030g5 = this.f2990c;
            c0030g5.f3040f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0030g5.f3040f);
            f fVar2 = c0030g5.f3036b;
            fVar2.a(fVar2.f3027g, f.f3020p, canvas3, iMin, iMin2);
        }
        C0030g c0030g6 = this.f2990c;
        if (c0030g6.f3036b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0030g6.f3045l == null) {
                Paint paint2 = new Paint();
                c0030g6.f3045l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0030g6.f3045l.setAlpha(c0030g6.f3036b.getRootAlpha());
            c0030g6.f3045l.setColorFilter(colorFilter);
            paint = c0030g6.f3045l;
        }
        canvas.drawBitmap(c0030g6.f3040f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getAlpha() : this.f2990c.f3036b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2990c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2988b;
        return drawable != null ? p234t0.a.C0532a.c(drawable) : this.f2992e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2988b != null) {
            return new h(this.f2988b.getConstantState());
        }
        this.f2990c.f3035a = getChangingConfigurations();
        return this.f2990c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2990c.f3036b.f3029i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2990c.f3036b.f3028h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.isAutoMirrored() : this.f2990c.f3039e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0030g c0030g = this.f2990c;
            if (c0030g != null) {
                f fVar = c0030g.f3036b;
                if (fVar.f3033n == null) {
                    fVar.f3033n = Boolean.valueOf(fVar.f3027g.a());
                }
                if (fVar.f3033n.booleanValue() || ((colorStateList = this.f2990c.f3037c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2993f && super.mutate() == this) {
            C0030g c0030g = this.f2990c;
            C0030g c0030g2 = new C0030g();
            c0030g2.f3037c = null;
            c0030g2.f3038d = f2989k;
            if (c0030g != null) {
                c0030g2.f3035a = c0030g.f3035a;
                f fVar = new f(c0030g.f3036b);
                c0030g2.f3036b = fVar;
                if (c0030g.f3036b.f3025e != null) {
                    fVar.f3025e = new Paint(c0030g.f3036b.f3025e);
                }
                if (c0030g.f3036b.f3024d != null) {
                    c0030g2.f3036b.f3024d = new Paint(c0030g.f3036b.f3024d);
                }
                c0030g2.f3037c = c0030g.f3037c;
                c0030g2.f3038d = c0030g.f3038d;
                c0030g2.f3039e = c0030g.f3039e;
            }
            this.f2990c = c0030g2;
            this.f2993f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0030g c0030g = this.f2990c;
        ColorStateList colorStateList = c0030g.f3037c;
        if (colorStateList == null || (mode = c0030g.f3038d) == null) {
            z10 = false;
        } else {
            this.f2991d = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = c0030g.f3036b;
        if (fVar.f3033n == null) {
            fVar.f3033n = Boolean.valueOf(fVar.f3027g.a());
        }
        if (fVar.f3033n.booleanValue()) {
            boolean zB = c0030g.f3036b.f3027g.b(iArr);
            c0030g.f3044k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f2990c.f3036b.getRootAlpha() != i10) {
            this.f2990c.f3036b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f2990c.f3039e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2992e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.h(drawable, colorStateList);
            return;
        }
        C0030g c0030g = this.f2990c;
        if (c0030g.f3037c != colorStateList) {
            c0030g.f3037c = colorStateList;
            this.f2991d = a(colorStateList, c0030g.f3038d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.i(drawable, mode);
            return;
        }
        C0030g c0030g = this.f2990c;
        if (c0030g.f3038d != mode) {
            c0030g.f3038d = mode;
            this.f2991d = a(c0030g.f3037c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3046a;

        public h(Drawable.ConstantState constantState) {
            this.f3046a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f3046a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3046a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.f2988b = (VectorDrawable) this.f3046a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2988b = (VectorDrawable) this.f3046a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2988b = (VectorDrawable) this.f3046a.newDrawable(resources, theme);
            return gVar;
        }
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class e extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s0.d.a[] f3017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3019c;

        public e() {
            this.f3017a = null;
            this.f3019c = 0;
        }

        public s0.d.a[] getPathData() {
            return this.f3017a;
        }

        public String getPathName() {
            return this.f3018b;
        }

        public void setPathData(s0.d.a[] aVarArr) {
            s0.d.a[] aVarArr2 = this.f3017a;
            boolean z10 = false;
            if (aVarArr2 != null && aVarArr != null && aVarArr2.length == aVarArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= aVarArr2.length) {
                        z10 = true;
                        break;
                    }
                    s0.d.a aVar = aVarArr2[i10];
                    char c10 = aVar.f46856a;
                    s0.d.a aVar2 = aVarArr[i10];
                    if (c10 != aVar2.f46856a || aVar.f46857b.length != aVar2.f46857b.length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (!z10) {
                this.f3017a = p222s0.d.d(aVarArr);
                return;
            }
            s0.d.a[] aVarArr3 = this.f3017a;
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                aVarArr3[i11].f46856a = aVarArr[i11].f46856a;
                int i12 = 0;
                while (true) {
                    float[] fArr = aVarArr[i11].f46857b;
                    if (i12 < fArr.length) {
                        aVarArr3[i11].f46857b[i12] = fArr[i12];
                        i12++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f3017a = null;
            this.f3019c = 0;
            this.f3018b = eVar.f3018b;
            this.f3017a = p222s0.d.d(eVar.f3017a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        f fVar;
        int i11;
        int i12;
        boolean z10;
        char c10;
        int i13;
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0030g c0030g = this.f2990c;
        c0030g.f3036b = new f();
        TypedArray typedArrayF = j.f(resources, theme, attributeSet, E2.a.f2968a);
        C0030g c0030g2 = this.f2990c;
        f fVar2 = c0030g2.f3036b;
        int iC = j.c(typedArrayF, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i14 = 3;
        if (iC == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iC != 5) {
            if (iC != 9) {
                switch (iC) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0030g2.f3038d = mode;
        ColorStateList colorStateListA = j.a(typedArrayF, xmlPullParser, theme);
        if (colorStateListA != null) {
            c0030g2.f3037c = colorStateListA;
        }
        boolean z11 = c0030g2.f3039e;
        if (j.e(xmlPullParser, "autoMirrored")) {
            z11 = typedArrayF.getBoolean(5, z11);
        }
        c0030g2.f3039e = z11;
        float f10 = fVar2.j;
        if (j.e(xmlPullParser, "viewportWidth")) {
            f10 = typedArrayF.getFloat(7, f10);
        }
        fVar2.j = f10;
        float f11 = fVar2.f3030k;
        if (j.e(xmlPullParser, "viewportHeight")) {
            f11 = typedArrayF.getFloat(8, f11);
        }
        fVar2.f3030k = f11;
        if (fVar2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            fVar2.f3028h = typedArrayF.getDimension(3, fVar2.f3028h);
            int i15 = 2;
            float dimension = typedArrayF.getDimension(2, fVar2.f3029i);
            fVar2.f3029i = dimension;
            if (fVar2.f3028h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fVar2.getAlpha();
                if (j.e(xmlPullParser, "alpha")) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                fVar2.setAlpha(alpha);
                boolean z12 = false;
                String string = typedArrayF.getString(0);
                if (string != null) {
                    fVar2.f3032m = string;
                    fVar2.f3034o.put(string, fVar2);
                }
                typedArrayF.recycle();
                c0030g.f3035a = getChangingConfigurations();
                int i16 = 1;
                c0030g.f3044k = true;
                C0030g c0030g3 = this.f2990c;
                f fVar3 = c0030g3.f3036b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(fVar3.f3027g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i16 && (xmlPullParser.getDepth() >= depth || eventType != i14)) {
                    if (eventType == i15) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        C0873a<String, Object> c0873a = fVar3.f3034o;
                        fVar = fVar3;
                        if (zEquals) {
                            b bVar = new b();
                            TypedArray typedArrayF2 = j.f(resources, theme, attributeSet, E2.a.f2970c);
                            if (j.e(xmlPullParser, "pathData")) {
                                String string2 = typedArrayF2.getString(0);
                                if (string2 != null) {
                                    bVar.f3018b = string2;
                                }
                                String string3 = typedArrayF2.getString(2);
                                if (string3 != null) {
                                    bVar.f3017a = p222s0.d.b(string3);
                                }
                                bVar.f2999f = j.b(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = bVar.f3001h;
                                if (j.e(xmlPullParser, "fillAlpha")) {
                                    f12 = typedArrayF2.getFloat(12, f12);
                                }
                                bVar.f3001h = f12;
                                int i17 = !j.e(xmlPullParser, "strokeLineCap") ? -1 : typedArrayF2.getInt(8, -1);
                                Paint.Cap cap = bVar.f3004l;
                                if (i17 != 0) {
                                    i11 = depth;
                                    if (i17 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (i17 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                } else {
                                    i11 = depth;
                                    cap = Paint.Cap.BUTT;
                                }
                                bVar.f3004l = cap;
                                int i18 = !j.e(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayF2.getInt(9, -1);
                                Paint.Join join = bVar.f3005m;
                                if (i18 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i18 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i18 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                bVar.f3005m = join;
                                float f13 = bVar.f3006n;
                                if (j.e(xmlPullParser, "strokeMiterLimit")) {
                                    f13 = typedArrayF2.getFloat(10, f13);
                                }
                                bVar.f3006n = f13;
                                bVar.f2997d = j.b(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = bVar.f3000g;
                                if (j.e(xmlPullParser, "strokeAlpha")) {
                                    f14 = typedArrayF2.getFloat(11, f14);
                                }
                                bVar.f3000g = f14;
                                float f15 = bVar.f2998e;
                                if (j.e(xmlPullParser, "strokeWidth")) {
                                    f15 = typedArrayF2.getFloat(4, f15);
                                }
                                bVar.f2998e = f15;
                                float f16 = bVar.j;
                                if (j.e(xmlPullParser, "trimPathEnd")) {
                                    f16 = typedArrayF2.getFloat(6, f16);
                                }
                                bVar.j = f16;
                                float f17 = bVar.f3003k;
                                if (j.e(xmlPullParser, "trimPathOffset")) {
                                    f17 = typedArrayF2.getFloat(7, f17);
                                }
                                bVar.f3003k = f17;
                                float f18 = bVar.f3002i;
                                if (j.e(xmlPullParser, "trimPathStart")) {
                                    f18 = typedArrayF2.getFloat(5, f18);
                                }
                                bVar.f3002i = f18;
                                int i19 = bVar.f3019c;
                                if (j.e(xmlPullParser, "fillType")) {
                                    i19 = typedArrayF2.getInt(13, i19);
                                }
                                bVar.f3019c = i19;
                            } else {
                                i11 = depth;
                            }
                            typedArrayF2.recycle();
                            cVar.f3008b.add(bVar);
                            if (bVar.getPathName() != null) {
                                c0873a.put(bVar.getPathName(), bVar);
                            }
                            c0030g3.f3035a = c0030g3.f3035a;
                            z10 = false;
                            c10 = 5;
                            i13 = 1;
                            z13 = false;
                        } else {
                            i11 = depth;
                            if ("clip-path".equals(name)) {
                                a aVar = new a();
                                if (j.e(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayF3 = j.f(resources, theme, attributeSet, E2.a.f2971d);
                                    String string4 = typedArrayF3.getString(0);
                                    if (string4 != null) {
                                        aVar.f3018b = string4;
                                    }
                                    String string5 = typedArrayF3.getString(1);
                                    if (string5 != null) {
                                        aVar.f3017a = p222s0.d.b(string5);
                                    }
                                    aVar.f3019c = !j.e(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                    typedArrayF3.recycle();
                                }
                                cVar.f3008b.add(aVar);
                                if (aVar.getPathName() != null) {
                                    c0873a.put(aVar.getPathName(), aVar);
                                }
                                c0030g3.f3035a = c0030g3.f3035a;
                            } else if ("group".equals(name)) {
                                c cVar2 = new c();
                                TypedArray typedArrayF4 = j.f(resources, theme, attributeSet, E2.a.f2969b);
                                float f19 = cVar2.f3009c;
                                if (j.e(xmlPullParser, "rotation")) {
                                    c10 = 5;
                                    f19 = typedArrayF4.getFloat(5, f19);
                                } else {
                                    c10 = 5;
                                }
                                cVar2.f3009c = f19;
                                i13 = 1;
                                cVar2.f3010d = typedArrayF4.getFloat(1, cVar2.f3010d);
                                cVar2.f3011e = typedArrayF4.getFloat(2, cVar2.f3011e);
                                float f20 = cVar2.f3012f;
                                if (j.e(xmlPullParser, "scaleX")) {
                                    f20 = typedArrayF4.getFloat(3, f20);
                                }
                                cVar2.f3012f = f20;
                                float f21 = cVar2.f3013g;
                                if (j.e(xmlPullParser, "scaleY")) {
                                    f21 = typedArrayF4.getFloat(4, f21);
                                }
                                cVar2.f3013g = f21;
                                float f22 = cVar2.f3014h;
                                if (j.e(xmlPullParser, "translateX")) {
                                    f22 = typedArrayF4.getFloat(6, f22);
                                }
                                cVar2.f3014h = f22;
                                float f23 = cVar2.f3015i;
                                if (j.e(xmlPullParser, "translateY")) {
                                    f23 = typedArrayF4.getFloat(7, f23);
                                }
                                cVar2.f3015i = f23;
                                z10 = false;
                                String string6 = typedArrayF4.getString(0);
                                if (string6 != null) {
                                    cVar2.f3016k = string6;
                                }
                                cVar2.c();
                                typedArrayF4.recycle();
                                cVar.f3008b.add(cVar2);
                                arrayDeque.push(cVar2);
                                if (cVar2.getGroupName() != null) {
                                    c0873a.put(cVar2.getGroupName(), cVar2);
                                }
                                c0030g3.f3035a = c0030g3.f3035a;
                            }
                            z10 = false;
                            c10 = 5;
                            i13 = 1;
                        }
                        i10 = i13;
                        i12 = 3;
                    } else {
                        i10 = i16;
                        fVar = fVar3;
                        i11 = depth;
                        i12 = i14;
                        z10 = z12;
                        if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i14 = i12;
                    i16 = i10;
                    z12 = z10;
                    fVar3 = fVar;
                    depth = i11;
                    i15 = 2;
                }
                if (!z13) {
                    this.f2991d = a(c0030g.f3037c, c0030g.f3038d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f3007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f3008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f3010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f3011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f3012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3014h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3015i;
        public final Matrix j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f3016k;

        public c() {
            this.f3007a = new Matrix();
            this.f3008b = new ArrayList<>();
            this.f3009c = 0.0f;
            this.f3010d = 0.0f;
            this.f3011e = 0.0f;
            this.f3012f = 1.0f;
            this.f3013g = 1.0f;
            this.f3014h = 0.0f;
            this.f3015i = 0.0f;
            this.j = new Matrix();
            this.f3016k = null;
        }

        @Override // E2.g.d
        public final boolean a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f3008b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // E2.g.d
        public final boolean b(int[] iArr) {
            int i10 = 0;
            boolean zB = false;
            while (true) {
                ArrayList<d> arrayList = this.f3008b;
                if (i10 >= arrayList.size()) {
                    return zB;
                }
                zB |= arrayList.get(i10).b(iArr);
                i10++;
            }
        }

        public final void c() {
            Matrix matrix = this.j;
            matrix.reset();
            matrix.postTranslate(-this.f3010d, -this.f3011e);
            matrix.postScale(this.f3012f, this.f3013g);
            matrix.postRotate(this.f3009c, 0.0f, 0.0f);
            matrix.postTranslate(this.f3014h + this.f3010d, this.f3015i + this.f3011e);
        }

        public String getGroupName() {
            return this.f3016k;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.f3010d;
        }

        public float getPivotY() {
            return this.f3011e;
        }

        public float getRotation() {
            return this.f3009c;
        }

        public float getScaleX() {
            return this.f3012f;
        }

        public float getScaleY() {
            return this.f3013g;
        }

        public float getTranslateX() {
            return this.f3014h;
        }

        public float getTranslateY() {
            return this.f3015i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f3010d) {
                this.f3010d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f3011e) {
                this.f3011e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f3009c) {
                this.f3009c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f3012f) {
                this.f3012f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f3013g) {
                this.f3013g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f3014h) {
                this.f3014h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f3015i) {
                this.f3015i = f10;
                c();
            }
        }

        public c(c cVar, C0873a<String, Object> c0873a) {
            e aVar;
            this.f3007a = new Matrix();
            this.f3008b = new ArrayList<>();
            this.f3009c = 0.0f;
            this.f3010d = 0.0f;
            this.f3011e = 0.0f;
            this.f3012f = 1.0f;
            this.f3013g = 1.0f;
            this.f3014h = 0.0f;
            this.f3015i = 0.0f;
            Matrix matrix = new Matrix();
            this.j = matrix;
            this.f3016k = null;
            this.f3009c = cVar.f3009c;
            this.f3010d = cVar.f3010d;
            this.f3011e = cVar.f3011e;
            this.f3012f = cVar.f3012f;
            this.f3013g = cVar.f3013g;
            this.f3014h = cVar.f3014h;
            this.f3015i = cVar.f3015i;
            String str = cVar.f3016k;
            this.f3016k = str;
            if (str != null) {
                c0873a.put(str, this);
            }
            matrix.set(cVar.j);
            ArrayList<d> arrayList = cVar.f3008b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f3008b.add(new c((c) dVar, c0873a));
                } else {
                    if (dVar instanceof b) {
                        b bVar = (b) dVar;
                        b bVar2 = new b(bVar);
                        bVar2.f2998e = 0.0f;
                        bVar2.f3000g = 1.0f;
                        bVar2.f3001h = 1.0f;
                        bVar2.f3002i = 0.0f;
                        bVar2.j = 1.0f;
                        bVar2.f3003k = 0.0f;
                        bVar2.f3004l = Paint.Cap.BUTT;
                        bVar2.f3005m = Paint.Join.MITER;
                        bVar2.f3006n = 4.0f;
                        bVar2.f2997d = bVar.f2997d;
                        bVar2.f2998e = bVar.f2998e;
                        bVar2.f3000g = bVar.f3000g;
                        bVar2.f2999f = bVar.f2999f;
                        bVar2.f3019c = bVar.f3019c;
                        bVar2.f3001h = bVar.f3001h;
                        bVar2.f3002i = bVar.f3002i;
                        bVar2.j = bVar.j;
                        bVar2.f3003k = bVar.f3003k;
                        bVar2.f3004l = bVar.f3004l;
                        bVar2.f3005m = bVar.f3005m;
                        bVar2.f3006n = bVar.f3006n;
                        aVar = bVar2;
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f3008b.add(aVar);
                    String str2 = aVar.f3018b;
                    if (str2 != null) {
                        c0873a.put(str2, aVar);
                    }
                }
            }
        }
    }

    public g(C0030g c0030g) {
        this.f2994g = true;
        this.f2995h = new float[9];
        this.f2996i = new Matrix();
        this.j = new Rect();
        this.f2990c = c0030g;
        this.f2991d = a(c0030g.f3037c, c0030g.f3038d);
    }

    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class f {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Matrix f3020p = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f3021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f3022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f3023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f3024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f3025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f3026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f3027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3028h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3029i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f3030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f3031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f3032m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Boolean f3033n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final C0873a<String, Object> f3034o;

        public f() {
            this.f3023c = new Matrix();
            this.f3028h = 0.0f;
            this.f3029i = 0.0f;
            this.j = 0.0f;
            this.f3030k = 0.0f;
            this.f3031l = 255;
            this.f3032m = null;
            this.f3033n = null;
            this.f3034o = new C0873a<>();
            this.f3027g = new c();
            this.f3021a = new Path();
            this.f3022b = new Path();
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0137  */
        /* JADX WARN: Code duplicated, block: B:50:0x0144  */
        /* JADX WARN: Code duplicated, block: B:52:0x0148  */
        /* JADX WARN: Code duplicated, block: B:55:0x015b  */
        /* JADX WARN: Code duplicated, block: B:56:0x016c  */
        /* JADX WARN: Code duplicated, block: B:59:0x018d  */
        /* JADX WARN: Code duplicated, block: B:60:0x0190  */
        /* JADX WARN: Code duplicated, block: B:67:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:72:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:78:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:79:0x01de  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r9v8, types: [android.graphics.PathMeasure] */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f10;
            float f11;
            p211r0.d dVar;
            ?? r10;
            p211r0.d dVar2;
            Paint paint;
            Paint.Join join;
            Paint.Cap cap;
            Shader shader;
            Paint paint2;
            Shader shader2;
            Path.FillType fillType;
            int i13 = 1;
            cVar.f3007a.set(matrix);
            Matrix matrix2 = cVar.j;
            Matrix matrix3 = cVar.f3007a;
            matrix3.preConcat(matrix2);
            canvas.save();
            ?? r11 = 0;
            int i14 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f3008b;
                if (i14 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar3 = arrayList.get(i14);
                if (dVar3 instanceof c) {
                    a((c) dVar3, matrix3, canvas, i10, i11);
                    i12 = i13;
                } else if (dVar3 instanceof e) {
                    e eVar = (e) dVar3;
                    float f12 = i10 / this.j;
                    float f13 = i11 / this.f3030k;
                    float fMin = Math.min(f12, f13);
                    Matrix matrix4 = this.f3023c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[r11], fArr[i13]);
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        eVar.getClass();
                        Path path = this.f3021a;
                        path.reset();
                        s0.d.a[] aVarArr = eVar.f3017a;
                        if (aVarArr != null) {
                            s0.d.a.b(aVarArr, path);
                        }
                        Path path2 = this.f3022b;
                        path2.reset();
                        if (eVar instanceof a) {
                            path2.setFillType(eVar.f3019c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) eVar;
                            float f15 = bVar.f3002i;
                            if (f15 == 0.0f) {
                                f10 = 1.0f;
                                if (bVar.j != 1.0f) {
                                }
                                path2.addPath(path, matrix4);
                                dVar = bVar.f2999f;
                                if (dVar.f46234a != null && dVar.f46236c == 0) {
                                    r10 = r11;
                                } else {
                                    r10 = 1;
                                }
                                if (r10 != 0) {
                                    if (this.f3025e == null) {
                                        Paint paint3 = new Paint(1);
                                        this.f3025e = paint3;
                                        paint3.setStyle(Paint.Style.FILL);
                                    }
                                    paint2 = this.f3025e;
                                    shader2 = dVar.f46234a;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint2.setShader(shader2);
                                        paint2.setAlpha(Math.round(bVar.f3001h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i15 = dVar.f46236c;
                                        float f16 = bVar.f3001h;
                                        PorterDuff.Mode mode = g.f2989k;
                                        paint2.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f16)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.f3019c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                dVar2 = bVar.f2997d;
                                if (dVar2.f46234a == null || dVar2.f46236c != 0) {
                                    if (this.f3024d == null) {
                                        Paint paint4 = new Paint(1);
                                        this.f3024d = paint4;
                                        paint4.setStyle(Paint.Style.STROKE);
                                    }
                                    paint = this.f3024d;
                                    join = bVar.f3005m;
                                    if (join != null) {
                                        paint.setStrokeJoin(join);
                                    }
                                    cap = bVar.f3004l;
                                    if (cap != null) {
                                        paint.setStrokeCap(cap);
                                    }
                                    paint.setStrokeMiter(bVar.f3006n);
                                    shader = dVar2.f46234a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint.setShader(shader);
                                        paint.setAlpha(Math.round(bVar.f3000g * 255.0f));
                                    } else {
                                        paint.setShader(null);
                                        paint.setAlpha(255);
                                        int i16 = dVar2.f46236c;
                                        float f17 = bVar.f3000g;
                                        PorterDuff.Mode mode2 = g.f2989k;
                                        paint.setColor((i16 & 16777215) | (((int) (Color.alpha(i16) * f17)) << 24));
                                    }
                                    paint.setColorFilter(null);
                                    paint.setStrokeWidth(bVar.f2998e * fAbs * fMin);
                                    canvas.drawPath(path2, paint);
                                }
                            } else {
                                f10 = 1.0f;
                            }
                            float f18 = bVar.f3003k;
                            float f19 = (f15 + f18) % f10;
                            float f20 = (bVar.j + f18) % f10;
                            if (this.f3026f == null) {
                                this.f3026f = new PathMeasure();
                            }
                            this.f3026f.setPath(path, r11);
                            float length = this.f3026f.getLength();
                            float f21 = f19 * length;
                            float f22 = f20 * length;
                            path.reset();
                            if (f21 > f22) {
                                this.f3026f.getSegment(f21, length, path, true);
                                f11 = 0.0f;
                                this.f3026f.getSegment(0.0f, f22, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f3026f.getSegment(f21, f22, path, true);
                            }
                            path.rLineTo(f11, f11);
                            path2.addPath(path, matrix4);
                            dVar = bVar.f2999f;
                            if (dVar.f46234a != null) {
                                r10 = 1;
                            } else {
                                r10 = r11;
                            }
                            if (r10 != 0) {
                                if (this.f3025e == null) {
                                    Paint paint5 = new Paint(1);
                                    this.f3025e = paint5;
                                    paint5.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.f3025e;
                                shader2 = dVar.f46234a;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(bVar.f3001h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i17 = dVar.f46236c;
                                    float f110 = bVar.f3001h;
                                    PorterDuff.Mode mode3 = g.f2989k;
                                    paint2.setColor((i17 & 16777215) | (((int) (Color.alpha(i17) * f110)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (bVar.f3019c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            dVar2 = bVar.f2997d;
                            if (dVar2.f46234a == null) {
                                if (this.f3024d == null) {
                                    Paint paint6 = new Paint(1);
                                    this.f3024d = paint6;
                                    paint6.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f3024d;
                                join = bVar.f3005m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = bVar.f3004l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(bVar.f3006n);
                                shader = dVar2.f46234a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(bVar.f3000g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i18 = dVar2.f46236c;
                                    float f111 = bVar.f3000g;
                                    PorterDuff.Mode mode4 = g.f2989k;
                                    paint.setColor((i18 & 16777215) | (((int) (Color.alpha(i18) * f111)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(bVar.f2998e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            } else {
                                if (this.f3024d == null) {
                                    Paint paint7 = new Paint(1);
                                    this.f3024d = paint7;
                                    paint7.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f3024d;
                                join = bVar.f3005m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = bVar.f3004l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(bVar.f3006n);
                                shader = dVar2.f46234a;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(bVar.f3000g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i19 = dVar2.f46236c;
                                    float f112 = bVar.f3000g;
                                    PorterDuff.Mode mode5 = g.f2989k;
                                    paint.setColor((i19 & 16777215) | (((int) (Color.alpha(i19) * f112)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(bVar.f2998e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        }
                    }
                    i12 = 1;
                } else {
                    i12 = i13;
                }
                i14 += i12;
                i13 = i12;
                matrix3 = matrix3;
                r11 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3031l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f3031l = i10;
        }

        public f(f fVar) {
            this.f3023c = new Matrix();
            this.f3028h = 0.0f;
            this.f3029i = 0.0f;
            this.j = 0.0f;
            this.f3030k = 0.0f;
            this.f3031l = 255;
            this.f3032m = null;
            this.f3033n = null;
            C0873a<String, Object> c0873a = new C0873a<>();
            this.f3034o = c0873a;
            this.f3027g = new c(fVar.f3027g, c0873a);
            this.f3021a = new Path(fVar.f3021a);
            this.f3022b = new Path(fVar.f3022b);
            this.f3028h = fVar.f3028h;
            this.f3029i = fVar.f3029i;
            this.j = fVar.j;
            this.f3030k = fVar.f3030k;
            this.f3031l = fVar.f3031l;
            this.f3032m = fVar.f3032m;
            String str = fVar.f3032m;
            if (str != null) {
                c0873a.put(str, this);
            }
            this.f3033n = fVar.f3033n;
        }
    }
}
