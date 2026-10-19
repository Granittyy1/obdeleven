package com.google.android.material.textfield;

import A8.p;
import B0.s;
import B8.E0;
import D2.C0686m;
import D2.K;
import K5.o;
import K5.t;
import M5.l;
import S5.i;
import X5.B;
import X5.C;
import X5.j;
import X5.r;
import X5.u;
import X5.x;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0856i;
import androidx.appcompat.widget.C0871y;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.c0;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.internal.CheckableImageButton;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p005a4.q;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final int[][] f27532R0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f27533A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f27534A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f27535B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f27536B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f27537C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f27538C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f27539D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ColorStateList f27540D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f27541E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f27542E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f27543F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f27544F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public S5.f f27545G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f27546G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public S5.f f27547H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f27548H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public StateListDrawable f27549I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f27550I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f27551J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f27552J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public S5.f f27553K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final com.google.android.material.internal.a f27554K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public S5.f f27555L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f27556L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f27557M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f27558M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f27559N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ValueAnimator f27560N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f27561O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f27562O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f27563P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f27564P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f27565Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f27566Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f27567R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f27568S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f27569T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f27570U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f27571V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Rect f27572W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f27573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f27574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.material.textfield.a f27575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EditText f27576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f27577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27580i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f27581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f27583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f27585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0871y f27586p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f27587p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f27588q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RectF f27589q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f27590r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Typeface f27591r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f27592s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorDrawable f27593s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27594t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f27595t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0871y f27596u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final LinkedHashSet<f> f27597u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f27598v;
    public ColorDrawable v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27599w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f27600w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0686m f27601x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f27602x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0686m f27603y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f27604y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f27605z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ColorStateList f27606z0;

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f27575d.f27619h;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f27554K0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C1286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextInputLayout f27610a;

        public d(TextInputLayout textInputLayout) {
            this.f27610a = textInputLayout;
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            TextInputLayout textInputLayout = this.f27610a;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z10 = textInputLayout.f27552J0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            B b10 = textInputLayout.f27574c;
            C0871y c0871y = b10.f7224c;
            if (c0871y.getVisibility() == 0) {
                sVar.f1411a.setLabelFor(c0871y);
                sVar.f1411a.setTraversalAfter(c0871y);
            } else {
                sVar.f1411a.setTraversalAfter(b10.f7226e);
            }
            if (!zIsEmpty) {
                sVar.o(text);
            } else if (!TextUtils.isEmpty(string)) {
                sVar.o(string);
                if (!z10 && placeholderText != null) {
                    sVar.o(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                sVar.o(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                sVar.f1411a.setHintText(string);
                sVar.f1411a.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            sVar.f1411a.setMaxTextLength(counterMaxLength);
            AccessibilityNodeInfo accessibilityNodeInfo = sVar.f1411a;
            if (z11) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            C0871y c0871y2 = textInputLayout.f27581k.f7304y;
            if (c0871y2 != null) {
                accessibilityNodeInfo.setLabelFor(c0871y2);
            }
            textInputLayout.f27575d.b().n(sVar);
        }

        @Override // androidx.core.view.C1286a
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f27610a.f27575d.b().o(accessibilityEvent);
        }
    }

    public interface e {
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a();
    }

    public static class h extends K0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f27611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f27612e;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27611d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f27612e = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f27611d) + "}";
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f27611d, parcel, i10);
            parcel.writeInt(this.f27612e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.textInputStyle, com.voltasit.obdeleven.R.style.Widget_Design_TextInputLayout), attributeSet, com.voltasit.obdeleven.R.attr.textInputStyle);
        this.f27578g = -1;
        this.f27579h = -1;
        this.f27580i = -1;
        this.j = -1;
        this.f27581k = new u(this);
        this.f27585o = new E0(2);
        this.f27572W = new Rect();
        this.f27587p0 = new Rect();
        this.f27589q0 = new RectF();
        this.f27597u0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f27554K0 = aVar;
        this.f27566Q0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27573b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = p216r5.a.f46341a;
        aVar.f27281Q = linearInterpolator;
        aVar.h(false);
        aVar.f27280P = linearInterpolator;
        aVar.h(false);
        if (aVar.f27303g != 8388659) {
            aVar.f27303g = 8388659;
            aVar.h(false);
        }
        int[] iArr = p204q5.a.f46106J;
        o.a(context2, attributeSet, com.voltasit.obdeleven.R.attr.textInputStyle, com.voltasit.obdeleven.R.style.Widget_Design_TextInputLayout);
        o.b(context2, attributeSet, iArr, com.voltasit.obdeleven.R.attr.textInputStyle, com.voltasit.obdeleven.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.voltasit.obdeleven.R.attr.textInputStyle, com.voltasit.obdeleven.R.style.Widget_Design_TextInputLayout);
        c0 c0Var = new c0(context2, typedArrayObtainStyledAttributes);
        B b10 = new B(this, c0Var);
        this.f27574c = b10;
        this.f27539D = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f27558M0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f27556L0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f27557M = i.b(context2, attributeSet, com.voltasit.obdeleven.R.attr.textInputStyle, com.voltasit.obdeleven.R.style.Widget_Design_TextInputLayout).a();
        this.f27561O = context2.getResources().getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f27565Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f27568S = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f27569T = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f27567R = this.f27568S;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        i.a aVarE = this.f27557M.e();
        if (dimension >= 0.0f) {
            aVarE.e(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVarE.f(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVarE.d(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVarE.c(dimension4);
        }
        this.f27557M = aVarE.a();
        ColorStateList colorStateListB = P5.c.b(context2, c0Var, 7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f27542E0 = defaultColor;
            this.f27571V = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f27544F0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f27546G0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f27548H0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f27546G0 = this.f27542E0;
                ColorStateList colorStateListB2 = p186p0.a.b(context2, com.voltasit.obdeleven.R.color.mtrl_filled_background_color);
                this.f27544F0 = colorStateListB2.getColorForState(new int[]{-16842910}, -1);
                this.f27548H0 = colorStateListB2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f27571V = 0;
            this.f27542E0 = 0;
            this.f27544F0 = 0;
            this.f27546G0 = 0;
            this.f27548H0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListA = c0Var.a(1);
            this.f27606z0 = colorStateListA;
            this.f27604y0 = colorStateListA;
        }
        ColorStateList colorStateListB3 = P5.c.b(context2, c0Var, 14);
        this.f27538C0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f27534A0 = p0.a.b.a(context2, com.voltasit.obdeleven.R.color.mtrl_textinput_default_box_stroke_color);
        this.f27550I0 = p0.a.b.a(context2, com.voltasit.obdeleven.R.color.mtrl_textinput_disabled_color);
        this.f27536B0 = p0.a.b.a(context2, com.voltasit.obdeleven.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListB3 != null) {
            setBoxStrokeColorStateList(colorStateListB3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(P5.c.b(context2, c0Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.f27535B = c0Var.a(24);
        this.f27537C = c0Var.a(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i10 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f27590r = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f27588q = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i10);
        setCounterOverflowTextAppearance(this.f27588q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f27590r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0Var.a(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0Var.a(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0Var.a(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0Var.a(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0Var.a(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0Var.a(58));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, c0Var);
        this.f27575d = aVar2;
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        c0Var.g();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setImportantForAccessibility(2);
        O.g.m(this, 1);
        frameLayout.addView(b10);
        frameLayout.addView(aVar2);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f27576e;
        if (!(editText instanceof AutoCompleteTextView) || G0.a.h(editText)) {
            return this.f27545G;
        }
        int iW = p.w(com.voltasit.obdeleven.R.attr.colorControlHighlight, this.f27576e);
        int i10 = this.f27563P;
        int[][] iArr = f27532R0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            S5.f fVar = this.f27545G;
            int i11 = this.f27571V;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{p.B(0.1f, iW, i11), i11}), fVar, fVar);
        }
        Context context = getContext();
        S5.f fVar2 = this.f27545G;
        TypedValue typedValueC = P5.b.c(context, "TextInputLayout", com.voltasit.obdeleven.R.attr.colorSurface);
        int i12 = typedValueC.resourceId;
        int iA = i12 != 0 ? p0.a.b.a(context, i12) : typedValueC.data;
        S5.f fVar3 = new S5.f(fVar2.f5566b.f5589a);
        int iB = p.B(0.1f, iW, iA);
        fVar3.k(new ColorStateList(iArr, new int[]{iB, 0}));
        fVar3.setTint(iA);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iB, iA});
        S5.f fVar4 = new S5.f(fVar2.f5566b.f5589a);
        fVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar3, fVar4), fVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f27549I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f27549I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f27549I.addState(new int[0], f(false));
        }
        return this.f27549I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f27547H == null) {
            this.f27547H = f(true);
        }
        return this.f27547H;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f27576e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z10 = editText instanceof TextInputEditText;
        }
        this.f27576e = editText;
        int i10 = this.f27578g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f27580i);
        }
        int i11 = this.f27579h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.j);
        }
        this.f27551J = false;
        i();
        setTextInputAccessibilityDelegate(new d(this));
        Typeface typeface = this.f27576e.getTypeface();
        com.google.android.material.internal.a aVar = this.f27554K0;
        aVar.m(typeface);
        float textSize = this.f27576e.getTextSize();
        if (aVar.f27304h != textSize) {
            aVar.f27304h = textSize;
            aVar.h(false);
        }
        int i12 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f27576e.getLetterSpacing();
        if (aVar.f27287W != letterSpacing) {
            aVar.f27287W = letterSpacing;
            aVar.h(false);
        }
        int gravity = this.f27576e.getGravity();
        int i13 = (gravity & (-113)) | 48;
        if (aVar.f27303g != i13) {
            aVar.f27303g = i13;
            aVar.h(false);
        }
        if (aVar.f27301f != gravity) {
            aVar.f27301f = gravity;
            aVar.h(false);
        }
        this.f27576e.addTextChangedListener(new a());
        if (this.f27604y0 == null) {
            this.f27604y0 = this.f27576e.getHintTextColors();
        }
        if (this.f27539D) {
            if (TextUtils.isEmpty(this.f27541E)) {
                CharSequence hint = this.f27576e.getHint();
                this.f27577f = hint;
                setHint(hint);
                this.f27576e.setHint((CharSequence) null);
            }
            this.f27543F = true;
        }
        if (i12 >= 29) {
            p();
        }
        if (this.f27586p != null) {
            n(this.f27576e.getText());
        }
        r();
        this.f27581k.b();
        this.f27574c.bringToFront();
        com.google.android.material.textfield.a aVar2 = this.f27575d;
        aVar2.bringToFront();
        Iterator<f> it = this.f27597u0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        aVar2.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f27541E)) {
            return;
        }
        this.f27541E = charSequence;
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (charSequence == null || !TextUtils.equals(aVar.f27265A, charSequence)) {
            aVar.f27265A = charSequence;
            aVar.f27266B = null;
            Bitmap bitmap = aVar.f27269E;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.f27269E = null;
            }
            aVar.h(false);
        }
        if (this.f27552J0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f27594t == z10) {
            return;
        }
        if (z10) {
            C0871y c0871y = this.f27596u;
            if (c0871y != null) {
                this.f27573b.addView(c0871y);
                this.f27596u.setVisibility(0);
            }
        } else {
            C0871y c0871y2 = this.f27596u;
            if (c0871y2 != null) {
                c0871y2.setVisibility(8);
            }
            this.f27596u = null;
        }
        this.f27594t = z10;
    }

    public final void a(float f10) {
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (aVar.f27293b == f10) {
            return;
        }
        if (this.f27560N0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27560N0 = valueAnimator;
            valueAnimator.setInterpolator(l.d(getContext(), com.voltasit.obdeleven.R.attr.motionEasingEmphasizedInterpolator, p216r5.a.f46342b));
            this.f27560N0.setDuration(l.c(getContext(), com.voltasit.obdeleven.R.attr.motionDurationMedium4, 167));
            this.f27560N0.addUpdateListener(new c());
        }
        this.f27560N0.setFloatValues(aVar.f27293b, f10);
        this.f27560N0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f27573b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i10;
        int i11;
        S5.f fVar = this.f27545G;
        if (fVar == null) {
            return;
        }
        i iVar = fVar.f5566b.f5589a;
        i iVar2 = this.f27557M;
        if (iVar != iVar2) {
            fVar.setShapeAppearanceModel(iVar2);
        }
        if (this.f27563P == 2 && (i10 = this.f27567R) > -1 && (i11 = this.f27570U) != 0) {
            S5.f fVar2 = this.f27545G;
            fVar2.f5566b.j = i10;
            fVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i11);
            S5.f.b bVar = fVar2.f5566b;
            if (bVar.f5592d != colorStateListValueOf) {
                bVar.f5592d = colorStateListValueOf;
                fVar2.onStateChange(fVar2.getState());
            }
        }
        int iE = this.f27571V;
        if (this.f27563P == 1) {
            iE = p222s0.a.e(this.f27571V, p.x(getContext(), com.voltasit.obdeleven.R.attr.colorSurface, 0));
        }
        this.f27571V = iE;
        this.f27545G.k(ColorStateList.valueOf(iE));
        S5.f fVar3 = this.f27553K;
        if (fVar3 != null && this.f27555L != null) {
            if (this.f27567R > -1 && this.f27570U != 0) {
                fVar3.k(this.f27576e.isFocused() ? ColorStateList.valueOf(this.f27534A0) : ColorStateList.valueOf(this.f27570U));
                this.f27555L.k(ColorStateList.valueOf(this.f27570U));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.f27539D) {
            return 0;
        }
        int i10 = this.f27563P;
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (i10 == 0) {
            fD = aVar.d();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fD = aVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final C0686m d() {
        C0686m c0686m = new C0686m();
        c0686m.f2500d = l.c(getContext(), com.voltasit.obdeleven.R.attr.motionDurationShort2, 87);
        c0686m.f2501e = l.d(getContext(), com.voltasit.obdeleven.R.attr.motionEasingLinearInterpolator, p216r5.a.f46341a);
        return c0686m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f27576e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f27577f != null) {
            boolean z10 = this.f27543F;
            this.f27543F = false;
            CharSequence hint = editText.getHint();
            this.f27576e.setHint(this.f27577f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f27576e.setHint(hint);
                this.f27543F = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f27573b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f27576e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f27564P0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27564P0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        S5.f fVar;
        int i10;
        super.draw(canvas);
        boolean z10 = this.f27539D;
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (z10) {
            aVar.getClass();
            int iSave = canvas.save();
            if (aVar.f27266B != null) {
                RectF rectF = aVar.f27299e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = aVar.f27278N;
                    textPaint.setTextSize(aVar.f27271G);
                    float f10 = aVar.f27311p;
                    float f11 = aVar.f27312q;
                    float f12 = aVar.f27270F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    if (aVar.f27298d0 <= 1 || aVar.f27267C) {
                        canvas.translate(f10, f11);
                        aVar.f27289Y.draw(canvas);
                    } else {
                        float lineStart = aVar.f27311p - aVar.f27289Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (aVar.f27294b0 * f13));
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            float f14 = aVar.f27272H;
                            float f15 = aVar.f27273I;
                            float f16 = aVar.f27274J;
                            int i12 = aVar.f27275K;
                            textPaint.setShadowLayer(f14, f15, f16, p222s0.a.h(i12, (textPaint.getAlpha() * Color.alpha(i12)) / 255));
                        }
                        aVar.f27289Y.draw(canvas);
                        textPaint.setAlpha((int) (aVar.f27292a0 * f13));
                        if (i11 >= 31) {
                            float f17 = aVar.f27272H;
                            float f18 = aVar.f27273I;
                            float f19 = aVar.f27274J;
                            int i13 = aVar.f27275K;
                            textPaint.setShadowLayer(f17, f18, f19, p222s0.a.h(i13, (Color.alpha(i13) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = aVar.f27289Y.getLineBaseline(0);
                        CharSequence charSequence = aVar.f27296c0;
                        float f20 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(aVar.f27272H, aVar.f27273I, aVar.f27274J, aVar.f27275K);
                        }
                        String strTrim = aVar.f27296c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i10 = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i10 = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(aVar.f27289Y.getLineEnd(i10), str.length()), 0.0f, f20, (Paint) textPaint);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f27555L == null || (fVar = this.f27553K) == null) {
            return;
        }
        fVar.draw(canvas);
        if (this.f27576e.isFocused()) {
            Rect bounds = this.f27555L.getBounds();
            Rect bounds2 = this.f27553K.getBounds();
            float f21 = aVar.f27293b;
            int iCenterX = bounds2.centerX();
            bounds.left = p216r5.a.c(f21, iCenterX, bounds2.left);
            bounds.right = p216r5.a.c(f21, iCenterX, bounds2.right);
            this.f27555L.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        if (this.f27562O0) {
            return;
        }
        this.f27562O0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (aVar != null) {
            aVar.f27276L = drawableState;
            ColorStateList colorStateList2 = aVar.f27306k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = aVar.j) == null || !colorStateList.isStateful())) {
                z10 = false;
            } else {
                aVar.h(false);
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (this.f27576e != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z10) {
            invalidate();
        }
        this.f27562O0 = false;
    }

    public final boolean e() {
        return this.f27539D && !TextUtils.isEmpty(this.f27541E) && (this.f27545G instanceof j);
    }

    public final S5.f f(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f27576e;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        S5.h hVar = new S5.h();
        S5.h hVar2 = new S5.h();
        S5.h hVar3 = new S5.h();
        S5.h hVar4 = new S5.h();
        S5.e eVar = new S5.e();
        S5.e eVar2 = new S5.e();
        S5.e eVar3 = new S5.e();
        S5.e eVar4 = new S5.e();
        S5.a aVar = new S5.a(f10);
        S5.a aVar2 = new S5.a(f10);
        S5.a aVar3 = new S5.a(dimensionPixelOffset);
        S5.a aVar4 = new S5.a(dimensionPixelOffset);
        i iVar = new i();
        iVar.f5607a = hVar;
        iVar.f5608b = hVar2;
        iVar.f5609c = hVar3;
        iVar.f5610d = hVar4;
        iVar.f5611e = aVar;
        iVar.f5612f = aVar2;
        iVar.f5613g = aVar4;
        iVar.f5614h = aVar3;
        iVar.f5615i = eVar;
        iVar.j = eVar2;
        iVar.f5616k = eVar3;
        iVar.f5617l = eVar4;
        EditText editText2 = this.f27576e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = S5.f.f5565y;
            TypedValue typedValueC = P5.b.c(context, S5.f.class.getSimpleName(), com.voltasit.obdeleven.R.attr.colorSurface);
            int i10 = typedValueC.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? p0.a.b.a(context, i10) : typedValueC.data);
        }
        S5.f fVar = new S5.f();
        fVar.i(context);
        fVar.k(dropDownBackgroundTintList);
        fVar.j(popupElevation);
        fVar.setShapeAppearanceModel(iVar);
        S5.f.b bVar = fVar.f5566b;
        if (bVar.f5595g == null) {
            bVar.f5595g = new Rect();
        }
        fVar.f5566b.f5595g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fVar.invalidateSelf();
        return fVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f27576e.getCompoundPaddingLeft() : this.f27575d.c();
        } else {
            compoundPaddingLeft = this.f27574c.a();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27576e;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public S5.f getBoxBackground() {
        int i10 = this.f27563P;
        if (i10 == 1 || i10 == 2) {
            return this.f27545G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f27571V;
    }

    public int getBoxBackgroundMode() {
        return this.f27563P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27565Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zB = t.b(this);
        RectF rectF = this.f27589q0;
        return zB ? this.f27557M.f5614h.a(rectF) : this.f27557M.f5613g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zB = t.b(this);
        RectF rectF = this.f27589q0;
        return zB ? this.f27557M.f5613g.a(rectF) : this.f27557M.f5614h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zB = t.b(this);
        RectF rectF = this.f27589q0;
        return zB ? this.f27557M.f5611e.a(rectF) : this.f27557M.f5612f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zB = t.b(this);
        RectF rectF = this.f27589q0;
        return zB ? this.f27557M.f5612f.a(rectF) : this.f27557M.f5611e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f27538C0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27540D0;
    }

    public int getBoxStrokeWidth() {
        return this.f27568S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27569T;
    }

    public int getCounterMaxLength() {
        return this.f27583m;
    }

    public CharSequence getCounterOverflowDescription() {
        C0871y c0871y;
        if (this.f27582l && this.f27584n && (c0871y = this.f27586p) != null) {
            return c0871y.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f27533A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f27605z;
    }

    public ColorStateList getCursorColor() {
        return this.f27535B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f27537C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f27604y0;
    }

    public EditText getEditText() {
        return this.f27576e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f27575d.f27619h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f27575d.f27619h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f27575d.f27624n;
    }

    public int getEndIconMode() {
        return this.f27575d.j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f27575d.f27625o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f27575d.f27619h;
    }

    public CharSequence getError() {
        u uVar = this.f27581k;
        if (uVar.f7296q) {
            return uVar.f7295p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f27581k.f7299t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f27581k.f7298s;
    }

    public int getErrorCurrentTextColors() {
        C0871y c0871y = this.f27581k.f7297r;
        if (c0871y != null) {
            return c0871y.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f27575d.f27615d.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f27581k;
        if (uVar.f7303x) {
            return uVar.f7302w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0871y c0871y = this.f27581k.f7304y;
        if (c0871y != null) {
            return c0871y.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f27539D) {
            return this.f27541E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f27554K0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        com.google.android.material.internal.a aVar = this.f27554K0;
        return aVar.e(aVar.f27306k);
    }

    public ColorStateList getHintTextColor() {
        return this.f27606z0;
    }

    public e getLengthCounter() {
        return this.f27585o;
    }

    public int getMaxEms() {
        return this.f27579h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.f27578g;
    }

    public int getMinWidth() {
        return this.f27580i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27575d.f27619h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27575d.f27619h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f27594t) {
            return this.f27592s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f27599w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f27598v;
    }

    public CharSequence getPrefixText() {
        return this.f27574c.f7225d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f27574c.f7224c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f27574c.f7224c;
    }

    public i getShapeAppearanceModel() {
        return this.f27557M;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27574c.f7226e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f27574c.f7226e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f27574c.f7229h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f27574c.f7230i;
    }

    public CharSequence getSuffixText() {
        return this.f27575d.f27627q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f27575d.f27628r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f27575d.f27628r;
    }

    public Typeface getTypeface() {
        return this.f27591r0;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f27576e.getCompoundPaddingRight() : this.f27574c.a();
        } else {
            compoundPaddingRight = this.f27575d.c();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f27563P;
        if (i10 == 0) {
            this.f27545G = null;
            this.f27553K = null;
            this.f27555L = null;
        } else if (i10 == 1) {
            this.f27545G = new S5.f(this.f27557M);
            this.f27553K = new S5.f();
            this.f27555L = new S5.f();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(q.c(new StringBuilder(), this.f27563P, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f27539D || (this.f27545G instanceof j)) {
                this.f27545G = new S5.f(this.f27557M);
            } else {
                i iVar = this.f27557M;
                int i11 = j.f7250A;
                if (iVar == null) {
                    iVar = new i();
                }
                j.a aVar = new j.a(iVar, new RectF());
                j.b bVar = new j.b(aVar);
                bVar.f7251z = aVar;
                this.f27545G = bVar;
            }
            this.f27553K = null;
            this.f27555L = null;
        }
        s();
        x();
        if (this.f27563P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f27565Q = getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (P5.c.d(getContext())) {
                this.f27565Q = getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f27576e != null && this.f27563P == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f27576e;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f27576e.getPaddingEnd(), getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (P5.c.d(getContext())) {
                EditText editText2 = this.f27576e;
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f27576e.getPaddingEnd(), getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f27563P != 0) {
            t();
        }
        EditText editText3 = this.f27576e;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f27563P;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (e()) {
            int width = this.f27576e.getWidth();
            int gravity = this.f27576e.getGravity();
            com.google.android.material.internal.a aVar = this.f27554K0;
            boolean zB = aVar.b(aVar.f27265A);
            aVar.f27267C = zB;
            Rect rect = aVar.f27297d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i11 = rect.left;
                        f12 = i11;
                    } else {
                        f10 = rect.right;
                        f11 = aVar.f27290Z;
                    }
                } else if (zB) {
                    f10 = rect.right;
                    f11 = aVar.f27290Z;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
                float fMax = Math.max(f12, rect.left);
                rectF = this.f27589q0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (aVar.f27290Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (aVar.f27267C) {
                        f13 = fMax + aVar.f27290Z;
                    } else {
                        i10 = rect.right;
                        f13 = i10;
                    }
                } else if (aVar.f27267C) {
                    i10 = rect.right;
                    f13 = i10;
                } else {
                    f13 = aVar.f27290Z + fMax;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = aVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f14 = rectF.left;
                float f15 = this.f27561O;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f27567R);
                j jVar = (j) this.f27545G;
                jVar.getClass();
                jVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f10 = width / 2.0f;
            f11 = aVar.f27290Z / 2.0f;
            f12 = f10 - f11;
            float fMax2 = Math.max(f12, rect.left);
            rectF = this.f27589q0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f13 = (width / 2.0f) + (aVar.f27290Z / 2.0f);
            } else {
                f13 = (width / 2.0f) + (aVar.f27290Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = aVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0871y c0871y, int i10) {
        try {
            c0871y.setTextAppearance(i10);
            if (c0871y.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0871y.setTextAppearance(2132017905);
        c0871y.setTextColor(p0.a.b.a(getContext(), com.voltasit.obdeleven.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f27581k;
        return (uVar.f7294o != 1 || uVar.f7297r == null || TextUtils.isEmpty(uVar.f7295p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((E0) this.f27585o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.f27584n;
        int i10 = this.f27583m;
        String string = null;
        if (i10 == -1) {
            this.f27586p.setText(String.valueOf(length));
            this.f27586p.setContentDescription(null);
            this.f27584n = false;
        } else {
            this.f27584n = length > i10;
            Context context = getContext();
            this.f27586p.setContentDescription(context.getString(this.f27584n ? com.voltasit.obdeleven.R.string.character_counter_overflowed_content_description : com.voltasit.obdeleven.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f27583m)));
            if (z10 != this.f27584n) {
                o();
            }
            p307z0.a aVarC = p307z0.a.c();
            C0871y c0871y = this.f27586p;
            String string2 = getContext().getString(com.voltasit.obdeleven.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f27583m));
            if (string2 == null) {
                aVarC.getClass();
            } else {
                aVarC.getClass();
                z0.e.c cVar = p307z0.e.f48695a;
                string = aVarC.d(string2).toString();
            }
            c0871y.setText(string);
        }
        if (this.f27576e == null || z10 == this.f27584n) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0871y c0871y = this.f27586p;
        if (c0871y != null) {
            l(c0871y, this.f27584n ? this.f27588q : this.f27590r);
            if (!this.f27584n && (colorStateList2 = this.f27605z) != null) {
                this.f27586p.setTextColor(colorStateList2);
            }
            if (!this.f27584n || (colorStateList = this.f27533A) == null) {
                return;
            }
            this.f27586p.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27554K0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f27566Q0 = false;
        if (this.f27576e != null && this.f27576e.getMeasuredHeight() < (iMax = Math.max(aVar.getMeasuredHeight(), this.f27574c.getMeasuredHeight()))) {
            this.f27576e.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zQ = q();
        if (z10 || zQ) {
            this.f27576e.post(new C(0, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f27576e;
        if (editText != null) {
            Rect rect = this.f27572W;
            K5.b.a(this, editText, rect);
            S5.f fVar = this.f27553K;
            if (fVar != null) {
                int i14 = rect.bottom;
                fVar.setBounds(rect.left, i14 - this.f27568S, rect.right, i14);
            }
            S5.f fVar2 = this.f27555L;
            if (fVar2 != null) {
                int i15 = rect.bottom;
                fVar2.setBounds(rect.left, i15 - this.f27569T, rect.right, i15);
            }
            if (this.f27539D) {
                float textSize = this.f27576e.getTextSize();
                com.google.android.material.internal.a aVar = this.f27554K0;
                if (aVar.f27304h != textSize) {
                    aVar.f27304h = textSize;
                    aVar.h(false);
                }
                int gravity = this.f27576e.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (aVar.f27303g != i16) {
                    aVar.f27303g = i16;
                    aVar.h(false);
                }
                if (aVar.f27301f != gravity) {
                    aVar.f27301f = gravity;
                    aVar.h(false);
                }
                if (this.f27576e == null) {
                    throw new IllegalStateException();
                }
                boolean zB = t.b(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f27587p0;
                rect2.bottom = i17;
                int i18 = this.f27563P;
                if (i18 == 1) {
                    rect2.left = g(rect.left, zB);
                    rect2.top = rect.top + this.f27565Q;
                    rect2.right = h(rect.right, zB);
                } else if (i18 != 2) {
                    rect2.left = g(rect.left, zB);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zB);
                } else {
                    rect2.left = this.f27576e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f27576e.getPaddingRight();
                }
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                int i22 = rect2.bottom;
                Rect rect3 = aVar.f27297d;
                if (rect3.left != i19 || rect3.top != i20 || rect3.right != i21 || rect3.bottom != i22) {
                    rect3.set(i19, i20, i21, i22);
                    aVar.f27277M = true;
                }
                if (this.f27576e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = aVar.f27279O;
                textPaint.setTextSize(aVar.f27304h);
                textPaint.setTypeface(aVar.f27316u);
                textPaint.setLetterSpacing(aVar.f27287W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f27576e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f27563P != 1 || this.f27576e.getMinLines() > 1) ? rect.top + this.f27576e.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f27576e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f27563P != 1 || this.f27576e.getMinLines() > 1) ? rect.bottom - this.f27576e.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i23 = rect2.left;
                int i24 = rect2.top;
                int i25 = rect2.right;
                Rect rect4 = aVar.f27295c;
                if (rect4.left != i23 || rect4.top != i24 || rect4.right != i25 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i23, i24, i25, compoundPaddingBottom);
                    aVar.f27277M = true;
                }
                aVar.h(false);
                if (!e() || this.f27552J0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.f27566Q0;
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (!z10) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f27566Q0 = true;
        }
        if (this.f27596u != null && (editText = this.f27576e) != null) {
            this.f27596u.setGravity(editText.getGravity());
            this.f27596u.setPadding(this.f27576e.getCompoundPaddingLeft(), this.f27576e.getCompoundPaddingTop(), this.f27576e.getCompoundPaddingRight(), this.f27576e.getCompoundPaddingBottom());
        }
        aVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f4135b);
        setError(hVar.f27611d);
        if (hVar.f27612e) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f27559N) {
            S5.c cVar = this.f27557M.f5611e;
            RectF rectF = this.f27589q0;
            float fA = cVar.a(rectF);
            float fA2 = this.f27557M.f5612f.a(rectF);
            float fA3 = this.f27557M.f5614h.a(rectF);
            float fA4 = this.f27557M.f5613g.a(rectF);
            i iVar = this.f27557M;
            Cb.a aVar = iVar.f5607a;
            Cb.a aVar2 = iVar.f5608b;
            Cb.a aVar3 = iVar.f5610d;
            Cb.a aVar4 = iVar.f5609c;
            new S5.h();
            new S5.h();
            new S5.h();
            new S5.h();
            S5.e eVar = new S5.e();
            S5.e eVar2 = new S5.e();
            S5.e eVar3 = new S5.e();
            S5.e eVar4 = new S5.e();
            i.a.b(aVar2);
            i.a.b(aVar);
            i.a.b(aVar4);
            i.a.b(aVar3);
            S5.a aVar5 = new S5.a(fA2);
            S5.a aVar6 = new S5.a(fA);
            S5.a aVar7 = new S5.a(fA4);
            S5.a aVar8 = new S5.a(fA3);
            i iVar2 = new i();
            iVar2.f5607a = aVar2;
            iVar2.f5608b = aVar;
            iVar2.f5609c = aVar3;
            iVar2.f5610d = aVar4;
            iVar2.f5611e = aVar5;
            iVar2.f5612f = aVar6;
            iVar2.f5613g = aVar8;
            iVar2.f5614h = aVar7;
            iVar2.f5615i = eVar;
            iVar2.j = eVar2;
            iVar2.f5616k = eVar3;
            iVar2.f5617l = eVar4;
            this.f27559N = z10;
            setShapeAppearanceModel(iVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (m()) {
            hVar.f27611d = getError();
        }
        com.google.android.material.textfield.a aVar = this.f27575d;
        hVar.f27612e = aVar.j != 0 && aVar.f27619h.f27237e;
        return hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f27535B;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueA = P5.b.a(context, com.voltasit.obdeleven.R.attr.colorControlActivated);
            if (typedValueA != null) {
                int i10 = typedValueA.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = p186p0.a.b(context, i10);
                } else {
                    int i11 = typedValueA.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f27576e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f27576e.getTextCursorDrawable().mutate();
        if ((m() || (this.f27586p != null && this.f27584n)) && (colorStateList = this.f27537C) != null) {
            colorStateListValueOf = colorStateList;
        }
        p234t0.a.C0532a.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z10;
        if (this.f27576e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            B b10 = this.f27574c;
            if (b10.getMeasuredWidth() > 0) {
                int measuredWidth = b10.getMeasuredWidth() - this.f27576e.getPaddingLeft();
                if (this.f27593s0 == null || this.f27595t0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f27593s0 = colorDrawable;
                    this.f27595t0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f27576e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f27593s0;
                if (drawable != colorDrawable2) {
                    this.f27576e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (this.f27593s0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f27576e.getCompoundDrawablesRelative();
                this.f27576e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f27593s0 = null;
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f27593s0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f27576e.getCompoundDrawablesRelative();
            this.f27576e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f27593s0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.material.textfield.a aVar = this.f27575d;
        if ((aVar.e() || ((aVar.j != 0 && aVar.d()) || aVar.f27627q != null)) && aVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = aVar.f27628r.getMeasuredWidth() - this.f27576e.getPaddingRight();
            if (aVar.e()) {
                checkableImageButton = aVar.f27615d;
            } else if (aVar.j != 0 && aVar.d()) {
                checkableImageButton = aVar.f27619h;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f27576e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.v0;
            if (colorDrawable3 == null || this.f27600w0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.v0 = colorDrawable4;
                    this.f27600w0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative4[2];
                ColorDrawable colorDrawable5 = this.v0;
                if (drawable2 != colorDrawable5) {
                    this.f27602x0 = drawable2;
                    this.f27576e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f27600w0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f27576e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.v0, compoundDrawablesRelative4[3]);
            }
        } else {
            if (this.v0 == null) {
                return z10;
            }
            Drawable[] compoundDrawablesRelative5 = this.f27576e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.v0) {
                this.f27576e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f27602x0, compoundDrawablesRelative5[3]);
            } else {
                z11 = z10;
            }
            this.v0 = null;
        }
        return z11;
    }

    public final void r() {
        Drawable background;
        C0871y c0871y;
        EditText editText = this.f27576e;
        if (editText == null || this.f27563P != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = D.f8674a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(C0856i.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f27584n && (c0871y = this.f27586p) != null) {
            drawableMutate.setColorFilter(C0856i.c(c0871y.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f27576e.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f27576e;
        if (editText == null || this.f27545G == null) {
            return;
        }
        if ((this.f27551J || editText.getBackground() == null) && this.f27563P != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f27576e;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            editText2.setBackground(editTextBoxBackground);
            this.f27551J = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f27571V != i10) {
            this.f27571V = i10;
            this.f27542E0 = i10;
            this.f27546G0 = i10;
            this.f27548H0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(p0.a.b.a(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27542E0 = defaultColor;
        this.f27571V = defaultColor;
        this.f27544F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27546G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f27548H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f27563P) {
            return;
        }
        this.f27563P = i10;
        if (this.f27576e != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f27565Q = i10;
    }

    public void setBoxCornerFamily(int i10) {
        i.a aVarE = this.f27557M.e();
        S5.c cVar = this.f27557M.f5611e;
        Cb.a aVarT = p.t(i10);
        aVarE.f5618a = aVarT;
        i.a.b(aVarT);
        aVarE.f5622e = cVar;
        S5.c cVar2 = this.f27557M.f5612f;
        Cb.a aVarT2 = p.t(i10);
        aVarE.f5619b = aVarT2;
        i.a.b(aVarT2);
        aVarE.f5623f = cVar2;
        S5.c cVar3 = this.f27557M.f5614h;
        Cb.a aVarT3 = p.t(i10);
        aVarE.f5621d = aVarT3;
        i.a.b(aVarT3);
        aVarE.f5625h = cVar3;
        S5.c cVar4 = this.f27557M.f5613g;
        Cb.a aVarT4 = p.t(i10);
        aVarE.f5620c = aVarT4;
        i.a.b(aVarT4);
        aVarE.f5624g = cVar4;
        this.f27557M = aVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f27538C0 != i10) {
            this.f27538C0 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f27534A0 = colorStateList.getDefaultColor();
            this.f27550I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27536B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f27538C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f27538C0 != colorStateList.getDefaultColor()) {
            this.f27538C0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f27540D0 != colorStateList) {
            this.f27540D0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f27568S = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f27569T = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f27582l != z10) {
            u uVar = this.f27581k;
            if (z10) {
                C0871y c0871y = new C0871y(getContext());
                this.f27586p = c0871y;
                c0871y.setId(com.voltasit.obdeleven.R.id.textinput_counter);
                Typeface typeface = this.f27591r0;
                if (typeface != null) {
                    this.f27586p.setTypeface(typeface);
                }
                this.f27586p.setMaxLines(1);
                uVar.a(this.f27586p, 2);
                ((ViewGroup.MarginLayoutParams) this.f27586p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.voltasit.obdeleven.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f27586p != null) {
                    EditText editText = this.f27576e;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f27586p, 2);
                this.f27586p = null;
            }
            this.f27582l = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f27583m != i10) {
            if (i10 > 0) {
                this.f27583m = i10;
            } else {
                this.f27583m = -1;
            }
            if (!this.f27582l || this.f27586p == null) {
                return;
            }
            EditText editText = this.f27576e;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f27588q != i10) {
            this.f27588q = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f27533A != colorStateList) {
            this.f27533A = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f27590r != i10) {
            this.f27590r = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f27605z != colorStateList) {
            this.f27605z = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f27535B != colorStateList) {
            this.f27535B = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f27537C != colorStateList) {
            this.f27537C = colorStateList;
            if (m() || (this.f27586p != null && this.f27584n)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f27604y0 = colorStateList;
        this.f27606z0 = colorStateList;
        if (this.f27576e != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f27575d.f27619h.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f27575d.f27619h.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        CharSequence text = i10 != 0 ? aVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = aVar.f27619h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        Drawable drawableE = i10 != 0 ? v.e(aVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = aVar.f27619h;
        checkableImageButton.setImageDrawable(drawableE);
        if (drawableE != null) {
            ColorStateList colorStateList = aVar.f27622l;
            PorterDuff.Mode mode = aVar.f27623m;
            TextInputLayout textInputLayout = aVar.f27613b;
            X5.t.a(textInputLayout, checkableImageButton, colorStateList, mode);
            X5.t.c(textInputLayout, checkableImageButton, aVar.f27622l);
        }
    }

    public void setEndIconMinSize(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (i10 < 0) {
            aVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != aVar.f27624n) {
            aVar.f27624n = i10;
            CheckableImageButton checkableImageButton = aVar.f27619h;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = aVar.f27615d;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f27575d.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        View.OnLongClickListener onLongClickListener = aVar.f27626p;
        CheckableImageButton checkableImageButton = aVar.f27619h;
        checkableImageButton.setOnClickListener(onClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27626p = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f27619h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27625o = scaleType;
        aVar.f27619h.setScaleType(scaleType);
        aVar.f27615d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (aVar.f27622l != colorStateList) {
            aVar.f27622l = colorStateList;
            X5.t.a(aVar.f27613b, aVar.f27619h, colorStateList, aVar.f27623m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (aVar.f27623m != mode) {
            aVar.f27623m = mode;
            X5.t.a(aVar.f27613b, aVar.f27619h, aVar.f27622l, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f27575d.h(z10);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f27581k;
        if (!uVar.f7296q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.f7295p = charSequence;
        uVar.f7297r.setText(charSequence);
        int i10 = uVar.f7293n;
        if (i10 != 1) {
            uVar.f7294o = 1;
        }
        uVar.i(i10, uVar.f7294o, uVar.h(uVar.f7297r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        u uVar = this.f27581k;
        uVar.f7299t = i10;
        C0871y c0871y = uVar.f7297r;
        if (c0871y != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            c0871y.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f27581k;
        uVar.f7298s = charSequence;
        C0871y c0871y = uVar.f7297r;
        if (c0871y != null) {
            c0871y.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        u uVar = this.f27581k;
        if (uVar.f7296q == z10) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.f7288h;
        if (z10) {
            C0871y c0871y = new C0871y(uVar.f7287g);
            uVar.f7297r = c0871y;
            c0871y.setId(com.voltasit.obdeleven.R.id.textinput_error);
            uVar.f7297r.setTextAlignment(5);
            Typeface typeface = uVar.f7280B;
            if (typeface != null) {
                uVar.f7297r.setTypeface(typeface);
            }
            int i10 = uVar.f7300u;
            uVar.f7300u = i10;
            C0871y c0871y2 = uVar.f7297r;
            if (c0871y2 != null) {
                textInputLayout.l(c0871y2, i10);
            }
            ColorStateList colorStateList = uVar.f7301v;
            uVar.f7301v = colorStateList;
            C0871y c0871y3 = uVar.f7297r;
            if (c0871y3 != null && colorStateList != null) {
                c0871y3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f7298s;
            uVar.f7298s = charSequence;
            C0871y c0871y4 = uVar.f7297r;
            if (c0871y4 != null) {
                c0871y4.setContentDescription(charSequence);
            }
            int i11 = uVar.f7299t;
            uVar.f7299t = i11;
            C0871y c0871y5 = uVar.f7297r;
            if (c0871y5 != null) {
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                c0871y5.setAccessibilityLiveRegion(i11);
            }
            uVar.f7297r.setVisibility(4);
            uVar.a(uVar.f7297r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f7297r, 0);
            uVar.f7297r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f7296q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.i(i10 != 0 ? v.e(aVar.getContext(), i10) : null);
        X5.t.c(aVar.f27613b, aVar.f27615d, aVar.f27616e);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        CheckableImageButton checkableImageButton = aVar.f27615d;
        View.OnLongClickListener onLongClickListener = aVar.f27618g;
        checkableImageButton.setOnClickListener(onClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27618g = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f27615d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (aVar.f27616e != colorStateList) {
            aVar.f27616e = colorStateList;
            X5.t.a(aVar.f27613b, aVar.f27615d, colorStateList, aVar.f27617f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (aVar.f27617f != mode) {
            aVar.f27617f = mode;
            X5.t.a(aVar.f27613b, aVar.f27615d, aVar.f27616e, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        u uVar = this.f27581k;
        uVar.f7300u = i10;
        C0871y c0871y = uVar.f7297r;
        if (c0871y != null) {
            uVar.f7288h.l(c0871y, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f27581k;
        uVar.f7301v = colorStateList;
        C0871y c0871y = uVar.f7297r;
        if (c0871y == null || colorStateList == null) {
            return;
        }
        c0871y.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f27556L0 != z10) {
            this.f27556L0 = z10;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f27581k;
        if (zIsEmpty) {
            if (uVar.f7303x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f7303x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f7302w = charSequence;
        uVar.f7304y.setText(charSequence);
        int i10 = uVar.f7293n;
        if (i10 != 2) {
            uVar.f7294o = 2;
        }
        uVar.i(i10, uVar.f7294o, uVar.h(uVar.f7304y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f27581k;
        uVar.f7279A = colorStateList;
        C0871y c0871y = uVar.f7304y;
        if (c0871y == null || colorStateList == null) {
            return;
        }
        c0871y.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        u uVar = this.f27581k;
        if (uVar.f7303x == z10) {
            return;
        }
        uVar.c();
        if (z10) {
            C0871y c0871y = new C0871y(uVar.f7287g);
            uVar.f7304y = c0871y;
            c0871y.setId(com.voltasit.obdeleven.R.id.textinput_helper_text);
            uVar.f7304y.setTextAlignment(5);
            Typeface typeface = uVar.f7280B;
            if (typeface != null) {
                uVar.f7304y.setTypeface(typeface);
            }
            uVar.f7304y.setVisibility(4);
            C0871y c0871y2 = uVar.f7304y;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            c0871y2.setAccessibilityLiveRegion(1);
            int i10 = uVar.f7305z;
            uVar.f7305z = i10;
            C0871y c0871y3 = uVar.f7304y;
            if (c0871y3 != null) {
                c0871y3.setTextAppearance(i10);
            }
            ColorStateList colorStateList = uVar.f7279A;
            uVar.f7279A = colorStateList;
            C0871y c0871y4 = uVar.f7304y;
            if (c0871y4 != null && colorStateList != null) {
                c0871y4.setTextColor(colorStateList);
            }
            uVar.a(uVar.f7304y, 1);
            uVar.f7304y.setAccessibilityDelegate(new X5.v(uVar));
        } else {
            uVar.c();
            int i11 = uVar.f7293n;
            if (i11 == 2) {
                uVar.f7294o = 0;
            }
            uVar.i(i11, uVar.f7294o, uVar.h(uVar.f7304y, ""));
            uVar.g(uVar.f7304y, 1);
            uVar.f7304y = null;
            TextInputLayout textInputLayout = uVar.f7288h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f7303x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        u uVar = this.f27581k;
        uVar.f7305z = i10;
        C0871y c0871y = uVar.f7304y;
        if (c0871y != null) {
            c0871y.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f27539D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f27558M0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f27539D) {
            this.f27539D = z10;
            if (z10) {
                CharSequence hint = this.f27576e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27541E)) {
                        setHint(hint);
                    }
                    this.f27576e.setHint((CharSequence) null);
                }
                this.f27543F = true;
            } else {
                this.f27543F = false;
                if (!TextUtils.isEmpty(this.f27541E) && TextUtils.isEmpty(this.f27576e.getHint())) {
                    this.f27576e.setHint(this.f27541E);
                }
                setHintInternal(null);
            }
            if (this.f27576e != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        com.google.android.material.internal.a aVar = this.f27554K0;
        TextInputLayout textInputLayout = aVar.f27291a;
        P5.d dVar = new P5.d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = dVar.j;
        if (colorStateList != null) {
            aVar.f27306k = colorStateList;
        }
        float f10 = dVar.f4941k;
        if (f10 != 0.0f) {
            aVar.f27305i = f10;
        }
        ColorStateList colorStateList2 = dVar.f4932a;
        if (colorStateList2 != null) {
            aVar.f27285U = colorStateList2;
        }
        aVar.f27283S = dVar.f4936e;
        aVar.f27284T = dVar.f4937f;
        aVar.f27282R = dVar.f4938g;
        aVar.f27286V = dVar.f4940i;
        P5.a aVar2 = aVar.f27320y;
        if (aVar2 != null) {
            aVar2.f4931e = true;
        }
        D3.l lVar = new D3.l(1, aVar);
        dVar.a();
        aVar.f27320y = new P5.a(lVar, dVar.f4944n);
        dVar.c(textInputLayout.getContext(), aVar.f27320y);
        aVar.h(false);
        this.f27606z0 = aVar.f27306k;
        if (this.f27576e != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f27606z0 != colorStateList) {
            if (this.f27604y0 == null) {
                com.google.android.material.internal.a aVar = this.f27554K0;
                if (aVar.f27306k != colorStateList) {
                    aVar.f27306k = colorStateList;
                    aVar.h(false);
                }
            }
            this.f27606z0 = colorStateList;
            if (this.f27576e != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f27585o = eVar;
    }

    public void setMaxEms(int i10) {
        this.f27579h = i10;
        EditText editText = this.f27576e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.j = i10;
        EditText editText = this.f27576e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f27578g = i10;
        EditText editText = this.f27576e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f27580i = i10;
        EditText editText = this.f27576e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27619h.setContentDescription(i10 != 0 ? aVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27619h.setImageDrawable(i10 != 0 ? v.e(aVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        if (z10 && aVar.j != 1) {
            aVar.g(1);
        } else if (z10) {
            aVar.getClass();
        } else {
            aVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27622l = colorStateList;
        X5.t.a(aVar.f27613b, aVar.f27619h, colorStateList, aVar.f27623m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.f27623m = mode;
        X5.t.a(aVar.f27613b, aVar.f27619h, aVar.f27622l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f27596u == null) {
            C0871y c0871y = new C0871y(getContext());
            this.f27596u = c0871y;
            c0871y.setId(com.voltasit.obdeleven.R.id.textinput_placeholder);
            C0871y c0871y2 = this.f27596u;
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            c0871y2.setImportantForAccessibility(2);
            C0686m c0686mD = d();
            this.f27601x = c0686mD;
            c0686mD.f2499c = 67L;
            this.f27603y = d();
            setPlaceholderTextAppearance(this.f27599w);
            setPlaceholderTextColor(this.f27598v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27594t) {
                setPlaceholderTextEnabled(true);
            }
            this.f27592s = charSequence;
        }
        EditText editText = this.f27576e;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f27599w = i10;
        C0871y c0871y = this.f27596u;
        if (c0871y != null) {
            c0871y.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f27598v != colorStateList) {
            this.f27598v = colorStateList;
            C0871y c0871y = this.f27596u;
            if (c0871y == null || colorStateList == null) {
                return;
            }
            c0871y.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        B b10 = this.f27574c;
        b10.getClass();
        b10.f7225d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        b10.f7224c.setText(charSequence);
        b10.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f27574c.f7224c.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f27574c.f7224c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(i iVar) {
        S5.f fVar = this.f27545G;
        if (fVar == null || fVar.f5566b.f5589a == iVar) {
            return;
        }
        this.f27557M = iVar;
        b();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f27574c.f7226e.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27574c.f7226e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? v.e(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        B b10 = this.f27574c;
        if (i10 < 0) {
            b10.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != b10.f7229h) {
            b10.f7229h = i10;
            CheckableImageButton checkableImageButton = b10.f7226e;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        B b10 = this.f27574c;
        View.OnLongClickListener onLongClickListener = b10.j;
        CheckableImageButton checkableImageButton = b10.f7226e;
        checkableImageButton.setOnClickListener(onClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        B b10 = this.f27574c;
        b10.j = onLongClickListener;
        CheckableImageButton checkableImageButton = b10.f7226e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        X5.t.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        B b10 = this.f27574c;
        b10.f7230i = scaleType;
        b10.f7226e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        B b10 = this.f27574c;
        if (b10.f7227f != colorStateList) {
            b10.f7227f = colorStateList;
            X5.t.a(b10.f7223b, b10.f7226e, colorStateList, b10.f7228g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        B b10 = this.f27574c;
        if (b10.f7228g != mode) {
            b10.f7228g = mode;
            X5.t.a(b10.f7223b, b10.f7226e, b10.f7227f, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f27574c.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.getClass();
        aVar.f27627q = TextUtils.isEmpty(charSequence) ? null : charSequence;
        aVar.f27628r.setText(charSequence);
        aVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f27575d.f27628r.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f27575d.f27628r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f27576e;
        if (editText != null) {
            O.n(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27591r0) {
            this.f27591r0 = typeface;
            this.f27554K0.m(typeface);
            u uVar = this.f27581k;
            if (typeface != uVar.f7280B) {
                uVar.f7280B = typeface;
                C0871y c0871y = uVar.f7297r;
                if (c0871y != null) {
                    c0871y.setTypeface(typeface);
                }
                C0871y c0871y2 = uVar.f7304y;
                if (c0871y2 != null) {
                    c0871y2.setTypeface(typeface);
                }
            }
            C0871y c0871y3 = this.f27586p;
            if (c0871y3 != null) {
                c0871y3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f27563P != 1) {
            FrameLayout frameLayout = this.f27573b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        C0871y c0871y;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f27576e;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f27576e;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f27604y0;
        com.google.android.material.internal.a aVar = this.f27554K0;
        if (colorStateList2 != null) {
            aVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f27604y0;
            aVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f27550I0) : this.f27550I0));
        } else if (m()) {
            C0871y c0871y2 = this.f27581k.f7297r;
            aVar.i(c0871y2 != null ? c0871y2.getTextColors() : null);
        } else if (this.f27584n && (c0871y = this.f27586p) != null) {
            aVar.i(c0871y.getTextColors());
        } else if (z13 && (colorStateList = this.f27606z0) != null && aVar.f27306k != colorStateList) {
            aVar.f27306k = colorStateList;
            aVar.h(false);
        }
        com.google.android.material.textfield.a aVar2 = this.f27575d;
        B b10 = this.f27574c;
        if (z12 || !this.f27556L0 || (isEnabled() && z13)) {
            if (z11 || this.f27552J0) {
                ValueAnimator valueAnimator = this.f27560N0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f27560N0.cancel();
                }
                if (z10 && this.f27558M0) {
                    a(1.0f);
                } else {
                    aVar.k(1.0f);
                }
                this.f27552J0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f27576e;
                v(editText3 != null ? editText3.getText() : null);
                b10.f7231k = false;
                b10.e();
                aVar2.f27629s = false;
                aVar2.n();
                return;
            }
            return;
        }
        if (z11 || !this.f27552J0) {
            ValueAnimator valueAnimator2 = this.f27560N0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f27560N0.cancel();
            }
            if (z10 && this.f27558M0) {
                a(0.0f);
            } else {
                aVar.k(0.0f);
            }
            if (e() && !((j) this.f27545G).f7251z.f7252r.isEmpty() && e()) {
                ((j) this.f27545G).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f27552J0 = true;
            C0871y c0871y3 = this.f27596u;
            if (c0871y3 != null && this.f27594t) {
                c0871y3.setText((CharSequence) null);
                K.a(this.f27573b, this.f27603y);
                this.f27596u.setVisibility(4);
            }
            b10.f7231k = true;
            b10.e();
            aVar2.f27629s = true;
            aVar2.n();
        }
    }

    public final void v(Editable editable) {
        ((E0) this.f27585o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f27573b;
        if (length != 0 || this.f27552J0) {
            C0871y c0871y = this.f27596u;
            if (c0871y == null || !this.f27594t) {
                return;
            }
            c0871y.setText((CharSequence) null);
            K.a(frameLayout, this.f27603y);
            this.f27596u.setVisibility(4);
            return;
        }
        if (this.f27596u == null || !this.f27594t || TextUtils.isEmpty(this.f27592s)) {
            return;
        }
        this.f27596u.setText(this.f27592s);
        K.a(frameLayout, this.f27601x);
        this.f27596u.setVisibility(0);
        this.f27596u.bringToFront();
        announceForAccessibility(this.f27592s);
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f27540D0.getDefaultColor();
        int colorForState = this.f27540D0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f27540D0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f27570U = colorForState2;
        } else if (z11) {
            this.f27570U = colorForState;
        } else {
            this.f27570U = defaultColor;
        }
    }

    public final void x() {
        C0871y c0871y;
        EditText editText;
        EditText editText2;
        if (this.f27545G == null || this.f27563P == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f27576e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f27576e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f27570U = this.f27550I0;
        } else if (m()) {
            if (this.f27540D0 != null) {
                w(z11, z10);
            } else {
                this.f27570U = getErrorCurrentTextColors();
            }
        } else if (!this.f27584n || (c0871y = this.f27586p) == null) {
            if (z11) {
                this.f27570U = this.f27538C0;
            } else if (z10) {
                this.f27570U = this.f27536B0;
            } else {
                this.f27570U = this.f27534A0;
            }
        } else if (this.f27540D0 != null) {
            w(z11, z10);
        } else {
            this.f27570U = c0871y.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        com.google.android.material.textfield.a aVar = this.f27575d;
        aVar.l();
        CheckableImageButton checkableImageButton = aVar.f27615d;
        ColorStateList colorStateList = aVar.f27616e;
        TextInputLayout textInputLayout = aVar.f27613b;
        X5.t.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = aVar.f27622l;
        CheckableImageButton checkableImageButton2 = aVar.f27619h;
        X5.t.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (aVar.b() instanceof r) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                X5.t.a(textInputLayout, checkableImageButton2, aVar.f27622l, aVar.f27623m);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                p234t0.a.C0532a.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        B b10 = this.f27574c;
        X5.t.c(b10.f7223b, b10.f7226e, b10.f7227f);
        if (this.f27563P == 2) {
            int i10 = this.f27567R;
            if (z11 && isEnabled()) {
                this.f27567R = this.f27569T;
            } else {
                this.f27567R = this.f27568S;
            }
            if (this.f27567R != i10 && e() && !this.f27552J0) {
                if (e()) {
                    ((j) this.f27545G).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f27563P == 1) {
            if (!isEnabled()) {
                this.f27571V = this.f27544F0;
            } else if (z10 && !z11) {
                this.f27571V = this.f27548H0;
            } else if (z11) {
                this.f27571V = this.f27546G0;
            } else {
                this.f27571V = this.f27542E0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27574c.b(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f27575d.f27619h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f27575d.f27619h.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f27575d.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27575d.f27619h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f27575d;
        CheckableImageButton checkableImageButton = aVar.f27619h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f27622l;
            PorterDuff.Mode mode = aVar.f27623m;
            TextInputLayout textInputLayout = aVar.f27613b;
            X5.t.a(textInputLayout, checkableImageButton, colorStateList, mode);
            X5.t.c(textInputLayout, checkableImageButton, aVar.f27622l);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u(!textInputLayout.f27564P0, false);
            if (textInputLayout.f27582l) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.f27594t) {
                textInputLayout.v(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
