package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0848a {
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f8558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f8559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f8560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f8561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f8562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f8563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f8564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8568u;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p138l.a f8569b;

        public a(p138l.a aVar) {
            this.f8569b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f8569b.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p088h.a.f35692d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : com.voltasit.obdeleven.domain.usecases.device.v.e(context, resourceId));
        this.f8565r = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f8566s = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f8891f = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f8568u = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(p138l.a aVar) {
        View view = this.f8559l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f8568u, (ViewGroup) this, false);
            this.f8559l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f8559l);
        }
        View viewFindViewById = this.f8559l.findViewById(R.id.action_mode_close_button);
        this.f8560m = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(aVar));
        androidx.appcompat.view.menu.f fVarE = aVar.e();
        C0850c c0850c = this.f8890e;
        if (c0850c != null) {
            c0850c.b();
            C0850c.a aVar2 = c0850c.f8914v;
            if (aVar2 != null && aVar2.b()) {
                aVar2.f8521i.dismiss();
            }
        }
        C0850c c0850c2 = new C0850c(getContext());
        this.f8890e = c0850c2;
        c0850c2.f8906n = true;
        c0850c2.f8907o = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.f8890e, this.f8888c);
        C0850c c0850c3 = this.f8890e;
        androidx.appcompat.view.menu.k kVar = c0850c3.f8408i;
        if (kVar == null) {
            androidx.appcompat.view.menu.k kVar2 = (androidx.appcompat.view.menu.k) c0850c3.f8404e.inflate(c0850c3.f8406g, (ViewGroup) this, false);
            c0850c3.f8408i = kVar2;
            kVar2.b(c0850c3.f8403d);
            c0850c3.i();
        }
        androidx.appcompat.view.menu.k kVar3 = c0850c3.f8408i;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(c0850c3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.f8889d = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f8889d, layoutParams);
    }

    public final void g() {
        if (this.f8562o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f8562o = linearLayout;
            this.f8563p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f8564q = (TextView) this.f8562o.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f8565r;
            if (i10 != 0) {
                this.f8563p.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f8566s;
            if (i11 != 0) {
                this.f8564q.setTextAppearance(getContext(), i11);
            }
        }
        this.f8563p.setText(this.j);
        this.f8564q.setText(this.f8558k);
        boolean zIsEmpty = TextUtils.isEmpty(this.j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f8558k);
        this.f8564q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f8562o.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f8562o.getParent() == null) {
            addView(this.f8562o);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0848a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0848a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f8558k;
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public final void h() {
        removeAllViews();
        this.f8561n = null;
        this.f8889d = null;
        this.f8890e = null;
        View view = this.f8560m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0850c c0850c = this.f8890e;
        if (c0850c != null) {
            c0850c.b();
            C0850c.a aVar = this.f8890e.f8914v;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f8521i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = k0.f8999a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f8559l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8559l.getLayoutParams();
            int i14 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = z12 ? paddingRight - i14 : paddingRight + i14;
            int iD = AbstractC0848a.d(i16, paddingTop, paddingTop2, this.f8559l, z12) + i16;
            paddingRight = z12 ? iD - i15 : iD + i15;
        }
        LinearLayout linearLayout = this.f8562o;
        if (linearLayout != null && this.f8561n == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0848a.d(paddingRight, paddingTop, paddingTop2, this.f8562o, z12);
        }
        View view2 = this.f8561n;
        if (view2 != null) {
            AbstractC0848a.d(paddingRight, paddingTop, paddingTop2, view2, z12);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8889d;
        if (actionMenuView != null) {
            AbstractC0848a.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f8891f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f8559l;
        if (view != null) {
            int iC = AbstractC0848a.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8559l.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8889d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0848a.c(this.f8889d, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f8562o;
        if (linearLayout != null && this.f8561n == null) {
            if (this.f8567t) {
                this.f8562o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f8562o.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f8562o.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = AbstractC0848a.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f8561n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f8561n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f8891f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC0848a
    public void setContentHeight(int i10) {
        this.f8891f = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f8561n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f8561n = view;
        if (view != null && (linearLayout = this.f8562o) != null) {
            removeView(linearLayout);
            this.f8562o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8558k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        g();
        androidx.core.view.O.o(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f8567t) {
            requestLayout();
        }
        this.f8567t = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC0848a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
