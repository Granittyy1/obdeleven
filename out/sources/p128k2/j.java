package p128k2;

import K5.q;
import X5.k;
import Z3.RunnableC0837c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.activity.RunnableC0847d;
import androidx.activity.m;
import androidx.media3.ui.c;
import com.facebook.login.e;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.ViewOnClickListenerC2163p;
import java.util.ArrayList;
import java.util.Iterator;
import p033c7.RunnableC1498k;

/* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f41495A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f41496B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.ui.c f41498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f41499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f41500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f41501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f41502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f41503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f41504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f41505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f41506i;
    public final View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f41507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AnimatorSet f41508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnimatorSet f41509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnimatorSet f41510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AnimatorSet f41511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnimatorSet f41512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ValueAnimator f41513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f41514r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.activity.j f41516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q f41517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RunnableC0837c f41518v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RunnableC0847d f41515s = new RunnableC0847d(1, this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f41519w = new m(1, this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p128k2.h f41520x = new View.OnLayoutChangeListener() { // from class: k2.h
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            j jVar = this.f41493a;
            c cVar = jVar.f41498a;
            int width = (cVar.getWidth() - cVar.getPaddingLeft()) - cVar.getPaddingRight();
            int height3 = (cVar.getHeight() - cVar.getPaddingBottom()) - cVar.getPaddingTop();
            ViewGroup viewGroup = jVar.f41500c;
            int iC = j.c(viewGroup);
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i18 = iC - paddingRight;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                paddingBottom = 0;
            }
            int i19 = height - paddingBottom;
            int iMax = Math.max(i18, j.c(jVar.f41507k) + j.c(jVar.f41506i));
            ViewGroup viewGroup2 = jVar.f41501d;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            boolean z10 = width <= iMax || height3 <= (height2 * 2) + i19;
            if (jVar.f41495A != z10) {
                jVar.f41495A = z10;
                view.post(new e(2, jVar));
            }
            boolean z11 = i12 - i10 != i16 - i14;
            if (jVar.f41495A || !z11) {
                return;
            }
            view.post(new RunnableC1498k(jVar));
        }
    };

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f41497C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f41522z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f41521y = new ArrayList();

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            View view = jVar.f41499b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = jVar.f41500c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = jVar.f41502e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j jVar = j.this;
            View view = jVar.j;
            if (!(view instanceof androidx.media3.ui.b) || jVar.f41495A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
            ValueAnimator valueAnimator = bVar.f18883F;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            valueAnimator.setFloatValues(bVar.f18884G, 0.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j jVar = j.this;
            View view = jVar.f41499b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = jVar.f41500c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = jVar.f41502e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(jVar.f41495A ? 0 : 4);
            }
            View view2 = jVar.j;
            if (!(view2 instanceof androidx.media3.ui.b) || jVar.f41495A) {
                return;
            }
            androidx.media3.ui.b bVar = (androidx.media3.ui.b) view2;
            ValueAnimator valueAnimator = bVar.f18883F;
            if (valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            bVar.f18885H = false;
            valueAnimator.setFloatValues(bVar.f18884G, 1.0f);
            valueAnimator.setDuration(250L);
            valueAnimator.start();
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f41525b;

        public c(androidx.media3.ui.c cVar) {
            this.f41525b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            jVar.i(1);
            if (jVar.f41496B) {
                this.f41525b.post(jVar.f41515s);
                jVar.f41496B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j.this.i(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f41527b;

        public d(androidx.media3.ui.c cVar) {
            this.f41527b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            jVar.i(2);
            if (jVar.f41496B) {
                this.f41527b.post(jVar.f41515s);
                jVar.f41496B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j.this.i(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.media3.ui.c f41529b;

        public e(androidx.media3.ui.c cVar) {
            this.f41529b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            jVar.i(2);
            if (jVar.f41496B) {
                this.f41529b.post(jVar.f41515s);
                jVar.f41496B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j.this.i(3);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j.this.i(4);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j.this.i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j.this.i(4);
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = j.this.f41503f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            j jVar = j.this;
            ViewGroup viewGroup = jVar.f41505h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = jVar.f41505h;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = jVar.f41505h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: PlayerControlViewLayoutManager.java */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = j.this.f41505h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = j.this.f41503f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [k2.h] */
    public j(androidx.media3.ui.c cVar) {
        this.f41498a = cVar;
        int i10 = 4;
        this.f41516t = new androidx.activity.j(i10, this);
        int i11 = 3;
        this.f41517u = new q(i11, this);
        this.f41518v = new RunnableC0837c(i10, this);
        this.f41499b = cVar.findViewById(R.id.exo_controls_background);
        this.f41500c = (ViewGroup) cVar.findViewById(R.id.exo_center_controls);
        this.f41502e = (ViewGroup) cVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) cVar.findViewById(R.id.exo_bottom_bar);
        this.f41501d = viewGroup;
        this.f41506i = (ViewGroup) cVar.findViewById(R.id.exo_time);
        View viewFindViewById = cVar.findViewById(R.id.exo_progress);
        this.j = viewFindViewById;
        this.f41503f = (ViewGroup) cVar.findViewById(R.id.exo_basic_controls);
        this.f41504g = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls);
        this.f41505h = (ViewGroup) cVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = cVar.findViewById(R.id.exo_overflow_show);
        this.f41507k = viewFindViewById2;
        View viewFindViewById3 = cVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC2163p(i11, this));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC2163p(i11, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k2.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j jVar = this.f41494b;
                jVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jVar.f41499b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = jVar.f41500c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = jVar.f41502e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k2.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j jVar = this.f41491b;
                jVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = jVar.f41499b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = jVar.f41500c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup3 = jVar.f41502e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = cVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41508l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(cVar));
        animatorSet.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41509m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(cVar));
        animatorSet2.play(d(viewFindViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f41510n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(cVar));
        animatorSet3.play(valueAnimatorOfFloat).with(d(viewFindViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f41511o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f41512p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(d(viewFindViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f41513q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k2.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                j jVar = this.f41492b;
                jVar.getClass();
                jVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f41514r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new k(1, this));
        valueAnimatorOfFloat4.addListener(new i());
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator d(View view, float f10, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f10) {
        ViewGroup viewGroup = this.f41505h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f41506i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f41503f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f41521y.contains(view);
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f41498a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        m mVar = this.f41519w;
        androidx.media3.ui.c cVar = this.f41498a;
        cVar.removeCallbacks(mVar);
        cVar.removeCallbacks(this.f41516t);
        cVar.removeCallbacks(this.f41518v);
        cVar.removeCallbacks(this.f41517u);
    }

    public final void g() {
        if (this.f41522z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f41498a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f41497C) {
                e(this.f41519w, showTimeoutMs);
            } else if (this.f41522z == 1) {
                e(this.f41517u, 2000L);
            } else {
                e(this.f41518v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f41521y;
        if (!z10) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f41495A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i10) {
        int i11 = this.f41522z;
        this.f41522z = i10;
        androidx.media3.ui.c cVar = this.f41498a;
        if (i10 == 2) {
            cVar.setVisibility(8);
        } else if (i11 == 2) {
            cVar.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator<androidx.media3.ui.c.l> it = cVar.f18961e.iterator();
            while (it.hasNext()) {
                it.next().k(cVar.getVisibility());
            }
        }
    }

    public final void k() {
        if (!this.f41497C) {
            i(0);
            g();
            return;
        }
        int i10 = this.f41522z;
        if (i10 == 1) {
            this.f41511o.start();
        } else if (i10 == 2) {
            this.f41512p.start();
        } else if (i10 == 3) {
            this.f41496B = true;
        } else if (i10 == 4) {
            return;
        }
        g();
    }
}
