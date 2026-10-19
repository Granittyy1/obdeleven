package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0854g f8627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0852e f8628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0869w f8629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0859l f8630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Z.a(context);
        X.a(this, getContext());
        C0869w c0869w = new C0869w(this);
        this.f8629d = c0869w;
        c0869w.f(attributeSet, R.attr.checkedTextViewStyle);
        c0869w.b();
        C0852e c0852e = new C0852e(this);
        this.f8628c = c0852e;
        c0852e.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f8627b = new C0854g(this);
        Context context2 = getContext();
        int[] iArr = p088h.a.f35699l;
        c0 c0VarF = c0.f(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = c0VarF.f8929b;
        androidx.core.view.O.m(this, getContext(), iArr, attributeSet, c0VarF.f8929b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c0VarF.a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(D.b(typedArray.getInt(3, -1), null));
            }
            c0VarF.g();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c0VarF.g();
            throw th;
        }
    }

    private C0859l getEmojiTextViewHelper() {
        if (this.f8630e == null) {
            this.f8630e = new C0859l(this);
        }
        return this.f8630e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0869w c0869w = this.f8629d;
        if (c0869w != null) {
            c0869w.b();
        }
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            c0852e.a();
        }
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            c0854g.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof H0.h.e ? ((H0.h.e) customSelectionActionModeCallback).f3618a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            return c0854g.f8950b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            return c0854g.f8951c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8629d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8629d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        O.h.k(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            if (c0854g.f8954f) {
                c0854g.f8954f = false;
            } else {
                c0854g.f8954f = true;
                c0854g.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8629d;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8629d;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8628c;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            c0854g.f8950b = colorStateList;
            c0854g.f8952d = true;
            c0854g.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0854g c0854g = this.f8627b;
        if (c0854g != null) {
            c0854g.f8951c = mode;
            c0854g.f8953e = true;
            c0854g.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8629d;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8629d;
        c0869w.l(mode);
        c0869w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0869w c0869w = this.f8629d;
        if (c0869w != null) {
            c0869w.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getContext(), i10));
    }
}
