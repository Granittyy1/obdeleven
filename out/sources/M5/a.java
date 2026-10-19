package M5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import androidx.activity.C0845b;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: MaterialBackAnimationHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f4566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f4567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0845b f4571f;

    public a(V v10) {
        this.f4567b = v10;
        Context context = v10.getContext();
        this.f4566a = l.d(context, R.attr.motionEasingStandardDecelerateInterpolator, C0.a.b(0.0f, 0.0f, 0.0f, 1.0f));
        this.f4568c = l.c(context, R.attr.motionDurationMedium2, CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS);
        this.f4569d = l.c(context, R.attr.motionDurationShort3, 150);
        this.f4570e = l.c(context, R.attr.motionDurationShort2, 100);
    }
}
