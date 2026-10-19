package D2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Slide.java */
/* JADX INFO: loaded from: classes.dex */
public final class D extends e0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final DecelerateInterpolator f2476H = new DecelerateInterpolator();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final AccelerateInterpolator f2477I = new AccelerateInterpolator();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a f2478J = new a();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final b f2479K = new b();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final c f2480L = new c();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final d f2481M = new d();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final e f2482N = new e();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final f f2483O = new f();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public g f2484G;

    /* JADX INFO: compiled from: Slide.java */
    public static class a extends h {
        @Override // D2.D.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static class b extends h {
        @Override // D2.D.g
        public final float a(View view, ViewGroup viewGroup) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static class c extends i {
        @Override // D2.D.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static class d extends h {
        @Override // D2.D.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static class e extends h {
        @Override // D2.D.g
        public final float a(View view, ViewGroup viewGroup) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static class f extends i {
        @Override // D2.D.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public interface g {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    /* JADX INFO: compiled from: Slide.java */
    public static abstract class h implements g {
        @Override // D2.D.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: Slide.java */
    public static abstract class i implements g {
        @Override // D2.D.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    @Override // D2.e0
    public final ObjectAnimator Q(ViewGroup viewGroup, View view, O o10, O o11) {
        if (o11 == null) {
            return null;
        }
        int[] iArr = (int[]) o11.f2553a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return Q.a(view, o11, iArr[0], iArr[1], this.f2484G.a(view, viewGroup), this.f2484G.b(view, viewGroup), translationX, translationY, f2476H, this);
    }

    @Override // D2.e0
    public final ObjectAnimator R(ViewGroup viewGroup, View view, O o10) {
        if (o10 == null) {
            return null;
        }
        int[] iArr = (int[]) o10.f2553a.get("android:slide:screenPosition");
        return Q.a(view, o10, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f2484G.a(view, viewGroup), this.f2484G.b(view, viewGroup), f2477I, this);
    }

    @Override // D2.e0, D2.F
    public final void g(O o10) {
        e0.O(o10);
        int[] iArr = new int[2];
        o10.f2554b.getLocationOnScreen(iArr);
        o10.f2553a.put("android:slide:screenPosition", iArr);
    }

    @Override // D2.F
    public final void j(O o10) {
        e0.O(o10);
        int[] iArr = new int[2];
        o10.f2554b.getLocationOnScreen(iArr);
        o10.f2553a.put("android:slide:screenPosition", iArr);
    }
}
