package com.google.android.material.internal;

import B0.s;
import K5.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.i0;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;
import p211r0.f;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements k.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int[] f27241H = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CheckedTextView f27242A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public FrameLayout f27243B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public h f27244C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f27245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f27246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f27247F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final a f27248G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f27249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f27250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f27251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f27252z;

    public class a extends C1286a {
        public a() {
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            sVar.f1411a.setCheckable(NavigationMenuItemView.this.f27251y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f27252z = true;
        a aVar = new a();
        this.f27248G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.voltasit.obdeleven.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.voltasit.obdeleven.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.voltasit.obdeleven.R.id.design_menu_item_text);
        this.f27242A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.n(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f27243B == null) {
                this.f27243B = (FrameLayout) ((ViewStub) findViewById(com.voltasit.obdeleven.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f27243B.removeAllViews();
            this.f27243B.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        StateListDrawable stateListDrawable;
        this.f27244C = hVar;
        int i10 = hVar.f8487a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.voltasit.obdeleven.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f27241H, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            setBackground(stateListDrawable);
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.f8491e);
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.f8502q);
        i0.a(this, hVar.f8503r);
        h hVar2 = this.f27244C;
        CharSequence charSequence = hVar2.f8491e;
        CheckedTextView checkedTextView = this.f27242A;
        if (charSequence == null && hVar2.getIcon() == null && this.f27244C.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f27243B;
            if (frameLayout != null) {
                H.a aVar = (H.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f27243B.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f27243B;
        if (frameLayout2 != null) {
            H.a aVar2 = (H.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f27243B.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f27244C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        h hVar = this.f27244C;
        if (hVar != null && hVar.isCheckable() && this.f27244C.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f27241H);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f27251y != z10) {
            this.f27251y = z10;
            this.f27248G.sendAccessibilityEvent(this.f27242A, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f27242A;
        checkedTextView.setChecked(z10);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f27252z) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f27246E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                p234t0.a.C0532a.h(drawable, this.f27245D);
            }
            int i10 = this.f27249w;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f27250x) {
            if (this.f27247F == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f46248a;
                Drawable drawableA = f.a.a(resources, com.voltasit.obdeleven.R.drawable.navigation_empty_icon, theme);
                this.f27247F = drawableA;
                if (drawableA != null) {
                    int i11 = this.f27249w;
                    drawableA.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f27247F;
        }
        this.f27242A.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f27242A.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f27249w = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f27245D = colorStateList;
        this.f27246E = colorStateList != null;
        h hVar = this.f27244C;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f27242A.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f27250x = z10;
    }

    public void setTextAppearance(int i10) {
        this.f27242A.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27242A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f27242A.setText(charSequence);
    }
}
