package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.C1297l;
import androidx.core.view.Z;
import com.braze.Constants;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: ItemTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class t extends RecyclerView.k implements RecyclerView.n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f19988A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f19989B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19998i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19999k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f20001m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20003o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f20006r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VelocityTracker f20008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f20009u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f20010v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1297l f20012x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f20013y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19990a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f19991b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.B f19992c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20000l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20002n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f20004p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f20007s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f20011w = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f20014z = new b();

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        @Override // java.lang.Runnable
        public final void run() {
            int iInterpolateOutOfBoundsScroll;
            int iInterpolateOutOfBoundsScroll2;
            int i10;
            t tVar = t.this;
            if (tVar.f19992c != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = tVar.f19989B;
                long j10 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                RecyclerView.l layoutManager = tVar.f20006r.getLayoutManager();
                if (tVar.f19988A == null) {
                    tVar.f19988A = new Rect();
                }
                layoutManager.e(tVar.f19988A, tVar.f19992c.itemView);
                if (layoutManager.f()) {
                    int i11 = (int) (tVar.j + tVar.f19997h);
                    iInterpolateOutOfBoundsScroll = (i11 - tVar.f19988A.left) - tVar.f20006r.getPaddingLeft();
                    float f10 = tVar.f19997h;
                    if ((f10 >= 0.0f || iInterpolateOutOfBoundsScroll >= 0) && (f10 <= 0.0f || (iInterpolateOutOfBoundsScroll = ((tVar.f19992c.itemView.getWidth() + i11) + tVar.f19988A.right) - (tVar.f20006r.getWidth() - tVar.f20006r.getPaddingRight())) <= 0)) {
                        iInterpolateOutOfBoundsScroll = 0;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll = 0;
                }
                if (layoutManager.g()) {
                    int i12 = (int) (tVar.f19999k + tVar.f19998i);
                    int paddingTop = (i12 - tVar.f19988A.top) - tVar.f20006r.getPaddingTop();
                    float f11 = tVar.f19998i;
                    if ((f11 >= 0.0f || paddingTop >= 0) && (f11 <= 0.0f || (paddingTop = ((tVar.f19992c.itemView.getHeight() + i12) + tVar.f19988A.bottom) - (tVar.f20006r.getHeight() - tVar.f20006r.getPaddingBottom())) <= 0)) {
                        iInterpolateOutOfBoundsScroll2 = 0;
                    } else {
                        iInterpolateOutOfBoundsScroll2 = paddingTop;
                    }
                } else {
                    iInterpolateOutOfBoundsScroll2 = 0;
                }
                if (iInterpolateOutOfBoundsScroll != 0) {
                    iInterpolateOutOfBoundsScroll = tVar.f20001m.interpolateOutOfBoundsScroll(tVar.f20006r, tVar.f19992c.itemView.getWidth(), iInterpolateOutOfBoundsScroll, tVar.f20006r.getWidth(), j10);
                }
                int i13 = iInterpolateOutOfBoundsScroll;
                if (iInterpolateOutOfBoundsScroll2 != 0) {
                    i10 = i13;
                    iInterpolateOutOfBoundsScroll2 = tVar.f20001m.interpolateOutOfBoundsScroll(tVar.f20006r, tVar.f19992c.itemView.getHeight(), iInterpolateOutOfBoundsScroll2, tVar.f20006r.getHeight(), j10);
                } else {
                    i10 = i13;
                }
                if (i10 == 0 && iInterpolateOutOfBoundsScroll2 == 0) {
                    tVar.f19989B = Long.MIN_VALUE;
                    return;
                }
                if (tVar.f19989B == Long.MIN_VALUE) {
                    tVar.f19989B = jCurrentTimeMillis;
                }
                tVar.f20006r.scrollBy(i10, iInterpolateOutOfBoundsScroll2);
                RecyclerView.B b10 = tVar.f19992c;
                if (b10 != null) {
                    tVar.m(b10);
                }
                tVar.f20006r.removeCallbacks(tVar.f20007s);
                RecyclerView recyclerView = tVar.f20006r;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public class b implements RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void a(MotionEvent motionEvent) {
            t tVar = t.this;
            tVar.f20012x.f16942a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = tVar.f20008t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (tVar.f20000l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(tVar.f20000l);
            if (iFindPointerIndex >= 0) {
                tVar.g(actionMasked, iFindPointerIndex, motionEvent);
            }
            RecyclerView.B b10 = tVar.f19992c;
            if (b10 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        tVar.p(tVar.f20003o, iFindPointerIndex, motionEvent);
                        tVar.m(b10);
                        RecyclerView recyclerView = tVar.f20006r;
                        a aVar = tVar.f20007s;
                        recyclerView.removeCallbacks(aVar);
                        aVar.run();
                        tVar.f20006r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == tVar.f20000l) {
                        tVar.f20000l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        tVar.p(tVar.f20003o, actionIndex, motionEvent);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = tVar.f20008t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            tVar.o(null, 0);
            tVar.f20000l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            t tVar = t.this;
            tVar.f20012x.f16942a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                tVar.f20000l = motionEvent.getPointerId(0);
                tVar.f19993d = motionEvent.getX();
                tVar.f19994e = motionEvent.getY();
                VelocityTracker velocityTracker = tVar.f20008t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                tVar.f20008t = VelocityTracker.obtain();
                if (tVar.f19992c == null) {
                    ArrayList arrayList = tVar.f20004p;
                    if (!arrayList.isEmpty()) {
                        View viewJ = tVar.j(motionEvent);
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f20026f.itemView == viewJ) {
                                fVar = fVar2;
                                break;
                            }
                        }
                    }
                    if (fVar != null) {
                        tVar.f19993d -= fVar.j;
                        tVar.f19994e -= fVar.f20030k;
                        RecyclerView.B b10 = fVar.f20026f;
                        tVar.i(b10, true);
                        if (tVar.f19990a.remove(b10.itemView)) {
                            tVar.f20001m.clearView(tVar.f20006r, b10);
                        }
                        tVar.o(b10, fVar.f20027g);
                        tVar.p(tVar.f20003o, 0, motionEvent);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                tVar.f20000l = -1;
                tVar.o(null, 0);
            } else {
                int i10 = tVar.f20000l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    tVar.g(actionMasked, iFindPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = tVar.f20008t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return tVar.f19992c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void d(boolean z10) {
            if (z10) {
                t.this.o(null, 0);
            }
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public class c extends f {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f20017o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.B f20018p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.B b10, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.B b11) {
            super(b10, i11, f10, f11, f12, f13);
            this.f20017o = i12;
            this.f20018p = b11;
        }

        @Override // androidx.recyclerview.widget.t.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f20031l) {
                return;
            }
            int i10 = this.f20017o;
            RecyclerView.B b10 = this.f20018p;
            t tVar = t.this;
            if (i10 <= 0) {
                tVar.f20001m.clearView(tVar.f20006r, b10);
            } else {
                tVar.f19990a.add(b10.itemView);
                this.f20029i = true;
                if (i10 > 0) {
                    tVar.f20006r.post(new u(tVar, this, i10));
                }
            }
            View view = tVar.f20011w;
            View view2 = b10.itemView;
            if (view == view2) {
                tVar.n(view2);
            }
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f20020b = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            t tVar;
            View viewJ;
            RecyclerView.B bM;
            if (this.f20020b && (viewJ = (tVar = t.this).j(motionEvent)) != null && (bM = tVar.f20006r.M(viewJ)) != null && tVar.f20001m.hasDragFlag(tVar.f20006r, bM)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = tVar.f20000l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    tVar.f19993d = x10;
                    tVar.f19994e = y10;
                    tVar.f19998i = 0.0f;
                    tVar.f19997h = 0.0f;
                    if (tVar.f20001m.isLongPressDragEnabled()) {
                        tVar.o(bM, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public static abstract class g extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20034a;

        @Override // androidx.recyclerview.widget.t.d
        public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.B b10) {
            return d.makeMovementFlags(0, this.f20034a);
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public interface h {
        void b(View view, View view2);
    }

    public t(d dVar) {
        this.f20001m = dVar;
    }

    public static boolean l(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void b(View view) {
        n(view);
        RecyclerView.B bM = this.f20006r.M(view);
        if (bM == null) {
            return;
        }
        RecyclerView.B b10 = this.f19992c;
        if (b10 != null && bM == b10) {
            o(null, 0);
            return;
        }
        i(bM, false);
        if (this.f19990a.remove(bM.itemView)) {
            this.f20001m.clearView(this.f20006r, bM);
        }
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f20006r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f20014z;
        if (recyclerView2 != null) {
            recyclerView2.e0(this);
            RecyclerView recyclerView3 = this.f20006r;
            recyclerView3.f19643s.remove(bVar);
            if (recyclerView3.f19645t == bVar) {
                recyclerView3.f19645t = null;
            }
            ArrayList arrayList = this.f20006r.f19592E;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f20004p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.f20028h.cancel();
                this.f20001m.clearView(this.f20006r, fVar.f20026f);
            }
            arrayList2.clear();
            this.f20011w = null;
            VelocityTracker velocityTracker = this.f20008t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f20008t = null;
            }
            e eVar = this.f20013y;
            if (eVar != null) {
                eVar.f20020b = false;
                this.f20013y = null;
            }
            if (this.f20012x != null) {
                this.f20012x = null;
            }
        }
        this.f20006r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f19995f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f19996g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f20005q = ViewConfiguration.get(this.f20006r.getContext()).getScaledTouchSlop();
            this.f20006r.i(this);
            this.f20006r.f19643s.add(bVar);
            RecyclerView recyclerView4 = this.f20006r;
            if (recyclerView4.f19592E == null) {
                recyclerView4.f19592E = new ArrayList();
            }
            recyclerView4.f19592E.add(this);
            this.f20013y = new e();
            this.f20012x = new C1297l(this.f20006r.getContext(), this.f20013y);
        }
    }

    public final int f(RecyclerView.B b10, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.f19997h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f20008t;
        d dVar = this.f20001m;
        if (velocityTracker != null && this.f20000l > -1) {
            velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, dVar.getSwipeVelocityThreshold(this.f19996g));
            float xVelocity = this.f20008t.getXVelocity(this.f20000l);
            float yVelocity = this.f20008t.getYVelocity(this.f20000l);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && fAbs >= dVar.getSwipeEscapeVelocity(this.f19995f) && fAbs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(b10) * this.f20006r.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.f19997h) <= swipeThreshold) {
            return 0;
        }
        return i11;
    }

    public final void g(int i10, int i11, MotionEvent motionEvent) {
        int absoluteMovementFlags;
        View viewJ;
        if (this.f19992c == null && i10 == 2 && this.f20002n != 2) {
            d dVar = this.f20001m;
            if (dVar.isItemViewSwipeEnabled() && this.f20006r.getScrollState() != 1) {
                RecyclerView.l layoutManager = this.f20006r.getLayoutManager();
                int i12 = this.f20000l;
                RecyclerView.B bM = null;
                if (i12 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                    float x10 = motionEvent.getX(iFindPointerIndex) - this.f19993d;
                    float y10 = motionEvent.getY(iFindPointerIndex) - this.f19994e;
                    float fAbs = Math.abs(x10);
                    float fAbs2 = Math.abs(y10);
                    float f10 = this.f20005q;
                    if ((fAbs >= f10 || fAbs2 >= f10) && ((fAbs <= fAbs2 || !layoutManager.f()) && ((fAbs2 <= fAbs || !layoutManager.g()) && (viewJ = j(motionEvent)) != null))) {
                        bM = this.f20006r.M(viewJ);
                    }
                }
                if (bM == null || (absoluteMovementFlags = (dVar.getAbsoluteMovementFlags(this.f20006r, bM) & 65280) >> 8) == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f11 = x11 - this.f19993d;
                float f12 = y11 - this.f19994e;
                float fAbs3 = Math.abs(f11);
                float fAbs4 = Math.abs(f12);
                float f13 = this.f20005q;
                if (fAbs3 >= f13 || fAbs4 >= f13) {
                    if (fAbs3 > fAbs4) {
                        if (f11 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f12 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f19998i = 0.0f;
                    this.f19997h = 0.0f;
                    this.f20000l = motionEvent.getPointerId(0);
                    o(bM, 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
        rect.setEmpty();
    }

    public final int h(RecyclerView.B b10, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f19998i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f20008t;
        d dVar = this.f20001m;
        if (velocityTracker != null && this.f20000l > -1) {
            velocityTracker.computeCurrentVelocity(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, dVar.getSwipeVelocityThreshold(this.f19996g));
            float xVelocity = this.f20008t.getXVelocity(this.f20000l);
            float yVelocity = this.f20008t.getYVelocity(this.f20000l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= dVar.getSwipeEscapeVelocity(this.f19995f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float swipeThreshold = dVar.getSwipeThreshold(b10) * this.f20006r.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.f19998i) <= swipeThreshold) {
            return 0;
        }
        return i11;
    }

    public final void i(RecyclerView.B b10, boolean z10) {
        ArrayList arrayList = this.f20004p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (fVar.f20026f == b10) {
                fVar.f20031l |= z10;
                if (!fVar.f20032m) {
                    fVar.f20028h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View j(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.B b10 = this.f19992c;
        if (b10 != null) {
            View view = b10.itemView;
            if (l(view, x10, y10, this.j + this.f19997h, this.f19999k + this.f19998i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f20004p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            View view2 = fVar.f20026f.itemView;
            if (l(view2, x10, y10, fVar.j, fVar.f20030k)) {
                return view2;
            }
        }
        return this.f20006r.E(x10, y10);
    }

    public final void k(float[] fArr) {
        if ((this.f20003o & 12) != 0) {
            fArr[0] = (this.j + this.f19997h) - this.f19992c.itemView.getLeft();
        } else {
            fArr[0] = this.f19992c.itemView.getTranslationX();
        }
        if ((this.f20003o & 3) != 0) {
            fArr[1] = (this.f19999k + this.f19998i) - this.f19992c.itemView.getTop();
        } else {
            fArr[1] = this.f19992c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(RecyclerView.B b10) {
        int i10;
        int i11;
        if (!this.f20006r.isLayoutRequested() && this.f20002n == 2) {
            d dVar = this.f20001m;
            float moveThreshold = dVar.getMoveThreshold(b10);
            int i12 = (int) (this.j + this.f19997h);
            int i13 = (int) (this.f19999k + this.f19998i);
            if (Math.abs(i13 - b10.itemView.getTop()) >= b10.itemView.getHeight() * moveThreshold || Math.abs(i12 - b10.itemView.getLeft()) >= b10.itemView.getWidth() * moveThreshold) {
                ArrayList arrayList = this.f20009u;
                if (arrayList == null) {
                    this.f20009u = new ArrayList();
                    this.f20010v = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f20010v.clear();
                }
                int boundingBoxMargin = dVar.getBoundingBoxMargin();
                int iRound = Math.round(this.j + this.f19997h) - boundingBoxMargin;
                int iRound2 = Math.round(this.f19999k + this.f19998i) - boundingBoxMargin;
                int i14 = boundingBoxMargin * 2;
                int width = b10.itemView.getWidth() + iRound + i14;
                int height = b10.itemView.getHeight() + iRound2 + i14;
                int i15 = (iRound + width) / 2;
                int i16 = (iRound2 + height) / 2;
                RecyclerView.l layoutManager = this.f20006r.getLayoutManager();
                int iX = layoutManager.x();
                int i17 = 0;
                while (i17 < iX) {
                    View viewW = layoutManager.w(i17);
                    if (viewW != b10.itemView && viewW.getBottom() >= iRound2 && viewW.getTop() <= height && viewW.getRight() >= iRound && viewW.getLeft() <= width) {
                        RecyclerView.B bM = this.f20006r.M(viewW);
                        i10 = iRound;
                        i11 = iRound2;
                        if (dVar.canDropOver(this.f20006r, this.f19992c, bM)) {
                            int iAbs = Math.abs(i15 - ((viewW.getRight() + viewW.getLeft()) / 2));
                            int iAbs2 = Math.abs(i16 - ((viewW.getBottom() + viewW.getTop()) / 2));
                            int i18 = (iAbs2 * iAbs2) + (iAbs * iAbs);
                            int size = this.f20009u.size();
                            int i19 = 0;
                            int i20 = 0;
                            while (i20 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.f20010v.get(i20)).intValue()) {
                                    break;
                                }
                                i19++;
                                i20++;
                                size = i21;
                            }
                            this.f20009u.add(i19, bM);
                            this.f20010v.add(i19, Integer.valueOf(i18));
                        }
                    } else {
                        i10 = iRound;
                        i11 = iRound2;
                    }
                    i17++;
                    iRound = i10;
                    iRound2 = i11;
                    i15 = i15;
                }
                ArrayList arrayList2 = this.f20009u;
                if (arrayList2.size() == 0) {
                    return;
                }
                RecyclerView.B bChooseDropTarget = dVar.chooseDropTarget(b10, arrayList2, i12, i13);
                if (bChooseDropTarget == null) {
                    this.f20009u.clear();
                    this.f20010v.clear();
                    return;
                }
                int absoluteAdapterPosition = bChooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = b10.getAbsoluteAdapterPosition();
                if (dVar.onMove(this.f20006r, b10, bChooseDropTarget)) {
                    this.f20001m.onMoved(this.f20006r, b10, absoluteAdapterPosition2, bChooseDropTarget, absoluteAdapterPosition, i12, i13);
                }
            }
        }
    }

    public final void n(View view) {
        if (view == this.f20011w) {
            this.f20011w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    public final void o(RecyclerView.B b10, int i10) {
        d dVar;
        boolean z10;
        boolean z11;
        RecyclerView.B b11;
        int iH;
        int i11;
        float fSignum;
        float fSignum2;
        int i12;
        if (b10 == this.f19992c && i10 == this.f20002n) {
            return;
        }
        this.f19989B = Long.MIN_VALUE;
        int i13 = this.f20002n;
        i(b10, true);
        this.f20002n = i10;
        if (i10 == 2) {
            if (b10 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f20011w = b10.itemView;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.B b12 = this.f19992c;
        d dVar2 = this.f20001m;
        if (b12 != null) {
            if (b12.itemView.getParent() != null) {
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    if (this.f20002n == 2) {
                        iH = 0;
                    } else {
                        int movementFlags = dVar2.getMovementFlags(this.f20006r, b12);
                        RecyclerView recyclerView = this.f20006r;
                        WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                        int iConvertToAbsoluteDirection = (dVar2.convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (iConvertToAbsoluteDirection == 0) {
                            iH = 0;
                        } else {
                            int i15 = (movementFlags & 65280) >> 8;
                            if (Math.abs(this.f19997h) > Math.abs(this.f19998i)) {
                                iH = f(b12, iConvertToAbsoluteDirection);
                                if (iH <= 0) {
                                    iH = h(b12, iConvertToAbsoluteDirection);
                                    if (iH <= 0) {
                                        iH = 0;
                                    }
                                } else if ((i15 & iH) == 0) {
                                    iH = d.convertToRelativeDirection(iH, this.f20006r.getLayoutDirection());
                                }
                            } else {
                                iH = h(b12, iConvertToAbsoluteDirection);
                                if (iH <= 0) {
                                    iH = f(b12, iConvertToAbsoluteDirection);
                                    if (iH <= 0) {
                                        iH = 0;
                                    } else if ((i15 & iH) == 0) {
                                        iH = d.convertToRelativeDirection(iH, this.f20006r.getLayoutDirection());
                                    }
                                }
                            }
                        }
                    }
                    i11 = iH;
                }
                VelocityTracker velocityTracker = this.f20008t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f20008t = null;
                }
                if (i11 == 1 || i11 == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f19998i) * this.f20006r.getHeight();
                } else if (i11 == 4 || i11 == 8 || i11 == 16 || i11 == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f19997h) * this.f20006r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i13 == 2) {
                    i12 = 8;
                } else {
                    i12 = i11 > 0 ? 2 : 4;
                }
                float[] fArr = this.f19991b;
                k(fArr);
                float f10 = fArr[0];
                float f11 = fArr[1];
                int i16 = i12;
                dVar = dVar2;
                c cVar = new c(b12, i16, i13, f10, f11, fSignum, fSignum2, i11, b12);
                long animationDuration = dVar.getAnimationDuration(this.f20006r, i16, fSignum - f10, fSignum2 - f11);
                ValueAnimator valueAnimator = cVar.f20028h;
                valueAnimator.setDuration(animationDuration);
                this.f20004p.add(cVar);
                b12.setIsRecyclable(false);
                valueAnimator.start();
                b11 = null;
                z10 = true;
            } else {
                dVar = dVar2;
                n(b12.itemView);
                dVar.clearView(this.f20006r, b12);
                b11 = null;
                z10 = false;
            }
            this.f19992c = b11;
        } else {
            dVar = dVar2;
            z10 = false;
        }
        if (b10 != null) {
            this.f20003o = (dVar.getAbsoluteMovementFlags(this.f20006r, b10) & i14) >> (this.f20002n * 8);
            this.j = b10.itemView.getLeft();
            this.f19999k = b10.itemView.getTop();
            this.f19992c = b10;
            if (i10 == 2) {
                z11 = false;
                b10.itemView.performHapticFeedback(0);
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewParent parent = this.f20006r.getParent();
        if (parent != null) {
            if (this.f19992c != null) {
                z11 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z10) {
            this.f20006r.getLayoutManager().f19686f = true;
        }
        dVar.onSelectedChanged(this.f19992c, this.f20002n);
        this.f20006r.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        float f10;
        float f11;
        if (this.f19992c != null) {
            float[] fArr = this.f19991b;
            k(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f20001m.onDraw(canvas, recyclerView, this.f19992c, this.f20004p, this.f20002n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        float f10;
        float f11;
        if (this.f19992c != null) {
            float[] fArr = this.f19991b;
            k(fArr);
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f20001m.onDrawOver(canvas, recyclerView, this.f19992c, this.f20004p, this.f20002n, f10, f11);
    }

    public final void p(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f19993d;
        this.f19997h = f10;
        this.f19998i = y10 - this.f19994e;
        if ((i10 & 4) == 0) {
            this.f19997h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f19997h = Math.min(0.0f, this.f19997h);
        }
        if ((i10 & 1) == 0) {
            this.f19998i = Math.max(0.0f, this.f19998i);
        }
        if ((i10 & 2) == 0) {
            this.f19998i = Math.min(0.0f, this.f19998i);
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public static abstract class d {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* JADX INFO: compiled from: ItemTouchHelper.java */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* JADX INFO: compiled from: ItemTouchHelper.java */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i14 | i12;
        }

        public static w getDefaultUIUtil() {
            return x.f20039a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int makeMovementFlags(int i10, int i11) {
            return makeFlag(2, i10) | makeFlag(1, i11) | makeFlag(0, i11 | i10);
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.B b10, RecyclerView.B b11) {
            return true;
        }

        public RecyclerView.B chooseDropTarget(RecyclerView.B b10, List<RecyclerView.B> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = b10.itemView.getWidth() + i10;
            int height = b10.itemView.getHeight() + i11;
            int left2 = i10 - b10.itemView.getLeft();
            int top2 = i11 - b10.itemView.getTop();
            int size = list.size();
            RecyclerView.B b11 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.B b12 = list.get(i13);
                if (left2 > 0 && (right = b12.itemView.getRight() - width) < 0 && b12.itemView.getRight() > b10.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    b11 = b12;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = b12.itemView.getLeft() - i10) > 0 && b12.itemView.getLeft() < b10.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    b11 = b12;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = b12.itemView.getTop() - i11) > 0 && b12.itemView.getTop() < b10.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    b11 = b12;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = b12.itemView.getBottom() - height) < 0 && b12.itemView.getBottom() > b10.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    b11 = b12;
                    i12 = iAbs;
                }
            }
            return b11;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.B b10) {
            View view = b10.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                androidx.core.view.O.d.s(view, fFloatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i10, int i11) {
            int i12;
            int i13 = i10 & RELATIVE_DIR_FLAGS;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i14 | i12;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.B b10) {
            int movementFlags = getMovementFlags(recyclerView, b10);
            WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
            return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.i itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            }
            return i10 == 8 ? itemAnimator.f19676e : itemAnimator.f19675d;
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.B b10) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.B b10);

        public float getSwipeThreshold(RecyclerView.B b10) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.B b10) {
            return (getAbsoluteMovementFlags(recyclerView, b10) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.B b10) {
            return (getAbsoluteMovementFlags(recyclerView, b10) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i10, int i11, int i12, long j) {
            int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)) * ((int) Math.signum(i11)) * getMaxDragScroll(recyclerView))));
            if (interpolation == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10, float f10, float f11, int i10, boolean z10) {
            View view = b10.itemView;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                Float fValueOf = Float.valueOf(androidx.core.view.O.d.i(view));
                int childCount = recyclerView.getChildCount();
                float f12 = 0.0f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = recyclerView.getChildAt(i11);
                    if (childAt != view) {
                        WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                        float fI = androidx.core.view.O.d.i(childAt);
                        if (fI > f12) {
                            f12 = fI;
                        }
                    }
                }
                androidx.core.view.O.d.s(view, f12 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
            }
            view.setTranslationX(f10);
            view.setTranslationY(f11);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10, float f10, float f11, int i10, boolean z10) {
            View view = b10.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10, List<f> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = list.get(i11);
                float f12 = fVar.f20022b;
                float f13 = fVar.f20024d;
                RecyclerView.B b11 = fVar.f20026f;
                if (f12 == f13) {
                    fVar.j = b11.itemView.getTranslationX();
                } else {
                    fVar.j = Z3.n.b(f13, f12, fVar.f20033n, f12);
                }
                float f14 = fVar.f20023c;
                float f15 = fVar.f20025e;
                if (f14 == f15) {
                    fVar.f20030k = b11.itemView.getTranslationY();
                } else {
                    fVar.f20030k = Z3.n.b(f15, f14, fVar.f20033n, f14);
                }
                int iSave = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.f20026f, fVar.j, fVar.f20030k, fVar.f20027g, false);
                canvas.restoreToCount(iSave);
            }
            if (b10 != null) {
                int iSave2 = canvas.save();
                onChildDraw(canvas, recyclerView, b10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10, List<f> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = list.get(i11);
                int iSave = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.f20026f, fVar.j, fVar.f20030k, fVar.f20027g, false);
                canvas.restoreToCount(iSave);
            }
            if (b10 != null) {
                int iSave2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, b10, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                f fVar2 = list.get(i12);
                boolean z11 = fVar2.f20032m;
                if (z11 && !fVar2.f20029i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.B b10, RecyclerView.B b11);

        /* JADX WARN: Multi-variable type inference failed */
        public void onMoved(RecyclerView recyclerView, RecyclerView.B b10, int i10, RecyclerView.B b11, int i11, int i12, int i13) {
            RecyclerView.l layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).b(b10.itemView, b11.itemView);
                return;
            }
            if (layoutManager.f()) {
                if (RecyclerView.l.C(b11.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.j0(i11);
                }
                if (RecyclerView.l.D(b11.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.j0(i11);
                }
            }
            if (layoutManager.g()) {
                if (RecyclerView.l.E(b11.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.j0(i11);
                }
                if (RecyclerView.l.A(b11.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.j0(i11);
                }
            }
        }

        public abstract void onSwiped(RecyclerView.B b10, int i10);

        public float getSwipeEscapeVelocity(float f10) {
            return f10;
        }

        public float getSwipeVelocityThreshold(float f10) {
            return f10;
        }

        public void onSelectedChanged(RecyclerView.B b10, int i10) {
        }
    }

    /* JADX INFO: compiled from: ItemTouchHelper.java */
    public static class f implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f20022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f20023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f20024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f20025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RecyclerView.B f20026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ValueAnimator f20028h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20029i;
        public float j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f20030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20031l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f20032m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f20033n;

        public f(RecyclerView.B b10, int i10, float f10, float f11, float f12, float f13) {
            this.f20027g = i10;
            this.f20026f = b10;
            this.f20022b = f10;
            this.f20023c = f11;
            this.f20024d = f12;
            this.f20025e = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f20028h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new v(this));
            valueAnimatorOfFloat.setTarget(b10.itemView);
            valueAnimatorOfFloat.addListener(this);
            this.f20033n = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f20033n = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f20032m) {
                this.f20026f.setIsRecyclable(true);
            }
            this.f20032m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
