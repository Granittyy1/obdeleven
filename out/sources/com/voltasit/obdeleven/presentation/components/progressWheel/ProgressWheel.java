package com.voltasit.obdeleven.presentation.components.progressWheel;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.measurement.C1787c0;
import com.voltasit.obdeleven.b;
import com.voltasit.obdeleven.presentation.components.progressWheel.ProgressWheel;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressWheel extends View {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f31388H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final TextPaint f31389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Paint f31390B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public RectF f31391C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f31392D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f31393E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f31394F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ValueAnimator f31395G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f31396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31403i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f31404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f31406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f31407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f31408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f31409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f31410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f31411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f31412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f31414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f31417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f31418y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextPaint f31419z;

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f31417x = paint;
        Paint paint2 = new Paint();
        this.f31418y = paint2;
        TextPaint textPaint = new TextPaint();
        this.f31419z = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f31389A = textPaint2;
        Paint paint3 = new Paint();
        this.f31390B = paint3;
        Paint paint4 = new Paint();
        this.f31391C = new RectF();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b.f29644c);
        this.f31397c = typedArrayObtainStyledAttributes.getDimension(7, this.f31397c);
        this.f31400f = typedArrayObtainStyledAttributes.getDimension(9, this.f31400f);
        this.f31401g = typedArrayObtainStyledAttributes.getColor(8, this.f31401g);
        this.f31396b = typedArrayObtainStyledAttributes.getBoolean(0, this.f31396b);
        this.f31399e = typedArrayObtainStyledAttributes.getColor(5, this.f31399e);
        this.f31398d = typedArrayObtainStyledAttributes.getInteger(6, this.f31398d);
        this.f31403i = typedArrayObtainStyledAttributes.getDimension(4, 12.0f);
        this.j = typedArrayObtainStyledAttributes.getColor(2, this.j);
        this.f31404k = typedArrayObtainStyledAttributes.getDimension(3, this.f31404k);
        this.f31407n = typedArrayObtainStyledAttributes.getDimension(14, 10.0f);
        this.f31408o = typedArrayObtainStyledAttributes.getColor(11, this.f31408o);
        this.f31409p = typedArrayObtainStyledAttributes.getDimension(12, this.f31409p);
        this.f31410q = typedArrayObtainStyledAttributes.getInt(13, this.f31410q);
        this.f31411r = typedArrayObtainStyledAttributes.getDimension(16, this.f31411r);
        this.f31412s = typedArrayObtainStyledAttributes.getColor(15, this.f31412s);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f31402h = typedArrayObtainStyledAttributes.getString(1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            this.f31406m = typedArrayObtainStyledAttributes.getString(10);
        }
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.f31399e);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f31397c);
        paint2.setColor(this.f31401g);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f31400f);
        textPaint.setColor(this.j);
        Paint.Style style2 = Paint.Style.FILL;
        textPaint.setStyle(style2);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f31403i);
        textPaint2.setColor(this.f31408o);
        textPaint2.setStyle(style2);
        textPaint2.setAntiAlias(true);
        textPaint2.setTextSize(this.f31407n);
        if (!isInEditMode()) {
            textPaint.setTypeface(C1787c0.j());
            textPaint2.setTypeface(C1787c0.j());
        }
        paint3.setColor(this.f31412s);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.f31411r);
        paint4.setColor(getContext().getResources().getColor(R.color.black));
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        paint4.setStrokeWidth(1.0f);
        setIndeterminate(this.f31396b);
    }

    public String getPrimaryText() {
        return this.f31402h;
    }

    public int getPrimaryTextColor() {
        return this.j;
    }

    public String getSecondaryText() {
        return this.f31406m;
    }

    public int getSecondaryTextColor() {
        return this.f31408o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint textPaint;
        float fDescent;
        float length;
        super.onDraw(canvas);
        canvas.drawArc(this.f31391C, -135.0f, 360.0f, false, this.f31390B);
        canvas.drawArc(this.f31391C, 0.0f, 360.0f, false, this.f31418y);
        if (this.f31396b) {
            RectF rectF = this.f31391C;
            int i10 = this.f31398d;
            canvas.drawArc(rectF, ((-90) - (i10 / 2)) + this.f31394F, i10, false, this.f31417x);
        } else {
            int i11 = this.f31394F;
            if (i11 != 0) {
                canvas.drawArc(this.f31391C, -135.0f, i11, false, this.f31417x);
            }
        }
        String str = this.f31402h;
        if (str == null || str.isEmpty()) {
            this.f31405l = 0.0f;
        } else {
            String[] strArrSplit = this.f31402h.split("\n");
            float f10 = this.f31403i;
            TextPaint textPaint2 = this.f31419z;
            float fMeasureText = textPaint2.measureText(strArrSplit[0]);
            int i12 = 0;
            for (int i13 = 1; i13 < strArrSplit.length; i13++) {
                float fMeasureText2 = textPaint2.measureText(strArrSplit[i13]);
                if (fMeasureText2 > fMeasureText) {
                    i12 = i13;
                    fMeasureText = fMeasureText2;
                }
            }
            do {
                textPaint2.setTextSize(f10);
                f10 -= 2.0f;
            } while (textPaint2.measureText(strArrSplit[i12]) > this.f31391C.width() - (this.f31404k * 2.0f));
            float textSize = textPaint2.getTextSize();
            if (strArrSplit.length == 1) {
                fDescent = (textSize - textPaint2.descent()) / 2.0f;
                length = (textPaint2.ascent() + textSize) / 4.0f;
            } else {
                fDescent = (-textPaint2.descent()) / 2.0f;
                length = ((strArrSplit.length - 2) * textSize) / 2.0f;
            }
            float f11 = fDescent - length;
            for (String str2 : strArrSplit) {
                canvas.drawText(str2, this.f31391C.centerX() - (textPaint2.measureText(str2) / 2.0f), this.f31391C.centerY() + f11, textPaint2);
                f11 += textSize;
            }
            this.f31405l = textSize * strArrSplit.length;
        }
        String str3 = this.f31406m;
        if (str3 == null || str3.isEmpty()) {
            return;
        }
        float f12 = this.f31407n;
        do {
            textPaint = this.f31389A;
            textPaint.setTextSize(f12);
            f12 -= 2.0f;
        } while (textPaint.measureText(this.f31406m) > this.f31391C.width() - (this.f31409p * 2.0f));
        float textSize2 = textPaint.getTextSize();
        float f13 = this.f31405l;
        canvas.drawText(this.f31406m, this.f31391C.centerX() - (textPaint.measureText(this.f31406m) / 2.0f), this.f31391C.centerY() + (f13 == 0.0f ? ((textSize2 - textPaint.descent()) / 2.0f) - ((textPaint.ascent() + textSize2) / 4.0f) : this.f31410q == 1 ? (-(f13 / 2.0f)) - textPaint.descent() : (f13 / 2.0f) - textPaint.ascent()), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int iMin = Math.min(i10, i11);
        this.f31392D = iMin;
        this.f31393E = iMin;
        this.f31414u = getPaddingBottom();
        this.f31415v = getPaddingLeft();
        this.f31416w = getPaddingRight();
        this.f31413t = getPaddingTop();
        float f10 = this.f31415v;
        float f11 = this.f31397c;
        this.f31391C = new RectF(f10 + f11, this.f31413t + f11, (this.f31393E - this.f31416w) - f11, (this.f31392D - this.f31414u) - f11);
        invalidate();
    }

    public void setIndeterminate(boolean z10) {
        if (this.f31396b != z10) {
            this.f31396b = z10;
            ValueAnimator valueAnimator = this.f31395G;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f31395G.end();
            }
            if (z10) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.f31395G = valueAnimator2;
                valueAnimator2.setRepeatCount(-1);
                this.f31395G.setDuration(1000L);
                this.f31395G.setIntValues(0, 360);
                this.f31395G.setInterpolator(new X0.b());
                this.f31395G.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: U8.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int i10 = ProgressWheel.f31388H;
                        ProgressWheel progressWheel = this.f6560b;
                        progressWheel.getClass();
                        progressWheel.f31394F = ((Integer) valueAnimator3.getAnimatedValue()).intValue();
                        progressWheel.invalidate();
                    }
                });
                this.f31395G.addListener(new a());
                this.f31395G.start();
            }
        }
    }

    public void setPrimaryText(String str) {
        this.f31402h = str;
        invalidate();
    }

    public void setPrimaryTextColor(int i10) {
        this.f31419z.setColor(i10);
        invalidate();
    }

    public void setPrimaryTextSize(float f10) {
        this.f31403i = f10;
    }

    public void setProgress(int i10) {
        if (this.f31396b) {
            return;
        }
        this.f31394F = i10;
        invalidate();
    }

    public void setSecondaryText(String str) {
        this.f31406m = str;
        invalidate();
    }

    public void setSecondaryTextColor(int i10) {
        this.f31389A.setColor(i10);
        invalidate();
    }

    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ProgressWheel progressWheel = ProgressWheel.this;
            progressWheel.f31394F = 0;
            progressWheel.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
