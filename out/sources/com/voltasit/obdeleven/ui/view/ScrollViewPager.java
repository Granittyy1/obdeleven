package com.voltasit.obdeleven.ui.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p208q9.b;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollViewPager extends ViewPager {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final a f34194A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f34195B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f34196C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public float f34197D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public float f34198E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final b f34199F0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f34200s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f34201t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f34202u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f34203w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f34204x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public double f34205y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public double f34206z0;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<ScrollViewPager> f34207a;

        public a(ScrollViewPager scrollViewPager) {
            this.f34207a = new WeakReference<>(scrollViewPager);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ScrollViewPager scrollViewPager;
            int count;
            super.handleMessage(message);
            if (message.what == 0 && (scrollViewPager = this.f34207a.get()) != null) {
                scrollViewPager.f34199F0.f46185a = scrollViewPager.f34205y0;
                H2.a adapter = scrollViewPager.getAdapter();
                int currentItem = scrollViewPager.getCurrentItem();
                if (adapter != null && (count = adapter.getCount()) > 1) {
                    int i10 = scrollViewPager.f34201t0 == 0 ? currentItem - 1 : currentItem + 1;
                    if (i10 < 0) {
                        if (scrollViewPager.f34202u0) {
                            scrollViewPager.u(count - 1, scrollViewPager.f34204x0);
                        }
                    } else if (i10 != count) {
                        scrollViewPager.u(i10, true);
                    } else if (scrollViewPager.f34202u0) {
                        scrollViewPager.u(0, scrollViewPager.f34204x0);
                    }
                }
                b bVar = scrollViewPager.f34199F0;
                bVar.f46185a = scrollViewPager.f34206z0;
                long duration = scrollViewPager.f34200s0 + ((long) bVar.getDuration());
                scrollViewPager.f34194A0.removeMessages(0);
                scrollViewPager.f34194A0.sendEmptyMessageDelayed(0, duration);
            }
        }
    }

    public ScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34200s0 = 1500L;
        this.f34201t0 = 1;
        this.f34202u0 = true;
        this.v0 = true;
        this.f34203w0 = 0;
        this.f34204x0 = true;
        this.f34205y0 = 1.0d;
        this.f34206z0 = 1.0d;
        this.f34195B0 = false;
        this.f34196C0 = false;
        this.f34197D0 = 0.0f;
        this.f34198E0 = 0.0f;
        this.f34199F0 = null;
        this.f34194A0 = new a(this);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("k");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("r0");
            declaredField2.setAccessible(true);
            b bVar = new b(getContext(), (Interpolator) declaredField2.get(null));
            bVar.f46185a = 1.0d;
            this.f34199F0 = bVar;
            declaredField.set(this, bVar);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.v0) {
            if (actionMasked == 0 && this.f34195B0) {
                this.f34196C0 = true;
                this.f34195B0 = false;
                this.f34194A0.removeMessages(0);
            } else if (motionEvent.getAction() == 1 && this.f34196C0) {
                this.f34195B0 = true;
                long duration = (long) (((((double) this.f34199F0.getDuration()) / this.f34205y0) * this.f34206z0) + this.f34200s0);
                this.f34194A0.removeMessages(0);
                this.f34194A0.sendEmptyMessageDelayed(0, duration);
            }
        }
        int i10 = this.f34203w0;
        if (i10 == 2 || i10 == 1) {
            this.f34197D0 = motionEvent.getX();
            if (motionEvent.getAction() == 0) {
                this.f34198E0 = this.f34197D0;
            }
            int currentItem = getCurrentItem();
            H2.a adapter = getAdapter();
            int count = adapter == null ? 0 : adapter.getCount();
            if ((currentItem == 0 && this.f34198E0 <= this.f34197D0) || (currentItem == count - 1 && this.f34198E0 >= this.f34197D0)) {
                if (this.f34203w0 == 2) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    if (count > 1) {
                        u((count - currentItem) - 1, this.f34204x0);
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getDirection() {
        return this.f34201t0 == 0 ? 0 : 1;
    }

    public long getInterval() {
        return this.f34200s0;
    }

    public int getSlideBorderMode() {
        return this.f34203w0;
    }

    public void setAutoScrollDurationFactor(double d10) {
        this.f34205y0 = d10;
    }

    public void setBorderAnimation(boolean z10) {
        this.f34204x0 = z10;
    }

    public void setCycle(boolean z10) {
        this.f34202u0 = z10;
    }

    public void setDirection(int i10) {
        this.f34201t0 = i10;
    }

    public void setInterval(long j) {
        this.f34200s0 = j;
    }

    public void setSlideBorderMode(int i10) {
        this.f34203w0 = i10;
    }

    public void setStopScrollWhenTouch(boolean z10) {
        this.v0 = z10;
    }

    public void setSwipeScrollDurationFactor(double d10) {
        this.f34206z0 = d10;
    }
}
