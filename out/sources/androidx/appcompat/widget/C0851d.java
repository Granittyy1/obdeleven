package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class C0851d extends AutoCompleteTextView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f8931e = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0852e f8932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0869w f8933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0858k f8934d;

    public C0851d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.f8933c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof H0.h.e ? ((H0.h.e) customSelectionActionModeCallback).f3618a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8933c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8933c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        O.h.k(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f8934d.d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8933c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8933c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H0.h.f(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f8934d.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8934d.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8932b;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8933c;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8933c;
        c0869w.l(mode);
        c0869w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0869w c0869w = this.f8933c;
        if (c0869w != null) {
            c0869w.g(context, i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0851d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle);
        Z.a(context);
        X.a(this, getContext());
        c0 c0VarF = c0.f(getContext(), attributeSet, f8931e, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle, 0);
        if (c0VarF.f8929b.hasValue(0)) {
            setDropDownBackgroundDrawable(c0VarF.b(0));
        }
        c0VarF.g();
        C0852e c0852e = new C0852e(this);
        this.f8932b = c0852e;
        c0852e.d(attributeSet, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle);
        C0869w c0869w = new C0869w(this);
        this.f8933c = c0869w;
        c0869w.f(attributeSet, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle);
        c0869w.b();
        C0858k c0858k = new C0858k(this);
        this.f8934d = c0858k;
        c0858k.c(attributeSet, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerB = c0858k.b(keyListener);
        if (keyListenerB == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerB);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
