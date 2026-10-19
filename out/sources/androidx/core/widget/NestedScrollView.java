package androidx.core.widget;

import B0.s;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C1286a;
import androidx.core.view.C1294i;
import androidx.core.view.C1305u;
import androidx.core.view.C1308x;
import androidx.core.view.I;
import androidx.core.view.InterfaceC1304t;
import androidx.core.view.InterfaceC1307w;
import androidx.core.view.J;
import androidx.core.view.O;
import androidx.core.view.T;
import androidx.core.view.Z;
import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p005a4.q;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1307w, InterfaceC1304t {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final float f16999C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final a f17000D = new a();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f17001E = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f17002A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1294i f17003B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f17006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OverScroller f17007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f17008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EdgeEffect f17009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17011i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f17012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f17014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f17017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f17018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f17021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f17022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f17025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1308x f17026y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1305u f17027z;

    public static class a extends C1286a {
        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            sVar.i(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            sVar.n(true);
            if (nestedScrollView.getScrollY() > 0) {
                sVar.b(s.a.f1420l);
                sVar.b(s.a.f1424p);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                sVar.b(s.a.f1419k);
                sVar.b(s.a.f1426r);
            }
        }

        @Override // androidx.core.view.C1286a
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c {
        public c() {
        }
    }

    public interface d {
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17029b;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e(parcel);
                eVar.f17029b = parcel.readInt();
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return q.c(sb2, this.f17029b, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f17029b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.nestedScrollViewStyle);
        this.f17006d = new Rect();
        this.f17011i = true;
        this.j = false;
        this.f17012k = null;
        this.f17013l = false;
        this.f17016o = true;
        this.f17020s = -1;
        this.f17021t = new int[2];
        this.f17022u = new int[2];
        this.f17003B = new C1294i(getContext(), new c());
        int i10 = Build.VERSION.SDK_INT;
        this.f17008f = i10 >= 31 ? H0.d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f17009g = i10 >= 31 ? H0.d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f17004b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f17007e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f17017p = viewConfiguration.getScaledTouchSlop();
        this.f17018q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17019r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17001E, com.voltasit.obdeleven.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f17026y = new C1308x();
        this.f17027z = new C1305u(this);
        setNestedScrollingEnabled(true);
        O.n(this, f17000D);
    }

    public static boolean f(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && f((View) parent, nestedScrollView);
    }

    public final boolean a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !g(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f17006d;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(b(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !g(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final boolean c(KeyEvent keyEvent) {
        this.f17006d.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? e(33) : a(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? e(130) : a(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return e(33);
                }
                if (keyCode == 93) {
                    return e(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f17007e.isFinished()) {
            return;
        }
        this.f17007e.computeScrollOffset();
        int currY = this.f17007e.getCurrY();
        int i11 = currY - this.f17024w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f17009g;
        EdgeEffect edgeEffect2 = this.f17008f;
        if (i11 <= 0 || H0.d.a(edgeEffect2) == 0.0f) {
            if (i11 < 0 && H0.d.a(edgeEffect) != 0.0f) {
                float f10 = height;
                iRound = Math.round(H0.d.b(edgeEffect, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect.finish();
                }
            }
            this.f17024w = currY;
            iArr = this.f17022u;
            iArr[1] = 0;
            this.f17027z.c(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.f17027z.d(0, scrollY2, 0, i12, this.f17021t, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f17007e.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f17007e.getCurrVelocity());
                    }
                }
                this.f17007e.abortAnimation();
                w(1);
            }
            if (this.f17007e.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(H0.d.b(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect2.finish();
        }
        i11 -= iRound;
        this.f17024w = currY;
        iArr = this.f17022u;
        iArr[1] = 0;
        this.f17027z.c(0, i11, 1, iArr, null);
        i10 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            p(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i10 - scrollY4;
            iArr[1] = 0;
            this.f17027z.d(0, scrollY4, 0, i13, this.f17021t, 1, iArr);
            i10 = i13 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f17007e.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f17007e.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f17007e.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f17007e.getCurrVelocity());
            }
            this.f17007e.abortAnimation();
            w(1);
        }
        if (this.f17007e.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final void d(int i10) {
        if (getChildCount() > 0) {
            this.f17007e.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, BrazeLogger.SUPPRESS, 0, 0);
            this.f17027z.g(2, 1);
            this.f17024w = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f17027z.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f17027z.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f17027z.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f17027z.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f17008f;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f17009g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f17006d;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean g(View view, int i10, int i11) {
        Rect rect = this.f17006d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1308x c1308x = this.f17026y;
        return c1308x.f16998b | c1308x.f16997a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f17002A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f17002A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f17002A;
    }

    public final void h(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f17027z.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f17027z.f(0);
    }

    public final void i(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17020s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f17010h = (int) motionEvent.getY(i10);
            this.f17020s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f17014m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f17027z.f16991d;
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void j(int i10, View view) {
        C1308x c1308x = this.f17026y;
        if (i10 == 1) {
            c1308x.f16998b = 0;
        } else {
            c1308x.f16997a = 0;
        }
        w(i10);
    }

    @Override // androidx.core.view.InterfaceC1307w
    public final void k(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        h(i13, i14, iArr);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void l(View view, int i10, int i11, int i12, int i13, int i14) {
        h(i13, i14, null);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final boolean m(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void n(View view, View view2, int i10, int i11) {
        C1308x c1308x = this.f17026y;
        if (i11 == 1) {
            c1308x.f16998b = i10;
        } else {
            c1308x.f16997a = i10;
        }
        this.f17027z.g(2, i11);
    }

    @Override // androidx.core.view.InterfaceC1306v
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        this.f17027z.c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = false;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0106 A[PHI: r5
      0x0106: PHI (r5v18 int) = (r5v16 int), (r5v16 int), (r5v16 int), (r5v17 int) binds: [B:68:0x0104, B:78:0x0121, B:80:0x0127, B:82:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:83:0x012c  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i10;
        int width;
        char c10;
        int iB;
        int scaledMinimumFlingVelocity;
        int deviceId;
        int source;
        InputDevice device;
        boolean z10;
        int i11;
        int identifier;
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        char c11;
        boolean z11;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f10;
        long j;
        float fSqrt;
        int i12;
        int i13;
        if (motionEvent.getAction() != 8 || this.f17013l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i10 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i10 = 26;
        } else {
            axisValue = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        s(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 == 0) {
            return true;
        }
        C1294i c1294i = this.f17003B;
        c1294i.getClass();
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        int i14 = c1294i.f16938f;
        int[] iArr = c1294i.f16940h;
        if (i14 == source2 && c1294i.f16939g == deviceId2 && c1294i.f16937e == i10) {
            c11 = 0;
            z11 = false;
        } else {
            Context context = c1294i.f16933a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 34) {
                iB = T.b(viewConfiguration, deviceId3, i10, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                    c10 = 0;
                    iB = BrazeLogger.SUPPRESS;
                } else {
                    Resources resources = context.getResources();
                    int identifier2 = (source3 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = BrazeLogger.SUPPRESS;
                        }
                    } else {
                        iB = BrazeLogger.SUPPRESS;
                    }
                    iB = scaledMinimumFlingVelocity;
                }
                iArr[c10] = iB;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (i15 >= 34) {
                    scaledMaximumFlingVelocity = T.a(viewConfiguration, deviceId, i10, source);
                } else {
                    device = InputDevice.getDevice(deviceId);
                    if (device != null || device.getMotionRange(i10, source) == null) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    i11 = Integer.MIN_VALUE;
                    if (z10) {
                        Resources resources2 = context.getResources();
                        if (source == 4194304 || i10 != 26) {
                            identifier = -1;
                        } else {
                            identifier = resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier != -1) {
                            if (identifier != 0 && (dimensionPixelSize = resources2.getDimensionPixelSize(identifier)) >= 0) {
                                i11 = dimensionPixelSize;
                            }
                            scaledMaximumFlingVelocity = i11;
                        } else {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        }
                    } else {
                        scaledMaximumFlingVelocity = i11;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c1294i.f16938f = source2;
                c1294i.f16939g = deviceId2;
                c1294i.f16937e = i10;
                c11 = 0;
                z11 = true;
            }
            c10 = 0;
            iArr[c10] = iB;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (i15 >= 34) {
                scaledMaximumFlingVelocity = T.a(viewConfiguration, deviceId, i10, source);
            } else {
                device = InputDevice.getDevice(deviceId);
                if (device != null) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                i11 = Integer.MIN_VALUE;
                if (z10) {
                    scaledMaximumFlingVelocity = i11;
                } else {
                    Resources resources3 = context.getResources();
                    if (source == 4194304) {
                        identifier = -1;
                    } else {
                        identifier = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier != -1) {
                        if (identifier != 0) {
                            i11 = dimensionPixelSize;
                        }
                        scaledMaximumFlingVelocity = i11;
                    } else {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c1294i.f16938f = source2;
            c1294i.f16939g = deviceId2;
            c1294i.f16937e = i10;
            c11 = 0;
            z11 = true;
        }
        if (iArr[c11] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c1294i.f16935c;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                c1294i.f16935c = null;
            }
        } else {
            if (c1294i.f16935c == null) {
                c1294i.f16935c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker3 = c1294i.f16935c;
            Map<VelocityTracker, J> map = I.f16853a;
            velocityTracker3.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map<VelocityTracker, J> map2 = I.f16853a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new J());
                }
                J j10 = map2.get(velocityTracker3);
                j10.getClass();
                long eventTime = motionEvent.getEventTime();
                int i16 = j10.f16857d;
                long[] jArr = j10.f16855b;
                if (i16 != 0 && eventTime - jArr[j10.f16858e] > 40) {
                    j10.f16857d = 0;
                    j10.f16856c = 0.0f;
                }
                int i17 = (j10.f16858e + 1) % 20;
                j10.f16858e = i17;
                int i18 = j10.f16857d;
                if (i18 != 20) {
                    j10.f16857d = i18 + 1;
                }
                j10.f16854a[i17] = motionEvent.getAxisValue(26);
                jArr[j10.f16858e] = eventTime;
            }
            velocityTracker3.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, Float.MAX_VALUE);
            J j11 = I.f16853a.get(velocityTracker3);
            if (j11 != null) {
                int i19 = j11.f16857d;
                if (i19 < 2) {
                    velocityTracker = velocityTracker3;
                    i12 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i20 = j11.f16858e;
                    int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                    long[] jArr2 = j11.f16855b;
                    long j12 = jArr2[i20];
                    while (true) {
                        j = jArr2[i21];
                        if (j12 - j <= 100) {
                            break;
                        }
                        j11.f16857d--;
                        i21 = (i21 + 1) % 20;
                    }
                    int i22 = j11.f16857d;
                    if (i22 < 2) {
                        velocityTracker = velocityTracker3;
                        i12 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = j11.f16854a;
                        if (i22 == 2) {
                            int i23 = (i21 + 1) % 20;
                            long j13 = jArr2[i23];
                            if (j == j13) {
                                velocityTracker = velocityTracker3;
                                i12 = 1000;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                i12 = 1000;
                                fSqrt = fArr[i23] / (j13 - j);
                            }
                        } else {
                            float f11 = 0.0f;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i24 >= j11.f16857d - 1) {
                                    break;
                                }
                                int i26 = i24 + i21;
                                long j14 = jArr2[i26 % 20];
                                int i27 = (i26 + 1) % 20;
                                if (jArr2[i27] == j14) {
                                    i13 = 1;
                                } else {
                                    i25++;
                                    float fSqrt2 = (f11 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f11) * 2.0f));
                                    float f12 = fArr[i27] / (jArr2[i27] - j14);
                                    float fAbs = (Math.abs(f12) * (f12 - fSqrt2)) + f11;
                                    i13 = 1;
                                    if (i25 == 1) {
                                        fAbs *= 0.5f;
                                    }
                                    f11 = fAbs;
                                }
                                i24 += i13;
                                fArr = fArr;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            fSqrt = ((float) Math.sqrt(Math.abs(f11) * 2.0f)) * (f11 < 0.0f ? -1.0f : 1.0f);
                            i12 = Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                        }
                    }
                }
                float f13 = fSqrt * i12;
                j11.f16856c = f13;
                if (f13 < (-Math.abs(Float.MAX_VALUE))) {
                    j11.f16856c = -Math.abs(Float.MAX_VALUE);
                } else if (j11.f16856c > Math.abs(Float.MAX_VALUE)) {
                    j11.f16856c = Math.abs(Float.MAX_VALUE);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = I.a.a(velocityTracker, i10);
            } else {
                VelocityTracker velocityTracker4 = velocityTracker;
                if (i10 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i10 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    J j15 = I.f16853a.get(velocityTracker4);
                    yVelocity = (j15 == null || i10 != 26) ? 0.0f : j15.f16856c;
                }
            }
            NestedScrollView nestedScrollView = NestedScrollView.this;
            float f14 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f14);
            if (z11 || (fSignum != Math.signum(c1294i.f16936d) && fSignum != 0.0f)) {
                nestedScrollView.f17007e.abortAnimation();
            }
            if (Math.abs(f14) >= iArr[0]) {
                int i28 = iArr[1];
                float fMax = Math.max(-i28, Math.min(f14, i28));
                if (fMax == 0.0f) {
                    f10 = 0.0f;
                } else {
                    nestedScrollView.f17007e.abortAnimation();
                    nestedScrollView.d((int) fMax);
                    f10 = fMax;
                }
                c1294i.f16936d = f10;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f17013l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f17007e.isFinished()) {
                        z10 = false;
                    }
                    this.f17013l = z10;
                    velocityTracker = this.f17014m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f17014m = null;
                    }
                } else {
                    this.f17010h = y10;
                    this.f17020s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f17014m;
                    if (velocityTracker3 == null) {
                        this.f17014m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f17014m.addMovement(motionEvent);
                    this.f17007e.computeScrollOffset();
                    if (!v(motionEvent) && this.f17007e.isFinished()) {
                        z10 = false;
                    }
                    this.f17013l = z10;
                    this.f17027z.g(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z10 = false;
                }
                this.f17013l = z10;
                velocityTracker = this.f17014m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f17014m = null;
                }
            }
        } else if (i10 == 1) {
            this.f17013l = false;
            this.f17020s = -1;
            velocityTracker2 = this.f17014m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f17014m = null;
            }
            if (this.f17007e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 2) {
            int i11 = this.f17020s;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f17010h) > this.f17017p && (2 & getNestedScrollAxes()) == 0) {
                        this.f17013l = true;
                        this.f17010h = y11;
                        if (this.f17014m == null) {
                            this.f17014m = VelocityTracker.obtain();
                        }
                        this.f17014m.addMovement(motionEvent);
                        this.f17023v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.f17013l = false;
            this.f17020s = -1;
            velocityTracker2 = this.f17014m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f17014m = null;
            }
            if (this.f17007e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i10 == 6) {
            i(motionEvent);
        }
        return this.f17013l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f17011i = false;
        View view = this.f17012k;
        if (view != null && f(view, this)) {
            View view2 = this.f17012k;
            Rect rect = this.f17006d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.f17012k = null;
        if (!this.j) {
            if (this.f17025x != null) {
                scrollTo(getScrollX(), this.f17025x.f17029b);
                this.f17025x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f17015n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        d((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f17027z.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f17027z.c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        h(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        n(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && g(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f17025x = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f17029b = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !g(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f17006d;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.f17016o) {
                u(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return m(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        j(0, view);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f17014m == null) {
            this.f17014m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17023v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f17023v);
        C1305u c1305u = this.f17027z;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f17009g;
            EdgeEffect edgeEffect2 = this.f17008f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f17014m;
                velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, this.f17019r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f17020s);
                if (Math.abs(yVelocity) >= this.f17018q) {
                    if (H0.d.a(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            d(-yVelocity);
                        }
                    } else if (H0.d.a(edgeEffect) != 0.0f) {
                        int i10 = -yVelocity;
                        if (t(edgeEffect, i10)) {
                            edgeEffect.onAbsorb(i10);
                        } else {
                            d(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!c1305u.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            d(i11);
                        }
                    }
                } else if (this.f17007e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f17020s = -1;
                this.f17013l = false;
                VelocityTracker velocityTracker2 = this.f17014m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f17014m = null;
                }
                w(0);
                this.f17008f.onRelease();
                this.f17009g.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f17020s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f17020s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f17010h - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (H0.d.a(edgeEffect2) != 0.0f) {
                        float f12 = -H0.d.b(edgeEffect2, -height, x10);
                        if (H0.d.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f10 = f12;
                    } else if (H0.d.a(edgeEffect) != 0.0f) {
                        float fB = H0.d.b(edgeEffect, height, 1.0f - x10);
                        if (H0.d.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f10 = fB;
                    }
                    int iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i13 = i12 - iRound;
                    if (!this.f17013l && Math.abs(i13) > this.f17017p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f17013l = true;
                        i13 = i13 > 0 ? i13 - this.f17017p : i13 + this.f17017p;
                    }
                    if (this.f17013l) {
                        int iS = s(i13, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f17010h = y10 - iS;
                        this.f17023v += iS;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f17013l && getChildCount() > 0 && this.f17007e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f17020s = -1;
                this.f17013l = false;
                VelocityTracker velocityTracker3 = this.f17014m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f17014m = null;
                }
                w(0);
                this.f17008f.onRelease();
                this.f17009g.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f17010h = (int) motionEvent.getY(actionIndex);
                this.f17020s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                i(motionEvent);
                this.f17010h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f17020s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f17013l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f17007e.isFinished()) {
                this.f17007e.abortAnimation();
                w(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f17010h = y11;
            this.f17020s = pointerId;
            c1305u.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f17014m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            z10 = false;
        } else {
            i11 = 0;
            z10 = true;
        }
        if (i14 > i13) {
            z11 = true;
        } else if (i14 < 0) {
            i13 = 0;
            z11 = true;
        } else {
            i13 = i14;
            z11 = false;
        }
        if (z11 && !this.f17027z.f(1)) {
            this.f17007e.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i13);
        return z10 || z11;
    }

    public final void q(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f17006d;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            s(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f17011i) {
            this.f17012k = view2;
        } else {
            Rect rect = this.f17006d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z11 = iB != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iB);
            } else {
                u(0, iB, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f17014m) != null) {
            velocityTracker.recycle();
            this.f17014m = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f17011i = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        VelocityTracker velocityTracker;
        C1305u c1305u = this.f17027z;
        if (i12 == 1) {
            c1305u.g(2, i12);
        }
        boolean zC = this.f17027z.c(0, i10, i12, this.f17022u, this.f17021t);
        int[] iArr = this.f17022u;
        int[] iArr2 = this.f17021t;
        if (zC) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z12 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z13 = p(i13, 0, scrollY, scrollRange) && !c1305u.f(i12);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f17027z.d(0, scrollY2, 0, i13 - scrollY2, this.f17021t, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f17009g;
        EdgeEffect edgeEffect2 = this.f17008f;
        if (i17 < 0) {
            if (z12) {
                H0.d.b(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            H0.d.b(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
            z11 = false;
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f17014m) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f17015n) {
            this.f17015n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1305u c1305u = this.f17027z;
        if (c1305u.f16991d) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            O.d.z(c1305u.f16990c);
        }
        c1305u.f16991d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f17016o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f17027z.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fA = H0.d.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f17004b * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f16999C;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fA;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f17005c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f17007e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, t.d.DEFAULT_SWIPE_ANIMATION_DURATION);
            if (z10) {
                this.f17027z.g(2, 1);
            } else {
                w(1);
            }
            this.f17024w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f17007e.isFinished()) {
                this.f17007e.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f17005c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f17008f;
        if (H0.d.a(edgeEffect) != 0.0f) {
            H0.d.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f17009g;
        if (H0.d.a(edgeEffect2) == 0.0f) {
            return z10;
        }
        H0.d.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i10) {
        this.f17027z.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(d dVar) {
    }
}
