package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0852e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8937a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f8940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f8941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f8942f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8939c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0856i f8938b = C0856i.a();

    public C0852e(View view) {
        this.f8937a = view;
    }

    public final void a() {
        View view = this.f8937a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f8940d != null) {
                if (this.f8942f == null) {
                    this.f8942f = new a0();
                }
                a0 a0Var = this.f8942f;
                a0Var.f8898a = null;
                a0Var.f8901d = false;
                a0Var.f8899b = null;
                a0Var.f8900c = false;
                WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                ColorStateList colorStateListG = androidx.core.view.O.d.g(view);
                if (colorStateListG != null) {
                    a0Var.f8901d = true;
                    a0Var.f8898a = colorStateListG;
                }
                PorterDuff.Mode modeH = androidx.core.view.O.d.h(view);
                if (modeH != null) {
                    a0Var.f8900c = true;
                    a0Var.f8899b = modeH;
                }
                if (a0Var.f8901d || a0Var.f8900c) {
                    C0856i.e(background, a0Var, view.getDrawableState());
                    return;
                }
            }
            a0 a0Var2 = this.f8941e;
            if (a0Var2 != null) {
                C0856i.e(background, a0Var2, view.getDrawableState());
                return;
            }
            a0 a0Var3 = this.f8940d;
            if (a0Var3 != null) {
                C0856i.e(background, a0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        a0 a0Var = this.f8941e;
        if (a0Var != null) {
            return a0Var.f8898a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        a0 a0Var = this.f8941e;
        if (a0Var != null) {
            return a0Var.f8899b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListF;
        View view = this.f8937a;
        Context context = view.getContext();
        int[] iArr = p088h.a.f35687A;
        c0 c0VarF = c0.f(context, attributeSet, iArr, i10, 0);
        TypedArray typedArray = c0VarF.f8929b;
        View view2 = this.f8937a;
        androidx.core.view.O.m(view2, view2.getContext(), iArr, attributeSet, c0VarF.f8929b, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f8939c = typedArray.getResourceId(0, -1);
                C0856i c0856i = this.f8938b;
                Context context2 = view.getContext();
                int i11 = this.f8939c;
                synchronized (c0856i) {
                    colorStateListF = c0856i.f8982a.f(context2, i11);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                androidx.core.view.O.d.q(view, c0VarF.a(1));
            }
            if (typedArray.hasValue(2)) {
                androidx.core.view.O.d.r(view, D.b(typedArray.getInt(2, -1), null));
            }
            c0VarF.g();
        } catch (Throwable th) {
            c0VarF.g();
            throw th;
        }
    }

    public final void e() {
        this.f8939c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListF;
        this.f8939c = i10;
        C0856i c0856i = this.f8938b;
        if (c0856i != null) {
            Context context = this.f8937a.getContext();
            synchronized (c0856i) {
                colorStateListF = c0856i.f8982a.f(context, i10);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8940d == null) {
                this.f8940d = new a0();
            }
            a0 a0Var = this.f8940d;
            a0Var.f8898a = colorStateList;
            a0Var.f8901d = true;
        } else {
            this.f8940d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f8941e == null) {
            this.f8941e = new a0();
        }
        a0 a0Var = this.f8941e;
        a0Var.f8898a = colorStateList;
        a0Var.f8901d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f8941e == null) {
            this.f8941e = new a0();
        }
        a0 a0Var = this.f8941e;
        a0Var.f8899b = mode;
        a0Var.f8900c = true;
        a();
    }
}
