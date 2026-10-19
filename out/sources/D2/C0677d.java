package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeBounds.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0677d extends F {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f2590F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final b f2591G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final c f2592H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0027d f2593I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final e f2594J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final f f2595K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final A f2596L;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2597E;

    /* JADX INFO: renamed from: D2.d$a */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class a extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f2598a;

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f2598a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f2598a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* JADX INFO: renamed from: D2.d$b */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class b extends Property<j, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            jVar2.getClass();
            jVar2.f2608a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f2609b = iRound;
            int i10 = jVar2.f2613f + 1;
            jVar2.f2613f = i10;
            if (i10 == jVar2.f2614g) {
                T.a(jVar2.f2612e, jVar2.f2608a, iRound, jVar2.f2610c, jVar2.f2611d);
                jVar2.f2613f = 0;
                jVar2.f2614g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: D2.d$c */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class c extends Property<j, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            jVar2.getClass();
            jVar2.f2610c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            jVar2.f2611d = iRound;
            int i10 = jVar2.f2614g + 1;
            jVar2.f2614g = i10;
            if (jVar2.f2613f == i10) {
                T.a(jVar2.f2612e, jVar2.f2608a, jVar2.f2609b, jVar2.f2610c, iRound);
                jVar2.f2613f = 0;
                jVar2.f2614g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: D2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class C0027d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            T.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: D2.d$e */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            T.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: D2.d$f */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class f extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            T.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: D2.d$g */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class g extends AnimatorListenerAdapter {
        private j mViewBounds;

        public g(j jVar) {
            this.mViewBounds = jVar;
        }
    }

    /* JADX INFO: renamed from: D2.d$h */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f2601d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f2602e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f2603f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f2604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f2605h;

        public h(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f2600c = view;
            this.f2601d = rect;
            this.f2602e = i10;
            this.f2603f = i11;
            this.f2604g = i12;
            this.f2605h = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2599b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2599b) {
                return;
            }
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            Rect rect = this.f2601d;
            View view = this.f2600c;
            view.setClipBounds(rect);
            T.a(view, this.f2602e, this.f2603f, this.f2604g, this.f2605h);
        }
    }

    /* JADX INFO: renamed from: D2.d$i */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public class i extends J {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2606b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2607c;

        public i(ViewGroup viewGroup) {
            this.f2607c = viewGroup;
        }

        @Override // D2.J, D2.F.e
        public final void a(F f10) {
            S.a(this.f2607c, false);
        }

        @Override // D2.J, D2.F.e
        public final void b(F f10) {
            S.a(this.f2607c, false);
            this.f2606b = true;
        }

        @Override // D2.J, D2.F.e
        public final void c(F f10) {
            S.a(this.f2607c, true);
        }

        @Override // D2.F.e
        public final void e(F f10) {
            if (!this.f2606b) {
                S.a(this.f2607c, false);
            }
            f10.B(this);
        }
    }

    /* JADX INFO: renamed from: D2.d$j */
    /* JADX INFO: compiled from: ChangeBounds.java */
    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f2612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2614g;
    }

    static {
        new a(PointF.class, "boundsOrigin").f2598a = new Rect();
        f2591G = new b(PointF.class, "topLeft");
        f2592H = new c(PointF.class, "bottomRight");
        f2593I = new C0027d(PointF.class, "bottomRight");
        f2594J = new e(PointF.class, "topLeft");
        f2595K = new f(PointF.class, "position");
        f2596L = new A();
    }

    public final void O(O o10) {
        View view = o10.f2554b;
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = o10.f2553a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", o10.f2554b.getParent());
        if (this.f2597E) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // D2.F
    public final void g(O o10) {
        O(o10);
    }

    @Override // D2.F
    public final void j(O o10) {
        O(o10);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    @Override // D2.F
    public final Animator o(ViewGroup viewGroup, O o10, O o11) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        boolean z10;
        Animator animatorOfObject;
        Animator animator;
        if (o10 == null || o11 == null) {
            return null;
        }
        HashMap map = o10.f2553a;
        HashMap map2 = o11.f2553a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        boolean z11 = this.f2597E;
        View view = o11.f2554b;
        f fVar = f2595K;
        if (z11) {
            T.a(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
            ObjectAnimator objectAnimatorOfObject2 = (i12 == i13 && i14 == i15) ? null : ObjectAnimator.ofObject(view, fVar, (TypeConverter) null, this.f2497A.a(i12, i14, i13, i15));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f2596L, rect, rect6);
                objectAnimatorOfObject.addListener(new h(view, rect5, i13, i15, i17, i19));
            }
            boolean z12 = N.f2547a;
            if (objectAnimatorOfObject2 != null) {
                if (objectAnimatorOfObject == null) {
                    animatorOfObject = objectAnimatorOfObject2;
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    z10 = true;
                    animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject);
                    animator = animatorSet;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    S.a(viewGroup4, z10);
                    a(new i(viewGroup4));
                }
                return animator;
            }
            animatorOfObject = objectAnimatorOfObject;
        } else {
            T.a(view, i12, i14, i16, i18);
            if (i10 != 2) {
                animatorOfObject = (i12 == i13 && i14 == i15) ? ObjectAnimator.ofObject(view, f2593I, (TypeConverter) null, this.f2497A.a(i16, i18, i17, i19)) : ObjectAnimator.ofObject(view, f2594J, (TypeConverter) null, this.f2497A.a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorOfObject = ObjectAnimator.ofObject(view, fVar, (TypeConverter) null, this.f2497A.a(i12, i14, i13, i15));
            } else {
                j jVar = new j();
                jVar.f2612e = view;
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(jVar, f2591G, (TypeConverter) null, this.f2497A.a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(jVar, f2592H, (TypeConverter) null, this.f2497A.a(i16, i18, i17, i19));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfObject3, objectAnimatorOfObject4);
                animatorSet2.addListener(new g(jVar));
                animatorOfObject = animatorSet2;
            }
        }
        z10 = true;
        animator = animatorOfObject;
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup5 = (ViewGroup) view.getParent();
            S.a(viewGroup5, z10);
            a(new i(viewGroup5));
        }
        return animator;
    }

    @Override // D2.F
    public final String[] w() {
        return f2590F;
    }
}
