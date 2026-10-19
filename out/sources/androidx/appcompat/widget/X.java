package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f8879a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8880b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f8881c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8882d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f8883e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8884f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f8885g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p088h.a.j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f8880b, colorStateListD.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f8879a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int iC = c(context, i10);
        return p222s0.a.h(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f8885g;
        iArr[0] = i10;
        c0 c0VarE = c0.e(context, null, iArr);
        try {
            return c0VarE.f8929b.getColor(0, 0);
        } finally {
            c0VarE.g();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = f8885g;
        iArr[0] = i10;
        c0 c0VarE = c0.e(context, null, iArr);
        try {
            return c0VarE.a(0);
        } finally {
            c0VarE.g();
        }
    }
}
