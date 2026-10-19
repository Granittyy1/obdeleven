package X5;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0871y;
import androidx.appcompat.widget.c0;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: StartCompoundLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextInputLayout f7223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0871y f7224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f7225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f7226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f7227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f7228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView.ScaleType f7230i;
    public View.OnLongClickListener j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7231k;

    public B(TextInputLayout textInputLayout, c0 c0Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f7223b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f7226e = checkableImageButton;
        C0871y c0871y = new C0871y(getContext());
        this.f7224c = c0871y;
        if (P5.c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.j;
        checkableImageButton.setOnClickListener(null);
        t.d(checkableImageButton, onLongClickListener);
        this.j = null;
        checkableImageButton.setOnLongClickListener(null);
        t.d(checkableImageButton, null);
        TypedArray typedArray = c0Var.f8929b;
        if (typedArray.hasValue(69)) {
            this.f7227f = P5.c.b(getContext(), c0Var, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f7228g = K5.t.c(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(c0Var.b(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f7229h) {
            this.f7229h = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeB = t.b(typedArray.getInt(68, -1));
            this.f7230i = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        c0871y.setVisibility(8);
        c0871y.setId(R.id.textinput_prefix_text);
        c0871y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        c0871y.setAccessibilityLiveRegion(1);
        c0871y.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0871y.setTextColor(c0Var.a(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f7225d = TextUtils.isEmpty(text2) ? null : text2;
        c0871y.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0871y);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f7226e;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        return this.f7224c.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7226e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f7227f;
            PorterDuff.Mode mode = this.f7228g;
            TextInputLayout textInputLayout = this.f7223b;
            t.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            t.c(textInputLayout, checkableImageButton, this.f7227f);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.j;
        checkableImageButton.setOnClickListener(null);
        t.d(checkableImageButton, onLongClickListener);
        this.j = null;
        checkableImageButton.setOnLongClickListener(null);
        t.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f7226e;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f7223b.f27576e;
        if (editText == null) {
            return;
        }
        if (this.f7226e.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
        this.f7224c.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i10 = (this.f7225d == null || this.f7231k) ? 8 : 0;
        setVisibility((this.f7226e.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f7224c.setVisibility(i10);
        this.f7223b.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
