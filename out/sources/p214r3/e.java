package p214r3;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import p079g3.b;

/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f46322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f46325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f46326i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f46327k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f46328l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f46329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46330n;

    public final float c() {
        b bVar = this.f46329m;
        if (bVar == null) {
            return 0.0f;
        }
        float f10 = this.f46326i;
        float f11 = bVar.j;
        return (f10 - f11) / (bVar.f35561k - f11);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f46314c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(f());
        g(true);
    }

    public final float d() {
        b bVar = this.f46329m;
        if (bVar == null) {
            return 0.0f;
        }
        float f10 = this.f46328l;
        return f10 == 2.1474836E9f ? bVar.f35561k : f10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z10 = false;
        if (this.f46330n) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        b bVar = this.f46329m;
        if (bVar == null || !this.f46330n) {
            return;
        }
        long j10 = this.f46324g;
        float fAbs = (j10 != 0 ? j - j10 : 0L) / ((1.0E9f / bVar.f35562l) / Math.abs(this.f46322e));
        float f10 = this.f46325h;
        if (f()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float fE = e();
        float fD = d();
        PointF pointF = f.f46331a;
        if (f11 >= fE && f11 <= fD) {
            z10 = true;
        }
        float fB = f.b(f11, e(), d());
        this.f46325h = fB;
        this.f46326i = fB;
        this.f46324g = j;
        b();
        if (!z10) {
            if (getRepeatCount() == -1 || this.j < getRepeatCount()) {
                Iterator it = this.f46314c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.j++;
                if (getRepeatMode() == 2) {
                    this.f46323f = !this.f46323f;
                    this.f46322e = -this.f46322e;
                } else {
                    float fD2 = f() ? d() : e();
                    this.f46325h = fD2;
                    this.f46326i = fD2;
                }
                this.f46324g = j;
            } else {
                float fE2 = this.f46322e < 0.0f ? e() : d();
                this.f46325h = fE2;
                this.f46326i = fE2;
                g(true);
                a(f());
            }
        }
        if (this.f46329m == null) {
            return;
        }
        float f12 = this.f46326i;
        if (f12 < this.f46327k || f12 > this.f46328l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f46327k), Float.valueOf(this.f46328l), Float.valueOf(this.f46326i)));
        }
    }

    public final float e() {
        b bVar = this.f46329m;
        if (bVar == null) {
            return 0.0f;
        }
        float f10 = this.f46327k;
        return f10 == -2.1474836E9f ? bVar.j : f10;
    }

    public final boolean f() {
        return this.f46322e < 0.0f;
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f46330n = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fE;
        float fD;
        float fE2;
        if (this.f46329m == null) {
            return 0.0f;
        }
        if (f()) {
            fE = d() - this.f46326i;
            fD = d();
            fE2 = e();
        } else {
            fE = this.f46326i - e();
            fD = d();
            fE2 = e();
        }
        return fE / (fD - fE2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        b bVar = this.f46329m;
        if (bVar == null) {
            return 0L;
        }
        return (long) bVar.b();
    }

    public final void h(float f10) {
        if (this.f46325h == f10) {
            return;
        }
        float fB = f.b(f10, e(), d());
        this.f46325h = fB;
        this.f46326i = fB;
        this.f46324g = 0L;
        b();
    }

    public final void i(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        b bVar = this.f46329m;
        float f12 = bVar == null ? -3.4028235E38f : bVar.j;
        float f13 = bVar == null ? Float.MAX_VALUE : bVar.f35561k;
        float fB = f.b(f10, f12, f13);
        float fB2 = f.b(f11, f12, f13);
        if (fB == this.f46327k && fB2 == this.f46328l) {
            return;
        }
        this.f46327k = fB;
        this.f46328l = fB2;
        h((int) f.b(this.f46326i, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f46330n;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f46323f) {
            return;
        }
        this.f46323f = false;
        this.f46322e = -this.f46322e;
    }
}
