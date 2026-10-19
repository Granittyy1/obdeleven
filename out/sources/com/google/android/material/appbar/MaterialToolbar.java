package com.google.android.material.appbar;

import A8.p;
import K5.o;
import S5.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ImageView.ScaleType[] f26699g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f26700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView.ScaleType f26703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f26704f;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        TypedArray typedArrayD = o.d(context2, attributeSet, p204q5.a.f46130x, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.f26701c = typedArrayD.getBoolean(4, false);
        this.f26702d = typedArrayD.getBoolean(3, false);
        int i10 = typedArrayD.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f26699g;
            if (i10 < scaleTypeArr.length) {
                this.f26703e = scaleTypeArr[i10];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.f26704f = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : G5.c.a(background);
        if (colorStateListValueOf != null) {
            f fVar = new f();
            fVar.k(colorStateListValueOf);
            fVar.i(context2);
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            fVar.j(O.d.i(this));
            setBackground(fVar);
        }
    }

    public final void a(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f26703e;
    }

    public Integer getNavigationIconTint() {
        return this.f26700b;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void inflateMenu(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.f;
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).w();
        }
        super.inflateMenu(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.f) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.G(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView2 = null;
        if (this.f26701c || this.f26702d) {
            ArrayList arrayListA = K5.p.a(this, getTitle());
            boolean zIsEmpty = arrayListA.isEmpty();
            K5.p.a aVar = K5.p.f4358a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListA, aVar);
            ArrayList arrayListA2 = K5.p.a(this, getSubtitle());
            TextView textView2 = arrayListA2.isEmpty() ? null : (TextView) Collections.max(arrayListA2, aVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f26701c && textView != null) {
                    a(textView, pair);
                }
                if (this.f26702d && textView2 != null) {
                    a(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt2 = getChildAt(i16);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f26704f;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f26703e;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.E(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f26704f;
        if (bool == null || bool.booleanValue() != z10) {
            this.f26704f = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f26703e != scaleType) {
            this.f26703e = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f26700b != null) {
            drawable = drawable.mutate();
            p234t0.a.C0532a.g(drawable, this.f26700b.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f26700b = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f26702d != z10) {
            this.f26702d = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f26701c != z10) {
            this.f26701c = z10;
            requestLayout();
        }
    }
}
