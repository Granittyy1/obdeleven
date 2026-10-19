package com.google.android.material.internal;

import P5.f;
import X0.b;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;
import p307z0.e;

/* JADX INFO: compiled from: CollapsingTextHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f27265A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f27266B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f27267C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Bitmap f27269E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f27270F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f27271G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f27272H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f27273I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f27274J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f27275K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int[] f27276L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f27277M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final TextPaint f27278N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final TextPaint f27279O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public LinearInterpolator f27280P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f27281Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public float f27282R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f27283S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public float f27284T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ColorStateList f27285U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f27286V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f27287W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public float f27288X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public StaticLayout f27289Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f27290Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f27291a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f27292a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27293b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f27294b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f27295c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f27296c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f27297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f27299e;
    public ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f27306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f27307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f27308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f27309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f27310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f27311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f27312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f27313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f27314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f27315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f27316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f27317v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f27318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f27319x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public P5.a f27320y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27301f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27303g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27304h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27305i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f27321z = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f27268D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f27298d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f27300e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f27302f0 = 1;

    public a(TextInputLayout textInputLayout) {
        this.f27291a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f27278N = textPaint;
        this.f27279O = new TextPaint(textPaint);
        this.f27297d = new Rect();
        this.f27295c = new Rect();
        this.f27299e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return p216r5.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        boolean z10 = this.f27291a.getLayoutDirection() == 1;
        if (this.f27268D) {
            return (z10 ? e.f48698d : e.f48697c).b(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(boolean z10, float f10) throws StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        float f11;
        float f12;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        if (this.f27265A == null) {
            return;
        }
        float fWidth = this.f27297d.width();
        float fWidth2 = this.f27295c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f27305i;
            f12 = this.f27286V;
            this.f27270F = 1.0f;
            typeface = this.f27313r;
        } else {
            float f13 = this.f27304h;
            float f14 = this.f27287W;
            Typeface typeface2 = this.f27316u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.f27270F = 1.0f;
            } else {
                this.f27270F = f(this.f27304h, this.f27305i, f10, this.f27281Q) / this.f27304h;
            }
            float f15 = this.f27305i / this.f27304h;
            fWidth = (z10 || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f27278N;
        if (fWidth > 0.0f) {
            boolean z12 = this.f27271G != f11;
            boolean z13 = this.f27288X != f12;
            boolean z14 = this.f27319x != typeface;
            StaticLayout staticLayout = this.f27289Y;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.f27277M;
            this.f27271G = f11;
            this.f27288X = f12;
            this.f27319x = typeface;
            this.f27277M = false;
            textPaint.setLinearText(this.f27270F != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.f27266B == null || z11) {
            textPaint.setTextSize(this.f27271G);
            textPaint.setTypeface(this.f27319x);
            textPaint.setLetterSpacing(this.f27288X);
            boolean zB = b(this.f27265A);
            this.f27267C = zB;
            int i10 = this.f27298d0;
            if (i10 <= 1 || zB) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f27301f, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f27267C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f27267C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f27265A, textPaint, (int) fWidth);
            staticLayoutBuilderCompat.f27263k = this.f27321z;
            staticLayoutBuilderCompat.j = zB;
            staticLayoutBuilderCompat.f27258e = alignment;
            staticLayoutBuilderCompat.f27262i = false;
            staticLayoutBuilderCompat.f27259f = i10;
            staticLayoutBuilderCompat.f27260g = this.f27300e0;
            staticLayoutBuilderCompat.f27261h = this.f27302f0;
            StaticLayout staticLayoutA = staticLayoutBuilderCompat.a();
            staticLayoutA.getClass();
            this.f27289Y = staticLayoutA;
            this.f27266B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f27279O;
        textPaint.setTextSize(this.f27305i);
        textPaint.setTypeface(this.f27313r);
        textPaint.setLetterSpacing(this.f27286V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f27276L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f27315t;
            if (typeface != null) {
                this.f27314s = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f27318w;
            if (typeface2 != null) {
                this.f27317v = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f27314s;
            if (typeface3 == null) {
                typeface3 = this.f27315t;
            }
            this.f27313r = typeface3;
            Typeface typeface4 = this.f27317v;
            if (typeface4 == null) {
                typeface4 = this.f27318w;
            }
            this.f27316u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z10) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f27291a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z10) {
            return;
        }
        c(z10, 1.0f);
        CharSequence charSequence = this.f27266B;
        TextPaint textPaint = this.f27278N;
        if (charSequence != null && (staticLayout = this.f27289Y) != null) {
            this.f27296c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f27321z);
        }
        CharSequence charSequence2 = this.f27296c0;
        if (charSequence2 != null) {
            this.f27290Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f27290Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f27303g, this.f27267C ? 1 : 0);
        int i10 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Rect rect = this.f27297d;
        if (i10 == 48) {
            this.f27308m = rect.top;
        } else if (i10 != 80) {
            this.f27308m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f27308m = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f27310o = rect.centerX() - (this.f27290Z / 2.0f);
        } else if (i11 != 5) {
            this.f27310o = rect.left;
        } else {
            this.f27310o = rect.right - this.f27290Z;
        }
        c(z10, 0.0f);
        StaticLayout staticLayout2 = this.f27289Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f27289Y;
        if (staticLayout3 == null || this.f27298d0 <= 1) {
            CharSequence charSequence3 = this.f27266B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f27289Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f27301f, this.f27267C ? 1 : 0);
        int i12 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Rect rect2 = this.f27295c;
        if (i12 == 48) {
            this.f27307l = rect2.top;
        } else if (i12 != 80) {
            this.f27307l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f27307l = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f27309n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f27309n = rect2.left;
        } else {
            this.f27309n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f27269E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f27269E = null;
        }
        l(this.f27293b);
        float f10 = this.f27293b;
        float f11 = f(rect2.left, rect.left, f10, this.f27280P);
        RectF rectF = this.f27299e;
        rectF.left = f11;
        rectF.top = f(this.f27307l, this.f27308m, f10, this.f27280P);
        rectF.right = f(rect2.right, rect.right, f10, this.f27280P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.f27280P);
        this.f27311p = f(this.f27309n, this.f27310o, f10, this.f27280P);
        this.f27312q = f(this.f27307l, this.f27308m, f10, this.f27280P);
        l(f10);
        b bVar = p216r5.a.f46342b;
        this.f27292a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        textInputLayout.postInvalidateOnAnimation();
        this.f27294b0 = f(1.0f, 0.0f, f10, bVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f27306k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.f27306k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.f27286V;
        float f13 = this.f27287W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, bVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f27272H = p216r5.a.a(0.0f, this.f27282R, f10);
        this.f27273I = p216r5.a.a(0.0f, this.f27283S, f10);
        this.f27274J = p216r5.a.a(0.0f, this.f27284T, f10);
        int iA = a(f10, 0, e(this.f27285U));
        this.f27275K = iA;
        textPaint.setShadowLayer(this.f27272H, this.f27273I, this.f27274J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f27306k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f27306k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        P5.a aVar = this.f27320y;
        if (aVar != null) {
            aVar.f4931e = true;
        }
        if (this.f27315t == typeface) {
            return false;
        }
        this.f27315t = typeface;
        Typeface typefaceA = f.a(this.f27291a.getContext().getResources().getConfiguration(), typeface);
        this.f27314s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f27315t;
        }
        this.f27313r = typefaceA;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f27293b) {
            this.f27293b = f10;
            Rect rect = this.f27295c;
            float f11 = rect.left;
            Rect rect2 = this.f27297d;
            float f12 = f(f11, rect2.left, f10, this.f27280P);
            RectF rectF = this.f27299e;
            rectF.left = f12;
            rectF.top = f(this.f27307l, this.f27308m, f10, this.f27280P);
            rectF.right = f(rect.right, rect2.right, f10, this.f27280P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f10, this.f27280P);
            this.f27311p = f(this.f27309n, this.f27310o, f10, this.f27280P);
            this.f27312q = f(this.f27307l, this.f27308m, f10, this.f27280P);
            l(f10);
            b bVar = p216r5.a.f46342b;
            this.f27292a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            TextInputLayout textInputLayout = this.f27291a;
            textInputLayout.postInvalidateOnAnimation();
            this.f27294b0 = f(1.0f, 0.0f, f10, bVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f27306k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f27278N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f27306k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f27286V;
            float f14 = this.f27287W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f27272H = p216r5.a.a(0.0f, this.f27282R, f10);
            this.f27273I = p216r5.a.a(0.0f, this.f27283S, f10);
            this.f27274J = p216r5.a.a(0.0f, this.f27284T, f10);
            int iA = a(f10, 0, e(this.f27285U));
            this.f27275K = iA;
            textPaint.setShadowLayer(this.f27272H, this.f27273I, this.f27274J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) throws StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
        c(false, f10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        this.f27291a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean zJ = j(typeface);
        if (this.f27318w != typeface) {
            this.f27318w = typeface;
            Typeface typefaceA = f.a(this.f27291a.getContext().getResources().getConfiguration(), typeface);
            this.f27317v = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f27318w;
            }
            this.f27316u = typefaceA;
            z10 = true;
        } else {
            z10 = false;
        }
        if (zJ || z10) {
            h(false);
        }
    }
}
