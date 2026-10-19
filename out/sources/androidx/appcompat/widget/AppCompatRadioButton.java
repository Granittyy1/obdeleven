package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements H0.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0855h f8634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0852e f8635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0869w f8636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0859l f8637e;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C0859l getEmojiTextViewHelper() {
        if (this.f8637e == null) {
            this.f8637e = new C0859l(this);
        }
        return this.f8637e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.f8636d;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    @Override // H0.j
    public ColorStateList getSupportButtonTintList() {
        C0855h c0855h = this.f8634b;
        if (c0855h != null) {
            return c0855h.f8958b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0855h c0855h = this.f8634b;
        if (c0855h != null) {
            return c0855h.f8959c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8636d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8636d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0855h c0855h = this.f8634b;
        if (c0855h != null) {
            if (c0855h.f8962f) {
                c0855h.f8962f = false;
            } else {
                c0855h.f8962f = true;
                c0855h.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8636d;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8636d;
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
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8635c;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    @Override // H0.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0855h c0855h = this.f8634b;
        if (c0855h != null) {
            c0855h.f8958b = colorStateList;
            c0855h.f8960d = true;
            c0855h.a();
        }
    }

    @Override // H0.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0855h c0855h = this.f8634b;
        if (c0855h != null) {
            c0855h.f8959c = mode;
            c0855h.f8961e = true;
            c0855h.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8636d;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8636d;
        c0869w.l(mode);
        c0869w.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Z.a(context);
        X.a(this, getContext());
        C0855h c0855h = new C0855h(this);
        this.f8634b = c0855h;
        c0855h.b(attributeSet, R.attr.radioButtonStyle);
        C0852e c0852e = new C0852e(this);
        this.f8635c = c0852e;
        c0852e.d(attributeSet, R.attr.radioButtonStyle);
        C0869w c0869w = new C0869w(this);
        this.f8636d = c0869w;
        c0869w.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), i10));
    }
}
