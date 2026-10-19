package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class C0871y extends TextView {
    private final C0852e mBackgroundTintHelper;
    private C0859l mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<p307z0.d> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final C0868v mTextClassifierHelper;
    private final C0869w mTextHelper;

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$a */
    /* JADX INFO: compiled from: AppCompatTextView.java */
    public interface a {
        void a(int i10);

        void b(int i10);

        void c(int i10, float f10);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$c */
    /* JADX INFO: compiled from: AppCompatTextView.java */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.C0871y.b, androidx.appcompat.widget.C0871y.a
        public final void a(int i10) {
            C0871y.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.C0871y.b, androidx.appcompat.widget.C0871y.a
        public final void b(int i10) {
            C0871y.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$d */
    /* JADX INFO: compiled from: AppCompatTextView.java */
    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.C0871y.b, androidx.appcompat.widget.C0871y.a
        public final void c(int i10, float f10) {
            C0871y.super.setLineHeight(i10, f10);
        }
    }

    public C0871y(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<p307z0.d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                H0.h.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0859l getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C0859l(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k0.f9001c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            return Math.round(c0869w.f9034i.f9054e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (k0.f9001c) {
            return super.getAutoSizeMinTextSize();
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            return Math.round(c0869w.f9034i.f9053d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (k0.f9001c) {
            return super.getAutoSizeStepGranularity();
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            return Math.round(c0869w.f9034i.f9052c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (k0.f9001c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0869w c0869w = this.mTextHelper;
        return c0869w != null ? c0869w.f9034i.f9055f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k0.f9001c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            return c0869w.f9034i.f9050a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof H0.h.e ? ((H0.h.e) customSelectionActionModeCallback).f3618a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new d();
            } else if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0868v c0868v;
        if (Build.VERSION.SDK_INT >= 28 || (c0868v = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0868v.f9025b;
        return textClassifier == null ? C0868v.a.a(c0868v.f9024a) : textClassifier;
    }

    public z0.d.a getTextMetricsParamsCompat() {
        return H0.h.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f9003b.f5745a.b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            F0.a.a(editorInfo, getText());
        }
        O.h.k(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0869w c0869w = this.mTextHelper;
        if (c0869w == null || k0.f9001c) {
            return;
        }
        c0869w.f9034i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0869w c0869w = this.mTextHelper;
        if (c0869w == null || k0.f9001c || !c0869w.f9034i.f()) {
            return;
        }
        this.mTextHelper.f9034i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (k0.f9001c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (k0.f9001c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.i(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (k0.f9001c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H0.h.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f9003b.f5745a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            H0.h.b(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            H0.h.c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        H0.h.d(this, i10);
    }

    public void setPrecomputedText(p307z0.d dVar) {
        H0.h.e(this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.mBackgroundTintHelper;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0868v c0868v;
        if (Build.VERSION.SDK_INT >= 28 || (c0868v = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0868v.f9025b = textClassifier;
        }
    }

    public void setTextFuture(Future<p307z0.d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(z0.d.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f48692b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(aVar.f48691a);
        H0.h.a.e(this, aVar.f48693c);
        H0.h.a.h(this, aVar.f48694d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        boolean z10 = k0.f9001c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        C0869w c0869w = this.mTextHelper;
        if (c0869w == null || z10) {
            return;
        }
        C0872z c0872z = c0869w.f9034i;
        if (c0872z.f()) {
            return;
        }
        c0872z.g(f10, i10);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            p222s0.k kVar = p222s0.e.f46858a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public C0871y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().c(i10, f10);
        } else if (i11 >= 34) {
            H0.h.d.a(this, i10, f10);
        } else {
            H0.h.d(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0871y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        X.a(this, getContext());
        C0852e c0852e = new C0852e(this);
        this.mBackgroundTintHelper = c0852e;
        c0852e.d(attributeSet, i10);
        C0869w c0869w = new C0869w(this);
        this.mTextHelper = c0869w;
        c0869w.f(attributeSet, i10);
        c0869w.b();
        C0868v c0868v = new C0868v();
        c0868v.f9024a = this;
        this.mTextClassifierHelper = c0868v;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i10) : null, i11 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i11) : null, i12 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i12) : null, i13 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i13) : null);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i10) : null, i11 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i11) : null, i12 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i12) : null, i13 != 0 ? com.voltasit.obdeleven.domain.usecases.device.v.e(context, i13) : null);
        C0869w c0869w = this.mTextHelper;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.y$b */
    /* JADX INFO: compiled from: AppCompatTextView.java */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.C0871y.a
        public void a(int i10) {
        }

        @Override // androidx.appcompat.widget.C0871y.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.C0871y.a
        public void c(int i10, float f10) {
        }
    }
}
