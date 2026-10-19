package p216r5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import p005a4.q;

/* JADX INFO: compiled from: MotionTiming.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f46355a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f46357c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46358d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46359e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46356b = 150;

    public h(long j) {
        this.f46355a = j;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f46355a);
        animator.setDuration(this.f46356b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f46358d);
            valueAnimator.setRepeatMode(this.f46359e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f46357c;
        return timeInterpolator != null ? timeInterpolator : a.f46342b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f46355a == hVar.f46355a && this.f46356b == hVar.f46356b && this.f46358d == hVar.f46358d && this.f46359e == hVar.f46359e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f46355a;
        long j10 = this.f46356b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f46358d) * 31) + this.f46359e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(h.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f46355a);
        sb2.append(" duration: ");
        sb2.append(this.f46356b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f46358d);
        sb2.append(" repeatMode: ");
        return q.c(sb2, this.f46359e, "}\n");
    }
}
