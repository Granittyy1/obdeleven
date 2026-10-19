package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.StackingBehavior;
import com.voltasit.obdeleven.R;
import p042d3.b;
import p055e3.c;
import p055e3.d;

/* JADX INFO: loaded from: classes.dex */
public class MDRootLayout extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f23280u = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MDButton[] f23281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f23283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f23284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StackingBehavior f23287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23288i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f23291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f23292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GravityEnum f23294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f23295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f23296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f23297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f23298t;

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23281b = new MDButton[3];
        this.f23285f = false;
        this.f23286g = false;
        this.f23287h = StackingBehavior.f23258c;
        this.f23288i = false;
        this.j = true;
        this.f23294p = GravityEnum.f23188b;
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f34554a, 0, 0);
        this.f23289k = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f23291m = resources.getDimensionPixelSize(R.dimen.md_notitle_vertical_padding);
        this.f23292n = resources.getDimensionPixelSize(R.dimen.md_button_frame_vertical_padding);
        this.f23295q = resources.getDimensionPixelSize(R.dimen.md_button_padding_frame_side);
        this.f23293o = resources.getDimensionPixelSize(R.dimen.md_button_height);
        this.f23296r = new Paint();
        this.f23298t = resources.getDimensionPixelSize(R.dimen.md_divider_height);
        this.f23296r.setColor(p067f3.b.f(context, R.attr.md_divider_color, 0));
        setWillNotDraw(false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    public static void a(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        mDRootLayout.getClass();
        if (z10 && viewGroup.getChildCount() > 0) {
            View view = mDRootLayout.f23283d;
            if (view == null || view.getVisibility() == 8) {
                z13 = false;
            } else {
                if (viewGroup.getPaddingTop() + viewGroup.getScrollY() > viewGroup.getChildAt(0).getTop()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            mDRootLayout.f23285f = z13;
        }
        if (viewGroup.getChildCount() > 0) {
            if (z11) {
                z12 = (viewGroup.getHeight() + viewGroup.getScrollY()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
            }
            mDRootLayout.f23286g = z12;
        }
    }

    public static boolean c(View view) {
        boolean z10 = (view == null || view.getVisibility() == 8) ? false : true;
        if (z10 && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z10;
    }

    public final void b(ViewGroup viewGroup, boolean z10) {
        if (this.f23297s == null) {
            if (viewGroup instanceof RecyclerView) {
                c cVar = new c(this, viewGroup, z10);
                RecyclerView recyclerView = (RecyclerView) viewGroup;
                recyclerView.j(cVar);
                cVar.b(0, 0, recyclerView);
                return;
            }
            d dVar = new d(this, viewGroup, z10);
            this.f23297s = dVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f23297s);
            dVar.onScrollChanged();
        }
    }

    public final void d(View view, boolean z10) {
        View childAt;
        if (view == null) {
            return;
        }
        boolean z11 = false;
        if (view instanceof ScrollView) {
            ViewGroup viewGroup = (ScrollView) view;
            if (viewGroup.getChildCount() != 0) {
                if ((viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(0).getMeasuredHeight()) {
                    b(viewGroup, z10);
                    return;
                }
            }
            if (z10) {
                this.f23285f = false;
            }
            this.f23286g = false;
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (adapterView.getLastVisiblePosition() != -1) {
                boolean z12 = adapterView.getFirstVisiblePosition() == 0;
                boolean z13 = adapterView.getLastVisiblePosition() == adapterView.getCount() - 1;
                if (!z12 || !z13 || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom()) {
                    b(adapterView, z10);
                    return;
                }
            }
            if (z10) {
                this.f23285f = false;
            }
            this.f23286g = false;
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new p055e3.b(this, view, z10));
            return;
        }
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null && recyclerView.getLayoutManager().g()) {
                z11 = true;
            }
            if (z10) {
                this.f23285f = z11;
            }
            this.f23286g = z11;
            if (z11) {
                b((ViewGroup) view, z10);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            View view2 = null;
            if (viewGroup2.getChildCount() == 0) {
                childAt = null;
                break;
            }
            int childCount = viewGroup2.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    childAt = null;
                    break;
                }
                childAt = viewGroup2.getChildAt(childCount);
                if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                    break;
                } else {
                    childCount--;
                }
            }
            d(childAt, z10);
            if (viewGroup2.getChildCount() != 0) {
                for (int childCount2 = viewGroup2.getChildCount() - 1; childCount2 >= 0; childCount2--) {
                    View childAt2 = viewGroup2.getChildAt(childCount2);
                    if (childAt2.getVisibility() == 0 && childAt2.getBottom() == viewGroup2.getMeasuredHeight()) {
                        view2 = childAt2;
                        break;
                    }
                }
            }
            if (view2 != childAt) {
                d(view2, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f23284e;
        if (view != null) {
            if (this.f23285f) {
                int top = view.getTop();
                canvas.drawRect(0.0f, top - this.f23298t, getMeasuredWidth(), top, this.f23296r);
            }
            if (this.f23286g) {
                int bottom = this.f23284e.getBottom();
                canvas.drawRect(0.0f, bottom, getMeasuredWidth(), bottom + this.f23298t, this.f23296r);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() == R.id.md_titleFrame) {
                this.f23283d = childAt;
            } else {
                int id = childAt.getId();
                MDButton[] mDButtonArr = this.f23281b;
                if (id == R.id.md_buttonDefaultNeutral) {
                    mDButtonArr[0] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultNegative) {
                    mDButtonArr[1] = (MDButton) childAt;
                } else if (childAt.getId() == R.id.md_buttonDefaultPositive) {
                    mDButtonArr[2] = (MDButton) childAt;
                } else {
                    this.f23284e = childAt;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int measuredWidth5;
        int measuredWidth6;
        int measuredWidth7;
        int measuredWidth8;
        int i15 = i11;
        if (c(this.f23283d)) {
            int measuredHeight = this.f23283d.getMeasuredHeight() + i15;
            this.f23283d.layout(i10, i15, i12, measuredHeight);
            i15 = measuredHeight;
        } else if (!this.f23290l && this.j) {
            i15 += this.f23291m;
        }
        if (c(this.f23284e)) {
            View view = this.f23284e;
            view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
        }
        boolean z11 = this.f23288i;
        MDButton[] mDButtonArr = this.f23281b;
        if (z11) {
            int measuredHeight2 = i13 - this.f23292n;
            for (MDButton mDButton : mDButtonArr) {
                if (c(mDButton)) {
                    mDButton.layout(i10, measuredHeight2 - mDButton.getMeasuredHeight(), i12, measuredHeight2);
                    measuredHeight2 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            int i16 = this.j ? i13 - this.f23292n : i13;
            int i17 = i16 - this.f23293o;
            int measuredWidth9 = this.f23295q;
            boolean zC = c(mDButtonArr[2]);
            GravityEnum gravityEnum = GravityEnum.f23190d;
            if (zC) {
                if (this.f23294p == gravityEnum) {
                    measuredWidth7 = i10 + measuredWidth9;
                    measuredWidth8 = mDButtonArr[2].getMeasuredWidth() + measuredWidth7;
                    i14 = -1;
                } else {
                    int i18 = i12 - measuredWidth9;
                    measuredWidth7 = i18 - mDButtonArr[2].getMeasuredWidth();
                    measuredWidth8 = i18;
                    i14 = measuredWidth7;
                }
                mDButtonArr[2].layout(measuredWidth7, i17, measuredWidth8, i16);
                measuredWidth9 += mDButtonArr[2].getMeasuredWidth();
            } else {
                i14 = -1;
            }
            boolean zC2 = c(mDButtonArr[1]);
            GravityEnum gravityEnum2 = GravityEnum.f23188b;
            if (zC2) {
                GravityEnum gravityEnum3 = this.f23294p;
                if (gravityEnum3 == gravityEnum) {
                    measuredWidth5 = measuredWidth9 + i10;
                    measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                } else {
                    if (gravityEnum3 == gravityEnum2) {
                        measuredWidth6 = i12 - measuredWidth9;
                        measuredWidth5 = measuredWidth6 - mDButtonArr[1].getMeasuredWidth();
                    } else {
                        measuredWidth5 = this.f23295q + i10;
                        measuredWidth6 = mDButtonArr[1].getMeasuredWidth() + measuredWidth5;
                        measuredWidth = measuredWidth6;
                    }
                    mDButtonArr[1].layout(measuredWidth5, i17, measuredWidth6, i16);
                }
                measuredWidth = -1;
                mDButtonArr[1].layout(measuredWidth5, i17, measuredWidth6, i16);
            } else {
                measuredWidth = -1;
            }
            if (c(mDButtonArr[0])) {
                GravityEnum gravityEnum4 = this.f23294p;
                if (gravityEnum4 == gravityEnum) {
                    measuredWidth3 = i12 - this.f23295q;
                    measuredWidth4 = measuredWidth3 - mDButtonArr[0].getMeasuredWidth();
                } else if (gravityEnum4 == gravityEnum2) {
                    measuredWidth4 = this.f23295q + i10;
                    measuredWidth3 = mDButtonArr[0].getMeasuredWidth() + measuredWidth4;
                } else {
                    if (measuredWidth != -1 || i14 == -1) {
                        if (i14 == -1 && measuredWidth != -1) {
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        } else if (i14 == -1) {
                            measuredWidth = ((i12 - i10) / 2) - (mDButtonArr[0].getMeasuredWidth() / 2);
                            measuredWidth2 = mDButtonArr[0].getMeasuredWidth();
                        }
                        i14 = measuredWidth2 + measuredWidth;
                    } else {
                        measuredWidth = i14 - mDButtonArr[0].getMeasuredWidth();
                    }
                    measuredWidth3 = i14;
                    measuredWidth4 = measuredWidth;
                }
                mDButtonArr[0].layout(measuredWidth4, i17, measuredWidth3, i16);
            }
        }
        d(this.f23284e, true);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int measuredHeight;
        int i12;
        int measuredHeight2;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i14 = this.f23282c;
        if (size2 > i14) {
            size2 = i14;
        }
        this.j = true;
        StackingBehavior stackingBehavior = this.f23287h;
        StackingBehavior stackingBehavior2 = StackingBehavior.f23257b;
        MDButton[] mDButtonArr = this.f23281b;
        int measuredHeight3 = 0;
        if (stackingBehavior == stackingBehavior2) {
            z11 = true;
            z10 = false;
        } else if (stackingBehavior == StackingBehavior.f23259d) {
            z11 = false;
            z10 = false;
        } else {
            int measuredWidth = 0;
            z10 = false;
            for (MDButton mDButton : mDButtonArr) {
                if (mDButton != null && c(mDButton)) {
                    mDButton.a(false, false);
                    measureChild(mDButton, i10, i11);
                    measuredWidth += mDButton.getMeasuredWidth();
                    z10 = true;
                }
            }
            z11 = measuredWidth > size - (getContext().getResources().getDimensionPixelSize(R.dimen.md_neutral_button_margin) * 2);
        }
        this.f23288i = z11;
        if (z11) {
            measuredHeight = 0;
            for (MDButton mDButton2 : mDButtonArr) {
                if (mDButton2 != null && c(mDButton2)) {
                    mDButton2.a(true, false);
                    measureChild(mDButton2, i10, i11);
                    measuredHeight += mDButton2.getMeasuredHeight();
                    z10 = true;
                }
            }
        } else {
            measuredHeight = 0;
        }
        if (z10) {
            if (this.f23288i) {
                measuredHeight2 = size2 - measuredHeight;
                i12 = this.f23292n * 2;
                i13 = i12;
            } else {
                measuredHeight2 = size2 - this.f23293o;
                i12 = this.f23292n * 2;
            }
            if (c(this.f23283d)) {
                this.f23283d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
                measuredHeight2 -= this.f23283d.getMeasuredHeight();
            } else if (!this.f23290l) {
                i12 += this.f23291m;
            }
            if (c(this.f23284e)) {
                this.f23284e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i13, Integer.MIN_VALUE));
                if (this.f23284e.getMeasuredHeight() <= measuredHeight2 - i12) {
                    this.j = false;
                } else if (this.f23289k || c(this.f23283d) || z10) {
                    this.j = true;
                    measuredHeight3 = measuredHeight2 - (this.f23284e.getMeasuredHeight() + i12);
                } else {
                    this.j = false;
                    measuredHeight3 = measuredHeight2 - (this.f23284e.getMeasuredHeight() + i13);
                }
            } else {
                measuredHeight3 = measuredHeight2;
            }
            setMeasuredDimension(size, size2 - measuredHeight3);
        }
        i12 = this.f23292n * 2;
        measuredHeight2 = size2;
        i13 = 0;
        if (c(this.f23283d)) {
            this.f23283d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
            measuredHeight2 -= this.f23283d.getMeasuredHeight();
        } else if (!this.f23290l) {
            i12 += this.f23291m;
        }
        if (c(this.f23284e)) {
            this.f23284e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2 - i13, Integer.MIN_VALUE));
            if (this.f23284e.getMeasuredHeight() <= measuredHeight2 - i12) {
                this.j = false;
            } else if (this.f23289k) {
                this.j = true;
                measuredHeight3 = measuredHeight2 - (this.f23284e.getMeasuredHeight() + i12);
            } else {
                this.j = true;
                measuredHeight3 = measuredHeight2 - (this.f23284e.getMeasuredHeight() + i12);
            }
        } else {
            measuredHeight3 = measuredHeight2;
        }
        setMeasuredDimension(size, size2 - measuredHeight3);
    }

    public void setButtonGravity(GravityEnum gravityEnum) {
        this.f23294p = gravityEnum;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int iOrdinal = this.f23294p.ordinal();
            if (iOrdinal == 0) {
                this.f23294p = GravityEnum.f23190d;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                this.f23294p = GravityEnum.f23188b;
            }
        }
    }

    public void setButtonStackedGravity(GravityEnum gravityEnum) {
        for (MDButton mDButton : this.f23281b) {
            if (mDButton != null) {
                mDButton.setStackedGravity(gravityEnum);
            }
        }
    }

    public void setDividerColor(int i10) {
        this.f23296r.setColor(i10);
        invalidate();
    }

    public void setMaxHeight(int i10) {
        this.f23282c = i10;
    }

    public void setStackingBehavior(StackingBehavior stackingBehavior) {
        this.f23287h = stackingBehavior;
        invalidate();
    }
}
