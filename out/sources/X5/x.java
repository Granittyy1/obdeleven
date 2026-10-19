package X5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0851d;
import androidx.appcompat.widget.J;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: MaterialAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends C0851d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J f7313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f7314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f7315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7316i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f7317k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7318l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f7319m;

    /* JADX INFO: compiled from: MaterialAutoCompleteTextView.java */
    public class a<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ColorStateList f7320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f7321c;

        public a(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            b();
        }

        public final void b() {
            ColorStateList colorStateList;
            x xVar = x.this;
            ColorStateList colorStateList2 = xVar.f7319m;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f7321c = colorStateList;
            if (xVar.f7318l != 0 && xVar.f7319m != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{p222s0.a.e(xVar.f7319m.getColorForState(iArr3, 0), xVar.f7318l), p222s0.a.e(xVar.f7319m.getColorForState(iArr2, 0), xVar.f7318l), xVar.f7318l});
            }
            this.f7320b = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                x xVar = x.this;
                Drawable rippleDrawable = null;
                if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f7318l != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(xVar.f7318l);
                    if (this.f7321c != null) {
                        p234t0.a.C0532a.h(colorDrawable, this.f7320b);
                        rippleDrawable = new RippleDrawable(this.f7321c, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public x(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f7315h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = K5.o.d(context2, attributeSet, p204q5.a.f46120n, com.voltasit.obdeleven.R.attr.autoCompleteTextViewStyle, 2132018270, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f7316i = typedArrayD.getResourceId(3, com.voltasit.obdeleven.R.layout.mtrl_auto_complete_simple_item);
        this.j = typedArrayD.getDimensionPixelOffset(1, com.voltasit.obdeleven.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayD.hasValue(2)) {
            this.f7317k = ColorStateList.valueOf(typedArrayD.getColor(2, 0));
        }
        this.f7318l = typedArrayD.getColor(4, 0);
        this.f7319m = P5.c.a(context2, typedArrayD, 5);
        this.f7314g = (AccessibilityManager) context2.getSystemService("accessibility");
        J j = new J(context2, null, com.voltasit.obdeleven.R.attr.listPopupWindowStyle);
        this.f7313f = j;
        j.f8745z = true;
        j.f8721A.setFocusable(true);
        j.f8735p = this;
        j.f8721A.setInputMethodMode(2);
        j.p(getAdapter());
        j.f8736q = new w(this);
        if (typedArrayD.hasValue(6)) {
            setSimpleItems(typedArrayD.getResourceId(6, 0));
        }
        typedArrayD.recycle();
    }

    public static void a(x xVar, Object obj) {
        xVar.setText(xVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f7314g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f7313f.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f7317k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.f27543F) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f7318l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f7319m;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.f27543F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7313f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                J j = this.f7313f;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !j.f8721A.isShowing() ? -1 : j.f8724d.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = j.f8721A.getBackground();
                if (background != null) {
                    Rect rect = this.f7315h;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        AccessibilityManager accessibilityManager = this.f7314g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z10);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f7313f.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        J j = this.f7313f;
        if (j != null) {
            j.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f7317k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof S5.f) {
            ((S5.f) dropDownBackground).k(this.f7317k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f7313f.f8737r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f7318l = i10;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f7319m = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f7314g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f7313f.a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f7316i, strArr));
    }
}
