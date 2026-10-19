package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.R;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f8550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f8551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f8552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f8553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f8554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f8555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8556i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8557k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0849b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p088h.a.f35689a);
        boolean z10 = false;
        this.f8553f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f8554g = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f8557k = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f8556i = true;
            this.f8555h = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f8556i ? !(this.f8553f != null || this.f8554g != null) : this.f8555h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8553f;
        if (drawable != null && drawable.isStateful()) {
            this.f8553f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8554g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8554g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8555h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8555h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f8550c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8553f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8554g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8555h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8551d = findViewById(R.id.action_bar);
        this.f8552e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8549b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
      0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        T t8 = this.f8550c;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (t8 == null || t8.getVisibility() == 8) ? false : true;
        if (t8 != null && t8.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t8.getLayoutParams();
            int measuredHeight2 = measuredHeight - t8.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            t8.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f8556i) {
            Drawable drawable2 = this.f8555h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f8553f != null) {
                if (this.f8551d.getVisibility() == 0) {
                    this.f8553f.setBounds(this.f8551d.getLeft(), this.f8551d.getTop(), this.f8551d.getRight(), this.f8551d.getBottom());
                } else {
                    View view = this.f8552e;
                    if (view == null || view.getVisibility() != 0) {
                        this.f8553f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f8553f.setBounds(this.f8552e.getLeft(), this.f8552e.getTop(), this.f8552e.getRight(), this.f8552e.getBottom());
                    }
                }
                z12 = true;
            }
            this.j = z13;
            if (!z13 || (drawable = this.f8554g) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(t8.getLeft(), t8.getTop(), t8.getRight(), t8.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f8551d == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f8557k) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f8551d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        T t8 = this.f8550c;
        if (t8 == null || t8.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.f8551d;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.f8552e;
            iA = (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) ? 0 : a(this.f8552e);
        } else {
            iA = a(this.f8551d);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f8550c) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : BrazeLogger.SUPPRESS));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8553f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8553f);
        }
        this.f8553f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8551d;
            if (view != null) {
                this.f8553f.setBounds(view.getLeft(), this.f8551d.getTop(), this.f8551d.getRight(), this.f8551d.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f8556i ? !(this.f8553f != null || this.f8554g != null) : this.f8555h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8555h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8555h);
        }
        this.f8555h = drawable;
        boolean z10 = this.f8556i;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f8555h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f8553f != null || this.f8554g != null) : this.f8555h == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8554g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8554g);
        }
        this.f8554g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.j && (drawable2 = this.f8554g) != null) {
                drawable2.setBounds(this.f8550c.getLeft(), this.f8550c.getTop(), this.f8550c.getRight(), this.f8550c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f8556i ? !(this.f8553f != null || this.f8554g != null) : this.f8555h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(T t8) {
        T t10 = this.f8550c;
        if (t10 != null) {
            removeView(t10);
        }
        this.f8550c = t8;
        if (t8 != null) {
            addView(t8);
            ViewGroup.LayoutParams layoutParams = t8.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t8.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f8549b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f8553f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f8554g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f8555h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8553f;
        boolean z10 = this.f8556i;
        return (drawable == drawable2 && !z10) || (drawable == this.f8554g && this.j) || ((drawable == this.f8555h && z10) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}
