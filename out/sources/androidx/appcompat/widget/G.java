package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class G implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f8697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f8698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f8699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8701i;
    public final int[] j = new int[2];

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = G.this.f8697e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            G g10 = G.this;
            g10.a();
            View view = g10.f8697e;
            if (view.isEnabled() && !view.isLongClickable() && g10.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                g10.f8700h = true;
            }
        }
    }

    public G(View view) {
        this.f8697e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8694b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8695c = tapTimeout;
        this.f8696d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f8699g;
        View view = this.f8697e;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f8698f;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract p150m.f b();

    public abstract boolean c();

    public boolean d() {
        p150m.f fVarB = b();
        if (fVarB == null || !fVarB.b()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        E eJ;
        boolean z11 = this.f8700h;
        View view2 = this.f8697e;
        if (z11) {
            p150m.f fVarB = b();
            if (fVarB != null && fVarB.b() && (eJ = fVarB.j()) != null && eJ.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                eJ.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = eJ.b(motionEventObtainNoHistory, this.f8701i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f8701i = motionEvent.getPointerId(0);
                    if (this.f8698f == null) {
                        this.f8698f = new a();
                    }
                    view2.postDelayed(this.f8698f, this.f8695c);
                    if (this.f8699g == null) {
                        this.f8699g = new b();
                    }
                    view2.postDelayed(this.f8699g, this.f8696d);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f8701i);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f8694b;
                        float f11 = -f10;
                        if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8700h = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8700h = false;
        this.f8701i = -1;
        a aVar = this.f8698f;
        if (aVar != null) {
            this.f8697e.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
