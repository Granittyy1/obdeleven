package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ColorPickerSeekbar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f34142A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f34143B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Paint f34144C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Paint f34145D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f34146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f34148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bitmap f34153i;
    public Rect j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f34155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f34156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f34157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f34159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f34162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f34165v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34166w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f34167x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f34168y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f34169z;

    public interface a {
    }

    public interface b {
    }

    public ColorPickerSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34146b = new int[]{-16777216, -6749953, -16776961, -16711936, -16711681, -65536, -65281, -39424, -256, -1, -16777216};
        this.f34149e = false;
        this.f34154k = 20;
        this.f34156m = 2;
        this.f34165v = 5;
        this.f34166w = 0;
        this.f34167x = 255;
        this.f34168y = new ArrayList();
        this.f34169z = -1;
        this.f34142A = false;
        this.f34143B = true;
        this.f34144C = new Paint();
        new Paint();
        this.f34145D = new Paint();
        new Paint();
        this.f34148d = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.voltasit.obdeleven.b.f29642a, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f34161r = typedArrayObtainStyledAttributes.getInteger(7, 100);
        this.f34163t = typedArrayObtainStyledAttributes.getInteger(4, 0);
        this.f34164u = typedArrayObtainStyledAttributes.getInteger(0, this.f34166w);
        this.f34150f = typedArrayObtainStyledAttributes.getBoolean(6, false);
        this.f34149e = typedArrayObtainStyledAttributes.getBoolean(8, false);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        this.f34156m = (int) typedArrayObtainStyledAttributes.getDimension(1, b(2.0f));
        this.f34154k = (int) typedArrayObtainStyledAttributes.getDimension(9, b(30.0f));
        this.f34165v = (int) typedArrayObtainStyledAttributes.getDimension(2, b(5.0f));
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            this.f34146b = d(resourceId);
        }
        setBackgroundColor(color);
    }

    public final void a() {
        if (this.f34160q < 1) {
            return;
        }
        ArrayList arrayList = this.f34168y;
        arrayList.clear();
        for (int i10 = 0; i10 <= this.f34161r; i10++) {
            arrayList.add(Integer.valueOf(g(i10)));
        }
    }

    public final int b(float f10) {
        return (int) ((f10 * this.f34148d.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int c(boolean z10) {
        int i10 = this.f34163t;
        ArrayList arrayList = this.f34168y;
        if (i10 >= arrayList.size()) {
            int iG = g(this.f34163t);
            return z10 ? iG : Color.argb(getAlphaValue(), Color.red(iG), Color.green(iG), Color.blue(iG));
        }
        int iIntValue = ((Integer) arrayList.get(this.f34163t)).intValue();
        if (z10) {
            return Color.rgb((int) ((((((double) getAlphaValue()) / 255.0d) * ((double) Color.red(iIntValue))) + 255.0d) - ((double) getAlphaValue())), (int) ((((((double) getAlphaValue()) / 255.0d) * ((double) Color.green(iIntValue))) + 255.0d) - ((double) getAlphaValue())), (int) ((((((double) getAlphaValue()) / 255.0d) * ((double) Color.blue(iIntValue))) + 255.0d) - ((double) getAlphaValue())));
        }
        return iIntValue;
    }

    public final int[] d(int i10) {
        int i11 = 0;
        if (isInEditMode()) {
            String[] stringArray = this.f34148d.getResources().getStringArray(i10);
            int[] iArr = new int[stringArray.length];
            while (i11 < stringArray.length) {
                iArr[i11] = Color.parseColor(stringArray[i11]);
                i11++;
            }
            return iArr;
        }
        TypedArray typedArrayObtainTypedArray = this.f34148d.getResources().obtainTypedArray(i10);
        int[] iArr2 = new int[typedArrayObtainTypedArray.length()];
        while (i11 < typedArrayObtainTypedArray.length()) {
            iArr2[i11] = typedArrayObtainTypedArray.getColor(i11, -16777216);
            i11++;
        }
        typedArrayObtainTypedArray.recycle();
        return iArr2;
    }

    public final void e() {
        float f10 = this.f34154k * 0.5f;
        this.f34155l = f10;
        int i10 = (int) f10;
        int height = (getHeight() - getPaddingBottom()) - i10;
        int width = (getWidth() - getPaddingRight()) - i10;
        this.f34158o = getPaddingLeft() + i10;
        if (!this.f34150f) {
            height = width;
        }
        this.f34159p = height;
        int paddingTop = getPaddingTop() + i10;
        this.f34160q = this.f34159p - this.f34158o;
        this.j = new Rect(this.f34158o, paddingTop, this.f34159p, this.f34156m + paddingTop);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.j.width(), 0.0f, this.f34146b, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.f34157n = paint;
        paint.setShader(linearGradient);
        this.f34157n.setAntiAlias(true);
        a();
        this.f34147c = 255 - this.f34164u;
    }

    public final boolean f(Rect rect, float f10, float f11) {
        float f12 = rect.left;
        float f13 = this.f34155l;
        return f12 - f13 < f10 && f10 < ((float) rect.right) + f13 && ((float) rect.top) - f13 < f11 && f11 < ((float) rect.bottom) + f13;
    }

    public final int g(int i10) {
        float f10 = i10 / this.f34161r;
        float f11 = this.f34160q;
        float f12 = (f10 * f11) / f11;
        if (f12 <= 0.0d) {
            return this.f34146b[0];
        }
        if (f12 >= 1.0f) {
            int[] iArr = this.f34146b;
            return iArr[iArr.length - 1];
        }
        int[] iArr2 = this.f34146b;
        float length = f12 * (iArr2.length - 1);
        int i11 = (int) length;
        float f13 = length - i11;
        int i12 = iArr2[i11];
        int i13 = iArr2[i11 + 1];
        int iAlpha = Color.alpha(i12);
        this.f34147c = Math.round((Color.alpha(i13) - iAlpha) * f13) + iAlpha;
        int iRed = Color.red(i12);
        int iRound = Math.round((Color.red(i13) - iRed) * f13) + iRed;
        int iGreen = Color.green(i12);
        int iRound2 = Math.round((Color.green(i13) - iGreen) * f13) + iGreen;
        int iBlue = Color.blue(i12);
        return Color.rgb(iRound, iRound2, Math.round(f13 * (Color.blue(i13) - iBlue)) + iBlue);
    }

    public int getAlphaBarPosition() {
        return this.f34164u;
    }

    public int getAlphaMaxPosition() {
        return this.f34167x;
    }

    public int getAlphaMinPosition() {
        return this.f34166w;
    }

    public int getAlphaValue() {
        return this.f34147c;
    }

    public int getBarHeight() {
        return this.f34156m;
    }

    public int getBarMargin() {
        return this.f34165v;
    }

    public int getColor() {
        return c(this.f34149e);
    }

    public int getColorBarPosition() {
        return this.f34163t;
    }

    public float getColorBarValue() {
        return this.f34163t;
    }

    public List<Integer> getColors() {
        return this.f34168y;
    }

    public int getMaxValue() {
        return this.f34161r;
    }

    public int getThumbHeight() {
        return this.f34154k;
    }

    public final void h() {
        setLayoutParams(getLayoutParams());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f34150f) {
            canvas.rotate(-90.0f);
            canvas.translate(-getHeight(), 0.0f);
            canvas.scale(-1.0f, 1.0f, getHeight() / 2, getWidth() / 2);
        }
        float f10 = (this.f34163t / this.f34161r) * this.f34160q;
        Paint paint = this.f34144C;
        paint.setAntiAlias(true);
        int iC = c(true);
        int iC2 = c(false);
        int iRgb = Color.rgb(Color.red(iC2), Color.green(iC2), Color.blue(iC2));
        paint.setColor(iC);
        int[] iArr = {iRgb, -1};
        canvas.drawBitmap(this.f34153i, 0.0f, 0.0f, (Paint) null);
        canvas.drawRect(this.j, this.f34157n);
        float f11 = f10 + this.f34158o;
        Rect rect = this.j;
        float fHeight = (rect.height() / 2) + rect.top;
        canvas.drawCircle(f11, fHeight, (this.f34156m / 2) + 5, paint);
        canvas.drawCircle(f11, fHeight, this.f34154k / 2, paint);
        if (this.f34149e) {
            int i10 = (int) (this.f34154k + this.f34155l + this.f34156m + this.f34165v);
            this.f34162s = new Rect(this.f34158o, i10, this.f34159p, this.f34156m + i10);
            Paint paint2 = this.f34145D;
            paint2.setAntiAlias(true);
            paint2.setShader(new LinearGradient(0.0f, 0.0f, this.f34162s.width(), 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(this.f34162s, paint2);
            int i11 = this.f34164u;
            int i12 = this.f34166w;
            float f12 = (((i11 - i12) / (this.f34167x - i12)) * this.f34160q) + this.f34158o;
            Rect rect2 = this.f34162s;
            float fHeight2 = (rect2.height() / 2) + rect2.top;
            canvas.drawCircle(f12, fHeight2, (this.f34156m / 2) + 5, paint);
            canvas.drawCircle(f12, fHeight2, this.f34154k / 2, paint);
        }
        if (this.f34143B) {
            this.f34143B = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean z10 = this.f34149e;
        int i12 = this.f34156m;
        if (z10) {
            i12 *= 2;
        }
        int i13 = z10 ? this.f34154k * 2 : this.f34154k;
        if (this.f34150f) {
            if (mode == Integer.MIN_VALUE || mode == 0) {
                setMeasuredDimension(i13 + i12 + this.f34165v, i11);
                return;
            }
            return;
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            setMeasuredDimension(i10, i13 + i12 + this.f34165v);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f34150f) {
            this.f34153i = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_4444);
        } else {
            this.f34153i = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_4444);
        }
        this.f34153i.eraseColor(0);
        e();
        this.f34142A = true;
        int i14 = this.f34169z;
        if (i14 != -1) {
            setColor(i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y10 = this.f34150f ? motionEvent.getY() : motionEvent.getX();
        float x10 = this.f34150f ? motionEvent.getX() : motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f34151g = false;
                this.f34152h = false;
            } else if (action == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (this.f34151g) {
                    setColorBarPosition((int) (((y10 - this.f34158o) / this.f34160q) * this.f34161r));
                } else if (this.f34149e && this.f34152h) {
                    float f10 = (y10 - this.f34158o) / this.f34160q;
                    int i10 = this.f34167x;
                    int i11 = this.f34166w;
                    int i12 = (int) ((f10 * (i10 - i11)) + i11);
                    this.f34164u = i12;
                    if (i12 < i11) {
                        this.f34164u = i11;
                    } else if (i12 > i10) {
                        this.f34164u = i10;
                    }
                    this.f34147c = 255 - this.f34164u;
                }
                invalidate();
            }
        } else if (f(this.j, y10, x10)) {
            this.f34151g = true;
            setColorBarPosition((int) (((y10 - this.f34158o) / this.f34160q) * this.f34161r));
        } else if (this.f34149e && f(this.f34162s, y10, x10)) {
            this.f34152h = true;
        }
        return true;
    }

    public void setAlphaBarPosition(int i10) {
        int i11 = 255 - i10;
        this.f34164u = i11;
        this.f34147c = 255 - i11;
        invalidate();
    }

    public void setAlphaMaxPosition(int i10) {
        this.f34167x = i10;
        if (i10 > 255) {
            this.f34167x = 255;
        } else {
            int i11 = this.f34166w;
            if (i10 <= i11) {
                this.f34167x = i11 + 1;
            }
        }
        if (this.f34164u > this.f34166w) {
            this.f34164u = this.f34167x;
        }
        invalidate();
    }

    public void setAlphaMinPosition(int i10) {
        this.f34166w = i10;
        int i11 = this.f34167x;
        if (i10 >= i11) {
            this.f34166w = i11 - 1;
        } else if (i10 < 0) {
            this.f34166w = 0;
        }
        int i12 = this.f34164u;
        int i13 = this.f34166w;
        if (i12 < i13) {
            this.f34164u = i13;
        }
        invalidate();
    }

    public void setBarHeight(float f10) {
        this.f34156m = b(f10);
        h();
        invalidate();
    }

    public void setBarHeightPx(int i10) {
        this.f34156m = i10;
        h();
        invalidate();
    }

    public void setBarMargin(float f10) {
        this.f34165v = b(f10);
        h();
        invalidate();
    }

    public void setBarMarginPx(int i10) {
        this.f34165v = i10;
        h();
        invalidate();
    }

    public void setColor(int i10) {
        int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        if (!this.f34142A) {
            this.f34169z = i10;
            return;
        }
        ArrayList arrayList = this.f34168y;
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            if (Math.abs(iIntValue - iRgb) > Math.abs(iIntValue2 - iRgb)) {
                iIntValue = iIntValue2;
            }
        }
        setColorBarPosition(arrayList.indexOf(Integer.valueOf(iIntValue)));
    }

    public void setColorBarPosition(int i10) {
        this.f34163t = i10;
        int i11 = this.f34161r;
        if (i10 > i11) {
            i10 = i11;
        }
        this.f34163t = i10;
        if (i10 < 0) {
            i10 = 0;
        }
        this.f34163t = i10;
        invalidate();
    }

    public void setColorSeeds(int i10) {
        setColorSeeds(d(i10));
    }

    public void setMaxPosition(int i10) {
        this.f34161r = i10;
        invalidate();
        a();
    }

    public void setShowAlphaBar(boolean z10) {
        this.f34149e = z10;
        h();
        invalidate();
    }

    public void setThumbHeight(float f10) {
        int iB = b(f10);
        this.f34154k = iB;
        this.f34155l = iB / 2;
        h();
        invalidate();
    }

    public void setThumbHeightPx(int i10) {
        this.f34154k = i10;
        this.f34155l = i10 / 2;
        h();
        invalidate();
    }

    public void setColorSeeds(int[] iArr) {
        this.f34146b = iArr;
        e();
        invalidate();
    }

    public void setOnColorChangeListener(a aVar) {
    }

    public void setOnInitDoneListener(b bVar) {
    }
}
