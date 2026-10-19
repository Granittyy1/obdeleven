package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: AppCompatToggleButton.java */
/* JADX INFO: loaded from: classes.dex */
public final class A extends ToggleButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0852e f8546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0869w f8547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0859l f8548d;

    public A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        X.a(this, getContext());
        C0852e c0852e = new C0852e(this);
        this.f8546b = c0852e;
        c0852e.d(attributeSet, R.attr.buttonStyleToggle);
        C0869w c0869w = new C0869w(this);
        this.f8547c = c0869w;
        c0869w.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0859l getEmojiTextViewHelper() {
        if (this.f8548d == null) {
            this.f8548d = new C0859l(this);
        }
        return this.f8548d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.f8547c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8547c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8547c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8547c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8547c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f9003b.f5745a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8546b;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8547c;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8547c;
        c0869w.l(mode);
        c0869w.b();
    }
}
