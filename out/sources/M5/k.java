package M5;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0845b;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: MaterialSideContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4587i;

    public k(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4585g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f4586h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f4587i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        C0845b c0845b = this.f4571f;
        this.f4571f = null;
        if (c0845b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        V v10 = this.f4567b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4570e);
        animatorSet.start();
    }

    public final void b(C0845b c0845b, int i10, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11;
        boolean z10 = c0845b.f8202d == 0;
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        V v10 = this.f4567b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, v10.getLayoutDirection()) & 3) == 3;
        float scaleX = v10.getScaleX() * v10.getWidth();
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        float f10 = scaleX + i11;
        Property property = View.TRANSLATION_X;
        if (z11) {
            f10 = -f10;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, f10);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new X0.b());
        objectAnimatorOfFloat.setDuration(p216r5.a.c(c0845b.f8201c, this.f4568c, this.f4569d));
        objectAnimatorOfFloat.addListener(new j(this, z10, i10));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void c(float f10, int i10, boolean z10) {
        float interpolation = this.f4566a.getInterpolation(f10);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        V v10 = this.f4567b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, v10.getLayoutDirection()) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = v10.getWidth();
        int height = v10.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f4585g / f11;
            float f14 = this.f4586h / f11;
            float f15 = this.f4587i / f12;
            if (z11) {
                f11 = 0.0f;
            }
            v10.setPivotX(f11);
            if (!z12) {
                f14 = -f13;
            }
            float fA = p216r5.a.a(0.0f, f14, interpolation);
            float f16 = fA + 1.0f;
            v10.setScaleX(f16);
            float fA2 = 1.0f - p216r5.a.a(0.0f, f15, interpolation);
            v10.setScaleY(fA2);
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z12 ? 1.0f - fA : 1.0f;
                    float f18 = fA2 != 0.0f ? (f16 / fA2) * f17 : 1.0f;
                    childAt.setScaleX(f17);
                    childAt.setScaleY(f18);
                }
            }
        }
    }
}
