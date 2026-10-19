package com.google.android.material.chip;

import K5.m;
import K5.t;
import P5.d;
import S5.f;
import S5.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p216r5.g;
import p234t0.b;

/* JADX INFO: compiled from: ChipDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends f implements Drawable.Callback, m.b {

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final int[] f26946W0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final ShapeDrawable f26947X0 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f26948A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final Path f26949A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f26950B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final m f26951B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f26952C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f26953C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f26954D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f26955D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f26956E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f26957E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f26958F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f26959F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f26960G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f26961G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f26962H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f26963H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Drawable f26964I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f26965I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ColorStateList f26966J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f26967J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f26968K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f26969K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f26970L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ColorFilter f26971L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f26972M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public PorterDuffColorFilter f26973M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Drawable f26974N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ColorStateList f26975N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public RippleDrawable f26976O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public PorterDuff.Mode f26977O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ColorStateList f26978P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int[] f26979P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f26980Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ColorStateList f26981Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SpannableStringBuilder f26982R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public WeakReference<InterfaceC0269a> f26983R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f26984S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public TextUtils.TruncateAt f26985S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f26986T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f26987T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Drawable f26988U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f26989U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ColorStateList f26990V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f26991V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public g f26992W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public g f26993X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f26994Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public float f26995Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f26996p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f26997q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f26998r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f26999s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f27000t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f27001u0;
    public final Context v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Paint f27002w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Paint.FontMetrics f27003x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final RectF f27004y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f27005z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final PointF f27006z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChipDrawable.java */
    public interface InterfaceC0269a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.chipStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Chip_Action);
        this.f26952C = -1.0f;
        this.f27002w0 = new Paint(1);
        this.f27003x0 = new Paint.FontMetrics();
        this.f27004y0 = new RectF();
        this.f27006z0 = new PointF();
        this.f26949A0 = new Path();
        this.f26969K0 = 255;
        this.f26977O0 = PorterDuff.Mode.SRC_IN;
        this.f26983R0 = new WeakReference<>(null);
        i(context);
        this.v0 = context;
        m mVar = new m(this);
        this.f26951B0 = mVar;
        this.f26960G = "";
        mVar.f4348a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f26946W0;
        setState(iArr);
        if (!Arrays.equals(this.f26979P0, iArr)) {
            this.f26979P0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.f26987T0 = true;
        f26947X0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z10) {
        if (this.f26986T != z10) {
            boolean zR = R();
            this.f26986T = z10;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    o(this.f26988U);
                } else {
                    U(this.f26988U);
                }
                invalidateSelf();
                v();
            }
        }
    }

    @Deprecated
    public final void B(float f10) {
        if (this.f26952C != f10) {
            this.f26952C = f10;
            i.a aVarE = this.f5566b.f5589a.e();
            aVarE.e(f10);
            aVarE.f(f10);
            aVarE.d(f10);
            aVarE.c(f10);
            setShapeAppearanceModel(aVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void C(Drawable drawable) {
        ?? B10;
        Object obj = this.f26964I;
        if (obj == null) {
            B10 = 0;
        } else if (obj instanceof b) {
            B10 = obj;
            B10 = ((b) obj).b();
        }
        if (B10 != drawable) {
            float fQ = q();
            this.f26964I = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            U(B10);
            if (S()) {
                o(this.f26964I);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void D(float f10) {
        if (this.f26968K != f10) {
            float fQ = q();
            this.f26968K = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f26970L = true;
        if (this.f26966J != colorStateList) {
            this.f26966J = colorStateList;
            if (S()) {
                p234t0.a.C0532a.h(this.f26964I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        if (this.f26962H != z10) {
            boolean zS = S();
            this.f26962H = z10;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    o(this.f26964I);
                } else {
                    U(this.f26964I);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f26954D != colorStateList) {
            this.f26954D = colorStateList;
            if (this.f26991V0) {
                f.b bVar = this.f5566b;
                if (bVar.f5592d != colorStateList) {
                    bVar.f5592d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f10) {
        if (this.f26956E != f10) {
            this.f26956E = f10;
            this.f27002w0.setStrokeWidth(f10);
            if (this.f26991V0) {
                this.f5566b.j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void I(Drawable drawable) {
        ?? B10;
        Object obj = this.f26974N;
        if (obj == null) {
            B10 = 0;
        } else if (obj instanceof b) {
            B10 = obj;
            B10 = ((b) obj).b();
        }
        if (B10 != drawable) {
            float fR = r();
            this.f26974N = drawable != null ? drawable.mutate() : null;
            this.f26976O = new RippleDrawable(Q5.a.b(this.f26958F), this.f26974N, f26947X0);
            float fR2 = r();
            U(B10);
            if (T()) {
                o(this.f26974N);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    public final void J(float f10) {
        if (this.f27000t0 != f10) {
            this.f27000t0 = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f10) {
        if (this.f26980Q != f10) {
            this.f26980Q = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f10) {
        if (this.f26999s0 != f10) {
            this.f26999s0 = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f26978P != colorStateList) {
            this.f26978P = colorStateList;
            if (T()) {
                p234t0.a.C0532a.h(this.f26974N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f26972M != z10) {
            boolean zT = T();
            this.f26972M = z10;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    o(this.f26974N);
                } else {
                    U(this.f26974N);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f10) {
        if (this.f26996p0 != f10) {
            float fQ = q();
            this.f26996p0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void P(float f10) {
        if (this.f26995Z != f10) {
            float fQ = q();
            this.f26995Z = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f26958F != colorStateList) {
            this.f26958F = colorStateList;
            this.f26981Q0 = null;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        return this.f26986T && this.f26988U != null && this.f26965I0;
    }

    public final boolean S() {
        return this.f26962H && this.f26964I != null;
    }

    public final boolean T() {
        return this.f26972M && this.f26974N != null;
    }

    @Override // K5.m.b
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        RectF rectF;
        int i11;
        int i12;
        int i13;
        RectF rectF2;
        float f10;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.f26969K0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i10 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        boolean z10 = this.f26991V0;
        Paint paint = this.f27002w0;
        RectF rectF3 = this.f27004y0;
        if (!z10) {
            paint.setColor(this.f26953C0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (!this.f26991V0) {
            paint.setColor(this.f26955D0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f26971L0;
            if (colorFilter == null) {
                colorFilter = this.f26973M0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (this.f26991V0) {
            super.draw(canvas);
        }
        if (this.f26956E > 0.0f && !this.f26991V0) {
            paint.setColor(this.f26959F0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f26991V0) {
                ColorFilter colorFilter2 = this.f26971L0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f26973M0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.f26956E / 2.0f;
            rectF3.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.f26952C - (this.f26956E / 2.0f);
            canvas.drawRoundRect(rectF3, f13, f13, paint);
        }
        paint.setColor(this.f26961G0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f26991V0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f26949A0;
            f.b bVar = this.f5566b;
            this.f5582s.a(bVar.f5589a, bVar.f5597i, rectF4, this.f5581r, path);
            e(canvas, paint, path, this.f5566b.f5589a, g());
        } else {
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (S()) {
            p(bounds, rectF3);
            float f14 = rectF3.left;
            float f15 = rectF3.top;
            canvas.translate(f14, f15);
            this.f26964I.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f26964I.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (R()) {
            p(bounds, rectF3);
            float f16 = rectF3.left;
            float f17 = rectF3.top;
            canvas.translate(f16, f17);
            this.f26988U.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f26988U.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (!this.f26987T0 || this.f26960G == null) {
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 0;
            i13 = 255;
        } else {
            PointF pointF = this.f27006z0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f26960G;
            m mVar = this.f26951B0;
            if (charSequence != null) {
                float fQ = q() + this.f26994Y + this.f26997q0;
                if (t0.a.b.a(this) == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = mVar.f4348a;
                Paint.FontMetrics fontMetrics = this.f27003x0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f26960G != null) {
                float fQ2 = q() + this.f26994Y + this.f26997q0;
                float fR = r() + this.f27001u0 + this.f26998r0;
                if (t0.a.b.a(this) == 0) {
                    rectF3.left = bounds.left + fQ2;
                    rectF3.right = bounds.right - fR;
                } else {
                    rectF3.left = bounds.left + fR;
                    rectF3.right = bounds.right - fQ2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            d dVar = mVar.f4354g;
            TextPaint textPaint2 = mVar.f4348a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.f4354g.e(this.v0, textPaint2, mVar.f4349b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f26960G.toString();
            if (mVar.f4352e) {
                mVar.a(string);
                f10 = mVar.f4350c;
            } else {
                f10 = mVar.f4350c;
            }
            boolean z11 = Math.round(f10) > Math.round(rectF3.width());
            if (z11) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.f26960G;
            if (z11 && this.f26985S0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.f26985S0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f18 = pointF.x;
            float f19 = pointF.y;
            rectF = rectF3;
            i11 = iSaveLayerAlpha;
            i12 = 0;
            i13 = 255;
            canvas.drawText(charSequence2, 0, length, f18, f19, textPaint2);
            if (z11) {
                canvas.restoreToCount(iSave);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f20 = this.f27001u0 + this.f27000t0;
                if (t0.a.b.a(this) == 0) {
                    float f21 = bounds.right - f20;
                    rectF2 = rectF;
                    rectF2.right = f21;
                    rectF2.left = f21 - this.f26980Q;
                } else {
                    rectF2 = rectF;
                    float f22 = bounds.left + f20;
                    rectF2.left = f22;
                    rectF2.right = f22 + this.f26980Q;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f23 = this.f26980Q;
                float f24 = fExactCenterY - (f23 / 2.0f);
                rectF2.top = f24;
                rectF2.bottom = f24 + f23;
            } else {
                rectF2 = rectF;
            }
            float f25 = rectF2.left;
            float f26 = rectF2.top;
            canvas.translate(f25, f26);
            this.f26974N.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
            this.f26976O.setBounds(this.f26974N.getBounds());
            this.f26976O.jumpToCurrentState();
            this.f26976O.draw(canvas);
            canvas.translate(-f25, -f26);
        }
        if (this.f26969K0 < i13) {
            canvas.restoreToCount(i11);
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f26969K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f26971L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f26950B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10;
        float fQ = q() + this.f26994Y + this.f26997q0;
        String string = this.f26960G.toString();
        m mVar = this.f26951B0;
        if (mVar.f4352e) {
            mVar.a(string);
            f10 = mVar.f4350c;
        } else {
            f10 = mVar.f4350c;
        }
        return Math.min(Math.round(r() + f10 + fQ + this.f26998r0 + this.f27001u0), this.f26989U0);
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f26991V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f26950B, this.f26952C);
        } else {
            outline.setRoundRect(bounds, this.f26952C);
        }
        outline.setAlpha(this.f26969K0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        d dVar;
        ColorStateList colorStateList;
        return t(this.f27005z) || t(this.f26948A) || t(this.f26954D) || !((dVar = this.f26951B0.f4354g) == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) || ((this.f26986T && this.f26988U != null && this.f26984S) || u(this.f26964I) || u(this.f26988U) || t(this.f26975N0));
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        t0.a.b.b(drawable, t0.a.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f26974N) {
            if (drawable.isStateful()) {
                drawable.setState(this.f26979P0);
            }
            p234t0.a.C0532a.h(drawable, this.f26978P);
            return;
        }
        Drawable drawable2 = this.f26964I;
        if (drawable == drawable2 && this.f26970L) {
            p234t0.a.C0532a.h(drawable2, this.f26966J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S()) {
            zOnLayoutDirectionChanged |= t0.a.b.b(this.f26964I, i10);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= t0.a.b.b(this.f26988U, i10);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= t0.a.b.b(this.f26974N, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (S()) {
            zOnLevelChange |= this.f26964I.setLevel(i10);
        }
        if (R()) {
            zOnLevelChange |= this.f26988U.setLevel(i10);
        }
        if (T()) {
            zOnLevelChange |= this.f26974N.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f26991V0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f26979P0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f10 = this.f26994Y + this.f26995Z;
            Drawable drawable = this.f26965I0 ? this.f26988U : this.f26964I;
            float intrinsicWidth = this.f26968K;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (t0.a.b.a(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.f26965I0 ? this.f26988U : this.f26964I;
            float fCeil = this.f26968K;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(t.a(this.v0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f10 = this.f26995Z;
        Drawable drawable = this.f26965I0 ? this.f26988U : this.f26964I;
        float intrinsicWidth = this.f26968K;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f26996p0;
    }

    public final float r() {
        if (T()) {
            return this.f26999s0 + this.f26980Q + this.f27000t0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.f26991V0 ? this.f5566b.f5589a.f5611e.a(g()) : this.f26952C;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f26969K0 != i10) {
            this.f26969K0 = i10;
            invalidateSelf();
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f26971L0 != colorFilter) {
            this.f26971L0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f26975N0 != colorStateList) {
            this.f26975N0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // S5.f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f26977O0 != mode) {
            this.f26977O0 = mode;
            ColorStateList colorStateList = this.f26975N0;
            this.f26973M0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (S()) {
            visible |= this.f26964I.setVisible(z10, z11);
        }
        if (R()) {
            visible |= this.f26988U.setVisible(z10, z11);
        }
        if (T()) {
            visible |= this.f26974N.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC0269a interfaceC0269a = this.f26983R0.get();
        if (interfaceC0269a != null) {
            interfaceC0269a.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    public final boolean w(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f27005z;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f26953C0) : 0);
        boolean state = true;
        if (this.f26953C0 != iC) {
            this.f26953C0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f26948A;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f26955D0) : 0);
        if (this.f26955D0 != iC2) {
            this.f26955D0 = iC2;
            zOnStateChange = true;
        }
        int iE = p222s0.a.e(iC2, iC);
        if ((this.f26957E0 != iE) | (this.f5566b.f5591c == null)) {
            this.f26957E0 = iE;
            k(ColorStateList.valueOf(iE));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f26954D;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f26959F0) : 0;
        if (this.f26959F0 != colorForState2) {
            this.f26959F0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f26981Q0 != null) {
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            for (int i10 : iArr) {
                if (i10 == 16842910) {
                    z13 = true;
                } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                    z14 = true;
                }
            }
            if (z13 && z14) {
                z12 = true;
            }
            if (z12) {
                colorForState = this.f26981Q0.getColorForState(iArr, this.f26961G0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.f26961G0 != colorForState) {
            this.f26961G0 = colorForState;
        }
        d dVar = this.f26951B0.f4354g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f26963H0);
        if (this.f26963H0 != colorForState3) {
            this.f26963H0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z10 = false;
            break;
        }
        int length = state2.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (state2[i11] == 16842912) {
                    if (this.f26984S) {
                        z10 = true;
                        break;
                    }
                } else {
                    i11++;
                }
            }
            z10 = false;
            break;
        }
        if (this.f26965I0 == z10 || this.f26988U == null) {
            z11 = false;
        } else {
            float fQ = q();
            this.f26965I0 = z10;
            if (fQ != q()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f26975N0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f26967J0) : 0;
        if (this.f26967J0 != colorForState4) {
            this.f26967J0 = colorForState4;
            ColorStateList colorStateList6 = this.f26975N0;
            PorterDuff.Mode mode = this.f26977O0;
            this.f26973M0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.f26964I)) {
            state |= this.f26964I.setState(iArr);
        }
        if (u(this.f26988U)) {
            state |= this.f26988U.setState(iArr);
        }
        if (u(this.f26974N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f26974N.setState(iArr3);
        }
        if (u(this.f26976O)) {
            state |= this.f26976O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            v();
        }
        return state;
    }

    public final void x(boolean z10) {
        if (this.f26984S != z10) {
            this.f26984S = z10;
            float fQ = q();
            if (!z10 && this.f26965I0) {
                this.f26965I0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f26988U != drawable) {
            float fQ = q();
            this.f26988U = drawable;
            float fQ2 = q();
            U(this.f26988U);
            o(this.f26988U);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f26990V != colorStateList) {
            this.f26990V = colorStateList;
            if (this.f26986T && (drawable = this.f26988U) != null && this.f26984S) {
                p234t0.a.C0532a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
