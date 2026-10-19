package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f16889a;

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class c extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final PathInterpolator f16894e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final X0.a f16895f = new X0.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final DecelerateInterpolator f16896g = new DecelerateInterpolator();

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f16897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public n0 f16898b;

            /* JADX INFO: renamed from: androidx.core.view.c0$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class C0174a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f16899b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n0 f16900c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ n0 f16901d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f16902e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ View f16903f;

                public C0174a(c0 c0Var, n0 n0Var, n0 n0Var2, int i10, View view) {
                    this.f16899b = c0Var;
                    this.f16900c = n0Var;
                    this.f16901d = n0Var2;
                    this.f16902e = i10;
                    this.f16903f = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    n0.e cVar;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    c0 c0Var = this.f16899b;
                    c0Var.f16889a.d(animatedFraction);
                    float fB = c0Var.f16889a.b();
                    PathInterpolator pathInterpolator = c.f16894e;
                    int i10 = Build.VERSION.SDK_INT;
                    n0 n0Var = this.f16900c;
                    if (i10 >= 30) {
                        cVar = new n0.d(n0Var);
                    } else {
                        cVar = i10 >= 29 ? new n0.c(n0Var) : new n0.b(n0Var);
                    }
                    int i11 = 1;
                    while (i11 <= 256) {
                        int i12 = this.f16902e & i11;
                        n0.k kVar = n0Var.f16948a;
                        if (i12 == 0) {
                            cVar.c(i11, kVar.g(i11));
                        } else {
                            p222s0.b bVarG = kVar.g(i11);
                            p222s0.b bVarG2 = this.f16901d.f16948a.g(i11);
                            float f10 = 1.0f - fB;
                            cVar.c(i11, n0.e(bVarG, (int) (((double) ((bVarG.f46851a - bVarG2.f46851a) * f10)) + 0.5d), (int) (((double) ((bVarG.f46852b - bVarG2.f46852b) * f10)) + 0.5d), (int) (((double) ((bVarG.f46853c - bVarG2.f46853c) * f10)) + 0.5d), (int) (((double) ((bVarG.f46854d - bVarG2.f46854d) * f10)) + 0.5d)));
                        }
                        i11 <<= 1;
                        fB = fB;
                        c0Var = c0Var;
                    }
                    c.g(this.f16903f, cVar.b(), Collections.singletonList(c0Var));
                }
            }

            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c0 f16904b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ View f16905c;

                public b(View view, c0 c0Var) {
                    this.f16904b = c0Var;
                    this.f16905c = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    c0 c0Var = this.f16904b;
                    c0Var.f16889a.d(1.0f);
                    c.e(this.f16905c, c0Var);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.c0$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
            public class RunnableC0175c implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f16906b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ c0 f16907c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ a f16908d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f16909e;

                public RunnableC0175c(View view, c0 c0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f16906b = view;
                    this.f16907c = c0Var;
                    this.f16908d = aVar;
                    this.f16909e = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f16906b, this.f16907c, this.f16908d);
                    this.f16909e.start();
                }
            }

            public a(View view, b bVar) {
                n0 n0VarB;
                this.f16897a = bVar;
                WeakHashMap<View, Z> weakHashMap = O.f16859a;
                n0 n0VarA = O.e.a(view);
                if (n0VarA != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    n0VarB = (i10 >= 30 ? new n0.d(n0VarA) : i10 >= 29 ? new n0.c(n0VarA) : new n0.b(n0VarA)).b();
                } else {
                    n0VarB = null;
                }
                this.f16898b = n0VarB;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                n0.k kVar;
                Interpolator interpolator;
                if (!view.isLaidOut()) {
                    this.f16898b = n0.h(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                n0 n0VarH = n0.h(view, windowInsets);
                if (this.f16898b == null) {
                    WeakHashMap<View, Z> weakHashMap = O.f16859a;
                    this.f16898b = O.e.a(view);
                }
                if (this.f16898b == null) {
                    this.f16898b = n0VarH;
                    return c.i(view, windowInsets);
                }
                b bVarJ = c.j(view);
                if (bVarJ != null && Objects.equals(bVarJ.f16892b, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                n0 n0Var = this.f16898b;
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    kVar = n0VarH.f16948a;
                    if (i10 > 256) {
                        break;
                    }
                    if (!kVar.g(i10).equals(n0Var.f16948a.g(i10))) {
                        i11 |= i10;
                    }
                    i10 <<= 1;
                }
                if (i11 == 0) {
                    return c.i(view, windowInsets);
                }
                n0 n0Var2 = this.f16898b;
                if ((i11 & 8) != 0) {
                    interpolator = kVar.g(8).f46854d > n0Var2.f16948a.g(8).f46854d ? c.f16894e : c.f16895f;
                } else {
                    interpolator = c.f16896g;
                }
                c0 c0Var = new c0(i11, interpolator, 160L);
                c0Var.f16889a.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0Var.f16889a.a());
                p222s0.b bVarG = kVar.g(i11);
                p222s0.b bVarG2 = n0Var2.f16948a.g(i11);
                int iMin = Math.min(bVarG.f46851a, bVarG2.f46851a);
                int i12 = bVarG.f46852b;
                int i13 = bVarG2.f46852b;
                int iMin2 = Math.min(i12, i13);
                int i14 = bVarG.f46853c;
                int i15 = bVarG2.f46853c;
                int iMin3 = Math.min(i14, i15);
                int i16 = bVarG.f46854d;
                int i17 = i11;
                int i18 = bVarG2.f46854d;
                a aVar = new a(p222s0.b.b(iMin, iMin2, iMin3, Math.min(i16, i18)), p222s0.b.b(Math.max(bVarG.f46851a, bVarG2.f46851a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
                c.f(view, c0Var, windowInsets, false);
                duration.addUpdateListener(new C0174a(c0Var, n0VarH, n0Var2, i17, view));
                duration.addListener(new b(view, c0Var));
                B.a(view, new RunnableC0175c(view, c0Var, aVar, duration));
                this.f16898b = n0VarH;
                return c.i(view, windowInsets);
            }
        }

        public static void e(View view, c0 c0Var) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.a(c0Var);
                if (bVarJ.f16893c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), c0Var);
                }
            }
        }

        public static void f(View view, c0 c0Var, WindowInsets windowInsets, boolean z10) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.f16892b = windowInsets;
                if (!z10) {
                    bVarJ.b();
                    z10 = bVarJ.f16893c == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), c0Var, windowInsets, z10);
                }
            }
        }

        public static void g(View view, n0 n0Var, List<c0> list) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                n0Var = bVarJ.c(n0Var, list);
                if (bVarJ.f16893c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), n0Var, list);
                }
            }
        }

        public static void h(View view, c0 c0Var, a aVar) {
            b bVarJ = j(view);
            if (bVarJ != null) {
                bVarJ.d(aVar);
                if (bVarJ.f16893c == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), c0Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f16897a;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class d extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f16910e;

        /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f16911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public List<c0> f16912b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ArrayList<c0> f16913c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, c0> f16914d;

            public a(b bVar) {
                super(bVar.f16893c);
                this.f16914d = new HashMap<>();
                this.f16911a = bVar;
            }

            public final c0 a(WindowInsetsAnimation windowInsetsAnimation) {
                c0 c0Var = this.f16914d.get(windowInsetsAnimation);
                if (c0Var == null) {
                    c0Var = new c0(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        c0Var.f16889a = new d(windowInsetsAnimation);
                    }
                    this.f16914d.put(windowInsetsAnimation, c0Var);
                }
                return c0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f16911a.a(a(windowInsetsAnimation));
                this.f16914d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f16911a;
                a(windowInsetsAnimation);
                bVar.b();
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<c0> arrayList = this.f16913c;
                if (arrayList == null) {
                    ArrayList<c0> arrayList2 = new ArrayList<>(list.size());
                    this.f16913c = arrayList2;
                    this.f16912b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = K5.v.a(list.get(size));
                    c0 c0VarA = a(windowInsetsAnimationA);
                    c0VarA.f16889a.d(windowInsetsAnimationA.getFraction());
                    this.f16913c.add(c0VarA);
                }
                return this.f16911a.c(n0.h(null, windowInsets), this.f16912b).g();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                b bVar = this.f16911a;
                a(windowInsetsAnimation);
                a aVarD = bVar.d(new a(bounds));
                aVarD.getClass();
                k0.b();
                return j0.a(aVarD.f16890a.d(), aVarD.f16891b.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f16910e = windowInsetsAnimation;
        }

        @Override // androidx.core.view.c0.e
        public final long a() {
            return this.f16910e.getDurationMillis();
        }

        @Override // androidx.core.view.c0.e
        public final float b() {
            return this.f16910e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.c0.e
        public final int c() {
            return this.f16910e.getTypeMask();
        }

        @Override // androidx.core.view.c0.e
        public final void d(float f10) {
            this.f16910e.setFraction(f10);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Interpolator f16917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f16918d;

        public e(int i10, Interpolator interpolator, long j) {
            this.f16915a = i10;
            this.f16917c = interpolator;
            this.f16918d = j;
        }

        public long a() {
            return this.f16918d;
        }

        public float b() {
            Interpolator interpolator = this.f16917c;
            return interpolator != null ? interpolator.getInterpolation(this.f16916b) : this.f16916b;
        }

        public int c() {
            return this.f16915a;
        }

        public void d(float f10) {
            this.f16916b = f10;
        }
    }

    public c0(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f16889a = new d(i0.b(i10, interpolator, j));
        } else {
            this.f16889a = new c(i10, interpolator, j);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p222s0.b f16890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p222s0.b f16891b;

        public a(p222s0.b bVar, p222s0.b bVar2) {
            this.f16890a = bVar;
            this.f16891b = bVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f16890a + " upper=" + this.f16891b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f16890a = p222s0.b.c(bounds.getLowerBound());
            this.f16891b = p222s0.b.c(bounds.getUpperBound());
        }
    }

    /* JADX INFO: compiled from: WindowInsetsAnimationCompat.java */
    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WindowInsets f16892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16893c;

        public b(int i10) {
            this.f16893c = i10;
        }

        public abstract n0 c(n0 n0Var, List<c0> list);

        public abstract a d(a aVar);

        public void b() {
        }

        public void a(c0 c0Var) {
        }
    }
}
