package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.RunnableC1240q;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p114j1.A;

/* JADX INFO: compiled from: DefaultTimeBar.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends View implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f18878A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f18879B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f18880C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f18881D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Rect f18882E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ValueAnimator f18883F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f18884G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f18885H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f18886I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f18887J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f18888K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f18889L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f18890M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f18891N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long[] f18892O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean[] f18893P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f18894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f18895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f18896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f18897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f18898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f18899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f18900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f18901i;
    public final Paint j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f18902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f18903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18904m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18905n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18906o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18907p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18908q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18909r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18911t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StringBuilder f18913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Formatter f18914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RunnableC1240q f18915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet<f.a> f18916y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Point f18917z;

    public b(Context context) {
        super(context, null, 0);
        this.f18894b = new Rect();
        this.f18895c = new Rect();
        this.f18896d = new Rect();
        this.f18897e = new Rect();
        Paint paint = new Paint();
        this.f18898f = paint;
        Paint paint2 = new Paint();
        this.f18899g = paint2;
        Paint paint3 = new Paint();
        this.f18900h = paint3;
        Paint paint4 = new Paint();
        this.f18901i = paint4;
        Paint paint5 = new Paint();
        this.j = paint5;
        Paint paint6 = new Paint();
        this.f18902k = paint6;
        paint6.setAntiAlias(true);
        this.f18916y = new CopyOnWriteArraySet<>();
        this.f18917z = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f18878A = f10;
        this.f18912u = c(f10, -50);
        int iC = c(f10, 4);
        int iC2 = c(f10, 26);
        int iC3 = c(f10, 4);
        int iC4 = c(f10, 12);
        int iC5 = c(f10, 0);
        int iC6 = c(f10, 16);
        this.f18904m = iC;
        this.f18905n = iC2;
        this.f18906o = 0;
        this.f18907p = iC3;
        this.f18908q = iC4;
        this.f18909r = iC5;
        this.f18910s = iC6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f18903l = null;
        StringBuilder sb2 = new StringBuilder();
        this.f18913v = sb2;
        this.f18914w = new Formatter(sb2, Locale.getDefault());
        this.f18915x = new RunnableC1240q(4, this);
        this.f18911t = (Math.max(iC5, Math.max(iC4, iC6)) + 1) / 2;
        this.f18884G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f18883F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k2.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                androidx.media3.ui.b bVar = this.f41482b;
                bVar.getClass();
                bVar.f18884G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                bVar.invalidate(bVar.f18894b);
            }
        });
        this.f18888K = -9223372036854775807L;
        this.f18880C = -9223372036854775807L;
        this.f18879B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f18880C;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j10 = this.f18888K;
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10 / ((long) this.f18879B);
    }

    private String getProgressText() {
        return A.u(this.f18913v, this.f18914w, this.f18889L);
    }

    private long getScrubberPosition() {
        Rect rect = this.f18895c;
        if (rect.width() <= 0 || this.f18888K == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f18897e.width()) * this.f18888K) / ((long) rect.width());
    }

    @Override // androidx.media3.ui.f
    public final void a(long[] jArr, boolean[] zArr, int i10) {
        p241t7.b.e(i10 == 0 || !(jArr == null || zArr == null));
        this.f18891N = i10;
        this.f18892O = jArr;
        this.f18893P = zArr;
        g();
    }

    @Override // androidx.media3.ui.f
    public final void b(c.b bVar) {
        this.f18916y.add(bVar);
    }

    public final boolean d(long j) {
        long j10 = this.f18888K;
        if (j10 <= 0) {
            return false;
        }
        long j11 = this.f18886I ? this.f18887J : this.f18889L;
        long jH = A.h(j11 + j, 0L, j10);
        if (jH == j11) {
            return false;
        }
        if (this.f18886I) {
            h(jH);
        } else {
            e(jH);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f18903l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j) {
        this.f18887J = j;
        this.f18886I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<f.a> it = this.f18916y.iterator();
        while (it.hasNext()) {
            it.next().s(j);
        }
    }

    public final void f(boolean z10) {
        removeCallbacks(this.f18915x);
        this.f18886I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<f.a> it = this.f18916y.iterator();
        while (it.hasNext()) {
            it.next().H(this.f18887J, z10);
        }
    }

    public final void g() {
        Rect rect = this.f18896d;
        Rect rect2 = this.f18895c;
        rect.set(rect2);
        Rect rect3 = this.f18897e;
        rect3.set(rect2);
        long j = this.f18886I ? this.f18887J : this.f18889L;
        if (this.f18888K > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f18890M) / this.f18888K)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j) / this.f18888K)), rect2.right);
        } else {
            int i10 = rect2.left;
            rect.right = i10;
            rect3.right = i10;
        }
        invalidate(this.f18894b);
    }

    @Override // androidx.media3.ui.f
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f18895c.width() / this.f18878A);
        if (iWidth != 0) {
            long j = this.f18888K;
            if (j != 0 && j != -9223372036854775807L) {
                return j / ((long) iWidth);
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(long j) {
        if (this.f18887J == j) {
            return;
        }
        this.f18887J = j;
        Iterator<f.a> it = this.f18916y.iterator();
        while (it.hasNext()) {
            it.next().k(j);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18903l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        canvas.save();
        Rect rect = this.f18895c;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i11 = iCenterY + iHeight;
        long j = this.f18888K;
        Paint paint = this.f18900h;
        Rect rect2 = this.f18897e;
        if (j <= 0) {
            canvas.drawRect(rect.left, iCenterY, rect.right, i11, paint);
        } else {
            Rect rect3 = this.f18896d;
            int i12 = rect3.left;
            int i13 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i13), rect2.right);
            int i14 = rect.right;
            if (iMax < i14) {
                canvas.drawRect(iMax, iCenterY, i14, i11, paint);
            }
            int iMax2 = Math.max(i12, rect2.right);
            if (i13 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i13, i11, this.f18899g);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i11, this.f18898f);
            }
            if (this.f18891N != 0) {
                long[] jArr = this.f18892O;
                jArr.getClass();
                boolean[] zArr = this.f18893P;
                zArr.getClass();
                int i15 = this.f18907p;
                int i16 = i15 / 2;
                int i17 = 0;
                int i18 = 0;
                while (i18 < this.f18891N) {
                    int iMin = Math.min(rect.width() - i15, Math.max(i17, ((int) ((((long) rect.width()) * A.h(jArr[i18], 0L, this.f18888K)) / this.f18888K)) - i16)) + rect.left;
                    canvas.drawRect(iMin, iCenterY, iMin + i15, i11, zArr[i18] ? this.j : this.f18901i);
                    i18++;
                    i17 = i17;
                    i15 = i15;
                }
            }
        }
        if (this.f18888K > 0) {
            int iG = A.g(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f18903l;
            if (drawable == null) {
                if (this.f18886I || isFocused()) {
                    i10 = this.f18910s;
                } else {
                    i10 = isEnabled() ? this.f18908q : this.f18909r;
                }
                canvas.drawCircle(iG, iCenterY2, (int) ((i10 * this.f18884G) / 2.0f), this.f18902k);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f18884G)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f18884G)) / 2;
                drawable.setBounds(iG - intrinsicWidth, iCenterY2 - intrinsicHeight, iG + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f18886I || z10) {
            return;
        }
        f(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f18888K <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i10 != 66) {
                switch (i10) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (d(positionIncrement)) {
                            RunnableC1240q runnableC1240q = this.f18915x;
                            removeCallbacks(runnableC1240q);
                            postDelayed(runnableC1240q, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                            RunnableC1240q runnableC1240q2 = this.f18915x;
                            removeCallbacks(runnableC1240q2);
                            postDelayed(runnableC1240q2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f18886I) {
                            f(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f18886I) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i14 - getPaddingRight();
        int i16 = this.f18885H ? 0 : this.f18911t;
        int i17 = this.f18906o;
        int i18 = this.f18904m;
        int i19 = this.f18905n;
        if (i17 == 1) {
            paddingBottom = (i15 - getPaddingBottom()) - i19;
            paddingBottom2 = ((i15 - getPaddingBottom()) - i18) - Math.max(i16 - (i18 / 2), 0);
        } else {
            paddingBottom = (i15 - i19) / 2;
            paddingBottom2 = (i15 - i18) / 2;
        }
        Rect rect2 = this.f18894b;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i19 + paddingBottom);
        this.f18895c.set(rect2.left + i16, paddingBottom2, rect2.right - i16, i18 + paddingBottom2);
        if (A.f40996a >= 29 && ((rect = this.f18882E) == null || rect.width() != i14 || this.f18882E.height() != i15)) {
            Rect rect3 = new Rect(0, 0, i14, i15);
            this.f18882E = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int i12 = this.f18905n;
        if (mode == 0) {
            size = i12;
        } else if (mode != 1073741824) {
            size = Math.min(i12, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        Drawable drawable = this.f18903l;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f18903l;
        if (drawable == null || A.f40996a < 23 || !drawable.setLayoutDirection(i10)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f18888K > 0) {
            Point point = this.f18917z;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i10 = point.x;
            int i11 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f18897e;
            Rect rect2 = this.f18895c;
            if (action == 0) {
                int i12 = i10;
                if (this.f18894b.contains(i12, i11)) {
                    rect.right = A.g(i12, rect2.left, rect2.right);
                    e(getScrubberPosition());
                    g();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f18886I) {
                    f(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f18886I) {
                        f(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f18886I) {
                if (i11 < this.f18912u) {
                    int i13 = this.f18881D;
                    rect.right = A.g(((i10 - i13) / 3) + i13, rect2.left, rect2.right);
                } else {
                    this.f18881D = i10;
                    rect.right = A.g(i10, rect2.left, rect2.right);
                }
                h(getScrubberPosition());
                g();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f18888K <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else {
            if (i10 != 4096) {
                return false;
            }
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f18901i.setColor(i10);
        invalidate(this.f18894b);
    }

    public void setBufferedColor(int i10) {
        this.f18899g.setColor(i10);
        invalidate(this.f18894b);
    }

    @Override // androidx.media3.ui.f
    public void setBufferedPosition(long j) {
        if (this.f18890M == j) {
            return;
        }
        this.f18890M = j;
        g();
    }

    @Override // androidx.media3.ui.f
    public void setDuration(long j) {
        if (this.f18888K == j) {
            return;
        }
        this.f18888K = j;
        if (this.f18886I && j == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, androidx.media3.ui.f
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!this.f18886I || z10) {
            return;
        }
        f(true);
    }

    public void setKeyCountIncrement(int i10) {
        p241t7.b.e(i10 > 0);
        this.f18879B = i10;
        this.f18880C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        p241t7.b.e(j > 0);
        this.f18879B = -1;
        this.f18880C = j;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.j.setColor(i10);
        invalidate(this.f18894b);
    }

    public void setPlayedColor(int i10) {
        this.f18898f.setColor(i10);
        invalidate(this.f18894b);
    }

    @Override // androidx.media3.ui.f
    public void setPosition(long j) {
        if (this.f18889L == j) {
            return;
        }
        this.f18889L = j;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i10) {
        this.f18902k.setColor(i10);
        invalidate(this.f18894b);
    }

    public void setUnplayedColor(int i10) {
        this.f18900h.setColor(i10);
        invalidate(this.f18894b);
    }
}
