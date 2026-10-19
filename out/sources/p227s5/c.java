package p227s5;

import S4.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: HeaderBehavior.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<V extends View> extends e<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f46910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f46911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46915i;
    public VelocityTracker j;

    /* JADX INFO: compiled from: HeaderBehavior.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoordinatorLayout f46916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f46917c;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f46916b = coordinatorLayout;
            this.f46917c = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar;
            OverScroller overScroller;
            V v10 = this.f46917c;
            if (v10 == null || (overScroller = (cVar = c.this).f46911e) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f46916b;
            if (!zComputeScrollOffset) {
                cVar.C(coordinatorLayout, v10);
                return;
            }
            cVar.E(coordinatorLayout, v10, cVar.f46911e.getCurrY());
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            v10.postOnAnimation(this);
        }
    }

    public c() {
        this.f46913g = -1;
        this.f46915i = -1;
    }

    public int A(V v10) {
        return -v10.getHeight();
    }

    public int B(V v10) {
        return v10.getHeight();
    }

    public int D(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iD;
        int iW = w();
        if (i11 == 0 || iW < i11 || iW > i12 || iW == (iD = o.d(i10, i11, i12))) {
            return 0;
        }
        f fVar = this.f46923b;
        if (fVar == null) {
            this.f46924c = iD;
        } else if (fVar.f46928d != iD) {
            fVar.f46928d = iD;
            fVar.a();
        }
        return iW - iD;
    }

    public final void E(CoordinatorLayout coordinatorLayout, View view, int i10) {
        D(coordinatorLayout, view, i10, Integer.MIN_VALUE, BrazeLogger.SUPPRESS);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f46915i < 0) {
            this.f46915i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f46912f) {
            int i10 = this.f46913g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f46914h) > this.f46915i) {
                this.f46914h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f46913g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = z(v10) && coordinatorLayout.p(v10, x10, y11);
            this.f46912f = z10;
            if (z10) {
                this.f46914h = y11;
                this.f46913g = motionEvent.getPointerId(0);
                if (this.j == null) {
                    this.j = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f46911e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f46911e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean v(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f46913g);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                int i10 = this.f46914h - y10;
                this.f46914h = y10;
                D(coordinatorLayout, v10, x() - i10, A(v10), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f46913g = motionEvent.getPointerId(i11);
                    this.f46914h = (int) (motionEvent.getY(i11) + 0.5f);
                }
            }
            z10 = false;
            velocityTracker2 = this.j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f46912f || z10;
        }
        VelocityTracker velocityTracker3 = this.j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.j.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
            float yVelocity = this.j.getYVelocity(this.f46913g);
            int i12 = -B(v10);
            Runnable runnable = this.f46910d;
            if (runnable != null) {
                v10.removeCallbacks(runnable);
                this.f46910d = null;
            }
            if (this.f46911e == null) {
                this.f46911e = new OverScroller(v10.getContext());
            }
            this.f46911e.fling(0, w(), 0, Math.round(yVelocity), 0, 0, i12, 0);
            if (this.f46911e.computeScrollOffset()) {
                a aVar = new a(coordinatorLayout, v10);
                this.f46910d = aVar;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                v10.postOnAnimation(aVar);
            } else {
                C(coordinatorLayout, v10);
            }
            z10 = true;
        }
        this.f46912f = false;
        this.f46913g = -1;
        velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j = null;
        }
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f46912f) {
            return true;
        }
        z10 = false;
        this.f46912f = false;
        this.f46913g = -1;
        velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j = null;
        }
        velocityTracker2 = this.j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f46912f) {
            return true;
        }
    }

    public boolean z(V v10) {
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46913g = -1;
        this.f46915i = -1;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
