package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatButton.java */
/* JADX INFO: loaded from: classes.dex */
public class C0853f extends Button {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0852e f8945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0869w f8946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0859l f8947d;

    public C0853f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C0859l getEmojiTextViewHelper() {
        if (this.f8947d == null) {
            this.f8947d = new C0859l(this);
        }
        return this.f8947d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.f8946c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k0.f9001c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0869w c0869w = this.f8946c;
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
        C0869w c0869w = this.f8946c;
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
        C0869w c0869w = this.f8946c;
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
        C0869w c0869w = this.f8946c;
        return c0869w != null ? c0869w.f9034i.f9055f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k0.f9001c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0869w c0869w = this.f8946c;
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

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8946c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8946c.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0869w c0869w = this.f8946c;
        if (c0869w == null || k0.f9001c) {
            return;
        }
        c0869w.f9034i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C0869w c0869w = this.f8946c;
        if (c0869w == null || k0.f9001c) {
            return;
        }
        C0872z c0872z = c0869w.f9034i;
        if (c0872z.f()) {
            c0872z.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (k0.f9001c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0869w c0869w = this.f8946c;
        if (c0869w != null) {
            c0869w.h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (k0.f9001c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0869w c0869w = this.f8946c;
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
        C0869w c0869w = this.f8946c;
        if (c0869w != null) {
            c0869w.j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            c0852e.f(i10);
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

    public void setSupportAllCaps(boolean z10) {
        C0869w c0869w = this.f8946c;
        if (c0869w != null) {
            c0869w.f9026a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8945b;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8946c;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8946c;
        c0869w.l(mode);
        c0869w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0869w c0869w = this.f8946c;
        if (c0869w != null) {
            c0869w.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z10 = k0.f9001c;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        C0869w c0869w = this.f8946c;
        if (c0869w == null || z10) {
            return;
        }
        C0872z c0872z = c0869w.f9034i;
        if (c0872z.f()) {
            return;
        }
        c0872z.g(f10, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0853f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Z.a(context);
        X.a(this, getContext());
        C0852e c0852e = new C0852e(this);
        this.f8945b = c0852e;
        c0852e.d(attributeSet, i10);
        C0869w c0869w = new C0869w(this);
        this.f8946c = c0869w;
        c0869w.f(attributeSet, i10);
        c0869w.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }
}
