package D2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: D2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeScroll.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0680g extends F {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f2640E = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void O(O o10) {
        HashMap map = o10.f2553a;
        View view = o10.f2554b;
        map.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (o10 == null || o11 == null) {
            return null;
        }
        HashMap map = o10.f2553a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = o11.f2553a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        View view = o11.f2554b;
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        boolean z10 = N.f2547a;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // D2.F
    public final String[] w() {
        return f2640E;
    }
}
