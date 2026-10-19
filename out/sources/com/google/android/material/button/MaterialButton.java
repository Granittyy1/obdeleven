package com.google.android.material.button;

import A8.p;
import K5.o;
import K5.t;
import S5.i;
import S5.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0853f;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends C0853f implements Checkable, m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f26842s = {R.attr.state_checkable};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f26843t = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p288x5.a f26844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<a> f26845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f26846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f26847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f26848i;
    public Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f26854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26856r;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends K0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f26857d;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f26857d = parcel.readInt() == 1;
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f26857d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.materialButtonStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Button), attributeSet, com.voltasit.obdeleven.R.attr.materialButtonStyle);
        this.f26845f = new LinkedHashSet<>();
        this.f26854p = false;
        this.f26855q = false;
        Context context2 = getContext();
        TypedArray typedArrayD = o.d(context2, attributeSet, p204q5.a.f46121o, com.voltasit.obdeleven.R.attr.materialButtonStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f26853o = typedArrayD.getDimensionPixelSize(12, 0);
        int i10 = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f26847h = t.c(i10, mode);
        this.f26848i = P5.c.a(getContext(), typedArrayD, 14);
        this.j = P5.c.c(getContext(), typedArrayD, 10);
        this.f26856r = typedArrayD.getInteger(11, 1);
        this.f26850l = typedArrayD.getDimensionPixelSize(13, 0);
        p288x5.a aVar = new p288x5.a(this, i.b(context2, attributeSet, com.voltasit.obdeleven.R.attr.materialButtonStyle, com.voltasit.obdeleven.R.style.Widget_MaterialComponents_Button).a());
        this.f26844e = aVar;
        aVar.f47893c = typedArrayD.getDimensionPixelOffset(1, 0);
        aVar.f47894d = typedArrayD.getDimensionPixelOffset(2, 0);
        aVar.f47895e = typedArrayD.getDimensionPixelOffset(3, 0);
        aVar.f47896f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            aVar.f47897g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            i.a aVarE = aVar.f47892b.e();
            aVarE.e(f10);
            aVarE.f(f10);
            aVarE.d(f10);
            aVarE.c(f10);
            aVar.c(aVarE.a());
            aVar.f47905p = true;
        }
        aVar.f47898h = typedArrayD.getDimensionPixelSize(20, 0);
        aVar.f47899i = t.c(typedArrayD.getInt(7, -1), mode);
        aVar.j = P5.c.a(getContext(), typedArrayD, 6);
        aVar.f47900k = P5.c.a(getContext(), typedArrayD, 19);
        aVar.f47901l = P5.c.a(getContext(), typedArrayD, 16);
        aVar.f47906q = typedArrayD.getBoolean(5, false);
        aVar.f47909t = typedArrayD.getDimensionPixelSize(9, 0);
        aVar.f47907r = typedArrayD.getBoolean(21, true);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            aVar.f47904o = true;
            setSupportBackgroundTintList(aVar.j);
            setSupportBackgroundTintMode(aVar.f47899i);
        } else {
            aVar.e();
        }
        setPaddingRelative(paddingStart + aVar.f47893c, paddingTop + aVar.f47895e, paddingEnd + aVar.f47894d, paddingBottom + aVar.f47896f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.f26853o);
        d(this.j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        p288x5.a aVar = this.f26844e;
        return aVar != null && aVar.f47906q;
    }

    public final boolean b() {
        p288x5.a aVar = this.f26844e;
        return (aVar == null || aVar.f47904o) ? false : true;
    }

    public final void c() {
        int i10 = this.f26856r;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10) {
            setCompoundDrawablesRelative(this.j, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.j, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.j, null, null);
        }
    }

    public final void d(boolean z10) {
        Drawable drawable = this.j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            p234t0.a.C0532a.h(drawableMutate, this.f26848i);
            PorterDuff.Mode mode = this.f26847h;
            if (mode != null) {
                p234t0.a.C0532a.i(this.j, mode);
            }
            int intrinsicWidth = this.f26850l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f26850l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.j;
            int i10 = this.f26851m;
            int i11 = this.f26852n;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.j.setVisible(true, z10);
        }
        if (z10) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f26856r;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.j) || (((i12 == 3 || i12 == 4) && drawable5 != this.j) || ((i12 == 16 || i12 == 32) && drawable4 != this.j))) {
            c();
        }
    }

    public final void e(int i10, int i11) {
        if (this.j == null || getLayout() == null) {
            return;
        }
        int i12 = this.f26856r;
        if (!(i12 == 1 || i12 == 2) && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f26851m = 0;
                if (i12 == 16) {
                    this.f26852n = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f26850l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f26853o) - getPaddingBottom()) / 2);
                if (this.f26852n != iMax) {
                    this.f26852n = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f26852n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f26856r;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f26851m = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f26850l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.j.getIntrinsicWidth();
        }
        int textLayoutWidth = i10 - getTextLayoutWidth();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f26853o) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f26856r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f26851m != paddingEnd) {
            this.f26851m = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f26849k)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f26849k;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f26844e.f47897g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.j;
    }

    public int getIconGravity() {
        return this.f26856r;
    }

    public int getIconPadding() {
        return this.f26853o;
    }

    public int getIconSize() {
        return this.f26850l;
    }

    public ColorStateList getIconTint() {
        return this.f26848i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f26847h;
    }

    public int getInsetBottom() {
        return this.f26844e.f47896f;
    }

    public int getInsetTop() {
        return this.f26844e.f47895e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f26844e.f47901l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (b()) {
            return this.f26844e.f47892b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f26844e.f47900k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f26844e.f47898h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0853f
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f26844e.j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0853f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f26844e.f47899i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f26854p;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            p.F(this, this.f26844e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26842s);
        }
        if (this.f26854p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26843t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0853f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f26854p);
    }

    @Override // androidx.appcompat.widget.C0853f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f26854p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0853f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f4135b);
        setChecked(cVar.f26857d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f26857d = this.f26854p;
        return cVar;
    }

    @Override // androidx.appcompat.widget.C0853f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f26844e.f47907r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.j != null) {
            if (this.j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f26849k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!b()) {
            super.setBackgroundColor(i10);
            return;
        }
        p288x5.a aVar = this.f26844e;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.C0853f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        p288x5.a aVar = this.f26844e;
        aVar.f47904o = true;
        ColorStateList colorStateList = aVar.j;
        MaterialButton materialButton = aVar.f47891a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(aVar.f47899i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0853f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? v.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (b()) {
            this.f26844e.f47906q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f26854p != z10) {
            this.f26854p = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f26854p;
                if (!materialButtonToggleGroup.f26864g) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (this.f26855q) {
                return;
            }
            this.f26855q = true;
            Iterator<a> it = this.f26845f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f26855q = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (b()) {
            p288x5.a aVar = this.f26844e;
            if (aVar.f47905p && aVar.f47897g == i10) {
                return;
            }
            aVar.f47897g = i10;
            aVar.f47905p = true;
            float f10 = i10;
            i.a aVarE = aVar.f47892b.e();
            aVarE.e(f10);
            aVarE.f(f10);
            aVarE.d(f10);
            aVarE.c(f10);
            aVar.c(aVarE.a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (b()) {
            this.f26844e.b(false).j(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.j != drawable) {
            this.j = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f26856r != i10) {
            this.f26856r = i10;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f26853o != i10) {
            this.f26853o = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? v.e(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f26850l != i10) {
            this.f26850l = i10;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f26848i != colorStateList) {
            this.f26848i = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f26847h != mode) {
            this.f26847h = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(p186p0.a.b(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        p288x5.a aVar = this.f26844e;
        aVar.d(aVar.f47895e, i10);
    }

    public void setInsetTop(int i10) {
        p288x5.a aVar = this.f26844e;
        aVar.d(i10, aVar.f47896f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f26846g = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f26846g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            p288x5.a aVar = this.f26844e;
            if (aVar.f47901l != colorStateList) {
                aVar.f47901l = colorStateList;
                MaterialButton materialButton = aVar.f47891a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(Q5.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (b()) {
            setRippleColor(p186p0.a.b(getContext(), i10));
        }
    }

    @Override // S5.m
    public void setShapeAppearanceModel(i iVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f26844e.c(iVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (b()) {
            p288x5.a aVar = this.f26844e;
            aVar.f47903n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            p288x5.a aVar = this.f26844e;
            if (aVar.f47900k != colorStateList) {
                aVar.f47900k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (b()) {
            setStrokeColor(p186p0.a.b(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (b()) {
            p288x5.a aVar = this.f26844e;
            if (aVar.f47898h != i10) {
                aVar.f47898h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C0853f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        p288x5.a aVar = this.f26844e;
        if (aVar.j != colorStateList) {
            aVar.j = colorStateList;
            if (aVar.b(false) != null) {
                p234t0.a.C0532a.h(aVar.b(false), aVar.j);
            }
        }
    }

    @Override // androidx.appcompat.widget.C0853f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        p288x5.a aVar = this.f26844e;
        if (aVar.f47899i != mode) {
            aVar.f47899i = mode;
            if (aVar.b(false) == null || aVar.f47899i == null) {
                return;
            }
            p234t0.a.C0532a.i(aVar.b(false), aVar.f47899i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f26844e.f47907r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f26854p);
    }
}
