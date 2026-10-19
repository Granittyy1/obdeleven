package com.google.android.material.timepicker;

import M5.l;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.O;
import androidx.core.view.Z;
import androidx.recyclerview.widget.t;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeInterpolator f27659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f27660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f27662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f27664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f27665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f27666i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f27667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f27669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f27670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27671o;

    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f27660c = new ValueAnimator();
        this.f27662e = new ArrayList();
        Paint paint = new Paint();
        this.f27665h = paint;
        this.f27666i = new RectF();
        this.f27671o = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46115h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        l.c(context, R.attr.motionDurationLong2, t.d.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f27659b = l.d(context, R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46342b);
        this.f27670n = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f27663f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.j = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f27664g = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f27670n * 0.66f) : this.f27670n;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f27660c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f27667k = f11;
        this.f27669m = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f27671o);
        float fCos = (((float) Math.cos(this.f27669m)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f27669m))) + height;
        float f12 = this.f27663f;
        this.f27666i.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f27662e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.f27671o);
        float f10 = width;
        float f11 = iA;
        float fCos = (((float) Math.cos(this.f27669m)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f27669m))) + f12;
        Paint paint = this.f27665h;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f27663f;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.f27669m);
        double d10 = iA - i10;
        paint.setStrokeWidth(this.j);
        canvas.drawLine(f10, f12, width + ((int) (Math.cos(this.f27669m) * d10)), height + ((int) (d10 * dSin)), paint);
        canvas.drawCircle(f10, f12, this.f27664g, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f27660c.isRunning()) {
            return;
        }
        b(this.f27667k);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z12 = false;
        if (actionMasked == 0) {
            this.f27668l = false;
            z10 = true;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z11 = this.f27668l;
            if (this.f27661d) {
                this.f27671o = C.e.i((float) (getWidth() / 2), (float) (getHeight() / 2), x10, y10) <= ((float) a(2)) + K5.t.a(getContext(), 12) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
        }
        boolean z13 = this.f27668l;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z14 = this.f27667k != f10;
        if (z10 && z14) {
            z12 = true;
        } else if (z14 || z11) {
            b(f10);
            z12 = true;
        }
        this.f27668l = z13 | z12;
        return true;
    }
}
