package p216r5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.collection.X;
import java.util.ArrayList;

/* JADX INFO: compiled from: MotionSpec.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X<String, h> f46353a = new X<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X<String, PropertyValuesHolder[]> f46354b = new X<>();

    public static g a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i10) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i10);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gVar.f46354b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f46342b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f46343c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f46344d;
            }
            h hVar = new h();
            hVar.f46358d = 0;
            hVar.f46359e = 1;
            hVar.f46355a = startDelay;
            hVar.f46356b = duration;
            hVar.f46357c = interpolator;
            hVar.f46358d = objectAnimator.getRepeatCount();
            hVar.f46359e = objectAnimator.getRepeatMode();
            gVar.f46353a.put(propertyName, hVar);
        }
        return gVar;
    }

    public final h d(String str) {
        X<String, h> x10 = this.f46353a;
        if (x10.get(str) != null) {
            return x10.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f46353a.equals(((g) obj).f46353a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46353a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f46353a + "}\n";
    }
}
