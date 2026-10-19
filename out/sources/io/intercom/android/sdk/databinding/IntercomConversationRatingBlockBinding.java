package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomConversationRatingBlockBinding {
    public final LinearLayout intercomRatingOptionsLayout;
    public final IntercomPrimaryButton intercomRatingTellUsMoreButton;
    public final ImageView intercomYouRatedImageView;
    public final LinearLayout intercomYouRatedLayout;
    public final TextView rateYourConversationTextView;
    private final LinearLayout rootView;

    private IntercomConversationRatingBlockBinding(LinearLayout linearLayout, LinearLayout linearLayout2, IntercomPrimaryButton intercomPrimaryButton, ImageView imageView, LinearLayout linearLayout3, TextView textView) {
        this.rootView = linearLayout;
        this.intercomRatingOptionsLayout = linearLayout2;
        this.intercomRatingTellUsMoreButton = intercomPrimaryButton;
        this.intercomYouRatedImageView = imageView;
        this.intercomYouRatedLayout = linearLayout3;
        this.rateYourConversationTextView = textView;
    }

    public static IntercomConversationRatingBlockBinding bind(View view) {
        int i10 = R.id.intercom_rating_options_layout;
        LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
        if (linearLayout != null) {
            i10 = R.id.intercom_rating_tell_us_more_button;
            IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) h.d(i10, view);
            if (intercomPrimaryButton != null) {
                i10 = R.id.intercom_you_rated_image_view;
                ImageView imageView = (ImageView) h.d(i10, view);
                if (imageView != null) {
                    i10 = R.id.intercom_you_rated_layout;
                    LinearLayout linearLayout2 = (LinearLayout) h.d(i10, view);
                    if (linearLayout2 != null) {
                        i10 = R.id.rate_your_conversation_text_view;
                        TextView textView = (TextView) h.d(i10, view);
                        if (textView != null) {
                            return new IntercomConversationRatingBlockBinding((LinearLayout) view, linearLayout, intercomPrimaryButton, imageView, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomConversationRatingBlockBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomConversationRatingBlockBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
