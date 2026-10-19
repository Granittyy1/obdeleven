package W6;

import android.R;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.braze.Constants;

/* JADX INFO: compiled from: SwipeDismissTouchListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class u implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f7054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f7055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7056h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7057i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f7060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f7061n;

    public u(View view, h hVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f7050b = viewConfiguration.getScaledTouchSlop();
        this.f7051c = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f7052d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7053e = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f7054f = view;
        this.f7055g = hVar;
    }

    public final void a(float f10, float f11, q qVar) {
        float fB = b();
        float f12 = f10 - fB;
        float alpha = this.f7054f.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f7053e);
        valueAnimatorOfFloat.addUpdateListener(new r(this, fB, f12, alpha, f11 - alpha));
        if (qVar != null) {
            valueAnimatorOfFloat.addListener(qVar);
        }
        valueAnimatorOfFloat.start();
    }

    public float b() {
        return this.f7054f.getTranslationX();
    }

    public void c(float f10) {
        this.f7054f.setTranslationX(f10);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        motionEvent.offsetLocation(this.f7061n, 0.0f);
        int i10 = this.f7056h;
        View view2 = this.f7054f;
        if (i10 < 2) {
            this.f7056h = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7057i = motionEvent.getRawX();
            this.j = motionEvent.getRawY();
            this.f7055g.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f7060m = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            return false;
        }
        boolean z11 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                VelocityTracker velocityTracker = this.f7060m;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    float rawX = motionEvent.getRawX() - this.f7057i;
                    float rawY = motionEvent.getRawY() - this.j;
                    float fAbs = Math.abs(rawX);
                    int i11 = this.f7050b;
                    if (fAbs > i11 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.f7058k = true;
                        if (rawX <= 0.0f) {
                            i11 = -i11;
                        }
                        this.f7059l = i11;
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        view2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (this.f7058k) {
                        this.f7061n = rawX;
                        c(rawX - this.f7059l);
                        this.f7054f.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f7056h))));
                        return true;
                    }
                }
            } else if (actionMasked == 3 && this.f7060m != null) {
                a(0.0f, 1.0f, null);
                this.f7060m.recycle();
                this.f7060m = null;
                this.f7061n = 0.0f;
                this.f7057i = 0.0f;
                this.j = 0.0f;
                this.f7058k = false;
            }
        } else if (this.f7060m != null) {
            float rawX2 = motionEvent.getRawX() - this.f7057i;
            this.f7060m.addMovement(motionEvent);
            this.f7060m.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
            float xVelocity = this.f7060m.getXVelocity();
            float fAbs2 = Math.abs(xVelocity);
            float fAbs3 = Math.abs(this.f7060m.getYVelocity());
            if (Math.abs(rawX2) > this.f7056h / 2 && this.f7058k) {
                z10 = rawX2 > 0.0f;
            } else if (this.f7051c > fAbs2 || fAbs2 > this.f7052d || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.f7058k) {
                z10 = false;
                z11 = false;
            } else {
                z11 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                z10 = this.f7060m.getXVelocity() > 0.0f;
            }
            if (z11) {
                a(z10 ? this.f7056h : -this.f7056h, 0.0f, new q(0, this));
            } else if (this.f7058k) {
                a(0.0f, 1.0f, null);
            }
            VelocityTracker velocityTracker2 = this.f7060m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.f7060m = null;
            this.f7061n = 0.0f;
            this.f7057i = 0.0f;
            this.j = 0.0f;
            this.f7058k = false;
        }
        return false;
    }
}
