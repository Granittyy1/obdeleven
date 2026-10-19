package D2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeClipBounds.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0678e extends F {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f2619E = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: D2.e$a */
    /* JADX INFO: compiled from: ChangeClipBounds.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2620b;

        public a(View view) {
            this.f2620b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            this.f2620b.setClipBounds(null);
        }
    }

    public static void O(O o10) {
        View view = o10.f2554b;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        Rect clipBounds = view.getClipBounds();
        HashMap map = o10.f2553a;
        map.put("android:clipBounds:clip", clipBounds);
        if (clipBounds == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
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

    @Override // D2.F
    public final Animator o(ViewGroup viewGroup, O o10, O o11) {
        if (o10 != null && o11 != null) {
            HashMap map = o10.f2553a;
            if (map.containsKey("android:clipBounds:clip")) {
                HashMap map2 = o11.f2553a;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
                    boolean z10 = rect2 == null;
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    if (rect == null) {
                        rect = (Rect) map.get("android:clipBounds:bounds");
                    } else if (rect2 == null) {
                        rect2 = (Rect) map2.get("android:clipBounds:bounds");
                    }
                    if (rect.equals(rect2)) {
                        return null;
                    }
                    WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                    View view = o11.f2554b;
                    view.setClipBounds(rect);
                    Rect rect3 = new Rect();
                    A a10 = new A();
                    a10.f2474a = rect3;
                    ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, T.f2573c, a10, rect, rect2);
                    if (z10) {
                        objectAnimatorOfObject.addListener(new a(view));
                    }
                    return objectAnimatorOfObject;
                }
            }
        }
        return null;
    }

    @Override // D2.F
    public final String[] w() {
        return f2619E;
    }
}
