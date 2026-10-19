package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityPostBinding {
    public final LinearLayout appBarLayout;
    public final FrameLayout conversationCoordinator;
    public final IntercomToolbar intercomToolbar;
    public final FrameLayout postContainer;
    public final View postTouchTarget;
    public final ContentAwareScrollView postView;
    public final ReactionInputView reactionInputView;
    private final RelativeLayout rootView;

    private IntercomActivityPostBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, IntercomToolbar intercomToolbar, FrameLayout frameLayout2, View view, ContentAwareScrollView contentAwareScrollView, ReactionInputView reactionInputView) {
        this.rootView = relativeLayout;
        this.appBarLayout = linearLayout;
        this.conversationCoordinator = frameLayout;
        this.intercomToolbar = intercomToolbar;
        this.postContainer = frameLayout2;
        this.postTouchTarget = view;
        this.postView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    public static IntercomActivityPostBinding bind(View view) {
        View viewD;
        int i10 = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
        if (linearLayout != null) {
            i10 = R.id.conversation_coordinator;
            FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
            if (frameLayout != null) {
                i10 = R.id.intercom_toolbar;
                IntercomToolbar intercomToolbar = (IntercomToolbar) h.d(i10, view);
                if (intercomToolbar != null) {
                    i10 = R.id.post_container;
                    FrameLayout frameLayout2 = (FrameLayout) h.d(i10, view);
                    if (frameLayout2 != null && (viewD = h.d((i10 = R.id.post_touch_target), view)) != null) {
                        i10 = R.id.post_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) h.d(i10, view);
                        if (contentAwareScrollView != null) {
                            i10 = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) h.d(i10, view);
                            if (reactionInputView != null) {
                                return new IntercomActivityPostBinding((RelativeLayout) view, linearLayout, frameLayout, intercomToolbar, frameLayout2, viewD, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivityPostBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityPostBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_post, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
