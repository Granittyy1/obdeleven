package com.voltasit.obdeleven.ui.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import com.voltasit.obdeleven.b;
import p208q9.c;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingEditText extends EditText {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f34176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f34177i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f34179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f34180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f34181n;

    public FloatingEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        this.f34170b = 0;
        this.f34175g = true;
        this.f34180m = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f29643b);
        this.f34179l = typedArrayObtainStyledAttributes.getFloat(3, 0.5f);
        this.f34172d = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(com.voltasit.obdeleven.R.color.floating_edit_text_color));
        this.f34173e = typedArrayObtainStyledAttributes.getColor(2, getResources().getColor(com.voltasit.obdeleven.R.color.floating_edit_text_highlighted_color));
        this.f34174f = typedArrayObtainStyledAttributes.getColor(1, getResources().getColor(com.voltasit.obdeleven.R.color.floating_edit_text_error_color));
        this.f34177i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.floating_edit_text_underline_height));
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.floating_edit_text_underline_highlighted_height));
        typedArrayObtainStyledAttributes.recycle();
        setHintTextColor(0);
        this.f34178k = TextUtils.isEmpty(getText());
        Paint paint = new Paint();
        this.f34181n = paint;
        paint.setAntiAlias(true);
        setBackground(new c(this));
        setPadding(0, b(17), 0, b(20));
    }

    public static Rect a(FloatingEditText floatingEditText, Canvas canvas) {
        int paddingLeft = floatingEditText.getPaddingLeft();
        Rect rect = floatingEditText.f34180m;
        rect.left = paddingLeft;
        rect.top = (canvas.getHeight() - floatingEditText.j) - b(16);
        rect.right = floatingEditText.getWidth();
        rect.bottom = canvas.getHeight() - b(16);
        return rect;
    }

    public static int b(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public final void c(int i10) {
        String string = getContext().getResources().getString(i10);
        if (string.isEmpty()) {
            throw new IllegalStateException("Must have a validate result message.");
        }
        this.f34175g = false;
        this.f34176h = string;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(getHint())) {
            return;
        }
        Paint paint = this.f34181n;
        paint.set(getPaint());
        float textSize = getTextSize();
        float textSize2 = getTextSize() * this.f34179l;
        float baseline = getBaseline();
        float scrollY = (getScrollY() + (getBaseline() + getPaint().getFontMetricsInt().top)) - b(4);
        float scrollX = getScrollX() + getCompoundPaddingLeft();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f34171c;
        int i10 = this.f34170b;
        if (i10 == 0) {
            paint.setColor(this.f34172d);
            paint.setTextSize(textSize);
            canvas.drawText(getHint().toString(), scrollX, baseline, paint);
            return;
        }
        if (i10 == 1) {
            if (jCurrentTimeMillis >= 120) {
                paint.setColor(this.f34172d);
                paint.setTextSize(textSize);
                canvas.drawText(getHint().toString(), scrollX, baseline, paint);
                return;
            }
            float f10 = jCurrentTimeMillis;
            paint.setColor(this.f34173e);
            paint.setTextSize((((textSize - textSize2) * f10) / 120.0f) + textSize2);
            canvas.drawText(getHint().toString(), scrollX, (((baseline - scrollY) * f10) / 120.0f) + scrollY, paint);
            postInvalidate();
            return;
        }
        if (i10 != 2) {
            return;
        }
        if (jCurrentTimeMillis >= 120) {
            if (isFocused()) {
                paint.setColor(this.f34173e);
            } else {
                paint.setColor(this.f34172d);
            }
            paint.setTextSize(textSize2);
            canvas.drawText(getHint().toString(), scrollX, scrollY, paint);
            return;
        }
        float f11 = jCurrentTimeMillis;
        paint.setColor(this.f34173e);
        paint.setTextSize(textSize - (((textSize - textSize2) * f11) / 120.0f));
        canvas.drawText(getHint().toString(), scrollX, baseline - (((baseline - scrollY) * f11) / 120.0f), paint);
        postInvalidate();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f34175g = true;
        this.f34176h = null;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (this.f34178k != zIsEmpty) {
            this.f34178k = zIsEmpty;
            if (zIsEmpty && isShown()) {
                this.f34171c = System.currentTimeMillis();
                this.f34170b = 1;
            } else {
                this.f34171c = System.currentTimeMillis();
                this.f34170b = 2;
            }
        }
    }

    public void setHighlightedColor(int i10) {
        this.f34173e = i10;
        invalidate();
    }

    public void setNormalColor(int i10) {
        this.f34172d = i10;
        invalidate();
    }
}
