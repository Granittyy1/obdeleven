package M5;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: MaterialBottomContainerBackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends a<View> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4581h;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4580g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f4581h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        V v10 = this.f4567b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v10, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new X0.b());
        return animatorSet;
    }

    public final void b(float f10) {
        float interpolation = this.f4566a.getInterpolation(f10);
        V v10 = this.f4567b;
        float width = v10.getWidth();
        float height = v10.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f4580g / width;
        float f12 = this.f4581h / height;
        float fA = 1.0f - p216r5.a.a(0.0f, f11, interpolation);
        float fA2 = 1.0f - p216r5.a.a(0.0f, f12, interpolation);
        v10.setScaleX(fA);
        v10.setPivotY(height);
        v10.setScaleY(fA2);
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != 0.0f ? fA / fA2 : 1.0f);
            }
        }
    }
}
