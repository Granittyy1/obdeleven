package W8;

import O.e;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ViewExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final void a(View view, SubscriptionType subscriptionType) {
        PorterDuffColorFilter porterDuffColorFilter;
        i.e(view, "<this>");
        i.e(subscriptionType, "subscriptionType");
        int iOrdinal = subscriptionType.ordinal();
        if (iOrdinal != 0) {
            porterDuffColorFilter = iOrdinal != 3 ? new PorterDuffColorFilter(view.getResources().getColor(R.color.pro_badge), PorterDuff.Mode.SRC_IN) : new PorterDuffColorFilter(view.getResources().getColor(R.color.ultimate_badge), PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(view.getResources().getColor(R.color.basic_badge), PorterDuff.Mode.SRC_IN);
        }
        view.getBackground().mutate().setColorFilter(porterDuffColorFilter);
    }

    public static void b(View view) {
        Float fValueOf = Float.valueOf(0.0f);
        i.e(view, "<this>");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            float fFloatValue = fValueOf.floatValue();
            i.e(view, "<this>");
            Context context = view.getContext();
            i.d(context, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, fFloatValue, context.getResources().getDisplayMetrics());
        }
    }

    public static final void c(final ImageView imageView, int i10) {
        i.e(imageView, "<this>");
        if (i10 == 0) {
            return;
        }
        e.j("ViewExtensions", "Setting color: " + i10);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(822083583, i10);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: W8.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ImageView this_setAnimatedColorFilter = imageView;
                i.e(this_setAnimatedColorFilter, "$this_setAnimatedColorFilter");
                i.e(valueAnimator2, "valueAnimator");
                Object animatedValue = valueAnimator2.getAnimatedValue();
                i.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this_setAnimatedColorFilter.setColorFilter(((Integer) animatedValue).intValue(), PorterDuff.Mode.SRC_IN);
            }
        });
        valueAnimator.setDuration(1000L);
        valueAnimator.start();
    }

    public static final void d(TextView textView, String str) {
        i.e(textView, "<this>");
        textView.setText(Html.fromHtml(str, 0));
    }

    public static final void e(View view, boolean z10) {
        i.e(view, "<this>");
        view.setEnabled(z10);
    }

    public static final void f(View view, boolean z10) {
        i.e(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }
}
