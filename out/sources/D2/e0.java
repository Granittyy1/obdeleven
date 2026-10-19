package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: Visibility.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends F {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f2621F = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2622E;

    /* JADX INFO: compiled from: Visibility.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f2633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f2634f;
    }

    public e0() {
        this.f2622E = 3;
    }

    public static void O(O o10) {
        int visibility = o10.f2554b.getVisibility();
        HashMap map = o10.f2553a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = o10.f2554b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static b P(O o10, O o11) {
        b bVar = new b();
        bVar.f2629a = false;
        bVar.f2630b = false;
        if (o10 != null) {
            HashMap map = o10.f2553a;
            if (map.containsKey("android:visibility:visibility")) {
                bVar.f2631c = ((Integer) map.get("android:visibility:visibility")).intValue();
                bVar.f2633e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                bVar.f2631c = -1;
                bVar.f2633e = null;
            }
        } else {
            bVar.f2631c = -1;
            bVar.f2633e = null;
        }
        if (o11 != null) {
            HashMap map2 = o11.f2553a;
            if (map2.containsKey("android:visibility:visibility")) {
                bVar.f2632d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                bVar.f2634f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                bVar.f2632d = -1;
                bVar.f2634f = null;
            }
        } else {
            bVar.f2632d = -1;
            bVar.f2634f = null;
        }
        if (o10 != null && o11 != null) {
            int i10 = bVar.f2631c;
            int i11 = bVar.f2632d;
            if (i10 == i11 && bVar.f2633e == bVar.f2634f) {
                return bVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    bVar.f2630b = false;
                    bVar.f2629a = true;
                } else if (i11 == 0) {
                    bVar.f2630b = true;
                    bVar.f2629a = true;
                }
            } else if (bVar.f2634f == null) {
                bVar.f2630b = false;
                bVar.f2629a = true;
            } else if (bVar.f2633e == null) {
                bVar.f2630b = true;
                bVar.f2629a = true;
            }
        } else if (o10 == null && bVar.f2632d == 0) {
            bVar.f2630b = true;
            bVar.f2629a = true;
        } else if (o11 == null && bVar.f2631c == 0) {
            bVar.f2630b = false;
            bVar.f2629a = true;
        }
        return bVar;
    }

    public abstract ObjectAnimator Q(ViewGroup viewGroup, View view, O o10, O o11);

    public abstract ObjectAnimator R(ViewGroup viewGroup, View view, O o10);

    public final void S(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2622E = i10;
    }

    @Override // D2.F
    public void g(O o10) {
        O(o10);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fb  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (P(u(r5, false), x(r5, false)).f2629a != false) goto L20;
     */
    @Override // D2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator o(android.view.ViewGroup r21, D2.O r22, D2.O r23) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.e0.o(android.view.ViewGroup, D2.O, D2.O):android.animation.Animator");
    }

    @Override // D2.F
    public final String[] w() {
        return f2621F;
    }

    @Override // D2.F
    public final boolean y(O o10, O o11) {
        if (o10 == null && o11 == null) {
            return false;
        }
        if (o10 != null && o11 != null && o11.f2553a.containsKey("android:visibility:visibility") != o10.f2553a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarP = P(o10, o11);
        if (bVarP.f2629a) {
            return bVarP.f2631c == 0 || bVarP.f2632d == 0;
        }
        return false;
    }

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2622E = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E.f2488d);
        int iC = p211r0.j.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iC != 0) {
            S(iC);
        }
    }

    /* JADX INFO: compiled from: Visibility.java */
    public static class a extends AnimatorListenerAdapter implements F.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ViewGroup f2625d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f2628g = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f2626e = true;

        public a(int i10, View view) {
            this.f2623b = view;
            this.f2624c = i10;
            this.f2625d = (ViewGroup) view.getParent();
            g(true);
        }

        @Override // D2.F.e
        public final void a(F f10) {
            g(false);
        }

        @Override // D2.F.e
        public final void c(F f10) {
            g(true);
        }

        @Override // D2.F.e
        public final void e(F f10) {
            if (!this.f2628g) {
                T.c(this.f2624c, this.f2623b);
                ViewGroup viewGroup = this.f2625d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
            f10.B(this);
        }

        public final void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f2626e || this.f2627f == z10 || (viewGroup = this.f2625d) == null) {
                return;
            }
            this.f2627f = z10;
            S.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2628g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f2628g) {
                T.c(this.f2624c, this.f2623b);
                ViewGroup viewGroup = this.f2625d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.f2628g) {
                return;
            }
            T.c(this.f2624c, this.f2623b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.f2628g) {
                return;
            }
            T.c(0, this.f2623b);
        }

        @Override // D2.F.e
        public final void b(F f10) {
        }

        @Override // D2.F.e
        public final void d(F f10) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
