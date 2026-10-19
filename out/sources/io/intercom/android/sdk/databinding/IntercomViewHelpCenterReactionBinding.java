package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.views.GrayscaleImageView;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomViewHelpCenterReactionBinding {
    public final GrayscaleImageView intercomReactionHappy;
    public final GrayscaleImageView intercomReactionNeutral;
    public final GrayscaleImageView intercomReactionSad;
    public final TextView intercomReactionTitle;
    public final MotionLayout motionLayout;
    private final MotionLayout rootView;

    private IntercomViewHelpCenterReactionBinding(MotionLayout motionLayout, GrayscaleImageView grayscaleImageView, GrayscaleImageView grayscaleImageView2, GrayscaleImageView grayscaleImageView3, TextView textView, MotionLayout motionLayout2) {
        this.rootView = motionLayout;
        this.intercomReactionHappy = grayscaleImageView;
        this.intercomReactionNeutral = grayscaleImageView2;
        this.intercomReactionSad = grayscaleImageView3;
        this.intercomReactionTitle = textView;
        this.motionLayout = motionLayout2;
    }

    public static IntercomViewHelpCenterReactionBinding bind(View view) {
        int i10 = R.id.intercom_reaction_happy;
        GrayscaleImageView grayscaleImageView = (GrayscaleImageView) h.d(i10, view);
        if (grayscaleImageView != null) {
            i10 = R.id.intercom_reaction_neutral;
            GrayscaleImageView grayscaleImageView2 = (GrayscaleImageView) h.d(i10, view);
            if (grayscaleImageView2 != null) {
                i10 = R.id.intercom_reaction_sad;
                GrayscaleImageView grayscaleImageView3 = (GrayscaleImageView) h.d(i10, view);
                if (grayscaleImageView3 != null) {
                    i10 = R.id.intercom_reaction_title;
                    TextView textView = (TextView) h.d(i10, view);
                    if (textView != null) {
                        MotionLayout motionLayout = (MotionLayout) view;
                        return new IntercomViewHelpCenterReactionBinding(motionLayout, grayscaleImageView, grayscaleImageView2, grayscaleImageView3, textView, motionLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomViewHelpCenterReactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomViewHelpCenterReactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_view_help_center_reaction, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public MotionLayout getRoot() {
        return this.rootView;
    }
}
