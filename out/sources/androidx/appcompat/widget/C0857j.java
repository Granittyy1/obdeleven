package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1291f;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatEditText.java */
/* JADX INFO: loaded from: classes.dex */
public class C0857j extends EditText implements androidx.core.view.A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0852e f8989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0869w f8990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0868v f8991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H0.i f8992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0858k f8993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f8994g;

    /* JADX INFO: renamed from: androidx.appcompat.widget.j$a */
    /* JADX INFO: compiled from: AppCompatEditText.java */
    public class a {
        public a() {
        }
    }

    public C0857j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private a getSuperCaller() {
        if (this.f8994g == null) {
            this.f8994g = new a();
        }
        return this.f8994g;
    }

    @Override // androidx.core.view.A
    public final C1291f a(C1291f c1291f) {
        return this.f8992e.a(this, c1291f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            c0852e.a();
        }
        C0869w c0869w = this.f8990c;
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
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8990c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8990c.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0868v c0868v;
        if (Build.VERSION.SDK_INT >= 28 || (c0868v = this.f8991d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0868v.f9025b;
        return textClassifier == null ? C0868v.a.a(c0868v.f9024a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8990c.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            F0.a.a(editorInfo, getText());
        }
        O.h.k(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrG = androidx.core.view.O.g(this)) != null) {
            editorInfo.contentMimeTypes = strArrG;
            inputConnectionOnCreateInputConnection = new F0.c(inputConnectionOnCreateInputConnection, new F0.b(this));
        }
        return this.f8993f.d(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.O.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = r.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        C1291f.c cVar;
        C1291f.b bVar;
        int i11;
        C1291f.a aVar;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 || androidx.core.view.O.g(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i12 >= 31) {
                aVar = new C1291f.a(primaryClip, 1);
            } else {
                cVar = new C1291f.c();
                cVar.f16921a = primaryClip;
                cVar.f16922b = 1;
            }
            if (i10 == 16908322) {
                bVar = cVar;
                bVar = aVar;
                i11 = 0;
            } else {
                bVar = cVar;
                bVar = aVar;
                i11 = 1;
            }
            bVar.c(i11);
            androidx.core.view.O.j(this, bVar.a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8990c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0869w c0869w = this.f8990c;
        if (c0869w != null) {
            c0869w.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H0.h.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f8993f.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8993f.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8989b;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0869w c0869w = this.f8990c;
        c0869w.k(colorStateList);
        c0869w.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0869w c0869w = this.f8990c;
        c0869w.l(mode);
        c0869w.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0869w c0869w = this.f8990c;
        if (c0869w != null) {
            c0869w.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0868v c0868v;
        if (Build.VERSION.SDK_INT >= 28 || (c0868v = this.f8991d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0868v.f9025b = textClassifier;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0857j(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        Z.a(context);
        X.a(this, getContext());
        C0852e c0852e = new C0852e(this);
        this.f8989b = c0852e;
        c0852e.d(attributeSet, R.attr.editTextStyle);
        C0869w c0869w = new C0869w(this);
        this.f8990c = c0869w;
        c0869w.f(attributeSet, R.attr.editTextStyle);
        c0869w.b();
        C0868v c0868v = new C0868v();
        c0868v.f9024a = this;
        this.f8991d = c0868v;
        this.f8992e = new H0.i();
        C0858k c0858k = new C0858k(this);
        this.f8993f = c0858k;
        c0858k.c(attributeSet, R.attr.editTextStyle);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
