package H0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.E;
import androidx.core.view.O;
import androidx.core.view.Z;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AutoScrollHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3591r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0042a f3592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccelerateInterpolator f3593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListView f3594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f3595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f3596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f3597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3599i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f3600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3606q;

    /* JADX INFO: renamed from: H0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public static class C0042a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f3610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f3611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f3612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f3613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3615i;

        public final float a(long j) {
            long j10 = this.f3611e;
            if (j < j10) {
                return 0.0f;
            }
            long j11 = this.f3613g;
            if (j11 < 0 || j < j11) {
                return a.b((j - j10) / this.f3607a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f3614h;
            return (a.b((j - j11) / this.f3615i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: AutoScrollHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f3605p) {
                boolean z10 = aVar.f3603n;
                C0042a c0042a = aVar.f3592b;
                if (z10) {
                    aVar.f3603n = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0042a.f3611e = jCurrentAnimationTimeMillis;
                    c0042a.f3613g = -1L;
                    c0042a.f3612f = jCurrentAnimationTimeMillis;
                    c0042a.f3614h = 0.5f;
                }
                if ((c0042a.f3613g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0042a.f3613g + ((long) c0042a.f3615i)) || !aVar.e()) {
                    aVar.f3605p = false;
                    return;
                }
                boolean z11 = aVar.f3604o;
                ListView listView = aVar.f3594d;
                if (z11) {
                    aVar.f3604o = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0042a.f3612f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0042a.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - c0042a.f3612f;
                c0042a.f3612f = jCurrentAnimationTimeMillis2;
                ((f) aVar).f3617s.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c0042a.f3610d));
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                listView.postOnAnimation(this);
            }
        }
    }

    public a(ListView listView) {
        C0042a c0042a = new C0042a();
        c0042a.f3611e = Long.MIN_VALUE;
        c0042a.f3613g = -1L;
        c0042a.f3612f = 0L;
        this.f3592b = c0042a;
        this.f3593c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3596f = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3597g = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3600k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3601l = fArr5;
        this.f3594d = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f3598h = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3599i = f3591r;
        c0042a.f3607a = 500;
        c0042a.f3608b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i10, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.f3596f[i10] * f11, 0.0f, this.f3597g[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f3593c;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.j[i10];
            float f14 = this.f3600k[i10];
            float f15 = this.f3601l[i10];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.j[i10];
        float f18 = this.f3600k[i10];
        float f19 = this.f3601l[i10];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f3598h;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f3605p && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f3603n) {
            this.f3605p = false;
            return;
        }
        C0042a c0042a = this.f3592b;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - c0042a.f3611e);
        int i12 = c0042a.f3608b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0042a.f3615i = i10;
        c0042a.f3614h = c0042a.a(jCurrentAnimationTimeMillis);
        c0042a.f3613g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        E e10;
        int count;
        C0042a c0042a = this.f3592b;
        float f10 = c0042a.f3610d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c0042a.f3609c);
        if (iAbs == 0 || (count = (e10 = ((f) this).f3617s).getCount()) == 0) {
            return false;
        }
        int childCount = e10.getChildCount();
        int firstVisiblePosition = e10.getFirstVisiblePosition();
        int i10 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i10 >= count && e10.getChildAt(childCount - 1).getBottom() <= e10.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && e10.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f3606q) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return false;
        }
        this.f3604o = true;
        this.f3602m = false;
        float x10 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f3594d;
        float fA = a(0, x10, width, listView.getWidth());
        float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        C0042a c0042a = this.f3592b;
        c0042a.f3609c = fA;
        c0042a.f3610d = fA2;
        if (!this.f3605p && e()) {
            if (this.f3595e == null) {
                this.f3595e = new b();
            }
            this.f3605p = true;
            this.f3603n = true;
            if (this.f3602m || (i10 = this.f3599i) <= 0) {
                this.f3595e.run();
            } else {
                b bVar = this.f3595e;
                long j = i10;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                listView.postOnAnimationDelayed(bVar, j);
            }
            this.f3602m = true;
        }
        return false;
    }
}
