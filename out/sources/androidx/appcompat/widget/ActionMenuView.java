package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.core.view.InterfaceC1303s;
import com.braze.support.BrazeLogger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends H implements androidx.appcompat.view.menu.f.b, androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f8603A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f8604B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.appcompat.view.menu.f f8605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f8606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0850c f8609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.view.menu.j.a f8610v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.appcompat.view.menu.f.a f8611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8613y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f8614z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class c extends H.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f8616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f8617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f8619e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f8620f;
    }

    public class d implements androidx.appcompat.view.menu.f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            boolean z10;
            boolean zOnMenuItemSelected;
            e eVar = ActionMenuView.this.f8604B;
            if (eVar == null) {
                return false;
            }
            Toolbar toolbar = Toolbar.this;
            Iterator<InterfaceC1303s> it = toolbar.mMenuHostHelper.f16984b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (it.next().a(menuItem)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                zOnMenuItemSelected = true;
            } else {
                Toolbar.h hVar = toolbar.mOnMenuItemClickListener;
                zOnMenuItemSelected = hVar != null ? p100i.q.this.f36405b.onMenuItemSelected(0, menuItem) : false;
            }
            return zOnMenuItemSelected;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.f.a aVar = ActionMenuView.this.f8611w;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f8614z = (int) (56.0f * f10);
        this.f8603A = (int) (f10 * 4.0f);
        this.f8606r = context;
        this.f8607s = 0;
    }

    public static c l() {
        c cVar = new c(-2, -2);
        cVar.f8615a = false;
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    public static c m(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof c) {
            c cVar2 = (c) layoutParams;
            cVar = new c(cVar2);
            cVar.f8615a = cVar2.f8615a;
        } else {
            cVar = new c(layoutParams);
        }
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.f8605q.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.f8605q = fVar;
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f8605q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.f8605q = fVar;
            fVar.f8462e = new d();
            C0850c c0850c = new C0850c(context);
            this.f8609u = c0850c;
            c0850c.f8906n = true;
            c0850c.f8907o = true;
            androidx.appcompat.view.menu.j.a bVar = this.f8610v;
            if (bVar == null) {
                bVar = new b();
            }
            c0850c.f8405f = bVar;
            this.f8605q.b(c0850c, this.f8606r);
            C0850c c0850c2 = this.f8609u;
            c0850c2.f8408i = this;
            this.f8605q = c0850c2.f8403d;
        }
        return this.f8605q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0850c c0850c = this.f8609u;
        C0850c.d dVar = c0850c.f8903k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c0850c.f8905m) {
            return c0850c.f8904l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f8607s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.H
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ H.a generateDefaultLayoutParams() {
        return l();
    }

    @Override // androidx.appcompat.widget.H
    /* JADX INFO: renamed from: i */
    public final H.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.H
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ H.a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0850c c0850c = this.f8609u;
        if (c0850c != null) {
            c0850c.i();
            if (this.f8609u.j()) {
                this.f8609u.b();
                this.f8609u.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0850c c0850c = this.f8609u;
        if (c0850c != null) {
            c0850c.b();
            C0850c.a aVar = c0850c.f8914v;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f8521i.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f8612x) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = k0.f8999a;
        boolean z12 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f8615a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    n(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f8615a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f8615a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.H, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        ?? r10;
        int i15;
        androidx.appcompat.view.menu.f fVar;
        boolean z12 = this.f8612x;
        boolean z13 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f8612x = z13;
        if (z12 != z13) {
            this.f8613y = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f8612x && (fVar = this.f8605q) != null && size != this.f8613y) {
            this.f8613y = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f8612x || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                c cVar = (c) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f8614z;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z14 = false;
        int i24 = 0;
        long j = 0;
        while (true) {
            i12 = this.f8603A;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i27 = i22 + 1;
                if (z15) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f8620f = false;
                cVar2.f8617c = 0;
                cVar2.f8616b = 0;
                cVar2.f8618d = false;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = 0;
                cVar2.f8619e = z15 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = cVar2.f8615a ? 1 : i19;
                c cVar3 = (c) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z15 ? (ActionMenuItemView) childAt : null;
                boolean z16 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i28 <= 0 || (z16 && i28 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i21, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i21;
                    if (measuredWidth % i21 != 0) {
                        i15++;
                    }
                    if (z16 && i15 < 2) {
                        i15 = 2;
                    }
                }
                cVar3.f8618d = !cVar3.f8615a && z16;
                cVar3.f8616b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i21, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (cVar2.f8618d) {
                    i24++;
                }
                if (cVar2.f8615a) {
                    z14 = true;
                }
                i19 -= i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j |= (long) (1 << i23);
                }
                i22 = i27;
            }
            i23++;
            size3 = i25;
            i17 = i26;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i29 = mode;
        int i30 = i17;
        int i31 = size3;
        boolean z17 = z14 && i22 == 2;
        boolean z18 = false;
        while (true) {
            if (i24 <= 0 || i19 <= 0) {
                z10 = z18;
                break;
            }
            int i32 = BrazeLogger.SUPPRESS;
            int i33 = 0;
            int i34 = 0;
            long j10 = 0;
            while (i34 < childCount2) {
                c cVar4 = (c) getChildAt(i34).getLayoutParams();
                boolean z19 = z18;
                if (cVar4.f8618d) {
                    int i35 = cVar4.f8616b;
                    if (i35 < i32) {
                        j10 = 1 << i34;
                        i32 = i35;
                        i33 = 1;
                    } else if (i35 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z18 = z19;
            }
            z10 = z18;
            j |= j10;
            if (i33 > i19) {
                break;
            }
            int i36 = i32 + 1;
            int i37 = 0;
            while (i37 < childCount2) {
                View childAt2 = getChildAt(i37);
                c cVar5 = (c) childAt2.getLayoutParams();
                int i38 = iMax;
                int i39 = childMeasureSpec;
                int i40 = childCount2;
                long j11 = 1 << i37;
                if ((j10 & j11) != 0) {
                    if (z17 && cVar5.f8619e) {
                        r10 = 1;
                        r10 = 1;
                        if (i19 == 1) {
                            childAt2.setPadding(i12 + i21, 0, i12, 0);
                        }
                    } else {
                        r10 = 1;
                    }
                    cVar5.f8616b += r10;
                    cVar5.f8620f = r10;
                    i19--;
                } else if (cVar5.f8616b == i36) {
                    j |= j11;
                }
                i37++;
                childMeasureSpec = i39;
                iMax = i38;
                childCount2 = i40;
            }
            z18 = true;
        }
        int i41 = iMax;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z20 = !z14 && i22 == 1;
        if (i19 <= 0 || j == 0 || (i19 >= i22 - 1 && !z20 && iMax2 <= 1)) {
            i13 = i43;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z20) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f8619e) {
                    fBitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j & ((long) (1 << i44))) != 0 && !((c) getChildAt(i44).getLayoutParams()).f8619e) {
                    fBitCount -= 0.5f;
                }
            }
            int i45 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : 0;
            boolean z21 = z10;
            i13 = i43;
            for (int i46 = 0; i46 < i13; i46++) {
                if ((j & ((long) (1 << i46))) != 0) {
                    View childAt3 = getChildAt(i46);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f8617c = i45;
                        cVar6.f8620f = true;
                        if (i46 == 0 && !cVar6.f8619e) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = (-i45) / 2;
                        }
                        z21 = true;
                    } else if (cVar6.f8615a) {
                        cVar6.f8617c = i45;
                        cVar6.f8620f = true;
                        ((LinearLayout.LayoutParams) cVar6).rightMargin = (-i45) / 2;
                        z21 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) cVar6).leftMargin = i45 / 2;
                        }
                        if (i46 != i13 - 1) {
                            ((LinearLayout.LayoutParams) cVar6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
            z11 = z21;
        }
        if (z11) {
            int i47 = 0;
            while (i47 < i13) {
                View childAt4 = getChildAt(i47);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f8620f) {
                    i14 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f8616b * i21) + cVar7.f8617c, 1073741824), i14);
                } else {
                    i14 = i42;
                }
                i47++;
                i42 = i14;
            }
        }
        setMeasuredDimension(i30, i29 != 1073741824 ? i41 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f8609u.f8911s = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f8604B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0850c c0850c = this.f8609u;
        C0850c.d dVar = c0850c.f8903k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c0850c.f8905m = true;
            c0850c.f8904l = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f8608t = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f8607s != i10) {
            this.f8607s = i10;
            if (i10 == 0) {
                this.f8606r = getContext();
            } else {
                this.f8606r = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C0850c c0850c) {
        this.f8609u = c0850c;
        c0850c.f8408i = this;
        this.f8605q = c0850c.f8403d;
    }

    @Override // androidx.appcompat.widget.H, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class b implements androidx.appcompat.view.menu.j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }
    }
}
