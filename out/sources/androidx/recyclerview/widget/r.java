package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes.dex */
public final class r extends RecyclerView.k implements RecyclerView.p {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f19939C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f19940D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f19941A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f19942B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f19945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f19946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f19949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f19950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19951i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f19954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19957p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f19960s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f19967z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19958q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19959r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f19961t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19962u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19963v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19964w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f19965x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f19966y = new int[2];

    /* JADX INFO: compiled from: FastScroller.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r rVar = r.this;
            int i10 = rVar.f19941A;
            ValueAnimator valueAnimator = rVar.f19967z;
            if (i10 == 1) {
                valueAnimator.cancel();
            } else if (i10 != 2) {
                return;
            }
            rVar.f19941A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class b extends RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(int i10, int i11, RecyclerView recyclerView) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            r rVar = r.this;
            int iComputeVerticalScrollRange = rVar.f19960s.computeVerticalScrollRange();
            int i12 = rVar.f19959r;
            int i13 = iComputeVerticalScrollRange - i12;
            int i14 = rVar.f19943a;
            rVar.f19961t = i13 > 0 && i12 >= i14;
            int iComputeHorizontalScrollRange = rVar.f19960s.computeHorizontalScrollRange();
            int i15 = rVar.f19958q;
            boolean z10 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i14;
            rVar.f19962u = z10;
            boolean z11 = rVar.f19961t;
            if (!z11 && !z10) {
                if (rVar.f19963v != 0) {
                    rVar.h(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f10 = i12;
                rVar.f19953l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                rVar.f19952k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
            }
            if (rVar.f19962u) {
                float f11 = i15;
                rVar.f19956o = (int) ((((f11 / 2.0f) + iComputeHorizontalScrollOffset) * f11) / iComputeHorizontalScrollRange);
                rVar.f19955n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
            }
            int i16 = rVar.f19963v;
            if (i16 == 0 || i16 == 1) {
                rVar.h(1);
            }
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19970b = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f19970b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f19970b) {
                this.f19970b = false;
                return;
            }
            r rVar = r.this;
            if (((Float) rVar.f19967z.getAnimatedValue()).floatValue() == 0.0f) {
                rVar.f19941A = 0;
                rVar.h(0);
            } else {
                rVar.f19941A = 2;
                rVar.f19960s.invalidate();
            }
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            r rVar = r.this;
            rVar.f19945c.setAlpha(iFloatValue);
            rVar.f19946d.setAlpha(iFloatValue);
            rVar.f19960s.invalidate();
        }
    }

    public r(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19967z = valueAnimatorOfFloat;
        this.f19941A = 0;
        a aVar = new a();
        this.f19942B = aVar;
        b bVar = new b();
        this.f19945c = stateListDrawable;
        this.f19946d = drawable;
        this.f19949g = stateListDrawable2;
        this.f19950h = drawable2;
        this.f19947e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f19948f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f19951i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f19943a = i11;
        this.f19944b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f19960s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.e0(this);
            RecyclerView recyclerView3 = this.f19960s;
            recyclerView3.f19643s.remove(this);
            if (recyclerView3.f19645t == this) {
                recyclerView3.f19645t = null;
            }
            ArrayList arrayList = this.f19960s.f19585A0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
            this.f19960s.removeCallbacks(aVar);
        }
        this.f19960s = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(this);
            this.f19960s.f19643s.add(this);
            this.f19960s.j(bVar);
        }
    }

    public static int g(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(MotionEvent motionEvent) {
        if (this.f19963v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.f19964w = 1;
                    this.f19957p = (int) motionEvent.getX();
                } else if (zF) {
                    this.f19964w = 2;
                    this.f19954m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f19963v == 2) {
            this.f19954m = 0.0f;
            this.f19957p = 0.0f;
            h(1);
            this.f19964w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f19963v == 2) {
            i();
            int i10 = this.f19964w;
            int i11 = this.f19944b;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f19966y;
                iArr[0] = i11;
                int i12 = this.f19958q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x10));
                if (Math.abs(this.f19956o - fMax) >= 2.0f) {
                    int iG = g(this.f19957p, fMax, iArr, this.f19960s.computeHorizontalScrollRange(), this.f19960s.computeHorizontalScrollOffset(), this.f19958q);
                    if (iG != 0) {
                        this.f19960s.scrollBy(iG, 0);
                    }
                    this.f19957p = fMax;
                }
            }
            if (this.f19964w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f19965x;
                iArr2[0] = i11;
                int i13 = this.f19959r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f19953l - fMax2) < 2.0f) {
                    return;
                }
                int iG2 = g(this.f19954m, fMax2, iArr2, this.f19960s.computeVerticalScrollRange(), this.f19960s.computeVerticalScrollOffset(), this.f19959r);
                if (iG2 != 0) {
                    this.f19960s.scrollBy(0, iG2);
                }
                this.f19954m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f19963v;
        if (i10 == 1) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zF && !zE) {
                return false;
            }
            if (zE) {
                this.f19964w = 1;
                this.f19957p = (int) motionEvent.getX();
            } else if (zF) {
                this.f19964w = 2;
                this.f19954m = (int) motionEvent.getY();
            }
            h(2);
        } else if (i10 != 2) {
            return false;
        }
        return true;
    }

    public final boolean e(float f10, float f11) {
        if (f11 >= this.f19959r - this.f19951i) {
            int i10 = this.f19956o;
            int i11 = this.f19955n;
            if (f10 >= i10 - (i11 / 2) && f10 <= (i11 / 2) + i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(float f10, float f11) {
        RecyclerView recyclerView = this.f19960s;
        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
        boolean z10 = recyclerView.getLayoutDirection() == 1;
        int i10 = this.f19947e;
        if (z10) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f19958q - i10) {
            return false;
        }
        int i11 = this.f19953l;
        int i12 = this.f19952k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void h(int i10) {
        a aVar = this.f19942B;
        StateListDrawable stateListDrawable = this.f19945c;
        if (i10 == 2 && this.f19963v != 2) {
            stateListDrawable.setState(f19939C);
            this.f19960s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f19960s.invalidate();
        } else {
            i();
        }
        if (this.f19963v == 2 && i10 != 2) {
            stateListDrawable.setState(f19940D);
            this.f19960s.removeCallbacks(aVar);
            this.f19960s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f19960s.removeCallbacks(aVar);
            this.f19960s.postDelayed(aVar, 1500);
        }
        this.f19963v = i10;
    }

    public final void i() {
        int i10 = this.f19941A;
        ValueAnimator valueAnimator = this.f19967z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f19941A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        int i10 = this.f19958q;
        RecyclerView recyclerView2 = this.f19960s;
        if (i10 != recyclerView2.getWidth() || this.f19959r != recyclerView2.getHeight()) {
            this.f19958q = recyclerView2.getWidth();
            this.f19959r = recyclerView2.getHeight();
            h(0);
            return;
        }
        if (this.f19941A != 0) {
            if (this.f19961t) {
                int i11 = this.f19958q;
                int i12 = this.f19947e;
                int i13 = i11 - i12;
                int i14 = this.f19953l;
                int i15 = this.f19952k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f19945c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f19959r;
                int i18 = this.f19948f;
                Drawable drawable = this.f19946d;
                drawable.setBounds(0, 0, i18, i17);
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f19962u) {
                int i19 = this.f19959r;
                int i20 = this.f19951i;
                int i21 = i19 - i20;
                int i22 = this.f19956o;
                int i23 = this.f19955n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f19949g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f19958q;
                int i26 = this.j;
                Drawable drawable2 = this.f19950h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void d(boolean z10) {
    }
}
