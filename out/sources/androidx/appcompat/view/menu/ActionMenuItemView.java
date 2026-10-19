package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0850c;
import androidx.appcompat.widget.C0871y;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.i0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C0871y implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f8372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f8373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f8374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f.b f8375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f8376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f8377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8379i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8381l;

    public class a extends G {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.G
        public final p150m.f b() {
            C0850c.a aVar;
            b bVar = ActionMenuItemView.this.f8377g;
            if (bVar == null || (aVar = C0850c.this.f8914v) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.G
        public final boolean c() {
            p150m.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f8375e;
            return bVar != null && bVar.a(actionMenuItemView.f8372b) && (fVarB = b()) != null && fVarB.b();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f8378h = c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p088h.a.f35691c, 0, 0);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8381l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8380k = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f8372b.getIcon() == null;
    }

    public final boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        this.f8372b = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f8487a);
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f8376f == null) {
            this.f8376f = new a();
        }
    }

    public final void e() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f8373c);
        if (this.f8374d != null && ((this.f8372b.f8510y & 4) != 4 || (!this.f8378h && !this.f8379i))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f8373c : null);
        CharSequence charSequence = this.f8372b.f8502q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f8372b.f8491e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f8372b.f8503r;
        if (TextUtils.isEmpty(charSequence2)) {
            i0.a(this, z12 ? null : this.f8372b.f8491e);
        } else {
            i0.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f8372b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f8375e;
        if (bVar != null) {
            bVar.a(this.f8372b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8378h = c();
        e();
    }

    @Override // androidx.appcompat.widget.C0871y, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.f8380k) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.j;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.f8374d == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8374d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f8372b.hasSubMenu() && (aVar = this.f8376f) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f8379i != z10) {
            this.f8379i = z10;
            h hVar = this.f8372b;
            if (hVar != null) {
                f fVar = hVar.f8499n;
                fVar.f8467k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8374d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f8381l;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(f.b bVar) {
        this.f8375e = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f8380k = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f8377g = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8373c = charSequence;
        e();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
