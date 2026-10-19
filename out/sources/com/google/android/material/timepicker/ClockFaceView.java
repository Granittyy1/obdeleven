package com.google.android.material.timepicker;

import B0.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.O;
import com.voltasit.obdeleven.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends c implements ClockHandView.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f27644A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final float[] f27645B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f27646C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f27647D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f27648E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f27649F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String[] f27650G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f27651H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ColorStateList f27652I;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ClockHandView f27653u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f27654v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f27655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f27656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final SparseArray<TextView> f27657y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f27658z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f27654v = new Rect();
        this.f27655w = new RectF();
        this.f27656x = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f27657y = sparseArray;
        this.f27645B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p204q5.a.f46114g, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = P5.c.a(context, typedArrayObtainStyledAttributes, 1);
        this.f27652I = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f27653u = clockHandView;
        this.f27646C = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f27644A = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.f27662e.add(this);
        int defaultColor = p186p0.a.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = P5.c.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27658z = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f27650G = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f27650G.length, size); i10++) {
            TextView textView = sparseArray.get(i10);
            if (i10 >= this.f27650G.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f27650G[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                O.n(textView, this.f27658z);
                textView.setTextColor(this.f27652I);
            }
        }
        ClockHandView clockHandView2 = this.f27653u;
        if (clockHandView2.f27661d && !z10) {
            clockHandView2.f27671o = 1;
        }
        clockHandView2.f27661d = z10;
        clockHandView2.invalidate();
        this.f27647D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f27648E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f27649F = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f10) {
        if (Math.abs(this.f27651H - f10) > 0.001f) {
            this.f27651H = f10;
            r();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(s.e.a(1, this.f27650G.length, 1).f1432a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f27649F / Math.max(Math.max(this.f27647D / displayMetrics.heightPixels, this.f27648E / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.c
    public final void q() {
        super.q();
        int i10 = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f27657y;
            if (i10 >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i10).setVisibility(0);
            i10++;
        }
    }

    public final void r() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f27653u.f27666i;
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f27657y;
            int size = sparseArray.size();
            rectF = this.f27655w;
            rect = this.f27654v;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = sparseArray.get(i11);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f27656x;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f27644A, this.f27645B, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }
}
