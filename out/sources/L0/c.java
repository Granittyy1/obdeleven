package L0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.Constants;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f4400x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4402b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f4404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f4405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f4406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f4407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f4408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4409i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f4411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f4412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f4413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4416q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f4417r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractC0064c f4418s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f4419t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4420u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f4421v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4403c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f4422w = new b();

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0064c abstractC0064c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0064c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f4421v = viewGroup;
        this.f4418s = abstractC0064c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4415p = i10;
        this.f4414o = i10;
        this.f4402b = viewConfiguration.getScaledTouchSlop();
        this.f4412m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4413n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4417r = new OverScroller(context, f4400x);
    }

    public final void a() {
        this.f4403c = -1;
        float[] fArr = this.f4404d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4405e, 0.0f);
            Arrays.fill(this.f4406f, 0.0f);
            Arrays.fill(this.f4407g, 0.0f);
            Arrays.fill(this.f4408h, 0);
            Arrays.fill(this.f4409i, 0);
            Arrays.fill(this.j, 0);
            this.f4410k = 0;
        }
        VelocityTracker velocityTracker = this.f4411l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4411l = null;
        }
    }

    public final void b(int i10, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f4421v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f4419t = view;
        this.f4403c = i10;
        this.f4418s.g(i10, view);
        p(1);
    }

    public final boolean c(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f4408h[i10] & i11) != i11 || (this.f4416q & i11) == 0 || (this.j[i10] & i11) == i11 || (this.f4409i[i10] & i11) == i11) {
            return false;
        }
        float f12 = this.f4402b;
        if (fAbs <= f12 && fAbs2 <= f12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f4418s.getClass();
        }
        return (this.f4409i[i10] & i11) == 0 && fAbs > ((float) this.f4402b);
    }

    public final boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        AbstractC0064c abstractC0064c = this.f4418s;
        boolean z10 = abstractC0064c.c(view) > 0;
        boolean z11 = abstractC0064c.d() > 0;
        if (z10 && z11) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i10 = this.f4402b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f4402b);
        }
        return z11 && Math.abs(f11) > ((float) this.f4402b);
    }

    public final void e(int i10) {
        float[] fArr = this.f4404d;
        if (fArr != null) {
            int i11 = this.f4410k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f4405e[i10] = 0.0f;
                this.f4406f[i10] = 0.0f;
                this.f4407g[i10] = 0.0f;
                this.f4408h[i10] = 0;
                this.f4409i[i10] = 0;
                this.j[i10] = 0;
                this.f4410k = (~i12) & i11;
            }
        }
    }

    public final int f(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f4421v.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f4401a == 2) {
            OverScroller overScroller = this.f4417r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f4419t.getLeft();
            int top = currY - this.f4419t.getTop();
            if (left != 0) {
                View view = this.f4419t;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f4419t;
                WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f4418s.i(this.f4419t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f4421v.post(this.f4422w);
            }
        }
        return this.f4401a == 2;
    }

    public final View h(int i10, int i11) {
        ViewGroup viewGroup = this.f4421v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f4418s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f4419t.getLeft();
        int top = this.f4419t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f4417r;
        int i16 = 0;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f4419t;
        int i17 = (int) this.f4413n;
        int i18 = (int) this.f4412m;
        int iAbs = Math.abs(i12);
        if (iAbs < i17) {
            i12 = 0;
        } else if (iAbs > i18) {
            i12 = i12 > 0 ? i18 : -i18;
        }
        int i19 = (int) this.f4413n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i19) {
            i13 = i16;
        } else if (iAbs2 > i18) {
            if (i13 > 0) {
                i13 = i18;
            } else {
                i16 = -i18;
                i13 = i16;
            }
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i20 = iAbs5 + iAbs6;
        int i21 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i20;
        } else {
            f10 = iAbs3;
            f11 = i21;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i20;
        } else {
            f12 = iAbs4;
            f13 = i21;
        }
        float f15 = f12 / f13;
        AbstractC0064c abstractC0064c = this.f4418s;
        overScroller.startScroll(left, top, i14, i15, (int) ((f(i15, i13, abstractC0064c.d()) * f15) + (f(i14, i12, abstractC0064c.c(view)) * f14)));
        p(2);
        return true;
    }

    public final boolean j(int i10) {
        if ((this.f4410k & (1 << i10)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4411l == null) {
            this.f4411l = VelocityTracker.obtain();
        }
        this.f4411l.addMovement(motionEvent);
        int i11 = 0;
        AbstractC0064c abstractC0064c = this.f4418s;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x10, (int) y10);
            n(x10, y10, pointerId);
            t(pointerId, viewH);
            if ((this.f4408h[pointerId] & this.f4416q) != 0) {
                abstractC0064c.f();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f4401a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f4401a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i11 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i11);
                    if (j(pointerId2)) {
                        float x11 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f10 = x11 - this.f4404d[pointerId2];
                        float f11 = y11 - this.f4405e[pointerId2];
                        m(f10, f11, pointerId2);
                        if (this.f4401a != 1) {
                            View viewH2 = h((int) x11, (int) y11);
                            if (d(viewH2, f10, f11) && t(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f4403c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4403c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f4406f;
                int i12 = this.f4403c;
                int i13 = (int) (x12 - fArr[i12]);
                int i14 = (int) (y12 - this.f4407g[i12]);
                int left = this.f4419t.getLeft() + i13;
                int top = this.f4419t.getTop() + i14;
                int left2 = this.f4419t.getLeft();
                int top2 = this.f4419t.getTop();
                if (i13 != 0) {
                    left = abstractC0064c.a(left, this.f4419t);
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    this.f4419t.offsetLeftAndRight(left - left2);
                }
                if (i14 != 0) {
                    top = abstractC0064c.b(top, this.f4419t);
                    WeakHashMap<View, Z> weakHashMap2 = O.f16859a;
                    this.f4419t.offsetTopAndBottom(top - top2);
                }
                if (i13 != 0 || i14 != 0) {
                    abstractC0064c.i(this.f4419t, left, top);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f4401a == 1) {
                this.f4420u = true;
                abstractC0064c.j(this.f4419t, 0.0f, 0.0f);
                this.f4420u = false;
                if (this.f4401a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            n(x13, y13, pointerId3);
            if (this.f4401a == 0) {
                t(pointerId3, h((int) x13, (int) y13));
                if ((this.f4408h[pointerId3] & this.f4416q) != 0) {
                    abstractC0064c.f();
                    return;
                }
                return;
            }
            int i15 = (int) x13;
            int i16 = (int) y13;
            View view = this.f4419t;
            if (view != null) {
                i11 = (i15 < view.getLeft() || i15 >= view.getRight() || i16 < view.getTop() || i16 >= view.getBottom()) ? 0 : 1;
            }
            if (i11 != 0) {
                t(pointerId3, this.f4419t);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f4401a == 1 && pointerId4 == this.f4403c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f4403c) {
                    View viewH3 = h((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view2 = this.f4419t;
                    if (viewH3 == view2 && t(pointerId5, view2)) {
                        i10 = this.f4403c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                l();
            }
        }
        e(pointerId4);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f4411l;
        float f10 = this.f4412m;
        velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, f10);
        float xVelocity = this.f4411l.getXVelocity(this.f4403c);
        float f11 = this.f4413n;
        float fAbs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f4411l.getYVelocity(this.f4403c);
        float f13 = this.f4413n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f13) {
            if (fAbs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f4420u = true;
        this.f4418s.j(this.f4419t, xVelocity, f12);
        this.f4420u = false;
        if (this.f4401a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [L0.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(float f10, float f11, int i10) {
        int i11;
        boolean zC = c(f10, f11, i10, 1);
        ?? r10 = zC;
        if (c(f11, f10, i10, 4)) {
            r10 = (zC ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (c(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (c(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f4409i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f4418s.e(r12, i10);
    }

    public final void n(float f10, float f11, int i10) {
        float[] fArr = this.f4404d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4405e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4406f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4407g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4408h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4409i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4404d = fArr2;
            this.f4405e = fArr3;
            this.f4406f = fArr4;
            this.f4407g = fArr5;
            this.f4408h = iArr;
            this.f4409i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f4404d;
        this.f4406f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f4405e;
        this.f4407g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f4408h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f4421v;
        int i14 = i12 < viewGroup.getLeft() + this.f4414o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f4414o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f4414o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f4414o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f4410k |= 1 << i10;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f4406f[pointerId] = x10;
                this.f4407g[pointerId] = y10;
            }
        }
    }

    public final void p(int i10) {
        this.f4421v.removeCallbacks(this.f4422w);
        if (this.f4401a != i10) {
            this.f4401a = i10;
            this.f4418s.h(i10);
            if (this.f4401a == 0) {
                this.f4419t = null;
            }
        }
    }

    public final boolean q(int i10, int i11) {
        if (this.f4420u) {
            return i(i10, i11, (int) this.f4411l.getXVelocity(this.f4403c), (int) this.f4411l.getYVelocity(this.f4403c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    public final boolean r(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4411l == null) {
            this.f4411l = VelocityTracker.obtain();
        }
        this.f4411l.addMovement(motionEvent);
        AbstractC0064c abstractC0064c = this.f4418s;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            n(x10, y10, pointerId);
            View viewH2 = h((int) x10, (int) y10);
            if (viewH2 == this.f4419t && this.f4401a == 2) {
                t(pointerId, viewH2);
            }
            if ((this.f4408h[pointerId] & this.f4416q) != 0) {
                abstractC0064c.f();
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                n(x11, y11, pointerId2);
                int i10 = this.f4401a;
                if (i10 == 0) {
                    if ((this.f4408h[pointerId2] & this.f4416q) != 0) {
                        abstractC0064c.f();
                    }
                } else if (i10 == 2 && (viewH = h((int) x11, (int) y11)) == this.f4419t) {
                    t(pointerId2, viewH);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f4404d != null && this.f4405e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i11 = 0; i11 < pointerCount; i11++) {
                int pointerId3 = motionEvent.getPointerId(i11);
                if (j(pointerId3)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f4404d[pointerId3];
                    float f11 = y12 - this.f4405e[pointerId3];
                    View viewH3 = h((int) x12, (int) y12);
                    boolean z10 = viewH3 != null && d(viewH3, f10, f11);
                    if (!z10) {
                        m(f10, f11, pointerId3);
                        if (this.f4401a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        int iA = abstractC0064c.a(((int) f10) + left, viewH3);
                        int top = viewH3.getTop();
                        int iB = abstractC0064c.b(((int) f11) + top, viewH3);
                        int iC = abstractC0064c.c(viewH3);
                        int iD = abstractC0064c.d();
                        if ((iC == 0 || (iC > 0 && iA == left)) && (iD == 0 || (iD > 0 && iB == top))) {
                            break;
                        }
                        m(f10, f11, pointerId3);
                        if (this.f4401a != 1 || (z10 && t(pointerId3, viewH3))) {
                            break;
                        }
                    }
                }
            }
            o(motionEvent);
        }
        return this.f4401a == 1;
    }

    public final boolean s(View view, int i10, int i11) {
        this.f4419t = view;
        this.f4403c = -1;
        boolean zI = i(i10, i11, 0, 0);
        if (!zI && this.f4401a == 0 && this.f4419t != null) {
            this.f4419t = null;
        }
        return zI;
    }

    public final boolean t(int i10, View view) {
        if (view == this.f4419t && this.f4403c == i10) {
            return true;
        }
        if (view == null || !this.f4418s.k(i10, view)) {
            return false;
        }
        this.f4403c = i10;
        b(i10, view);
        return true;
    }

    /* JADX INFO: renamed from: L0.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class AbstractC0064c {
        public abstract int a(int i10, View view);

        public abstract int b(int i10, View view);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void h(int i10);

        public abstract void i(View view, int i10, int i11);

        public abstract void j(View view, float f10, float f11);

        public abstract boolean k(int i10, View view);

        public void f() {
        }

        public void e(int i10, int i11) {
        }

        public void g(int i10, View view) {
        }
    }
}
