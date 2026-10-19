package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;
import kotlin.jvm.internal.h;

/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityNoteBinding {
    public final LinearLayout appBarLayout;
    public final IntercomToolbar intercomToolbar;
    public final FrameLayout noteComposerContainer;
    public final LinearLayout noteLayout;
    public final View noteTouchTarget;
    public final ContentAwareScrollView noteView;
    public final ReactionInputView reactionInputView;
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(FrameLayout frameLayout, LinearLayout linearLayout, IntercomToolbar intercomToolbar, FrameLayout frameLayout2, LinearLayout linearLayout2, View view, ContentAwareScrollView contentAwareScrollView, ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout2;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    public static IntercomActivityNoteBinding bind(View view) {
        View viewD;
        int i10 = R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) h.d(i10, view);
        if (linearLayout != null) {
            i10 = R.id.intercom_toolbar;
            IntercomToolbar intercomToolbar = (IntercomToolbar) h.d(i10, view);
            if (intercomToolbar != null) {
                i10 = R.id.note_composer_container;
                FrameLayout frameLayout = (FrameLayout) h.d(i10, view);
                if (frameLayout != null) {
                    i10 = R.id.note_layout;
                    LinearLayout linearLayout2 = (LinearLayout) h.d(i10, view);
                    if (linearLayout2 != null && (viewD = h.d((i10 = R.id.note_touch_target), view)) != null) {
                        i10 = R.id.note_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) h.d(i10, view);
                        if (contentAwareScrollView != null) {
                            i10 = R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) h.d(i10, view);
                            if (reactionInputView != null) {
                                return new IntercomActivityNoteBinding((FrameLayout) view, linearLayout, intercomToolbar, frameLayout, linearLayout2, viewD, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityNoteBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.intercom_activity_note, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
