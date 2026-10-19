package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0869w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f9027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f9028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f9029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f9030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f9031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f9032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f9033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0872z f9034i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9035k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f9036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9037m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$b */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class b {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$c */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$d */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public static class d {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C0869w(TextView textView) {
        this.f9026a = textView;
        this.f9034i = new C0872z(textView);
    }

    public static a0 c(Context context, C0856i c0856i, int i10) {
        ColorStateList colorStateListF;
        synchronized (c0856i) {
            colorStateListF = c0856i.f8982a.f(context, i10);
        }
        if (colorStateListF == null) {
            return null;
        }
        a0 a0Var = new a0();
        a0Var.f8901d = true;
        a0Var.f8898a = colorStateListF;
        return a0Var;
    }

    public final void a(Drawable drawable, a0 a0Var) {
        if (drawable == null || a0Var == null) {
            return;
        }
        C0856i.e(drawable, a0Var, this.f9026a.getDrawableState());
    }

    public final void b() {
        a0 a0Var = this.f9027b;
        TextView textView = this.f9026a;
        if (a0Var != null || this.f9028c != null || this.f9029d != null || this.f9030e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9027b);
            a(compoundDrawables[1], this.f9028c);
            a(compoundDrawables[2], this.f9029d);
            a(compoundDrawables[3], this.f9030e);
        }
        if (this.f9031f == null && this.f9032g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f9031f);
        a(compoundDrawablesRelative[2], this.f9032g);
    }

    public final ColorStateList d() {
        a0 a0Var = this.f9033h;
        if (a0Var != null) {
            return a0Var.f8898a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        a0 a0Var = this.f9033h;
        if (a0Var != null) {
            return a0Var.f8899b;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String string;
        String string2;
        int i11;
        int i12;
        int i13;
        float dimensionPixelSize;
        ColorStateList colorStateList;
        int resourceId;
        int i14;
        int resourceId2;
        int i15;
        TextView textView = this.f9026a;
        Context context = textView.getContext();
        C0856i c0856iA = C0856i.a();
        int[] iArr = p088h.a.f35696h;
        c0 c0VarF = c0.f(context, attributeSet, iArr, i10, 0);
        androidx.core.view.O.m(textView, textView.getContext(), iArr, attributeSet, c0VarF.f8929b, i10);
        TypedArray typedArray = c0VarF.f8929b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f9027b = c(context, c0856iA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f9028c = c(context, c0856iA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f9029d = c(context, c0856iA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f9030e = c(context, c0856iA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f9031f = c(context, c0856iA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f9032g = c(context, c0856iA, typedArray.getResourceId(6, 0));
        }
        c0VarF.g();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = p088h.a.f35711x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            c0 c0Var = new c0(context, typedArrayObtainStyledAttributes);
            if (z12 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z11 = true;
            }
            m(context, c0Var);
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i15 = 13;
            } else {
                i15 = 13;
                string2 = null;
            }
            string = typedArrayObtainStyledAttributes.hasValue(i15) ? typedArrayObtainStyledAttributes.getString(i15) : null;
            c0Var.g();
        } else {
            z10 = false;
            z11 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        c0 c0Var2 = new c0(context, typedArrayObtainStyledAttributes2);
        if (!z12 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z10 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z11 = true;
        }
        boolean z13 = z10;
        int i16 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i16 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, c0Var2);
        c0Var2.g();
        if (!z12 && z11) {
            textView.setAllCaps(z13);
        }
        Typeface typeface = this.f9036l;
        if (typeface != null) {
            if (this.f9035k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            c.d(textView, string);
        }
        if (string2 != null) {
            b.b(textView, b.a(string2));
        }
        int[] iArr3 = p088h.a.f35697i;
        C0872z c0872z = this.f9034i;
        Context context2 = c0872z.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c0872z.f9058i;
        androidx.core.view.O.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0872z.f9050a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = typedArrayObtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                c0872z.f9055f = C0872z.b(iArr4);
                c0872z.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0872z.j()) {
            c0872z.f9050a = 0;
        } else if (c0872z.f9050a == 1) {
            if (!c0872z.f9056g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i14 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i14 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i14, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0872z.k(dimension2, dimension3, dimension);
            }
            c0872z.h();
        }
        if (k0.f9001c && c0872z.f9050a != 0) {
            int[] iArr5 = c0872z.f9055f;
            if (iArr5.length > 0) {
                if (c.a(textView) != -1.0f) {
                    c.b(textView, Math.round(c0872z.f9053d), Math.round(c0872z.f9054e), Math.round(c0872z.f9052c), 0);
                } else {
                    c.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c0856iA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0856iA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0856iA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0856iA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0856iA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0856iA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = p186p0.a.b(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            H0.h.a.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i11 = -1;
            H0.h.a.g(textView, D.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i11 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i11);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i11);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i12 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i13 = -1;
            } else {
                int i18 = typedValuePeekValue.data;
                int i19 = i18 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i18);
                i13 = i19;
                i12 = -1;
            }
        } else {
            i12 = -1;
            i13 = -1;
            dimensionPixelSize = -1.0f;
        }
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i12) {
            H0.h.b(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i12) {
            H0.h.c(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i13 == i12) {
                H0.h.d(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                H0.h.d.a(textView, i13, dimensionPixelSize);
            } else {
                H0.h.d(textView, Math.round(TypedValue.applyDimension(i13, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p088h.a.f35711x);
        c0 c0Var = new c0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f9026a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, c0Var);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            c.d(textView, string);
        }
        c0Var.g();
        Typeface typeface = this.f9036l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        C0872z c0872z = this.f9034i;
        if (c0872z.j()) {
            DisplayMetrics displayMetrics = c0872z.j.getResources().getDisplayMetrics();
            c0872z.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c0872z.h()) {
                c0872z.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) throws IllegalArgumentException {
        C0872z c0872z = this.f9034i;
        if (c0872z.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0872z.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c0872z.f9055f = C0872z.b(iArrCopyOf);
                if (!c0872z.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0872z.f9056g = false;
            }
            if (c0872z.h()) {
                c0872z.a();
            }
        }
    }

    public final void j(int i10) {
        C0872z c0872z = this.f9034i;
        if (c0872z.j()) {
            if (i10 == 0) {
                c0872z.f9050a = 0;
                c0872z.f9053d = -1.0f;
                c0872z.f9054e = -1.0f;
                c0872z.f9052c = -1.0f;
                c0872z.f9055f = new int[0];
                c0872z.f9051b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(J4.i.b(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0872z.j.getResources().getDisplayMetrics();
            c0872z.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0872z.h()) {
                c0872z.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f9033h == null) {
            this.f9033h = new a0();
        }
        a0 a0Var = this.f9033h;
        a0Var.f8898a = colorStateList;
        a0Var.f8901d = colorStateList != null;
        this.f9027b = a0Var;
        this.f9028c = a0Var;
        this.f9029d = a0Var;
        this.f9030e = a0Var;
        this.f9031f = a0Var;
        this.f9032g = a0Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f9033h == null) {
            this.f9033h = new a0();
        }
        a0 a0Var = this.f9033h;
        a0Var.f8899b = mode;
        a0Var.f8900c = mode != null;
        this.f9027b = a0Var;
        this.f9028c = a0Var;
        this.f9029d = a0Var;
        this.f9030e = a0Var;
        this.f9031f = a0Var;
        this.f9032g = a0Var;
    }

    public final void m(Context context, c0 c0Var) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = c0Var.f8929b;
        this.j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f9035k = i12;
            if (i12 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f9037m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f9036l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f9036l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f9036l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9036l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f9035k;
        int i16 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = c0Var.d(i14, this.j, new a(i15, i16, new WeakReference(this.f9026a)));
                if (typefaceD != null) {
                    if (i11 < 28 || this.f9035k == -1) {
                        this.f9036l = typefaceD;
                    } else {
                        this.f9036l = d.a(Typeface.create(typefaceD, 0), this.f9035k, (this.j & 2) != 0);
                    }
                }
                this.f9037m = this.f9036l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9036l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9035k == -1) {
            this.f9036l = Typeface.create(string, this.j);
        } else {
            this.f9036l = d.a(Typeface.create(string, 0), this.f9035k, (this.j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.w$a */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class a extends r0.f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f9040c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f9038a = i10;
            this.f9039b = i11;
            this.f9040c = weakReference;
        }

        @Override // r0.f.e
        public final void c(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f9038a) != -1) {
                typeface = d.a(typeface, i10, (this.f9039b & 2) != 0);
            }
            C0869w c0869w = C0869w.this;
            if (c0869w.f9037m) {
                c0869w.f9036l = typeface;
                TextView textView = (TextView) this.f9040c.get();
                if (textView != null) {
                    if (textView.isAttachedToWindow()) {
                        textView.post(new RunnableC0870x(textView, typeface, c0869w.j));
                    } else {
                        textView.setTypeface(typeface, c0869w.j);
                    }
                }
            }
        }

        @Override // r0.f.e
        public final void b(int i10) {
        }
    }
}
