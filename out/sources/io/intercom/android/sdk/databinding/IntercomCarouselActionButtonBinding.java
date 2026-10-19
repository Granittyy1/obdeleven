package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCarouselActionButtonBinding {
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(TextView textView) {
        this.rootView = textView;
    }

    public static IntercomCarouselActionButtonBinding bind(View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomCarouselActionButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_carousel_action_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
