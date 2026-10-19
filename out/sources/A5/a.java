package A5;

import A8.p;
import E2.e;
import K5.o;
import K5.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.c0;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p211r0.f;

/* JADX INFO: compiled from: MaterialCheckBox.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AppCompatCheckBox {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<c> f605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet<b> f606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f608i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final E2.d f622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0003a f623y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f604z = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f601A = {R.attr.state_error};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[][] f602B = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f603C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: A5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaterialCheckBox.java */
    public class C0003a extends E2.c {
        public C0003a() {
        }

        @Override // E2.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.f614p;
            if (colorStateList != null) {
                p234t0.a.C0532a.h(drawable, colorStateList);
            }
        }

        @Override // E2.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f614p;
            if (colorStateList != null) {
                p234t0.a.C0532a.g(drawable, colorStateList.getColorForState(aVar.f618t, colorStateList.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: compiled from: MaterialCheckBox.java */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: MaterialCheckBox.java */
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: MaterialCheckBox.java */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0004a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f625b;

        /* JADX INFO: renamed from: A5.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MaterialCheckBox.java */
        public class C0004a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d(parcel);
                dVar.f625b = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f625b;
            if (i10 != 1) {
                str = i10 != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return Q8.d.a(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f625b));
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f605f = new LinkedHashSet<>();
        this.f606g = new LinkedHashSet<>();
        Context context2 = getContext();
        E2.d dVar = new E2.d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f46248a;
        Drawable drawableA = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f2988b = drawableA;
        drawableA.setCallback(dVar.f2980g);
        new E2.d.c(dVar.f2988b.getConstantState());
        this.f622x = dVar;
        this.f623y = new C0003a();
        Context context3 = getContext();
        this.f611m = H0.c.a(this);
        this.f614p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = p204q5.a.f46125s;
        o.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        o.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        c0 c0Var = new c0(context3, typedArrayObtainStyledAttributes);
        this.f612n = c0Var.b(2);
        if (this.f611m != null && P5.b.b(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f603C && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f611m = v.e(context3, R.drawable.mtrl_checkbox_button);
                this.f613o = true;
                if (this.f612n == null) {
                    this.f612n = v.e(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f615q = P5.c.b(context3, c0Var, 3);
        this.f616r = t.c(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f608i = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.j = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f609k = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f610l = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c0Var.g();
        b();
    }

    private String getButtonStateDescription() {
        int i10 = this.f617s;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f607h == null) {
            int iW = p.w(R.attr.colorControlActivated, this);
            int iW2 = p.w(R.attr.colorError, this);
            int iW3 = p.w(R.attr.colorSurface, this);
            int iW4 = p.w(R.attr.colorOnSurface, this);
            this.f607h = new ColorStateList(f602B, new int[]{p.B(1.0f, iW3, iW2), p.B(1.0f, iW3, iW), p.B(0.54f, iW3, iW4), p.B(0.38f, iW3, iW4), p.B(0.38f, iW3, iW4)});
        }
        return this.f607h;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f614p;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        Drawable drawableMutate = this.f611m;
        ColorStateList colorStateList3 = this.f614p;
        PorterDuff.Mode modeB = H0.b.b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeB != null) {
                p234t0.a.C0532a.i(drawableMutate, modeB);
            }
        }
        this.f611m = drawableMutate;
        Drawable drawableMutate2 = this.f612n;
        ColorStateList colorStateList4 = this.f615q;
        PorterDuff.Mode mode = this.f616r;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                p234t0.a.C0532a.i(drawableMutate2, mode);
            }
        }
        this.f612n = drawableMutate2;
        if (this.f613o) {
            E2.d dVar = this.f622x;
            if (dVar != null) {
                Drawable drawable = dVar.f2988b;
                C0003a c0003a = this.f623y;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c0003a.f2975a == null) {
                        c0003a.f2975a = new E2.b(c0003a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0003a.f2975a);
                }
                ArrayList<E2.c> arrayList = dVar.f2979f;
                E2.d.b bVar = dVar.f2976c;
                if (arrayList != null && c0003a != null) {
                    arrayList.remove(c0003a);
                    if (dVar.f2979f.size() == 0 && (eVar = dVar.f2978e) != null) {
                        bVar.f2983b.removeListener(eVar);
                        dVar.f2978e = null;
                    }
                }
                Drawable drawable2 = dVar.f2988b;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c0003a.f2975a == null) {
                        c0003a.f2975a = new E2.b(c0003a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0003a.f2975a);
                } else if (c0003a != null) {
                    if (dVar.f2979f == null) {
                        dVar.f2979f = new ArrayList<>();
                    }
                    if (!dVar.f2979f.contains(c0003a)) {
                        dVar.f2979f.add(c0003a);
                        if (dVar.f2978e == null) {
                            dVar.f2978e = new e(dVar);
                        }
                        bVar.f2983b.addListener(dVar.f2978e);
                    }
                }
            }
            Drawable drawable3 = this.f611m;
            if ((drawable3 instanceof AnimatedStateListDrawable) && dVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.f611m).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
            }
        }
        Drawable drawable4 = this.f611m;
        if (drawable4 != null && (colorStateList2 = this.f614p) != null) {
            p234t0.a.C0532a.h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f612n;
        if (drawable5 != null && (colorStateList = this.f615q) != null) {
            p234t0.a.C0532a.h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f611m;
        Drawable drawable7 = this.f612n;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f10 = intrinsicWidth / intrinsicHeight;
                if (f10 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f10);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f10 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f611m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f612n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f615q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f616r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f614p;
    }

    public int getCheckedState() {
        return this.f617s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f610l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f617s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f608i && this.f614p == null && this.f615q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f604z);
        }
        if (this.f609k) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f601A);
        }
        for (int i11 = 0; i11 < iArrOnCreateDrawableState.length; i11++) {
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
            }
            this.f618t = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f618t = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.j || !TextUtils.isEmpty(getText()) || (drawableA = H0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (t.b(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            p234t0.a.C0532a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f609k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f610l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f625b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f625b = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(v.e(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f612n = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(v.e(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f615q == colorStateList) {
            return;
        }
        this.f615q = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f616r == mode) {
            return;
        }
        this.f616r = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f614p == colorStateList) {
            return;
        }
        this.f614p = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.j = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f617s != i10) {
            this.f617s = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f620v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f619u) {
                return;
            }
            this.f619u = true;
            LinkedHashSet<b> linkedHashSet = this.f606g;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.f617s != 2 && (onCheckedChangeListener = this.f621w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f619u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f610l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f609k == z10) {
            return;
        }
        this.f609k = z10;
        refreshDrawableState();
        Iterator<c> it = this.f605f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f621w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f620v = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f608i = z10;
        if (z10) {
            H0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            H0.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f611m = drawable;
        this.f613o = false;
        b();
    }
}
