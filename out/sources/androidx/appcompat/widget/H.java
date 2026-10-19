package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LinearLayoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class H extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f8710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8711i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f8712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8717p;

    /* JADX INFO: compiled from: LinearLayoutCompat.java */
    public static class a extends LinearLayout.LayoutParams {
    }

    public H(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void f(Canvas canvas, int i10) {
        this.f8713l.setBounds(getPaddingLeft() + this.f8717p, i10, (getWidth() - getPaddingRight()) - this.f8717p, this.f8715n + i10);
        this.f8713l.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.f8713l.setBounds(i10, getPaddingTop() + this.f8717p, this.f8714m + i10, (getHeight() - getPaddingBottom()) - this.f8717p);
        this.f8713l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f8705c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f8705c;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8705c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8706d;
        if (this.f8707e == 1 && (i10 = this.f8708f & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8709g) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8709g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8705c;
    }

    public Drawable getDividerDrawable() {
        return this.f8713l;
    }

    public int getDividerPadding() {
        return this.f8717p;
    }

    public int getDividerWidth() {
        return this.f8714m;
    }

    public int getGravity() {
        return this.f8708f;
    }

    public int getOrientation() {
        return this.f8707e;
    }

    public int getShowDividers() {
        return this.f8716o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8710h;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f8707e;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return (this.f8716o & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f8716o & 4) != 0;
        }
        if ((this.f8716o & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.f8713l == null) {
            return;
        }
        int i11 = 0;
        if (this.f8707e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f8715n);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f8715n;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = k0.f8999a;
        boolean z11 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                a aVar = (a) childAt3.getLayoutParams();
                g(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f8714m);
            }
            i11++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i10 = this.f8714m;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f8714m;
                right = left - i10;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int measuredHeight;
        int paddingTop;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        if (this.f8707e == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i24 = i12 - i10;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.f8708f;
            int i26 = i25 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i27 = 8388615 & i25;
            if (i26 != 16) {
                paddingTop = i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f8709g;
            } else {
                paddingTop = getPaddingTop() + (((i13 - i11) - this.f8709g) / 2);
            }
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt != null && childAt.getVisibility() != i23) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i29 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i22 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft2;
                        } else {
                            i20 = paddingRight - measuredWidth;
                            i21 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        if (k(i28)) {
                            paddingTop += this.f8715n;
                        }
                        int i30 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        childAt.layout(i22, i30, measuredWidth + i22, i30 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i30;
                    } else {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (k(i28)) {
                        paddingTop += this.f8715n;
                    }
                    int i31 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i22, i31, measuredWidth + i22, i31 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i31;
                }
                i28++;
                i23 = 8;
            }
            return;
        }
        boolean z11 = k0.f8999a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i32 = i13 - i11;
        int paddingBottom = i32 - getPaddingBottom();
        int paddingBottom2 = (i32 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i33 = this.f8708f;
        int i34 = 8388615 & i33;
        int i35 = i33 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        boolean z13 = this.f8704b;
        int[] iArr = this.j;
        int[] iArr2 = this.f8712k;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i34, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f8709g;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f8709g) / 2);
        }
        if (z12) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = 1;
            i15 = 0;
        }
        int i36 = 0;
        while (i36 < virtualChildCount2) {
            int i37 = (i14 * i36) + i15;
            View childAt2 = getChildAt(i37);
            if (childAt2 == null) {
                i14 = i14;
                i16 = virtualChildCount2;
                i35 = i35;
                i17 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z13) {
                        i16 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i18 < 0) {
                            i18 = i35;
                        }
                        i19 = i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                        if (i19 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        } else if (i19 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i19 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (k(i37)) {
                            paddingLeft += this.f8714m;
                        }
                        int i38 = paddingLeft + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        childAt2.layout(i38, measuredHeight, i38 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i38;
                    } else {
                        i16 = virtualChildCount2;
                    }
                    i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i18 < 0) {
                        i18 = i35;
                    }
                    i19 = i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i19 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    } else if (i19 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i19 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (k(i37)) {
                        paddingLeft += this.f8714m;
                    }
                    int i39 = paddingLeft + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    childAt2.layout(i39, measuredHeight, i39 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i39;
                } else {
                    i16 = virtualChildCount2;
                }
                i17 = 1;
            }
            i36 += i17;
            i15 = i15;
            i14 = i14;
            virtualChildCount2 = i16;
            i35 = i35;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0486  */
    /* JADX WARN: Code duplicated, block: B:214:0x048b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0552  */
    /* JADX WARN: Code duplicated, block: B:252:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x055d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0600  */
    /* JADX WARN: Code duplicated, block: B:289:0x060c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:315:0x0698  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:373:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0806  */
    /* JADX WARN: Code duplicated, block: B:388:0x083d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0860  */
    /* JADX WARN: Code duplicated, block: B:393:0x086e  */
    /* JADX WARN: Code duplicated, block: B:395:0x087a  */
    /* JADX WARN: Code duplicated, block: B:397:0x0886  */
    /* JADX WARN: Code duplicated, block: B:398:0x089b  */
    /* JADX WARN: Code duplicated, block: B:429:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        char c10;
        int iMax;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        char c11;
        int i16;
        View childAt;
        int i17;
        int i18;
        int i19;
        int baseline;
        int i20;
        int iMakeMeasureSpec;
        int i21;
        View childAt2;
        a aVar;
        int i22;
        View childAt3;
        a aVar2;
        float f11;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z10;
        boolean z11;
        a aVar3;
        int measuredWidth;
        boolean z12;
        int i29;
        boolean z13;
        int i30;
        int measuredHeight;
        boolean z14;
        int baseline2;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        boolean z16;
        a aVar4;
        boolean z17;
        int i35;
        boolean z18;
        int iMax2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f12 = 0.0f;
        boolean z19 = true;
        if (this.f8707e == 1) {
            this.f8709g = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i40 = this.f8705c;
            boolean z20 = this.f8711i;
            boolean z21 = true;
            int i41 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z22 = false;
            int iMax5 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z23 = false;
            float f13 = 0.0f;
            while (i41 < virtualChildCount) {
                View childAt4 = getChildAt(i41);
                if (childAt4 == null) {
                    this.f8709g = this.f8709g;
                } else {
                    if (childAt4.getVisibility() != i38) {
                        if (k(i41)) {
                            this.f8709g += this.f8715n;
                        }
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f14 = ((LinearLayout.LayoutParams) aVar5).weight;
                        f13 += f14;
                        if (mode2 == i37 && ((LinearLayout.LayoutParams) aVar5).height == 0 && f14 > f12) {
                            int i44 = this.f8709g;
                            this.f8709g = Math.max(i44, ((LinearLayout.LayoutParams) aVar5).topMargin + i44 + ((LinearLayout.LayoutParams) aVar5).bottomMargin);
                            aVar4 = aVar5;
                            z17 = true;
                            z16 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar5).height != 0 || f14 <= f12) {
                                i34 = i39;
                            } else {
                                ((LinearLayout.LayoutParams) aVar5).height = i36;
                                i34 = 0;
                            }
                            int i45 = f13 == f12 ? this.f8709g : 0;
                            z16 = true;
                            aVar4 = aVar5;
                            measureChildWithMargins(childAt4, i10, 0, i11, i45);
                            if (i34 != i39) {
                                ((LinearLayout.LayoutParams) aVar4).height = i34;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i46 = this.f8709g;
                            this.f8709g = Math.max(i46, i46 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin);
                            int i47 = iMax5;
                            if (z20) {
                                iMax5 = Math.max(measuredHeight2, i47);
                            }
                            z17 = z22;
                        }
                        if (i40 >= 0 && i40 == i41 + 1) {
                            this.f8706d = this.f8709g;
                        }
                        if (i41 < i40 && ((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i35 = mode;
                        if (i35 == 1073741824 || ((LinearLayout.LayoutParams) aVar4).width != -1) {
                            z18 = false;
                        } else {
                            z18 = z16;
                            z23 = z18;
                        }
                        int i48 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i48;
                        iMax2 = Math.max(i42, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i43, childAt4.getMeasuredState());
                        boolean z24 = (z21 && ((LinearLayout.LayoutParams) aVar4).width == -1) ? z16 : false;
                        if (((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            if (!z18) {
                                i48 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i48);
                        } else {
                            int i49 = iMax4;
                            if (!z18) {
                                i48 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i48);
                            iMax4 = i49;
                        }
                        z22 = z17;
                        i43 = iCombineMeasuredStates;
                        z21 = z24;
                    }
                    i41++;
                    mode = i35;
                    i42 = iMax2;
                    i40 = i40;
                    z19 = z16;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f12 = 0.0f;
                }
                i40 = i40;
                mode2 = mode2;
                i35 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i42;
                z16 = true;
                i41++;
                mode = i35;
                i42 = iMax2;
                i40 = i40;
                z19 = z16;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f12 = 0.0f;
            }
            int i50 = mode2;
            int i51 = mode;
            int i52 = virtualChildCount;
            boolean z25 = z19;
            int iMax6 = iMax3;
            int i53 = iMax4;
            int i54 = iMax5;
            int i55 = i42;
            int iCombineMeasuredStates2 = i43;
            if (this.f8709g > 0 && k(i52)) {
                this.f8709g += this.f8715n;
            }
            int i56 = i50;
            if (z20 && (i56 == Integer.MIN_VALUE || i56 == 0)) {
                this.f8709g = 0;
                for (int i57 = 0; i57 < i52; i57++) {
                    View childAt5 = getChildAt(i57);
                    if (childAt5 == null) {
                        this.f8709g = this.f8709g;
                    } else if (childAt5.getVisibility() != 8) {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        int i58 = this.f8709g;
                        this.f8709g = Math.max(i58, i58 + i54 + ((LinearLayout.LayoutParams) aVar6).topMargin + ((LinearLayout.LayoutParams) aVar6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f8709g;
            this.f8709g = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i59 = (16777215 & iResolveSizeAndState) - this.f8709g;
            if (z22 || (i59 != 0 && f13 > 0.0f)) {
                float f15 = this.f8710h;
                if (f15 > 0.0f) {
                    f13 = f15;
                }
                this.f8709g = 0;
                int i60 = 0;
                while (i60 < i52) {
                    View childAt6 = getChildAt(i60);
                    if (childAt6.getVisibility() == 8) {
                        i31 = i56;
                    } else {
                        a aVar7 = (a) childAt6.getLayoutParams();
                        float f16 = ((LinearLayout.LayoutParams) aVar7).weight;
                        if (f16 > 0.0f) {
                            int i61 = (int) ((i59 * f16) / f13);
                            f13 -= f16;
                            int i62 = i59 - i61;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin, ((LinearLayout.LayoutParams) aVar7).width);
                            if (((LinearLayout.LayoutParams) aVar7).height == 0) {
                                i33 = 1073741824;
                                if (i56 == 1073741824) {
                                    if (i61 <= 0) {
                                        i61 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i61, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i59 = i62;
                            } else {
                                i33 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i61;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i33));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i59 = i62;
                        }
                        int i63 = ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i63;
                        int iMax7 = Math.max(i55, measuredWidth3);
                        if (i51 != 1073741824) {
                            i31 = i56;
                            i32 = -1;
                            if (((LinearLayout.LayoutParams) aVar7).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i63);
                            if (z21 || ((LinearLayout.LayoutParams) aVar7).width != i32) {
                                z15 = false;
                            } else {
                                z15 = z25;
                            }
                            int i64 = this.f8709g;
                            this.f8709g = Math.max(i64, childAt6.getMeasuredHeight() + i64 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin);
                            z21 = z15;
                            i55 = iMax7;
                        } else {
                            i31 = i56;
                            i32 = -1;
                        }
                        i63 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i63);
                        if (z21) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        int i65 = this.f8709g;
                        this.f8709g = Math.max(i65, childAt6.getMeasuredHeight() + i65 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin);
                        z21 = z15;
                        i55 = iMax7;
                    }
                    i60++;
                    i56 = i31;
                }
                this.f8709g = getPaddingBottom() + getPaddingTop() + this.f8709g;
            } else {
                iMax6 = Math.max(iMax6, i53);
                if (z20 && i56 != 1073741824) {
                    for (int i66 = 0; i66 < i52; i66++) {
                        View childAt7 = getChildAt(i66);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                        }
                    }
                }
            }
            int i67 = i55;
            if (z21 || i51 == 1073741824) {
                iMax6 = i67;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z23) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i68 = 0; i68 < i52; i68++) {
                    View childAt8 = getChildAt(i68);
                    if (childAt8.getVisibility() != 8) {
                        a aVar8 = (a) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar8).width == -1) {
                            int i69 = ((LinearLayout.LayoutParams) aVar8).height;
                            ((LinearLayout.LayoutParams) aVar8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i11, 0);
                            ((LinearLayout.LayoutParams) aVar8).height = i69;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f8709g = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (this.j == null || this.f8712k == null) {
            this.j = new int[4];
            this.f8712k = new int[4];
        }
        int[] iArr = this.j;
        int[] iArr2 = this.f8712k;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z26 = this.f8704b;
        boolean z27 = this.f8711i;
        boolean z28 = mode3 == 1073741824;
        boolean z29 = true;
        int iMax8 = 0;
        float f17 = 0.0f;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z30 = false;
        boolean z31 = false;
        while (i71 < virtualChildCount2) {
            View childAt9 = getChildAt(i71);
            if (childAt9 == null) {
                this.f8709g = this.f8709g;
                i28 = i71;
                z10 = z27;
                z11 = z26;
            } else {
                int i73 = iMax8;
                int i74 = i70;
                if (childAt9.getVisibility() == 8) {
                    z11 = z26;
                    iMax8 = i73;
                    i70 = i74;
                    i28 = i71;
                    z10 = z27;
                } else {
                    if (k(i71)) {
                        this.f8709g += this.f8714m;
                    }
                    a aVar9 = (a) childAt9.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) aVar9).weight;
                    float f19 = f17 + f18;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar9).width == 0 && f18 > 0.0f) {
                        if (z28) {
                            this.f8709g = ((LinearLayout.LayoutParams) aVar9).leftMargin + ((LinearLayout.LayoutParams) aVar9).rightMargin + this.f8709g;
                        } else {
                            int i75 = this.f8709g;
                            this.f8709g = Math.max(i75, ((LinearLayout.LayoutParams) aVar9).leftMargin + i75 + ((LinearLayout.LayoutParams) aVar9).rightMargin);
                        }
                        if (z26) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            aVar3 = aVar9;
                            i25 = i73;
                            i26 = i74;
                            i28 = i71;
                            z10 = z27;
                            z11 = z26;
                        } else {
                            aVar3 = aVar9;
                            i25 = i73;
                            i26 = i74;
                            i28 = i71;
                            i29 = 1073741824;
                            z10 = z27;
                            z11 = z26;
                            z12 = true;
                        }
                        if (mode4 == i29 && ((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z13 = true;
                            z31 = true;
                        } else {
                            z13 = false;
                        }
                        i30 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i30;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i72, childAt9.getMeasuredState());
                        if (!z11 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i76 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i76 < 0) {
                                i76 = this.f8708f;
                            }
                            int i77 = (((i76 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) >> 4) & (-2)) >> 1;
                            iArr[i77] = Math.max(iArr[i77], baseline2);
                            iArr2[i77] = Math.max(iArr2[i77], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i26, measuredHeight);
                        if (z29 || ((LinearLayout.LayoutParams) aVar3).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (z13) {
                                measuredHeight = i30;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i25;
                        } else {
                            if (z13) {
                                measuredHeight = i30;
                            }
                            iMax8 = Math.max(i25, measuredHeight);
                        }
                        i70 = iMax11;
                        i72 = iCombineMeasuredStates3;
                        z30 = z12;
                        z29 = z14;
                        f17 = f19;
                    } else {
                        int i78 = i71;
                        if (((LinearLayout.LayoutParams) aVar9).width == 0) {
                            f11 = 0.0f;
                            if (f18 > 0.0f) {
                                ((LinearLayout.LayoutParams) aVar9).width = -2;
                                i23 = 0;
                            }
                            if (f19 == f11) {
                                i24 = this.f8709g;
                            } else {
                                i24 = 0;
                            }
                            i25 = i73;
                            i26 = i74;
                            i27 = i23;
                            i28 = i78;
                            z10 = z27;
                            z11 = z26;
                            measureChildWithMargins(childAt9, i10, i24, i11, 0);
                            if (i27 != Integer.MIN_VALUE) {
                                aVar3 = aVar9;
                                ((LinearLayout.LayoutParams) aVar3).width = i27;
                            } else {
                                aVar3 = aVar9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z28) {
                                this.f8709g = ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + this.f8709g;
                            } else {
                                int i79 = this.f8709g;
                                this.f8709g = Math.max(i79, i79 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                            }
                            if (z10) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f11 = 0.0f;
                        }
                        i23 = Integer.MIN_VALUE;
                        if (f19 == f11) {
                            i24 = this.f8709g;
                        } else {
                            i24 = 0;
                        }
                        i25 = i73;
                        i26 = i74;
                        i27 = i23;
                        i28 = i78;
                        z10 = z27;
                        z11 = z26;
                        measureChildWithMargins(childAt9, i10, i24, i11, 0);
                        if (i27 != Integer.MIN_VALUE) {
                            aVar3 = aVar9;
                            ((LinearLayout.LayoutParams) aVar3).width = i27;
                        } else {
                            aVar3 = aVar9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z28) {
                            this.f8709g = ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + this.f8709g;
                        } else {
                            int i710 = this.f8709g;
                            this.f8709g = Math.max(i710, i710 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                        }
                        if (z10) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z12 = z30;
                    i29 = 1073741824;
                    if (mode4 == i29) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    i30 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i30;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i72, childAt9.getMeasuredState());
                    if (!z11) {
                    }
                    int iMax12 = Math.max(i26, measuredHeight);
                    if (z29) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (z13) {
                            measuredHeight = i30;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i25;
                    } else {
                        if (z13) {
                            measuredHeight = i30;
                        }
                        iMax8 = Math.max(i25, measuredHeight);
                    }
                    i70 = iMax12;
                    i72 = iCombineMeasuredStates4;
                    z30 = z12;
                    z29 = z14;
                    f17 = f19;
                }
            }
            i71 = i28 + 1;
            z27 = z10;
            z26 = z11;
        }
        int i80 = i70;
        boolean z32 = z27;
        boolean z33 = z26;
        if (this.f8709g > 0 && k(virtualChildCount2)) {
            this.f8709g += this.f8714m;
        }
        int i81 = iArr[1];
        if (i81 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                iMax = i80;
            }
            if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f8709g = 0;
                for (i22 = 0; i22 < virtualChildCount2; i22++) {
                    childAt3 = getChildAt(i22);
                    if (childAt3 == null) {
                        this.f8709g = this.f8709g;
                    } else if (childAt3.getVisibility() == 8) {
                        aVar2 = (a) childAt3.getLayoutParams();
                        if (z28) {
                            this.f8709g = ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) aVar2).rightMargin + this.f8709g;
                        } else {
                            int i82 = this.f8709g;
                            this.f8709g = Math.max(i82, i82 + iMax9 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f8709g;
            this.f8709g = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
            i12 = (16777215 & iResolveSizeAndState2) - this.f8709g;
            if (!z30 || (i12 != 0 && f17 > 0.0f)) {
                f10 = this.f8710h;
                if (f10 > 0.0f) {
                    f17 = f10;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f8709g = 0;
                int iCombineMeasuredStates5 = i72;
                iMax = -1;
                i13 = 0;
                while (i13 < virtualChildCount2) {
                    childAt = getChildAt(i13);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i17 = i12;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        a aVar10 = (a) childAt.getLayoutParams();
                        float f20 = ((LinearLayout.LayoutParams) aVar10).weight;
                        if (f20 > 0.0f) {
                            int i83 = (int) ((i12 * f20) / f17);
                            float f21 = f17 - f20;
                            int i84 = i12 - i83;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin, ((LinearLayout.LayoutParams) aVar10).height);
                            if (((LinearLayout.LayoutParams) aVar10).width == 0) {
                                i20 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i83 <= 0) {
                                        i83 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i83, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f17 = f21;
                                i18 = i84;
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i83;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i20), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f17 = f21;
                            i18 = i84;
                        } else {
                            i18 = i12;
                        }
                        if (z28) {
                            this.f8709g = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + this.f8709g;
                        } else {
                            int i85 = this.f8709g;
                            this.f8709g = Math.max(i85, childAt.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin);
                        }
                        boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) aVar10).height == -1;
                        int i86 = ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i86;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z34) {
                            i86 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i86);
                        if (z29) {
                            i19 = -1;
                            boolean z35 = ((LinearLayout.LayoutParams) aVar10).height == -1;
                            if (!z33 && (baseline = childAt.getBaseline()) != i19) {
                                int i87 = ((LinearLayout.LayoutParams) aVar10).gravity;
                                if (i87 < 0) {
                                    i87 = this.f8708f;
                                }
                                int i88 = (((i87 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) >> 4) & (-2)) >> 1;
                                iArr[i88] = Math.max(iArr[i88], baseline);
                                iArr2[i88] = Math.max(iArr2[i88], measuredHeight4 - baseline);
                            }
                            z29 = z35;
                            i17 = i18;
                            f17 = f17;
                        } else {
                            i19 = -1;
                        }
                        if (!z33) {
                        }
                        z29 = z35;
                        i17 = i18;
                        f17 = f17;
                    }
                    i13++;
                    i12 = i17;
                    virtualChildCount2 = virtualChildCount2;
                }
                i14 = virtualChildCount2;
                this.f8709g = getPaddingRight() + getPaddingLeft() + this.f8709g;
                i15 = iArr[1];
                if (i15 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c11 = 3;
                    if (iArr[3] == -1) {
                        i16 = 0;
                    }
                    i72 = iCombineMeasuredStates5;
                } else {
                    c11 = 3;
                }
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
                i72 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z32 && mode3 != 1073741824) {
                    for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                        View childAt10 = getChildAt(i89);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i14 = virtualChildCount2;
                i16 = 0;
            }
            if (z29 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i72 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i11, i72 << 16));
            if (z31) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i21 = i14;
                while (i16 < i21) {
                    childAt2 = getChildAt(i16);
                    if (childAt2.getVisibility() != 8) {
                        aVar = (a) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar).height == -1) {
                            int i90 = ((LinearLayout.LayoutParams) aVar).width;
                            ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) aVar).width = i90;
                        }
                    }
                    i16++;
                }
            }
        }
        c10 = 3;
        iMax = Math.max(i80, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i81, iArr[2]))));
        if (z32) {
            this.f8709g = 0;
            while (i22 < virtualChildCount2) {
                childAt3 = getChildAt(i22);
                if (childAt3 == null) {
                    this.f8709g = this.f8709g;
                } else if (childAt3.getVisibility() == 8) {
                    aVar2 = (a) childAt3.getLayoutParams();
                    if (z28) {
                        this.f8709g = ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) aVar2).rightMargin + this.f8709g;
                    } else {
                        int i810 = this.f8709g;
                        this.f8709g = Math.max(i810, i810 + iMax9 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f8709g;
        this.f8709g = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
        i12 = (16777215 & iResolveSizeAndState3) - this.f8709g;
        if (z30) {
            f10 = this.f8710h;
            if (f10 > 0.0f) {
                f17 = f10;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f8709g = 0;
            int iCombineMeasuredStates6 = i72;
            iMax = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                }
                i13++;
                i12 = i17;
                virtualChildCount2 = virtualChildCount2;
            }
            i14 = virtualChildCount2;
            this.f8709g = getPaddingRight() + getPaddingLeft() + this.f8709g;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            i72 = iCombineMeasuredStates6;
        } else {
            f10 = this.f8710h;
            if (f10 > 0.0f) {
                f17 = f10;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f8709g = 0;
            int iCombineMeasuredStates7 = i72;
            iMax = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                }
                i13++;
                i12 = i17;
                virtualChildCount2 = virtualChildCount2;
            }
            i14 = virtualChildCount2;
            this.f8709g = getPaddingRight() + getPaddingLeft() + this.f8709g;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            i72 = iCombineMeasuredStates7;
        }
        if (z29) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i72 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i11, i72 << 16));
        if (z31) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i21 = i14;
            while (i16 < i21) {
                childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    aVar = (a) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) aVar).width;
                        ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) aVar).width = i91;
                    }
                }
                i16++;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f8704b = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f8705c = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8713l) {
            return;
        }
        this.f8713l = drawable;
        if (drawable != null) {
            this.f8714m = drawable.getIntrinsicWidth();
            this.f8715n = drawable.getIntrinsicHeight();
        } else {
            this.f8714m = 0;
            this.f8715n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f8717p = i10;
    }

    public void setGravity(int i10) {
        if (this.f8708f != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.f8708f = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f8708f;
        if ((8388615 & i12) != i11) {
            this.f8708f = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f8711i = z10;
    }

    public void setOrientation(int i10) {
        if (this.f8707e != i10) {
            this.f8707e = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f8716o) {
            requestLayout();
        }
        this.f8716o = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = this.f8708f;
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i11) {
            this.f8708f = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f8710h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public H(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8704b = true;
        this.f8705c = -1;
        this.f8706d = 0;
        this.f8708f = 8388659;
        int[] iArr = p088h.a.f35702o;
        c0 c0VarF = c0.f(context, attributeSet, iArr, i10, 0);
        androidx.core.view.O.m(this, context, iArr, attributeSet, c0VarF.f8929b, i10);
        TypedArray typedArray = c0VarF.f8929b;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f8710h = typedArray.getFloat(4, -1.0f);
        this.f8705c = typedArray.getInt(3, -1);
        this.f8711i = typedArray.getBoolean(7, false);
        setDividerDrawable(c0VarF.b(5));
        this.f8716o = typedArray.getInt(8, 0);
        this.f8717p = typedArray.getDimensionPixelSize(6, 0);
        c0VarF.g();
    }
}
